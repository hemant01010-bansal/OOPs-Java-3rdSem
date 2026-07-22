class Understand_inheri{

    static class Animal{ //parent class
        String name;
        Animal (String name){
            this.name=name;
        }

        void displayInfo(){
            System.err.println(name);
            System.err.println("Animal constructor");
        }
    }

    static class Dog extends Animal{ //child class
        Dog (String name){
            super(name); //calls Animal's constructor
            //'this' --> refers to my own current object
            //'super' --> refers to my parent class version 
            //When a Dog object is created, Java has to build the entire object including the Animal part inside it.
        }

        void displayInfo(){
            System.err.println(name);
            System.err.println("Dog constructor");
        }
    }

    public static void main(String[] args){
        System.out.println("Testing.");
        //Inheritance lets one class (subclass/child) acquire the fields and methods of another class (superClass/parent). It models an "is-a" relationship -- ex: Dog extends Animal because Dog is an Animal.
        //common logic lives in one place (superClass) instead of being duplicated.
        //Polymorphism --> A Dog can be treated as an Animal, letting you write more general, flexible code.
        
        Dog d = new Dog("oreo");
        d.displayInfo();
    }
}