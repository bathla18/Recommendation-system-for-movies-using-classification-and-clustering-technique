#include <iostream>
#include <fstream>
#include <map>
#include <string>
using namespace std;
int main()
{
	ifstream myfile;
	myfile.open ("DBpedia_movieLens");
	map<string,int> row;
	string str;
	map<string,int>::iterator it;
	int i = 0;
	while(!myfile.eof()) {
		getline(myfile,str); 
		if ( row.count(str) == 0 ) {
			row.insert (pair<string,int>(str,i));
			i++;
		}
	}
	for ( it = row.begin(); it != row.end(); it++ ) {
		cout << (*it).first << "  " << (*it).second << endl;		
	}
	return 0;
}




