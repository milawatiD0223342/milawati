import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	
			int nilai = 30;

		Scanner inputUser = new Scanner(System.in);
		
		System.out.print("masukkan nilai: ");
		int input = inputUser.nextInt();
		
		// ternary operator (:)
nilai = (nilai == 30) ? (nilai * nilai) : (nilai/3);

	System.out.println("hasilnya adalah " +nilai);

	}
}