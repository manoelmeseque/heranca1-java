package entities;

public class SavingsAccount extends Account{
	private Double taxaJuros;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer numero, String titular, Double saldo, Double taxaJuros) {
		super(numero, titular, saldo);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public void atualizarSaldo() {
		saldo += saldo * taxaJuros;
	}
	
	@Override
	public void saque(double valor) {
		saldo -= valor;
	}
}
