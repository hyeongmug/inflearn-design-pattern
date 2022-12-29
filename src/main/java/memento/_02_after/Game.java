package memento._02_after;

public class Game {

    private int redTeamScore;
    private int blueTeamScore;

    public void setRedTeamScore(int redTeamScore) {
        this.redTeamScore = redTeamScore;
    }

    public void setBlueTeamScore(int blueTeamScore) {
        this.blueTeamScore = blueTeamScore;
    }

    public int getRedTeamScore() {
        return redTeamScore;
    }

    public int getBlueTeamScore() {
        return blueTeamScore;
    }

    /**
     * 저장기능
     * @return
     */
    public GameSave save() {
        return new GameSave(redTeamScore, blueTeamScore);
    }

    /**
     * 복원기능
     * @param gameSave
     */
    public void restore(GameSave gameSave) {
        redTeamScore = gameSave.getRedTeamScore();
        blueTeamScore = gameSave.getBlueTeamScore();
    }
}
