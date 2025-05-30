import java.util.Scanner;

public class LawD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número par de linhas: ");
		int linhas = sc.nextInt();
		if (linhas % 2 > 0) {
			System.out.println("INSIRA UM NÚMERO PAR");
			System.exit(0);
		}
		sc.close();
		
		//TODO cada linha precisa ter o número da linha atual
		for (int i = 0; i<=linhas; i++) {
			System.out.print("*");
		    for (int caracteres = 0; caracteres<=i; caracteres++) {
		        System.out.print(" ");
		    }
		    System.out.println("*");
		}
		
		while (linhas>=0) {
			System.out.print("*");
		    for (int caracteres = linhas; caracteres>=0; caracteres--) {
		        System.out.print(" ");
		    }
		    System.out.println("*");
		    linhas--;
		}
	}
}
