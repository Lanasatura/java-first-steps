enum Tools {
	SCREWDRIVER, WRENCH, HAMMER, PLIERS
}


class ExcTools {	
	public static void main(String args[]) {
		for(Tools t: Tools.values())
			System.out.println(t);
		
	}
}