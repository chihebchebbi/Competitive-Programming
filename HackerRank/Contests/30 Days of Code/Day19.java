Since interfaces do not exist in Python, I did this question in Java 8. Not really part of my Python practice solutions, but I'm leaving this one here just to complete all the contest questions.

/**
Day 19: Interfaces!

Interfaces are an important concept in Java and in a few other languages like C#.

Here you are given an interface AdvancedArithmetic which contains a method signature 
int divisorSum(int n). (The divisorSum function just takes an integer as input and return the sum of all its divisors.) Your only task is to write a class Calculator which implements the interface.

Note : The class Calculator shouldn't be public.

Good luck!

Input Format

Only one line containing integer n

Constraints 
1≤n≤1000

Output Format

In the first line print "I implemented: AdvancedArithmetic" without quotes. In the next line print the sum of divisors of n as given in problem statement.

Sample Input

6
Sample Output

I implemented: AdvancedArithmetic
12
Explanation

Divisors of 6 are 1,2,3 and 6. 1+2+3+6=12.
*/

import java.io.*;
import java.util.*;
interface AdvancedArithmetic{
   int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic{
public int divisorSum(int n){
    int sum=1;
    for(int i=2;i<=(n/2);i++){
        if(n%i==0)sum+=i;
    }
    if(n!=1)return sum+n;
    else return sum;
}
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      	AdvancedArithmetic myCalculator=new Calculator(); 
        int sum=myCalculator.divisorSum(n);
        System.out.println("I implemented: AdvancedArithmetic\n"+sum);
    }
}