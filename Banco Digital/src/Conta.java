import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Conta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;

	protected int conta;

	protected Double saldo;

	private Cliente cliente;

	private List<String> extrato = new ArrayList<>();

	public Conta() {
		this.agencia = AGENCIA_PADRAO;
		this.conta = SEQUENCIAL++;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void sacar(Double valor) {
		if (getSaldo() < valor) {
			extrato.add("Saque nao permitido: Saldo insuficiente!");

		} else {
			this.saldo -= valor;
			extrato.add("Saque ---------------- " + " - " + valor);
		}

	}

	public void depositar(Double valor) {
		this.saldo += valor;
		extrato.add("Deposito ------------- " + " + " + valor);

	}

	public void transferir(Double valor, Conta contaDestino) {
		if (getSaldo() < valor) {
			extrato.add("Transferencia nao permitido: Saldo insuficiente!");

		} else {
			this.saldo -= valor;
			contaDestino.depositar(valor);
			extrato.add("Transferencia -------- " + " - " + valor);
		}
	}

	protected void imprimirExtrato(Conta conta) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("----------EXTRATO---------");
		System.out.println("Cliente: " + conta.getCliente().getNome());
		System.out.println("Data: " + LocalDateTime.now().format(format));
		System.out.println("Agencia: " + conta.getAgencia());
		System.out.println("Conta: " + conta.getConta() + " - " + conta.getClass().getName());
		System.out.println("----------Movimentações---------");
		for (String e : extrato) {
			System.out.println(e);
		}
		System.out.println("Saldo: ------------------ " + conta.getSaldo());
		System.out.println("\n");
	}

}
