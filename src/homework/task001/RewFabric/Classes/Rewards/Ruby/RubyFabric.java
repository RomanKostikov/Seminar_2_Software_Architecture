package homework.task001.RewFabric.Classes.Rewards.Ruby;

import homework.task001.RewFabric.Classes.IGameItem;
import homework.task001.RewFabric.Classes.ItemGenerator;

public class RubyFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Ruby();
    }
}
