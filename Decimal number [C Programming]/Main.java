#include<stdio.h>
int dec_to_oct(int n)
{
  int rev,power=1,rem=0;
  while(n!=0)
  {
    rem=n%8;
    rev=rev+rem*power;
    power=power*10;
    n=n/8;
  }
  return rev;
    //Your code goes here

}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_oct(n));
}
