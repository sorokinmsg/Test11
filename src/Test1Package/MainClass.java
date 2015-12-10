package Test1Package;


import java.util.Scanner;

public class MainClass {






    public static void main(String[] args) {
        MainClass mc = new MainClass();
mc.base();
    }





        public void base() {


printEr("Введите \"Yes\" для повтора или \"No\" для выхода");
            Scanner sc = new Scanner(System.in);
            String k = sc.next();

            printEr(k);



            if (k.equals("Yes") || k.equals("yes")) {
                printEr("k = " + k);
base();
            }
            else{
                printEr("k = " + k + " - Всего доброго.");
            }

        }

    public void printEr(String e){
System.out.println(e);
    }






}
