import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncodeTest {
    @Test
    public void isEncode_encryptdata_true(){
        assertEquals( "de", Encode.getDataProperties("bc",2));
    }
    @Test
    public void isDecode_decryptdata_true(){
        assertEquals("ab", Encode.getDataProperties("cd",2));
    }
}
