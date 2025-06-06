import java.util.Scanner;

public class Vale {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos animais? ");
		int quantAnimal = sc.nextInt();
		int animais[] = new int[quantAnimal];
		
		for (int e=0; e<quantAnimal; e++) { //e = especie
			System.out.println("Espécie na posição "+e+": ");
			int especie = sc.nextInt();
			animais[e] = especie;
		}
		
		System.out.print("Quantas comidas? ");
		int quantComida = sc.nextInt();
		int comidas[] = new int[quantComida];
		
		for (int t=0; t<quantComida; t++) { //t = tipo de comida
			System.out.println("Comida na posição "+t+": ");
			int comida = sc.nextInt();
			comidas[t] = comida;
		}
		
		int alimentados = 0; //Animais alimentados
		for (int c : comidas) {
			for (int a : animais) {
				if (c == a) {
					alimentados++;	
				}	
			}
		}
		
		System.out.println("Animais alimentados: "+alimentados);
	}
}