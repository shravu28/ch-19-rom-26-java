class ZeptoRunner {

public static void main(String []meals) {
String food="Thali";
double foods =Zepto.search(food);
System.out.println("the price is "+foods);
int quantity = 3;
double pricewithQuantity = Zepto.search(food,quantity);
System.out.println("the food bought"+food +"the price for"+quantity+"is"+pricewithQuantity);
}
}















