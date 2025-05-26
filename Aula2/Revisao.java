import java.util.Scanner;

public class Revisao
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double selecionado = 0;

		System.out.println("[1] Hamburguer | R$9,99");
		System.out.println("[2] Batata frita | R$7,00");
		System.out.println("[3] Refrigerante | R$5,00");

		System.out.println("Qual item você gostaria de pedir?");
		int escolha = sc.nextInt();

		System.out.println("Quantas unidades?");
		int quant = sc.nextInt();

		switch (escolha) {
		case 1:
			System.out.println("Você selecionou "+quant+" hamburgueres");
			selecionado = 9.99;
			break;

		case 2:
			System.out.println("Você selecionou "+quant+" batatas fritas");
			selecionado = 7;
			break;

		case 3:
			System.out.println("Você selecionou "+quant+" refrigerantes");
			selecionado = 5;
			break;

		default:
			System.out.println("INVÁLIDO");
			break;
		}

		double carrinho = selecionado*quant;
		System.out.println("O total foi de: R$"+carrinho);

		System.out.println("Quanto dinheiro você tem?");
		double carteira = sc.nextDouble();
		sc.close();

		if (carteira < carrinho) {
			System.out.println("\033[31mSALDO INSUFICIENTE");
		}

		else if (carteira >= carrinho) {
			System.out.println("\033[32mCOMPRA REALIZADA COM SUCESSO! Volte sempre");
			carteira -= carrinho;
			System.out.println("Seu saldo agora é: R$"+carteira);
		}
	}
}