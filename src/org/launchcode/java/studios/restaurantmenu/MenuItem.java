package org.launchcode.java.studios.restaurantmenu;

public class MenuItem {
    private String name;
    private Double price;
    private String description;
    private String category;
    private Boolean isNewItem;

    public MenuItem (String name, Double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;

        this.category = "No category";
        this.isNewItem = false;
    }

    public MenuItem (String name, Double price, String description, String category, Boolean isNewItem) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNewItem = isNewItem;
    }

    //Methods
    //Getters and Setters access and mutate class variables
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public Double getPrice() { return this.price; }
    public void setPrice(Double price) { this.price = price; }

    public String getDescription() { return this.description; }
    public void setDescription(String description) { this.description = description; }

    public String getCategory() { return this.category; }
    public void setCategory(String category) { this.category = category; }

    public Boolean getIsNewItem() { return this.isNewItem; }
    public void setIsNewItem(Boolean isNewItem) { this.isNewItem = isNewItem; }


}
