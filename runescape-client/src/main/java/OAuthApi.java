import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Implements("OAuthApi")
@ObfuscatedName("com/jagex/oldscape/pub/OAuthApi")
public interface OAuthApi {
	boolean isOnLoginScreen();

	long getAccountHash();

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
	)
	void setOtlTokenRequester(OtlTokenRequester var1);
}
