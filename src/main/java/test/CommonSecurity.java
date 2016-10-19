package test;


/**
 * 
 * ����Ǽ��ܺͽ����ַ�����������     ��Ҫ����������мӽ��� 
 * 
 * Ŀǰʹ������ط�����   ����Ĺ���ʱ��  �Լ�   jdbc���û������������
 *
 * ʹ��BASE64�����ֽ������ ���� �� ����
 *
 * Created by abing on 2015/11/5.
 */
public class CommonSecurity {

    /**
     * �����ļ����㷨 ���ؼ��ܵ��ַ���
     *
     * ����3DES���� , Ȼ������BASE64�������ɼ��ܵ��ַ���
     *
     * @param str
     * @return
     */
    public static String encode(String str){

        byte[] bytes = SecurituyLevel.encyptMode(str.getBytes());
        String encodeStr = Base64Level.encode(bytes);

        return  encodeStr ;
    }


    /**
     * �����Ľ����㷨 ���ؽ��ܵ��ַ���
     *
     * ������BASE64���� , ������Ӧ���ֽ����� , ����3DES����  , ������Ӧ���ַ���
     *
     * @param str
     * @return
     */
    public static String decode(String str){

        byte[] b64v = Base64Level.decode(str);
        byte[] ok = SecurituyLevel.decryptMode(b64v);
        String okStr = new String(ok);

        return  okStr;
    }
    
    public static void main(String[] args) {
		System.out.println(encode("20171201"));
		
//		System.out.println(decode("u7WLm+VHbZVI9O8pbm3K5A=="));

//        E3SjqRqBwvNI9O8pbm3K5A==

//        System.out.println(decode("E3SjqRqBwvNI9O8pbm3K5A=="));
	}

}

