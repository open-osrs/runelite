/*
 * Copyright 2012, 2013 Mauricio Pampim Correa
 * Copyright 2019 Ian William O'Neill <iano2k4@hotmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.virustotal;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;

@Slf4j
public class VirusTotalAPI
{
	@Setter (AccessLevel.PACKAGE)
	String KEY = "SHARED_API_KEY_HERE";

	@Setter (AccessLevel.PACKAGE)
	String SHA256 = null;

	@Getter (AccessLevel.PACKAGE)
	@Setter (AccessLevel.PACKAGE)
	static ArrayList AVs = new ArrayList();

	public String getReportFile(String sha256)
	{
		SHA256 = sha256;
		HttpURLConnection connection;

		String result;
		String report = "";

		try
		{
			String data = URLEncoder.encode("resource", "UTF-8") + "=" + URLEncoder.encode(SHA256, "UTF-8");
			data = data + "&" + URLEncoder.encode("key", "UTF-8") + "=" + URLEncoder.encode(KEY, "UTF-8");

			connection = (HttpURLConnection)(new URL("https://www.virustotal.com/vtapi/v2/file/report")).openConnection();
			connection.setDoOutput(true);
			connection.setUseCaches(false);

			OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
			wr.write(data);
			wr.flush();

			BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			for (String line; (line = rd.readLine()) != null; report = report + line)
			{
				// Nothing.
			}

			if (report.split("\\:").length == 2)
			{
				result = report.split("\\:")[1].replaceAll(" ", "").replaceAll("\\}", "");
				if (Integer.parseInt(result) == -2)
				{
					return "-2";
				}

				if (Integer.parseInt(result) == -1)
				{
					return "-1";
				}

				if (Integer.parseInt(result) == 0)
				{
					return "0";
				}
			}

			wr.close();
			rd.close();
			connection.disconnect();
		}
		catch (IOException exception)
		{
			exception.printStackTrace();
		}

		return report;
	}

	@Deprecated
	public String sendScanFile(String scanFile)
	{
		StringBody body = null;
		String responseString = null;

		HttpResponse response = null;

		HttpClient httpclient = new DefaultHttpClient();

		HttpPost httppost = new HttpPost("https://www.virustotal.com/vtapi/v2/file/scan");

		File file = new File(scanFile);
		FileBody bin = new FileBody(file);

		MultipartEntity reqEntity = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE);

		try
		{
			body = new StringBody(KEY, "text/plain", Charset.forName("UTF-8"));
		}
		catch (UnsupportedEncodingException exception)
		{
			exception.printStackTrace();
		}

		reqEntity.addPart("apikey", body);
		reqEntity.addPart("file", bin);
		httppost.setEntity(reqEntity);

		try
		{
			response = httpclient.execute(httppost);
			response.getEntity().getContent();
			HttpEntity entity = response.getEntity();
			responseString = EntityUtils.toString(entity);
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
		}

		return responseString;
	}

}
