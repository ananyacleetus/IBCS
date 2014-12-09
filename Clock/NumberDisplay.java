/**
*@author Ananya Cleetus
*@version 2014.11.24
 **/



public class NumberDisplay{

	private int value;
	private int limit;


public NumberDisplay (int val, int lim){
	value = val;
	limit = lim;
}


public int getValue(){
	return value;
}


public void setValue(int v){
value = v;
}

public void increment(){
	if (value+1 > limit){
		value = 0;
	}

	else {
		value = value +1;
	}


}

public String getDisplayValue(){
	if (value >= 10){
		return "" + value;
	}

	else{
		return "0" + value;
	}

}

}