#include <iostream>
#include <fstream>
#include <cstdio>
#include <algorithm>
using namespace std;
int main()
{
	ifstream f;
	f.open( "u.data_1_without_time");
	int a,b,c;
	int mat[944][1683];
	for ( int i = 0; i < 944; i++ ) {
		for ( int j = 0; j < 1683; j++ ) {
			mat[i][j] = 0;
		}
	}

	int u = 0, u1 = 0, u2 = 0;
	while ( !f.eof() ) {
		f >> a >> b >> c;
		mat[a][b] = c;
	}
	int p = 0;
	for ( int i = 1; i < 944; i++ ) {
	       for ( int j = 1; j < 1683; j++ ) {
	       		cout << mat[i][j] << " ";
			if ( mat[i][j] != 0 ) {
				p++;
			}
	       }
		cout << endl;
	}		
	cout << p << endl;

	return 0;
}

