#include <iostream>
#include<string>
int main()
{
  int i;
  std::string str;
  std::getline(std::cin,str);
  
  for(i=str.size()-1;i>=0;i--)
  {
    std::cout<<str[i];
  }
}