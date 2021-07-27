package PracticeReadWriteObj;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Vũ Kiều Anh", "Hà Nội"));
        products.add(new Product(2, "Nguyễn Minh Quân", "Hà Nội"));
        products.add(new Product(3, "Đặng Huy Hoà", "Đà Nẵng"));
        products.add(new Product(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        products.add(new Product(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToFile("student.txt", products);
        List<Product> productDataFromFile = readDataFromFile("student.txt");
        for (Product product : productDataFromFile){
            System.out.println(product);
        }
    }
    public static List<Product> readDataFromFile(String path){
        List<Product> products = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return products;
    }
}
