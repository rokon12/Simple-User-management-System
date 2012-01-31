package com.rokonoid.apps.test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.rokonoid.apps.util.crypt.MD5CryptImplementation;
import com.rokonoid.apps.util.crypt.MD5Implementation;

public class MD5Test {
	MD5CryptImplementation crypt = new MD5CryptImplementation();
	MD5Implementation md5 = new MD5Implementation();

	@Test
	public void passwordTest() {
		String pass = "rokon";
		String encryptedPass1 = md5.createPassPhrase(pass);
		String encryptedPass2 = md5.createPassPhrase(pass);

		assertEquals(encryptedPass1, encryptedPass2);
	}

}
