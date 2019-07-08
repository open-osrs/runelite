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
package net.runelite.client.util.virustotal;

import lombok.Cleanup;
import net.runelite.client.config.ConfigManager;

import javax.inject.Inject;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class VirusTotal
{
	@Inject
	ConfigManager configManager;

	public VirusTotal()
	{
		// Nothing.
	}

	public String getPluginSHA256(String fileName) throws Exception
	{
		MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
		try
		{
			@Cleanup FileInputStream file = new FileInputStream(fileName);
			byte[] dataBytes = new byte[1024];
			int nread;
			while ((nread = file.read(dataBytes)) != -1)
			{
				messageDigest.update(dataBytes, 0, nread);
			}
		}
		catch (FileNotFoundException exception)
		{
			exception.printStackTrace();
		}
		byte[] digest = messageDigest.digest();
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < digest.length; i++)
		{
			stringBuffer.append(Integer.toString((digest[i] & 0xff) + 0x100, 16).substring(1));
		}
		return stringBuffer.toString();
	}

	public Set scanReport(String sha256)
	{
		Set reports = new HashSet();
		VirusTotalAPI virusTotal = new VirusTotalAPI();

		String report = virusTotal.getReportFile(sha256.toLowerCase());

		ParseReport parser = new ParseReport(report);
		String parsed = parser.getNodeData("scans");

		ArrayList vendors = parser.getNodeNames(parsed); // Null here after api limit.
		Iterator it = vendors.iterator();

		while (it.hasNext())
		{
			String vendor = (String) it.next();
			parser.setJson(parsed);
			String data = parser.getNodeData(vendor);
			parser.setJson(data);
			String detected = parser.getNodeData("detected");
			String update = parser.getNodeData("update");
			String malwarename = parser.getNodeData("result");

			ReportScan reportScan = new ReportScan();
			reportScan.setMalwarename(malwarename);
			reportScan.setUpdate(update);
			reportScan.setVendor(vendor);
			reportScan.setDetected(detected);
			reports.add(reportScan);
		}

		return reports;
	}

	@Deprecated
	public Set sendFileScan(String file)
	{
		Set reports = new HashSet();

		VirusTotalAPI virusTotal = new VirusTotalAPI();
		String report = virusTotal.sendScanFile(file);
		ReportFileScan fileScan = new ReportFileScan();
		ParseReport parser = new ParseReport(report);
		fileScan.setResponseCode(parser.getNodeData("response_code"));
		fileScan.setPermaLink(parser.getNodeData("permalink"));

		reports.add(fileScan);
		return reports;
	}

	public String getReportURL(String sha256)
	{
		String url;

		VirusTotalAPI virusTotal = new VirusTotalAPI();
		String Report = virusTotal.getReportFile(sha256.toLowerCase());
		ParseReport parser = new ParseReport(Report);

		url = parser.getNodeData("permalink");
		return url;
	}

	public String getScanDate(String sha256)
	{
		String scanDate;

		VirusTotalAPI virusTotal = new VirusTotalAPI();
		String Report = virusTotal.getReportFile(sha256.toLowerCase());
		ParseReport parser = new ParseReport(Report);

		scanDate = parser.getNodeData("scan_date");
		return scanDate;
	}


	public String getResponseCodeReport(String sha256)
	{
		String responseCode;

		VirusTotalAPI virusTotal = new VirusTotalAPI();
		String report = virusTotal.getReportFile(sha256.toLowerCase());

		ParseReport parser = new ParseReport(report);
		responseCode = parser.getNodeData("response_code");
		return responseCode;
	}

}