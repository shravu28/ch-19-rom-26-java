class Bar{

/*static String vodka="Vodka";
static String gin="Gin";
static String baijiu="Baijiu";
static String shochu="Shochu";
static String soju="Soju";
static String rum="Rum";
static String  alcoholNames[]={"vodka","gin","baijiu","shochu","soju","rum"};*/



public static void main (String []args){
System.out.println("main started");
 String vodka="Vodka";
 String gin="Gin";
 String baijiu="Baijiu";
 String shochu="Shochu";
 String soju="Soju";
 String rum="Rum";
 String  alcoholNames[]={"vodka","gin","baijiu","shochu","soju","rum"};

//System.out.println("The no of alcoholNames are"+alcoholNames.length);
//System.out.println(alcoholNames[0]+" "+alcoholNames[1]+" "+alcoholNames[2]+" "+alcoholNames[3]+" "+alcoholNames[4]+" "+alcoholNames[5]);

for(String alcoholName:alcoholNames){
	System.out.println(alcoholName);
	System.out.println("main ended");
	
}
}
}
