#include<stdio.h>
int isprime(int n)
{
  int count=1;
  for(int i=2;i<=n/2;i++)
  {
    if(n%i==0)
    {
      count=0;
    }
  }
    return count;
	//Your code goes here
}
void print(int a, int b)
{
    int i;
    for(i=a;i<=b;i++)
    {
        if(isprime(i)==1)
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
