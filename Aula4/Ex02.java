public class Ex02 {
    public static void main (String[] args) {
        int cont = 0;
        int soma = 0;
        System.out.println("SOMA DOS NÚMEROS DE 0 A 100");
        
        while (cont <= 100) {
            soma = soma + cont;
            cont++;
        }
        System.out.println(soma);
    }
}