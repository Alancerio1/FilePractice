/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filepractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alancerio18
 */
public class FilePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path = "src" + File.separatorChar + "List.txt";
        String sentence = "It worked";
        FileWriter fw = new FileWriter(path);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(sentence);
			bw.close();

//        File file = new File(path);

//        PrintWriter output = new PrintWriter(new BufferedWriter(
//                                             new FileWriter(file,false)));
//        
//        output.println("66.25");
//        output.println("105.75");
//        output.close();
//        Garage garage = new Garage("Alex's garage");
//        garage.getFileService().setReader(new GarageTotalsReader());
//        List data = garage.getData(path);
//        double totalHours = Double.parseDouble(data.get(0).toString());
//        double totalFees = Double.parseDouble(data.get(1).toString());
//        garage.setTotalFees(totalFees);
//        garage.setTotalHours(totalHours);
//
//        System.out.println("Garage totals: Total hours = " + garage.getTotalHours());
//        System.out.println("Garage total fees = " + garage.getTotalFees());

//         if(file.exists()){
//             System.out.println("Found file");
//         }else{
//             System.out.println("Can't find file");
//         }
    }

}
