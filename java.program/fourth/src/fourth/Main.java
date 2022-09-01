package fourth;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("what is your name? ");
		String name = scanner.nextLine();
		
		System.out.println("how old are u? ");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("+name" +"age");
		
	}
}
