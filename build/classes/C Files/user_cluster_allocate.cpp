#include <iostream>
#include <cstdio>
#include <fstream>
#include <map>
#include <vector>
using namespace std;
int main()
{
    map<int,vector<int> > m;
    map<int,vector<int> >::iterator it;
    ifstream f;
    f.open("user_belong_cluster_without_userid.txt");
    int u = 1,k;
    while ( !f.eof()){
            f >> k;
            if ( m.count(k) == 0 ){
                vector<int> v;
                m.insert ( pair<int,vector<int> >(k,v));
            }
            m[k].push_back(u);
            u++;
    }
    ofstream f2;
    f2.open ( "user_belong_clusters_witout_id");
    vector<int>::iterator it1;
    for ( it = m.begin(); it != m.end(); it++){
            f2 << (*it).first;
            int y = (*it).first;
        for ( it1 = m[y].begin(); it1 != m[y].end(); it1++){
            f2 << " " <<(*it1);
        }
        f2 << endl;
    }
    f2.close();
    return 0;
}


