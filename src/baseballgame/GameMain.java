package baseballgame;

public class GameMain {
    public static void main(String[] args) {
        BaseBallGame game = new BaseBallGame();
        game.enrollPlayer();
        game.randomNumber();
        game.guessNumber();
        game.guessResult();
    }
}
