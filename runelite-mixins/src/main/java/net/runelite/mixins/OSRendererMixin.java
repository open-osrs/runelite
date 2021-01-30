/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * Copyright (c) 2020, ThatGamerBlue <thatgamerblue@gmail.com>
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
package net.runelite.mixins;

import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.rs.api.RScom.jagex.oldscape.osrenderer.ak;

@Mixin(ak.class)
public abstract class OSRendererMixin
{

	@Copy("ab")
	static boolean rs$ab(int var0)
	{
		return false;
	}

	@Replace("ab")
	static boolean rl$ab(int var0)
	{
		//System.out.println("ab(" + var0 + ")");
		return rs$ab(var0);
	}

	@Copy("bn")
	static String rs$bn(byte b)
	{
		return "";
	}

	@Replace("bn")
	static String rl$bn(byte b)
	{
		System.out.println("bn(" + rs$bn(b) + ")");
		return rs$bn(b);
	}

	@Copy("bu")
	static String rs$bu(byte b)
	{
		return "";
	}

	@Replace("bu")
	static String rl$bu(byte b)
	{
		System.out.println("bu(" + rs$bu(b) + ")");
		return rs$bu(b);
	}

	@Copy("cd")
	static String rs$cd(int b)
	{
		return "";
	}

	@Replace("cd")
	static String rl$cd(int b)
	{
		System.out.println("cd(" + rs$cd(b) + ")");
		return rs$cd(b);
	}

	@Copy("cg")
	static String rs$cg(byte b)
	{
		return "";
	}

	@Replace("cg")
	static String rl$cg(byte b)
	{
		System.out.println("cg(" + rs$cg(b) + ")");
		return rs$cg(b);
	}

	@Copy("cq")
	static String rs$cq(int b)
	{
		return "";
	}

	@Replace("cq")
	static String rl$cq(int b)
	{
		System.out.println("cq(" + rs$cq(b) + ")");
		return rs$cq(b);
	}
}

