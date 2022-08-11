import javax.swing.*;

public class Firstclass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000,2005);
        System.out.println("notebook.price: " + notebook.price + "   notebook.weight:  " + notebook.weight + "  notebook.year"+notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkPriceAndYear();

        Notebook heavyNotebook = new Notebook(2000, 1500,2022);
        System.out.println("heavyNotebook.weight: " + heavyNotebook.weight + "   heavyNotebook.price: " + heavyNotebook.price+"   heavyNotebook.year: " + heavyNotebook.year);
        heavyNotebook.checkWeight();
        heavyNotebook.checkPrice();
        heavyNotebook.checkPriceAndYear();


        Notebook oldNotebook = new Notebook(1600, 500,1986);
        System.out.println("oldNotebook.weight: " + oldNotebook.weight + "    oldNotebook.price: " + oldNotebook.price+"    oldNotebook.year: " + oldNotebook.year);
        oldNotebook.checkWeight();
        oldNotebook.checkPrice();
        oldNotebook.checkPriceAndYear();
    }
}