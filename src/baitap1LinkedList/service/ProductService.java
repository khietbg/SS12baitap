package baitap1LinkedList.service;

import baitap1.modol.Product;

import java.util.LinkedList;
import java.util.List;

public class ProductService implements IProduct{
    public static List<Product> productList = new LinkedList<>();
    static {
        productList.add(new Product(1,"iphone11",1000));
        productList.add(new Product(2,"iphone12",1200));
        productList.add(new Product(3,"iphone13",1300));
        productList.add(new Product(4,"iphone14",1400));
    }
    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public void delete(int id) {
        for (Product pro:productList) {
            if (pro.getId()==id){
                productList.remove(pro);
            }
        }
    }

    @Override
    public void sort() {

    }

    @Override
    public void searchByName(String search) {

    }
}
