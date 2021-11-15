package week2.oddoreven;


import java.util.Scanner;
import static java.lang.Math.min;


public class Game {
    Scanner sc = new Scanner(System.in);
    Challenger challenger = new Challenger("Challenger1",120);
    Player user = new Player();

    int bettingMoney;
    public Game(){

    }
    //사용자 이름 등록
    public void enrollPlayer(){
        System.out.println("플레이어의 이름을 입력하세요: ");
        user = new Player(sc.nextLine(),100);
        System.out.println(user.playerName+"님 환영합니다. 자본금은"+user.gameMoney+"로 시작합니다.");
    }
    //1~20까지 임의의 수 뽑기
    public int pickNumber(){
        return 1 + (int) (Math.random() * 20);
    }

    // 홀/짝 맞추기
    public int guessOddOrEven(){
        System.out.println("골라골라~ 홀이면 1 짝이면 2를 입력하세요:");
        if(sc.nextInt() % 2 == 1){
            System.out.println("홀수 선택!");
            return 1;
        }else{
            System.out.println("짝수 선택!");
            return 2;
        }


    }
    // 상대 홀수면 1반환, 짝수면 2반환
    public int correctOddOrEven(){
        int randomNumber = pickNumber();
        int oddOrEven;
        if (randomNumber % 2 == 0){
            oddOrEven = 2;
        }else{
            oddOrEven = 1;
        }
        return oddOrEven;
    }
    //베팅금액 정하기
    public void betting(){
        while(true){
            System.out.println("얼마를 베팅하시겠습니까?");
            int bettingMoney = sc.nextInt();
            if(bettingMoney > min(user.gameMoney,challenger.gameMoney)){
                System.out.println("베팅최대 금액은"+min(user.gameMoney,challenger.gameMoney)+"입니다.");
            }else {
                System.out.println(bettingMoney+"원을 베팅하셨습니다");
                this.bettingMoney = bettingMoney;
                break;
            }
        }
    }
    //게임 이겼을 때
    public void gameWin(){

        user.gameMoney = user.gameMoney + this.bettingMoney;
        challenger.gameMoney = challenger.gameMoney - this.bettingMoney;
    }
    //게임 졌을 때
    public void gameLose(){

        user.gameMoney = user.gameMoney -  this.bettingMoney;
        challenger.gameMoney = challenger.gameMoney + this.bettingMoney;
    }

    public void gamePlay(){
        do{
            if (this.guessOddOrEven() == this.correctOddOrEven()){
                System.out.println("정답입니다");
                gameWin();
                System.out.println("현재 "+user.playerName+"의 자본금은"+user.gameMoney+"입니다.");
                System.out.println("현재 "+challenger.challengerName+"의 자본금은"+challenger.gameMoney+"입니다.");

            }else{
                System.out.println("땡! 틀렸습니다");
                gameLose();
                System.out.println("현재 "+user.playerName+"의 자본금은"+user.gameMoney+"입니다.");
                System.out.println("현재 "+challenger.challengerName+"의 자본금은"+challenger.gameMoney+"입니다.");
            }
        } while (user.gameMoney == 0 || challenger.gameMoney == 0);

    }






}

