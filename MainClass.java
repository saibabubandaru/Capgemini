package SqlAssignment;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner runner=new Runner();
		
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter input:");
		

		System.out.println(runner.getByUserid(ss.nextInt()));
       

	}

}