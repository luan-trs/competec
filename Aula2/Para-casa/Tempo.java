import java.util.Scanner;          													

public class Tempo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t1, t2, t3, t4, t5, maior;
		int verdad1, verdad2, verdad3, verdad4, verdad5;
		
		System.out.println("Quanto tempo o primeiro aluno demorará?");
		t1 = sc.nextInt();
		verdad1 = t1*5;
		
		System.out.println("\nQuanto tempo o segundo aluno demorará?");
		t2 = sc.nextInt();
		verdad2 = t2*t2;
		
		System.out.println("\nQuanto tempo o terceiro aluno demorará?");
		t3 = sc.nextInt();
		if (t3%2 == 0) 
		{verdad3 = t3/2;} 
		else 
		{verdad3 = t3*2;}
			
		System.out.println("\nQuanto tempo o quarto aluno demorará?");
		t4 = sc.nextInt();
		verdad4 = verdad3*3;
		
		System.out.println("\nQuanto tempo o quinto aluno demorará?");
		t5 = sc.nextInt();
		sc.close();
		verdad5 = t5 - (t1*2);
		
		maior = verdad1;
		System.out.println("\n"+verdad1);
		System.out.println(verdad2);
		System.out.println(verdad3);
		System.out.println(verdad4);
		System.out.println(verdad5+"\n");
		
		System.out.print("\nAluno mais atrasado: ");
		if (verdad2 > maior) {
			maior = verdad2;
			System.out.println("Aluno 2");
		} else if (verdad3 > maior) {
			maior = verdad3;
			System.out.println("Aluno 3");	
		} else if (verdad4 > maior) {
			maior = verdad4;	
			System.out.println("Aluno 4");
		} else if (verdad5 > maior) {
			maior = verdad5;
			System.out.println("Aluno 5");
		} else {
			System.out.println("Aluno 1");	
			}
		
		System.out.println("O maior tempo será: "+maior);
	}
}
