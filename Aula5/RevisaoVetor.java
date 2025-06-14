import java.util.Scanner;

public class RevisaoVetor {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int menor = 9999;
        int maior = 0;
        int[] vetor = new int[10];
        
        for (int i=0; i<vetor.length; i++) {
            int num = sc.nextInt();
            vetor[i] = num;
            
            if (num > maior) maior = num;
            else if (num < menor) menor = num;
        }
        
        System.out.printf("Maior valor: %d%nMenor valor: %d", maior, menor);
    }
}