public class Main {
	public static void main(String[] args) {
	// operator logika
	// simbol (!) adalah not atau biasa disebut tidak sama dengan contohnya: (!=)
			byte nilai = 6;
		int angka = 7;
		// AND simbolnya (&&)
	System.out.println("@@@ AND @@@");
		System.out.println(nilai == nilai && nilai != angka); 
		System.out.println(nilai == angka && angka == angka);
		System.out.println(angka != angka && nilai == angka);
		System.out.println(nilai == angka && angka !=angka);
		// OR simbolnya (||)
		System.out.println("@@@ OR @@@");
		System.out.println(angka != angka || nilai == angka);
		System.out.println(nilai == angka || angka ==angka);
		System.out.println(angka == angka || nilai == angka);
		System.out.println(nilai != angka || angka !=angka);
		// XOR simbolnya (^)
			System.out.println("@@@ XOR @@@");
		System.out.println(angka == angka ^ nilai == angka);
		System.out.println(nilai == angka ^ angka !=angka);	
		System.out.println(angka == angka ^nilai == angka);
		System.out.println(nilai == angka ^ angka !=angka);
	}
}