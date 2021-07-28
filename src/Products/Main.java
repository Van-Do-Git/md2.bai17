package Products;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Productt prd1 = new Productt(1, "Hao hao", 15000);
        Productt prd2 = new Productt(1, "Hao hao", 16000);
        Productt prd3 = new Productt(1, "Hao hao", 17000);
        Productt prd4 = new Productt(1, "Hao hao", 18000);
        Productt prd5 = new Productt(1, "Hao hao", 19000);
        List<Productt> list = new ArrayList<>();
        list.add(prd1);
        list.add(prd2);
        list.add(prd3);
        list.add(prd4);
        list.add(prd5);
        try {
            writeFileProduct(list);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        try {
            list = readFileProduct();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        for(Productt productt: list){
            System.out.println(productt);
        }
    }

    public static void writeFileProduct(List<Productt> products) throws IOException {
        FileOutputStream fos = new FileOutputStream("listproduct");
        ObjectOutputStream obj = new ObjectOutputStream(fos);
        obj.writeObject(products);
        obj.close();
        fos.close();
    }
    public static List<Productt> readFileProduct() throws IOException, ClassNotFoundException {
        List<Productt> productList = new ArrayList<>();
        FileInputStream fis = new FileInputStream("listproduct");
        ObjectInputStream obj = new ObjectInputStream(fis);
        productList = (List<Productt>) obj.readObject();
        fis.close();
        obj.close();
        return productList;
    }
}
