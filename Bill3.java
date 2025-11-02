public class Bill3 {
	public static void main(String[] args) {

	    String name1 = args[0];
	     String name2 = args[1];
	    String name3 = args[2];
		int number = Integer.parseInt(args[3]);
		double finalnumber = Math.ceil(number / 3.0);

		System.out.println ("Dear " + name3 + ", " + name2 + "," + " and " + name1 + ":" 
		+ " pay " + finalnumber + " Shekels each." );

	      
	}
}
