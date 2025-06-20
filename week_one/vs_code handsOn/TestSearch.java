import java.util.ArrayList;
import java.util.List;

public class TestSearch {
    static List<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        products.add(new Product(101, "Laptop", "Electronics"));
        products.add(new Product(102, "Shoes", "Fashion"));
        products.add(new Product(103, "Notebook", "Educational"));
        products.add(new Product(104, "Table", "Furniture"));
        products.add(new Product(105, "Fan", "Electornics"));

        Products pro = new Products();
        Product prName = pro.findNameBs(products, "laptop");
        Product prID = pro.findIDBs(products,103);
        Product prCategory = pro.findCategoryLs(products, "Furniture");

        System.out.println(prName);
        System.out.println(prID);
        System.out.println(prCategory);

    }
}
