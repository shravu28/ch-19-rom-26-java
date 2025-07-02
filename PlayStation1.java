
class PlayStation1 {
    public static void main(String args[]) {
         String games[] = {"KhoKho", "Kabaddi", "GilliDanda", "Kancha", "Lagori", "KithKith", "Pittu", "VishAmrit", "ChorPolice", "Antakshari"};
		 
        System.out.println("The number of games" + games.length);
        //System.out.println(games[0]+" "+games[1]+" "+games[2]+" "+games[3]+" "+games[4]+" "+games[5]+" "+games[6]+" "+games[7]+" "+games[8]+" "+games[9]);
		for(String game:games){
			System.out.println(game);
		}
	}
}
