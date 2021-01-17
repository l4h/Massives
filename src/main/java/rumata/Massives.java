package rumata;

import java.util.Arrays;

public class Massives {
    public static void main(String[] args) {
         int [] task1 = {1,0,1,1,1,0,1,0,0};
         int [] task2 = new int[8];
         int [] task3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
         int [][]task4 = new int[7][7];
         int[] task5 = {10,18,14,3,19,88,0,-15};

         //task1
        methodTask1(task1);
        methodTask2(task2);
        methodTask3(task3);
        methodTask4(task4);
        methodTask5(task5);

    }


    static void methodTask1(int[] massive){
        String result="\nAfter change: ";
        System.out.print("Massive before change: ");
        for (int i = 0;  i < massive.length; i++) {

            System.out.print( massive[i]+" ");
            if(massive[i]==1){
               massive[i]=0;
            }else{
                massive[i]=1;
            }
//            result =result +String.valueOf(massive[i]) +" ";
            result +=massive[i]+" ";
        }
        System.out.print(result);

    }

    static void methodTask2(int[] massive){
        System.out.println("\n\nTask2 execution result: ");
        for (int i = 0, j=0; i < massive.length; i++,j+=3) {
            massive[i]=j;
            System.out.print(massive[i]+" ");
        }
    }

    static void methodTask3(int[] massive){
        System.out.println("\n\nTask 3 execution result:");
        for (int i = 0; i < massive.length; i++) {
           if(massive[i] < 6){
               massive[i]*=2;
           }
            System.out.print(massive[i]+" ");


        }
    }

    static void methodTask4(int[][] massive){
        System.out.println("\n");
        int crossPoint = massive.length-1;
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                if(i==j){
                    massive[i][j]=1;
                    System.out.print(massive[i][j]+" ");
                }else if((i+j)==crossPoint) {
                    massive[i][j] = 1;
                    System.out.print(massive[i][j]+" ");
                } else {
                    massive[i][j]=0;
                    System.out.print("* ");
                }


            }
            System.out.println();
        }
    }

    static void methodTask5(int[] massive){
        int min = massive[0], max=massive[0];
        for (int i = 0; i < massive.length-1; i++) {
                if(min>massive[i+1]) {
                    min = massive[i + 1];
                } else if(max<massive[i+1]){
                    max = massive[i+1];
                }
        }
        System.out.println("\n\nMin:" + min +" \nMax:"+max);
    }


}
