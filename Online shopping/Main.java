#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fs,fd,fsh,ss,sd,ssh,as,ad,ash,a,b,c;
  cin>>fs>>fd>>fsh>>ss>>sd>>ssh>>as>>ad>>ash;
  cout<<"In Flipkart Rs."<<(fs-((fs*fd)/100))+fsh<<"\n";
  cout<<"In Snapdeal Rs."<<(ss-((ss*sd)/100))+ssh<<"\n";
  cout<<"In Amazon Rs."<<(as-((as*ad)/100))+ash<<"\n";
  a=(fs-((fs*fd)/100))+fsh;
  b=(ss-((ss*sd)/100))+ssh;
  c=(as-((as*ad)/100))+ash;
  if(a<=b && a<=c)
    cout<<"He will prefer Flipkart";
  else if(b<=c)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
}