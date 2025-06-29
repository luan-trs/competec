import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String senha = "BATATA";
		
		while (true) {
    		System.out.print("Digite a senha: ");
    		String user = sc.nextLine();
    		
    		//Ignora se está maiúsculo ou minúsculo
    		if (senha.equalsIgnoreCase(user)) {
    		    System.out.println("Parabéns, você acertou!");
    		    break;
    		} else {
    		    System.out.println("Que pena, você errou!\n");
    		}
		}
	}
}