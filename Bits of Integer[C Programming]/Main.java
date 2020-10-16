#include<stdio.h>
int dec_to_bin(int n)
{ int count=0;
  while(n!=0)
  {
    n=n/2;
    count++;
  }
 return count;
   //Your code goes here
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_bin(n));
}
