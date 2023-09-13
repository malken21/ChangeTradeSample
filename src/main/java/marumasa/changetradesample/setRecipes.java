package marumasa.changetradesample;

import org.bukkit.Material;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MerchantRecipe;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.List;

public class setRecipes extends BukkitRunnable {

    private final Villager villager;

    public setRecipes(Villager villager) {
        this.villager = villager;
    }

    @Override
    public void run() {

        // もし、村人の職業が防具鍛冶だったら
        if (villager.getProfession().equals(Villager.Profession.ARMORER)) {

            // 空の取引内容を作成する
            List<MerchantRecipe> trades = new ArrayList<>();

            // 村人が売るアイテム
            ItemStack sell = new ItemStack(Material.EMERALD);
            sell.setAmount(48); // 村人が売るアイテムの数を48に設定

            // 村人が買うアイテム (1つめ)
            ItemStack buy = new ItemStack(Material.DIAMOND_BLOCK);

            // 村人が買うアイテム (2つめ)
            ItemStack buyB = new ItemStack(Material.AIR);

            // 村人が売るアイテムなどを設定 ここで 取引できる最大数 などを指定できる
            MerchantRecipe newTrade = new MerchantRecipe(sell, 0, 100, true);
            // 村人が買うアイテムを設定 (1つめ)
            newTrade.addIngredient(buy);
            // 村人が買うアイテムを設定 (2つめ)
            newTrade.addIngredient(buyB);

            // 取引内容を追加
            trades.add(newTrade);

            // 村人の取引内容を変更する
            villager.setRecipes(trades);
        }
    }
}
