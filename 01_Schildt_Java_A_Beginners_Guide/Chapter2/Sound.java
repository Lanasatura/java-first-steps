class Sound {
	public static void main(String args[]) {
		double dist_light, dist_echo;
		
		dist_light = 7.2 * 1100;		
		System.out.println("The lightning is " + dist_light + " feet away.");
		
		dist_echo = (7.2 / 2) * 1100;
		System.out.println("The rock is " + dist_echo + " feet away due to my echo.");
	}
}