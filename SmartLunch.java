class SmartLunch {
	
public static double search(String foodName) {
double price=0.0;
if (foodName == "Grilled cheese sandwich") {
 price=100;
}
else if (foodName == "Chikken stir-fry") {
 price=80;
}
else if (foodName == "Vaggie omelet") {
 price=30;
}
else if (foodName == "Shrimp scampi") {
 price=70;
}
else if (foodName == "Fish tacos") {
 price=250;
}
else if (foodName == "Chicken fafitas") {
 price=190;
}
else if (foodName == "BBQ chicken drumstik") {
 price=280;
}
else if (foodName == "Beef gyro") {
 price=100;
}
else if (foodName == "Bean burger") {
 price=120;
}
else if (foodName == "Cheese n Corn") {
 price=100;
}
else if (foodName == "Paneer Makhani") {
 price=148;
}
else if (foodName == "Thandoori paneer") {
 price=170;
}
else if (foodName == "Fish fillets") {
 price=399;
}
else if (foodName == "Meatloaf") {
 price=65;
}
else if (foodName=="Shirmp tacos") {
 price=220;
}
else if (foodName == "Thai green curry") {
 price=110;
}
else if (foodName == "Turkey chilli") {
 price=140;
 }
else if (foodName == "BBQ ribs") {
 price=120;
}
else if (foodName == "Zucchini pasta") {
 price=160;
}
else if (foodName == "Shirmp") {
 price=220;
}
else if (foodName == "Stuffed shells") {
 price=180;
}
else if (foodName == "Zesty Paneer") {
 price=180;
}
else if (foodName == "Veggie quesadilla") {
 price=175;
}
else if (foodName == "Ramen bowls") {
 price=200;
}
else if (foodName == "Zucchini pasta") {
 price=165;
}
else if (foodName == "Cheesecake Jar") {
 price=40;
}
else if (foodName == "Chikken tikka") {
 price=200;
}
else if (foodName == "Jambalaya") {
 price=45;
}
else if (foodName == "Pot pie") {
 price=45;
}
else if (foodName == "Sandwich") {
 price=70;
}
else 
System.out.println(foodName+ "Food name is found");

return price;

}
public static	double	search(String foodName , int quantity){
	
	double price=0.0;
if (foodName == "Grilled cheese sandwich") {
 price=100*quantity;
 return price;
}
else if (foodName == "Chikken stir-fry") {
 price=80*quantity;
}
else if (foodName == "Vaggie omelet") {
 price=30*quantity;
}
else if (foodName == "Shrimp scampi") {
 price=70*quantity;
}
else if (foodName == "Fish tacos") {
 price=250*quantity;
}
else if (foodName == "Chicken fafitas") {
 price=190*quantity;
}
else if (foodName == "BBQ chicken drumstik") {
 price=280*quantity;
}
else if (foodName == "Beef gyro") {
 price=100*quantity;
}
else if (foodName == "Bean burger") {
 price=120*quantity;
}
else if (foodName == "Cheese n Corn") {
 price=100*quantity;
}
else if (foodName == "Paneer Makhani") {
 price=14*quantity;
}
else if (foodName == "Thandoori paneer") {
 price=170*quantity;
}
else if (foodName == "Fish fillets") {
 price=399*quantity;
}
else if (foodName == "Meatloaf") {
 price=65*quantity;
}
else if (foodName=="Shirmp tacos") {
 price=220*quantity;
}
else if (foodName == "Thai green curry") {
 price=110*quantity;
}
else if (foodName == "Turkey chilli") {
 price=140*quantity;
 }
else if (foodName == "BBQ ribs") {
 price=120*quantity;
}
else if (foodName == "Zucchini pasta") {
 price=160*quantity;
}
else if (foodName == "Shirmp") {
 price=220*quantity;
}
else if (foodName == "Stuffed shells") {
 price=180*quantity;
}
else if (foodName == "Zesty Paneer") {
 price=180*quantity;
}
else if (foodName == "Veggie quesadilla") {
 price=175*quantity;
}
else if (foodName == "Ramen bowls") {
 price=200*quantity;
}
else if (foodName == "Zucchini pasta") {
 price=165*quantity;
}
else if (foodName == "Cheesecake Jar") {
 price=40*quantity;
}
else if (foodName == "Chikken tikka") {
 price=200*quantity;
}
else if (foodName == "Jambalaya") {
 price=45*quantity;
}
else if (foodName == "Pot pie") {
 price=45*quantity;
}
else if (foodName == "Sandwich") {
 price=70*quantity;
}
else 
System.out.println(foodName+ "Food name is found");

return price;

}
}