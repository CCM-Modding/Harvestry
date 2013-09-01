/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.item.enums;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;

import ccm.harvestry.utils.lib.Locations;
import ccm.nucleum.omnium.utils.helper.TextureHelper;
import ccm.nucleum.omnium.utils.helper.enums.IItemEnum;

public enum EnumModTool implements IItemEnum
{
    // Grinder "Fuel", TODO Update with the right Damages
    gStone(1500),
    gGrate(2500),
    gIron(3500),
    gBronze(4500),
    gObsidian(8000),
    // Heating Elements, TODO Update with the right Damages
    heWood(900),
    heAluminum(2060),
    heTin(2500),
    heCopper(3040),
    heIron(4052),
    heBronze(5060),
    heGold(6048),
    // Usable Item
    grindStones(5),
    toolKnifeA(50),
    toolKnifeI(100),
    toolKnifeB(200),
    toolKnifeG(5),
    toolCuttingBoard(200),
    toolGrate(50),
    toolClippers(75);

    public static void registerIcons(final IconRegister register)
    {
        for (final EnumModTool item : EnumModTool.values())
        {
            item.icon = register.registerIcon(item.texture);
        }
    }

    public final String texture;

    public final int duration;

    private Icon icon;

    private EnumModTool(final int duration)
    {
        texture = TextureHelper.getTexture(name(), Locations.TEXTURE);
        this.duration = duration;
    }

    @Override
    public Icon getIcon()
    {
        return icon;
    }

    @Override
    public Item getBaseItem()
    {
        return null;
    }
}