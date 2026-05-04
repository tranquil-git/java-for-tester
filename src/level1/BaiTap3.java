package level1;

import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 0; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("Tổng số chẵn từ 0 đến " + n + " là: " + sum);
    }
}
