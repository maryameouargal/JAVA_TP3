
// Exercice 4 

public class UtilitairesTableaux {

    //  1) Afficher un tableau 2D 
    public static void affiche(double[][] t) {
        int i = 0;
        while (i < t.length) {
            int j = 0;
            while (j < t[i].length) {
                System.out.print(t[i][j] + "  ");
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }

    //  2) Tester si le tableau est regulier 
    public static boolean regulier(double[][] t) {
        // un tableau vide est regulier
        if (t.length == 0) {
            return true; 
        }
        int taille = t[0].length;
        int i = 1;
        while (i < t.length) {
            if (t[i].length != taille) {
                return false;
            }
            i = i + 1;
        }
        return true;
    }

    // 3) Somme de chaque ligne 
    public static double[] sommeLignes(double[][] t) {
        double[] resultat = new double[t.length];
        int i = 0;
        while (i < t.length) {
            double s = 0;
            int j = 0;
            while (j < t[i].length) {
                s = s + t[i][j];
                j = j + 1;
            }
            resultat[i] = s;
            i = i + 1;
        }
        return resultat;
    }

    //  4) Somme de deux tableaux 2D
    public static double[][] somme(double[][] t1, double[][] t2) {
        if (!regulier(t1) || !regulier(t2)) {
            return null;
        }
        if (t1.length != t2.length) {
            return null;
        }
        if (t1.length > 0 && t1[0].length != t2[0].length) {
            return null;
        }

        double[][] res = new double[t1.length][];
        int i = 0;
        while (i < t1.length) {
            res[i] = new double[t1[i].length];
            int j = 0;
            while (j < t1[i].length) {
                res[i][j] = t1[i][j] + t2[i][j];
                j = j + 1;
            }
            i = i + 1;
        }
        return res;
    }

    //  Programme de test
    public static void main(String[] args) {

        double[][] a = { {1, 2, 3}, {4, 5, 6} };
        double[][] b = { {10, 20, 30}, {40, 50, 60} };

        System.out.println("Tableau a :");
        affiche(a);

        System.out.println("Tableau b :");
        affiche(b);

        System.out.println("a est regulier ? " + regulier(a));

        double[] sl = sommeLignes(a);
        System.out.println("Somme des lignes de a :");
        int k = 0;
        while (k < sl.length) {
            System.out.println("Ligne " + k + " -> " + sl[k]);
            k = k + 1;
        }

        double[][] c = somme(a, b);
        if (c == null) {
            System.out.println("Impossible d'additionner a et b.");
        } else {
            System.out.println("a + b :");
            affiche(c);
        }

        //  un tableau irregulier 
        double[][] d = { {1, 2}, {3, 4, 5} };
        System.out.println("Tableau d (irregulier) :");
        affiche(d);
        System.out.println("d est regulier ? " + regulier(d));
        System.out.println("Somme de a et d : " + somme(a, d));
    }
}