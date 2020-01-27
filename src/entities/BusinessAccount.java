package entities;

public class BusinessAccount extends Account {
	private Double limiteEmprestimo;
	
	public BusinessAccount() {
		super();
	}
	
	public BusinessAccount(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
		super(numero, titular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public void emprestimo(double valor) {
		if(valor <= limiteEmprestimo) {
			//metodo da class Account
			deposito(valor);
		}else {
			System.out.println("Este valor é maior que o limite permitido! ");
		}
	}

	public String toString() {
		return "[numero=" + numero 
				+ ", titular=" + titular 
				+ ", saldo= $" + saldo 
				+ ", Limite de Emprestimo = $" + limiteEmprestimo + "]";
	}

	
	
	
	
	
}
