package xmanage;
import java.util.ArrayList;
import java.util.Scanner;

public class OrganizeManagement {
	Organizing org = new Organizing();
	Scanner input = new Scanner(System.in);

	OrganizeManagement()
	{
		
	}
	
	public void addFood()
	{
		System.out.println("이름을 입력하시오: ");
		org.name.add(input.nextLine());
		System.out.println("음식 종류를 입력하시오: ");
		org.type.add(input.nextLine());
		System.out.println("맵기 정도를 입력하시오: ");
		org.spicness.add(input.nextLine());
		System.out.println("");
		org.count++;
		
	}
	public void deleteFood()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("몇 번째 음식을 삭제 하시겠습니까?: ");
		int num = input.nextInt();
		if(num < org.count)
		{
			org.name.remove(num);
			org.type.remove(num);
			org.spicness.remove(num);
			org.count --;
			System.out.println("음식이 삭제 되었습니다.");
		}
		else
		{
			System.out.println("음식이 존재하지 않습니다.");
		}
		
	}
	public void editFood()
	{
		System.out.println("몇 번째 음식을 수정하시겠습니까? : ");
		int num = input.nextInt();
		if(num > org.count)
		{
			System.out.println("음식이 존재하지 않습니다. ");
		}
		else
		{
			System.out.println("음식 이름을 입력하시오 : ");
			org.name.add(num, input.nextLine());
			//이 부분 오류
			input.nextLine();
			System.out.print("음식 종류를 입력하시오 : ");
			org.type.add(num, input.nextLine());
			
			System.out.println("음식 맵기 정도를 입력하시오 : ");
			org.spicness.add(num, input.nextLine());
			
			System.out.println("");
		}
		
	}
	public void viewFood()
	{
		org.printInfo();
	}
}
