package org.example;

import java.util.Stack;

public class CustomStringBuilder {
    private final StringBuilder builder;
    private final Stack<String> snapshots;

    public CustomStringBuilder() {
        this.builder = new StringBuilder();
        this.snapshots = new Stack<>();
    }

    public void append(String value) {
        saveSnapshot();
        builder.append(value);
    }

    public void delete(int start, int end) {
        saveSnapshot();
        builder.delete(start, end);

    }

    public void replace(int start, int end, String value) {
        saveSnapshot();
        builder.replace(start, end, value);

    }

    public void undo() {
        if (!snapshots.empty()) {
            String previousState = snapshots.pop();
            builder.setLength(0);
            builder.append(previousState);
        }
    }

    private void saveSnapshot() {
        snapshots.push(builder.toString());
    }

    @Override
    public String toString() {
        return builder.toString();
    }

}
