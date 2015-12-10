package Test1Package;

import java.util.Scanner;

public class MainClass3 {




    public static void main (String args[]){

        MainClass3 mc3 = new MainClass3();

//        mc3.nechet();
//          mc3.minmaxArr();




int f[] = {10, 2, 3,4};

selectionArr(f);



    }

    private void nechet(){
        int A[] = new int [10];
        int j =1;
        int f = 2;

        for (int i = 0; i<10;i++){

            A[i]=j;
            j +=f;

            System.out.print(A[i] + ", ");
        }

    }

    private void minmaxArr(){

        System.out.println("Введите размерность массива:");
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int A[] = new int[z];
        System.out.println("Создан массив размерностью  N = " + z);

        for(int i = 0; i!=z;i++){

            System.out.print("["+(i+1)+"] ");
        }
        System.out.println();

        for(int i = 0; i!=z;i++){
            A[i] = (int)(Math.random()*9)+1;

            System.out.print("("+ A[i] + ") ");
        }
        System.out.println();




        String nomMin="";
        String nomMax="";


        int min = A[0];
        for( int i=0; i!=z;i++){
            if(min>A[i]){
                min = A[i];

            }
        }

        int max = A[0];
        for( int i=0; i!=z;i++){
            if(max<A[i]){
                max = A[i];

            }

        }


        for (int i=0; i!=z; i++){
            if (A[i]==min){
                nomMin+="A[" + Integer.toString(i+1)+"] ";
            }
            if (A[i]==max){
                nomMax+="A[" + Integer.toString(i+1)+"] ";
            }
        }




        System.out.println("Наименьшний элемент(ы) массива " + nomMin + " равен(ы) " + min);
        System.out.println();
        System.out.println("Наибольшый элемент(ы) массива " + nomMax + " равен(ы) " + max);
    }

    public static void selectionArr(int[] arr){

for (int i=0; i<arr.length; i++){
    int min = arr[i];
    int min_i = i;


    for (int j = i+1; j<arr.length;j++){
        if (arr[j]<min){
            min = arr[j];
            min_i = j;
        }
    }

if(i != min_i){
    int tmp =  arr[i];
    arr[i]= arr[min_i];
    arr[min_i]=tmp;
}

}


    }





}
