public class QuesPract1 {
    public static boolean isPrime(int num){
        if (num==1 || num==2){
            return true;
        }
        int i=2;
        while (i<num){
            if (num%i==0){
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(){
        System.out.println("Testing.");

        //Q1 Print all numbers from 1 to n and for each number check whether it is even or odd.
        // int n=8,i=1;
        // String oddEven;
        // while (i<=n){
        //     if (i%2==0){
        //         oddEven="Even";
        //     }
        //     else{
        //         oddEven="Odd";
        //     }
        //     System.out.println(i + "-->" + oddEven);
        //     i++;
        // }

        //Q2 Multiplication table of integer n.
        // int n=8,i=1;
        // while (i<=10){
        //     System.out.println(n*i);
        //     i++;
        // }

        //Q3 Prime numbers in a range
        int start=2,end=15;
        while (start<end) {
            if (isPrime(start)){
                System.out.println(start);
            }
            start++;
        }

        //Q4 
        //Q5


        //UCampus Cafeteria Management System Assignment
        FoodItem item1= new FoodItem();
        FoodItem item2= new FoodItem();
        FoodItem item3= new FoodItem();

        item1.addFoodItem(101, "Veg Sandwich", 80);
        item2.addFoodItem(102, "Cold Coffee", 120);
        item3.addFoodItem(103, "Paneer Wrap", 150);

        FoodItem.displayCafeteriaDetails();

        item1.displayItemDetails();
        item2.displayItemDetails();
        
        FoodItem.changeServiceCharge(20);
        FoodItem.displayCafeteriaDetails();
        
        item1.displayItemDetails();
        item2.displayItemDetails();
    }

    
}
