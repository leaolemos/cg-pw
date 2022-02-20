import javax.swing.*;

public class Questao1 {

        public static void main(String[] args) {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número referente ao tamanho da escada"));
            int cont = 1, aux = n;
            for (int i=1; i<=n; i++){
                for (int j=1; j<aux; j++){
                    System.out.print(" ");
                }
                aux--;
                for (int k=0; k<cont;  k++){
                    System.out.print("*");
                }
                cont++;
                System.out.println();
            }
        }
    }
