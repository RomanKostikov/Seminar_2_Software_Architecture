package homework.task001.RewFabric.Classes.Rewards.Bronze;

import homework.task001.RewFabric.Classes.IGameItem;

public class Bronze implements IGameItem {
    @Override
    public void open() {
        System.out.println("Bronze!");
    }
}
