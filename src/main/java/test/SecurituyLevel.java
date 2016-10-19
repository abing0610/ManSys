package test;


import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 *
 * ʹ��3DES�������ݵļ��� �� ����
 *
 * Created by abing on 2015/11/5.
 */
public class SecurituyLevel {

    //Ŀǰʹ������ط�ʹ�� ����ȥ���ݿ���в�ѯ �����в���
    private static final String Algorithm = "DESede";
    private static final String PASWORD_KEY = "2015KeyThisisInGa3DESSecurityPassword";

    /**
     * �����㷨
     *
     * @param src Դ���ݵ��ֽ�����
     * @return
     */
    public static byte[] encyptMode(byte[] src) {

        try {

            SecretKey desKey = new SecretKeySpec( buildDesKey(PASWORD_KEY), Algorithm);
            Cipher cipher = Cipher.getInstance(Algorithm);
            cipher.init(Cipher.ENCRYPT_MODE, desKey);

            return cipher.doFinal(src);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        return null;
    }



    /**
     * �������㷨
     * @param src
     * @return
     */
    public static byte[] decryptMode(byte[] src){

        try {

            SecretKey desKey = new SecretKeySpec(buildDesKey(PASWORD_KEY) , Algorithm);
            Cipher cipher = Cipher.getInstance(Algorithm);
            cipher.init(Cipher.DECRYPT_MODE, desKey);

            return cipher.doFinal(src);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * ���ݼ����ַ���������Կ�ֽ�����
     *
     *
     * @param keyStr    ��Կ�ַ���
     * @return
     */
    public static byte[] buildDesKey(String keyStr){

        try {

            byte[] key = new byte[24];
            byte[] tmp = keyStr.getBytes("UTF-8");
            if (key.length > tmp.length){
                System.arraycopy(tmp , 0 , key , 0 , tmp.length);
            } else {
                System.arraycopy(tmp , 0 , key , 0 , key.length);
            }

            return key;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return null;
    }

}
