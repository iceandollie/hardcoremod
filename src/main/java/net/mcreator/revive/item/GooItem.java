
package net.mcreator.revive.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GooItem extends Item {
	public GooItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
