package proxy._01_before;

import proxy._02_after.GameServiceProxy;

public class Client {

    public static void main(String[] args) {
        GameService gameService = new GameService() ;
        gameService.startGame();
    }

}
