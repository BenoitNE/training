package org.example.facileIntermediaire.remplaceEspace;

public class Solution {

    public static String replaceSpaces(String input, char replacementChar) {
        // Utilisation de la méthode replaceAll pour remplacer tous les espaces par le caractère spécifié
        return input.replaceAll(" ", String.valueOf(replacementChar));
    }

    public static void main(String[] args) {
        String input = "Hello World!";
        char replacementChar = '-';
        String replacedString = replaceSpaces(input, replacementChar);
        System.out.println("Chaîne avec les espaces remplacés : " + replacedString);
    }
}

