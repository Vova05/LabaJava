package Pract19;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Root {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        try(FileWriter writer = new FileWriter("notes3.txt", false))
        { String text = scanner.nextLine();
            writer.write(text);
            writer.append('\n');
            writer.flush();
            try(FileReader reader = new FileReader("notes3.txt"))
            {
                int c;
                while((c=reader.read())!=-1){
                    System.out.print((char)c);
                }
            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
            try (FileWriter writer1= new FileWriter("notes3.txt",false)){
                writer1.write("new\n");
            }catch(IOException ex){

                System.out.println(ex.getMessage());
            }
            writer.write("\nnew2");
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
