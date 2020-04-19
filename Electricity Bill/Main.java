#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int u,a;
  cin>>u;
  if(u<=200)
  {
    a=u*0.5;
    cout<<"Rs."<<a;
  }
  else if(u<=400)
    cout<<"Rs."<<u*0.65+100;
  else if(u<=600)
    cout<<"Rs."<<u*0.80+200;
  else
    cout<<"Rs."<<u*1.25+425;
}