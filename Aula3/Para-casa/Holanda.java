import java.util.Scanner;

public class Holanda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, proposta, melhor = 0; 
		int interesse, index = 0;
		
		for (int i=1; i<=4; i++) {
			System.out.println("\nProposta nº"+i);
			System.out.print("Nível de interesse no personagem: ");
			interesse = sc.nextInt();
			System.out.print("Salário da proposta: R$");
			salario = sc.nextInt();
			proposta = salario*interesse;
			if (proposta > melhor) {
				melhor = proposta;
				index = i;
			}
		}
		sc.close();
		System.out.println("\nMelhor proposta: "+index);
	}

}
