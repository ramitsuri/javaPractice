package com.ramitsuri.javapractice;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by ramit on 9/8/2015.
 */
public class SHA {

    public static void main(String[] arg) {
        try

        {
            String password = "123456";

            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(password.getBytes());

            byte byteData[] = md.digest();

            StringBuffer hexString = new StringBuffer();
            for (int i=0;i<byteData.length;i++) {
                System.out.println(Integer.toString(byteData[i]));
                String hex=Integer.toHexString(0xff & byteData[i]);
                if(hex.length()==1) hexString.append('0');
                hexString.append(hex);
            }
            System.out.println("Hex format : " + hexString.toString());
        } catch (Exception ex) {

        }
    }
}
