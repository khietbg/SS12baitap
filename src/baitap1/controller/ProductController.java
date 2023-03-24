package baitap1.controller;

import baitap1.modol.Product;
import baitap1.service.ProductServiceIMPL;

import java.util.List;

public class ProductController {
    ProductServiceIMPL productServiceIMPL= new ProductServiceIMPL();
    public List<Product> showProduct(){
        return productServiceIMPL.findAll();
    }
    public void createProduct(Product product){
        productServiceIMPL.save(product);
    }
    public void delete(int id){
        productServiceIMPL.delete(id);
    }
    public List<Product> searchByName(String search){
        return productServiceIMPL.search(search);
    }
    public void sortByPrice(){
        productServiceIMPL.sortByPrice();
    }
}
