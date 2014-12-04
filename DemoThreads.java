public class DemoThreads 
{
    public static void main(String[] args)
    {
        /*
         * To create a thread, we first need to create a class that
         * implements the Runnable interface.  See the Cat.java and
         * Dog.java files for details.  (It will contain a run() method
         * in which you'll place the code there that you want to be run
         * as a thread.)
         * 
         * To start the thread, we have to create a Thread object and
         * provide an instance of the Cat and Dog objects to the constructor,
         * as shown below.  Notice the start() method, which tells Java to 
         * start running their code.
         */
        
        
        
        Thread kitten = new Thread(new Cat());     // Cat thread is created.
        Thread puppy = new Thread(new Dog());     // Dog thread is created.
        
        kitten.start();    // Start both of them now.
        puppy.start();    // ...
    }
}
