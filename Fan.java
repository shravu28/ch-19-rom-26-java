class Fan {
static boolean isConnected;
static int currentSpeed;
static int maxSpeed = 8;
static int minSpeed = 4;
//onOrOff
//increaseSpeed
//decreaseSpeed
public static void onOrOff(){
if(false==false){
isConnected = true;
System.out.println("Fan is turned on");
}
else if(isConnected==true)
{
isConnected=false;
System.out.println("Fan is turned off");
}
}
//increase speed
public static void increaseSpeed() {
System.out.println("Increse speed started");
if(isConnected==true) {
	if(currentSpeed <= maxSpeed){
	currentSpeed=currentSpeed + 1;
	
System.out.println("The current speed is" +currentSpeed);
	}else{
	System.out.println("Max speed reached");
}	

}else{
	System.out.println("Turn on the Fan ");
}
System.out.println("increase speed is ended");	
	}


//decrease speed
public static void decreaseSpeed() {
	System.out.println("Decrease speed started");
if(isConnected==true) {
	if(currentSpeed >= minSpeed){
	currentSpeed=currentSpeed - 1;
System.out.println("The current speed is" +currentSpeed);
	}
	else {
	System.out.println("Min speed reached");
}
}else{
	System.out.println("Turn on the Fan");
	
}
System.out.println("decrease speed is ended");	

}	
}