public class Notebook {
    String weight;
    int numberOfWeight;
    int price;
    int year;

    public Notebook(String weight, int price, int numberOfWeight, int year) {
        this.weight = weight;
        this.price = price;
        this.numberOfWeight = numberOfWeight;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good");
        } else if (this.price > 1000) {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkWeight() {
        if (this.numberOfWeight < 800 && this.numberOfWeight > 0) {
            System.out.println("This notebook is as light as a feather");
        } else if (this.numberOfWeight >= 800 && this.numberOfWeight <= 1600) {
            System.out.println("This notebook isn't too heavy");
        } else if (this.numberOfWeight > 1600 && this.numberOfWeight < 6000) {
            System.out.println("This notebook is heavy");
        } else {
            System.out.println("enter the correct number of weight");
        }
    }

    public void checkYearAndPrice(){
        if(this.price<=1000){
            System.out.print("This notebook is cheap");
            if (this.year<2019){
                System.out.println(" and old");
            }
            else if(this.year>=1000){
                System.out.println(" and new");
            }
        }
        else if(this.price>1000){
            System.out.print("This notebook is expensive");
            if (this.year<2019){
                System.out.println(" and old");
            }
            else if(this.year>=1000){
                System.out.println(" and new");
            }
        }

    }
}