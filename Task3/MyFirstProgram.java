package Task3;

class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass mySecondClass = new MySecondClass(4, 8);
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

class MySecondClass {
    private int val1;
    private int val2;

    public int bitwiseAnd() {
        return val1 & val2;
    }

    public MySecondClass(int val1, int val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public int getVal1() {
        return val1;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }

    public int getVal2() {
        return val2;
    }
}
