#include <iostream>
#include <map>
#include <fstream>

using namespace std;
int main()
{
	ifstream myfile;
	myfile.open ( "matrix" );
	for ( int i = 0; i < 12627; i++ ) {
		cout << "col"<<i+1<<",";
	}
	cout << endl;
	return 0;
}
