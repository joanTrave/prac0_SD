package utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ComUtilsService {
    private ComUtils comUtils;

    public ComUtilsService(InputStream inputStream, OutputStream outputStream) throws IOException {
        comUtils = new ComUtils(inputStream, outputStream);
    }

    public void writeTest() {
        char c = 'a';
        try {
            this.comUtils.write_char(c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readTest() {
        String result = "";
        try {
            result = ((Character) this.comUtils.read_char()).toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
