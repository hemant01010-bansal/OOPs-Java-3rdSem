//Date-02/07/2026
public class lec2 {
    public static void main(String[] args) {
        //java program written on one operating system can run on another operating system without changing its source code.
        System.out.println("Hello, World!");
        //114.8 , 1148 is a number store and then store power that is 1
        float a=Float.MAX_VALUE;
        System.out.println(a);
        
        double b=Double.MAX_VALUE;
        System.out.println(b);
        
        long c=14;
        float d=c;
        System.out.println(d);
        
        // float e=15f;
        // long g=(float)e;
        // System.out.println(g);

        char ch=65;
        System.out.println(ch);

        char ch2='B';  //char typecasting is possible as we convert char to int
        System.out.println((int)ch2);

        //we can't do typecasting with boolean, because in java boolean is not considered as numberic type 0 or 1
        // boolean b1=false;
        // int j=(int)b1; //wrong   
        // System.out.println(j);

        float f2=12.32f;  //12.32 is a double so take it takes 8 bytes to store so by adding 'f' we tell to java that it is float
        System.out.println(f2);

        // int age=18;
        //age-->variables
        //18-->literal

        //Different types of literals
        //1. Integer Literals --> represent whole numbers
        //decimal (base 10) , ex: int a=100;
        //binary (base 2) , starts with 0b or 0B, ex: int b=0b1010; --> 10
        //octal (base 8) , starts with 0, ex: int c=012; -->10
        //hexadecimal (base 16) , starts with 0x or 0X, ex: int d=0xA; -->10

        //2. Floating Point Literals --> represent decimal numbers
        //float , must end with 'f' or 'F', ex: float x=12.5f;
        //double , default floating point type, ex: double y=12.5;
        //scientific notation , ex:  double z=2.5e3 --> 2500.0

        //3. Character Literals --> represent a single character, single quotes('')
        //ex: char ch='A';

        //4. String Literals --> represent a sequence of characters, couble quotes("")
        //ex: String name="Hemant";

        //5. Boolean Literals --> only two possible values: true, false
        //ex: boolean isRain=false;

        //6. Null Literal --> represent no object or empty reference , null
        //ex: String name=null;
        //Note: null can only be assigned to reference types such as String, arrays, or objects not to primitive types like int, float or boolean.
        //ex: int x=null; //error


        //numeric literal --> Binary, octal decimal, hexadecimal
        //char --> unicode

        //Binary operator --> need two operands

        int k=1;
        int l=++k + k++;
        System.out.println(l);

        boolean isPizza=true, isCoke=false;

        if (isPizza && isCoke){
            System.out.println("Pizza and Coke");
        }
        else if (isPizza && !isCoke){
            System.out.println("Pizza but no Coke");

        }
        else{
            System.out.println("No Pizza and No Coke");
            
        }

        //nested if else
        int x=10;
        int y=14;
        if (x>5){
            if (y>8){
                System.out.println("Number is large");
            }
        }

        //Switch
        int day=4;
        int time=12;
        switch (day){
            case 1:
                System.out.println("Monday");
                switch (time) {
                    case 10:
                        System.out.println("Good Morning");
                        break;
                    case 11:
                        System.out.println("Good Morning");
                        break;
                    case 12:
                        System.out.println("Good afternoon");
                        break;
                }
                break;
            
            case 2:
                System.out.println("Monday");
        }

        //Date-03/07/2026
        //in both sides 'Student' refers to class name
        Student s1 = new Student();  //s1 is a reference variable , it is not an object, it just contain reference to the object
        s1.name="Hemant";
        s1.marks=80;
        s1.sayMarks();
        
        Student s2 = new Student();
        s2.name="Piyush";
        s2.marks=90;
        s2.sayMarks();

        s1=s2;  //here s2 reference goes to s1 
        s1.sayMarks();
        s2.sayMarks();

        Student s3=s2;
        s3.sayMarks();
        s3.marks=100;
        s3.sayMarks();
        s2.sayMarks();
        s1.sayMarks();

//Heap area stores object
//Stack area stores local variables(primitive type or reference type)
//instance variable --> which stores inside object
//method area

        /*  STRINGS   */
        String s="Hemant";  //When we create string in this way then java make this in string pool, if it already exist then it refers to same object otherwise java creates it in pool. 
        int slen=s.length();
        System.out.println(slen);
        System.out.println(s.charAt(3));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        String S2 = new String("Hello World");  //This forces java to create a brand new object on heap outside the string pool even if "Hello World" exist in string pool.
        System.out.println(S2);
        S2="Hemant Bansal";
        System.out.println(S2);
        s="Hemant Bansal";
        s=s+"is good";
        //strings are immutable so when we add some another string with it so a new string is created and that string reference goes to s
        System.out.println(S2.hashCode()); //-309987112
        System.out.println(s.hashCode()); //82833947

        String s4="Hemant";
        String s5="Hemant";

        System.out.println(s4==s5);  //true , means s4 and s5 points to 

        //Q: s4 is reference variable so when we print then reference print but it doesn't happen instead of this value print why?
        //Ans- When we do 'System.out.println(s4);' then println function internally calls s4.toString() on the s4 refers to.

        //string pool
        //it is a special, dedicated are of memory in java where string literals are stored so they can be reused instead of duplicated.

        //object are created in heap memory
        //object keep only it's properties not methods or functions

        //diff b/w UTF8 & ASCII code?
        //ascii & utf-8 are both char encoding schemes, but they differ in scope and size.
        //ascii uses a fixed 1 byte (7bits) per char and can represent only 128 chars -- basically english letters, digits and basic punctuation. It has no support for other languages.
        //utf-8 (Unicode Transformation Format - 8-bit), it uses to 1 to 4 bytes per char. This lets it support virtually every language and symbol in world, including emojis.
        //in java, string & char internally use UTF-16, but when interacting with external systems then using UTF-8.

        // about integer mutibility
        //int is primitive data type , it store the integer value directly , int x=10; , they are just values not object.
        //Integer the store the value as object, Integer b=10; , 

    }
}