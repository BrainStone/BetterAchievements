package betterachievementsdemo;

import betterachievementsdemo.proxy.CommonProxy;
import betterachievementsdemo.registry.MetaData;
import betterachievementsdemo.registry.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.ID, name = Reference.NAME, version = Reference.VERSION_FULL)
public class BetterAchievementsDemo
{
    @Mod.Instance
    public BetterAchievementsDemo instance;

    @Mod.Metadata
    public ModMetadata metadata;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        metadata = MetaData.init(metadata);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
}
