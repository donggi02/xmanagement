package xmanage;
import java.util.ArrayList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OrganizeManagement implements Serializable{
	private static final long serialVersionUID = -3669365244745928074L;
	ArrayList<CalculusFood> calculusfood = new ArrayList<>();
	transient Scanner input;

	CalculusFood ccf = new CalculusFood();
	OrganizeManagement() {}
	OrganizeManagement(Scanner input) {
	this.input = input;
	}

	public void addFood()
	{
		System.out.println("이름을 입력하시오: ");
		ccf.setName(input.nextLine());
		System.out.println("음식 종류를 입력하시오: ");
		ccf.setType(input.nextLine());
		System.out.println("맵기 정도를 입력하시오: ");
		ccf.setSpicness(input.nextLine());
		ccf.setSubject();
		
		System.out.println("");
		
		this.calculusfood.add(ccf);
		
	}
	public void deleteFood()
	{
		try{
			Scanner input = new Scanner(System.in);
		
			System.out.print("몇 번째 음식을 삭제 하시겠습니까?: ");
			int num = input.nextInt();
			if(num < calculusfood.size())
			{
				calculusfood.remove(num);
				System.out.println("음식이 삭제 되었습니다.");
			}
			else
			{
				System.out.println("음식이 존재하지 않습니다.");
			}
			}catch(InputMismatchException e)
		{
				System.out.println("InputMismatchException");
				input.nextLine();
		}
			
	}
	public void editFood()
	{
		try{
			Scanner a = new Scanner(System.in);
			System.out.println("몇 번째 음식을 수정하시겠습니까? : ");
			int num = a.nextInt();
			a.nextLine();//필요 없으면 지우기
			if(num > calculusfood.size())
			
			{
				System.out.println("음식이 존재하지 않습니다. ");
			}
			else
			{
				calculusfood.remove(num);
				

			
				System.out.println("음식 이름을 입력하시오 : ");
				ccf.setName(input.nextLine());
				System.out.print("음식 종류를 입력하시오 : ");
				ccf.setType(input.nextLine());

				System.out.println("음식 맵기 정도를 입력하시오 : ");
				ccf.setSpicness(input.nextLine());
				ccf.setSubject();
				System.out.println("");
			}
		}catch(InputMismatchException e)
		{
			System.out.println("InputMismatchException");
			input.nextLine();
		}
	}
	public void viewFood()
	{
		for(int i = 0; i < calculusfood.size(); i++)
		{
			calculusfood.get(i).printInfo();
		}
	}
}
