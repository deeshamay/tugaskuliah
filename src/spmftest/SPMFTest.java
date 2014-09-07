/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spmftest;
import ca.pfv.spmf.algorithms.frequentpatterns.fpgrowth.*;
import ca.pfv.spmf.algorithms.frequentpatterns.itemsettree.*;
import java.io.IOException;

/**
 *
 * @author dee-shamay
 */
public class SPMFTest {
    
    public static String fileInput = "contextItemsetTree.txt";
    public static String fileOutputFP = "fpGrowth.txt";
    public static String fileOutputTree = "itemsetTree.txt"; 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        AlgoFPGrowth fp = new AlgoFPGrowth();
        fp.runAlgorithm(fileInput, fileOutputFP, 0.3);
        fp.printStats();
        
        ItemsetTree it = new ItemsetTree();
        it.buildTree(fileInput);
        it.printStatistics();
        it.printTree();
    }
    
}
