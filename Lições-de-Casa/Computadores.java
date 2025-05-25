import java.util.Scanner;

public class Computadores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c1, c2, c3, c4, a1, a2, a3, a4; //Computadores e alunos
		boolean condicoes, quantidade; //Checa se todas as condições são verdadeiras
		
		System.out.println("Computadores sala 1:");
		c1 = sc.nextInt();
		System.out.println("Computadores sala 2:");
		c2 = sc.nextInt();
		System.out.println("Computadores sala 3:");
		c3 = sc.nextInt();
		System.out.println("Computadores sala 4:");
		c4 = sc.nextInt();
		System.out.println("Alunos sala 1:");
		a1 = sc.nextInt();
		System.out.println("Alunos sala 2:");
		a2 = sc.nextInt();
		System.out.println("Alunos sala 3:");
		a3 = sc.nextInt();
		System.out.println("Alunos sala 4:");
		a4  = sc.nextInt();
		sc.close();
		
		 //Todas devem ter mais computadores que alunos
		quantidade = c1>=a1 && c2>=a2 && c3>=a3 && c4>=a4;
		
		//Condições especificas de cada sala
		condicoes = a1<=40 && (a2%2)==0 && a3<=(c3/2) && (a4%10) == 7;
		
		if (quantidade && condicoes) {
			System.out.println("HABEMUS AULA!");	
			} else {
			System.out.println("Fica pra próxima...");	
			}
	}
}