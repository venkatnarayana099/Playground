#include<iostream>
int swap(int &p,int &q)
{
  int temp=p;
  p=q;
  q=temp;
}

int main()
{
  int a,b;
  std::cin>>a>>b;
  std::cout<<"Before swapping a= "<<a<<" and b="<<b<<"\n";
  swap(a,b);
  std::cout<<"After swapping a= "<<a<<" and b="<<b<<"\n";
}