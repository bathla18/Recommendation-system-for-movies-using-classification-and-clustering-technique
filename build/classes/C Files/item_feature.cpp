#include <iostream>
#include <fstream>
#include <cstdio>
#include <map>
#include <string>
using namespace std;
int matrix[1604][12628];
int main()
{
	ifstream f;
	int value;
	f.open ( "matrix" );
	int i = 1,j = 1;
	while ( !f.eof() ) {
		f >> value;
		if ( j == 12628 ) {
			j = 1;
			i++;
		}
		matrix[i][j] = value;
		j++;
	}
	f.close();
	map<int,string> m;
	map<int, string>::iterator it;
	f.open("unique_row");
	string str;
	while ( !f.eof() ) {
		f >> str;
		f >> value;
		m.insert ( pair<int,string>(value + 1,str));
	}
	for ( it =  m.begin(); it != m.end(); it++ ) {
		cout << (*it).second;
		int u = (*it).first;
		for ( int j = 1; j < 12628; j++ ) {
			cout <<","<< matrix[u][j];
		}
		cout << endl;
	}
	return 0;
}	
		

