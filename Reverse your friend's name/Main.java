#include<iostream>
#include<string>
int main() 
{ 
//Type your code here
  int i=0;
  std::string str;
  std::getline(std::cin,str);
  for(i=str.length()-1;i>=0;i--)
  {
    std::cout<<str[i];
  }
}