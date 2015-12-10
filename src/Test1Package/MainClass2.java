package Test1Package;




//Тестовая программа №2

import java.util.Scanner;

public class MainClass2 {


    public static void main(String args[]) {
MainClass2 mc2 = new MainClass2();

        mc2.pr("Программа вычислятор факториала v0.1");
        mc2.pr("Введите число, для которого требуется вычислить факторал: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        mc2.pr("Вычисляем факториал для числа n = " + n);
        int fac = 1;
        String fact = "";

        for (int i = 1; i!=n+1; i++){
        fac*=i;
            mc2.prnln(fac + " ");
            fact+=Integer.toString(i) + " ";
        }

        mc2.pr("");
        mc2.pr(fact);
        mc2.pr("Факториал от " + n + " равен " + fac);





    }


    private void pr(String e){
     System.out.println(e);
    }

    private void prnln(String e){
        System.out.print(e);
    }

}