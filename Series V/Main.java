#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b=11,count,res;
  cin>>a;
  while(count<a)
  {
    res=b*b;
    cout<<res<<" ";
    b=b+4;
    count=count+1;
  }
}