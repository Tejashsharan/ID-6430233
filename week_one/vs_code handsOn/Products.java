import java.util.Comparator;
import java.util.List;

public class Products {

    public Product findNameLs(List<Product>products, String pName){
        for(Product x : products){
            if(x.productName.equalsIgnoreCase(pName)){
                return x;
            }
        }
        return null;
    }

    public Product findNameBs(List<Product>products, String pName){
        products.sort(Comparator.comparing(x -> x.productName.toLowerCase()));
        int s = 0;
        int e = products.size() - 1;
        while(s <= e){
            int mid = (s + e)/2;
            Product miProduct = products.get(mid);
            int comp = pName.compareToIgnoreCase(miProduct.productName);
            if(comp == 0)
                return products.get(mid);
            else if(comp > 0){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        return null;
    }

    public Product findIDLs(List<Product>products, int pID){
        for(Product x : products){
            if(x.productID == pID){
                return x;
            }
        }
        return null;
    }

    public Product findIDBs(List<Product>products, int pID){
        products.sort(Comparator.comparing(x -> x.productID));
        int s= 0;
        int e = products.size() - 1;
        while(s <= e){
            int mid = (s + e)/2;
            Product miProduct = products.get(mid);
            int comp = miProduct.productID;
            if(comp == pID)
                return products.get(mid);
            else if(comp < pID){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        return null;
    }

    public Product findCategoryLs(List<Product>products, String pCategory){
        for(Product x : products){
            if(x.category.equalsIgnoreCase(pCategory)){
                return x;
            }
        }
        return null;
    }

    public Product findCategoryBs(List<Product>products, String pCategory){
        products.sort(Comparator.comparing(x -> x.category.toLowerCase()));
        int s= 0;
        int e = products.size() - 1;
        while(s <= e){
            int mid = (s + e)/2;
            Product miProduct = products.get(mid);
            int comp = pCategory.compareToIgnoreCase(miProduct.category);
            if(comp == 0)
                return products.get(mid);
            else if(comp > 0){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        return null;
    }
}
