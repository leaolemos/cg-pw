import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

    public class Questao3 {

        public static void ParesAnagramasContados(String palavra) {
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < palavra.length(); i++) {
                for (int j = i; j < palavra.length(); j++) {
                    char[] aux = palavra.substring(i, j + 1).toCharArray();
                    Arrays.sort(aux);
                    String str = new String(aux);
                    if (map.containsKey(str))
                        map.put(str, map.get(str) + 1);
                    else
                        map.put(str, 1);
                }
            }
            int parAnagrama = 0;
            for (String key : map.keySet()) {
                int n = map.get(key);
                parAnagrama += (n * (n - 1)) / 2;
            }
            System.out.println("O número de anagramas é: " + parAnagrama);

        }

        public static void main(String[] args) {
            System.out.println("Digite a palavra: ");
            Scanner scan = new Scanner(System.in);
            String palavraDigitada = scan.next();
            ParesAnagramasContados(palavraDigitada);
        }

    }