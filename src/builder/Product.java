package builder;

import java.util.LinkedList;

public class Product {
    protected LinkedList<String> parts;
    public Product(){
        parts = new LinkedList<String>();
    }
    public void add(String part){
        parts.add(part);
    }
    public void showProduct(){
        System.out.println("Completed product: ");
        for(String part:parts){
            System.out.println(part);
        }
    }
}
