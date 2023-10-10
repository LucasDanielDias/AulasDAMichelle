/*Fazer um programa que insira 10 valores inteiros randômicos
em um vetor, mostre o vetor e busque um determinado elemento (mostrar a
posição que encontrou). Caso não exista imprimir mensagem de não localizado.
*/
import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {

        Random random = new Random(10);
        int valorProdurado = 4, posicao;
        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(10);
        }
        System.out.println("Imprimindo o vetor...");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println();
            System.out.println("Posição do vetor : " + i + "\nO valor interno do vetor é : " + vetor[i]);

            if (valorProdurado == vetor[i]) {
                posicao = i;
                System.out.println("Valor encontrado ! \nA posição encontrada é : " + posicao);
                break;
            }
            System.out.println("Valor não encontrado !");
        }

    }
}
