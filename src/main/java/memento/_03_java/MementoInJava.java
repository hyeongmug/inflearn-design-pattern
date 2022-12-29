package memento._03_java;

import memento._02_after.Game;

import java.io.*;
import java.util.Date;

public class MementoInJava {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO Date
        Date date = new Date();
        System.out.println("date = " + date);

        // TODO Serializable
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        // TODO 직렬화
        try (FileOutputStream fileOut = new FileOutputStream("GameSave.hex");
             ObjectOutputStream out = new ObjectOutputStream(fileOut);
        ) {
            out.writeObject(game);
        }

        game.setBlueTeamScore(30);
        game.setRedTeamScore(40);

//        // TODO 역직렬화
//        try (FileInputStream fileIn = new FileInputStream("GameSave.hex");
//             ObjectInputStream in = new ObjectInputStream(fileIn);
//        ) {
//            Game restoredGame = (Game) in.readObject();
//            System.out.println("restoredGame.getRedTeamScore() = " + restoredGame.getRedTeamScore());
//            System.out.println("restoredGame.getBlueTeamScore() = " + restoredGame.getBlueTeamScore());
//        }
    }
}
