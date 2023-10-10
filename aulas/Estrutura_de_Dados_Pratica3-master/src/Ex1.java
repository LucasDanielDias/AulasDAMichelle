import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Ex1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner;
        scanner = new Scanner(new File("src/Frases.txt"));
        Stack pilha = new Stack();

        while (scanner.hasNextLine()) {
            pilha.push(scanner.nextLine());
        }
        System.out.println("Tamanho da Pilha " + pilha.size());
        System.out.println("****Pilha de Nomes*****");

        for (int i = 0; i <= 10; i++) {
            System.out.println(pilha.pop());
        }
    }
}
