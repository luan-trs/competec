import java.util.Scanner;

public class Extra_Estrelas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int linhas, caracteres; //Pergunta ao usuario a quantidade de linhas; limita a quantidade de caracteres por linha
		
		System.out.print("Número de linhas: ");
		linhas = sc.nextInt();
		
		while (linhas >= 0) {
			for (caracteres=linhas; caracteres!=0; caracteres--) {
				System.out.print("*");
			}
			System.out.println(); //Quanto uma linha de "*" é escrita, pula para a próxima linha
			linhas--;
		}
		sc.close();
	}

}
