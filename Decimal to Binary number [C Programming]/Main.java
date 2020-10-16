#include<stdio.h>
int dec_to_bin(int n)
{
  
  int rev=0,power=1;
   while(n>0)
   {
     int rem=n%2;
     rev=rev+rem*power;
     power=power*10;
     n=n/2;
   }
     return rev;
  
   //Your code goes here
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_bin(n));
}
