import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws FileNotFoundException {
        LinkedList<String> listaNoiva = new LinkedList<>();
        LinkedList<String> listaNoivo = new LinkedList<>();

        Scanner scannerNoiva = new Scanner(new File("src/noiva.txt"));
        Scanner scannerNoivo = new Scanner(new File("src/noivo.txt"));

        while (scannerNoiva.hasNextLine()) {
            listaNoiva.add(scannerNoiva.nextLine());
        }
        while (scannerNoivo.hasNextLine()) {
            listaNoivo.add(scannerNoivo.nextLine());
        }
        LinkedList<String> listaConvidados = new LinkedList<>(listaNoiva);
//        for (String nome : listaNoivo) {
//            listaConvidados.add(nome);
//        }
        listaConvidados.addAll(listaNoivo);
        Collections.sort(listaConvidados);

        System.out.println("*** Lista de convidados ***");
        for (String nome : listaConvidados) {
            System.out.println(nome);
        }
    }
}
