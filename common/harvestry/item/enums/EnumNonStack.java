package harvestry.item.enums;

import harvestry.core.helpers.TextureHelper;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

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
        this.texture = TextureHelper.getTextureFromNameInFolder(this.name(), "items/");
    }

    public Icon getIcon()
    {
        return this.icon;
    }
}