import java.util.Scanner;

public class Festa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double c, l, area; //Comprimento, largura e area
		int pessoas;
		
		System.out.println("Comprimento do local:");
		c = sc.nextDouble();
		System.out.println("Largura do local:");
		l = sc.nextDouble();
		System.out.println("Total de pessoas:");
		pessoas = sc.nextInt();
		sc.close();
		
		area = c*l;
		pessoas = pessoas*2; //Ocupam 2m quadrados
		
		if (area >= pessoas) {
			System.out.println("\nJÁ É INTEEEEEEEER");	
			} else {
			System.out.println("\nSanta Rita realmente ficou pequena...");	
				}
	}
}