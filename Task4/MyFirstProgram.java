package Task4;

import Task4.myfirstpackage.*;

class MyFirstClass {
    public static void main(String[] s) {
        MyFirstPackage mySecondClass = new MyFirstPackage(4, 8);
        System.out.println(mySecondClass.bitwiseAnd());

        for (int i = 1; i <= 8; ++i) {
            for (int j = 1; j <= 8; ++j) {
                mySecondClass.setVal1(i);
                mySecondClass.setVal2(j);

                System.out.print(mySecondClass.bitwiseAnd() + " ");
            }
            System.out.println();
        }
    }
}
