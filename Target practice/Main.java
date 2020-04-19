#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,s,res,count=0;
  cin>>i;
  while(res<i)
  {
    cin>>s;
    res+=s;
    count+=1;
  }
  cout<<"The number of turns is "<<count;
}