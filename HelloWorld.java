package ilk;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Adınız = ");
		String ad = input.next();
		System.out.print("Doğduğunuz Yıl = ");
		int dogumYili = input.nextInt();
		int yas = 2024 - dogumYili;
		int skor = yas*2;
		
		Person person1 = new Person(ad,yas,skor);
		System.out.print(person1.toString());
	}

}
