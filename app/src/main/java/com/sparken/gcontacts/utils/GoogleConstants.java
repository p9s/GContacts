package com.sparken.gcontacts.utils;

public class GoogleConstants {
	           // get Client id from google api console and put it here
	public static String CLIENT_ID = "**2567062454-on1nkaho31p94bldobc3if32jgo6k7rt.apps.googleusercontent.com";
	// Use your own client id

	public static String CLIENT_SECRET = "hBdwMH5kWd8VD4ook9RD7D4g";
	// Use your own client secret

	public static String REDIRECT_URI = "http://localhost";
	public static String GRANT_TYPE = "authorization_code";
	public static String TOKEN_URL = "https://accounts.google.com/o/oauth2/token";
	public static String OAUTH_URL = "https://accounts.google.com/o/oauth2/auth";
	public static String OAUTH_SCOPE = "https://www.googleapis.com/auth/contacts.readonly";

	public static final String CONTACTS_URL = "https://www.google.com/m8/feeds/contacts/default/full";
	public static final int MAX_NB_CONTACTS = 1000;
	public static final String APP = "GContacts";
}
