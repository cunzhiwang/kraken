package com.tencent;

import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescriptionBuilder;

public final class Kraken extends JavaPlugin {
    public static final Kraken INSTANCE = new Kraken();

    private Kraken() {
        super(new JvmPluginDescriptionBuilder("com.tencent.kraken", "1.0-SNAPSHOT")
                .name("kraken")
                .author("cunzhiwang")
                .build());
    }

    @Override
    public void onEnable() {
        getLogger().info("Plugin loaded!");
    }
}