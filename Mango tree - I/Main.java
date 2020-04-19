#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,t;
  cin>>x>>y>>t;
  if(t<=y || t%y==0 || t%y==1)
    cout<<"Yes";
  else
    cout<<"No";
}