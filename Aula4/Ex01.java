import java.util.Scanner;

public class Ex01 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 1;
        
        System.out.println("Escreva algo:");
        String palavra = sc.nextLine();
        while (cont <=5) {
            System.out.println(cont + " - " + palavra);
            cont++;
        }
    }
}