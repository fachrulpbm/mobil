public class MobilTest{
	public static void main(String[] args) {
		Mobil m = new Mobil();
		m.maju(); //mobil majuuu..
		m.mundur(); //mobil munduur..
		m.ban = 4; //nothing show
		System.out.println("ban = "+m.ban); //ban = 4
		m.merk = "Toyota";		
		System.out.println("merk = "+m.showMerk()); //toyota
	}
}