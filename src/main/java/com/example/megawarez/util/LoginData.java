package com.example.megawarez.util;

import lombok.Data;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;

@Data
public class LoginData {
    private String username;
    private String password;

    public void setPassword(String password) throws Exception{
        this.password = createMD5(password);
    }

    public String getToken() throws Exception{
        return createMD5(getUsername() + Instant.now());
    }

    /**
     * Método para crear un hash MD5.
     *
     * @param password contraseña a crear.
     * @return hash MD5
     *
     * @throws Exception
     */
    private String createMD5(String password) throws Exception{
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.reset();
            m.update(password.getBytes());
            byte[] digest = m.digest();
            BigInteger bigInt = new BigInteger(1,digest);
            String hashText = bigInt.toString(16);
            while (hashText.length() < 32){
                hashText = "0" + hashText;
            }
            return hashText;
        }catch (NoSuchAlgorithmException noSuchAlgorithmException){
            throw new Exception(noSuchAlgorithmException.getCause());
        }
    }
}
