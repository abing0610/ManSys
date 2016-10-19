package test;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

/**
 * Created by abing on 2015/11/5.
 */
public class Base64Level {

    /**
     * ����
     *
     * @param src
     * @return
     */
    public static String encode(byte[] src){
        return  new BASE64Encoder().encode(src);
    }

    /**
     * ����
     *
     * @param src
     * @return
     */
    public static byte[] decode(String src) {
        byte[] b = null;
        try {

            BASE64Decoder decoder = new BASE64Decoder();
            b = decoder.decodeBuffer(src);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return b;
    }

    
}
