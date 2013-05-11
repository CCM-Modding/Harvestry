package harvestry.utils.exeptions;

import harvestry.utils.lib.Archive;
import harvestry.utils.lib.Locations;

public class FileExeption extends RuntimeException
{

    /**
     * This Exception is not MY Fault, YOU ALTERED MY folders
     */
    private static final long serialVersionUID = -629455840055671187L;

    public FileExeption()
    {}

    @Override
    public String toString()
    {
        return "The mod"
               + Archive.MOD_NAME
               + " has had a Problem loading it's Language files.\nIT'S NOT MY FAULT! Below is how to fix it.\n"
               + "/nDelete any file that does NOT end with '.xml' from your lang folder located inside "
               + Locations.LANGUAGE_FILE
               + " which is inside of the "
               + Archive.MOD_NAME
               + ".jar in your mods folder/n"
               + "\nDO NOT COME TO ME WITH THIS. YOU CAUSED IT YOURSELF, AND I TOLD YOU HOW TO FIX IT!";
    }
}