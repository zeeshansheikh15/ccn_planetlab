import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//ping parser 
public class traceparser {
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
            BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\zeesh\\Desktop\\project22\\pair-9(umd-nz)\\TRACE-NZ-UMD.txt"));

            // Start a line count and declare a string to hold our current line.
            int linecount = 0;
                String line;

            // Let the user know what we are searching for
            System.out.println("Searching for " + stringSearch + " in file...");

            // Loop through each line, stashing the line into our line variable.
                int i = 0;
                while (( line = bf.readLine()) != null){
//
////                                String in = line;
////                 
////                 Pattern p = Pattern.compile(" \\*\\*\\* ");
////                 Matcher m = p.matcher( in );
////                 while (m.find()) {
////                     i++;
//                 }
//                 System.out.println(i);
                
                
                Pattern pattern2 = Pattern.compile(" \\* * *  ");
                Matcher matcher2 = pattern2.matcher(line);
                while (matcher2.find()) {  
                    i++;
                   
                       
                }
//                Pattern pattern3 = Pattern.compile("received, (.*?)% packet loss");
//                Matcher matcher3 = pattern3.matcher(line);
//                while (matcher3.find()) {                    
//                    System.out.println(matcher3.group(1));
//                        System.out.println(matcher3.group(1));
//                        loss.add(Double.parseDouble(matcher3.group(1)));
//                       
//                }
//
//            
            }
            // Close the file after done searching
            System.out.println(i);
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