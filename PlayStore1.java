
class PlayStore1 {
    public static void main(String args[]) {
        String appNames[] = {"WhatsApp","Instagram","Facebook","Snapchat","Spotify","YouTube","GoogleMaps","Zomato","Swiggy","Amazon"};
        System.out.println("The number of apps: " + appNames.length);
        //System.out.println(appNames[0]+ " "+appNames[1]+" "+appNames[2]+" "+appNames[3]+" "+appNames[4]+" "+appNames[5]+" "+appNames[6]+" "+appNames[7]+" "+appNames[8]+" "+appNames[9]);
		for(String appName:appNames){
			System.out.println(appName);
		}
	}
}
