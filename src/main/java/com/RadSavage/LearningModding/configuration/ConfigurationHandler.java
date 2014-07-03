package com.RadSavage.LearningModding.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        // Create the config object from the given config file
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;
        try
        {
            // Load the config file
            configuration.load();

            // Read in properties from config file
            configValue = configuration.get("ForgeCraft", "configValue", true, "This is an example value").getBoolean(true);
        }
        catch (Exception e)
        {
            // Log the exception
        }
        finally
        {
            // Save the config file
            configuration.save();
        }
        System.out.println("configutation Test: " + configValue);
    }
}
