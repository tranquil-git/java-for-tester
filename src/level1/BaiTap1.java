package level1;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args){
        System.out.print("Input: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if ("aeiouAEIOU".indexOf(c) == -1) {
                result += c;
            }
        }
        System.out.println("Output: " + result);
    }
}
