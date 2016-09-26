import java.util.Scanner;
public class Quiz2 {

	public static void main(String args[]){
	
	int initial_tuition;
	double increased_percentage;
	double total_tuition = 0;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("the initial tuition is:");
	initial_tuition = input.nextInt();
	System.out.print("the increased rate is:");
	increased_percentage = input.nextDouble();
	
	for(int i = 0; i < 4; i++){
		total_tuition += initial_tuition * Math.pow(increased_percentage + 1,i);
	}
	System.out.printf("the total tuition is: %.2f", (total_tuition));
}
}