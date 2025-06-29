import java.util.Scanner;

public class PiramideNomes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String palavra = sc.nextLine();
		
		for (int i=0; i<palavra.length(); i++) {
		    for (int j=0; j<=i; j++) {
		        System.out.print(palavra.charAt(j));
		    }
		    System.out.println();
		}
		for (int i=palavra.length()-1; i>=0; i--) {
		    for (int j=0; j<=i; j++) {
		        System.out.print(palavra.charAt(j));
		    }
		    System.out.println();
		}
	}
}