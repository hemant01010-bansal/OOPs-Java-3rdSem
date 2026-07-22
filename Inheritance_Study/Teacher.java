class Teacher extends Person{
    int salary;

    void getInfo(){
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.salary);
        System.out.println("Hi I am Teacher.");
    }

    public static void main (String[] args){
        Person p = new Student();
        p = new Teacher();
        //parent class object can hold refernce of any child class
        //the property which parent has transfer to child, but the property from child doesn't go to parent
    }
}
