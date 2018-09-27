public class MobilTest{
	public static void main(String[] args) {
		Mobil m = new Mobil();	
		m.addBensin(5);
		m.addBensin(10);
		System.out.println(m.showBensin());	

		m.setMerk("Honda");	
		System.out.println(m.showMerk());
	}
}