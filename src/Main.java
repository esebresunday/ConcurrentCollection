import java.util.*;
import java.util.concurrent.*;
class Main extends Thread
{
    static CopyOnWriteArrayList l = new CopyOnWriteArrayList();
    //static ArrayList l = new ArrayList();
    public void run()
    {
        try
        {
            Thread.sleep(2000);
        }catch(InterruptedException e){}
        l.remove("D");
    }
    public static void main(String[] args) throws InterruptedException
    {
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        l.add("E");
        Main t = new Main();
        t.start();
        Iterator itr = l.iterator();
        while(itr.hasNext())
        {
            String s = (String)itr.next();
            System.out.println(s);
            Thread.sleep(4000);
        }
        System.out.println(l);
    }
}