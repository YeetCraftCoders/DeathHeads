package me.flour.deathheads;


import me.flour.deathheads.events.DeathEvent;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.plugin.SimplePlugin;

public class Initialize extends SimplePlugin {





    @Override
    protected void onPluginStart() {

        Common.setLogPrefix("&1[DEATH HEADS] &2");
        registerEvents(new DeathEvent());
        Common.logFramed("&1Załadowano główki. ");
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }


}
