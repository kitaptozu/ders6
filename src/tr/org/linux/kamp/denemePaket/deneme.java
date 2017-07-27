package tr.org.linux.kamp.denemePaket;

import tr.org.linux.kamp.protectedDeneme.ProtectedDeneme;

public class deneme extends ProtectedDeneme {

	

     void denemeMetod1u() {
		// TODO Auto-generated method stub
		super.isim="Msusata";
		
		
		
	}

	public static void main(String[] args) {
		deneme kkk = new deneme();

		kkk.denemeMetodu();
		
		kkk.isim = "Mustafa";
		kkk.yas = 21;

		System.out.println("Adi: " + kkk.isim);
		System.out.println("Yaşı: " + kkk.yas);
	}

}
