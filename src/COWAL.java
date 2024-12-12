import java.util.*;
import java.util.concurrent.*;
// the following program will throw a RuntimeException saying UnsupportedOperationException
// if I use a CopyOnWriteArrayList as the collection object
class COWAL
{
    public static void main(String[] args)
    {
        ArrayList l = new ArrayList();
        l.add("A");
        l.add("B");
        l.add("C");
        Iterator itr = l.iterator();
        while(itr.hasNext())
        {
            String s = (String)itr.next();
            if (s.equals("C"))
            {
                itr.remove();
            }
        }
        System.out.println(l);
    }
}