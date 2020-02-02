
public class Encryptor {

	static int encrypt(int userInput)
	{
		int a, b, c, d;
		
		d = userInput % 10;
		c = (userInput % 100) / 10;
		b = (userInput % 1000) / 100;
		a = userInput / 1000;
		
		a = (a + 7) % 10;
		b = (b + 7) % 10;
		c = (c + 7) % 10;
		d = (d + 7) % 10;
		return (c * 1000 + d * 100 + a * 10 + b);
	}
			

}
