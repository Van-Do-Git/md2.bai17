package Products;

import java.io.Serializable;

public class Productt implements Serializable {
    private int codeProduct;
    private String brand;
    private int prime;

    public Productt() {
    }

    public Productt(int codeProduct, String brand, int prime) {
        this.codeProduct = codeProduct;
        this.brand = brand;
        this.prime = prime;
    }

    public int getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(int codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrime() {
        return prime;
    }

    public void setPrime(int prime) {
        this.prime = prime;
    }

    @Override
    public String toString() {
        return "Product{" +
                "codeProduct=" + codeProduct +
                ", brand='" + brand + '\'' +
                ", prime=" + prime +
                '}';
    }

}
