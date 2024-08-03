import java.util.Scanner;
import java.util.Random;

public class Bai3 {
	public static void main(String[] args) 
	{
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int a = random.nextInt(11);
        int b = random.nextInt(11);
        int randomC;
        int correctC = a + b;

        boolean isCorrect = random.nextBoolean(); 
        if (isCorrect) randomC = correctC;
        else 
        {
            randomC = random.nextInt(21);
            if(randomC == correctC) randomC += 1;
        }

        System.out.printf("Phep toan: %d + %d = %d%n", a, b, randomC);
        System.out.print("Phep toan tren dung hay sai (Y/N): ");
        String str = sc.nextLine().toUpperCase();

        boolean STRcheck = str.equals("Y");
        boolean realAnswer = (randomC == correctC);
        if (STRcheck == realAnswer) System.out.println("Yes sir!");
        else System.out.println("Sai r :( ");
        sc.close();
    }
}
