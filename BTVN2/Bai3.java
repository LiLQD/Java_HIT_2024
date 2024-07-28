import java.util.Scanner;

public class Bai3 
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        for(;n<1;)
        {
            n = scanner.nextInt();
        }
        int a[][] = new int[50][50];
        a[0][0] = 1;
        int h1 = 0, h2 = n - 1, c1 = 0, c2 = n - 1, value = 1, total = n*n;
        for(;value < total;)
        {
            for(int i = c1; i <= c2; i++)
            {
                a[h1][i] = value;
                ++value;
            }
            ++h1;
            for(int i = h1; i <= h2; i++)
            {
                a[i][c2] = value;
                ++value;
            }
            --c2;
            for(int i = c2; i >= c1; i--)
            {
                a[h2][i] = value;
                ++value;
            }
            --h2;
            for(int i = h2; i >= h1; i--)
            {
                a[i][c1] = value;
                ++value;
            }
            ++c1;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}