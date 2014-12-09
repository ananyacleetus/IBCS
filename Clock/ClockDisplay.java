/**
*@author Ananya Cleetus
*@version 2014.11.24
 **/

import NumberDisplay.java
 

public class ClockDisplay{

	private NumberDisplay hours;
	private NumberDisplay minutes; 
	private String display;


	public ClockDisplay(int hrs, int mins){
		hours = NumberDisplay(hrs, 24);
		minutes = NumberDisplay(mins, 60);
	}


	public void tickTime(){
		if (minutes.getValue() +1 > 60){
				minutes.setValue(0);
				hours.increment();
		}

		else {
			minutes.increment();
		}

		updateDisplay();
	}

	public void setTime(int hour, int minute){
		hours.setValue(hour);		
		minutes.setValue(minute);
		updateDisplay();

	}

	public String getTime(){
		return display;
	}

	private void updateDisplay(){
		display = "It is now " + hours + ":" + minutes ".";
	}

}