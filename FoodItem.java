public class FoodItem {
    int itemId;
    String itemName;
    double price;

    static String cafeteriaName="UCampus Cafeteria";
    static double serviceCharge=10.0;
    static int totalFoodItems=0;

    void addFoodItem(int id, String name, double price){
        this.itemId=id;
        this.itemName=name;
        this.price=price;
        totalFoodItems+=1;
    }

    void FinalPrice(){
        this.price=this.price+((this.price*serviceCharge)/100);
    }

    void displayItemDetails(){
        System.out.println("Item Id: "+this.itemId);
        System.out.println("Item Name: "+this.itemName);
        System.out.println("Item Price: "+this.price);
    }

    static void changeServiceCharge(double newCharge){
        serviceCharge=newCharge;
    }

    static void displayCafeteriaDetails(){
        System.out.println("Cafeteria Name: "+cafeteriaName);
        System.out.println("Number of Food Items: "+totalFoodItems);
        System.out.println("Service Charge: "+serviceCharge);
    }
}