package com.ibm.Inventory;
import java.util.Date;    
                                                              

public class Main {
    public static void main(String[] args) {
        Item[] myInventory = new Item[50];

        myInventory[0] = new Book("The last shio", 35.99, 5, "DJ Abella", "IBM", "Fiction");
        myInventory[1] = new Book("The last answer", 100, 10, "DJ Abell", "LOL", "Sci-Fiction");
        myInventory[2] = new CD("I am > I was", 25.00, 100,  new Artist("21 svage"), new Date());

        System.out.println(myInventory[2].getReleaseDate());
        
    }
}
