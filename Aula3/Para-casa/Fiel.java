import java.util.Scanner;

public class Fiel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota, menorNota = 1001, maiorNota = -1;
        double media = 0;
        
        for (int i=1; i<=10; i++) {
            System.out.print("Nota nº"+i+": ");
            nota = sc.nextInt();
                if (nota < menorNota) {
                    menorNota = nota;    
                }
                if (nota > maiorNota) {
                    maiorNota = nota;
                }
            media += nota; 
        }
        sc.close();
        media -= maiorNota + menorNota;
        media = media/8; //A maior e a menor nota foram descartadas
        System.out.println("A média final foi de "+media);
	    
	    if (media > 900) {
	        System.out.println("ÉEEEE CAMPEÃAAAAA");
	    } else {
	        System.out.println("Fica pra próxima Fiel...");
	    }
	}
}
