package ccm.harvestry.utils.lib;

public class Properties
{

    /*
     * ***********************************************
     * Defaluts
     * ***********************************************
     */
    private static int    itemID  = 10000;

    private static int    blockID = 1000;

    /*
     * ***********************************************
     * Item IDs
     * ***********************************************
     */
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
     * ***********************************************
     * Blocks IDs
     * ***********************************************
     */

    public static int     oreID;

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

    public static int     blockGrillID;

    public static int     blockGrillRunningID;

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

    public static int getItemID()
    {
        return itemID;
    }

    public static int getBlockID()
    {
        return blockID;
    }
}