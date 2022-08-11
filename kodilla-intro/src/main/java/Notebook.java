public class Notebook {
    int weight;
    int price;
int year;
    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year= year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is cheap.");
        } else if (this.price >= 600 && this.price <= 1000 ) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight <= 600) {
            System.out.println("This notebook weight is light.");
        } else if (this.weight > 600 && this.weight < 2000) {
            System.out.println("This notebook weight is good.");
        } else {
            System.out.println("This notebook weight is heavy.");
        }
    }
        public void checkPriceAndYear() {
            if (this.price < 600&&this.year>2020) {
                System.out.println("This notebook is cheap. And good year");
            } else if (this.price >= 600 && this.price <= 1000&this.year>=2015 ) {
                System.out.println("The price is good. and not bad year");
            } else if (this.price > 600&&this.year>2020&this.year<2025) {
                System.out.println("The price is expensive. and best year");
            } else if (this.price ==1000&&this.year<=2005) {
                System.out.println("This notebook prise is good.not so old");
            } else if (this.price <600&&this.year<=2000) {
                System.out.println("This notebook prise is good.but very old");
            }
        }
    }




