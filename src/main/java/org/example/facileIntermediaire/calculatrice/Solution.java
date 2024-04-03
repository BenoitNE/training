package org.example.facileIntermediaire.calculatrice;

public class Solution {

    public double addition(double a, double b) {
        return a + b;
    }

    public double soustraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro !");
        }
        return a / b;
    }

    public double calculer(double a, double b, String operation) {
        double resultat = 0;
        try {
            switch (operation) {
                case "+":
                    resultat = addition(a, b);
                    break;
                case "-":
                    resultat = soustraction(a, b);
                    break;
                case "*":
                    resultat = multiplication(a, b);
                    break;
                case "/":
                    resultat = division(a, b);
                    break;
                default:
                    throw new IllegalArgumentException("Opération non valide !");
            }
        } catch (ArithmeticException e) {
            System.out.println("Erreur : " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        } finally {
            System.out.println("Opération terminée.");
        }
        return resultat;
    }

    public static void main(String[] args) {
        Solution calc = new Solution();

        // Exemples d'utilisation
        double a = 10;
        double b = 0;
        String operation = "/";
        System.out.println("Résultat : " + calc.calculer(a, b, operation));
    }
}
