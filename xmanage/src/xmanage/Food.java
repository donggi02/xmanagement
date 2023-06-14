package xmanage;
import java.io.Serializable;
abstract public class Food implements Serializable{
	private static final long serialVersionUID = -1219826540388449953L;
	private String name;
	private String type;
	private String spicness;
	public Food() {}

	

    public static void FoodKind(String a) {
        System.out.println(a);
    }
	public static void FoodKind(String a, String b)
	{
		System.out.println(a+ " "+ b);
	}
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setType(String tpye)
	{
		this.type = tpye;
	}
	public String getType()
	{
		return this.type;
	}
	public void setSpicness(String spicness)
	{
		this.spicness = spicness;
	}
	public String getSpicness()
	{
		return this.spicness;
	}
	public abstract void printInfo();
}