package Optional;

import java.io.*;
import java.util.ArrayList;

public class CopyfileByte {
    public static void main(String[] args) {
        try {
            readfile();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        System.out.println(sizeFile());
    }

    public static void readfile() throws IOException {
        ArrayList<Byte> list = new ArrayList<>();
        InputStream inputStream = new FileInputStream("src/Optional/sourcefile");
        OutputStream outputStream = new FileOutputStream("src/Optional/pathfile");
        byte[] buffer = new byte[1024];
        int length = -1;
        while ((length = inputStream.read()) > 0)
            outputStream.write(length);
//        while ((length = inputStream.read(buffer))>0){
//            outputStream.write(buffer,0,length);
//        }
        outputStream.close();
        inputStream.close();
    }
    public static long sizeFile(){
        File file = new File("src/Optional/pathfile");
        return file.length();
    }
}
