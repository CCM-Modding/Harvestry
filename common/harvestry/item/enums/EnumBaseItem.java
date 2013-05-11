package harvestry.item.enums;

import harvestry.core.helpers.TextureHelper;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public enum EnumBaseItem
{
    // Items (Stack up to 64)
    dustAluminum,
    dustBeef,
    dustCheese,
    dustCinnamon,
    dustFlour,
    dustLettuce,
    dustSalt,
    seedsLettuce,
    seedsMustard,
    seedsTomato,
    foilAluminum,
    foilGold,
    sheetAluminum,
    sheetGold,
    sheetIron,
    itemChocolateChips,
    itemKetchup,
    itemMustard,
    itemOnion,
    globDough,
    ingotAluminum,
    ingotButter,
    ingotSugar,
    rawButter,
    rawCheese,
    rawPumpkinMash,
    sliceOnion,
    sliceTomato,
    sliceBread,
    sliceCheese,
    sliceApple,
    rawWood,
    sheetTin,
    sheetCopper,
    sheetBronze;

    public static void registerIcons(final IconRegister register)
    {
        for (final EnumBaseItem item : EnumBaseItem.values()){
            item.icon = register.registerIcon(item.texture);
        }
    }

    private Icon        icon;

    public final String texture;

    private EnumBaseItem()
    {
        this.texture = TextureHelper.getTextureFromNameInFolder(this.name(), "items/");
    }

    public Icon getIcon()
    {
        return this.icon;
    }
}