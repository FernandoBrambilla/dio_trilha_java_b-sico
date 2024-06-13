
public class App {

	public static void main(String[] args) {

		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		cc.setCliente(new Cliente("Jose da Silva", "43999999999", "Av. sei la"));
		cp.setCliente(new Cliente("Maria da Silva", "43999999999", "Av. laguna"));

		cc.depositar(1000d);
		cc.sacar(100d);
		cc.transferir(200d, cp);
		cc.transferir(800d, cp);

		cp.depositar(500d);
		cp.sacar(800d);

		cc.imprimirExtrato(cc);
		cp.imprimirExtrato(cp);

	}

}
