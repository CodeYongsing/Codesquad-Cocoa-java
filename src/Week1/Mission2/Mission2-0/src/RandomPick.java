import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RandomPick {

    public static void main(String[] args) {
        String randomPick = randomMember();
        System.out.println(randomPick);
    }

    public static int inputMember() {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇 명을 뽑겠습니까? :");

        if (sc.nextInt() > 9){
            System.out.println("9이하의 수로 뽑아주세요 :");
        }
        return sc.nextInt();
    }

    public static String randomMember() {
        int inputNum = inputMember();
        List<String> cocoaMember = Arrays.asList("Konda", "Barney", "Bart", "BC", "Ella", "Hanse", "Jhin", "OS", "Sonny");
        Collections.shuffle(cocoaMember);

        List<String> pickMember = cocoaMember.subList(0, inputNum);

        return String.join(", ", pickMember);
    }
}
