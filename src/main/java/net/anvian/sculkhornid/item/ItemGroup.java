package net.anvian.sculkhornid.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ItemGroup {
    public static final CreativeModeTab SCULKHORN = new CreativeModeTab("sculkhorngroup") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SCULKHORN.get());
        }
    };
}
