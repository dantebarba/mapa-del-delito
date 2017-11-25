package com.github.dantebarba.mapadeldelito.support;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;

public class Utils {

	public static String genMd5(String aString) throws NoSuchAlgorithmException {
		return (new HexBinaryAdapter()).marshal(MessageDigest.getInstance("MD5")
				.digest((aString).getBytes()));
	}

}
