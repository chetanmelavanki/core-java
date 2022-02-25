class Mobile 
    {
        public static void main(String []args)
        {
            brand();  
            brand("redmi MI");  
            items(15646443);
        }
        static void brand()
        {
            System.out.println("play video ");
            System.out.println("calling");
            System.out.println("gaming");       
        }
        static void brand(String name)
        {
            System.out.println(name + "paly video ");
            System.out.println( name + "calling");
            System.out.println( name + "gaming"); 
        }
        static void items(int count)
        {
            System.out.println(count+"valid");
        }
    }