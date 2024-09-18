package Task4.myfirstpackage;

public class MyFirstPackage {
   private int val1;
   private int val2;

   public int bitwiseAnd() {
      return this.val1 & this.val2;
   }

   public MyFirstPackage(int var1, int var2) {
      this.val1 = var1;
      this.val2 = var2;
   }

   public void setVal1(int var1) {
      this.val1 = var1;
   }

   public int getVal1() {
      return this.val1;
   }

   public void setVal2(int var1) {
      this.val2 = var1;
   }

   public int getVal2() {
      return this.val2;
   }
}
