#include<iostream>
int main()
{
    int a,b,x;
  std::cin>>a>>b>>x;
  std::cout<<"Enter first number : Enter second number : Menu"<<"\n";
  std::cout<<"1.Addition"<<"\n"<<"2.Subtraction"<<"\n"<<"3.Multiplication"<<"\n"<<"4.Division"<<"\n"<<"5.Remainder"<<"\n";
    switch(x)
    {
      case 1 : std::cout<<a+b;
      break;
      case 2 : std::cout<<a-b;
      break;
      case 3 : std::cout<<a*b;
      break;
      case 4 : std::cout<<a/b;
      break;
      case 5 : std::cout<<a%b;
      break;
      default : std::cout<<"Invalid operation";
      break;
    }
}