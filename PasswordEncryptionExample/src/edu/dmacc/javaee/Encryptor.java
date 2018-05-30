package edu.dmacc.javaee;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

//class responsible for encrypting strings into MD5.
public class Encryptor {
	public static String encryptedPassword(String password) throws NoSuchAlgorithmException {
		//using a MethodDigest, responsible for hashing string in MD5
		MessageDigest digest = MessageDigest.getInstance("MD5");
		
		//this will put password to a set of bytes and put it into a byte object with padding
		digest.update(password.getBytes());
		byte[] b = digest.digest();
		
		//converting to hex, and will be able to use append in my for loop coming up
		StringBuffer buffer = new StringBuffer();
		
		//now we will proceed 1 by 1 through the characters using a for loop
		for(byte b1 : b) {
			buffer.append(Integer.toHexString(b1 & 0xff).toString());
		}
		//convert the buffer back to a string and return
		return buffer.toString();
	}
}
