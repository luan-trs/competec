import java.util.Scanner;

public class Rolou {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double total = 0, maior = -1, menor = 999999, media, mediana;
		
		System.out.print("Número de runs: ");
		int quantRuns = sc.nextInt();
		double runs[] = new double[quantRuns];
		
		double tempo;
		for (int r=1; r<=quantRuns; r++) {
			System.out.print("Tempo da run nº"+r+": ");
			tempo = sc.nextDouble();
			total += tempo;
			
			if (tempo > maior) {
				maior = tempo;
			} else if (tempo < menor) {
				menor = tempo;
			}
			
			runs[r-1] = tempo;
		}
		sc.close();
		media = (total-(maior+menor))/(quantRuns-2); //Elimina o maior e o maior valor
		
		if (runs.length%2 != 0) { //Caso seja ímpar, a mediana é o número no meio do array
			mediana = runs[runs.length/2]; // Ex. 11/2 é 5 e sobra 1, onde 1 seria o index 5 começando do 0
		} else { //Caso seja par, a mediana é a média dos 2 números do meio do array
			mediana = (runs[runs.length/2-1] + runs[runs.length/2]) / 2;
		}
		
		System.out.printf("Sua média truncada é: %.3f%nSua mediana é: %.3f", media, mediana);
	}

}
