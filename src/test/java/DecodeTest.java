import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecodeTest {
    @Test
    public void isDecode_decryptdata_true(){
        Decode decode = new Decode();
        assertEquals("ab",decode.getDataProperties("cd",2));
    }
}
