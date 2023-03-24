package baitap1LinkedList.controller;

import baitap1.modol.Product;
import baitap1LinkedList.service.ProductService;

import java.util.List;

public class ProductController {
    ProductService productService = new ProductService();
    public List<Product> showProduct(){
      return productService.findAll();
    }
    public void add(Product product){
        productService.save(product);
    }
    public void delete(int id){
        productService.delete(id);
    }
}
