package comtinuewithoutlabeldemo;

/**
 *
 * @author  Karan Sharma
 * @time     Jul 22, 2013 8:56:53 AM 
 */
public class ComtinueWithoutLabelDemo {

    public static void main(String[] args)
    {
        int I;
        
        // printing all the odd numbers from 0 to 5
        for(I = 0; I < 5; I++)
        {
            if (I % 2 == 0)
            {
                continue;
            }
            else
            {
                System.out.println("I : " + I);
            }
        }
    }
}
