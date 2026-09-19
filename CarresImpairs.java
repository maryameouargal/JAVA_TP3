// Exercice 3 

import java.util.Scanner;

public class CarresImpairs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Combien de valeurs : ");
        int n = sc.nextInt();

        // on cree un tableau pour stocker les carres
        int[] carres = new int[n];

        int i = 0;
        int impair = 1;

        // on remplit le tableau : 
        while (i < n) {
            carres[i] = impair * impair;
            impair = impair + 2;
            i = i + 1;
        }

        // on affiche chaque impair avec son carre
        i = 0;
        impair = 1;
        while (i < n) {
            System.out.println(impair + " a pour carre " + carres[i]);
            impair = impair + 2;
            i = i + 1;
        }

        sc.close();
    }
}