package ccm.harvestry.enums.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import ccm.harvestry.utils.lib.Locations;
import ccm.nucleum_omnium.helper.TextureHelper;

public enum ItemEnum
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
    sheetBronze,
    globDoughCorn;

    public static void registerIcons(final IconRegister register)
    {
        for (final ItemEnum item : ItemEnum.values()){
            item.icon = register.registerIcon(item.texture);
        }
    }

    private Icon        icon;

    public final String texture;

    private ItemEnum()
    {
        this.texture = TextureHelper.getTextureFromName(this.name(), Locations.TEXTURE + "items/");
    }

    public Icon getIcon()
    {
        return this.icon;
    }
}