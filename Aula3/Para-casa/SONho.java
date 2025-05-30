import java.util.Scanner;

public class SONho {

	public static void main(String[] args) {
		//Precisa ganhar 5 vezes, retornar a partida que foi campeão
		Scanner sc = new Scanner(System.in);
		int partidas, golsS, golsA; //número de partidas, gols do time de son e gols do time adversário
		int vitorias = 0, index = -1; //número de vitórias e a partida que se tornou campeão
		
		System.out.print("Número de partidas do campeonato: ");
		partidas = sc.nextInt();
		 
		for (int i=1; i<=partidas; i++) {
			System.out.println("PARTIDA Nº"+i);
			System.out.print("Gols do time de Son: ");
			golsS = sc.nextInt();
			System.out.print("Gols do time adversário: ");
			golsA = sc.nextInt();
			
			if (golsS > golsA) {
				vitorias++;
			}
			if (vitorias==5) {
				index = i;
			}
		}
		
		if (index>-1) {
			System.out.println("\nSon foi campeão!");
			System.out.println("Partida que consagrou a vitória: "+index);
		} else {
			System.out.println("\nSon perdeu o campeonato...");
			System.out.println("Não completou 5 vitórias: "+index);
		}
		
	}

}
