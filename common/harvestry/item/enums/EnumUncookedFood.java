package harvestry.item.enums;

import harvestry.utils.lib.Locations;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import nucleum_omnium.helper.TextureHelper;

public enum EnumUncookedFood
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