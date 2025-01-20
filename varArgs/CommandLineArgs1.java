class CommandLineArgs1
{
    public static void main(String[] args) {
        for(String n:args)
        {
            System.out.println(n+" ");
            
        }
        System.out.println(args[0]);
        System.out.println(args.length);
        int number = Integer.parseInt(args[0]);
        System.out.println(number+1);
    }
}