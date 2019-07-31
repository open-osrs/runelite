/*
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
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
package net.runelite.client.util.ping;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.platform.win32.WinDef;
import java.util.Arrays;
import java.util.List;

public class IcmpEchoReply extends Structure
{
	private static final int IP_OPTION_INFO_SIZE = 1 + 1 + 1 + 1 + (Native.POINTER_SIZE == 8 ? 12 : 4); // on 64bit vms add 4 byte padding
	public static final int SIZE = 4 + 4 + 4 + 2 + 2 + Native.POINTER_SIZE + IP_OPTION_INFO_SIZE;

	public WinDef.ULONG address;
	public WinDef.ULONG status;
	public WinDef.ULONG roundTripTime;
	public WinDef.USHORT dataSize;
	public WinDef.USHORT reserved;
	public WinDef.PVOID data;
	public WinDef.UCHAR ttl;
	public WinDef.UCHAR tos;
	public WinDef.UCHAR flags;
	public WinDef.UCHAR optionsSize;
	public WinDef.PVOID optionsData;

	IcmpEchoReply(Pointer p)
	{
		super(p);
	}

	@Override
	protected List<String> getFieldOrder()
	{
		return Arrays.asList("address", "status", "roundTripTime", "dataSize", "reserved", "data", "ttl", "tos", "flags", "optionsSize", "optionsData");
	}
}
