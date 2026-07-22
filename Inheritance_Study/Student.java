class Student extends Person{
    int marks;
    int SId;

    Student (){
        super(100);
        this.marks=56;
        System.out.println("Construtor called from Student class");
    }

    void printMarks(){
        System.out.println(this.marks);
        System.out.println(marks);  //in this class there is only one variable 'marks' so their is no need of 'this' but if another local variable with same name present then we have to use 'this'.
    }

    void getInfo(){
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.marks);
        System.out.println(this.SId);
        System.out.println("Hi I am Student.");
    }
}
