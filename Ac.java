class Ac  {
static boolean isConnected;
static int currentTemperature;
static int maxTemperature = 8;
static int minTemperature = 4;
//onOrOff
//increaseTemperature
//decreaseTemperature
public static void onOrOff(){
if(false==false){
isConnected = true;
System.out.println("Ac  is turned on");
}
else if(isConnected==true)
{
isConnected=false;
System.out.println("Ac  is turned off");
}
}
//increase temperature
public static void increaseTemperature() {
System.out.println("Increse temperature started");
if(isConnected==true) {
	if(currentTemperature <= maxTemperature){
	currentTemperature=currentTemperature + 1;
	
System.out.println("The current temperature is" +currentTemperature);
	}else{
	System.out.println("Max temperature reached");
}	

}else{
	System.out.println("Turn on the Ac ");
}
System.out.println("increase temperature is ended");	
	}


//decrease temperature
public static void decreaseTemperature() {
	System.out.println("Decrease temperature started");
if(isConnected==true) {
	if(currentTemperature >= minTemperature){
	currentTemperature=currentTemperature - 1;
System.out.println("The current temperature is" +currentTemperature);
	}
	else {
	System.out.println("Min temperature reached");
}
}else{
	System.out.println("Turn on the Ac");
	
}
System.out.println("decrease temperature is ended");	

}	
}