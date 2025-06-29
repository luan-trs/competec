import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.nextLine();
		int quant = nome.length();
		System.out.println("Olá, "+nome+", seu nome tem "+quant+" caracteres");
	}
}