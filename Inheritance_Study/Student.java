class Student extends Person{
    int marks;
    int SId;

    Student (){
        super(100);
        this.marks=56;
        System.out.println("Construtor called from Student class");
    }

    void getInfo(){
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.marks);
        System.out.println(this.SId);
    }
}
