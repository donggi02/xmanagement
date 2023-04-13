package xmanage;
import java.util.ArrayList;

public class Organizing {
	ArrayList<String> name = new ArrayList<String>();
	ArrayList<String> type = new ArrayList<String>();
	ArrayList<String> spicness = new ArrayList<String>();
	int  count = 0;
	
		public Organizing()
		{
		}
		public void printInfo()
		{
			for(int i = 0; i < count ; i ++)
			{
				System.out.println("음식 이름 :" + name.get(i));
				System.out.println("음식의 종류 :" + type.get(i));
				System.out.println("음식 맵기 정도 :" + spicness.get(i));
				System.out.println();
			}
		}
}
