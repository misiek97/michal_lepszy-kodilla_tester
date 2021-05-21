public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkWeight() {
        if (this.weight < 1600) {
            System.out.println("This notebook is light.");
        } else if (1600 < this.weight && this.weight < 2500) {
            System.out.println("The notebook is not so heavy.");
        } else
            System.out.println("This notebook is very heavy.");
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (600 < this.price && this.price < 1000) {
            System.out.println("The notebook price is good.");
        } else
            System.out.println("This notebook is expensive.");
    }

    public void checkYear() {
        if (this.year < 2011) {
            System.out.println("This notebook is old.");
        } else if (2011 < this.year && this.year < 2018) {
            System.out.println("The notebook is not so old.");
        } else
            System.out.println("This notebook is rather new.");
    }
}