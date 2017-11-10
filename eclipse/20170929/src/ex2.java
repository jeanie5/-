public class ex2 {

   public static void main(String[] args) {
      int[] coinunit= {500,100,50,10};
      
      int money = 2680;
      System.out.println("money="+money);
      
      for(int i=0;i<coinunit.length;i++) {
         System.out.println(""+coinunit[i]+": "+money/coinunit[i]);
         money=money-coinunit[i]*(money/coinunit[i]);
      }

   }

}