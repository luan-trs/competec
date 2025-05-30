import java.util.Scanner;

public class Gaga {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantAlbuns = 0, hits = 0; //indica quantos álbuns stefani tem e quantos hits
		int am, eu, as, af, oc, total; //Américas, Europa, Ásia, África e Oceania, total de ouvintes
		
		System.out.print("Quantos álbuns a artista possui? ");
		quantAlbuns = sc.nextInt();
		
		System.out.println("-=-INSIRA O TOTAL DE OUVINTES POR CONTINENTE-=-");
		for (int i=1; i<=quantAlbuns; i++) {
			System.out.println("Álbum nº"+i);
			System.out.print("Américas: ");
			am = sc.nextInt();
			System.out.print("Europa: ");
			eu = sc.nextInt();
			System.out.print("Ásia: ");
			as = sc.nextInt();
			System.out.print("África: ");
			af = sc.nextInt();
			System.out.print("Oceania: ");
			oc = sc.nextInt();
			total = am + eu + as + af + oc;
			if (total >= 100000) {
				hits++;
			}
			sc.close();
		}
		System.out.println("\nTOTAL DE ÁLBUNS VIRAiS: "+hits);
	}

}
