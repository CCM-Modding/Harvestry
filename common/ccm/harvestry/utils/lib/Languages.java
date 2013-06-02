package ccm.harvestry.utils.lib;

public class Languages
{

    public static final String[] LANGUAGE_FILES =
                                                { "en_US", "es_ES" };

    public static String getFile(final String fileName)
    {
        return Locations.LANGUAGE_FILE + fileName + ".xml";
    }
}