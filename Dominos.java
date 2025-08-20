class Dominos {
	
public static double search(String foodName) {
double price=0.0;
if (foodName == "Haldiram's Dal Makhani") {
 price=200;
}
else if (foodName == "Veg Loaded") {
 price=65;
}
else if (foodName == "acheesy Pizza") {
 price=70;
}
else if (foodName == "Veg Spicy Pizza") {
 price=40;
}
else if (foodName == "Veg Herby Pizza") {
 price=65;
}
else if (foodName == "Onion Pizza") {
 price=75;
}
else if (foodName == "Farmhouse Pizza") {
 price=50;
}
else if (foodName == "Peppy paneer") {
 price=100;
}
else if (foodName == "Vaggie Paradise") {
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
else if (foodName == "Paneer Butter Masala") {
 price=199;
}
else if (foodName == "Aloo Paratha") {
 price=65;
}
else if (foodName == "Veggie Pizza") {
 price=220;
}
else if (foodName == "Egg Puff") {
 price=110;
}
else if (foodName == "Golden corn") {
 price=140;
 }
else if (foodName == "Capsicum Pizza") {
 price=120;
}
else if (foodName == "Channa Bhatura") {
 price=160;
}
else if (foodName == "Garlic Pizza") {
 price=220;
}
else if (foodName == "Chocolate Cake") {
 price=180;
}
else if (foodName == "Zesty Paneer") {
 price=180;
}
else if (foodName == "Cream Roll") {
 price=175;
}
else if (foodName == "Mushroom Pizza") {
 price=200;
}
else if (foodName == "Pineapple Pastry") {
 price=165;
}
else if (foodName == "Cheesecake Jar") {
 price=40;
}
else if (foodName == "Brownie Pack") {
 price=200;
}
else if (foodName == "Olive Delight") {
 price=45;
}
else if (foodName == "Yummy Pizza") {
 price=45;
}
else if (foodName == "Chikken Golden Delight") {
 price=70;
}
else 
System.out.println(foodName+ "Food name is found");

return price;
}
public static	double	search(String foodName , int quantity){
		
		 double price = 0.0;
		 
if (foodName == "Haldiram's Dal Makhani") {
 price=200*quantity;
 return price;
 
}
else if (foodName == "Veg Loaded") {
 price=65*quantity;
}
else if (foodName == "acheesy Pizza") {
 price=70*quantity;
}
else if (foodName == "Veg Spicy Pizza") {
 price=40*quantity;
}
else if (foodName == "Veg Herby Pizza") {
 price=65*quantity;
}
else if (foodName == "Onion Pizza") {
 price=75*quantity;
}
else if (foodName == "Farmhouse Pizza") {
 price=50*quantity;
}
else if (foodName == "Peppy paneer") {
 price=100*quantity;
}
else if (foodName == "Vaggie Paradise") {
 price=120*quantity;
}
else if (foodName == "Cheese n Corn") {
 price=100*quantity;
}
else if (foodName == "Paneer Makhani") {
 price=148*quantity;
}
else if (foodName == "Thandoori paneer") {
 price=170*quantity;
}
else if (foodName == "Paneer Butter Masala") {
 price=199*quantity;
}
else if (foodName == "Aloo Paratha") {
 price=65*quantity;
}
else if (foodName == "Veggie Pizza") {
 price=220*quantity;
}
else if (foodName == "Egg Puff") {
 price=110*quantity;
}
else if (foodName == "Golden corn") {
 price=140*quantity;
 }
else if (foodName == "Capsicum Pizza") {
 price=120*quantity;
}
else if (foodName == "Channa Bhatura") {
 price=160*quantity;
}
else if (foodName == "Garlic Pizza") {
 price=220*quantity;
}
else if (foodName == "Chocolate Cake") {
 price=180*quantity;
}
else if (foodName == "Zesty Paneer") {
 price=180*quantity;
}
else if (foodName == "Cream Roll") {
 price=175*quantity;
}
else if (foodName == "Mushroom Pizza") {
 price=200*quantity;
}
else if (foodName == "Pineapple Pastry") {
 price=165*quantity;
}
else if (foodName == "Cheesecake Jar") {
 price=40*quantity;
}
else if (foodName == "Brownie Pack") {
 price=200*quantity;
}
else if (foodName == "Olive Delight") {
 price=45*quantity;
}
else if (foodName == "Yummy Pizza") {
 price=45*quantity;
}
else if (foodName == "Chikken Golden Delight") {
 price=70*quantity;
}
else 
System.out.println(foodName+ "Food name is found");

return price;
		 
}
}