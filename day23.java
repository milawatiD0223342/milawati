import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
Scanner input = new Scanner (System.in);

System.out.print("total = ");
double jumlah = input.nextDouble();

		// percabangan
			double total = 3000000;
		System.out.println("Total Belanja = Rp. "+ total);
		
		if (total >= 2500000) {
			System.out.println("Anda dapat diskon 10%");
			
			double diskon = 10 * total /100;
		System.out.println(diskon);
				total -= diskon;
		}else if (total <= 3000000){
			System.out.println("Anda dapat diskon 20%");
			
			double diskon = 20 * total /100;
		System.out.println(diskon);
		}else{
			System.out.println("Tidak dapat diskon");
		
		}
		System.out.println("Akhir = Rp. " + total);
	}
}