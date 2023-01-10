import java.util.Scanner;

public class weeklyexcercises_1001_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter length of triangle base (+ve odd between 1 and 99");
		int base = scanner.nextInt();
		
		System.out.println("Enter a character");
		String characterString = scanner.next();
		char ch = characterString.charAt(0);
		
		int rows = (base/2)+1, k = 0;

	    for (int i = 1; i <= rows; ++i, k = 0) {
	    	
	      for (int space = 1; space <= rows - i; ++space) {
	    	  
	        System.out.print("  ");
	        
	      }

	      while (k != 2 * i - 1) {
	    	  
	        System.out.print(ch + " ");
	        
	        ++k;
	        
	      }

	      System.out.println();
	      
	    }
	    
	    scanner.close();
		
	}

}

//System.out.print("XXX\n".repeat(4));

/*4. Write a Java program to input an odd number between 1 and 99 followed by a single character. 
The program should output a triangle shape with a base length equal to the number provided by the 
used and constructed from the supplied character.  
  
The input and output should look like the following:  
  
Enter length of triangle base (+ve odd between 1 and 99) : 15  
Enter a character :$  
  
       $  
      $$$  
     $$$$$  
    $$$$$$$  
   $$$$$$$$$  
  $$$$$$$$$$$  
 $$$$$$$$$$$$$  
$$$$$$$$$$$$$$$  

*/