import java.util.HashMap;
import java.util.Scanner;

public class ContadorDePalavras {
    public ContadorDePalavras(String palavra) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < palavra.length(); i++) {
            String key = palavra.substring(i, i + 1);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        System.out.println(map);
    }
    public static <ContadorParesAnagramas> void main(String[] args) {
        System.out.println("Digite uma palabra: ");
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        ContadorParesAnagramas contador = (ContadorParesAnagramas) new ContadorDePalavras(palavra);

    }
}
