package com.jagex.oldscape.pub;

import net.runelite.mapping.Implements;

@Implements("OtlTokenResponse")
public interface OtlTokenResponse {
	boolean isSuccess();

	String getToken();
}
