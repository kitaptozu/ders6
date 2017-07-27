package tr.org.linux.kamp.AtmOtomasyanHoca;

public class ATM {
	private User user;
	private User[] userlist = new User[5];
	private boolean isLogin = false;

	public ATM(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User[] getUserlist() {
		return userlist;
	}

	public void setUserlist(User u, int i) {
		this.userlist[i] = u;
	}

	public boolean isLogin() {
		return isLogin;
	}

	public void setLogin(boolean isLogin) {
		this.isLogin = isLogin;
	}

	public void login(User user) {
		int j = 0;
		if (!isLogin) {

			for (int i = 0; i < userlist.length; i++) {

				if (user.getAcountNumber().equals(userlist[i].getAcountNumber())
						&& userlist[i].getPassword().equals(user.getPassword())) {

					isLogin = true;

				} else {
					j++;
				}

			}
		} else {
			System.out.println("Zaten giriş yaptınız!");
		}

		if (j == userlist.length) {
			System.out.println("Kayıt bulunamadı!");
		} else if (j == userlist.length - 1) {
			System.out.println("Başarılı bir şekilde giriş yapıdı!");
		}
	}

	public void generateUser(ATM atm) {
		User u;
		int amount = 500;
		for (int i = 0; i < userlist.length; i++) {
			u = new User(Integer.toString(i + 1), Integer.toString(i + 2), amount + 100);
			atm.setUserlist(u, i);

		}
	}
	
	public void showUser(ATM atm1) {
		
		for(int i=0;i<userlist.length;i++) {
			System.out.println(userlist[i].getAcountNumber()+"  "+ userlist[i].getPassword()+"  "+userlist[i].getAmount());
		}
		
	}
	
	
	
	
	
	
	
	
}
