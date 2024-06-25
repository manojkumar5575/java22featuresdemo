package com.cloudicia.java22;

public class UnnamedVariablesDemo {
    public static void main(String[] args) {
        unnamedExample();
    }

    private static void unnamedExample() {
        System.out.println("Java 22 Unnamed Variables Feature Demo");
        String str = "demoString";
        try {
            int number = Integer.parseInt(str);
        } catch (NumberFormatException _) {
            System.err.println(String.format("%s is not a number", str));
        }
    }
}
