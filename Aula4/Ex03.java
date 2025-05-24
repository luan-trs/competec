import java.util.Scanner;

public class Ex03 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int usuario = sc.nextInt();
        
        for (int i = 0; i<=10; i++) {
            int result = i*usuario; //resultado das multiplicações
            System.out.println(usuario + " x " + i + " = " + result);
        }
    }
}