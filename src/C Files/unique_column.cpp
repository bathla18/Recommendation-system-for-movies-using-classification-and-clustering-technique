#include <iostream>
#include <map>
#include <fstream>

using namespace std;
int main()
{
	ifstream myfile;
	myfile.open ("director_only");
	map<string,int> column;
	string str;
	map<string,int>::iterator it;
	int i = 0;
	while(!myfile.eof()) {
		getline(myfile,str);
		if ( column.count(str) == 0 ) {
			column.insert (pair<string,int>(str,i));
			i++;
		}
	}
	myfile.close();
	myfile.open ("producer_only");
	while(!myfile.eof()) {
		getline(myfile,str);
		if ( column.count(str) == 0 ) {
			column.insert (pair<string,int>(str,i));
			i++;
		}
	}
	myfile.close();
	myfile.open ("writer_only");
	while(!myfile.eof()) {
		getline(myfile,str);
		if ( column.count(str) == 0 ) {
			column.insert (pair<string,int>(str,i));
			i++;
		}
	}
	myfile.close();
	myfile.open ("starring_only");
	while(!myfile.eof()) {
		getline(myfile,str);
		if ( column.count(str) == 0 ) {
			column.insert (pair<string,int>(str,i));
			i++;
		}
	}
	myfile.close();
	myfile.open ("musiccomposer_only");
	while(!myfile.eof()) {
		getline(myfile,str);
		if ( column.count(str) == 0 ) {
			column.insert (pair<string,int>(str,i));
			i++;
		}
	}
	myfile.close();
	myfile.open ("dcterm_only");
	while(!myfile.eof()) {
		getline(myfile,str);
		if ( column.count(str) == 0 ) {
			column.insert (pair<string,int>(str,i));
			i++;
		}
	}
	myfile.close();
	for ( it = column.begin(); it != column.end(); it++ ) {
		cout << (*it).first << " " << (*it).second << endl;
	}

	return 0;
}


