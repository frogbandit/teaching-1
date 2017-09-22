/**
 * Welcome to our Balloon class!
 * @Author Ethan Adams + 1004
 * @Version 1.0
 */

public class Balloon
{

	private double myVolume;
	private String myColor;

	// What data do we need to store?
	// For each method, what paramaters does it accept,
	// and what parameters does it return?
	// Is it an accessor or a mutator?
	public Balloon(double volume, String color)
	{
		myVolume = volume;
		myColor = color;
	}

	public void multiplyVolumeByFive(){
		myVolume = myVolume * 5;
	}

	// add return types and arguments
	public double getSurfaceArea()
	{
		double radius = getRadius();
		double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
		return surfaceArea;
	}

	// add return types and arguments
	public double getRadius()
	{
		double radius = Math.cbrt(myVolume / ((4 * Math.PI) / 3));
		return radius;
	}

	// add return types and arguments
	public void addAir(double amt)
	{
		myVolume = myVolume + amt;	
	}

	// add return types and arguments
	public double getVolume()
	{
		return myVolume;
	}
}

