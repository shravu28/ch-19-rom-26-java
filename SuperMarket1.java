
class SuperMarket1{
 static String iceCreams[]={"Aruns","DailyDay","Nandini","Amul","Kwality wall","Mother Dairy","Vadilal","CreamBell","Hawer","Naturals"};
 static String perfumes[]={"Fogg","Nude Luxury","Ajmal","Kelvin","Guess","DavidOff","Gucci","Denver","versecase","engage"};
 static String groceries[]={"Atta","Rice","Ragi","Barley","Kelocs","Cereals","Cookies","DryFruits","Nuts","Seeds"};
 static String cosmatics[]={"Primer","Toner","Foundation","Eyeliner","lipstics","Cream","Nail Polish","lip glosses","Blush","Blender"};
 
 public static void main(String args[]){
 System.out.println("The number of ice cream brands "+iceCreams.length);
 
 
 
 /*System.out.println(iceCreams[0]+""+iceCreams[1]+" "+iceCreams[2]+" "+iceCreams[3]+" "+iceCreams[4]+" "+iceCreams[5]+" "+iceCreams[6]+" "+iceCreams[7]+" "+iceCreams[8]+iceCreams[9]);
 System.out.println(perfumes[0]+" "+perfumes[1]+" "+perfumes[2]+" "+perfumes[3]+" "+iceCreams[5]+" "+perfumes[6]+" "+perfumes[7]+" "+perfumes[8]+" "+perfumes[9]);
 System.out.println(groceries[0]+" "+groceries[1]+" "+groceries[2]+" "+groceries[3]+" "+groceries[4]+" "+groceries[5]+" "+groceries[6]+" "+groceries[7]+" "+groceries[8]+" "+groceries[9]);
 System.out.println(cosmatics[0]+" "+cosmatics[1]+" "+cosmatics[2]+" "+cosmatics[3]+" "+cosmatics[4]+" "+cosmatics[5]+" "+cosmatics[6]+" "+cosmatics[7]+" "+cosmatics[8]+" "+cosmatics[9]);*/
 for(String iceCream:iceCreams){
	 System.out.println(iceCream);
 }
 System.out.println("The number perfume brands "+perfumes.length);
 for(String perfume:perfumes){
	 System.out.println(perfume);
 }
 System.out.println("The number of groceries "+groceries.length);
 for(String grocery:groceries){
	 System.out.println(grocery);
 System.out.println("The number of cosmatics "+cosmatics.length);
	 for(String cosmatic:cosmatics){
		 System.out.println(cosmatic);
	 }
 }
 
 }
 
 
}
 
