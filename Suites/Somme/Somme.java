import java.util.Scanner;

public class Somme {

    private static int n;
    private static float w;

    public static main void(String args[]){
        w = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("Veuillez saisir le premier terme");
        for(int i; i < n+1; i++) {
            w = w + (1/i);
        }
        System.out.println(w);
    }

}