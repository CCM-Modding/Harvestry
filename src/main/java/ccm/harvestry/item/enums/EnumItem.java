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

public enum EnumItem implements IItemEnum
{
    // Items (Stack up to 64)
    dustAluminum, dustBeef, dustCheese, dustCinnamon, dustFlour, dustLettuce, dustSalt, seedsLettuce, seedsMustard, seedsTomato, foilAluminum, foilGold, sheetAluminum, sheetGold, sheetIron, itemChocolateChips, itemKetchup, itemMustard, itemOnion, globDough, ingotAluminum, ingotButter, ingotSugar, rawButter, rawCheese, rawPumpkinMash, sliceOnion, sliceTomato, sliceBread, sliceCheese, sliceApple, rawWood, sheetTin, sheetCopper, sheetBronze, globDoughCorn;

    public static void registerIcons(final IconRegister register)
    {
        for (final EnumItem item : EnumItem.values())
        {
            item.icon = register.registerIcon(item.texture);
        }
    }

    private Icon icon;

    public final String texture;

    private EnumItem()
    {
        texture = TextureHandler.getTextureFromName(name(), Locations.TEXTURE + "items/");
    }

    @Override
    public Icon getIcon()
    {
        return icon;
    }

    @Override
    public Item getBaseItem()
    {
        return ModItems.mainItem;
    }
}