package homework.task001.RewFabric.Classes.Rewards.Gold;

import homework.task001.RewFabric.Classes.ItemGenerator;
import homework.task001.RewFabric.Classes.IGameItem;

public class GoldFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Gold();
    }
}
