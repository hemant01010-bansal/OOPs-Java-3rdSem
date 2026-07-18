import java.util.Arrays;
import java.util.Scanner;

public class lec5 {
    static int[] helper(int arr[]){
        for (int i=0; i<arr.length; i++){
            arr[i]=arr[i]*2;
        }
        
        return arr;
    }

    static int sumOfArray(int nums[]){
        int add=0;
        for (int i=0; i<nums.length; i++){
            add+=nums[i];
        }
        return add;
    }

    public static void main(){
        //14/07/2026
        //if we make array of any class type then in Heap refernce store of that object is null. Ex: suppose i have a class 'abc' and i make array of it like (abc arr[]= new abc[]) --> array declaration, so in heap array elements objects made whose default value is zero.
        //What is meant by primitive array or non primitive array in java?

        //An array in java is an object that stores multiple values of same data type in continuous memory locations. Arrays are objects in java.
        int [][] arr = new int[3][4];
        System.out.println(arr[0]);  //[I@7ad041f3
        System.out.println(arr[0][0]);  //0

        int [][] arr2 = new int[4][];
        System.out.println(arr2[0]); //null
        arr2[0]=new int [2];
        arr2[0][0]=0;
        arr2[0][1]=1;
        System.out.println(arr2[0][0]); //0
        arr2[1]=new int [1];
        arr2[1][0]=2;

        arr2[2]=new int [4];
        arr2[2][0]=3;
        arr2[2][1]=4;
        arr2[3]=new int[0];

        int noR=arr2.length;

        for (int i=0;i<noR;i++){
            int singleRow=arr2[i].length;
            for (int j=0;j<singleRow;j++){
                // System.out.println(arr2[i][j]);
            }
        }

        int arr3[][] = {{1,2,3},{1,5,6},{4,2,4},{2,2,2}};
        for (int i=0;i<arr3.length;i++){
            for (int j=0;j<arr3[i].length;j++){
                // System.out.print(arr3[i][j]+", ");
            }
            System.out.println();
        }
        
        int arr4[][]={{10,20,30,40},{50,60,70,80},{90,100,110,120},{130,140,150,160},};
        for (int i=0;i<arr4.length;i++){
            int x=i+1;
            for (int j=0;j<x;j++){
                // System.out.print(arr4[i][j]+", ");
            }
            System.out.println();
        }


        //Date-15/07/2026
        int[] arr5={1,2,3};
        int arr6[]={1,2,3};

        Arrays.fill(arr5,9);
        System.out.println(arr5);

        int arr7[]=helper(arr5);
        System.out.println(arr7[0]);

        int sumOfarr6=sumOfArray(arr6);
        System.out.println(sumOfarr6);

        Scanner sc = new Scanner((System.in));
        //suppose we take input of "54 tree" 
        // int a = sc.nextInt();
        String s = sc.next();
        String s2 = sc.nextLine();
        // System.out.println(a);
        System.out.println(s);
        System.out.println(s2);

        Scanner sc2 = new Scanner((System.in));
        Scanner sc3 = new Scanner((System.in));

        
        int nums[][] = new int[3][4];
        for (int i=0; i<nums.length; i++){
            Scanner sc4 = new Scanner((System.in));
            for (int j=0; j<nums[i].length; j++){
                nums[i][j]=sc4.nextInt();
            }
        }
    }
}
