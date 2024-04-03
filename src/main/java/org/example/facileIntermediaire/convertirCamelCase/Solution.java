package org.example.facileIntermediaire.convertirCamelCase;

public class Solution {

    public static String toCamelCase(String input) {
        // Séparation des mots par l'espace
        String[] words = input.split(" ");

        StringBuilder camelCaseString = new StringBuilder(words[0].toLowerCase());

        // Convertir la première lettre de chaque mot (sauf le premier) en majuscule
        for (int i = 1; i < words.length; i++) {
            // Rendre la première lettre majuscule et le reste en minuscules
            String firstLetterCapitalized = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
            camelCaseString.append(firstLetterCapitalized);
        }

        return camelCaseString.toString();
    }

    public static void main(String[] args) {
        String input = "convertir une chaîne de caractères en camelCase";
        String camelCaseString = toCamelCase(input);
        System.out.println("Chaîne en camelCase : " + camelCaseString);
    }
}
