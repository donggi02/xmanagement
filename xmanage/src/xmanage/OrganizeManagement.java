package xmanage;
import java.util.ArrayList;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.Serializable;
public class OrganizeManagement implements Serializable{
	private ArrayList<CalculusFood> calculusfood = new ArrayList<>();
	transient Scanner input;

	public OrganizeManagement() {
	}

	public OrganizeManagement(Scanner input) {
		this.input = input;
	}

	public void addFood() {
		System.out.println("이름을 입력하시오: ");
		String name = input.nextLine();
		System.out.println("음식 종류를 입력하시오: ");
		String type = input.nextLine();
		System.out.println("맵기 정도를 입력하시오: ");
		String spiciness = input.nextLine();

		CalculusFood ccf = new CalculusFood(name, type, spiciness);					
		ccf.setSubject();
		this.calculusfood.add(ccf);

		System.out.println("");
	}

	public void deleteFood() {
		try {
			Scanner input = new Scanner(System.in);

			System.out.print("몇 번째 음식을 삭제 하시겠습니까?: ");
			int num = input.nextInt();
			if (num < calculusfood.size()) {
				calculusfood.remove(num);
				System.out.println("음식이 삭제 되었습니다.");
			} else {
				System.out.println("음식이 존재하지 않습니다.");
			}
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
			input.nextLine();
		}

	}

	public void editFood() {
		try {
			Scanner a = new Scanner(System.in);
			System.out.println("몇 번째 음식을 수정하시겠습니까? : ");
			int num = a.nextInt();
			a.nextLine();// 필요 없으면 지우기
			if (num >= calculusfood.size()) {
				System.out.println("음식이 존재하지 않습니다. ");
			} else {
				System.out.println("음식 이름을 입력하시오 : ");
				String name = input.nextLine();
				System.out.print("음식 종류를 입력하시오 : ");
				String type = input.nextLine();

				System.out.println("음식 맵기 정도를 입력하시오 : ");
				String spiciness = input.nextLine();

				calculusfood.set(num, new CalculusFood(name, type, spiciness));
				calculusfood.get(num).setSubject();
				System.out.println("");
			}
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
			input.nextLine();
		}
	}

	public void viewFood() {
		for (int i = 0; i < calculusfood.size(); i++) {
			calculusfood.get(i).printInfo();
		}
	}

	public int size() {
		return calculusfood.size();
	}
	public Food get(int index) {
		return (Food) calculusfood.get(index);
	}
	private ArrayList<CalculusFood> foodList;
   
	public void addFood(CalculusFood food) {
        foodList.add(food);
        System.out.println("음식이 추가되었습니다.");
    }
}
