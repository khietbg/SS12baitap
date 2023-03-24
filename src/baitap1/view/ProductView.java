package baitap1.view;

import baitap1.config.Config;
import baitap1.controller.ProductController;
import baitap1.modol.Product;

import java.util.List;

public class ProductView {
    ProductController productController = new ProductController();
    public void showProduct(){
        System.out.println("******ID******Name*****Price***");
        for (Product pro:getProduct()) {
            System.out.println("   "+ pro.getId()+"    "+pro.getName()+"     "+pro.getPrice()+"$");
        }
    }
    public void create(){
        int id = getProduct().get(getProduct().size()-1).getId()+1;
        System.out.println("product name: ");
        String name = Config.scanner().nextLine();
        System.out.println("product price: ");
        int price = Config.scanner().nextInt();
        productController.createProduct(new Product(id,name,price));
    }
    public void updateProduct(){
        System.out.println("nhap id up date");
        int idUp = Config.scanner().nextInt();
        for (Product pro:getProduct()) {
            if (pro.getId() == idUp){
                System.out.println("nhap ten can sua");
                String nameUp= Config.scanner().nextLine();
                System.out.println("nhap price can sua: ");
                int priceUP= Config.scanner().nextInt();
                productController.createProduct(new Product(idUp,nameUp,priceUP));
                return;
            }
        }
        System.err.println("id khong ton tai");
    }
    public void delete(){
        System.out.println("nhap id muon xoa");
        int id = Config.scanner().nextInt();
        for (Product product:getProduct()) {
            if (product.getId()==id){
                productController.delete(id);
                return;
            }
        }
        System.err.println("id k hop le");
    }
    public void searchName(){
        System.out.println("nhap ten muon tim kiem: ");
        String search = Config.scanner().nextLine();
       List<Product> listSearch = productController.searchByName(search);
//        System.out.println("list search---->"+listSearch);
        System.out.println("******ID******Name*****Price***");
        for (Product pro:listSearch) {
            System.out.println("   "+ pro.getId()+"    "+pro.getName()+"     "+pro.getPrice()+"$");
        }
    }
    public void sortByPrice(){
        productController.sortByPrice();
    }

    private List<Product> getProduct() {
        return productController.showProduct();
    }
}
