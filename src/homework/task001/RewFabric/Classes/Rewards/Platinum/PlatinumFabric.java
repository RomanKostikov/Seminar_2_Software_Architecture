package homework.task001.RewFabric.Classes.Rewards.Platinum;

import homework.task001.RewFabric.Classes.IGameItem;
import homework.task001.RewFabric.Classes.ItemGenerator;

public class PlatinumFabric extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Platinum();
    }
}
