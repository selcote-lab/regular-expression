package com.tonasolution;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        String thirdAlphanumericsString = "abcDeF12Ghhiiiijk199";
        System.out.println(thirdAlphanumericsString.replaceAll("^abcDe{2}", "YYY"));
        System.out.println(thirdAlphanumericsString.replaceAll("^abcDe+", "YYY"));
        System.out.println(thirdAlphanumericsString.replaceAll("^abcDe*", "YYY"));
        System.out.println(thirdAlphanumericsString.replaceAll("^abcDe{2,3}", "yyy"));
        System.out.println(thirdAlphanumericsString.replaceAll("a+b*c", "yyy"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something </p>");
        htmlText.append("<p>This is a another paragraph about something else </p>");

        String h2Pattern = ".*<h2>.*";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());
    }
}
