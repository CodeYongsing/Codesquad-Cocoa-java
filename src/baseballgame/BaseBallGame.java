package baseballgame;

import java.util.Scanner;

public class BaseBallGame {

    Scanner sc = new Scanner(System.in);
    Player player = new Player();
    int[] ranNum = new int[3];

    public BaseBallGame () {

    }

    //1. 플레이어 이름 입력받기 라이프는 10 , 게임안내
    public void enrollPlayer() {
        System.out.println("플레이어의 이름을 입력하세요");
        player = new Player(sc.nextLine(), 10);
        System.out.println(player.playerName+"님 숫자야구게임을 시작합니다.");
        System.out.println("3자리 숫자를 10번안에 맞추세요. 숫자를 맞추면 BALL , 숫자와 자리를 모두 맞추면 STRIKE, 못맞추면 OUT 입니다");
    }

    //2. 랜덤 3자리 번호 생성
    public int[] randomNumber() {

        for (int i = 0; i < ranNum.length; i++){
            ranNum[i] = (int)(Math.random()*10);
        }
        return ranNum;
    }

    //3. 예상 숫자3자리 입력받기
    public void guessNumber() {

    }
    //4. 숫자 맞으면 Ball , 숫자와 자리 다 맞으면 Strike, 숫자가 없으면 OUT 출력
    public void guessResult() {

    }
    //5. 3Strike 면 게임종료, 턴이 진행될수록 라이프-1 , 라이프 0되면 게임종료
    public void gameOver() {

    }
    //6. 게임 다시하기 or 종료
}