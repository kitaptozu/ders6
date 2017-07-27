package tr.org.linux.kamp.warnning;

public class Dragon extends Monstar implements Flyable,Scarer{

	public void breathFire() {
		System.out.println("Ateş püskürttü!");
	}

	@Override
	public void frighten() {
		// TODO Auto-generated method stub
		System.out.println("Korkutabilir!");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Ejderha uçtu!");
		
	}

	@Override
	public void canMakeYouScarer() {
		// TODO Auto-generated method stub
		System.out.println("seni korkutabilir!");
		
	}
	
}
