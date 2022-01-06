import java.io.*;
  
public class Merging 
{
    public static void main(String[] args) throws IOException 
    {
        PrintWriter pw = new PrintWriter("thirdfile.txt");
        BufferedReader br = new BufferedReader(new FileReader("firstfile.txt"));
        String line = br.readLine();
        while (line != null)
        {
            pw.println(line);
            line = br.readLine();
        }
        br = new BufferedReader(new FileReader("secondfile.txt"));
        line = br.readLine();
        while(line != null)
        {
            pw.println(line);
            line = br.readLine();
        }
        pw.flush();
        br.close();
        pw.close();
        System.out.println("Merged firstfile.txt and secondfile.txt into thirdfile.txt");
    }
}