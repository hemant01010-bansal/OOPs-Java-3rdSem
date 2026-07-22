import java.util.Scanner;

public class Test2 {
    public static void main(){
        System.out.println("Testing.");

        User u = new User();
        Customer c = new Customer();
        Admin a = new Admin();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Who is going to come next(T/S/H)?");
            char ch = sc.next().charAt(0);
            if (ch == 'C'){
                u = c;
            }
            else{
                u = a;
            }
            u.getInfo();
        }
    }
}
