public class lec4 {
    public static void main(String[] args){
        System.out.println("Hello, World");
        System.out.println("Hello, World");
        //08/07/2026
        //Static int getInfo(int a, int b){}  -->function
        //function signature --> getInfo(int,int)
        //return type is not included in signature

        int[] arr1=new int[5];
        //random access --> directly go to the address by calculating the address

        //09/07/2026
        int arr2[]=new int[5];

        int arr3[],arr4[],arr5;
        //arr3,arr4 both are array, arr5 is an integer

        int[] arr6, arr7;
        //now arr6 and arr7 both are array because bracket is with int.

        //int a; //local variable can't be used without initialization.
        //we can't print a because we don't assign any value to it.

        //integral --> 0
        //float/double --> 0.0
        //boolean --> false
        //char --> " "
        //string --> null

        ABC a=new ABC();
        System.out.println(a.rollno); //0
        System.out.println(a.result);  //false
        System.out.println(a.name);  //null
        System.out.println(a.x);  // 

        String[] arr=new String[3];  //in this array we have three refernce variable which store the refernce of objects that is 3 object arrays
        arr[1]="Hemant";
        // System 
        String s1="xyz";
    }
    void getInfo(int a){
        System.out.println();
    }

    void getInfo(int b,int a){
        System.out.println();
    }
}

class ABC{
    int rollno;
    boolean result;
    String name;
    char x;
}