
 //Exercice 6 : Fenêtre glissante : nombre de valeurs distinctes par fenêtre

import java.util.Scanner;

public class FenetreGlissante {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Donnez n : ");
        int n = sc.nextInt();

        System.out.print("Donnez k : ");
        int k = sc.nextInt();

        //  k ne doit pas depasser n ( il est juste ajouter pour securité )
        if (k > n) {
            System.out.println("Erreur : k ne peut pas depasser n.");
            sc.close();
            return;
        }

        int[] T = new int[n];
        System.out.println("Entrez les " + n + " entiers :");
        int i = 0;
        while (i < n) {
            T[i] = sc.nextInt();
            i = i + 1;
        }

        // tableau de frequences 
        int[] freq = new int[100001];

        int distinct = 0;

        //1) initialiser la premiere fenetre [0..k-1] 
        i = 0;
        while (i < k) {
            int x = T[i];
            if (freq[x] == 0) {
                distinct = distinct + 1;
            }
            freq[x] = freq[x] + 1;
            i = i + 1;
        }

        System.out.print("Resultats : " + distinct);

        // 2) faire glisser la fenetre
        i = k;
        while (i < n) {

            // element qui sort de la fenetre
            int sortant = T[i - k];
            freq[sortant] = freq[sortant] - 1;
            if (freq[sortant] == 0) {
                distinct = distinct - 1;
            }

            // element qui entre dans la fenetre
            int entrant = T[i];
            if (freq[entrant] == 0) {
                distinct = distinct + 1;
            }
            freq[entrant] = freq[entrant] + 1;

            System.out.print(" " + distinct);

            i = i + 1;
        }

        System.out.println();
        System.out.println("Nombre de fenetres analysees : " + (n - k + 1));
        System.out.println("Termine !");

        sc.close();
    }
}