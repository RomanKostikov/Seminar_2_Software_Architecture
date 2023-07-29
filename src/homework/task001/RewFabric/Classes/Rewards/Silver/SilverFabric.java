package homework.task001.RewFabric.Classes.Rewards.Silver;

import homework.task001.RewFabric.Classes.IGameItem;
import homework.task001.RewFabric.Classes.ItemGenerator;

public class SilverFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Silver();
    }
}
