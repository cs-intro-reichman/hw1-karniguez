// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {

	public static void main(String[] args) {
		// Replace this comment with your code
		
		int number = Integer.parseInt(args[0]);
		int x = (int) (Math.random () * number);
		int y = (int) (Math.random () * number);
		int z = (int) (Math.random () * number);

		int max = Math.max(x , Math.max( y , z));
		int min = Math.min(x , Math.min(y , z));
		int tot = x + y + z;
		int mid = (tot) - min - max;
		
		System.out.println(x + " " + y + " " + z);
		System.out.println(max + " " + mid + " " + min);


	} 
}
