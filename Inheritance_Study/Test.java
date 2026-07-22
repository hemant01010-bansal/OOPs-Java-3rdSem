import java.util.Scanner;

public class Test {
    public static void main(){
        Student s1 = new Student();  //1st person called and after that Student class work.
        s1.getInfo();


        Student s = new Student();
        Teacher t = new Teacher();
        HR h = new HR();

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Who is going to come next(T/S/H)?");
            char ch = sc.next().charAt(0);
            Person p;

            if (ch == 'T'){
                p = t;
            }
            else if (ch == 'H'){
                p = h;
            }
            else{
                p = s;
            }
            p.getInfo();
        }
        //we change object binding at runtime.
    }
}