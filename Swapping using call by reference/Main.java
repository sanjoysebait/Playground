#include<iostream>
void swap(int &a,int &b)
{
  a=a+b;
  b=a-b;
  a=a-b;
}
int main()
{
	int x,y;
    std::cin>>x>>y;
    std::cout<<"Before swapping a= "<<x<<" and b="<<y<<"\n";
    swap(x,y);
	std::cout<<"After swapping a= "<<x<<" and b="<<y;
	return 0;
 }