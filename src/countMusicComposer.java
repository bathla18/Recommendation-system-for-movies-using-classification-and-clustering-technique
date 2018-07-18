package project;

import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class countMusicComposer {

    public static void main(String args[]) throws FileNotFoundException, IOException {
        File file = new File("../Data-files/writer_only_withfilm");
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        String service = "http://localhost:8890/sparql";
        String x, y = null;
        int i = 1, alpha = 1, anP = 1;
        double score, M = 77794;
        FileInputStream fstream = new FileInputStream("../Data-files/DBpedia_movieLens");
        // Get the object of DataInputStream
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine;
        while ((strLine = br.readLine()) != null) {
            System.out.print(strLine + " ");
            String sparqlQueryString1
                    = "PREFIX on:<http://dbpedia.org/ontology/>" + "\n"
                    + "PREFIX dbprop:<http://dbpedia.org/property/>" + "\n"
                    + "PREFIX dcterms: <http://purl.org/dc/terms/>" + "\n"
                    + "SELECT DISTINCT ?o  FROM <http://dbpedia.org>  WHERE {<" + strLine + "> on:writer ?o}";
            QueryExecution qexec = QueryExecutionFactory.sparqlService(service, sparqlQueryString1);
            try {
                ResultSet results = qexec.execSelect();
                for (; results.hasNext();) {
                    QuerySolution soln = results.nextSolution();
                    y = soln.get("o").toString();
                    anP++;
                }
                System.out.println(y);
                 anP = 1;

            } finally {
                qexec.close();
                long endTime = System.currentTimeMillis();
            }
            i++;
        }
    }
}
