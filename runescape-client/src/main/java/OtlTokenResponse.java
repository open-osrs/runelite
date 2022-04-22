import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@Implements("OtlTokenResponse")
@ObfuscatedName("com/jagex/oldscape/pub/OtlTokenResponse")
public interface OtlTokenResponse {
	boolean isSuccess();

	String getToken();
}
