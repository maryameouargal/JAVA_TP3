
// Exercice 2 

import java.util.Scanner;

public class TriangleEtoiles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Donnez la hauteur du triangle : ");
        int n = sc.nextInt();

        int i = 1;
        int totalEtoiles = 0;
        int totalLignes = 0;

        while (i <= n) {

            int j = 1;
            int etoilesLigne = 0;

            System.out.print("Ligne " + i + " : ");

            while (j <= 2 * i - 1) {
                System.out.print("*");
                etoilesLigne = etoilesLigne + 1;
                j = j + 1;
            }

            System.out.println();

            totalEtoiles = totalEtoiles + etoilesLigne;
            totalLignes = totalLignes + 1;

            i = i + 1;
        }

        System.out.println(" Resultats :");
        System.out.println("Nombre de lignes  : " + totalLignes);
        System.out.println("Nombre d'etoiles  : " + totalEtoiles);
        System.out.println("Merci d'avoir utilise mon programme !");

        sc.close();
    }
}