package tr.org.linux.kamp.warnning;

public class Vampire extends Monstar implements Scarer{
	
	public void bite() {
		System.out.println("Vampir ısırdı!");
	}

	@Override
	public void frighten() {
		// TODO Auto-generated method stub
		System.out.println("Korkutabilir!");
		
	}

	@Override
	public void canMakeYouScarer() {
		// TODO Auto-generated method stub
		System.out.println("Sizi korkuttu!");
		
	}

}
