package xmanage;
import java.util.*;

public class FoodManager 
{
	public static void main(String args[])
	{
		int i = 0;
		Scanner input = new Scanner(System.in);
		OrganizeManagement omm = new OrganizeManagement();
		
		while(i != 5)
		{
			System.out.println("Food Management System");
			System.out.println("1. Add Food");
			System.out.println("2. Delete Food");
			System.out.println("3. Edit Food");
			System.out.println("4. View Food");
			System.out.println("5. Exit");
			System.out.println("Select one number in one to six");
			
			i = input.nextInt();
			input.nextLine();
			System.out.println(" ");
			
			switch(i) 
			{
			case 1:
				omm.addFood();
				break;
			
			case 2:
				omm.deleteFood();
				break;
			case 3:
				omm.editFood();
				break;
			case 4:
				
				omm.viewFood();
				break;
			}
		
		}
		System.out.println("End");
	}



}
