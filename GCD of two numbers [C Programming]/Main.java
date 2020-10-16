#include<stdio.h>
int gcd(int a,int b)
{
  while(a!=b){
  if(a<b)
    b=b-a;
  else
    a=a-b;}
  return b;
   //Your code goes here
}
int main()
{
    int a,b;
    scanf("%d %d",&a,&b);
    printf("%d ",gcd(a,b));
    return 0;
}
