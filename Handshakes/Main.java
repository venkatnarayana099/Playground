#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,count,i,j;
  cin>>a;
  for(i=1;i<a;i++)
  {
    for(j=i+1;j<=a;j++)
    {
      count+=1;
    }
  }
  cout<<count;
}