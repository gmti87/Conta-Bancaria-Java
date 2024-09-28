import java.util.Scanner;

public class ContaTermial {
    
    public static void main(String[] args) {
     
        System.out.println("Hello, World!");

        Scanner ler = new Scanner(System.in);

        int numero;
        String agencia;
        String nomecliente;
        float saldo;

        System.out.println("Por favor, digite o número da Agência!");
        numero = ler.nextInt();

        System.out.println("Entre com o número da sua conta");
        agencia = ler.next();

        System.out.println("Digite o seu nome");
        nomecliente = ler.next();

        System.out.println("Digite o valor que você  quer depositar na conta");
        saldo = ler.nextFloat();

        System.out.println("Olá " + nomecliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    
    }
}
