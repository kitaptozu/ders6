package tr.org.linux.kamp.AtmOtomasyanHoca;

public class User {
	private String acountNumber=null;
	private String password=null;
	private int amount=0;
	
	public User(String acountNumber,String password,int amount) {
		setAcountNumber(acountNumber);
		setPassword(password);
		setAmount(amount);
	}
	
	public User(String acountNumber,String password) {
		setAcountNumber(acountNumber);
		setPassword(password);
		
	}
	
	public String getAcountNumber() {
		return acountNumber;
	}
	public void setAcountNumber(String acountNumber) {
		this.acountNumber = acountNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	

}
