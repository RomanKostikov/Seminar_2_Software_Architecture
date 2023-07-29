package homework.task001.RewFabric.Classes.Rewards.Bronze;

import homework.task001.RewFabric.Classes.IGameItem;
import homework.task001.RewFabric.Classes.ItemGenerator;

public class BronzeFabric extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Bronze();
    }
}
