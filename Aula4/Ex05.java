import java.util.Scanner;

//O programa deve perguntar a senha até o usuário inseri-la corretamente
public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String senha = "senha123";
		String login = "";
		
		while (!login.equals(senha)) { //Caso as strings sejam diferentes
		System.out.print("Senha: ");
		login = sc.nextLine();
		
		if (login.equals(senha)) {
			break;
		} 
		else {
			System.out.println("SENHA INCORRETA! TENTE NOVAMENTE");
		}
		
		}
		sc.close();
		System.out.println("LOGIN CONCLUíDO COM SUCESSO!");
	}

}
