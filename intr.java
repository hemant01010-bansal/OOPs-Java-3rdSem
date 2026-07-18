public class intr {
    public static void main(String[] colors) {
        System.out.println("Hello, Hemant!");
        //Java is a high level, object oriented language developed by Sun Microsystems (now owned by oracle)
        //It is famous for it's principle : "Write Once, Run Anywhere (WORA)". This mean that we write our java program once and it can run on Window, Linux or macOS without changing the source code.
        //Example: Hello.java ---> Hello.class(Byte Code) with the help of 'javac' ---> Machine Code with the help of JVM. We can run the .class code on any OS(window, macOS etc) no need of compile again. Every OS has it's own jvm that convert same byte code into machine code require by the operating system.

        //To print text and variable inside 'System.out.println()' we use '+' operator
        //Ex: int age=18; System.out.println("I am " +age +" old.")

        //identifers are name of variable, function, classes etc.
        //variables can store data.
        //instance variable belongs to every object. Every object gets its own seperate copy of the variable.
        //static variable belongs to the class, not to the individual objects.

        //Variables
        int myNum=15;
        System.out.println(myNum);

        //use of 'final' keyword
        // final int num2=20; //if we don't want others to overwrite existing values then we use 'final' keyword.

        //float variables
        float num3=20.5F;  //java decimal are double by default, because double has high accuracy, 20.5 is double so to make it float we use 'f' or 'F'. Using 'f' is preferred and common approach.
        System.out.println(num3);

        //use of '+' operator in strings
        String firstName="Hemant";
        String secondName="Bansal";
        System.out.println(firstName+ " " +secondName);

        //mixing text & numbers
        int x=5,y=6;
        System.out.println("The sum is "+x+y); //The sum is 56
        System.out.println("The sum is "+(x+y));  //The sum is 11, in this line parantheses make sure x+y is calculated first

        //Why we use Path variables while setting java?
        //

        //What is the purpose of main wrt JBM?
        //

        //semantic error means code is syntaxially correct but the code doesn't solve the problem

        int $x=8; //identifers start with '_', '$' but can't start with digit
        System.out.println($x);

        //constant/ Enums names are in UPPERCASE letter. like: COLORS
        byte b=Byte.MIN_VALUE;
        System.out.println(b); //-128
        int c=Integer.MIN_VALUE;
        System.out.println(c);  //-2147483648
        int d=Integer.MAX_VALUE;
        System.out.println(d);
        
        char e=Character.MAX_VALUE;
        System.out.println(e);

        byte a=12;
        System.out.println(a);

        //Type Casting;
        int f=10;
        byte g=(byte)f;

        long l=123;
        f=(int)l;
    }
}
