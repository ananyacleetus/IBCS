/**
 * A class that maintains information on a heater.
 *
 * @author Ananya
 * @version 11-17-14
 */
class Heater
{

	//the fields 
	private int temperature;
	private int increment; 
	private int max;
	private int min;



	public Heater(int minimum, int maximum){
		temperature = 15;
		min = minimum;
		max = maximum;
		increment = 5;
	}

	public void warmer(){

		if ((temperature + increment) > max){
			System.out.println("ERROR: Too High");
		}
		else {
			temperature = temperature + increment;
		}
	}

	public void cooler(){
		if ((temperature - increment) < min){
			System.out.println("ERROR: Too Low");
		}
		else {
			temperature = temperature - increment;
		}
	}
/**
*    (precondition: increment must be positive)
*
**/
	public void setIncrement(int inc){
		if (inc <0){	
			System.out.println("ERROR: Increment must be positive");
		}
		else{

			increment = inc;

		}
	}

	public int getTemperature(){
		return temperature;
	}


	public static void main (String[] args) {
	
	Heater h1 = new Heater(2, 90);
	System.out.println(h1.getTemperature());
	h1.warmer();
	System.out.println(h1.getTemperature());
	h1.cooler();
	System.out.println(h1.getTemperature());
	h1.setIncrement(-9);
	h1.setIncrement(100);
	h1.warmer();
	System.out.println(h1.getTemperature());	
	h1.cooler();
	System.out.println(h1.getTemperature());


	}

}