#include <iostream>
#include <fstream>
#include <cstdio>
#include <map>
#include <vector>
using namespace std;
int main()
{
	ifstream f;
	int matrix[944][1683];
	f.open("user_item");
	int i = 1;
	int value;
	int j = 1;
	while ( !f.eof() ) {
		f >> value;
		if ( j == 1683 ) {
			j = 1;
			i++;
		}
		matrix[i][j] = value;
		j++;
	}
	f.close();

	map<string,vector<string> > m;
	map<string, vector<string> >::iterator it;
	vector<string>::iterator it1;
	ifstream f1;
	f1.open("DBpedia_movieLens");
	int flag = 0;
	string str,str1;
	while ( !f1.eof() ) {
		f1 >> str;
		vector<string> v;
		m.insert(pair<string, vector<string> >(str,v));
		flag++;
	}
	f1.close();

	ifstream f2;
	f2.open ( "feature_correspond_item");
	while ( !f2.eof() ) {
		f2 >> str;
		if ( m.count(str) > 0 ) {
			str1 = str;
			continue;
		}
		m[str1].push_back(str);
	}
	f2.close();

	ifstream f3;
	map<int,string> mapping;
	f3.open("movielen_dbpedia");
	while( !f3.eof() ) {
		f3 >> value;
		f3 >> str;
		mapping.insert ( pair<int,string> ( value, str ) );
	}
	f3.close();

	cout << "user,movie,";
	for ( int i = 1; i <= 217; i++ ) {
		if ( i != 217){
			cout << "col"<<i<<",";
		}else {
			cout << "col"<<i<<",rating"<<endl;
		}
	}

	int y = 0;
	for ( i = 1; i < 944; i++ ) {
		for ( j = 1; j < 1683; j++ ) {
			if ( matrix[i][j] == 0 ) {
				if ( mapping.count(j) == 0 ) {
					continue;
				}
				string str2 = mapping[j];
				if ( m.count(str2) > 0 ) {
					cout << i << ","<<str2;
					for ( it1 = m[str2].begin(); it1 != m[str2].end() ; it1++ ) {
						cout <<","<< (*it1);
					}
					cout <<endl;
					y++;
				}
			}
		}
	}
	cout << y << endl;
	return 0;
}

