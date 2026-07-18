class  Person {
    int age;
    String name;
    String phone;

    Person(int age, String name){  //when parameterized Constructor is called then Default Constructor doesn't call
        this.age=age;
        this.name=name;
    }

    Person(int age, String name, String phone){
        // this.age=age;
        // this.name=name;
        this(age,name);  //upper two lines are same as in 1st Constructor so we call that Constructor with 'this'
        this.phone=phone;
    }

}

public class lec7 {
    public static void main(){
        Person p1 = new Person(10, "ramu");
        Person p2 = new Person(18, "Hemant","79733");
        System.out.println(p2.age);
    }


    //Copy Constructor --> that create new object by copying the values from an existing object of the same class.

    //function overloading
}
