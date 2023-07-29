package homework.task001.RewFabric.Classes.Rewards.Gem;

import homework.task001.RewFabric.Classes.IGameItem;

public class Gem  implements IGameItem {
    @Override
    public void open() {
        System.out.println("Gem!");
    }
}
