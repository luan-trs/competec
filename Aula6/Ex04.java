import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nomeCompleto = sc.nextLine();
		
		String[] nomeCompletoSeparado = nomeCompleto.split(" ");
		String segundoNome = nomeCompletoSeparado[1];
		
		if (segundoNome.equals("do") || segundoNome.equals("da") || segundoNome.equals("de") || segundoNome.equals("dos") || segundoNome.equals("das") ) {
		    segundoNome = nomeCompletoSeparado[2];
		} else {
		    System.out.println("ERRO");
		}
		
		System.out.println("O seu segundo nome é: "+segundoNome);
	}
}