import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		int x;
		int y;
		Scanner scn = new Scanner(System.in);
		//Prompt the user to enter a 4 digit number.
		System.out.println("Please enter a 4 digit number: ");
		x = scn.nextInt();
		//Use Encryptor's encrypt function to encrypt the number.
		x = Encryptor.encrypt(x);
		//Add any number of zeroes in front of the code if necessary.
		if(x < 10)
			System.out.println("Encrypted number: 000" + x);
		else if(x < 100)
			System.out.println("Encrypted number: 00" + x);
		else if(x < 1000)
			System.out.println("Encrypted number: 0" + x);
		else
			System.out.println("Encrypted number: " + x);
		//Prompt the user to enter an encrypted number.
		System.out.println("Please enter a 4 digit encrypted number: ");
		y = scn.nextInt();
		//Call upon the class Decryptor's decrypt function and set it equal to y.
		y = Decryptor.decrypt(x);
		if(y < 10)
		//Add zeroes in front of the decrypted number if necessary.
			System.out.println("Decrypted number: 000" + y);
		else if(y < 100)
			System.out.println("Decrypted number: 00" + y);
		else if(y < 1000)
			System.out.println("Decrypted number: 0" + y);
		else
			System.out.println("Decrypted number: " + y);
		

	}
}