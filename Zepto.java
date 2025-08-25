class Zepto {
	
public static double search(String foodName) {
double price=0.0;
if (foodName == "Haldiram's Dal Makhani") {
 price=200; 
}
else if (foodName == "Gits Upma") {
 price=65;
}
else if (foodName == "Veg Biryani") {
 price=70;
}
else if (foodName == "MTR Pongal") {
 price=40;
}
else if (foodName == "Masala Rice") {
 price=65;
}
else if (foodName == "Yippee Noodles") {
 price=75;
}
else if (foodName == "Ramen Cury") {
 price=50;
}
else if (foodName == "Kadhi Paneer") {
 price=100;
}
else if (foodName == "Plain Soup") {
 price=120;
}
else if (foodName == "Thali") {
 price=100;
}
else if (foodName == "Chikken Lolipop") {
 price=148;
}
else if (foodName == "Schezwan Noodles") {
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
else if (foodName == "vEG rOLL") {
 price=140;
 }
else if (foodName == "Naan Curry") {
 price=120;
}
else if (foodName == "Channa Bhatura") {
 price=160;
}
else if (foodName == "Cake Slice") {
 price=220;
}
else if (foodName == "Chocolate Cake") {
 price=180;
}
else if (foodName == "Cup Cake") {
 price=180;
}
else if (foodName == "Cream Roll") {
 price=175;
}
else if (foodName == "Lays") {
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
else if (foodName == "Vada") {
 price=45;
}
else if (foodName == "Yumm Chips") {
 price=45;
}
else if (foodName == "Moong Dal") {
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
else if (foodName == "Gits Upma") {
 price=65*quantity;
}
else if (foodName == "Veg Biryani") {
 price=70*quantity;
}
else if (foodName == "MTR Pongal") {
 price=40*quantity;
}
else if (foodName == "Masala Rice") {
 price=65*quantity;
}
else if (foodName == "Yippee Noodles") {
 price=75*quantity;
}
else if (foodName == "Ramen Cury") {
 price=50*quantity;
}
else if (foodName == "Kadhi Paneer") {
 price=100*quantity;
}
else if (foodName == "Plain Soup") {
 price=120*quantity;
}
else if (foodName == "Thali") {
 price=100*quantity;
}
else if (foodName == "Chikken Lolipop") {
 price=148*quantity;
}
else if (foodName == "Schezwan Noodles") {
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
else if (foodName == "vEG rOLL") {
 price=140*quantity;
 }
else if (foodName == "Naan Curry") {
 price=120*quantity;
}
else if (foodName == "Channa Bhatura") {
 price=160*quantity;
}
else if (foodName == "Cake Slice") {
 price=220*quantity;
}
else if (foodName == "Chocolate Cake") {
 price=180*quantity;
}
else if (foodName == "Cup Cake") {
 price=180*quantity;
}
else if (foodName == "Cream Roll") {
 price=175*quantity;
}
else if (foodName == "Lays") {
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
else if (foodName == "Vada") {
 price=45*quantity;
}
else if (foodName == "Yumm Chips") {
 price=45*quantity;
}
else if (foodName == "Moong Dal") {
 price=70*quantity;
}
else 
System.out.println(foodName+ "Food name is found");

return price;
}
}