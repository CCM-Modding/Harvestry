package harvestry.core.handlers;

import harvestry.utils.exeptions.DupeExeption;
import harvestry.utils.lib.Archive;

import java.util.logging.Level;
import java.util.logging.Logger;

import cpw.mods.fml.common.FMLLog;

public final class Handler
{

    private static boolean IsLoaded = false;

    /*
     * *******************************************************************
     * Log Stuff
     * *******************************************************************
     */
    private static Logger  logger   = Logger.getLogger(Archive.MOD_ID);

    /**
     * Initializes the Logger for this Mod.
     */
    public static void initLog()
    {
        logger.setParent(FMLLog.getLogger());
    }

    /*
     * *******************************************************************
     * Mod State Check
     * *******************************************************************
     */
    /**
     * Checks if the Mod has being loaded before and throws a exception. The
     * default response is false. Other wise you should get a Exception.
     * 
     * @return false if the Mod has not being loaded yet.
     */
    public static boolean isModLoaded()
    {
        if (IsLoaded){
            throw new DupeExeption("Why did you install my Mod twice? Remove the second "
                                   + Archive.MOD_NAME
                                   + "-Universal-"
                                   + Archive.MOD_VERSION
                                   + ".jar out of your mods-Folder, you need only one of them. And another Question: Why the Hax did Forge not detect that before me?");
        }else{
            return false;
        }
    }

    /**
     * "Loads" the Mod. In respect to {@link isModLoaded()}
     */
    public static void LoadMod()
    {
        IsLoaded = true;
    }

    /**
     * Logs a Object.
     */
    public static void log(final Level logLevel, final Object message)
    {
        logger.log(logLevel, message.toString());
    }

    /**
     * Logs a Object, and a Throwable.
     */
    public static void log(final Level level, final String msg, final Throwable t)
    {
        logger.log(level, msg, t);
    }

    /**
     * "UnLoads" the Mod. In respect to {@link isModLoaded()}
     */
    public static void UnLoadMod()
    {
        IsLoaded = false;
    }
}