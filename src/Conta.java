
public class Conta {
	private String accountNumber;
	private String accountHolder;
	private String cpf;
	private int type;
	private double balance;
	

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String showAccount() {
		
		String mesage = "Conta Bancaria: "+ accountNumber + 
	   			((type==0)?" - Conta Corrente":
		        ((type==1)?" - Poupança":" - Investimentos"));
				mesage = mesage + "\nTitular: "+ accountHolder +" ("+ cpf +")\n";
				mesage = mesage + String.format("Saldo R$ %.2f", balance);
		return mesage;
	}
	
	void deposit(double value) {
		balance += value;
	}
	
	boolean withdrawal(double value) {
		if (value <= balance) {
			balance -= value;
			return true;
		}
		return false;
	}
	
	
}
