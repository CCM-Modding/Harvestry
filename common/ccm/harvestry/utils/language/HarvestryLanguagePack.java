package ccm.harvestry.utils.language;

import java.util.ArrayList;
import java.util.List;

import ccm.harvestry.utils.lib.Locations;
import ccm.nucleum_omnium.helper.LanguageHelper;
import ccm.nucleum_omnium.utils.language.ILanguagePack;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class HarvestryLanguagePack extends ILanguagePack {

    /**
     * Private {@code List<String>} that contains the languages, Shared with all
     * Language Packs
     */
    private final List<String> supportedLanguages = new ArrayList<String>();

    /**
     * Adds all the supported Languages
     */
    public HarvestryLanguagePack() {
        super(Locations.LANGUAGE_FILE);
        this.supportedLanguages.add(this.getPath("en_US"));
        this.supportedLanguages.add(this.getPath("es_ES"));
    }

    @Override
    public void loadLangs() {
        for (final String langFile : this.supportedLanguages)
            LanguageRegistry.instance().loadLocalization(langFile,
                    LanguageHelper.getLangFromFileName(langFile),
                    LanguageHelper.isXMLLanguageFile(langFile));
    }
}