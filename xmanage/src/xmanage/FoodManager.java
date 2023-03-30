package xmanage;
import java.util.*;

public class FoodManager 
{
	public static void main(String args[])
	{
		int i = 0;
		Scanner input = new Scanner(System.in);
		
		while(i != 6)
		{
			System.out.println("Food Management System");
			System.out.println("1. Add Food");
			System.out.println("2. Delete Food");
			System.out.println("3. Edit Food");
			System.out.println("4. View Food");
			System.out.println("5. Show Foods");
			System.out.println("6. Exit");
			System.out.println("Select one number in one to six");
			
			i = input.nextInt();
			input.nextLine();
			System.out.println(" ");
			
			switch(i) 
			{
			case 1:
				System.out.println("음식 이름을 적어주세요 : ");
				String name = input.nextLine();
				System.out.println("한식 일식 양식 중식 중에 선택해주세요:");
				String type = input.nextLine();
				System.out.println("음식의 맵기를 설명해주세요");
				String spiciness = input.nextLine();
				break;
			
			case 2:
				System.out.println("음식 이름을 적어주세요 : ");
				String name_del = input.nextLine();
				System.out.println(" ");
				break;
			case 3:
				System.out.println("음식 이름을 적어주세요 : ");
				String name_edit = input.nextLine();
				System.out.println("");
				break;
			case 4:
				System.out.println("음식 이름을 적어주세요 : ");
				String name_view = input.nextLine();
				System.out.println("");
				break;
			case 5:
				break;
			}
		
		}
		System.out.println("End");
	}
	public static void addFood()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("이름을 입력하시오: ");
		String name = input.nextLine();
		System.out.println("음식 종류를 입력하시오: ");
		String tpye = input.nextLine();
		System.out.println("맵기 정도를 입력하시오: ");
		String spicness = input.nextLine();
		System.out.println("");
	}
	public static void deleteFood()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("이름을 입력하시오: ");
		String name = input.nextLine();
	}
	public static void editFood()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("이름을 입력하시오: ");
		String name = input.nextLine();
	}
	public static void viewFood()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("이름을 입력하시오: ");
		String name = input.nextLine();
	}
	public static void ShowMenu()
	{
		
	}

}
