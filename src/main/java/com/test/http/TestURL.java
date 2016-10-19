package com.test.http;

import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.mime.content.InputStreamBody;
import org.apache.http.impl.client.CloseableHttpClient;

import javax.net.ssl.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * Created by abing on 2016/9/20.
 */
public class TestURL {

    private static final String url = "https://my.oschina.net/ososchina/blog/742883";

    public static void main(String[] args) {
//        testGetIgnoreCA();
        httpGet();
    }

    public static void testGetIgnoreCA() {

        TrustManager[] trustCAs = new TrustManager[]{
            new X509TrustManager() {
                @Override
                public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
                }
                @Override
                public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
                }
                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            }
        };
        try {
            SSLContext ctx = SSLContext.getInstance("TLS");
            ctx.init(null , trustCAs , null);
            SSLSocketFactory ssf = ctx.getSocketFactory();

            URL ul = new URL(url);
            HttpsURLConnection conn = (HttpsURLConnection) ul.openConnection();
            conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) ...");
            conn.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
            conn.setRequestMethod("GET");
            conn.setSSLSocketFactory(ssf);

            System.out.println(readResponse(conn.getInputStream()));

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void httpGet() {
        try {
            URL ul = new URL("http://tech.meituan.com/");
            HttpURLConnection conn = (HttpURLConnection) ul.openConnection();
            conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) ...");
            conn.setRequestMethod("GET");

            System.out.println(readResponse(conn.getInputStream()));

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static String readResponse(InputStream is){
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        try {
            String str ;
            while ((str = br.readLine()) != null) {
                sb.append(str).append("\n\r");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return  sb.toString();
    }

}
