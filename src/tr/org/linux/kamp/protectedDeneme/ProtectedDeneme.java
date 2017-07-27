package tr.org.linux.kamp.protectedDeneme;

public class ProtectedDeneme {

	protected String isim;
	protected int yas;
	static int kilo;

	protected void denemeMetodu() {
		System.out.println("Bu mesaj eğer ulaştıysa başka paketten bağlantı kurulmuştur.");
	}

	static void deneme1() {
		System.out.println("Msusas");
	}

}
