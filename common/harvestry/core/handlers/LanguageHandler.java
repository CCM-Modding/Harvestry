package harvestry.core.handlers;

import harvestry.core.helpers.LanguageHelper;
import harvestry.utils.lib.Languages;

import java.util.logging.Level;

import cpw.mods.fml.common.registry.LanguageRegistry;

public final class LanguageHandler
{

    /**
     * Creates the Localizations for everything in the Mod.
     */
    public static void loadLanguages()
    {
        Handler.log(Level.INFO, "Loading Languages");
        for (final String localizationFile : Languages.LANGUAGE_FILES){
            LanguageRegistry.instance().loadLocalization(localizationFile,
                                                         LanguageHelper.getLocaleFromFileName(localizationFile),
                                                         LanguageHelper.isXMLLanguageFile(localizationFile));
        }
    }
}