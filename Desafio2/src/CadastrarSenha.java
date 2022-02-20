import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CadastrarSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                A senha deve conter:
                - no mínimo 6 caracteres
                - no máximo 12 caracteres
                - pelo menos uma letra maiúscula
                - pelo menos um número
                - pelo menos um caractere especial
                - não pode conter espaços em branco""");
        System.out.println("------------------------------------------------------");

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = sc.nextLine();
        Pattern digito = Pattern.compile("[0-9]");
        Pattern letra = Pattern.compile("[a-zA-Z]");
        Pattern caractere = Pattern.compile("[!@#$%¨&*()-+=]");

        Matcher matcherDigito = digito.matcher(senha);
        Matcher matcherLetra = letra.matcher(senha);
        Matcher matcherCaractere = caractere.matcher(senha);

        if (senha.length() < 6) {
            int caracteres = 6 - senha.length();
            System.out.println("A senha deve conter no mínimo 6 caracteres, você precisa adicionar "
                    + caracteres + " caracteres");
        }
        else if (!matcherDigito.find()) {
            System.out.println("A senha deve conter pelo menos um número");
        }
        else if (!matcherLetra.find()) {
            System.out.println("A senha deve conter pelo menos uma letra");
        }
        else if (!matcherCaractere.find()) {
            System.out.println("A senha deve conter pelo menos um caractere especial");
        }
        else {
            System.out.println("Senha válida");
        }
    }
}
