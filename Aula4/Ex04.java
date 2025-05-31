import java.util.Scanner;

public class Ex04 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qual o tamanho do array? ");
        int tamanho = sc.nextInt();
        int array[] = new int[tamanho];
        
        for (int i=0; i<tamanho; i++) {
            System.out.print("Posição nº"+i+": ");
            int adicionar = sc.nextInt();
            array[i] = adicionar;    
        }
        
        System.out.print("\nValores: ");
        for (int nums : array) {
            System.out.print(nums + " ");
        }
    }
}