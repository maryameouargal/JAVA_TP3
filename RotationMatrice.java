
// Exercice 5 : Rotation en place d’une matrice N×N

import java.util.Scanner;

public class RotationMatrice {

    //  afficher la matrice
    public static void afficher(int[][] A) {
        int i = 0;
        while (i < A.length) {
            int j = 0;
            while (j < A[i].length) {
                System.out.print(A[i][j]);
                if (j < A[i].length - 1) {
                    System.out.print(" ");
                }
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }

    // rotation 90 degres sens horaire
    public static void rotate90ClockwiseInPlace(int[][] A) {
        int n = A.length;

        // etape 1 : transposition
        int i = 0;
        while (i < n) {
            int j = i + 1;
            while (j < n) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
                j = j + 1;
            }
            i = i + 1;
        }

        // etape 2 : renverser chaque ligne
        i = 0;
        while (i < n) {
            int j = 0;
            while (j < n / 2) {
                int temp = A[i][j];
                A[i][j] = A[i][n - 1 - j];
                A[i][n - 1 - j] = temp;
                j = j + 1;
            }
            i = i + 1;
        }
    }

    // rotation 180 degres
    public static void rotate180InPlace(int[][] A) {
        int n = A.length;
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n / 2) {
                int temp = A[i][j];
                A[i][j] = A[n - 1 - i][n - 1 - j];
                A[n - 1 - i][n - 1 - j] = temp;
                j = j + 1;
            }
            i = i + 1;
        }
    }

    // programme principal 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Donnez N : ");
        int n = sc.nextInt();

        int[][] A = new int[n][n];

        System.out.println("Entrez les " + n + " lignes de la matrice :");
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                A[i][j] = sc.nextInt();
                j = j + 1;
            }
            i = i + 1;
        }

        System.out.println("Matrice originale :");
        afficher(A);

        // menu  pour choisir la rotation
        System.out.println("Quelle rotation voulez-vous ?");
        System.out.println("1 = 90 degres horaire");
        System.out.println("2 = 180 degres");
        System.out.print("Votre choix : ");
        int choix = sc.nextInt();

        if (choix == 1) {
            rotate90ClockwiseInPlace(A);
            System.out.println("Apres rotation 90 degres (horaire) :");
        } else if (choix == 2) {
            rotate180InPlace(A);
            System.out.println("Apres rotation 180 degres :");
        } else {
            System.out.println("Choix inconnu, aucune rotation appliquee.");
        }

        afficher(A);

        sc.close();
    }
}