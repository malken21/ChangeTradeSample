package marumasa.changetradesample;

import org.bukkit.plugin.java.JavaPlugin;

public final class ChangeTradeSample extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        // イベントを登録する処理
        getServer().getPluginManager().registerEvents(new Events(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
