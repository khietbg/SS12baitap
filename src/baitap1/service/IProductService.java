package baitap1.service;

import baitap1.modol.Product;

import java.util.List;

public interface IProductService{
    List<Product> findAll();
    void save(Product product);
    void delete(int id);
    void sort();
    List<Product> search(String search);
    void sortByPrice();
}
