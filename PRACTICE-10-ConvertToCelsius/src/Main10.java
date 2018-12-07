import java.util.Scanner;
 
class Main10 {
  public static void main(String[] args) {
	double solution;
    Scanner in = new Scanner(System.in);
 
    System.out.print("Enter temperature in Fahrenheit ");
    double temperature = in.nextInt();
 
    solution = ((temperature - 32)*5)/9;
 
    System.out.println("Temperature in Celsius = " + solution);
    
    in.close();
  }
}