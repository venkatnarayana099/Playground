#include<iostream>
int fact(int a);
int main()
{
  //Type your code here.
  int a;
  std::cin>>a;
  std::cout<<"The factorial of "<<a<<" is "<<fact(a);
}
int fact(int n)
{
  if(n<=1)
    return 1;
  return n*fact(n-1);
}