package com.iit.univdhaka.iis.crypt;

public interface CryptString {
	public String createPassPhrase(String userGivenPass);

	public Boolean verifyPassword(String passGiven, String passwdFromDb);
}
