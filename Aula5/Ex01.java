//Crie uma matriz 3x3 com números de 1 a 9 e mostre o número do meio (5)
//Após isso printe todos os números dentro dela
public class Ex01 {
    public static void main (String[] args) {
        int[][] matriz ={{1, 2, 3}, 
                        {4, 5, 6}, 
                        {7, 8, 9}};
        
        System.out.println("Número do meio: "+matriz[1][1]);
        System.out.println("\nTodos os números da matriz:");
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.print(matriz[i][j]+" ");
            }
        System.out.println();
        }
    }
}