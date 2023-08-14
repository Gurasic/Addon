package examplemod.proxies;

import examplemod.examplemod;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;

import net.minecraft.world.World;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;




@Mod.EventBusSubscriber(modid = examplemod.MOD_ID)
public class CommonProxy {

    public void preLoad() {
    }

    public void onLoad() {

    }

    public void postLoad() {

    }

    public void onServerStopping(World world) {

    }


    @SubscribeEvent
    public void onWorldLoad(WorldEvent.Load event) {
    }

    @SubscribeEvent
    public void onWorldUnload(WorldEvent.Unload event) {
        onServerStopping(event.getWorld());
    }

    @SubscribeEvent(priority = EventPriority.NORMAL)
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
    }

}