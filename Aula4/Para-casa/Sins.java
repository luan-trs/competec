import java.util.Scanner;

public class Sins {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de casas na rua: ");
		int quantCasas = sc.nextInt();
		int casas[] = new int[quantCasas];
		
		for (int c=1; c<=quantCasas; c++) {
		    System.out.print("Habitantes da casa "+c+": ");
		    int habitantes = sc.nextInt();
		    casas[c-1] = habitantes;
		}
		
		
		for (int i=0; i<quantCasas; i++) {
		    int vizinhos = 0; //Reinicia o contador a cada loop
		    if (i == 0) { //Caso seja a primeira casa
		        vizinhos = casas[1];
		    } else if (i == quantCasas-1) { //Caso seja a última casa
		        vizinhos = casas[quantCasas-2];
		    } else {
		        vizinhos = casas[i-1] + casas[i+1]; //Casa de trás e da frente
		    }
		    System.out.printf("Vizinhos da casa %d: %d%n", i+1, vizinhos);
		}
	}
}