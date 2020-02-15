import org.junit.Test;
import static org.junit.Assert.*;
import utils.ComUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ComUtilsTest {

    @Test
    public void int_test() {
        File file = new File("test.txt");
        int _example_int = 1;

        try {
            file.createNewFile();
            ComUtils comUtils = new ComUtils(new FileInputStream(file), new FileOutputStream(file));
            comUtils.write_int32(_example_int);
            int _readed_int = comUtils.read_int32();

            assertEquals(_example_int, _readed_int);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void char_test() {
        File file = new File("test.txt");
        char _example_char = 'a';

        try {
            file.createNewFile();
            ComUtils comUtils = new ComUtils(new FileInputStream(file), new FileOutputStream(file));
            comUtils.write_char(_example_char);
            char _readed_char = comUtils.read_char();

            assertEquals(_example_char, _readed_char);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
