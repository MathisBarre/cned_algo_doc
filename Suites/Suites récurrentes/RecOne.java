import java.util.Scanner;

public class RecOne {


    /*
    Programme consistant à calculer tous les termes d'une suite
     définie par récurrence jusqu'à un rang n donné par l'utilisateur.
     Il n'est pas possible de modifer l'expression de U(n+1) durant l'execution du
     programme. L'utilisateur peut cependant entrer
     la valeur qu'il souhaite pour le premier terme.
     */

    // On déclare deux variables en private.
    // La première de type int (entier n). La deuxième de type float (Premier terme U)
    // La troisième contiendera la réponse de l'utilisateur quant à l'affichage des termes
    // La quatrième est facultative
    private static int n;
    private static float U;
    private static char response;
    private static int nn;

    //Le programme s'execute ici
    public static void main(String[] args) {
        //On demande à l'utilisateur de saisir U et n
        Scanner sc1 = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le dernier rang n");
        n = sc.nextInt();
        System.out.println("Veuillez saisir le premier terme");
        U = sc.nextInt();
        //On demande à l'utilisateur s'il veut afficher tous les termes à l'aide d'une boucle while (Tant que)
        while(!(response == 'O' || response == 'N')){
            System.out.println("Voulez-vous afficher tous les termes (O/N) ?");
            response = sc1.nextLine().charAt(0);
        }
        // On appelle la méthode calculTerms
        calculTerms(n,U);
        System.out.println("Fin Programme");
    }

    /*
    / On définit une méthode qui renvoie à l'aide d'une boucle for (Pour)
    tous les termes de la suite jusqu'au rang n donné par l'utilisateur et qui prend comme paramètres
    deux variables.
     */
    private static void calculTerms(int n, float u) {
        /*
        /Structure switch case propre au langage java, elle sert à éviter la répétition
         abusive de la structure if elseif (Si, sinon si) et donc à l'optimisation du programme
         Si la réponse est O, le programme executera le premier code
         Sinon il executera le deuxième
         */
        switch(response){
            case 'O': for (int i = 1; i <= n; i++){
                u = 2*u+3;
                System.out.println("U = " + u + " quand n = " + i);
            }
            case 'N': for (int i = 1; i <= n; i++){
                u = 2*u+3;
                nn = i;

            } System.out.println("U = " + u + " quand n = " + nn);

        }

    }

}