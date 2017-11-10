import java.awt.*;

class FlickeringLabel extends Label implements Runnable{
   public FlickeringLabel(String text) {
      super(text);
      Thread th = new Thread(this);
      th.start();
   }

   public void run() {
      int n=0;
      while(true) { 
         if(n == 0)
            setBackground(Color.YELLOW);
         else
            setBackground(Color.GREEN);
         if(n == 0) n = 1;
         else n = 0;
         try {
            Thread.sleep(500); 
         }
         catch(InterruptedException e) {
            return; 
         }
      }
   }
}

class FlickeringLabelEx extends Frame {
   public FlickeringLabelEx() {
      setTitle("FlickeringLabelEx 예제");
   
      FlickeringLabel fLabel = new FlickeringLabel("깜박");
      Label label = new Label("안깜박");
      FlickeringLabel fLabel2 = new FlickeringLabel("여기도 깜박");
      Panel p = new Panel();
      p.add(fLabel);
      p.add(label);
      p.add(fLabel2);
      add(p);
      setSize(300,150);
      setVisible(true);
   }
}

class ListTest extends Frame
{
   Panel p;
   List list;
   public ListTest(String str)
   {      
      super(str);
      p=new Panel();
      list=new List(2,true);
      list.add("이대");
      list.add("강남");
      list.add("종로");
      list.add("구로");
      p.add(list);
      add(p);
      setSize(300,100);
      setVisible(true);
   }
}

public class Main_ {
   public static void main(String[] args) {
      new FlickeringLabelEx();
      new ListTest("멀티 선택 리스트");
   }
}
