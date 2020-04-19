#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d1,c1,d2,c2,c,d,count;
  cin>>d1>>c1>>d2>>c2;
  d=d1+d2;
  c=c1+c2;
  while(c>=100)
  {
    c=c-100;
    count+=1;
  }
  d=d+count;
  cout<<d<<"\n"<<c;
}