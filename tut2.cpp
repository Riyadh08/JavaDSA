#include<bits/stdc++.h>
using namespace std;

void Rev(string ss,int i){
    if(i == ss.size()) return;
    i++;

    Rev(ss,i);

    cout<<ss[i-1];

}

int main(){

    Rev("abcd",0);

    return 0;
}