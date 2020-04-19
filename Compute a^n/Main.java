#include<iostream>
using namespace std;
int pow(int a,int b)
{
  int static c=a;
  if(b==1)
    return a;
  return pow(a*c,b-1);
}


int main()
{
  //Type your code here.
  int a,n,res;
  cout<<"Enter the value of a"<<"\n";
  cin>>a;
  cout<<"Enter the value of n"<<"\n";
  cin>>n;
  res=pow(a,n);
  cout<<"The value of "<<a<<" power "<<n<<" is "<<res;
}