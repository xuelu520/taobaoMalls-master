package com.taobao.search.pojo;

/**
 * Created by chenwei on 2017/11/15.
 */
public class Item {

    private String id;
    private String title;
    private Long price;

    private String image;
    private String category_name;
    private String item_des;

    private String Sell_point;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getItem_des() {
        return item_des;
    }

    public void setItem_des(String item_des) {
        this.item_des = item_des;
    }


    public String getSell_point() {
        return Sell_point;
    }

    public void setSell_point(String sell_point) {
        Sell_point = sell_point;
    }
}
