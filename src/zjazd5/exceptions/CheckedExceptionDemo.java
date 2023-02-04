package zjazd5.exceptions;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws MalformedURLException {
        CheckedExceptionDemo ced = new CheckedExceptionDemo();
       // ced.urlTesterByTryCatch("https787878787://www.wszib.edu.pl");
        ced.urlTesterByThrows("ftp--://ftp.pl");
    }

    public void urlTesterByTryCatch(String urlStr) {
        try {
            URL url = new URL(urlStr);
            System.out.println("Protokół: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
        } catch (MalformedURLException e) {
            System.out.println("Podałeś nieprawidłowy adres url: " + e.getMessage());
            //throw new RuntimeException(e);
        }
    }

        public void urlTesterByThrows (String urlStr) throws MalformedURLException  {
            URL url = new URL(urlStr);
            System.out.println("Protokół: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
        }
    }

