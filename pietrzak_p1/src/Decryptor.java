
public class Decryptor {
	static int decrypt(int userInput)
	{
		int a = userInput / 1000;
		int b = (userInput % 1000) / 100;
		int c = (userInput % 100) / 10;
		int d = userInput % 10;
		
		a = (a + 3) % 10;
		b = (b + 3) % 10;
		c = (c + 3) % 10;
		d = (d + 3) % 10;
		return (c * 1000 + d * 100 + a * 10 + b);
	}

}
