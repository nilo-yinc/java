import java.io.FileWriter;
import java.io.IOException;

class FileWriteDemo
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter f = new FileWriter("D:\\Desktop\\LC.txt");

            f.write("Java programming is best..");

            f.close();

            System.out.println("Successfully data wrote..");
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
