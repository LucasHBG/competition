#include <iostream>
using namespace std;

#DEFINE calc(n) (n+2)*(n-1)

int main(){
    int n, a, b;

    cout << "? ";
    cin >> a >> b;
    cout << endl;
    
    calc(a);

    return 0;
}