package harvestry.item.enums;

import harvestry.utils.lib.Locations;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import nucleum_omnium.helper.TextureHelper;

public enum EnumNonStack
{
    // Items (Stack up to 16)
    bowl,
    bowlBatter,
    bowlCookieDough,
    bowlCookieDoughChocolateChip,
    bowlCookieDoughSugar,
    bowlPumpkinFilling,
    bowlTomato,
    panBread,
    panCake,
    panPie,
    panPieCrust,
    sheetCookie,
    plate,
    globChocolate,
    globJelly,
    globPB,
    rawPizza,
    rawPizzaSauce,
    itemTortilla,
    itemTaco,
    itemLettuceLeaf,
    cookedNoodles,
    cookedMeatBall,
    cookedMeatPatty,
    friedChips,
    friedFries,
    bottle,
    bottleGlass,
    bottleMilk,
    bottlePitcher,
    rawMustard,
    cookedDustMeat,
    cookedCake;

    public static void registerIcons(final IconRegister register)
    {
        for (final EnumNonStack item : EnumNonStack.values()){
            item.icon = register.registerIcon(item.texture);
        }
    }

    private Icon        icon;

    public final String texture;

    private EnumNonStack()
    {
        this.texture = TextureHelper.getTextureFromName(this.name(), Locations.TEXTURE + "items/");
    }

    public Icon getIcon()
    {
        return this.icon;
    }
}