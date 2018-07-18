package project;


import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.ResultSetFactory;
import com.hp.hpl.jena.query.ResultSetRewindable;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class count_Starring {
    
    public static void main(String args[]) throws FileNotFoundException, IOException {        
        String service = "http://localhost:8890/sparql";
        System.setProperty("entityExpansionLimit", "1000000");
        String x, y = null;
        int i = 1;
        FileInputStream fstream = new FileInputStream("../Data-files/DBpedia_movieLens");
        // Get the object of DataInputStream
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine;
        //Read File Line By Line
        int l = 0;
        while ((strLine = br.readLine()) != null) {
            // Print the content on the console
            System.out.print("\n");
            System.out.print(strLine + " ");
            l++;
            String sparqlQueryString1
                    = "PREFIX on:<http://dbpedia.org/ontology/>" + "\n"
                    + "PREFIX dbprop:<http://dbpedia.org/property/>" + "\n"
                    + "PREFIX dcterms: <http://purl.org/dc/terms/>" + "\n"
                    + "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" + "\n"
                    + "PREFIX skos: <http://www.w3.org/2004/02/skos/core#>"+"\n"
                    + "SELECT DISTINCT  ?o FROM <http://dbpedia.org>  WHERE {<"+strLine+"> dcterms:subject ?o}";
            
            QueryExecution qexec = QueryExecutionFactory.sparqlService(service, sparqlQueryString1);
            try {
                ResultSet results = qexec.execSelect();
                for (; results.hasNext();) {
                    QuerySolution soln = results.nextSolution();
                    x = soln.get("o").toString();
                    sparql(x);
                     System.out.print(x + " ");
                     
                }
            } finally {
                qexec.close();
            }
            i++;
        }
    }

    private static void sparql(String x) {
        long i=1;
        System.setProperty("entityExpansionLimit", "1000000");
        double score, M = 77794;
        String y;
        int numberOfRows = 0;
        String sparqlQueryString
                = "PREFIX on:<http://dbpedia.org/ontology/>" + "\n"
                + "PREFIX dbprop:<http://dbpedia.org/property/>" + "\n"
                + "PREFIX dcterms: <http://purl.org/dc/terms/>" + "\n"
                   + "PREFIX skos: <http://www.w3.org/2004/02/skos/core#>"+"\n"
                + "SELECT DISTINCT ?s FROM <http://dbpedia.org>  WHERE {<"+x+"> skos:broader ?s}";
        QueryExecution qe = QueryExecutionFactory.sparqlService("http://localhost:8890/sparql", sparqlQueryString);
        try {  
            ResultSet results = qe.execSelect();
          while (results.hasNext()) {
                 QuerySolution soln = results.nextSolution();
                 y=soln.get("s").toString();
               System.out.print(y + " ");
                 i++;
                 
           }
        } finally {}
    }}
