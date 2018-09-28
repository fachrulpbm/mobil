public class MobilTest{
	public static void main(String[] args) {
		Mobil m = new Mobil();	
		m.addBensin(10); //bisa
		m.addBensin(20); //bisa
		m.addBensin(1); //bisa //ga

		Mobil m2 = new Mobil();
		m2.addBensin(1);
	}
}