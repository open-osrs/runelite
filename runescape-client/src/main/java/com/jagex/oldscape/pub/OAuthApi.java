package com.jagex.oldscape.pub;

import net.runelite.mapping.Implements;

@Implements("OAuthApi")
public interface OAuthApi {
	boolean isOnLoginScreen();

	void setOtlTokenRequester(OtlTokenRequester var1);
}
