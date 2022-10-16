import java.util.Scanner;

class Solution
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int Alice [] = new int [3];
        int Bob [] = new int [3];
        int rating [] = new int [2];
        int Alice_point = 0;
        int Bob_point = 0;
        for ( int i = 0 ; i < 3 ; i++)
        {
            Alice[i] = sc.nextInt();
        }
        for (int i =0 ; i<3 ; i++)
        {
            Bob[i] = sc.nextInt();
        }
        for (int i = 0 ; i < 3 ; i++ )
        {
            if (Alice[i] > Bob[i])
            {
                Alice_point += 1;
            }
            else if (Bob[i] > Alice[i])
            {
                Bob_point += 1;
            }
        }
        rating[0] = Alice_point;
        rating[1] = Bob_point;
        for ( int i : rating)
        {
            System.out.print(i+" " );
        }
    }
}
