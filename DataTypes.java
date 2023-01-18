import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); 
		  System.out.print("Enter an integer followed by a double:"); 
		  int iNum = input.nextInt(); 
		  double dNum = input.nextDouble(); 
		   
		  System.out.println("Integer:"+iNum+" Double:"+dNum); 
		  input.close(); 

	}

}
