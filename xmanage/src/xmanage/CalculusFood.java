package xmanage;

public class CalculusFood extends Food{
	private String eat;
	
	public void setEat(String eat)
	{
		this.eat = eat;
	}
	public String getEat()
	{
		return this.eat;
	}
	public void printInfo()
	{
		System.out.println("음식 이름: "+ getName());
		System.out.println("음식 종류: "+ getType());
		System.out.println("음식 맵기 정도: " + getSpicness());
		System.out.println();
	}
}
