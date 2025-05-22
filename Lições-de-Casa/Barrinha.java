import java.util.Scanner;

public class Barrinha
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double dinItu, dinCaio, preco, totalDin, totalBarrinha, dinRayssa;
	    int quantBarrinhas;
	    
		System.out.println("*** COMPRA DE BARRINHAS ***");
		
		System.out.println("\nInsira a quantidade de dinheiro que Itu levou:");
	    dinItu = sc.nextDouble();
	    System.out.println("\nInsira a quantidade de dinheiro que Caio levou:");
	    dinCaio = sc.nextDouble();
	    totalDin = dinItu + dinCaio; //Quantidade total de dinheiro que os dois levaram
	    
	    System.out.println("\nInsira o preço das barrinhas de goiaba:");
	    preco = sc.nextDouble();
	    System.out.println("\nQuantas barrinhas eles irão comprar?");
	    quantBarrinhas = sc.nextInt();
	    totalBarrinha = preco*quantBarrinhas; //Total da compra
	    
	    if (totalBarrinha > totalDin) {
	        dinRayssa = totalBarrinha - totalDin; //Quantidade de dinheiro que falta para comprar
	        System.out.println("\n\033[33mRayssa deverá enviar R$" + dinRayssa + " para Caio e Itu");
	    }
	    else {
	        System.out.println("\n\033[32mEles levaram dinheiro suficiente");
	    }
	}
}
