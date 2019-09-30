package com.tonasolution;

public class Main {

    public static void main(String[] args) {
	    String string = "I am a string. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".", "Y"));

        System.out.println(alphanumeric.replaceAll("^abcD", "YYY"));

        String secondString = "abcDeeeF12GhSShiiiijkl99z";
        System.out.println(secondString.replaceAll("^abcDeee", "YYY"));
        System.out.println(secondString.replaceAll("^abcDeee", "YYY"));

        System.out.println(alphanumeric.replaceAll("[aeb]", "X"));
        System.out.println(alphanumeric.replaceAll("[abcD][ec]", "X"));

        System.out.println("Harry".replaceAll("[Hh]arry", "test"));

        String newAlphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(newAlphanumeric.replaceAll("[^ej]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[abcdef345678]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[a-fA-F3-9]", "X"));
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[0-9]", "X"));
        System.out.println(newAlphanumeric.replaceAll("\\d", "X"));
        System.out.println(newAlphanumeric.replaceAll("\\D", "X"));

        String hasWiteSpace = "I have blanks and \t a tab, and also a new line";
        System.out.println(hasWiteSpace);
        System.out.println(hasWiteSpace.replaceAll("\\s", ""));
        System.out.println(hasWiteSpace.replaceAll("\\t", "X"));
        System.out.println(hasWiteSpace.replaceAll("\\S", "X"));
        System.out.println(newAlphanumeric.replaceAll("\\w", "X"));
        System.out.println(newAlphanumeric.replaceAll("\\W", "X"));
        System.out.println(newAlphanumeric.replaceAll("\\b", "X"));
    }
}
