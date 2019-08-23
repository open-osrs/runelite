/*
 * Copyright (c) 2019, Adam <Adam@sigterm.info>
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
package net.runelite.http.service.loottracker;

import java.io.IOException;
import java.time.Instant;
import java.util.Collections;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.runelite.http.api.RuneLiteAPI;
import net.runelite.http.api.loottracker.GameItem;
import net.runelite.http.api.loottracker.LootRecord;
import net.runelite.http.api.loottracker.LootRecordType;
import net.runelite.http.service.account.AuthFilter;
import net.runelite.http.service.account.beans.SessionEntry;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(LootTrackerController.class)
@ActiveProfiles("test")
public class LootTrackerControllerTest
{
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private LootTrackerService lootTrackerService;

	@MockBean
	private AuthFilter authFilter;

	@Before
	public void before() throws IOException
	{
		when(authFilter.handle(any(HttpServletRequest.class), any(HttpServletResponse.class)))
			.thenReturn(mock(SessionEntry.class));
	}

	@Test
	public void storeLootRecord() throws Exception
	{
		LootRecord lootRecord = new LootRecord();
		lootRecord.setType(LootRecordType.NPC);
		lootRecord.setTime(Instant.now());
		lootRecord.setDrops(Collections.singletonList(new GameItem(4151, 1)));

		String data = RuneLiteAPI.GSON.toJson(Collections.singletonList(lootRecord));
		mockMvc.perform(post("/loottracker").content(data).contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk());

		verify(lootTrackerService).store(eq(Collections.singletonList(lootRecord)), anyInt());
	}
}