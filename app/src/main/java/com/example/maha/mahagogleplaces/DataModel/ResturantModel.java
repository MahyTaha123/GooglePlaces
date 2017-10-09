package com.example.maha.mahagogleplaces.DataModel;

import java.io.Serializable;

/**
 * Created by Maha on 08/10/2017.
 */

public class ResturantModel implements Serializable {

    String  id,name, icon;
    boolean open_now;
    float rating;

    public ResturantModel() {}


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    public boolean isOpen_now() {
        return open_now;
    }

    public float getRating() {
        return rating;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setOpen_now(boolean open_now) {
        this.open_now = open_now;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }







}
