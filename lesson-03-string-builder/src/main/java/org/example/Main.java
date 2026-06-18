package org.example;

public class Main {
    public static void main(String[] args) {
        CustomStringBuilder builder = new CustomStringBuilder();

        builder.append("Hello");
        builder.append(" World");
        builder.append(" Test");
        builder.append("");



        System.out.println("После append: " + builder);

        builder.undo();
        System.out.println("После undo: " + builder);

        builder.append(" Java");
        System.out.println("После append: " + builder);

        builder.replace(0, 5, "Hi");
        System.out.println("После replace: " + builder);

        builder.undo();
        System.out.println("После undo: " + builder);

        builder.delete(5, 10);
        System.out.println("После delete: " + builder);

        builder.undo();
        System.out.println("После undo: " + builder);

    }
}