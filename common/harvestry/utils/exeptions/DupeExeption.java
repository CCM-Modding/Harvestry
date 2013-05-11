package harvestry.utils.exeptions;

import harvestry.utils.lib.Archive;

public class DupeExeption extends RuntimeException
{

    /**
     * This Exception is not MY Fault
     */
    private static final long serialVersionUID = -6762134744912730876L;

    private final String      mError;

    public DupeExeption(final String var1)
    {
        this.mError = var1;
    }

    @Override
    public String toString()
    {
        return "The mod "
               + Archive.MOD_NAME
               + " has a Problem.\nIT'S NOT MY FAULT! Below is how to fix it.\n"
               + this.mError
               + "\nDO NOT COME TO ME WITH THIS. YOU CAUSED IT YOURSELF, AND I TOLD YOU HOW TO FIX IT!";
    }
}