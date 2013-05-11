package harvestry.core.helpers;

import harvestry.utils.lib.Locations;
import net.minecraft.item.Item;

public class TextureHelper
{

    /**
     * @param name
     *            Name of the thing to make a texture
     * @return The texture version of the name
     */
    public static String getTextureFromName(final String name)
    {
        return Locations.TEXTURE + name;
    }

    /**
     * @return The texture.
     */
    public static String getTexture(final Item item)
    {
        return Locations.TEXTURE + ItemHelper.getItemName(item);
    }

    /**
     * @param name
     *            Name of the thing to make a texture
     * @param folder
     *            The name of the folder in which the texture is located in. Ex:
     *            machines/
     * @return The texture.
     */
    public static String getTextureFromNameInFolder(final String name, final String folder)
    {
        return Locations.TEXTURE + folder + name;
    }

    /**
     * @param item
     *            The Item to get the Texture for.
     * @param folder
     *            The name of the folder in which the texture is located in. Ex:
     *            machines/
     * @return The texture.
     */
    public static String getTextureInFolder(final Item item, final String folder)
    {
        return Locations.TEXTURE + folder + ItemHelper.getItemName(item);
    }

    private TextureHelper()
    {}
}