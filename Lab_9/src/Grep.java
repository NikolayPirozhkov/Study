import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author NikolayPirozhkov
 * @project Java
 */
public class Grep {
    String find(String args){
        StringBuilder returnLine = new StringBuilder();
        try(InputStream in = System.in;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in))){
            String line;
            while (null != (line = bufferedReader.readLine())){
                if(line.contains(args)){
                  returnLine.append(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return returnLine.toString();
    }
}
