import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int nilai = input.nextInt();
		System.out.println("nilai = " + nilai);//menentukan nilai output
		// operasi aritmatika
				int panjang = 30;
		int lebar = 25;
		int luas = panjang * lebar;
		int luas1 = panjang + lebar;
		int luas2 = panjang / lebar;// hasil outputnya akan tetap 1 karena pakai tipe data integer
		int luas3 = panjang - lebar;
		int luas4 = panjang % lebar; // sisa bagi
		System.out.println("luas = " + luas);
		System.out.println("luas1 = " + luas1);
	System.out.println("luas2 = " + luas2);	System.out.println("luas3 = " + luas3);
	System.out.println("luas4 = " + luas4);
	}
}