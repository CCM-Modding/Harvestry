package ccm.harvestry.utils.language;

import ccm.harvestry.utils.lib.Locations;
import ccm.nucleum_omnium.BaseNIClass;
import ccm.nucleum_omnium.utils.language.LanguagePack;

public final class HarvestryLP extends BaseNIClass {

	/**
	 * Adds all the supported Languages
	 */
	public static void init() {
		final LanguagePack pack = new LanguagePack();
		pack.setPath(Locations.LANGUAGE_FILE);
		pack.addSuport("en_US");
		pack.addSuport("es_ES");
		pack.loadLangs();
	}
}