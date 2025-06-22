#include <bits/stdc++.h>
using namespace std;

class Car{
    string name;
    int num;

    public:
        Car(string a, int n){
            cout<<"Constructor called"<<endl;
            this->name = a;
            this->num = n;
        }
        void enter(){
            cin>>name;
            cin>>num;
        }
        void display(){
            cout<<"Name: "<<name<<endl;
            cout<<"Num: "<<num<<endl;
        }
};


int main() {
    //Using new keyword
    Car *c1 = new Car("Suzuki",2022);
    Car *c2 = new Car("Honda",2023);
    Car *c3 = new Car("Toyota",2024);

    c1->display();
    c2->display();
    c3->display();
 
    
    return 0;
}