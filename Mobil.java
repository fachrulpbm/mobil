public class Mobil{

	int ban;	
	int kecepatan;
	int bensin;
	String merk;
	int maxBensin = 30;
	int maxKecepatan = 220;
	int minKecepatan = 0;

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

	void addKecepatan(int x){
		if( (kecepatan + x) <= maxKecepatan){
			kecepatan += x;
			System.out.println("Kecepatan berhasil ditambah " + x);
		}else{
			kecepatan = 220;
			System.out.println("Kecepatan telah maksimum");
		}
	}

	void minusKecepatan(int y){
		if( (kecepatan - y) >= minKecepatan){
			kecepatan -= y;
			System.out.println("Kecepatan berhasil dikurangi " + y);
		}else{
			kecepatan = 0;
			System.out.println("Kecepatan telah minimum");
		}
	}

	int showKecepatan(){
		return kecepatan;
	}

}