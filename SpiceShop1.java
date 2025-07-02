
class SpiceShop1 {
    public static void main(String spice[]) {
        String spices[] = {"Turmeric", "Coriander","Cumin","Mustard Seeds","Red Chili Powder","Garam Masala","Black Pepper","Cardamom","Cloves","Fenugreek","Jeera","Dalchini","Elachi","Dry capsicum"};

        System.out.println("The number of spices: " + spices.length);
       // System.out.println(spices[0]+" "+spices[1] +" "+ spices[2] +" "+spices[3]+" "+ spices[4] +" "+ spices[5] + " " +spices[6]+" "+spices[7]+" "+spices[8]+" " +spices[9]+" "+spices[10]+" "+spices[11]+" "+spices[12]+" "+spices[13]);
		for(String taste:spices){
			System.out.println(taste);
		}
	}
	
}
