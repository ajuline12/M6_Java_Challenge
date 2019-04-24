import java.util.Scanner;
public class ReverseTriangle {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer you want to print the reverse triangle of:");
		int input = scan.nextInt();
	    String output = "";
	    for(int i = input; i >0; i--) {
		// tokensNeeded tells us how many '-' symbols to print
	    	int tokensNeeded = input - i;
			// concat this row's '-'s 
	    	while(tokensNeeded > 0) {
	    		output += "-";
	    		tokensNeeded--;
	    		
	    	}
		// concat the actual numbers for this row
	    	for(int x = 1; x <= i; x++) {
	    		output += x;
	    		
	    	}
			
	    	System.out.println(output);
		//reset output string for next row 
    		output = "";
	    	
	    	
	    }
		
		
	}

}
