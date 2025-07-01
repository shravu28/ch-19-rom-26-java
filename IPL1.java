
class IPL1{
	static String teams[]={"RCB","Pune Warriors","CSK","MI","RR","DC","GT","LSG","PK","SH"};
	public static void main(String args[]){
		System.out.println("The number of teams in the IPL"+teams.length);
		//System.out.println(teams[0]+" "+teams[1]+" "+teams[3]+" "+teams[4]+" "+teams[5]+" "+teams[6]+" "+teams[7]+" "+teams[8]+" "+teams[9]);
		for(String team:teams){
			System.out.println(team);
		}
			
	}
}
