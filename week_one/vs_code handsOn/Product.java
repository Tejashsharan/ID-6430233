public class Product {
    int productID;
    String productName;
    String category;
    public Product(int pID, String pName, String cat){
        this.productID = pID;
        this.productName = pName;
        this.category = cat;
    }
    @Override
    public String toString() {
        return productID + " - " + productName + " (" + category + ")";
    }

}
