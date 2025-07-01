class SuperMarkets{

static String iceCreams[]={"cookies","mint chocolate","gelato","kulfi","sherbet","ice popsicle","sorbet","frozen yogurt","philadelphia","soft serve"};
static String Perfumes[]={"paco rabanne","forest essentials","plum","bella vita organic","carlton london","yves saint laurent","rihanah","skinn","prada","kavali"};
static String Groceries[]={"bread","milk","eggs","butter","tomatoes","yogurt","chickpea","ham","honey","salt"};
static String Cosmetics[]={"primer","toner","fondation","eyeliner","lipsticks","brushes","mirror","cleanser","bronzer","lip liner"};

// one or more ref


public static void main (String SuperMarket[]){

System.out.println(iceCreams[0]+" "+iceCreams[1]+" "+iceCreams[2]+" "+iceCreams[3]+" "+iceCreams[4]+" "+iceCreams[5]+" "+iceCreams[6]+" "+iceCreams[7]+" "+iceCreams[8]+" "+iceCreams[9]);
System.out.println("Available iceCreams are "+ iceCreams.length);
System.out.println(Perfumes[0]+" "+Perfumes[1]+" "+Perfumes[2]+" "+Perfumes[3]+" "+Perfumes[4]+" "+Perfumes[5]+" "+Perfumes[6]+" "+Perfumes[7]+" "+Perfumes[8]+" "+Perfumes[9]);
System.out.println("Available Perfumes  are "+ Perfumes.length);
System.out.println(Groceries[0]+" "+Groceries[1]+" "+Groceries[2]+" "+Groceries[3]+" "+Groceries[4]+" "+Groceries[5]+" "+Groceries[6]+" "+Groceries[7]+" "+Groceries[8]+" "+Groceries[9]);
System.out.println("Available Groceries are "+ Groceries.length);
System.out.println(Cosmetics[0]+" "+Cosmetics[1]+" "+Cosmetics[2]+" "+Cosmetics[3]+" "+Cosmetics[4]+" "+Cosmetics[5]+" "+Cosmetics[6]+" "+Cosmetics[7]+" "+Cosmetics[8]+" "+Cosmetics[9]);
System.out.println("Available Cosmetics are "+ Cosmetics.length);

}
}