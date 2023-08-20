package entities;

public class ContaBanco {

	private Integer numConta;
	private String agencia;
	private String nome;
	private double saldo;
	
	public ContaBanco() {
		
	}

	
	public ContaBanco(Integer nunConta, String agencia, String nome, double saldo) {
		this.numConta = nunConta;
		this.agencia = agencia;
		this.nome = nome;
		this.saldo = saldo;
	}

	public Integer getNumConta() {
		return numConta;
	}

	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}
	// foi removido o set saldo, pq nao queremos que o cliente faça alteração no saldo.
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Olá "+ nome 
				+" obrigado por criar uma conta em nosso banco, sua agência é " + agencia
				+" conta "+numConta
				+ "e seu saldo "+ String.format("%.2f",saldo)
				+ " já está disponível para saque.";
	}
	
	
	
}
