package level1;

import java.util.Scanner;

public class BaiTap5 {
    public static void main(String[] args) {
        System.out.print("Input: " );
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] words = s.trim().split("\\s+");
        for (String word : words) {
            System.out.print(word.charAt(0) + " ");
        }
    }
}
