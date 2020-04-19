#include<iostream>
int main()
{
  //Type your code here.
  int a=3,b=4,c,d,A,B;
  std::cin>>c>>d;
  if(b>d)
  {
    A=b-d;
  }
  else
  {
    A=d-b;
  }
  if(a>c)
  {
    B=a-c;
  }
  else
  {
    B=c-a;
  }
  if(A>B)
  {
    std::cout<<A;
  }
  else
  {
    std::cout<<B;
  }
}