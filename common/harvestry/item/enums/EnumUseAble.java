package harvestry.item.enums;

import harvestry.core.helpers.TextureHelper;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public enum EnumUseAble
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
        for (final EnumUseAble item : EnumUseAble.values()){
            item.icon = register.registerIcon(item.texture);
        }
    }

    public final String texture;

    public final int    duration;

    private Icon        icon;

    private EnumUseAble(final int duration)
    {
        this.texture = TextureHelper.getTextureFromName(this.name());
        this.duration = duration;
    }

    public Icon getIcon()
    {
        return this.icon;
    }
}