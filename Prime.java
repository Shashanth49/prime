public class Prime
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int limit = scanner.nextInt();

        System.out.println("Prime numbers up to " + limit + ":");
        for (int num = 2; num <= limit; num++)
	{
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++)
	    {
                if (num % i == 0)
		{
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
	    {
                System.out.print(num + " ");
            }
        }
       
    }
}
