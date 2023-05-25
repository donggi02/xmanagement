package xmanage;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


import xmanage.EventLogger;

public class FoodManager 
{
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String args[])
	{

		Scanner input = new Scanner(System.in);
		OrganizeManagement omm = getObject("omm.ser");
		if(omm == null) {
		omm = new OrganizeManagement(input);
		} else {
		omm.input = input;
		}
		int i = 0;
		
		while(i != 5)
		{
			System.out.println("Food Management System");
			System.out.println("1. Add Food");
			System.out.println("2. Delete Food");
			System.out.println("3. Edit Food");
			System.out.println("4. View Food");
			System.out.println("5. Exit");
			System.out.println("Select one number in one to six");
			
			i = input.nextInt();
			input.nextLine();
			System.out.println(" ");
			
			switch(i) 
			{
			case 1:
				omm.addFood();
				logger.log("add a food");
				break;
			
			case 2:
				omm.deleteFood();
				logger.log("delete a food");
				break;
			case 3:
				omm.editFood();
				logger.log("edit a food");
				break;
			case 4:
				
				omm.viewFood();
				logger.log("view a food");
				break;
			case 5:
				continue;
			default:
				System.out.println("1-5 사이의 숫자를 고르시오");
				System.out.println();
			}putObject(omm, "omm.ser");
			System.out.println("End.");
		
		}
	}
	public static OrganizeManagement getObject(String filename) {
		OrganizeManagement omm = null;
		try {
		FileInputStream file = new FileInputStream(filename);
		
		ObjectInputStream in = new ObjectInputStream(file);
		
		omm = (OrganizeManagement)in.readObject();
		
		in.close();
		file.close();
		
		} catch (FileNotFoundException e) {
		return omm;
		} catch (IOException e) {
		e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
		e.printStackTrace();
		}	return omm;
	}
		public static void putObject(OrganizeManagement omm, String filename) {
		try {
		FileOutputStream file = new FileOutputStream(filename);
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(omm);
		out.close();
		file.close();
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		}
	}



}
