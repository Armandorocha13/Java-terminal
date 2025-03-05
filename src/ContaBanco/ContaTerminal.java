package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        int NumeroConta = Integer.parseInt(args[0]);
        String Agencia = args[1];
        String NomeClinte = args[2];
        double Saldo = Double.parseDouble(args[3]);


        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite o numero da agencia: %s\n", Agencia);
        String agencia = teclado.nextLine();
        System.out.println("Digite o nome do usuario: %s\n" + NomeClinte);
        String nome = teclado.nextLine();
        System.out.println("Digite o saldo da conta: %f\n" + Saldo);









    }
}
