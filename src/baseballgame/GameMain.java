package baseballgame;

public class GameMain {
    public static void main(String[] args) {
        BaseBallGame game = new BaseBallGame();
        System.out.println("======= BASEBALL GAME =======");
        game.enrollPlayer();
        game.gameGo();
    }
}
