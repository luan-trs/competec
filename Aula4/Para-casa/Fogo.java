import java.util.Scanner;

public class Fogo {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
        System.out.print("Quantos itens foram encontrados? "); //Limite do array
        int quantItens = sc.nextInt();
        int itens[] = new int[quantItens]; //Armazenará os itens coletados
        
        System.out.print("Quantos tipos de itens? "); //Define o range do loop
        int quantTipos = sc.nextInt();
		
		for (int p = 1; p<=quantItens; p++) {
			System.out.print(p+"º item coletado: ");
			int item = sc.nextInt();
			itens[p-1] = item;
		}
		
		System.out.println("\n-=-=-Quantidade de cada tipo-=-=-");
		for (int i = 1; i<=quantTipos; i++) { //Checa cada tipo
			int cont = 0; //Conta a quantidade de cada item
			for (int j = 0; j<itens.length; j++) {
				if (itens[j] == i) {
					cont++;
				}
			}
			
			System.out.println("Tipo "+i+": "+cont);
		}
	}
}
