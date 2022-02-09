package com.jagex.oldscape.pub;

import java.net.URL;
import java.util.concurrent.Future;
import net.runelite.mapping.Implements;

@Implements("OtlTokenRequester")
public interface OtlTokenRequester {
	Future request(URL var1);
}
