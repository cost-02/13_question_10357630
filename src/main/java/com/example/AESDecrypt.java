package com.example;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class AESDecrypt {
    public static void main(String[] args) {
        try {
            // Questi byte array dovrebbero essere sostituiti con quelli reali utilizzati nel tuo contesto
            byte[] sessionKey = null; // la chiave di sessione dovrebbe essere fornita dal tuo servizio
            byte[] iv = null; // il vettore di inizializzazione dovrebbe essere fornito dal tuo servizio
            byte[] ciphertext = null; // il testo cifrato che desideri decriptare

            // Inizializzare il cipher per la decriptazione
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(sessionKey, "AES"), new IvParameterSpec(iv));

            // Decriptare i dati
            byte[] decryptedText = cipher.doFinal(ciphertext);

            // Convertire il testo decriptato in una stringa, assumendo che sia codificato in UTF-8
            String plaintext = new String(decryptedText, "UTF-8");
            System.out.println("Testo decriptato: " + plaintext);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
