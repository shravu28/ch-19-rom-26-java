
class PeriodicTable1 {
    public static void main(String args[]) {
        String elements[] = {"Hydrogen","Helium","Lithium","Beryllium","Boron","Carbon","Nitrogen","Oxygen","Fluorine","Neon","Sodium", "Magnesium"};
        System.out.println("The number of elements " + elements.length);
        //System.out.println(elements[0] + " " + elements[1] + " " + elements[2] + " " + elements[3] +" "+ elements[4] +" " +elements[5] +" "+elements[6]+" "+ elements[7]+" " + elements[8]+ " "+elements[9]+" "+elements[10]+" "+elements[11]);
		for(String element:elements){
			System.out.println(element);
		}
	}
}
