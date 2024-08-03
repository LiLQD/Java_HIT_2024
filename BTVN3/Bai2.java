import java.util.Scanner;

public class bai2 {
    public static boolean check(String str){
        int left = 0;
        int right = str.length()-1;
        for(;left < right;){
            if(str.charAt(left) != str.charAt(right)) return false;
            
            left ++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi ki tu: ");
        String str = sc.nextLine();
        sc.close();
        if (check(str)) 
        {
            System.out.println(str.toUpperCase());
        }
        else 
        {
            System.out.println(str.toLowerCase());
        }
    }
}