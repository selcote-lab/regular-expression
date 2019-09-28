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
    }
}
