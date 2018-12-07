import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number ");
	    int i = sc.nextInt();
		int count;
		for (count=0; count <= i; count= count + 3) {
			System.out.println(count);
		}
			
		sc.close();	
		}
		
			

	}

