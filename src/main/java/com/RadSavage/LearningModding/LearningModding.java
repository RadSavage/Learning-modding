package com.RadSavage.LearningModding;

import com.RadSavage.LearningModding.proxy.IProxy;
import com.RadSavage.LearningModding.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)

public class LearningModding
{
    @Mod.Instance(Reference.MOD_ID)
    public static LearningModding instance;

    @SidedProxy (clientSide = "com.RadSavage.LearningModding.proxy.ClientProxy", serverSide = "com.RadSavage.LearningModding.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
