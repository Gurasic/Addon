package examplemod;


import examplemod.Multiblocks.SpaceTest;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import examplemod.proxies.*;

@Mod(modid = examplemod.MOD_ID, name = examplemod.MOD_NAME, version = examplemod.MOD_VERSION)

public class examplemod {

    public static final String MOD_ID = "examplemod";
    public static final String MOD_NAME = "Example Mod";
    public static final String MOD_VERSION = "1.0";
    public static final String ID = "examplemod";
    @SidedProxy(serverSide = "examplemod.proxies.CommonProxy", clientSide = "examplemod.proxies.ClientProxy", modId = MOD_ID)

    public static CommonProxy proxy;




    //PRE INIT
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(SpaceTest.class);
        proxy.preLoad();
    }
    //INIT
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        proxy.onLoad();
    }

    //POST INIT
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postLoad();
    }
}