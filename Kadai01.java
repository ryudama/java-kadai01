import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
class Kadai01{
    public static void main(String[] args){
        try(BufferedReader r = Files.newBufferedReader(
            Paths.get("/Users/iida/road_to_geek/java-kadai01/scores.csv"),
            StandardCharsets.UTF_8))
            {
                String line;
                while((line = r.readLine()) != null){
                    System.out.println(line);
                }
            } catch(IOException e){
                e.printStackTrace();
            }
    }
}