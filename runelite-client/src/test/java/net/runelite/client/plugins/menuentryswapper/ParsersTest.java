/*
 * Copyright (c) 2019, Lucas <https://github.com/lucwousin>
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

package net.runelite.client.plugins.menuentryswapper;

import org.junit.Test;

public class ParsersTest
{
	private static final String valid = "drop, jug:0\n" +
		"drop                , potato seed:0\n" +
		"drop, onion seed         :                                  0\n" +
		"drop, cabbage seed:0\n" +
		"drop, tomato                         seed:0\n" +
		"drop, sweetcorn seed:0\n" +
		"drop, Strawberry seed:0\n" +
		"drop, s nape grass seed:0\n" +
		"drop,watermelon seed:0\n" +
		"drop, marigold seed:0\n" +
		"drop, nasturtium seed:0\n" +
		"             drop, rosemary seed:    0          \n \n\n   \n\n\n \n" +
		"drop, woad seed:0\n" +
		"drop, redberry seed:0\n" +
		"drop, cadavaberry seed:0\n" +
		"// aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\n" +
		"drop, dwellberry seed:0\n" +
		"drop, jangerberry seed :0\n" +
		"drop, whiteberry seed:0\n" +
		"drop, poison ivy seed:0\n" +
		"drop, guam seed:0\n" +
		"drop, marrentill seed:0\n" +
		"drop, tarromin seed:0\n" +
		"drop, mushroom spore:0";
	private static final String valid2 = "";
	private static final String valid3 = "\n";
	private static final String valid4 = " ";

	private static final String invalid1 = " , asdassdasda: 1";
	private static final String invalid2 = "asdasd, aaaaaa: b";
	private static final String invalid3 = "aoaooa,       , 2";

	@Test
	public void testCustomSwapParse()
	{
		final CustomSwapParse parse = new CustomSwapParse();
		assert parse.isValid(valid);
		assert parse.isValid(valid2);
		assert parse.isValid(valid3);
		assert parse.isValid(valid4);

		assert !parse.isValid(invalid1);
		assert !parse.isValid(invalid2);
		assert !parse.isValid(invalid3);

		assert parse.parse(valid).length == 23;
		assert parse.parse(valid4).length == 0;
		assert parse.parse(valid2).length == 0;
		assert parse.parse(valid3).length == 0;
	}
}
