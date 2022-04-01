package entities;

public class Account {

	private Integer number;
	private String name;
	private Double balance;
	private Double withdrawLimit;
	
	public Account () {
		
	}

	public Account(Integer number, String name, Double balance, Double withdrawLimit) {
		this.number = number;
		this.name = name;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(Double deposit) {
		this.balance += deposit;
	}
	
	public void withDraw(Double amount) {
		
		if(amount > this.balance) {
			throw new DomainException("Saldo indisponível");
		}
		if (amount > this.withdrawLimit) {
			throw new DomainException ("Excedeu limite:");
		}
		this.balance -= amount;
	}
	
	@Override
	public String toString() {
		return "new balance:  "
				+ this.balance;
	}
}
