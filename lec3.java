public class lec3 {
    public static void main(String[] args) {
        //06/07/2026
        //if methods/function are static in nature then we don't need objects to call them.
        // lec3.getInfo(5);
        lec3 obj= new lec3(); //'getInfoNonStatic' isn't a static function so we make a object.
        obj.getInfoNonStatic();


        // int a=10; // a is block scoped or local variables, so if another 'a' present in other function then both are not related.

        //every function has it's diff stack frame
        //local variable in stack frames, args also placed in stack frame
        //stack frame is a place where functions & local variables are got placed and executed, after the function completed the functions & variables are got pop out and not accessible outside the function.

        String s="hello";
        lec3.doSomething(s); 
        getInfo(5);

        printTable(5,1);
        //instance variable 
    }

    static void getInfo(int n){  //with static func belong to lec3 class, so no object needed
        if (n>=1){
            System.out.println("Hello I am Static function");
            n=n-1;
            getInfo(n);
        }
    }
    
    void getInfoNonStatic(){  //without static func belong to lec3 object, not the class itself
        System.out.println("Hello I am NON Static function");
    }

    static void doSomething(String s){  //if 'String s="hello";' then hello object is made in string pool and has some reference number and that no is stored in 's' and we also store that no in s3 that's why s=s3 it's true and in this operation of checking we compare reference no. not what's inside that reference no.
        String s2=new String("hello"); //stored in heap not string pool
        String s3="hello";
        System.out.println(s==s2);  //s,s2 both reference no.s are diff either value is same and we check reference no. that's why output is false.
        System.out.println(s==s3);
    }

    static void printTable(int n, int i){
        if (i<=10){
            System.out.println((n)+" * "+(i)+" =    "+(n*i));
            printTable(n, i+1);
        }
    }

}

class Student{
    String name;
    static String collegeName = "Chitkara";  //static variable --> that belong to class itself, not to individual objects.
    int marks;

    static void getInfoStatic(){
        System.out.println(collegeName);
        // System.out.println(marks);  --> error

        // ** Learn About Stack, Heap, Memory Area **
        //SSD --> Stores program file(.java, .class)
        //RAM --> Store's the running program's memory (Stack, Heap, Method Area)
        //Stack --> it stores function calls, local varialbes, partial results.
        //Heap --> it stores objects and arrays.
        //Method Area --> is a part of JVM memory (stored in RAM) that stores info about classes, not objects.
        //Complete Ex for stack, heap and method area:
        // class Student {
        //     static String college = "ABC";
        //     int age;
        //
        //     void study() {
        //         System.out.println("Studying");
        //     }
        // }

        // public class Demo {
        //     public static void main(String[] args) {
        //         Student s = new Student();
        //         s.age = 18;
        //         s.study();
        //     }
        // }
        //method area contains college="ABC", study(), constructor, class metadata.
        //Heap Student Object , age=18
        //Stack s--->Student Object, s variable which refer to Student Object.


        //learn about constructor
        //class Person{
        //    String name;
        //    int age;
        //    //constructor
        //    Person(String n, int a){
        //        name=n;
        //        age=a;
        //    }
        //}
        //Person p = new Person("Sam",20); //constructor runs automatically.
        //constructor name should be same as class name and has no return type
        //Diff b/w constructor and method
        //A method can return a value and must be called explicitly; A constructor never returns a value and runs only once, automatically at object creation.


        //learn about diff b/w static and non static
        //static belongs to class itself -- shared by all objects. Non static belongs to each individual object -- every object gets its own separate copy.
        //learn about 'this' keyword and it's example
    }
}
