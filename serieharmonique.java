
import java.util.Scanner;

// Exercice 1
public class serieharmonique {
   public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez le nombre de termes n : ");
        int n = clavier.nextInt();

        double somme = 0.0;
        double produit = 1.0;

        for (int i = 1; i <= n; i++) {
            double terme = 1.0 / i;
            somme += terme;
            produit *= terme;
        }

        double moyenne = (n > 0) ? somme / n : 0.0;

        System.out.println(" Resultats");
        System.out.println("Nombre de termes : " + n);
        System.out.println("Somme            : " + somme);
        System.out.println("Moyenne          : " + moyenne);
        System.out.println("Produit          : " + produit);

        clavier.close();
    }
}
    
