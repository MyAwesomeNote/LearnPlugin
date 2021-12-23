package com.pleahmacaka.learnplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

@SuppressWarnings({"ConvertToBasicLatin", "SpellCheckingInspection"})
public final class LearnPlugin extends JavaPlugin {

    static ConsoleCommandSender sender;

    @Override
    public void onEnable() {
        sender.sendMessage(ChatColor.AQUA + "!!!Enabled LearnPlugin!!!");

        // 명령어를 등록합니다.
        Objects.requireNonNull(this.getCommand("명령어")).setExecutor(new LearnCommand());
    }
}
