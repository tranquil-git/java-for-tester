package level2;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class BaiTap3 {
    public static void main(String[] args){
        System.out.print("Input: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringBuilder result = new StringBuilder();

        Set<Character> set = new LinkedHashSet<>();
        for (char c : input.toCharArray()) {
            set.add(c);
        }
        for (Character c : set) {
            result.append(c);
        }
        System.out.println("Output: " + result);
    }
}
