package Backtracking;

//Given a string containing numeric digits from 2 to 9 inclusive, return all possible letter combinations that the number could represent in lexicographical order.

import java.util.Hashtable;

public class PhoneNumber {
    
    static void printPermutation(Hashtable<Character,String> table,String s,int index,String str)
    {
        if(index==s.length())
            System.out.println(str);
        else
        {
            String temp=table.get(s.charAt(index));
            for(int i=0;i<temp.length();i++)
            {
                printPermutation(table, s, index+1,str+temp.charAt(i));
            }
        }
    }
    
    public static void main(String[] args) {
        Hashtable<Character,String> table=new Hashtable<>();
        table.put('2', "ABC");
        table.put('3', "DEF");
        table.put('4', "GHI");
        table.put('5', "JKL");
        table.put('6', "MNO");
        table.put('7', "PQRS");
        table.put('8', "TUV");
        table.put('9', "WXYZ");
        printPermutation(table, "234", 0,"");
    }
}
