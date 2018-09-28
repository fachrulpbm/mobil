public class Mobil{

	int ban;	
	int kecepatan;
	int bensin;
	String merk;
	int maxBensin = 30;

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
		if((bensin + n) <= maxBensin ){
			bensin += n;
			System.out.println("Bensin berhasil diisi " + n);
		}else{
			System.out.println("Penuh!");
		}
	}

	void setMerk(String nama){
		merk = nama;
	}

}