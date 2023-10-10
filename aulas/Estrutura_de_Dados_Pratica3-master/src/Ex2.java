import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Ex2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner;
        scanner = new Scanner(new File("src/Ingressos.txt"));
        List<String> pq = new ArrayList<>();

        while (scanner.hasNextLine()) {
            pq.add(scanner.nextLine());
        }
        System.out.println("Ingressos entrada VIP: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(pq.remove(i) + " ");
        }
        int select = new Random().nextInt(pq.size());
        System.out.println("\nO número sorteado é " + pq.get(select));
    }
}
