

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        int NumeroConta = 0;
        String Agencia = "";
        String NomeClinte = "";
        double Saldo = 1555.0;


        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite o numero da agencia: %s\n", Agencia);
        Agencia = teclado.nextLine();
        System.out.println("Digite o nome do usuario:\n" + NomeClinte);
        NomeClinte = teclado.nextLine();
        System.out.println("Seu saldo é: R$\n" + Saldo );

        System.out.println("Obrigado " + NomeClinte + ", por criar uma conta em nosso banco, sua agencia é  "+ Agencia + 
        " .O saldo de R$ " + Saldo + " foi creditado em sua conta, para mais informações entre em contato com o gerente de sua agencia");







    }
}
