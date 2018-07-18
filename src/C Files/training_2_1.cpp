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
	map<string,vector<int> > m;
	map<string, vector<int> >::iterator it;
	vector<int>::iterator it1;
	ifstream f1;
	f1.open("DBpedia_movieLens");
	string str;
	while ( !f1.eof() ) {
		f1 >> str;
		vector<int> v;
		m.insert(pair<string, vector<int> >(str,v));
	}
	f1.close();

	ifstream f2;
	f2.open( "item_feature_binary" );
	while ( !f2.eof() ) {
		f2 >> str;
		int i = 1;
		if ( f2.eof() ){
				break;
				}
		while ( i <= 12627 ) {
			f2 >> value;
			m[str].push_back ( value );
			i++;
		}
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
	ifstream f4;
	f4.open( "unique_column");
	map<int,string> m1;
	map<int,string>::iterator it2;
	string st;
	while ( !f4.eof() ) {
		f4 >> st;	
		f4 >> value;
		m1.insert ( pair<int,string>(value,st));
	}
	f4.close();
	ifstream f5;
	f5.open ( "unique_row");
	map<string,int> m_id;
	while ( !f5.eof() ) {
		f5 >> st;
		f5 >> value;
		m_id.insert ( pair<string,int>(st,value));
	}
	f5.close();
	ofstream f_1;
	f_1.open( "19_rating_50.csv");
	for ( int i = 901; i <= 943; i++ ) {
		for ( int j = 1; j < 1683; j++ ) {
			if ( matrix[i][j] != 0 ) {
				if ( mapping.count(j) == 0 ) {
					continue;
				}
				string str2 = mapping[j];
				if ( m.count(str2) > 0 ) {
					cout << i << ","<<m_id[str2];
					for ( it1 = m[str2].begin(); it1 != m[str2].end() ; it1++ ) {
						cout << ","<<(*it1);
					}
					cout << endl;
					if ( matrix[i][j] >= 3 ) {
						f_1 << "1" << endl;
					}else {
						f_1 << "0" << endl;
					}
				}
			}
		}
	}
	f_1.close();
	return 0;
}


