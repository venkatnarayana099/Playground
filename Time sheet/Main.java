#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int sun,mon,tue,wed,thur,fri,sat;
  float a=0;
  cin>>sun>>mon>>tue>>wed>>thur>>fri>>sat;
  //mon to fri
  if(mon<=8)
    a+=100*mon;
  else
    a+=800+(mon-8)*115;
  
  if(tue<=8)
    a+=100*tue;
  else
    a+=800+(tue-8)*115;
  
  if(wed<=8)
    a+=100*wed;
  else
    a+=800+(wed-8)*115;
  
  if(thur<=8)
    a+=100*thur;
  else
    a+=800+(thur-8)*115;
  
  if(fri<=8)
    a+=100*fri;
  else
    a+=800+(fri-8)*115;
  
  if((mon+tue+wed+thur+fri)>40)
    a+=((mon+tue+wed+thur+fri)-40)*125;
    
  if(sat<=8)
    a+=(sat*100)+(sat*100*0.25);
  else
    a+=(sat*100)+((sat-8)*115)+(sat*100*0.25);
  
  if(sun<=8)
    a+=(sun*100)+(sun*100*0.5);
  else
    a+=(sun*100)+((sun-8)*115)+(sun*100*0.5);
  cout<<a;
}