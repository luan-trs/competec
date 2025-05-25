import java.util.Scanner;

//Imprimir todos os números ímpares até o scanner
public class Ex04 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número:");
        int num = sc.nextInt();
        sc.close();
        
        for (int i=0; i<=num; i++) {
            if (i%2 != 0) {
                System.out.println(i);
            }
        }
    }
}