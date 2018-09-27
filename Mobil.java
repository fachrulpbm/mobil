public class Mobil{

	int ban;	
	int kecepatan;
	int bensin;
	String merk;

	void maju(){
		System.out.println("Mobil majuuu...");
	}

	void mundur(){
		System.out.println("Mobil munduur...");
	}

	String showMerk(){
		return merk;
	}

	int showBensin(){
		return bensin;
	}

	void addBensin(int n){
		bensin = bensin + n;
	}

	void setMerk(String nama){
		merk = nama;
	}

}