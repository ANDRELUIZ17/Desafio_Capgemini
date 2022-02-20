import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Escada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String > degraus = new ArrayList<>();
        System.out.println("Digite a quantidade de degraus: ");
        int qtdDegraus = sc.nextInt();

        for (int i = 0; i < qtdDegraus; i++) {
            degraus.add("".repeat(qtdDegraus - i) + "*".repeat(i + 1));
        }
        for (String degrau : degraus) {
            System.out.println(degrau);
        }
    }
}
