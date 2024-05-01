package testCases;

import java.util.Random;

public class requiredMethods {
    public static String randomEmailGeneration()
    {
        Random random = new Random();
        String  email = "tester"+ random.nextInt(100000)+"@gmail.com";
        System.out.println("Your User Email is "+email);
        return email;
    }
    public static String randomPasswordGeneration()
    {
        Random random = new Random();
        String  password = "Tester"+ random.nextInt(100000);
        System.out.println("Your Password is (Do not share with anyone)"+password);
        return password;
    }
}
