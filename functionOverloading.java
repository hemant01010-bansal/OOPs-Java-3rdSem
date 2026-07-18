public class functionOverloading {
    static void add(int a, int b){
        System.out.println(a+b);
    }

    static void add(double a, double b){
        System.out.println(a+b);
    }

    static void add(String a, String b){
        System.out.println(a+b);
    }

    public static void main(){
        //we see that if we want to add int or double or string we have to call same function name with change only in parameter, we don't create function with diff name for diff data type.
        add(5, 5); //10
        add(5.5, 5.2); //10.7
        add("Hemant", "Bansal"); //HemantBansal

        //function Over riding
        
    }
}
