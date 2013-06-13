package ccm.harvestry.enums.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;
import ccm.harvestry.item.ModItems;
import ccm.harvestry.utils.lib.Locations;
import ccm.nucleum.helper.TextureHelper;
import ccm.nucleum.helper.enums.IItemEnum;

public enum EnumItemSixteen implements IItemEnum {
    // Items (Stack up to 16)
    bowl,
    bowlBatter,
    bowlCookieDough,
    bowlCookieDoughChocolateChip,
    bowlCookieDoughSugar,
    bowlPumpkinFilling,
    globTomato,
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

    public static void registerIcons(final IconRegister register) {
        for (final EnumItemSixteen item : EnumItemSixteen.values())
            item.icon = register.registerIcon(item.texture);
    }

    private Icon        icon;

    public final String texture;

    private EnumItemSixteen() {
        this.texture = TextureHelper.getTextureFromName(this.name(), Locations.TEXTURE + "items/");
    }

    @Override
    public Icon getIcon() {
        return this.icon;
    }

    @Override
    public Item getBaseItem() {
        return ModItems.nsItem;
    }
}