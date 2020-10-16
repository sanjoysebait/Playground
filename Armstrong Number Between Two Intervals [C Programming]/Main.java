#include<stdio.h>
int getdigits(int n)
{
    int c=0;
    while(n>0)
    {
        n/=10;
        c++;
    }
    return c;
}
int power(int rem, int p)
{
    int res=1,i;
    for(i=1;i<=p;i++)
        res*=rem;
    return res;
}
int armstr(int n)
{
  int p=getdigits(n);
  int num=n,rem,sum=0;
  while(n!=0)
  {
    rem=n%10;
    sum+=power(rem,p);
    n=n/10;
  }
  if(num==sum)
    return 1;
  else 
    return 0;
   //Your code goes here
}

void print(int a, int b)
{
    int i;
    for(i=a;i<=b;i++)
    {
        if(armstr(i)==1)
            printf("%d ",i);
    }
}
int main()
{
    int a,b;
    scanf("%d %d",&a,&b);
    print(a,b);
    return 0;
}
