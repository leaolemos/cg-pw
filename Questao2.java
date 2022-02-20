import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao2 {


    // Validar senha
    public static boolean
    isValidPassword(String senha) {

        // checar senha validada
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";

        int stringLength = senha.length();
        int stringTotal = 6 - senha.length();
        System.out.println("Falta(m) " + stringTotal + " caractere(s).");

        // compilar
        Pattern p = Pattern.compile(regex);

        if (senha == null) {
            return false;
        }

        Matcher m = p.matcher(senha);

        // Retornar se senha combinou com Regex
        return m.matches();
    }


    public static void main(String[] args) {
        System.out.println("Digite a senha: ");
        Scanner scan = new Scanner(System.in);
        String senhaDigitada = scan.next();
        isValidPassword(senhaDigitada);


    }
}