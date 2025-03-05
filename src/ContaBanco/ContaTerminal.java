package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        int NumeroConta = 0;
        String Agencia = "";
        String NomeClinte = "";
        double Saldo = 0.0;


        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite o numero da agencia: %s\n", Agencia);
        String agencia = teclado.nextLine();
        System.out.println("Digite o nome do usuario: %s\n" + NomeClinte);
        String nome = teclado.nextLine();
        System.out.println("Digite o saldo da conta: %f\n" + Saldo);









    }
}
