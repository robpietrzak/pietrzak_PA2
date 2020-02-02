package pietrzak_p2;
import java.util.Scanner;

public class BMICalculator {
	
	private double height;
	private double weight;
	private int option;
	private double bmi;
	private String bmicategory;
	
	
	Scanner scn = new Scanner(System.in);
	
	
	public void readUserData()
	{
		//Read the user's input: 1 for metric, 2 for imperial
		int unitType = readUnitType();
		
		//Read the measurement data
		readMeasurementData(unitType);
	}
	
	private int readUnitType()
	{
		int x;
		//Repeat the code until the user inputs either a 1 or a 2
		do {
		System.out.println("1 for Metric, 2 for Imperial");
		x = scn.nextInt();
		}while(x < 1 || x > 2);
		//Return the unit type
		return x;
	}
	
	private void readMeasurementData(int input)
	{
		//If the input is 1, then read data as metric. If the input is 2, then read as imperial.
		if(input == 1) {
			readMetricData();
			setOption(1);
		}
		else if(input == 2) {
			readImperialData();
			setOption(2);
		}		
	}
	
	private void readMetricData()
	{
		double kilos;
		double meters;
		//Prompt user to enter weight in kilos
		System.out.println("Enter your weight in kilograms");
		kilos = scn.nextDouble();
		if(kilos < 0)
			System.exit(0);
		//Set the weight in kilos into BMICalculator
		setWeight(kilos);
		System.out.println("Enter your height in meters");
		meters = scn.nextDouble();
		if(meters < 0)
			System.exit(0);
		setHeight(meters);
	}
	
	private void readImperialData()
	{
		double pounds;
		double feet;
		//Prompt user to enter weight and height, then register them into BMICalculator.
		System.out.println("Enter your weight in pounds");
		pounds = scn.nextDouble();
		if(pounds < 0)
			System.exit(0);
		setWeight(pounds);
		System.out.println("Enter your height in inches");
		feet = scn.nextDouble();
		if(feet < 0)
			System.exit(0);
		setHeight(feet);
	}
	
	public double calculateBmi()
	{
		double input = 0;
		//If option is imperial, do imperial conversion.
		if(getOption() == 2)
		{
			input = (703 * getWeight()) / (getHeight() * getHeight());
		}
		//If option is metric, do metric conversion.
		else if(getOption() == 1)
		{
			input = getWeight() / (getHeight() * getHeight());
		}
		//Return the result.
		return input;
	}
	
	private String calculateBmiCategory(double input)
	{
		String category = null;
		//Assign the values according to the input from underweight to obese.
		if(input < 18.5)
			category = "underweight";
		if(input >= 18.5 && input <= 24.9)
			category = "normal weight";
		if(input >= 25 && input <= 29.9)
			category = "overweight";
		if(input >= 30)
			category = "obese";
		//Return the category of the user.
		return category;
	}
	
	public void displayBmi()
	{
		//Simply print out the BMI and classification.
		System.out.println("Your BMI is: " + calculateBmi());
		System.out.println("You are classified as: " + calculateBmiCategory(calculateBmi()));
	}
	
	public double getWeight()
	{
		//Return the weight assigned to BMICalculator.
		return weight;
	}
	
	private void setWeight(double weight)
	{
		//Set the weight to the value in BMICalculator
		this.weight = weight;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	private void setHeight(double height)
	{
		this.height = height;
	}
	
	public double getBmi()
	{
		return bmi;
	}
	
	public String getBmiCategory()
	{
		return bmicategory;
	}
	
	public int getOption()
	{
		//Get the option for whether it is metric or imperial.
		return option;
	}
	
	private void setOption(int option)
	{
		this.option = option;
	}
	
	public static void main(String[] args)
	{
		BMICalculator app = new BMICalculator();
		app.readUserData();
		app.calculateBmi();
		app.displayBmi();
	}

}
