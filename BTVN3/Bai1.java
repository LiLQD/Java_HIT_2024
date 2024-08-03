import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Bai1 {
	public static void main(String[] args) {
		final String hinhVuong = "Square";
		final String hinhTron = "Circle";
		final String hinhTamGiac = "Triangle";
        Scanner sc = new Scanner(System.in);
		System.out.println("Nhap hinh dang: ");
		String type = sc.nextLine();

		if (type.equals(hinhVuong)) {
			System.out.println("Nhap do dai canh hinh vuong: ");
			int a = sc.nextInt();
			int DTHinhVuong = (int)Math.pow(a, 2);
			System.out.println("Dien tich = " + DTHinhVuong);
		} 
		else if (type.equals(hinhTron)) {
			System.out.println("Nhap r: ");
			int r = sc.nextInt();
			double DTHinhTron = Math.PI * Math.pow(r, 2);
			BigDecimal bd = new BigDecimal(DTHinhTron).setScale(2, RoundingMode.HALF_UP);
            System.out.println(bd);
		} 
		else if (type.equals(hinhTamGiac)) {
			System.out.println("Nhap do dai ba canh tam giac: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (a + b > c && b + c > a && a + c > b) {
				double P = (a + b + c) / 2;
				double DTTamGiac = Math.sqrt(P * (P - a) * (P - b) * (P - c));
				BigDecimal bd1 = new BigDecimal(DTTamGiac).setScale(2, RoundingMode.HALF_UP);
                System.out.println(bd1);
			} 
			else System.out.println("Hinh dang khong hop le!");
		} 
		else System.out.println("Hinh dang khong hop le!");
		sc.close();
	}
}