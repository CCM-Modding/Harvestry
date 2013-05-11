package harvestry.configuration;

import harvestry.utils.lib.Archive;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import nucleum_omnium.handler.Handler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public final class Config
{

    /*
     * ***************************************************
     * Item IDs ***************************************************
     */
    private static int    itemID  = 10000;

    public static int     mainItemID;

    public static int     nsItemID;

    public static int     foodItemID;

    public static int     uncookedFoodItemID;

    public static int     itemHaxID;

    /* Usable Items */
    public static int     gStoneID;

    public static int     gGrateID;

    public static int     gIronID;

    public static int     gObsidianID;

    public static int     grindStonesID;

    public static int     heWoodID;

    public static int     heAluminumID;

    public static int     heIronID;

    public static int     heGoldID;

    public static int     heCopperID;

    // Tools
    public static int     flatShovelID;

    public static int     flatShovelWoodID;

    public static int     flatShovelStoneID;

    public static int     flatShovelIronID;

    public static int     flatShovelDiamondID;

    public static int     flatShovelGoldID;

    public static int     axeID;

    public static int     hoeID;

    public static int     pickaxeID;

    public static int     shovelID;

    public static int     swordID;

    public static int     toolKnifeAID;

    public static int     toolKnifeIID;

    public static int     toolKnifeGID;

    public static int     toolCuttingBoardID;

    public static int     toolGrateID;

    public static int     toolClippersID;

    public static int     heTinID;

    public static int     heBronzeID;

    public static int     toolKnifeBID;

    public static int     gBronzeID;

    /*
     * ***************************************************
     * Blocks IDs ***************************************************
     */
    private static int    blockID = 1000;

    public static int     oreAluminumID;

    public static int     oreSaltID;

    public static int     blockGrinderID;

    public static int     blockGrinderRunningID;

    public static int     blockOvenID;

    public static int     blockOvenRunningID;

    public static int     blockSugarID;

    public static int     blockAluminumID;

    public static int     blockRollerID;

    public static int     blockRollerRunningID;

    public static int     blockCounterID;

    public static int     blockCheeseID;

    public static int     blockButterID;

    public static int     blockBarrelID;

    public static int     blockCabinetID;

    public static int     cropOnionID;

    public static int     cropLettuceID;

    public static int     cropCornID;

    /*
     * ***************************************************
     * World Generation Stuff
     * ***************************************************
     */
    // Aluminum
    public static boolean enableWorldGenAluminum;

    public static int     aluMaxHeight;

    public static int     aluMinHeight;

    public static int     aluSize;

    public static int     aluDensity;

    // Salt
    public static boolean enableWorldGenSalt;

    public static int     saltMaxHeight;

    public static int     saltMinHeight;

    public static int     saltSize;

    public static int     saltDensity;

    /**
     * Initializes the Configuration file.
     * 
     * @param event
     *            The FMLPreInitializationEvent that is used to get the
     *            ModConfigurationDirectory.
     */
    public static void init(final FMLPreInitializationEvent event)
    {
        final Configuration config = new Configuration(new File(event.getModConfigurationDirectory(), Archive.MOD_NAME + ".cfg"));
        try{
            Handler.log(Level.INFO, "Loading configuration");
            // Loads a pre-existing Configuration file.
            config.load();
            ConfigItems.configItems(config);
            ConfigFood.configFood(config);
            ConfigUsable.configUsable(config);
            ConfigWorldGen.configWorldGen(config);
            ConfigBlocks.configBlocks(config);
        }catch(final Exception e){
            Handler.log(Level.SEVERE, Archive.MOD_NAME + " has had a problem loading its configuration");
            e.printStackTrace();
        }finally{
            if (config.hasChanged()){
                /*
                 * If a pre-existing Configuration file didn't exist it creates
                 * a new one. If there were changes to the existing
                 * Configuration file, It saves them.
                 */
                config.save();
            }
        }
    }

    /**
     * @return The next Item ID
     */
    public static int getItemNextID()
    {
        return itemID++;
    }

    /**
     * @return The next Block ID
     */
    public static int getBlockNextID()
    {
        return blockID++;
    }
}
