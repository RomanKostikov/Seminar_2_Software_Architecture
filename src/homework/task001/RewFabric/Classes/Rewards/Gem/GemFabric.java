package homework.task001.RewFabric.Classes.Rewards.Gem;

import homework.task001.RewFabric.Classes.ItemGenerator;
import homework.task001.RewFabric.Classes.IGameItem;

public class GemFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Gem();
    }
}
