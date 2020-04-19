#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,i=6,count=1,c=0;
  cin>>a;
   cout<<b<<" ";
   b=2;
   while(count<a)
    {
     cout<<b<<" ";
     b=b+i;
     c=c+1;
     if(c==2)
     {
       c=0;
       i=i+4;
     }
     count=count+1;
    }
}