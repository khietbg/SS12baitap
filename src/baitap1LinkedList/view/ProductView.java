package baitap1LinkedList.view;

import baitap1.config.Config;
import baitap1.modol.Product;
import baitap1LinkedList.controller.ProductController;

import java.util.List;

public class ProductView {
    ProductController productController= new ProductController();
    public void showProduct(){
        System.out.println("****ID*******Name*******Price");
        for (Product pro:getProducts()) {
            System.out.println("   "+pro.getId()+"    "+pro.getName()+"        "+pro.getPrice());
        }
    }
    public void createProduct(){
        int id = getProducts().get(getProducts().size()-1).getId()+1;
        System.out.println("nhap ten muon them");
        String name = Config.scanner().nextLine();
        System.out.println("nhap gia muon them");
        int price = Config.scanner().nextInt();
        productController.add(new Product(id,name,price));
    }
    public void deleteProduct(){
        System.out.println("nhap id muon xoa");
        int id = Config.scanner().nextInt();
        for (Product pro:getProducts()) {
            if (pro.getId()==id){
                productController.delete(id);
return;
            }
        }
        System.err.println("id khong hop le!");
    }

    private List<Product> getProducts() {
        return productController.showProduct();
    }
}
