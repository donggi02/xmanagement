package xmanage;
import java.io.Serializable;
public class CalculusFood extends Food implements KindOfFood, Serializable{
	private String eat;
	private static final long serialVersionUID = 5533066819552575457L;
	public void setSubject() {
		this.eat = "Calculus"  ;
	}
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
