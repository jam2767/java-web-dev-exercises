package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    //ClassVariables
    //arrayList
    private ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
    private Date lastUpdated;

    //constructors
    public Menu() {
        this.lastUpdated = new Date();
    }

    //methods
    //getters and setters
    public ArrayList<MenuItem> getMenuItems() { return this.menuItems; }
    public void setMenuItems(ArrayList<MenuItem> menuItems) { this.menuItems = menuItems}

    public Date getLastUpdated() { return this.lastUpdated; }
    public void setLastUpdated(Date lastUpdated) { this.lastUpdated = lastUpdated; }
}
