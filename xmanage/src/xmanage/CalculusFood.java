package xmanage;

public class CalculusFood extends Food implements KindOfFood{
	private String eat;
	
	public void setSubject() {}
	public String getSubject() {
		return this.eat;
	}
	public void printInfo()
	{
		FoodKind("");
		FoodKind("","");
		System.out.println("음식 이름: "+ getName());
		System.out.println("음식 종류: "+ getType());
		System.out.println("음식 맵기 정도: " + getSpicness());
		System.out.println();
	}
}
