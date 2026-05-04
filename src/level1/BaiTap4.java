package level1;

import java.util.Scanner;

public class BaiTap4 {
    public static void main(String[] args){
        System.out.print("Input: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int count = 1;
        for(int i = 0; i < s.length()-1; i++){
           if( (s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
            {
                count++;
            }
        }
        System.out.println("Output: " + count);
        sc.close();
    }
}
