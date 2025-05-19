import java.util.Scanner;

public class Contas
{
	public static void main(String[] args) {
        double n1, n2, result;
        int operacao;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o primeiro número:");
        n1 = sc.nextDouble();
        System.out.println("Insira o segundo número:");
        n2 = sc.nextDouble();
        
        System.out.println("\033[32m[1] Adição\n[2] Subtração\n[3] Multiplicação\n[4] Divisão");
        System.out.println("\033[0mQual operação deseja realizar?");
        operacao = sc.nextInt();
        
        switch (operacao) {
            case 1:
                result = n1+n2;
                System.out.println("A soma dos números foi: " + result);
                break;
            case 2:
                result = n1-n2;
                System.out.println("A diferença dos números é: " + result);
                break;
            case 3:
                result = n1*n2;
                System.out.println("O produto dos números é: " + result);
                break;
            case 4:
                result = n1/n2;
                System.out.println("A divisão dos números foi: " + result);
                break;
            default:
                System.out.println("INVÁLIDO");
        }
	}	    
}