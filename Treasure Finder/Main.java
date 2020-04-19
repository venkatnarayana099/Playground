#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  cin>>a>>b>>c;
  if((a<b && a>c) || (a>b && a<c))
    cout<<"The treasure is in box which has number "<<a<<"\n";
  else if((b<a && b>c) || (b>a && b<c))
    cout<<"The treasure is in box which has number "<<b<<"\n";
  else
    cout<<"The treasure is in box which has number "<<c<<"\n";
  
  if(b%a==0 && c%a==0)
    cout<<"The code to open the box is "<<a;
  else if(a%b==0 && c%b==0)
    cout<<"The code to open the box is "<<b;
  else if(a%c==0 && b%c==0)
    cout<<"The code to open the box is "<<c;
  else
    cout<<"The code to open the box is 1";
}