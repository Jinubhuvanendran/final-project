package Utilities;

import java.util.Random;

import org.openqa.selenium.WebDriver;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;

public class fakerUtility {
	WebDriver driver;
	public static int Randomnmbergenerator() {
		Random random = new Random();
		int Randomnum = random.nextInt(10000); 
		return Randomnum;
	}
	
public String getFakeFirstname() {
		
		Faker faker = new Faker();
		Address address = faker.address();
		String text = address.firstName();
		return text;
	}
	
}