public class Different_Loops {
    static void delay()
    {
        System.out.println("Hi");
        for (double i=0; i<1000000000.0; i++)
        {

        }
        System.out.println("bye");
    }
    static void infinite1()
    {
        System.out.println("Hi");
        for (int i=0; ; i++)
        {
            System.out.println("bye");
        }
        //System.out.println("Welcome");
    }
    static void infinite2()
    {
        System.out.println("Hi");
        for(; ;)
        {
            System.out.println("bye");
        }
    }
    static void infinite3()
    {
        while(true)
        System.out.println("bye");
    }
    static void infinite4()
    {
        for(;true;)
        {
            System.out.println("bye");
        }
    }
    static void empty()
    {
        for (int i=0; i<=5; i++)
        {
        }
            System.out.println("welcome");
        }
        static void nulloop()
        {
            for(int i=0; i<5; i++);
            {
                System.out.println("Hi");
            }
        }
}
