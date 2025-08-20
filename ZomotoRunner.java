class ZomotoRunner {

public static void main(String []meals) {
String food="Naan Curry";
double foods =Zomoto.search(food);
System.out.println("the price is "+foods);
int quantity = 3;
double pricewithQuantity = Zomoto.search(food,quantity);
System.out.println("the food bought"+food +"the price for"+quantity+"is"+pricewithQuantity);
}
}





























