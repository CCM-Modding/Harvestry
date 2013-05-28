package ccm.harvestry.enums.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import ccm.harvestry.utils.lib.Locations;
import ccm.nucleum_omnium.handler.enums.IEnum;
import ccm.nucleum_omnium.helper.TextureHelper;

public enum EnumUncookedFood implements IEnum
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

    public Icon getIcon()
    {
        return this.icon;
    }
}