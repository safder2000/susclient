package net.suspoocha.susclient.module;

import net.minecraft.client.MinecraftClient;

public class Mod {
    private String name;
    private String discription;
    private int key;
    private Category category;
    private boolean enabled;
protected MinecraftClient mc = MinecraftClient.getInstance();
    public Mod(String name, String discription, Category category) {
        this.name = name;
        this.discription = discription;
        this.category = category;

    }

    public void toggle() {
        this.enabled = !this.enabled;
        if (enabled) {
            onEnable();
        } else {
            onDisable();
        }
    }

    public void onEnable() {

    }

    public void onDisable() {

    }
    public  void onTick(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setEnable(boolean enable) {
        this.enabled = enable;
        if (enabled) {
            onEnable();
        } else {
            onDisable();
        }
    }

    public String getDiscription() {
        return discription;
    }

    public int getKey() {
        return key;
    }

    public Category getCategory() {
        return category;
    }

    public boolean isEnabled() {
        return enabled;
    }


    public enum Category {
        COMBACT, MOVEMENT, RENDER, EXPLOIT, WORLD
    }
}
