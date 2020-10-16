#include<iostream>
using namespace std;
int dec_to_oct(int n)
{
   int rem,rev=0,power=1;
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
    cin>>n;
    cout<<dec_to_oct(n);
}
