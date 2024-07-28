import java.util.Scanner;

public class bai1 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14, r, CV, DT;
        r = scanner.nextDouble();
        for(;r<=0;)
        {
            r = scanner.nextDouble();
        }
        CV = 2*r*pi;
        DT = r*r*pi;
        System.out.printf(CV + " " + DT);
    }
}