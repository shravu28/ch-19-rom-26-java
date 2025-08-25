class SmartLunchRunner {

public static void main(String []meals) {
String food="Bean burger";
double foods =SmartLunch.search(food);
System.out.println("the price is "+foods);
int quantity = 3;
double pricewithQuantity = SmartLunch.search(food,quantity);
System.out.println("the food bought"+food +"the price for"+quantity+"is"+pricewithQuantity);
}
}

