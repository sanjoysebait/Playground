#include<stdio.h>
int bin_to_dec(int n)
{
  int rev=0,rem,power=1;
  while(n>0)
  {
    rem=n%10;
    rev=rev+rem*power;
    power=power*2;
    n/=10;
  }
  return rev;
    //Your code goes here
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",bin_to_dec(n));
}