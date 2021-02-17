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
package net.runelite.http.service.config;

import com.google.common.collect.ImmutableMap;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ConfigServiceTest
{
	@Test
	public void testParseJsonString()
	{
		assertEquals(1, ConfigService.parseJsonString("1"));
		assertEquals(3.14, ConfigService.parseJsonString("3.14"));
		assertEquals(1L << 32, ConfigService.parseJsonString("4294967296"));
		assertEquals("test", ConfigService.parseJsonString("test"));
		assertEquals("test", ConfigService.parseJsonString("\"test\""));
		assertEquals(ImmutableMap.of("key", "value"), ConfigService.parseJsonString("{\"key\": \"value\"}"));
	}

	@Test
	public void testValidateJson()
	{
		assertTrue(ConfigService.validateJson("1"));
		assertTrue(ConfigService.validateJson("3.14"));
		assertTrue(ConfigService.validateJson("test"));
		assertTrue(ConfigService.validateJson("\"test\""));
		assertTrue(ConfigService.validateJson("key:value"));
		assertTrue(ConfigService.validateJson("{\"key\": \"value\"}"));
		assertTrue(ConfigService.validateJson("\n"));
	}
}