package homework.task001.RewFabric.Classes.Rewards.Gold;

import homework.task001.RewFabric.Classes.IGameItem;

public class Gold implements IGameItem {
    @Override
    public void open() {
        System.out.println("Gold!");
    }
}
