package memento._02_after;

public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        GameSave gameSave = game.save();

        game.setRedTeamScore(30);
        game.setBlueTeamScore(40);

        game.restore(gameSave);

        System.out.println(game.getRedTeamScore());
        System.out.println(game.getBlueTeamScore());
    }
}
