/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.item.enums;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;

import ccm.harvestry.item.ModItems;
import ccm.harvestry.utils.lib.Locations;
import ccm.nucleum_omnium.utils.handler.TextureHandler;
import ccm.nucleum_omnium.utils.helper.enums.IItemEnum;

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
        for (final EnumUncookedFood item : EnumUncookedFood.values())
        {
            item.icon = register.registerIcon(item.texture);
        }
    }

    private Icon        icon;

    public final String texture;

    private EnumUncookedFood()
    {
        texture = TextureHandler.getTextureFromName(name(), Locations.TEXTURE + "food/uncooked/");
    }

    @Override
    public Icon getIcon()
    {
        return icon;
    }

    @Override
    public Item getBaseItem()
    {
        return ModItems.uncookedFoodItem;
    }
}