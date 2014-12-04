public class Cat implements Runnable
{
    private int count = 0;

    @Override
    public void run() 
    {
        /*
         * When you implement the Runnable interface, it
         * requires that you create a method called run.
         * The statements that you place in the run method
         * will continue to execute until this method finishes.
         * 
         * In this case, we'll create a while() loop that
         * keeps this animal speaking until it has spoken 5000 times.
         */
        
        while (count < 5000)
        {
            System.out.println("Meow!!!");
            count++;
        }
    }    
}
