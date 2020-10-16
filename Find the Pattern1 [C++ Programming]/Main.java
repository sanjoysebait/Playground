#include <iostream>
using namespace std;
int pattern(int n)
{
  for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
      if(i==1 || i==n  || j==n  || j==1)
        printf("1");
  	  else
        printf(" ");}
    printf("\n");}
   //Your code goes here
}
int main()
{
    int n;
    cin>>n;
    pattern(n);
}
