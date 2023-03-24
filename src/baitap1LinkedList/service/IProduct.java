package baitap1LinkedList.service;

import baitap1.modol.Product;

import java.util.List;

public interface IProduct {
    List<Product> findAll();
    void save(Product product);
    void delete(int id);
    void sort();
    void searchByName(String search);

}
