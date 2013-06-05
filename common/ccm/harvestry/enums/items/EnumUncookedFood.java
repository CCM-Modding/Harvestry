package ccm.harvestry.enums.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;

import ccm.nucleum_omnium.helper.TextureHelper;
import ccm.nucleum_omnium.helper.enums.IItemEnum;

import ccm.harvestry.item.ModItems;
import ccm.harvestry.utils.lib.Locations;

public enum EnumUncookedFood implements IItemEnum
{
    // TODO Fill in
    uncookedBread,
    uncookedCake,
    uncookedPotato,
    uncookedCookies,
    uncookedCookiesChocolateChip,
    uncookedCookiesSugar,
    uncookedPiePumpkin,
    uncookedPieApple,
    uncookedPieBerryBlue,
    uncookedPieBerryCherry,
    uncookedMeatBacon,
    uncookedPizzaCheese,
    uncookedPizza,
    uncookedChicken,
    uncookedChickenLeg,
    uncookedChickenNuggets,
    uncookedChickenStrips,
    uncookedMeatBall,
    uncookedMeatPatty,
    uncookedNoodles,
    unfriedChips,
    unfriedFries,
    uncookedSeedsCorn,
    uncookedCorn,
    uncookedTortilla;

    public static void registerIcons(final IconRegister register)
    {
        for (final EnumUncookedFood item : EnumUncookedFood.values()){
            item.icon = register.registerIcon(item.texture);
        }
    }

    private Icon        icon;

    public final String texture;

    private EnumUncookedFood()
    {
        this.texture = TextureHelper.getTextureFromName(this.name(), Locations.TEXTURE + "food/uncooked/");
    }

    @Override
    public Icon getIcon()
    {
        return this.icon;
    }

    @Override
    public Item getBaseItem()
    {
        return ModItems.uncookedFoodItem;
    }
}