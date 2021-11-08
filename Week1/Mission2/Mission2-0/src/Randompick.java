import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Randompick {
    public static void main(String[] args){
        String randompick = randomMember();
        System.out.println(randompick);
    }
    public static int inputMember(){
        Scanner sc = new Scanner(System.in);
        System.out.println("몇 명을 뽑겠습니까? :");
        int inputValue = sc.nextInt();

        return inputValue;
    }

    public static String randomMember(){
        int inputnum = inputMember();
        List<String> cocoamember = Arrays.asList("Konda","Barney","Bart","BC","Ella","Hanse","Jhin","OS","Sonny");
        Collections.shuffle(cocoamember);

        int randomnumber = inputnum;
        List<String> pickMember = cocoamember.subList(0, randomnumber);

        String pick = String.join(", ",pickMember);
        return pick;

    }
}
