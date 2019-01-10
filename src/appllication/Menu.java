package appllication;

import java.util.Scanner;

public class Menu {
	
	private Scanner scanner = new Scanner(System.in);
	
	public void start() {
		String selection = "";
		
		do {
			printMenu();
			selection = scanner.nextLine();
			
			if(selection.equals("1")) {
				// do something
			} else if (selection.equals("")) {
				//do somthing
			} else if (selection.equals("")) {
				//do somthing
			} else if (selection.equals("")) {
				//do somthing
			} else if (selection.equals("")) {
				//do somthing
			} else if (selection.equals("")) {
				//do somthing
			} else if (selection.equals("")) {
				//do somthing
			}
			
			System.out.println("Press enter to continue");
		} while (!selection.equals("-1"));
	}
}
