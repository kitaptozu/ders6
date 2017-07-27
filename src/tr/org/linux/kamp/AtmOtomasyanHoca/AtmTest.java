package tr.org.linux.kamp.AtmOtomasyanHoca;

public class AtmTest {
	
	public static void main(String[] args) {
		User user1 =new User("1","9");
		ATM atm1 = new ATM(user1);
		atm1.showUser(atm1);
		atm1.generateUser(atm1);
		atm1.login(user1);
		
	}

}
