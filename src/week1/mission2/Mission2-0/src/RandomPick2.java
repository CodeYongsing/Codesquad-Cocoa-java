import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RandomPick2 {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> cocoaList = memberList();
        final int n = input(cocoaList.size());
        shuffle(cocoaList);
        printMember(cocoaList, n);    // n명을 뽑는다.

    }
    private static List<String> memberList() throws FileNotFoundException {
        List<String> cocoaList = new ArrayList<>();               //List 랑 ArrayList<>??
        File f = new File("C:\\Users\\home\\Desktop\\CodeSquad\\Cocoa\\Week1\\Mission2\\Mission2-0\\src\\cocoamember");    //파일 가져오기
        Scanner sc = new Scanner(f);                    //파일 읽기?
        while(sc.hasNext()) {                          // hasNext()는 boolean 타입 반환
            String name = sc.next();
            cocoaList.add(name);
        }
        sc.close();
        return cocoaList;
    }
    private static int input(int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("몇 명을 뽑을까요? : ");
        int num = sc.nextInt();
        sc.close();
        return num;
    }
    private static void shuffle(List<String> s){
        Collections.shuffle(s);
    }

    private static void printMember(List<String> s, int n){
        for (int i = 0; i < n; i++){
            System.out.println(s.get(i));
        }
    }

}
