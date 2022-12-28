package bridge.after;

import bridge.before.Champion;

public class App {
    public static void main(String[] args) {
        Champion kda = new 아리(new KDA());
        kda.skillQ();
        kda.skillW();

        Champion poolParty = new 아리(new PoolParty());
        poolParty.skillQ();
        poolParty.skillW();
    }
}
