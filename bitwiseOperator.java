import java.util.Scanner;

public class bitwiseOperator {
    public static void main(){
        System.out.println("Testing.");
        //'&' --> binary operator, it need two operands
        //0 & 0 --> 0
        //0 & 1 --> 0
        //1 & 0 --> 0
        //1 & 1 --> 1

        //'&' --> Bitwise AND
        //'|' --> BitwiseOR

        System.out.println(4&7); //4
        System.out.println(6&15); //6
        System.out.println(9|3); //11
        System.out.println(8<<1);

        //left shift (<<)
        //ex: 2<<1  -> 0010 -> 0100
        //right shift (<<)
        //ex: 2>>1 -> 0010 -> 0001

        //XOR operator(^)
        //1^1=0
        //0^0=0
        //1^0=1
        //0^1=1

        //Q1 --> Given a num, Find out is the number even or odd without using mod operator.
        //Q2 --> Fint is nth bit of a number is set or not (if 1 set else not).
        //Q3 --> Find out how many one's present in a number binary representation.
        //Q4 --> Find Binary representation of a number.

        Scanner sc = new Scanner(System.in);
        //Ans-1
        System.out.println("is Even or Odd");
        int num1 = sc.nextInt();
        int x = num1&1;
        if (x=='0'){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        //Ans-2
        System.out.println("is nth bit set or not");
        int num2 = sc.nextInt();
        int shift = sc.nextInt();
        num2=num2>>shift;
        num2=num2&1;
        if (num2==1){
            System.out.println("Set");
        }
        else{
            System.out.println("Not Set");
        }

        //Ans-3
        System.out.println("count no of 1");
        int num3 = sc.nextInt();
        int noOf1 = 0;
        while (num3>0){
            int a=num3&1;
            if (a==1){
                noOf1++;
            }
            num3=num3>>1;
        }
        System.out.println(noOf1);


        //Ans-4
        System.out.println("Find Binary representation of a num");
        int num4 = sc.nextInt();
        String num4Binary="";
        while (num4!=0){
            num4Binary=(num4&1)+num4Binary;
            num4=num4>>1;
        }
        System.out.println(num4Binary);



    }
}
