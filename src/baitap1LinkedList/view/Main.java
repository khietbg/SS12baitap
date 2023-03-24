package baitap1LinkedList.view;

import baitap1.config.Config;

public class Main {
    public static void main(String[] args) {
        System.out.println("***********Product Managerment*********");
        while (true){
            System.out.println("1. show product");
            System.out.println("2. create product");
            System.out.println("3. update product");
            System.out.println("4. delete product");
            System.out.println("5. search name product");
            System.out.println("6. sort product");
            System.out.println("7. exit");
            System.out.println("nhap lua chon: ");
            int choice = Config.scanner().nextInt();
            switch (choice){
                case 1:
                   new ProductView().showProduct();
                   break;
                case 2:
                    new ProductView().createProduct();
                    break;
                case 3:
                    new ProductView().deleteProduct();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    break;
            }

        }
    }
}
