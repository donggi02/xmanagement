package xmanage;
import java.util.*;
public class Food_Manager 
{
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