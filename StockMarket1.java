
class StockMarket1 {
    public static void main(String args[]) {
        String stockNames[] = {"Reliance", "TCS","Infosys","HDFCBank", "ICICIBank","ITC","BhartiAirtel","HUL","AxisBank","LarsenToubro"};
        System.out.println("The number of stocks " + stockNames.length);
        //System.out.println(stockNames[0] + " " + stockNames[1] + " " + stockNames[2]+" "+ stockNames[3]+" "+stockNames[4] +" "+stockNames[5] + " "+ stockNames[6] + " " + stockNames[7] + " " + stockNames[8] + " " + stockNames[9]);
		for(String stockName:stockNames){
			System.out.println(stockName);
		}
	}
}
