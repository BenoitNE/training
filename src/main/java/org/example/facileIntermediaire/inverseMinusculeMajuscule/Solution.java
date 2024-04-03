package org.example.facileIntermediaire.inverseMinusculeMajuscule;

public class Solution {

    public static String invertCase(String input) {
        char[] characters = input.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            char currentChar = characters[i];
            if (Character.isUpperCase(currentChar)) {
                characters[i] = Character.toLowerCase(currentChar);
            } else if (Character.isLowerCase(currentChar)) {
                characters[i] = Character.toUpperCase(currentChar);
            }
        }

        return new String(characters);
    }

    public static void main(String[] args) {
        String input = "Hello World!";
        String invertedCaseString = invertCase(input);
        System.out.println("Chaîne avec les majuscules et minuscules inversées : " + invertedCaseString);
    }
}

