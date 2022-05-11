package com.jagex.oldscape.pub;

import net.runelite.mapping.Implements;

@Implements("OAuthApi")
public interface OAuthApi {
	void setRefreshTokenRequester(RefreshAccessTokenRequester var1);

	boolean isOnLoginScreen();

	long getAccountHash();

	void setOtlTokenRequester(OtlTokenRequester var1);
}
