public class Ex02 {
	public static void main(String[] args) {
        double laranja = 5.20; //A laranja custa 5 reais
        double banana = 2.50; //A banana custa 2 reais
        
        double soma = laranja+banana;
        double desconto = soma - soma*0.80; //Desconto de 80%
        System.out.println("Preço da laranja: R$"+laranja);
        System.out.println("Preço da banana: R$"+banana);
        System.out.println("A soma dos dois: R$"+soma);
        System.out.println("Com desconto de 80%: R$"+desconto);
	}
}
