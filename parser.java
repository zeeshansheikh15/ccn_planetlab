import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//ping parser 
public class parser {
    public static void main(String args[]) throws IOException {
        List<Double> min = new ArrayList<>();
        List<Double> max = new ArrayList<>();
        List<Double> avg = new ArrayList<>();
        List<Double> mdev = new ArrayList<>();
        List<Double> time = new ArrayList<>();
        List<Double> loss = new ArrayList<>();
        try {
            String stringSearch = "rtt min/avg/max/mdev ";
            // Open the file c:\test.txt as a buffered reader
            BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\zeesh\\Desktop\\project22\\pair-7(unc-ubc)\\PING-UNC-UBC.txt"));

            // Start a line count and declare a string to hold our current line.
            int linecount = 0;
                String line;

            // Let the user know what we are searching for
            System.out.println("Searching for " + stringSearch + " in file...");

            // Loop through each line, stashing the line into our line variable.
                while (( line = bf.readLine()) != null){

                Pattern pattern = Pattern.compile("rtt min/avg/max/mdev =(.*?)ms");
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {                    
                    System.out.println(matcher.group(1));
                    String[] arrOfStr = matcher.group(1).split("/"); 
                        System.out.println(arrOfStr[0]);
                        min.add(Double.parseDouble(arrOfStr[0]));
                        System.out.println(arrOfStr[1]);
                        System.out.println(arrOfStr[2]);
                        avg.add(Double.parseDouble(arrOfStr[1]));
                        max.add(Double.parseDouble(arrOfStr[2]));
                        mdev.add(Double.parseDouble(arrOfStr[3]));
                }
                Pattern pattern2 = Pattern.compile("packet loss, time (.*?)ms");
                Matcher matcher2 = pattern2.matcher(line);
                while (matcher2.find()) {                    
                    System.out.println(matcher2.group(1));
                        System.out.println(matcher2.group(1));
                        time.add(Double.parseDouble(matcher2.group(1)));
                       
                }
                Pattern pattern3 = Pattern.compile("received, (.*?)% packet loss");
                Matcher matcher3 = pattern3.matcher(line);
                while (matcher3.find()) {                    
                    System.out.println(matcher3.group(1));
                        System.out.println(matcher3.group(1));
                        loss.add(Double.parseDouble(matcher3.group(1)));
                       
                }

            
            }
            // Close the file after done searching
            bf.close();
        }
        catch (IOException e) {
            System.out.println("IO Error Occurred: " + e.toString());
        }
        
        for(int i = 0; i < min.size(); i++) {   
    System.out.print(min.get(i)+" , ");
} 
       System.out.println(); 
        
        for(int i = 0; i < avg.size(); i++) {   
    System.out.print(avg.get(i)+" , ");
}  
                 System.out.println();
        for(int i = 0; i < max.size(); i++) {   
    System.out.print(max.get(i)+" , ");
}     
  System.out.println();      
        for(int i = 0; i < mdev.size(); i++) {   
    System.out.print(mdev.get(i)+" , ");
}  System.out.println();      
        for(int i = 0; i < time.size(); i++) {   
    System.out.print(time.get(i)+" , ");
}
   System.out.println();      
        for(int i = 0; i < loss.size(); i++) {   
    System.out.print(loss.get(i)+" , ");
} System.out.println();      
        for(int i = 0; i < loss.size(); i++) {   
    System.out.print(i+" , ");
}
    }
}