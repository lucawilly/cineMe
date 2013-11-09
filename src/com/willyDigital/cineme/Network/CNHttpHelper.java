package com.willyDigital.cineme.Network;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.MalformedInputException;

import com.squareup.okhttp.OkHttpClient;

public class CNHttpHelper {

	public static String getHttp(URL url)throws IOException{
		OkHttpClient client = new OkHttpClient();
		 HttpURLConnection connection = client.open(url);
		    InputStream in = null;
		    try {
		        // Read the response.
		        in = connection.getInputStream();
		        byte[] response = readFully(in);
		        return new String(response, "UTF-8");
		      } finally {
		        if (in != null) in.close();
		      }
	}
	
	
	
	public static  byte[] readFully(InputStream in) throws IOException {
		    ByteArrayOutputStream out = new ByteArrayOutputStream();
		    byte[] buffer = new byte[1024];
		    for (int count; (count = in.read(buffer)) != -1; ) {
		      out.write(buffer, 0, count);
		    }
		    return out.toByteArray();
		  }

}
