import java.util.Scanner;

//Declare uma matriz para guardar as notas inteiras dos 30 alunos de uma turma, em 3 disciplinas
public class TabelaNotas {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int lin = 3;
        int col = 30;
        int[][] tabela = new int[lin][col]; //3 matérias (linhas) e 30 alunos (colunas)
        
        for (int i=0; i<lin; i++) {
            System.out.println("-=-=-=-=-=- Matéria "+(i+1)+" -=-=-=-=-=-");
            
            for (int j=0; j<col; j++) {
                System.out.print("Nota do aluno nº"+(j+1)+": ");
                int nota = sc.nextInt();
            }
            
            System.out.println();
        }
    }
}