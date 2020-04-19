#include <iostream>
int main() 
{
  // Type your code here
  int a;
  float n,sum=0;
  std::cin>>a;
  while(a>0)
  {
    n=a%10;
    sum=sum*10+n;
    a=a/10;
  }
  std::cout<<sum;
  return 0;
}