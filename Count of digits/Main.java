#include<iostream>
int main()
{
  int n,count=0;
  std::cin>>n;
  do
  {
    n=n/10;
    count=count+1;
  }while(n!=0);
  std::cout<<count;
  // Type your code here
}