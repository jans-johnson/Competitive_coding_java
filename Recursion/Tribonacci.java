package Recursion;
//Tribonacci Series using recursion
class Tribonacci{

    static int tribonacci(int n)
    {
        if(n<2)
            return 0;
        else if(n==2)
        {
            return 1;
        }
        else
        {
            return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
        }
    }
    public static void main(String[] args) {
        for(int i=0;i<10;i++)
        System.out.println(tribonacci(i));
    }
}