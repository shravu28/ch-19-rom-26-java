class Zomoto {
public static double search(String foodName) {
double price=0.0;
if (foodName == "Chikken Biryani") {
 price=80;
}
else if (foodName == "Chikken Kabab") {
 price=65;
}
else if (foodName == "Chikken Ghee rost") {
 price=70;
}
else if (foodName == "Motton Chops") {
 price=40;
}
else if (foodName == "Motton Kabab") {
 price=65;
}
else if (foodName == "Mushroom Biryani") {
 price=75;
}
else if (foodName == "Egg Masala") {
 price=50;
}
else if (foodName == "Panner Tikka Masala") {
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
else if (foodName == "Kaal Soup") {
 price=170;
}
else if (foodName == "Paneer Butter Masala") {
 price=199;
}
else if (foodName == "Aloo Paratha") {
 price=65;
}
else if (foodName == "Roti Curry") {
 price=220;
}
else if (foodName == "Curd rice") {
 price=110;
}
else if (foodName == "Kulcha Curry") {
 price=140;
 }
else if (foodName == "Naan Curry") {
 price=120;
}
else if (foodName == "Channa Bhatura") {
 price=160;
}
else if (foodName == "Veg Dum Biriyani") {
 price=220;
}
else if (foodName == "Paneer Tikka") {
 price=180;
}
else if (foodName == "Paneer Lassoni") {
 price=180;
}
else if (foodName == "Veg Kadhai") {
 price=175;
}
else if (foodName == "Paneer Tikka Masala") {
 price=200;
}
else if (foodName == "Keema Fry") {
 price=165;
}
else if (foodName == "Mutton Liver") {
 price=40;
}
else if (foodName == "Paneer Tikka Masala") {
 price=200;
}
else if (foodName == "Vada") {
 price=45;
}
else if (foodName == "Egg Boti fry") {
 price=45;
}
else if (foodName == "Akki Roti") {
 price=70;
}
else 
System.out.println(foodName+ "Food name is found");

return price;
}
public static	double	search(String foodName , int quantity){
	double price=0.0;
if (foodName == "Chikken Biryani") {
 price=80*quantity;
 return price;
}
else if (foodName == "Chikken Kabab") {
 price=65*quantity;
}
else if (foodName == "Chikken Ghee rost") {
 price=70*quantity;
}
else if (foodName == "Motton Chops") {
 price=40*quantity;
}
else if (foodName == "Motton Kabab") {
 price=65*quantity;
}
else if (foodName == "Mushroom Biryani") {
 price=75*quantity;
}
else if (foodName == "Egg Masala") {
 price=50*quantity;
}
else if (foodName == "Panner Tikka Masala") {
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
else if (foodName == "Kaal Soup") {
 price=170*quantity;
}
else if (foodName == "Paneer Butter Masala") {
 price=199*quantity;
}
else if (foodName == "Aloo Paratha") {
 price=65*quantity;
}
else if (foodName == "Roti Curry") {
 price=220*quantity;
}
else if (foodName == "Curd rice") {
 price=110*quantity;
}
else if (foodName == "Kulcha Curry") {
 price=140*quantity;
 }
else if (foodName == "Naan Curry") {
 price=120*quantity;
}
else if (foodName == "Channa Bhatura") {
 price=160*quantity;
}
else if (foodName == "Veg Dum Biriyani") {
 price=220*quantity;
}
else if (foodName == "Paneer Tikka") {
 price=180*quantity;
}
else if (foodName == "Paneer Lassoni") {
 price=180*quantity;
}
else if (foodName == "Veg Kadhai") {
 price=175*quantity;
}
else if (foodName == "Paneer Tikka Masala") {
 price=200*quantity;
}
else if (foodName == "Keema Fry") {
 price=165*quantity;
}
else if (foodName == "Mutton Liver") {
 price=40*quantity;
}
else if (foodName == "Paneer Tikka Masala") {
 price=200*quantity;
}
else if (foodName == "Vada") {
 price=45*quantity;
}
else if (foodName == "Egg Boti fry") {
 price=45*quantity;
}
else if (foodName == "Akki Roti") {
 price=70*quantity;
}
else 
System.out.println(foodName+ "Food name is found");

return price;

}
}