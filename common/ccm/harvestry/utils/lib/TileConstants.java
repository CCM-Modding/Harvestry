package ccm.harvestry.utils.lib;

import ccm.nucleum_omnium.utils.lib.TileConstant;

public final class TileConstants {
    
    /*
     * Grinder Stuff
     */
    public static final String GRINDER_ID          = "grinder";
    
    public static final String GRINDER_UNLOCALIZED = getName(GRINDER_ID);
    
    public static final String GRINDER_GUI         = Locations.GUI + "guiGrindstone.png";
    
    /*
     * Oven Stuff
     */
    public static final String OVEN_ID             = "oven";
    
    public static final String OVEN_UNLOCALIZED    = getName(OVEN_ID);
    
    public static final String OVEN_GUI            = Locations.GUI + "guiOven.png";
    
    /*
     * Roller Stuff
     */
    public static final String ROLLER_ID           = "roller";
    
    public static final String ROLLER_UNLOCALIZED  = getName(ROLLER_ID);
    
    public static final String ROLLER_GUI          = Locations.GUI + "guiRolling.png";
    
    /*
     * Counter Stuff
     */
    public static final String COUNTER_ID          = "counter";
    
    public static final String COUNTER_UNLOCALIZED = getName(COUNTER_ID);
    
    public static final String COUNTER_GUI         = Locations.GUI + "guiCounter.png";
    
    /*
     * Barrel Stuff
     */
    public static final String BARREL_ID           = "barrel";
    
    public static final String BARREL_UNLOCALIZED  = getName(BARREL_ID);
    
    public static final String BARREL_GUI          = Locations.GUI + "guiBarrel.png";
    
    /*
     * Cabinet Stuff
     */
    public static final String CABINET_ID          = "cabinet";
    
    public static final String CABINET_UNLOCALIZED = getName(CABINET_ID);
    
    public static final String CABINET_GUI         = Locations.GUI + "guiCabinet.png";
    
    /*
     * Grill Stuff
     */
    public static final String GRILL_ID            = "grill";
    
    public static final String GRILL_UNLOCALIZED   = getName(GRILL_ID);
    
    public static final String GRILL_GUI           = Locations.GUI + "guiGrill.png";
    
    private static String getName(String s) {
        return TileConstant.CONTAINER + s + "." + Archive.MOD_ID;
    }
}