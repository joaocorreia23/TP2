public class Product {

    private String name;
    private String description;
    private String picture;
    private String category;
    private Category cat;
    private int price;
    private String unityType;

    public Product(String name , String description , String picture , Category cat , int price , String unityType) {
        this.name = name;
        this.description = description;
        this.picture = picture;
        this.cat = cat;
        this.price = price;
        this.unityType = unityType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUnityType() {
        return unityType;
    }

    public void setUnityType(String unityType) {
        this.unityType = unityType;
    }
}
