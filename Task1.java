import java.util.Scanner;
class Task1
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int guess = (int)(Math.random()*100)+1;
        int numOfGuesses = 10;
         do{
            
            System.out.println("guess the number");
            int num = sc.nextInt();
            numOfGuesses--;
            if(num == guess)
            {
                System.out.println("wow! its correct");
                break;
            }
            if(numOfGuesses == 0)
            {
                System.out.println("OOPs! time Out");
                break;
            }
            else if(num > guess)
            {
                System.out.println("Not correct! Guess smaller number than this number");
            }
             else 
            {
                System.out.println("Not correct! Guess bigger number than this number");
            }
        }
        
         while(true);
    }
}