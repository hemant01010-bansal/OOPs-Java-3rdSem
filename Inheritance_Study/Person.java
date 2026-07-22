class Person {
    String name;
    int age;

    Person(){
        System.out.println("Person Class");
    }

    Person(int a){
        System.out.println("Default Construtor called from Person class");
    }

    void getInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println("From Person Class");
    }
}
