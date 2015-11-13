import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileSum {
    public static double sumFile(String fileName) {
        if (fileName == null) {
            return 0.0;
        }
        Double doubles = 0.0;
        try {
            File f = new File("fileName");
            Scanner scan = new Scanner(f);
            while (scan.hasNext()) {
                if (scan.hasNextInt())
                    doubles = doubles.doubleValue() + scan.nextInt();
                else if (scan.hasNextDouble())
                    doubles = doubles.doubleValue() + scan.nextDouble();
                else if (scan.hasNextLong())
                    doubles = doubles.doubleValue() + scan.nextLong();
                else if (scan.hasNextShort())
                    doubles = doubles.doubleValue() + scan.nextShort();
                else if (scan.hasNextFloat())
                    doubles = doubles.doubleValue() + scan.nextFloat();
                else
                    scan.next();
            }
        } catch (FileNotFoundException e)
        {
            System.out.println("File not found");
            return 0.0;
        }
        return doubles;
    }
}