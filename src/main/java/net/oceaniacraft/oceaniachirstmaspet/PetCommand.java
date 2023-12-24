package net.oceaniacraft.oceaniachirstmaspet;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Random;

public class PetCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if(!commandSender.hasPermission("oceaniachristmaspet.admin")){
            commandSender.sendMessage(Utils.chat("&cYou do not have permission to send this command!"));
            return true;
        }

        Player player = Bukkit.getPlayer(args[0]);
        if(player == null){
            commandSender.sendMessage(Utils.chat("&cPlayer not found!"));
            return true;
        }

        if(player.hasPermission("advancedpets.pet.babysantaclaus")){
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + args[0] + " permission set advancedpets.pet.babygrinch");
            player.sendMessage(Utils.chat("&aYou have been given the &2Grinch &apet!"));
        }else if (player.hasPermission("advancedpets.pet.babygrinch")){
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + args[0] + " permission set advancedpets.pet.babysantaclaus");
            player.sendMessage(Utils.chat("&aYou have been given the &2Baby Santa Claus &apet!"));
        }else {
            String pet = new Random().nextInt(2) == 0 ? "advancedpets.pet.babysantaclaus" : "advancedpets.pet.babygrinch";
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + args[0] + " permission set " + pet);
            if(pet.equalsIgnoreCase("advancedpets.pet.babysantaclaus")){
                player.sendMessage(Utils.chat("&aYou have been given the &2Baby Santa Claus &apet!"));
            }else{
                player.sendMessage(Utils.chat("&aYou have been given the &2Grinch &apet!"));
            }
        }

        return false;
    }
}
