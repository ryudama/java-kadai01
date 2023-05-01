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


                ///Users/iida/road_to_geek/java-kadai01/kadai01.java
                
                //うまくいったときの処理がここ
                /*
                for(int i = 0; i < 999; i++){
                    String line = r.readLine();
                    if(line == null){
                        break;
                    } else {
                        System.out.println(line);
                    }
                }*/
                String line;
                while((line = r.readLine()) != null){
                    System.out.println(line);
                }
                // ↓
            } catch(IOException e){
                //失敗したときの処理がここ
                e.printStackTrace();
            }
    }
}