/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
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
package net.runelite.http.service.hiscore;

import java.io.IOException;
import net.runelite.http.api.hiscore.HiscoreEndpoint;
import net.runelite.http.api.hiscore.HiscoreResult;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HiscoreServiceTest
{
	private static final String RESPONSE = "654683,705,1304518\n"
		+ "679419,50,107181\n"
		+ "550667,48,85764\n"
		+ "861497,50,101366\n"
		+ "891591,48,87843\n"
		+ "-1,1,4\n"
		+ "840255,27,10073\n"
		+ "1371912,10,1310\n"
		+ "432193,56,199795\n"
		+ "495638,56,198304\n"
		+ "514466,37,27502\n"
		+ "456981,54,159727\n"
		+ "459159,49,93010\n"
		+ "1028855,8,823\n"
		+ "862906,29,12749\n"
		+ "795020,31,16097\n"
		+ "673591,5,495\n"
		+ "352676,51,112259\n"
		+ "428419,40,37235\n"
		+ "461887,43,51971\n"
		+ "598582,1,10\n"
		+ "638177,1,0\n"
		+ "516239,9,1000\n"
		+ "492790,1,0\n"
		+ "2,2460\n" // leagues
		+ "-1,-1\n"
		+ "73,1738\n"
		+ "531,1432\n"
		+ "324,212\n"
		+ "8008,131\n"
		+ "1337,911\n"
		+ "42,14113\n"
		+ "1,777\n"
		+ "254,92\n"
		+ "-1,-1\n" // lms
		+ "24870,37\n"
		+ "15020,388\n"
		+ "50463,147\n"
		+ "-1,-1\n"
		+ "92357,1\n"
		+ "22758,637\n"
		+ "22744,107\n"
		+ "-1,-1\n"
		+ "20150,17\n"
		+ "29400,18\n"
		+ "13465,172\n"
		+ "1889,581\n"
		+ "42891,11\n"
		+ "1624,1957\n"
		+ "1243,2465\n"
		+ "1548,2020\n"
		+ "-1,-1\n"
		+ "16781,327\n"
		+ "19004,149\n"
		+ "-1,-1\n"
		+ "72046,5\n"
		+ "5158,374\n"
		+ "20902,279\n"
		+ "702,6495\n"
		+ "10170,184\n"
		+ "8064,202\n"
		+ "6936,2\n"
		+ "-1,-1\n"
		+ "-1,-1\n"
		+ "19779,22\n"
		+ "58283,10\n"
		+ "-1,-1\n"
		+ "-1,-1\n"
		+ "-1,-1\n"
		+ "29347,130\n"
		+ "723,4\n"
		+ "1264,38\n"
		+ "44595,4\n"
		+ "24820,4\n"
		+ "12116,782\n"
		+ "2299,724\n"
		+ "19301,62\n"
		+ "1498,5847\n";

	private final MockWebServer server = new MockWebServer();

	@Before
	public void before() throws IOException
	{
		server.enqueue(new MockResponse().setBody(RESPONSE));

		server.start();
	}

	@After
	public void after() throws IOException
	{
		server.shutdown();
	}

	@Test
	public void testNormalLookup() throws Exception
	{
		HiscoreTestService hiscores = new HiscoreTestService(server.url("/"));

		HiscoreResult result = hiscores.lookupUsername("zezima", HiscoreEndpoint.NORMAL.getHiscoreURL());

		Assert.assertEquals(50, result.getAttack().getLevel());
		Assert.assertEquals(159727L, result.getFishing().getExperience());
		Assert.assertEquals(492790, result.getConstruction().getRank());
		Assert.assertEquals(1432, result.getClueScrollAll().getLevel());
		Assert.assertEquals(324, result.getClueScrollBeginner().getRank());
		Assert.assertEquals(8008, result.getClueScrollEasy().getRank());
		Assert.assertEquals(911, result.getClueScrollMedium().getLevel());
		Assert.assertEquals(42, result.getClueScrollHard().getRank());
		Assert.assertEquals(777, result.getClueScrollElite().getLevel());
		Assert.assertEquals(254, result.getClueScrollMaster().getRank());
		Assert.assertEquals(-1, result.getLastManStanding().getLevel());
		Assert.assertEquals(2460, result.getLeaguePoints().getLevel());
		Assert.assertEquals(37, result.getAbyssalSire().getLevel());
		Assert.assertEquals(92357, result.getCallisto().getRank());
		Assert.assertEquals(5847, result.getZulrah().getLevel());
	}
}
