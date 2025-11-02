// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		
		// Replace this comment with your code
		int dollar = Integer.parseInt(args[0]);
		double precent = Double.parseDouble(args[1]) / 100.0;
		int years = Integer.parseInt(args[2]);
		double finalnumber = dollar * Math.pow(1 + precent, years);


		//After 2 years, $100 saved at 10.0% will yield $121

		System.out.println ("After " + years + " years, $" + dollar + " saved at " + (precent * 100) + "% will yield $" 
		+ (int) finalnumber );
	}
}