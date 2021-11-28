package week1.Mission1.src;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 단을 입력해주세요 :");
        String inputValue0 = sc.nextLine();
        System.out.println("끝 단을 입력해주세요 :");
        String inputValue1 = sc.nextLine();
        int a = Integer.parseInt(inputValue0);
        int b = Integer.parseInt(inputValue1);

        for(int i=a;i<=b;i++){
            System.out.println(i+"단");
            for(int j=1;j<=9;j++){
                System.out.println(i+"*"+j+"="+i*j);
            }
        }
    }
}
