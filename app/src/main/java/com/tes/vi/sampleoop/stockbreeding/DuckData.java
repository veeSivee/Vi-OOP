package com.tes.vi.sampleoop.stockbreeding;

/**
 * Created by taufiqotulfaidah on 10/6/16.
 */

public class DuckData {
    public String hoby;
    protected String hobyProtected;
    private String hobyPrivate;

    private String sound;
    private String color;
    private String gender;

    public String getHoby() {
        return hoby;
    }

    public void setHoby(String hoby) {
        this.hoby = hoby;
    }

    public String getHobyProtected() {
        return hobyProtected;
    }

    public void setHobyProtected(String hobyProtected) {
        this.hobyProtected = hobyProtected;
    }

    public String getHobyPrivate() {
        return hobyPrivate;
    }

    public void setHobyPrivate(String hobyPrivate) {
        this.hobyPrivate = hobyPrivate;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
