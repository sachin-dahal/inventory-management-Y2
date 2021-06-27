/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iic.appliances_IS;

/**
 *
 * @author Bibek Pradhan
 */
public class AppliancesData {

    private String id;
    private String name;
    private String category;
    private String quality;
    private String moduleNumber;
    private String price;
    private String warranty;

    public AppliancesData(String id, String name, String category, String quality, String moduleNumber, String price, String warranty) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quality = quality;
        this.moduleNumber = moduleNumber;
        this.price = price;
        this.warranty = warranty;
    }

    public AppliancesData(String[] arr) {
        this.id = arr[0];
        this.name = arr[1];
        this.category = arr[2];
        this.quality = arr[3];
        this.moduleNumber = arr[4];
        this.price = arr[5];
        this.warranty = arr[6];
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getQuality() {
        return quality;
    }

    public String getModuleNumber() {
        return moduleNumber;
    }

    public String getPrice() {
        return price;
    }

    public String getWarranty() {
        return warranty;
    }

}
