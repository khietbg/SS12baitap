package baitap1.service;

import baitap1.modol.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductServiceIMPL implements IProductService {
    public static List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(1,"ip14promax",1000));
        productList.add(new Product(2,"ip13promax",900));
        productList.add(new Product(3,"ip12promax",800));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        for (Product pro:productList) {
            if (pro.getId()==product.getId()){
                pro.setName(product.getName());
                pro.setPrice(product.getPrice());
                return;
            }
        }
        productList.add(product);
    }

    @Override
    public void delete(int id) {
        for (Product pro:productList) {
           if (pro.getId()==id){
               productList.remove(pro);
               return;
           }
        }
    }

    @Override
    public void sort() {

    }

    @Override
    public List<Product> search(String search) {
        List<Product> listSearch= new ArrayList<>();
        for (Product pro:productList) {
            if (pro.getName().contains(search)){
                listSearch.add(pro);
            }
        }
        System.out.println("list search===>"+ listSearch);
        return listSearch;

    }

    @Override
    public void sortByPrice() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice()>o2.getPrice()){
                    return 1;
                }else if (o1.getPrice()<o2.getPrice()){
                    return -1;
                }else
                return 0;
            }
        });
    }
}
