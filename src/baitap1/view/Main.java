package baitap1.view;

import baitap1.config.Config;

public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("***************PRODUCT MANAGERMENT***********");
            System.out.println("1. show product");
            System.out.println("2. Create product");
            System.out.println("3. update product");
            System.out.println("4. delete product");
            System.out.println("5. searchName");
            System.out.println("6. sort by price");
            System.out.println("7. exit");
            System.out.println("nhap lua chon: ");

            int choice= Config.scanner().nextInt();
            switch (choice){
                case 1:
                    new ProductView().showProduct();
                    break;
                case 2:
                    new ProductView().create();
                    break;
                case 3:
                    new ProductView().updateProduct();
                    break;
                case 4:
                    new ProductView().delete();
                    break;
                case 5:
                    new ProductView().searchName();
                    break;
                case 6:
                    new ProductView().sortByPrice();
                    break;
            }
        }
    }
}