package level2;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args){
        System.out.print("Nhập lương hàng tháng: ");
        Scanner sc = new Scanner(System.in);
        float salary = sc.nextFloat();
        float salaryAfterTax;
        if (salary >= 0 && salary < 5){
            salaryAfterTax = salary - (float)(salary * 0.05);
            System.out.println("Thuế là: 5%");
            System.out.println("Lương sau thuế là: " + salaryAfterTax);
        }else if (salary >= 5 && salary < 10){
            salaryAfterTax = salary - (float)(salary * 0.1);
            System.out.println("Thuế là: 10%");
            System.out.println("Lương sau thuế là: " + salaryAfterTax);
        }else if (salary >= 10 && salary <  18){
            salaryAfterTax = salary - (float)(salary * 0.2);
            System.out.println("Thuế là: 20%");
            System.out.println("Lương sau thuế là: " + salaryAfterTax);
        }else if (salary >= 32 && salary < 52){
            salaryAfterTax = salary - (float)(salary * 0.25);;
            System.out.println("Thuế là: 25%");
            System.out.println("Lương sau thuế là: " + salaryAfterTax);
        }else if (salary >= 52 && salary < 80) {
            salaryAfterTax = salary - (float)(salary * 0.3);;
            System.out.println("Thuế là: 30%");
            System.out.println("Lương sau thuế là: " + salaryAfterTax);
        }else if (salary > 80){
            salaryAfterTax = salary - (float)(salary * 0.35);;
            System.out.println("Thuế là: 35%");
            System.out.println("Lương sau thuế là: " + salaryAfterTax);
        } else {
            System.out.println("Không hợp lệ.");
        }
    }
}
