#include <iostream>
#include <fstream>
#include <map>
#include <vector>
#include <string>
using namespace std;
int main()
{
	fstream f;
	map<string,vector<string> > m;
	map<string,vector<string> >::iterator it;
	vector<string>::iterator it1;
	f.open ( "director_only_withfilm");
	string str;
	string str1;
	int flag = 0;
	while ( !f.eof() ) {
		vector<string> v;
		f >> str;
		f >> str1;
		m.insert ( pair<string,vector<string> > ( str, v ));
		m[str].push_back(str1);
	}
	f.close();

	f.open("producer_only_withfilm");
	while (!f.eof() ) {
		f >> str;
		f >> str1;
		m[str].push_back(str1);
	}
	f.close();

	f.open("musiccomposer_only_withfilm");
	while (!f.eof() ) {
		f >> str;
		f >> str1;
		m[str].push_back(str1);
	}
	f.close();



	f.open("writer_only_withfilm");
	while (!f.eof() ) {
		f >> str;
		f >> str1;
		m[str].push_back(str1);
	}
	f.close();

	f.open("starring_with_film");
	while (!f.eof() ) {
		f >> str;
		if ( m.count(str) > 0 ) {
			str1 = str;
			flag = 1;
			continue;
		}
		if ( flag == 1 ) {
			m[str1].push_back(str);
		}
	}
	f.close();

	f.open("dcterm_onlywithfilm");
	int u = 0;
	while (!f.eof() ) {
		f >> str;
		if ( m.count(str) > 0 ) {
			str1 = str;
			flag = 1;
			u++;
			continue;

		}
		if ( flag == 1 ) {
			m[str1].push_back(str);
		}

	}
	for ( it = m.begin(); it != m.end(); it++ ) {
		cout << (*it).first <<" ";
		for ( it1 = (*it).second.begin(); it1 != (*it).second.end(); it1++ ) {
			cout << (*it1)<< " ";
		}
		cout << endl;
	}
	f.close();

	return 0;
}



