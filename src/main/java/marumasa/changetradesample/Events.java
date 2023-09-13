package marumasa.changetradesample;

import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.VillagerCareerChangeEvent;

public class Events implements Listener {

    private final ChangeTradeSample pl;

    public Events(ChangeTradeSample plugin) {
        pl = plugin;
    }

    @EventHandler
    public void onCareerChange(VillagerCareerChangeEvent event) {
        // 村人の職業が変更されると発動する

        // 職業が変更された村人を取得
        Villager villager = event.getEntity();

        new setRecipes(villager).runTaskLater(pl, 1);
    }
}
