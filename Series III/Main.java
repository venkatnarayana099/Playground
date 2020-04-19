#include<iostream>
int main()
{
  int a,count=1,i=5,b=6;
  std::cin>>a;
  std::cout<<b<<" ";
  while(count<a)
  {
    b=b+i;
    i=i+5;
    std::cout<<b<<" ";
    count=count+1;
  }
}