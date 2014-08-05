/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diplomski;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author vhailor
 */
public class Export2 {
    
        private String put;
        private boolean append=false;
        
        public Export2(String putanja){
            put=putanja;
        }
        
        public Export2(String putanja, boolean apendanje){
            put=putanja;
            append=apendanje;
        }
        
        public void writeToFile( ArrayList txt1, ArrayList txt2 ) throws IOException {
            Iterator i1=txt1.iterator();
            Iterator i2=txt2.iterator();
            FileWriter write = new FileWriter(put, append);
            PrintWriter printLine = new PrintWriter(write);
            while(i1.hasNext() && i2.hasNext()){
                printLine.printf("%s"+"%s"+"%s"+"%n", String.valueOf(i1.next()),", ", String.valueOf(i2.next()));
            }
            printLine.close();
        }
}
