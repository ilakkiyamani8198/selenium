package org.testleaf.week1.day1;

public class CheckNumberIsPrime {

public static void main(String[] args) {
    int num=13;
    int count=0;
    for(int i=2;i<num;i++)
    {
        if(num%i==0)
            count ++;
    }
    if(count<=0)
        System.out.println("The number is Prime");
    else
        System.out.println("The number is not Prime");
}

}
