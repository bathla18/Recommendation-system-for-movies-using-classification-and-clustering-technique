package project;

import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class count_director {

    public static void main(String args[]) throws FileNotFoundException, IOException {
        String service = "http://localhost:8890/sparql";
        String x, y = null, direct;
        int i = 1, alpha = 1, anP, flag = 1;
        double score, M = 77794;
        FileInputStream fstream = new FileInputStream("../Data-files/DBpedia_movieLens");
        // Get the object of DataInputStream
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine;
		//Read File Line By Line

        while ((strLine = br.readLine()) != null) {
            String sparqlQueryString1
                    = "PREFIX on:<http://dbpedia.org/ontology/>" + "\n"
                    + "PREFIX dbprop:<http://dbpedia.org/property/>" + "\n"
                    + "PREFIX dcterms: <http://purl.org/dc/terms/>" + "\n"
                    + "SELECT DISTINCT ?o FROM <http://dbpedia.org>  WHERE {<" + strLine + "> on:musicComposer ?o}";  
            QueryExecution qexec = QueryExecutionFactory.sparqlService(service, sparqlQueryString1);
            try {
                ResultSet results = qexec.execSelect();
                for (; results.hasNext();) {
                    QuerySolution soln = results.nextSolution();
                    direct = soln.get("o").toString();

                    flag++;
                    System.out.print(direct + "\n");
                }
                score = alpha * ((Math.log(M)/Math.log(10))/flag);
                System.out.print("\n   " + score);
                flag = 1;
            } finally {
                qexec.close();
                long endTime = System.currentTimeMillis();
            }
            i++;
        }
    }
}
