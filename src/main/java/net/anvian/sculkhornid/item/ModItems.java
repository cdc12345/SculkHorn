package net.anvian.sculkhornid.item;

import net.anvian.sculkhornid.SculkHornMod;
import net.anvian.sculkhornid.item.custom.SculkHorn;
import net.anvian.sculkhornid.item.custom.SculkHornSonicBoom;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item SCULKHORN =registerItem("sculkhorn", new SculkHorn(
            new FabricItemSettings()
                    .rarity(Rarity.EPIC)
                    .maxCount(1)
                    .maxDamage(SculkHornMod.CONFIG.AREA_DURABILITY())//350
                    .group(ModItemGroup.SCULKHORNGROUP)));

    public static final Item SCULKHORN_SONICBOOM = registerItem("sculkhorn_sonicboom", new SculkHornSonicBoom(
            new FabricItemSettings()
                    .rarity(Rarity.EPIC)
                    .maxCount(1)
                    .maxDamage(SculkHornMod.CONFIG.DISTANCE_DURABILITY())//500
                    .group(ModItemGroup.SCULKHORNGROUP)));

    public static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(SculkHornMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        System.out.println("Registering Mod Items for " + SculkHornMod.MOD_ID);
    }
}
