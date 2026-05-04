package level1;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập các phần tử:");
        String[] parts = sc.nextLine().split(" ");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        int result = findSecondMax(arr);

        if (result == Integer.MIN_VALUE) {
            System.out.println("Không đủ phần tử hoặc không có số lớn thứ 2");
        } else {
            System.out.println("Số lớn thứ 2: " + result);
        }
    }

    static int findSecondMax(int[] arr) {
        if (arr == null || arr.length < 2) {
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                second = max;
                max = num;
            } else if (num > second && num < max) {
                second = num;
            }
        }

        return second;
    }
}