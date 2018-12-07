import java.util.Scanner;

public class Main12 {

	public static void main(String[] args) {
		int number = 5;
		Scanner Newscanner = new Scanner(System.in);
		
		int number2 = Newscanner.nextInt();
		for (int i = 0; i < number; i++) {
		    int x = 1;
		    for (int j = 0; j < (number + i); j++) {
		        if (j < number - i - 1) {
		            System.out.print(" ");
		        } else {
		            System.out.print(x);
		            if (j < (number - 1)) {
		                x++;
		            } else {
		                x--;
		            }  
		        }
		    }
		    System.out.println(" ");
		}

	}

}
