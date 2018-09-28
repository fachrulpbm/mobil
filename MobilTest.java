public class MobilTest{
	public static void main(String[] args) {
		Mobil m1 = new Mobil();	
		m1.addBensin(10); //bisa
		m1.addBensin(20); //bisa
		m1.addBensin(1); //ga
		m1.addKecepatan(200); //bisa
		m1.addKecepatan(500); //bisa
		System.out.println(m1.showKecepatan());
		

		// Mobil m2 = new Mobil();
		// m2.addBensin(1);
	}
}