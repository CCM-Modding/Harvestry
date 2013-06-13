package ccm.harvestry.utils.lib;

public final class TileConstants {

    /*
     * Base Stuff
     */
    public static final String CONTAINER           = "container.";

    public static final String INVENTORY           = TileConstants.CONTAINER + "inventory";

    /*
     * Grinder Stuff
     */
    public static final String GRINDER_GUID        = "grinder";

    public static final String GRINDER_UNLOCALIZED = TileConstants.CONTAINER
                                                           + TileConstants.GRINDER_GUID;

    public static final String GRINDER_GUI         = Locations.GUI + "guiGrindstone.png";

    /*
     * Oven Stuff
     */
    public static final String OVEN_GUID           = "oven";

    public static final String OVEN_UNLOCALIZED    = TileConstants.CONTAINER
                                                           + TileConstants.OVEN_GUID;

    public static final String OVEN_GUI            = Locations.GUI + "guiOven.png";

    /*
     * Roller Stuff
     */
    public static final String ROLLER_GUID         = "roller";

    public static final String ROLLER_UNLOCALIZED  = TileConstants.CONTAINER
                                                           + TileConstants.ROLLER_GUID;

    public static final String ROLLER_GUI          = Locations.GUI + "guiRolling.png";

    /*
     * Counter Stuff
     */
    public static final String COUNTER_GUID        = "counter";

    public static final String COUNTER_UNLOCALIZED = TileConstants.CONTAINER
                                                           + TileConstants.COUNTER_GUID;

    public static final String COUNTER_GUI         = Locations.GUI + "guiCounter.png";

    /*
     * Barrel Stuff
     */
    public static final String BARREL_GUID         = "barrel";

    public static final String BARREL_UNLOCALIZED  = TileConstants.CONTAINER
                                                           + TileConstants.BARREL_GUID;

    public static final String BARREL_GUI          = Locations.GUI + "guiBarrel.png";

    /*
     * Cabinet Stuff
     */
    public static final String CABINET_GUID        = "cabinet";

    public static final String CABINET_UNLOCALIZED = TileConstants.CONTAINER
                                                           + TileConstants.CABINET_GUID;

    public static final String CABINET_GUI         = Locations.GUI + "guiCabinet.png";

    /*
     * Grill Stuff
     */
    public static final String GRILL_GUID          = "grill";

    public static final String GRILL_UNLOCALIZED   = TileConstants.CONTAINER
                                                           + TileConstants.GRILL_GUID;

    public static final String GRILL_GUI           = Locations.GUI + "guiGrill.png";

    /*
     * NBT Stuff
     */
    public static final String NBT_TE_Direction    = "direction";

    public static final String NBT_TE_State        = "state";

    public static final String NBT_TE_Custom_Name  = "name";

    public static final String NBT_TE_Owner        = "owner";
}