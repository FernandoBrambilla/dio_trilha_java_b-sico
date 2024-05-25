import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero = 1021;
		String agencia;
		String nomeCliente;
		Double saldo = 237.48;
		
		System.out.println("Olá, por favor digite o seu nome: ");
		nomeCliente = scan.next();
		
		System.out.println("Número da Agência :");
		agencia = scan.next();
		
		scan.close();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
				+ "sua agência é " + agencia +", "
						+ "conta " + numero + " e seu saldo de R$ "
								+ saldo + " já está disponível para saque.");
	}

}
