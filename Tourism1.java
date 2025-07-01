
public class Tourism1{
	static String touristPlaces[]={"Mysore Palace","Lalbagh","kabbanPark","Jog Falls"," Malpe beech","Kuppali","Shringeri","Mysore Zoo","Halebidu","Belur","Shravanabelagola","Hampi","Badami","Aihole","Golbumbaz"};
	public static void main(String args[]){
	System.out.println("The number of Tourist Places "+touristPlaces.length);
	//System.out.println(touristPlaces[0]+" "+touristPlaces[1]+" "+touristPlaces[2]+" "+touristPlaces[3]+" "+touristPlaces[4]+" "+touristPlaces[5]+" "+touristPlaces[6]+" "+touristPlaces[7]+" "+touristPlaces[8]+" "+touristPlaces[9]);
	for(String tour:touristPlaces){
		System.out.println(tour);
	}
	}
}
