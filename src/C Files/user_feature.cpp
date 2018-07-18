#include <iostream>
#include <fstream>
#include <cstdio>
#include <map>
using namespace std;
int main()
{
	ifstream f;
	f.open ( "u.user");
	int a,b;
	string c,d;
	string str;
	map < string,int> pin;
	map<string,int>::iterator it;
	int u = 1,u1 = 1;
	while ( !f.eof() ) {
		f >> a;
		f >> b;
		f >> c;
		f >> d;
		f >> str;
		if ( pin.count ( str ) == 0 ) {
			pin.insert ( pair<string,int>(str,u1));
			u1++;
		}
	}
	cout << pin.size() << endl;
	f.close();
	for ( it = pin.begin(); it != pin.end(); it++ ) {
		cout << (*it).first << endl;
	}
	return 0;
}


