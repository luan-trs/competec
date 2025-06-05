import java.util.Scanner;

public class Liga {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String vencedor; //Será usada no array
		
		System.out.print("Quantas partidas foram disputadas? ");
		int quantPartidas = sc.nextInt();
		String partidas[] = new String[quantPartidas];
		
		for (int i = 1; i<=quantPartidas; i++) {
			System.out.println("\nPARTIDA Nº"+i);
			System.out.print("Pontuação de Alan: ");
			int pontAlan = sc.nextInt();
			System.out.print("Pontuação de Beraldo: ");
			int pontBeraldo = sc.nextInt();
			
			if (pontAlan > pontBeraldo) {
				vencedor = "Alan";
			} else if (pontBeraldo > pontAlan) {
				vencedor = "Beraldo";
			} else {
				vencedor = "Empate";
			}
			partidas[i-1] = vencedor;
		}
		
		System.out.println("-=-=-=-=-=-=-=-=-");
		System.out.print("Em qual partida vó Nena passou? ");
		int nena = sc.nextInt();
		sc.close();
		
		if (partidas[nena-1] != "Empate") {
			System.out.println(partidas[nena-1]+" ganhou essa partida!");
		} else {
			System.out.println("Essa partida foi um empate.");
		}
		
	}
}
