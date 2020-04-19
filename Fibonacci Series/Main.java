#include<iostream>
int main()
{
  //Type your code here.
  int n,a,b,c,i;
  std::cin>>n;
  a=0;
  b=1;
  if(n==1)
    std::cout<<"The term "<<n<<" in the fibonacci series is "<<a;
  else if(n==2)
    std::cout<<"The term "<<n<<" in the fibonacci series is "<<b;
  else
  {
    for(i=2;i<n;i++)
    {
      c=a+b;
      a=b;
      b=c;
    }
    std::cout<<"The term "<<n<<" in the fibonacci series is "<<c;
  }
}