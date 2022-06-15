import com.jagex.oldscape.pub.OtlTokenRequester;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.Future;

import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import netscape.javascript.JSObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi {
	@ObfuscatedName("rh")
	@ObfuscatedSignature(
		descriptor = "[Len;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("uv")
	@ObfuscatedGetter(
		intValue = 935610695
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("um")
	@ObfuscatedGetter(
		intValue = -1999216999
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("ve")
	@ObfuscatedGetter(
		intValue = -1204982751
	)
	public static int field770;
	@ObfuscatedName("sh")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		intValue = 1324995943
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("vz")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	static final ApproximateRouteStrategy field774;
	@ObfuscatedName("sc")
	@ObfuscatedGetter(
		intValue = -810716679
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("sy")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("ti")
	static boolean[] field743;
	@ObfuscatedName("vj")
	static int[] field674;
	@ObfuscatedName("vf")
	static int[] field776;
	@ObfuscatedName("sq")
	@ObfuscatedGetter(
		intValue = 1799589947
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("ub")
	@ObfuscatedGetter(
		intValue = 1084011589
	)
	static int field535;
	@ObfuscatedName("st")
	@ObfuscatedGetter(
		intValue = -1215099569
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("uf")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("sn")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("ue")
	@ObfuscatedGetter(
		intValue = 1282769637
	)
	static int field763;
	@ObfuscatedName("so")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("sd")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "[Lan;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("ul")
	@ObfuscatedSignature(
		descriptor = "[Llu;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("sv")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("su")
	@ObfuscatedGetter(
		intValue = 2096040037
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("ut")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("ua")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("rj")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("vq")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("vl")
	@ObfuscatedGetter(
		intValue = 2097510307
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("rc")
	@ObfuscatedGetter(
		longValue = -8920117415948099427L
	)
	static long field728;
	@ObfuscatedName("rq")
	@ObfuscatedSignature(
		descriptor = "[Lex;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("uk")
	@ObfuscatedGetter(
		intValue = -190157901
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("rv")
	@ObfuscatedGetter(
		intValue = 1912439921
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("ra")
	@ObfuscatedGetter(
		intValue = -1001314581
	)
	static int field725;
	@ObfuscatedName("un")
	@ObfuscatedGetter(
		intValue = -1741790015
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("uc")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("rg")
	@ObfuscatedGetter(
		intValue = 1279667255
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("ry")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("rs")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("tc")
	static short field748;
	@ObfuscatedName("tw")
	static short field749;
	@ObfuscatedName("uh")
	static short field754;
	@ObfuscatedName("tt")
	static boolean field667;
	@ObfuscatedName("re")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("ud")
	static short field755;
	@ObfuscatedName("tu")
	static short field753;
	@ObfuscatedName("ux")
	@ObfuscatedGetter(
		intValue = -1670932953
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("tb")
	static short field752;
	@ObfuscatedName("tg")
	static int[] field762;
	@ObfuscatedName("tz")
	static int[] field745;
	@ObfuscatedName("tp")
	static int[] field537;
	@ObfuscatedName("ts")
	static int[] field747;
	@ObfuscatedName("td")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("tl")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("vv")
	@ObfuscatedGetter(
		intValue = 1859330951
	)
	static int field626;
	@ObfuscatedName("rk")
	@ObfuscatedGetter(
		intValue = -1407928571
	)
	static int field719;
	@ObfuscatedName("ru")
	static String field716;
	@ObfuscatedName("rw")
	static int[] field721;
	@ObfuscatedName("rm")
	static int[] field720;
	@ObfuscatedName("rt")
	@ObfuscatedGetter(
		intValue = 497802505
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("rn")
	@ObfuscatedGetter(
		intValue = 1719780425
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("rd")
	static int[] field773;
	@ObfuscatedName("uy")
	@ObfuscatedSignature(
		descriptor = "Lbq;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("uo")
	@ObfuscatedGetter(
		intValue = -1313039179
	)
	static int field588;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lgv;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("as")
	static boolean field521;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1074570965
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 946805513
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1890225389
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bn")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bq")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("bl")
	static String field481;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1910731347
	)
	static int field482;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1905357045
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1350068019
	)
	static int field484;
	@ObfuscatedName("bb")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 1269137329
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("ch")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 1368590037
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		longValue = 7202440968788630607L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 390292647
	)
	static int field605;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 1325851119
	)
	static int field647;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		longValue = -1804668360873736025L
	)
	static long field662;
	@ObfuscatedName("ds")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -171892083
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 60579783
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 833909779
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 1006702923
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 515437285
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -1291351367
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -1444359881
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1056241987
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -85823269
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 1131242953
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = 607109525
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = 986040805
	)
	static int field621;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		longValue = -2878806795400476923L
	)
	static long field778;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = -1225597433
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("fr")
	@ObfuscatedGetter(
		intValue = 1982553661
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("fz")
	@ObfuscatedGetter(
		intValue = -2060549467
	)
	static int field512;
	@ObfuscatedName("fh")
	@ObfuscatedGetter(
		intValue = 1277489
	)
	static int field609;
	@ObfuscatedName("fw")
	@ObfuscatedGetter(
		intValue = -1316290873
	)
	static int field514;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static class124 field515;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	static class446 field516;
	@ObfuscatedName("fo")
	@ObfuscatedGetter(
		intValue = 1290584285
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("fq")
	static final String field527;
	@ObfuscatedName("gp")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "Lbw;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("gu")
	static int[] field530;
	@ObfuscatedName("gw")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "[Lco;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = 1254072227
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("gq")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = 1772801065
	)
	static int field538;
	@ObfuscatedName("gg")
	static int[] field539;
	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("hk")
	@ObfuscatedGetter(
		intValue = 1646872955
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("hs")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("hl")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("ht")
	@ObfuscatedGetter(
		intValue = -202810841
	)
	static int field694;
	@ObfuscatedName("hg")
	@ObfuscatedGetter(
		intValue = -225611453
	)
	static int field546;
	@ObfuscatedName("hn")
	@ObfuscatedGetter(
		intValue = 1086571893
	)
	static int field547;
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = 1979760859
	)
	static int field548;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = -1202603819
	)
	static int field549;
	@ObfuscatedName("hf")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("is")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("ie")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("il")
	static final int[] field582;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = 1380070425
	)
	static int field555;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = 11377727
	)
	static int field556;
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		intValue = -994848647
	)
	static int field653;
	@ObfuscatedName("ib")
	@ObfuscatedGetter(
		intValue = 1437024821
	)
	static int field558;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = -1267863299
	)
	static int field553;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("id")
	static boolean field560;
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = 227812733
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = -1074847463
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("jz")
	@ObfuscatedGetter(
		intValue = -816340287
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = 374512009
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = 1656721383
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = 566842587
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = 1432786235
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = -1325635219
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = -1995181845
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = 1032499049
	)
	static int field570;
	@ObfuscatedName("ji")
	@ObfuscatedGetter(
		intValue = 1407304007
	)
	static int field571;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = 148519397
	)
	static int field572;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = -149009651
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = 7759089
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = 1789144907
	)
	public static int field635;
	@ObfuscatedName("kp")
	static boolean field533;
	@ObfuscatedName("kr")
	@ObfuscatedGetter(
		intValue = -68869867
	)
	static int field493;
	@ObfuscatedName("kd")
	static boolean field578;
	@ObfuscatedName("kf")
	@ObfuscatedGetter(
		intValue = -1491072859
	)
	static int field681;
	@ObfuscatedName("ki")
	@ObfuscatedGetter(
		intValue = -1075023379
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = 114946289
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("kk")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("kb")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("ke")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("kh")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("ku")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("kn")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("kw")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("kq")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("kc")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("kg")
	@ObfuscatedGetter(
		intValue = -1223447233
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("ka")
	@ObfuscatedGetter(
		intValue = 1110096171
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = -1835185617
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = -1319931075
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("kz")
	@ObfuscatedGetter(
		intValue = -1901549727
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("kj")
	@ObfuscatedGetter(
		intValue = 74657781
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = -1712964005
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("km")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("kv")
	@ObfuscatedGetter(
		intValue = -1882771743
	)
	static int field599;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = -607516803
	)
	static int field600;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = 543552379
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = 1208682555
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = -1970131045
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("lv")
	@ObfuscatedGetter(
		intValue = -233015653
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("lw")
	static boolean field705;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = 882283935
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("ln")
	@ObfuscatedGetter(
		intValue = 1779631475
	)
	static int field607;
	@ObfuscatedName("lj")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "[Lci;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = 1199512807
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = -1381361397
	)
	static int field601;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		longValue = 1857087709666512391L
	)
	static long field612;
	@ObfuscatedName("lz")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 2032870849
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = 499701621
	)
	static int field615;
	@ObfuscatedName("ld")
	static int[] field616;
	@ObfuscatedName("mx")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("mb")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("ml")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("mr")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = -573630111
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "[[[Llo;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("mt")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("mw")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("mq")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		intValue = 106403657
	)
	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("mm")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("md")
	@ObfuscatedGetter(
		intValue = 522171969
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("mf")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("mg")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("my")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("mv")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("mi")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("nv")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("ng")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("no")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("nh")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("nj")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("ne")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("nn")
	@ObfuscatedGetter(
		intValue = -1891205191
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("nq")
	@ObfuscatedGetter(
		intValue = 794951399
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("nl")
	@ObfuscatedGetter(
		intValue = -787071349
	)
	static int field638;
	@ObfuscatedName("np")
	@ObfuscatedGetter(
		intValue = 1198468895
	)
	static int field646;
	@ObfuscatedName("nw")
	@ObfuscatedGetter(
		intValue = 583575935
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("nd")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("nz")
	@ObfuscatedGetter(
		intValue = -627541487
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("ns")
	@ObfuscatedGetter(
		intValue = 834564635
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("nx")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("ni")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("ny")
	@ObfuscatedGetter(
		intValue = -1662823287
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("or")
	@ObfuscatedGetter(
		intValue = 656001227
	)
	static int field656;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = 209876339
	)
	static int field657;
	@ObfuscatedName("ol")
	@ObfuscatedGetter(
		intValue = -659435717
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = -1601368233
	)
	static int field676;
	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("oi")
	@ObfuscatedGetter(
		intValue = 416479
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = 1324693451
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = 461459507
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		intValue = 2076010155
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("oc")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("clickedWidget")
	public static Widget clickedWidget;
	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("ob")
	@ObfuscatedGetter(
		intValue = -1712422655
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("ow")
	@ObfuscatedGetter(
		intValue = -296722423
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("oh")
	static boolean field767;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = -1791235815
	)
	static int field664;
	@ObfuscatedName("os")
	@ObfuscatedGetter(
		intValue = -839646525
	)
	static int field550;
	@ObfuscatedName("od")
	static boolean field675;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = 1288881969
	)
	static int field775;
	@ObfuscatedName("oe")
	@ObfuscatedGetter(
		intValue = -380497981
	)
	static int field677;
	@ObfuscatedName("oy")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = 285293563
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("pg")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = 1293312285
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("pa")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("ph")
	@ObfuscatedGetter(
		intValue = -691611171
	)
	static int field683;
	@ObfuscatedName("pr")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("pf")
	@ObfuscatedGetter(
		intValue = -967328363
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("pz")
	static int[] field686;
	@ObfuscatedName("pu")
	@ObfuscatedGetter(
		intValue = -435906803
	)
	static int field687;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = -74544135
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("pv")
	@ObfuscatedGetter(
		intValue = -1145277929
	)
	static int field689;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = 928375515
	)
	static int field690;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = 985499809
	)
	static int field525;
	@ObfuscatedName("po")
	@ObfuscatedGetter(
		intValue = -1122398405
	)
	static int field692;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = -954040221
	)
	static int field480;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = 814513413
	)
	static int field661;
	@ObfuscatedName("pp")
	@ObfuscatedGetter(
		intValue = -218300167
	)
	static int field695;
	@ObfuscatedName("qo")
	@ObfuscatedGetter(
		intValue = 1033995651
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("qm")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	static NodeDeque field698;
	@ObfuscatedName("qi")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	static NodeDeque field699;
	@ObfuscatedName("qq")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(
		intValue = 1651725245
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = -1575231401
	)
	static int field702;
	@ObfuscatedName("qn")
	static boolean[] field703;
	@ObfuscatedName("qy")
	static boolean[] field704;
	@ObfuscatedName("qu")
	static boolean[] field751;
	@ObfuscatedName("qe")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("qb")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("qs")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("qv")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("qg")
	@ObfuscatedGetter(
		intValue = 56462401
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("qj")
	@ObfuscatedGetter(
		longValue = 7845411661208525347L
	)
	static long field711;
	@ObfuscatedName("qz")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("fi")
	String field518;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Lu;"
	)
	class14 field519;
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "La;"
	)
	class19 field520;
	@ObfuscatedName("fs")
	OtlTokenRequester field733;
	@ObfuscatedName("fk")
	Future field611;
	@ObfuscatedName("fj")
	boolean field523;
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "La;"
	)
	class19 field524;
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester field673;
	@ObfuscatedName("fd")
	Future field526;
	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	Buffer field531;
	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "Lw;"
	)
	class7 field532;
	@ObfuscatedName("gz")
	@ObfuscatedGetter(
		longValue = 6747147557520930471L
	)
	long field707;

	static {
		field521 = true; // L: 147
		worldId = 1; // L: 148
		worldProperties = 0; // L: 149
		gameBuild = 0; // L: 151
		isMembersWorld = false; // L: 154
		isLowDetail = false; // L: 155
		field482 = -1; // L: 160
		clientType = -1; // L: 161
		field484 = -1; // L: 162
		onMobile = false; // L: 163
		gameState = 0; // L: 175
		isLoading = true; // L: 199
		cycle = 0; // L: 200
		mouseLastLastPressedTimeMillis = -1L; // L: 201
		field605 = -1; // L: 203
		field647 = -1; // L: 204
		field662 = -1L; // L: 205
		hadFocus = true; // L: 206
		rebootTimer = 0; // L: 207
		hintArrowType = 0; // L: 208
		hintArrowNpcIndex = 0; // L: 209
		hintArrowPlayerIndex = 0; // L: 210
		hintArrowX = 0; // L: 211
		hintArrowY = 0; // L: 212
		hintArrowHeight = 0; // L: 213
		hintArrowSubX = 0; // L: 214
		hintArrowSubY = 0; // L: 215
		playerAttackOption = AttackOption.AttackOption_hidden; // L: 217
		npcAttackOption = AttackOption.AttackOption_hidden; // L: 218
		titleLoadingStage = 0; // L: 223
		js5ConnectState = 0; // L: 226
		field621 = 0; // L: 227
		js5Errors = 0; // L: 250
		loginState = 0; // L: 252
		field512 = 0; // L: 253
		field609 = 0; // L: 254
		field514 = 0; // L: 255
		field515 = class124.field1543; // L: 256
		field516 = class446.field4751; // L: 257
		int var1 = "com_jagex_auth_desktop_osrs:public".length(); // L: 282
		byte[] var2 = new byte[var1]; // L: 283

		int var3;
		for (var3 = 0; var3 < var1; ++var3) { // L: 284
			char var10 = "com_jagex_auth_desktop_osrs:public".charAt(var3); // L: 285
			if (var10 > 127) { // L: 286
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var10; // L: 287
			}
		}

		byte[] var0 = var2; // L: 289
		var3 = var2.length; // L: 294
		StringBuilder var4 = new StringBuilder(); // L: 296

		for (int var5 = 0; var5 < var3 + 0; var5 += 3) { // L: 297
			int var6 = var0[var5] & 255; // L: 298
			var4.append(class341.field4146[var6 >>> 2]); // L: 299
			if (var5 < var3 - 1) { // L: 300
				int var7 = var0[var5 + 1] & 255; // L: 301
				var4.append(class341.field4146[(var6 & 3) << 4 | var7 >>> 4]); // L: 302
				if (var5 < var3 - 2) { // L: 303
					int var8 = var0[var5 + 2] & 255; // L: 304
					var4.append(class341.field4146[(var7 & 15) << 2 | var8 >>> 6]).append(class341.field4146[var8 & 63]); // L: 305
				} else {
					var4.append(class341.field4146[(var7 & 15) << 2]).append("="); // L: 307
				}
			} else {
				var4.append(class341.field4146[(var6 & 3) << 4]).append("=="); // L: 309
			}
		}

		String var11 = var4.toString(); // L: 311
		field527 = var11; // L: 315
		Login_isUsernameRemembered = false; // L: 324
		secureRandomFuture = new SecureRandomFuture(); // L: 325
		randomDatData = null; // L: 331
		npcs = new NPC[32768]; // L: 335
		npcCount = 0; // L: 336
		npcIndices = new int[32768]; // L: 337
		field538 = 0; // L: 338
		field539 = new int[250]; // L: 339
		packetWriter = new PacketWriter(); // L: 342
		logoutTimer = 0; // L: 344
		hadNetworkError = false; // L: 345
		timer = new Timer(); // L: 346
		fontsMap = new HashMap(); // L: 352
		field694 = 0; // L: 359
		field546 = 1; // L: 360
		field547 = 0; // L: 361
		field548 = 1; // L: 362
		field549 = 0; // L: 363
		collisionMaps = new CollisionMap[4]; // L: 371
		isInInstance = false; // L: 372
		instanceChunkTemplates = new int[4][13][13]; // L: 373
		field582 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 374
		field555 = 0; // L: 377
		field556 = 2301979; // L: 389
		field653 = 5063219; // L: 390
		field558 = 3353893; // L: 391
		field553 = 7759444; // L: 392
		field560 = false; // L: 393
		alternativeScrollbarWidth = 0; // L: 394
		camAngleX = 128; // L: 402
		camAngleY = 0; // L: 403
		camAngleDY = 0; // L: 404
		camAngleDX = 0; // L: 405
		mouseCamClickedX = 0; // L: 406
		mouseCamClickedY = 0; // L: 407
		oculusOrbState = 0; // L: 408
		camFollowHeight = 50; // L: 409
		field570 = 0; // L: 413
		field571 = 0; // L: 414
		field572 = 0; // L: 415
		oculusOrbNormalSpeed = 12; // L: 417
		oculusOrbSlowedSpeed = 6; // L: 418
		field635 = 0; // L: 419
		field533 = false; // L: 420
		field493 = 0; // L: 421
		field578 = false; // L: 422
		field681 = 0; // L: 423
		overheadTextCount = 0; // L: 424
		overheadTextLimit = 50; // L: 425
		overheadTextXs = new int[overheadTextLimit]; // L: 426
		overheadTextYs = new int[overheadTextLimit]; // L: 427
		overheadTextAscents = new int[overheadTextLimit]; // L: 428
		overheadTextXOffsets = new int[overheadTextLimit]; // L: 429
		overheadTextColors = new int[overheadTextLimit]; // L: 430
		overheadTextEffects = new int[overheadTextLimit]; // L: 431
		overheadTextCyclesRemaining = new int[overheadTextLimit]; // L: 432
		overheadText = new String[overheadTextLimit]; // L: 433
		tileLastDrawnActor = new int[104][104]; // L: 434
		viewportDrawCount = 0; // L: 435
		viewportTempX = -1; // L: 436
		viewportTempY = -1; // L: 437
		mouseCrossX = 0; // L: 438
		mouseCrossY = 0; // L: 439
		mouseCrossState = 0; // L: 440
		mouseCrossColor = 0; // L: 441
		showMouseCross = true; // L: 442
		field599 = 0; // L: 444
		field600 = 0; // L: 445
		dragItemSlotSource = 0; // L: 448
		draggedWidgetX = 0; // L: 449
		draggedWidgetY = 0; // L: 450
		dragItemSlotDestination = 0; // L: 451
		field705 = false; // L: 452
		itemDragDuration = 0; // L: 453
		field607 = 0; // L: 454
		showLoadingMessages = true; // L: 456
		players = new Player[2048]; // L: 458
		localPlayerIndex = -1; // L: 460
		field601 = 0; // L: 461
		field612 = -1L; // L: 462
		renderSelf = true; // L: 464
		drawPlayerNames = 0; // L: 469
		field615 = 0; // L: 470
		field616 = new int[1000]; // L: 471
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 473
		playerMenuActions = new String[8]; // L: 474
		playerOptionsPriorities = new boolean[8]; // L: 475
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 476
		combatTargetPlayerIndex = -1; // L: 477
		groundItems = new NodeDeque[4][104][104]; // L: 478
		pendingSpawns = new NodeDeque(); // L: 479
		projectiles = new NodeDeque(); // L: 480
		graphicsObjects = new NodeDeque(); // L: 481
		currentLevels = new int[25]; // L: 482
		levels = new int[25]; // L: 483
		experience = new int[25]; // L: 484
		leftClickOpensMenu = 0; // L: 485
		isMenuOpen = false; // L: 486
		menuOptionsCount = 0; // L: 492
		menuArguments1 = new int[500]; // L: 493
		menuArguments2 = new int[500]; // L: 494
		menuOpcodes = new int[500]; // L: 495
		menuIdentifiers = new int[500]; // L: 496
		menuActions = new String[500]; // L: 497
		menuTargets = new String[500]; // L: 498
		menuShiftClick = new boolean[500]; // L: 499
		followerOpsLowPriority = false; // L: 500
		shiftClickDrop = false; // L: 502
		tapToDrop = false; // L: 503
		showMouseOverText = true; // L: 504
		viewportX = -1; // L: 505
		viewportY = -1; // L: 506
		field638 = 0; // L: 510
		field646 = 50; // L: 511
		isItemSelected = 0; // L: 512
		selectedItemName = null; // L: 516
		isSpellSelected = false; // L: 517
		selectedSpellChildIndex = -1; // L: 519
		selectedSpellItemId = -1; // L: 520
		selectedSpellActionName = null; // L: 522
		selectedSpellName = null; // L: 523
		rootInterface = -1; // L: 524
		interfaceParents = new NodeHashTable(8); // L: 525
		field656 = 0; // L: 530
		field657 = -1; // L: 531
		chatEffects = 0; // L: 532
		field676 = 0; // L: 533
		meslayerContinueWidget = null; // L: 534
		runEnergy = 0; // L: 535
		weight = 0; // L: 536
		staffModLevel = 0; // L: 537
		followerIndex = -1; // L: 538
		playerMod = false; // L: 539
		viewportWidget = null; // L: 540
		clickedWidget = null; // L: 541
		clickedWidgetParent = null; // L: 542
		widgetClickX = 0; // L: 543
		widgetClickY = 0; // L: 544
		draggedOnWidget = null; // L: 545
		field767 = false; // L: 546
		field664 = -1; // L: 547
		field550 = -1; // L: 548
		field675 = false; // L: 549
		field775 = -1; // L: 550
		field677 = -1; // L: 551
		isDraggingWidget = false; // L: 552
		cycleCntr = 1; // L: 557
		changedVarps = new int[32]; // L: 560
		changedVarpCount = 0; // L: 561
		changedItemContainers = new int[32]; // L: 562
		field683 = 0; // L: 563
		changedSkills = new int[32]; // L: 564
		changedSkillsCount = 0; // L: 565
		field686 = new int[32]; // L: 566
		field687 = 0; // L: 567
		chatCycle = 0; // L: 568
		field689 = 0; // L: 569
		field690 = 0; // L: 570
		field525 = 0; // L: 571
		field692 = 0; // L: 572
		field480 = 0; // L: 573
		field661 = 0; // L: 574
		field695 = 0; // L: 575
		mouseWheelRotation = 0; // L: 581
		scriptEvents = new NodeDeque(); // L: 582
		field698 = new NodeDeque(); // L: 583
		field699 = new NodeDeque(); // L: 584
		widgetFlags = new NodeHashTable(512); // L: 585
		rootWidgetCount = 0; // L: 587
		field702 = -2; // L: 588
		field703 = new boolean[100]; // L: 589
		field704 = new boolean[100]; // L: 590
		field751 = new boolean[100]; // L: 591
		rootWidgetXs = new int[100]; // L: 592
		rootWidgetYs = new int[100]; // L: 593
		rootWidgetWidths = new int[100]; // L: 594
		rootWidgetHeights = new int[100]; // L: 595
		gameDrawingMode = 0; // L: 596
		field711 = 0L; // L: 597
		isResizable = true; // L: 598
		field773 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 605
		publicChatMode = 0; // L: 606
		tradeChatMode = 0; // L: 608
		field716 = ""; // L: 609
		crossWorldMessageIds = new long[100]; // L: 611
		crossWorldMessageIdsIndex = 0; // L: 612
		field719 = 0; // L: 614
		field720 = new int[128]; // L: 615
		field721 = new int[128]; // L: 616
		field728 = -1L; // L: 617
		currentClanSettings = new ClanSettings[4]; // L: 621
		currentClanChannels = new ClanChannel[4]; // L: 623
		field725 = -1; // L: 625
		mapIconCount = 0; // L: 626
		mapIconXs = new int[1000]; // L: 627
		mapIconYs = new int[1000]; // L: 628
		mapIcons = new SpritePixels[1000]; // L: 629
		destinationX = 0; // L: 630
		destinationY = 0; // L: 631
		minimapState = 0; // L: 638
		currentTrackGroupId = -1; // L: 639
		playingJingle = false; // L: 640
		soundEffectCount = 0; // L: 646
		soundEffectIds = new int[50]; // L: 647
		queuedSoundEffectLoops = new int[50]; // L: 648
		queuedSoundEffectDelays = new int[50]; // L: 649
		soundLocations = new int[50]; // L: 650
		soundEffects = new SoundEffect[50]; // L: 651
		isCameraLocked = false; // L: 653
		field667 = false; // L: 664
		field743 = new boolean[5]; // L: 672
		field762 = new int[5]; // L: 673
		field745 = new int[5]; // L: 674
		field537 = new int[5]; // L: 675
		field747 = new int[5]; // L: 676
		field748 = 256; // L: 677
		field749 = 205; // L: 678
		zoomHeight = 256; // L: 679
		zoomWidth = 320; // L: 680
		field752 = 1; // L: 681
		field753 = 32767; // L: 682
		field754 = 1; // L: 683
		field755 = 32767; // L: 684
		viewportOffsetX = 0; // L: 685
		viewportOffsetY = 0; // L: 686
		viewportWidth = 0; // L: 687
		viewportHeight = 0; // L: 688
		viewportZoom = 0; // L: 689
		playerAppearance = new PlayerComposition(); // L: 691
		field535 = -1; // L: 692
		field763 = -1; // L: 693
		platformInfoProvider = new DesktopPlatformInfoProvider(); // L: 695
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 697
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 700
		Widget_cachedModels = new EvictingDualNodeHashTable(64); // L: 702
		Widget_cachedFonts = new EvictingDualNodeHashTable(64); // L: 703
		field588 = -1; // L: 706
		field770 = -1; // L: 712
		archiveLoaders = new ArrayList(10); // L: 713
		archiveLoadersDone = 0; // L: 714
		field626 = 0; // L: 715
		field774 = new ApproximateRouteStrategy(); // L: 724
		field674 = new int[50]; // L: 725
		field776 = new int[50]; // L: 726
	}

	public Client() {
		this.field523 = false; // L: 273
		this.field707 = -1L;
	} // L: 330

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1807518530"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field711 = class115.method2692() + 500L; // L: 4394
		this.resizeJS(); // L: 4395
		if (rootInterface != -1) { // L: 4396
			this.resizeRoot(true);
		}

	} // L: 4397

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1208160772"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000}; // L: 967
		int[] var2 = new int[]{1000, 100, 500}; // L: 968
		if (var1 != null && var2 != null) { // L: 970
			Canvas.ByteArrayPool_alternativeSizes = var1; // L: 977
			class17.ByteArrayPool_altSizeArrayCounts = new int[var1.length]; // L: 978
			class464.ByteArrayPool_arrays = new byte[var1.length][][]; // L: 979

			for (int var3 = 0; var3 < Canvas.ByteArrayPool_alternativeSizes.length; ++var3) { // L: 980
				class464.ByteArrayPool_arrays[var3] = new byte[var2[var3]][]; // L: 981
				ByteArrayPool.field4202.add(var1[var3]); // L: 982
			}

			Collections.sort(ByteArrayPool.field4202); // L: 984
		} else {
			Canvas.ByteArrayPool_alternativeSizes = null; // L: 971
			class17.ByteArrayPool_altSizeArrayCounts = null; // L: 972
			class464.ByteArrayPool_arrays = null; // L: 973
			class228.method4899(); // L: 974
		}

		FloorDecoration.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 986
		class18.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 987
		currentPort = FloorDecoration.worldPort; // L: 988
		PlayerComposition.field3343 = class292.field3351; // L: 989
		PlayerComposition.field3342 = class292.field3349; // L: 990
		WorldMapSectionType.field2793 = class292.field3350; // L: 991
		PlayerComposition.field3334 = class292.field3352; // L: 992
		class138.urlRequester = new class101(this.field523, 206); // L: 993
		this.setUpKeyboard(); // L: 994
		this.method387(); // L: 995
		JagexCache.mouseWheel = this.mouseWheel(); // L: 996
		CollisionMap.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 997
		class19.clientPreferences = class299.method5754(); // L: 998
		this.setUpClipboard(); // L: 999
		String var4 = TileItem.field1301; // L: 1001
		class29.field172 = this; // L: 1003
		if (var4 != null) { // L: 1004
			class29.field169 = var4;
		}

		WorldMapLabelSize.setWindowedMode(class19.clientPreferences.method2268()); // L: 1006
		Player.friendSystem = new FriendSystem(HealthBarDefinition.loginType); // L: 1007
		this.field519 = new class14("tokenRequest", 1, 1); // L: 1008
	} // L: 1009

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1160439504"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 1013
		this.doCycleJs5(); // L: 1014

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 1018
				var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast(); // L: 1019
			} // L: 1020

			if (var1 == null) { // L: 1021
				int var6;
				try {
					if (class272.musicPlayerStatus == 1) { // L: 1027
						var6 = class272.midiPcmStream.method5254(); // L: 1028
						if (var6 > 0 && class272.midiPcmStream.isReady()) { // L: 1029
							var6 -= class272.pcmSampleLength; // L: 1030
							if (var6 < 0) { // L: 1031
								var6 = 0;
							}

							class272.midiPcmStream.setPcmStreamVolume(var6); // L: 1032
						} else {
							class272.midiPcmStream.clear(); // L: 1035
							class272.midiPcmStream.removeAll(); // L: 1036
							if (class272.musicTrackArchive != null) { // L: 1037
								class272.musicPlayerStatus = 2;
							} else {
								class272.musicPlayerStatus = 0; // L: 1038
							}

							Tiles.musicTrack = null; // L: 1039
							class181.soundCache = null; // L: 1040
						}
					}
				} catch (Exception var11) { // L: 1043
					var11.printStackTrace(); // L: 1044
					class272.midiPcmStream.clear(); // L: 1045
					class272.musicPlayerStatus = 0; // L: 1046
					Tiles.musicTrack = null; // L: 1047
					class181.soundCache = null; // L: 1048
					class272.musicTrackArchive = null; // L: 1049
				}

				Renderable.playPcmPlayers(); // L: 1052
				synchronized(KeyHandler.KeyHandler_instance) { // L: 1054
					++KeyHandler.KeyHandler_idleCycles; // L: 1055
					KeyHandler.field147 = KeyHandler.field127; // L: 1056
					KeyHandler.field144 = 0; // L: 1057
					KeyHandler.field146 = 0; // L: 1058
					Arrays.fill(KeyHandler.field136, false); // L: 1059
					Arrays.fill(KeyHandler.field141, false); // L: 1060
					if (KeyHandler.field140 < 0) { // L: 1061
						Arrays.fill(KeyHandler.KeyHandler_pressedKeys, false); // L: 1062
						KeyHandler.field140 = KeyHandler.field139; // L: 1063
					} else {
						while (KeyHandler.field140 != KeyHandler.field139) { // L: 1066
							int var7 = KeyHandler.field138[KeyHandler.field139]; // L: 1067
							KeyHandler.field139 = KeyHandler.field139 + 1 & 127; // L: 1068
							if (var7 < 0) { // L: 1069
								var7 = ~var7; // L: 1070
								if (KeyHandler.KeyHandler_pressedKeys[var7]) { // L: 1071
									KeyHandler.KeyHandler_pressedKeys[var7] = false; // L: 1072
									KeyHandler.field141[var7] = true; // L: 1073
									KeyHandler.field142[KeyHandler.field146] = var7; // L: 1074
									++KeyHandler.field146; // L: 1075
								}
							} else {
								if (!KeyHandler.KeyHandler_pressedKeys[var7] && KeyHandler.field144 < KeyHandler.field134.length - 1) { // L: 1079
									KeyHandler.field136[var7] = true; // L: 1080
									KeyHandler.field134[++KeyHandler.field144 - 1] = var7; // L: 1081
								}

								KeyHandler.KeyHandler_pressedKeys[var7] = true; // L: 1083
							}
						}
					}

					if (KeyHandler.field144 > 0) { // L: 1087
						KeyHandler.KeyHandler_idleCycles = 0;
					}

					KeyHandler.field127 = KeyHandler.field143; // L: 1088
				}

				synchronized(MouseHandler.MouseHandler_instance) { // L: 1092
					MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 1093
					MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 1094
					MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 1095
					MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 1096
					MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 1097
					MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 1098
					MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 1099
					MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 1100
					MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 1101
				} // L: 1102

				if (JagexCache.mouseWheel != null) { // L: 1104
					var6 = JagexCache.mouseWheel.useRotation(); // L: 1105
					mouseWheelRotation = var6; // L: 1106
				}

				if (gameState == 0) { // L: 1108
					ViewportMouse.load(); // L: 1109
					Calendar.method5504(); // L: 1110
				} else if (gameState == 5) { // L: 1112
					class16.loginScreen(this, DevicePcmPlayerProvider.fontPlain12); // L: 1113
					ViewportMouse.load(); // L: 1114
					Calendar.method5504(); // L: 1115
				} else if (gameState != 10 && gameState != 11) { // L: 1117
					if (gameState == 20) { // L: 1118
						class16.loginScreen(this, DevicePcmPlayerProvider.fontPlain12); // L: 1119
						this.doCycleLoggedOut(); // L: 1120
					} else if (gameState == 50) { // L: 1122
						class16.loginScreen(this, DevicePcmPlayerProvider.fontPlain12); // L: 1123
						this.doCycleLoggedOut(); // L: 1124
					} else if (gameState == 25) { // L: 1126
						ArchiveDiskActionHandler.method5793();
					}
				} else {
					class16.loginScreen(this, DevicePcmPlayerProvider.fontPlain12);
				}

				if (gameState == 30) { // L: 1127
					this.doCycleLoggedIn();
				} else if (gameState == 40 || gameState == 45) { // L: 1128
					this.doCycleLoggedOut();
				}

				return; // L: 1129
			}

			var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false); // L: 1022
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2097579655"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2;
		label174: {
			try {
				if (class272.musicPlayerStatus == 2) { // L: 1136
					if (Tiles.musicTrack == null) { // L: 1137
						Tiles.musicTrack = MusicTrack.readTrack(class272.musicTrackArchive, class272.musicTrackGroupId, class151.musicTrackFileId); // L: 1138
						if (Tiles.musicTrack == null) { // L: 1139
							var2 = false; // L: 1140
							break label174;
						}
					}

					if (class181.soundCache == null) { // L: 1144
						class181.soundCache = new SoundCache(class28.soundEffectsArchive, class272.musicSamplesArchive);
					}

					if (class272.midiPcmStream.loadMusicTrack(Tiles.musicTrack, class272.musicPatchesArchive, class181.soundCache, 22050)) { // L: 1145
						class272.midiPcmStream.clearAll(); // L: 1146
						class272.midiPcmStream.setPcmStreamVolume(class272.musicTrackVolume); // L: 1147
						class272.midiPcmStream.setMusicTrack(Tiles.musicTrack, class11.musicTrackBoolean); // L: 1148
						class272.musicPlayerStatus = 0; // L: 1149
						Tiles.musicTrack = null; // L: 1150
						class181.soundCache = null; // L: 1151
						class272.musicTrackArchive = null; // L: 1152
						var2 = true; // L: 1153
						break label174;
					}
				}
			} catch (Exception var6) { // L: 1158
				var6.printStackTrace(); // L: 1159
				class272.midiPcmStream.clear(); // L: 1160
				class272.musicPlayerStatus = 0; // L: 1161
				Tiles.musicTrack = null; // L: 1162
				class181.soundCache = null; // L: 1163
				class272.musicTrackArchive = null; // L: 1164
			}

			var2 = false; // L: 1166
		}

		if (var2 && playingJingle && AttackOption.pcmPlayer0 != null) { // L: 1169 1170
			AttackOption.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field711 && class115.method2692() > field711) { // L: 1172 1173
			WorldMapLabelSize.setWindowedMode(class9.getWindowedMode()); // L: 1174
		}

		int var4;
		if (var1) { // L: 1177
			for (var4 = 0; var4 < 100; ++var4) { // L: 1178
				field703[var4] = true;
			}
		}

		if (gameState == 0) { // L: 1180
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1181
			HitSplatDefinition.drawTitle(TileItem.fontBold12, MouseHandler.fontPlain11, DevicePcmPlayerProvider.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1182
			if (gameState == 20) { // L: 1183
				HitSplatDefinition.drawTitle(TileItem.fontBold12, MouseHandler.fontPlain11, DevicePcmPlayerProvider.fontPlain12);
			} else if (gameState == 50) { // L: 1184
				HitSplatDefinition.drawTitle(TileItem.fontBold12, MouseHandler.fontPlain11, DevicePcmPlayerProvider.fontPlain12);
			} else if (gameState == 25) { // L: 1185
				if (field549 == 1) { // L: 1186
					if (field694 > field546) { // L: 1187
						field546 = field694;
					}

					var4 = (field546 * 50 - field694 * 50) / field546; // L: 1188
					SequenceDefinition.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false); // L: 1189
				} else if (field549 == 2) { // L: 1191
					if (field547 > field548) { // L: 1192
						field548 = field547;
					}

					var4 = (field548 * 50 - field547 * 50) / field548 + 50; // L: 1193
					SequenceDefinition.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false); // L: 1194
				} else {
					SequenceDefinition.drawLoadingMessage("Loading - please wait.", false); // L: 1196
				}
			} else if (gameState == 30) { // L: 1198
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1199
				SequenceDefinition.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1200
				SequenceDefinition.drawLoadingMessage("Please wait...", false);
			}
		} else {
			HitSplatDefinition.drawTitle(TileItem.fontBold12, MouseHandler.fontPlain11, DevicePcmPlayerProvider.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) { // L: 1201
			for (var4 = 0; var4 < rootWidgetCount; ++var4) { // L: 1202
				if (field704[var4]) { // L: 1203
					Message.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]); // L: 1204
					field704[var4] = false; // L: 1205
				}
			}
		} else if (gameState > 0) { // L: 1209
			Message.rasterProvider.drawFull(0, 0); // L: 1210

			for (var4 = 0; var4 < rootWidgetCount; ++var4) { // L: 1211
				field704[var4] = false;
			}
		}

	} // L: 1213

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "853101705"
	)
	@Export("kill0")
	protected final void kill0() {
		if (class308.varcs.hasUnwrittenChanges()) { // L: 1216
			class308.varcs.write();
		}

		if (ItemLayer.mouseRecorder != null) { // L: 1217
			ItemLayer.mouseRecorder.isRunning = false;
		}

		ItemLayer.mouseRecorder = null; // L: 1218
		packetWriter.close(); // L: 1219
		class83.method2118(); // L: 1220
		NPC.method2365(); // L: 1221
		JagexCache.mouseWheel = null; // L: 1222
		if (AttackOption.pcmPlayer0 != null) { // L: 1223
			AttackOption.pcmPlayer0.shutdown();
		}

		if (class238.pcmPlayer1 != null) { // L: 1224
			class238.pcmPlayer1.shutdown();
		}

		if (NetCache.NetCache_socket != null) { // L: 1226
			NetCache.NetCache_socket.close();
		}

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 1229
			if (ArchiveDiskActionHandler.field3971 != 0) { // L: 1230
				ArchiveDiskActionHandler.field3971 = 1; // L: 1231

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait(); // L: 1233
				} catch (InterruptedException var4) { // L: 1235
				}
			}
		}

		if (class138.urlRequester != null) { // L: 1239
			class138.urlRequester.close(); // L: 1240
			class138.urlRequester = null; // L: 1241
		}

		WorldMapLabel.method4999(); // L: 1243
		this.field519.method151(); // L: 1244
	} // L: 1245

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	protected final void vmethod1099() {
	} // L: 733

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-920255859"
	)
	boolean method1102() {
		return class21.field122 != null && !class21.field122.trim().isEmpty(); // L: 912
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-74"
	)
	boolean method1103() {
		return this.field733 != null; // L: 916
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "45169414"
	)
	void method1104(String var1) throws IOException {
		HashMap var2 = new HashMap(); // L: 920
		var2.put("grant_type", "refresh_token"); // L: 921
		var2.put("scope", "gamesso.token.create"); // L: 922
		var2.put("refresh_token", var1); // L: 923
		URL var3 = new URL(UserComparator5.field1387 + "shield/oauth/token" + (new class400(var2)).method7122()); // L: 924
		HashMap var4 = new HashMap(); // L: 925
		var4.put("Authorization", "Basic " + field527); // L: 926
		var4.put("Host", (new URL(UserComparator5.field1387)).getHost()); // L: 927
		var4.put("Accept", class397.field4431.method7086()); // L: 928
		class9 var5 = class9.field36; // L: 929
		RefreshAccessTokenRequester var6 = this.field673; // L: 930
		if (var6 != null) { // L: 931
			this.field526 = var6.request(var5.method64(), var3, var4, ""); // L: 932
		} else {
			class10 var7 = new class10(var3, var5, this.field523); // L: 935
			Iterator var8 = var4.entrySet().iterator(); // L: 936

			while (var8.hasNext()) {
				Entry var9 = (Entry)var8.next(); // L: 937
				var7.method79((String)var9.getKey(), (String)var9.getValue()); // L: 939
			}

			this.field524 = this.field519.method150(var7); // L: 942
		}
	} // L: 933 943

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1435757566"
	)
	void method1481(String var1) throws MalformedURLException, IOException {
		URL var2 = new URL(UserComparator5.field1387 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"); // L: 946
		HashMap var3 = new HashMap(); // L: 947
		var3.put("Authorization", "Bearer " + var1); // L: 948
		class9 var4 = class9.field30; // L: 949
		OtlTokenRequester var5 = this.field733; // L: 950
		if (var5 != null) { // L: 951
			this.field611 = var5.request(var4.method64(), var2, var3, ""); // L: 952
		} else {
			class10 var6 = new class10(var2, var4, this.field523); // L: 955
			Iterator var7 = var3.entrySet().iterator(); // L: 956

			while (var7.hasNext()) {
				Entry var8 = (Entry)var7.next(); // L: 957
				var6.method79((String)var8.getKey(), (String)var8.getValue()); // L: 959
			}

			this.field520 = this.field519.method150(var6); // L: 962
		}
	} // L: 953 963

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "116"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1322
			long var2 = class115.method2692(); // L: 1325
			int var4 = (int)(var2 - NetCache.field4029); // L: 1326
			NetCache.field4029 = var2; // L: 1327
			if (var4 > 200) { // L: 1328
				var4 = 200;
			}

			NetCache.NetCache_loadTime += var4; // L: 1329
			boolean var1;
			if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) { // L: 1330
				var1 = true; // L: 1331
			} else if (NetCache.NetCache_socket == null) { // L: 1334
				var1 = false; // L: 1335
			} else {
				try {
					label241: {
						if (NetCache.NetCache_loadTime > 30000) { // L: 1339
							throw new IOException();
						}

						NetFileRequest var5;
						Buffer var6;
						while (NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) { // L: 1340
							var5 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first(); // L: 1341
							var6 = new Buffer(4); // L: 1342
							var6.writeByte(1); // L: 1343
							var6.writeMedium((int)var5.key); // L: 1344
							NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 1345
							NetCache.NetCache_pendingPriorityResponses.put(var5, var5.key); // L: 1346
							--NetCache.NetCache_pendingPriorityWritesCount; // L: 1347
							++NetCache.NetCache_pendingPriorityResponsesCount; // L: 1348
						}

						while (NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) { // L: 1350
							var5 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast(); // L: 1351
							var6 = new Buffer(4); // L: 1352
							var6.writeByte(0); // L: 1353
							var6.writeMedium((int)var5.key); // L: 1354
							NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 1355
							var5.removeDual(); // L: 1356
							NetCache.NetCache_pendingResponses.put(var5, var5.key); // L: 1357
							--NetCache.NetCache_pendingWritesCount; // L: 1358
							++NetCache.NetCache_pendingResponsesCount; // L: 1359
						}

						for (int var17 = 0; var17 < 100; ++var17) { // L: 1361
							int var18 = NetCache.NetCache_socket.available(); // L: 1362
							if (var18 < 0) { // L: 1363
								throw new IOException();
							}

							if (var18 == 0) { // L: 1364
								break;
							}

							NetCache.NetCache_loadTime = 0; // L: 1365
							byte var7 = 0; // L: 1366
							if (Buddy.NetCache_currentResponse == null) { // L: 1367
								var7 = 8;
							} else if (NetCache.field4027 == 0) { // L: 1368
								var7 = 1;
							}

							int var8;
							int var9;
							int var10;
							byte[] var10000;
							int var10001;
							Buffer var24;
							if (var7 > 0) { // L: 1369
								var8 = var7 - NetCache.NetCache_responseHeaderBuffer.offset; // L: 1370
								if (var8 > var18) { // L: 1371
									var8 = var18;
								}

								NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var8); // L: 1372
								if (NetCache.field4033 != 0) { // L: 1373
									for (var9 = 0; var9 < var8; ++var9) { // L: 1374
										var10000 = NetCache.NetCache_responseHeaderBuffer.array;
										var10001 = var9 + NetCache.NetCache_responseHeaderBuffer.offset;
										var10000[var10001] ^= NetCache.field4033;
									}
								}

								var24 = NetCache.NetCache_responseHeaderBuffer; // L: 1376
								var24.offset += var8;
								if (NetCache.NetCache_responseHeaderBuffer.offset < var7) { // L: 1377
									break;
								}

								if (Buddy.NetCache_currentResponse == null) { // L: 1378
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1379
									var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1380
									var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort(); // L: 1381
									int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1382
									int var12 = NetCache.NetCache_responseHeaderBuffer.readInt(); // L: 1383
									long var13 = (long)(var10 + (var9 << 16)); // L: 1384
									NetFileRequest var15 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var13); // L: 1385
									class351.field4198 = true; // L: 1386
									if (var15 == null) { // L: 1387
										var15 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var13); // L: 1388
										class351.field4198 = false; // L: 1389
									}

									if (var15 == null) { // L: 1391
										throw new IOException(); // L: 1392
									}

									int var16 = var11 == 0 ? 5 : 9; // L: 1394
									Buddy.NetCache_currentResponse = var15; // L: 1395
									ObjectSound.NetCache_responseArchiveBuffer = new Buffer(var12 + var16 + Buddy.NetCache_currentResponse.padding); // L: 1396
									ObjectSound.NetCache_responseArchiveBuffer.writeByte(var11); // L: 1397
									ObjectSound.NetCache_responseArchiveBuffer.writeInt(var12); // L: 1398
									NetCache.field4027 = 8; // L: 1399
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1400
								} else if (NetCache.field4027 == 0) { // L: 1403
									if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) { // L: 1404
										NetCache.field4027 = 1; // L: 1405
										NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1406
									} else {
										Buddy.NetCache_currentResponse = null; // L: 1410
									}
								}
							} else {
								var8 = ObjectSound.NetCache_responseArchiveBuffer.array.length - Buddy.NetCache_currentResponse.padding; // L: 1416
								var9 = 512 - NetCache.field4027; // L: 1417
								if (var9 > var8 - ObjectSound.NetCache_responseArchiveBuffer.offset) { // L: 1418
									var9 = var8 - ObjectSound.NetCache_responseArchiveBuffer.offset;
								}

								if (var9 > var18) { // L: 1419
									var9 = var18;
								}

								NetCache.NetCache_socket.read(ObjectSound.NetCache_responseArchiveBuffer.array, ObjectSound.NetCache_responseArchiveBuffer.offset, var9); // L: 1420
								if (NetCache.field4033 != 0) { // L: 1421
									for (var10 = 0; var10 < var9; ++var10) { // L: 1422
										var10000 = ObjectSound.NetCache_responseArchiveBuffer.array;
										var10001 = ObjectSound.NetCache_responseArchiveBuffer.offset + var10;
										var10000[var10001] ^= NetCache.field4033;
									}
								}

								var24 = ObjectSound.NetCache_responseArchiveBuffer; // L: 1424
								var24.offset += var9;
								NetCache.field4027 += var9; // L: 1425
								if (var8 == ObjectSound.NetCache_responseArchiveBuffer.offset) { // L: 1426
									if (Buddy.NetCache_currentResponse.key == 16711935L) { // L: 1427
										KitDefinition.field1862 = ObjectSound.NetCache_responseArchiveBuffer; // L: 1428

										for (var10 = 0; var10 < 256; ++var10) { // L: 1429
											Archive var19 = NetCache.NetCache_archives[var10]; // L: 1430
											if (var19 != null) { // L: 1431
												DirectByteArrayCopier.method5512(var19, var10); // L: 1432
											}
										}
									} else {
										NetCache.NetCache_crc.reset(); // L: 1437
										NetCache.NetCache_crc.update(ObjectSound.NetCache_responseArchiveBuffer.array, 0, var8); // L: 1438
										var10 = (int)NetCache.NetCache_crc.getValue(); // L: 1439
										if (var10 != Buddy.NetCache_currentResponse.crc) { // L: 1440
											try {
												NetCache.NetCache_socket.close(); // L: 1442
											} catch (Exception var22) { // L: 1444
											}

											++NetCache.NetCache_crcMismatches; // L: 1445
											NetCache.NetCache_socket = null; // L: 1446
											NetCache.field4033 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 1447
											var1 = false; // L: 1448
											break label241;
										}

										NetCache.NetCache_crcMismatches = 0; // L: 1451
										NetCache.NetCache_ioExceptions = 0; // L: 1452
										Buddy.NetCache_currentResponse.archive.write((int)(Buddy.NetCache_currentResponse.key & 65535L), ObjectSound.NetCache_responseArchiveBuffer.array, 16711680L == (Buddy.NetCache_currentResponse.key & 16711680L), class351.field4198); // L: 1453
									}

									Buddy.NetCache_currentResponse.remove(); // L: 1455
									if (class351.field4198) { // L: 1456
										--NetCache.NetCache_pendingPriorityResponsesCount;
									} else {
										--NetCache.NetCache_pendingResponsesCount; // L: 1457
									}

									NetCache.field4027 = 0; // L: 1458
									Buddy.NetCache_currentResponse = null; // L: 1459
									ObjectSound.NetCache_responseArchiveBuffer = null; // L: 1460
								} else {
									if (NetCache.field4027 != 512) { // L: 1462
										break;
									}

									NetCache.field4027 = 0;
								}
							}
						}

						var1 = true; // L: 1466
					}
				} catch (IOException var23) {
					try {
						NetCache.NetCache_socket.close(); // L: 1470
					} catch (Exception var21) { // L: 1472
					}

					++NetCache.NetCache_ioExceptions; // L: 1473
					NetCache.NetCache_socket = null; // L: 1474
					var1 = false; // L: 1475
				}
			}

			if (!var1) { // L: 1479
				this.doCycleJs5Connect();
			}

		}
	} // L: 1480

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2087398985"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) { // L: 1483
			this.error("js5crc"); // L: 1484
			HealthBarUpdate.updateGameState(1000); // L: 1485
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) { // L: 1488
				if (gameState <= 5) { // L: 1489
					this.error("js5io"); // L: 1490
					HealthBarUpdate.updateGameState(1000); // L: 1491
					return; // L: 1492
				}

				field621 = 3000; // L: 1495
				NetCache.NetCache_ioExceptions = 3; // L: 1496
			}

			if (--field621 + 1 <= 0) { // L: 1499
				try {
					if (js5ConnectState == 0) { // L: 1501
						FloorOverlayDefinition.js5SocketTask = GameEngine.taskHandler.newSocketTask(StructComposition.worldHost, currentPort); // L: 1502
						++js5ConnectState; // L: 1503
					}

					if (js5ConnectState == 1) { // L: 1505
						if (FloorOverlayDefinition.js5SocketTask.status == 2) { // L: 1506
							this.js5Error(-1); // L: 1507
							return; // L: 1508
						}

						if (FloorOverlayDefinition.js5SocketTask.status == 1) { // L: 1510
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 1512
						js5Socket = class131.method2878((Socket)FloorOverlayDefinition.js5SocketTask.result, 40000, 5000); // L: 1513
						Buffer var1 = new Buffer(5); // L: 1514
						var1.writeByte(15); // L: 1515
						var1.writeInt(206); // L: 1516
						js5Socket.write(var1.array, 0, 5); // L: 1517
						++js5ConnectState; // L: 1518
						field778 = class115.method2692(); // L: 1519
					}

					if (js5ConnectState == 3) { // L: 1521
						if (js5Socket.available() > 0) { // L: 1522
							int var5 = js5Socket.readUnsignedByte(); // L: 1523
							if (var5 != 0) { // L: 1524
								this.js5Error(var5); // L: 1525
								return; // L: 1526
							}

							++js5ConnectState; // L: 1528
						} else if (class115.method2692() - field778 > 30000L) { // L: 1531
							this.js5Error(-2); // L: 1532
							return; // L: 1533
						}
					}

					if (js5ConnectState == 4) { // L: 1537
						AbstractSocket var10 = js5Socket; // L: 1538
						boolean var2 = gameState > 20; // L: 1539
						if (NetCache.NetCache_socket != null) { // L: 1541
							try {
								NetCache.NetCache_socket.close(); // L: 1543
							} catch (Exception var8) { // L: 1545
							}

							NetCache.NetCache_socket = null; // L: 1546
						}

						NetCache.NetCache_socket = var10; // L: 1548
						class115.method2693(var2); // L: 1549
						NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1550
						Buddy.NetCache_currentResponse = null; // L: 1551
						ObjectSound.NetCache_responseArchiveBuffer = null; // L: 1552
						NetCache.field4027 = 0; // L: 1553

						while (true) {
							NetFileRequest var3 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first(); // L: 1555
							if (var3 == null) { // L: 1556
								while (true) {
									var3 = (NetFileRequest)NetCache.NetCache_pendingResponses.first(); // L: 1562
									if (var3 == null) { // L: 1563
										if (NetCache.field4033 != 0) { // L: 1569
											try {
												Buffer var11 = new Buffer(4); // L: 1571
												var11.writeByte(4); // L: 1572
												var11.writeByte(NetCache.field4033); // L: 1573
												var11.writeShort(0); // L: 1574
												NetCache.NetCache_socket.write(var11.array, 0, 4); // L: 1575
											} catch (IOException var7) {
												try {
													NetCache.NetCache_socket.close(); // L: 1579
												} catch (Exception var6) { // L: 1581
												}

												++NetCache.NetCache_ioExceptions; // L: 1582
												NetCache.NetCache_socket = null; // L: 1583
											}
										}

										NetCache.NetCache_loadTime = 0; // L: 1586
										NetCache.field4029 = class115.method2692(); // L: 1587
										FloorOverlayDefinition.js5SocketTask = null; // L: 1589
										js5Socket = null; // L: 1590
										js5ConnectState = 0; // L: 1591
										js5Errors = 0; // L: 1592
										return; // L: 1598
									}

									NetCache.NetCache_pendingWritesQueue.addLast(var3); // L: 1564
									NetCache.NetCache_pendingWrites.put(var3, var3.key); // L: 1565
									++NetCache.NetCache_pendingWritesCount; // L: 1566
									--NetCache.NetCache_pendingResponsesCount; // L: 1567
								}
							}

							NetCache.NetCache_pendingPriorityWrites.put(var3, var3.key); // L: 1557
							++NetCache.NetCache_pendingPriorityWritesCount; // L: 1558
							--NetCache.NetCache_pendingPriorityResponsesCount; // L: 1559
						}
					}
				} catch (IOException var9) { // L: 1595
					this.js5Error(-3); // L: 1596
				}

			}
		}
	} // L: 1486

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2141455936"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		FloorOverlayDefinition.js5SocketTask = null; // L: 1601
		js5Socket = null; // L: 1602
		js5ConnectState = 0; // L: 1603
		if (FloorDecoration.worldPort == currentPort) { // L: 1604
			currentPort = class18.js5Port;
		} else {
			currentPort = FloorDecoration.worldPort; // L: 1605
		}

		++js5Errors; // L: 1606
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) { // L: 1607
			if (gameState <= 5) { // L: 1608
				this.error("js5connect_full"); // L: 1609
				HealthBarUpdate.updateGameState(1000); // L: 1610
			} else {
				field621 = 3000; // L: 1612
			}
		} else if (js5Errors >= 2 && var1 == 6) { // L: 1614
			this.error("js5connect_outofdate"); // L: 1615
			HealthBarUpdate.updateGameState(1000); // L: 1616
		} else if (js5Errors >= 4) { // L: 1618
			if (gameState <= 5) { // L: 1619
				this.error("js5connect"); // L: 1620
				HealthBarUpdate.updateGameState(1000); // L: 1621
			} else {
				field621 = 3000; // L: 1623
			}
		}

	} // L: 1625

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "234739213"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		AbstractSocket var1 = packetWriter.getSocket(); // L: 2036
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 2037

		try {
			if (loginState == 0) { // L: 2039
				if (class306.secureRandom == null && (secureRandomFuture.isDone() || field512 > 250)) { // L: 2040
					class306.secureRandom = secureRandomFuture.get(); // L: 2041
					secureRandomFuture.shutdown(); // L: 2042
					secureRandomFuture = null; // L: 2043
				}

				if (class306.secureRandom != null) { // L: 2045
					if (var1 != null) { // L: 2046
						var1.close(); // L: 2047
						var1 = null; // L: 2048
					}

					class120.socketTask = null; // L: 2050
					hadNetworkError = false; // L: 2051
					field512 = 0; // L: 2052
					if (field516.method8008()) { // L: 2053
						try {
							this.method1104(VarcInt.field1851); // L: 2055
							HitSplatDefinition.method3624(21); // L: 2056
						} catch (Throwable var23) { // L: 2058
							class249.RunException_sendStackTrace((String)null, var23); // L: 2059
							Canvas.getLoginError(65); // L: 2060
							return; // L: 2061
						}
					} else {
						HitSplatDefinition.method3624(1); // L: 2065
					}
				}
			}

			OtlTokenResponse var3;
			class21 var25;
			if (loginState == 21) { // L: 2069
				if (this.field526 != null) { // L: 2070
					if (!this.field526.isDone()) { // L: 2071
						return; // L: 2072
					}

					if (this.field526.isCancelled()) { // L: 2074
						Canvas.getLoginError(65); // L: 2075
						this.field526 = null; // L: 2076
						return; // L: 2077
					}

					try {
						var3 = (OtlTokenResponse)this.field526.get(); // L: 2080
						if (!var3.isSuccess()) { // L: 2081
							Canvas.getLoginError(65); // L: 2082
							this.field526 = null; // L: 2083
							return; // L: 2084
						}

						class21.field122 = var3.getAccessToken(); // L: 2086
						VarcInt.field1851 = var3.getRefreshToken(); // L: 2087
						this.field526 = null; // L: 2088
					} catch (Exception var22) { // L: 2090
						class249.RunException_sendStackTrace((String)null, var22); // L: 2091
						Canvas.getLoginError(65); // L: 2092
						this.field526 = null; // L: 2093
						return; // L: 2094
					}
				} else {
					if (this.field524 == null) { // L: 2097
						Canvas.getLoginError(65); // L: 2127
						return; // L: 2128
					}

					if (!this.field524.method246()) { // L: 2098
						return; // L: 2099
					}

					if (this.field524.method251()) { // L: 2101
						class249.RunException_sendStackTrace(this.field524.method244(), (Throwable)null); // L: 2102
						Canvas.getLoginError(65); // L: 2103
						this.field524 = null; // L: 2104
						return; // L: 2105
					}

					var25 = this.field524.method249(); // L: 2107
					if (var25.method258() != 200) { // L: 2108
						Canvas.getLoginError(65); // L: 2109
						this.field524 = null; // L: 2110
						return; // L: 2111
					}

					field512 = 0; // L: 2113
					class399 var4 = new class399(var25.method262()); // L: 2114

					try {
						class21.field122 = var4.method7100().getString("access_token"); // L: 2116
						VarcInt.field1851 = var4.method7100().getString("refresh_token"); // L: 2117
					} catch (Exception var21) { // L: 2119
						class249.RunException_sendStackTrace("Error parsing tokens", var21); // L: 2120
						Canvas.getLoginError(65); // L: 2121
						this.field524 = null; // L: 2122
						return; // L: 2123
					}
				}

				this.method1481(class21.field122); // L: 2130
				HitSplatDefinition.method3624(20); // L: 2131
			}

			if (loginState == 20) { // L: 2133
				if (this.field611 != null) { // L: 2134
					if (!this.field611.isDone()) { // L: 2135
						return; // L: 2136
					}

					if (this.field611.isCancelled()) { // L: 2138
						Canvas.getLoginError(65); // L: 2139
						this.field611 = null; // L: 2140
						return; // L: 2141
					}

					try {
						var3 = (OtlTokenResponse)this.field611.get(); // L: 2144
						if (!var3.isSuccess()) { // L: 2145
							Canvas.getLoginError(65); // L: 2146
							this.field611 = null; // L: 2147
							return; // L: 2148
						}

						this.field518 = var3.getToken(); // L: 2150
						this.field611 = null; // L: 2151
					} catch (Exception var20) { // L: 2153
						class249.RunException_sendStackTrace((String)null, var20); // L: 2154
						Canvas.getLoginError(65); // L: 2155
						this.field611 = null; // L: 2156
						return; // L: 2157
					}
				} else {
					if (this.field520 == null) { // L: 2160
						Canvas.getLoginError(65); // L: 2181
						return; // L: 2182
					}

					if (!this.field520.method246()) { // L: 2161
						return; // L: 2162
					}

					if (this.field520.method251()) { // L: 2164
						class249.RunException_sendStackTrace(this.field520.method244(), (Throwable)null); // L: 2165
						Canvas.getLoginError(65); // L: 2166
						this.field520 = null; // L: 2167
						return; // L: 2168
					}

					var25 = this.field520.method249(); // L: 2170
					if (var25.method258() != 200) { // L: 2171
						class249.RunException_sendStackTrace("Response code: " + var25.method258() + "Response body: " + var25.method262(), (Throwable)null); // L: 2172
						Canvas.getLoginError(65); // L: 2173
						this.field520 = null; // L: 2174
						return; // L: 2175
					}

					this.field518 = var25.method262(); // L: 2177
					this.field520 = null; // L: 2178
				}

				field512 = 0; // L: 2184
				HitSplatDefinition.method3624(1); // L: 2185
			}

			if (loginState == 1) { // L: 2187
				if (class120.socketTask == null) { // L: 2188
					class120.socketTask = GameEngine.taskHandler.newSocketTask(StructComposition.worldHost, currentPort); // L: 2189
				}

				if (class120.socketTask.status == 2) { // L: 2191
					throw new IOException();
				}

				if (class120.socketTask.status == 1) { // L: 2192
					var1 = class131.method2878((Socket)class120.socketTask.result, 40000, 5000); // L: 2193
					packetWriter.setSocket(var1); // L: 2194
					class120.socketTask = null; // L: 2195
					HitSplatDefinition.method3624(2); // L: 2196
				}
			}

			PacketBufferNode var26;
			if (loginState == 2) { // L: 2199
				packetWriter.clearBuffer(); // L: 2200
				var26 = MusicPatchNode.method5473(); // L: 2201
				var26.packetBuffer.writeByte(LoginPacket.field3152.id); // L: 2202
				packetWriter.addNode(var26); // L: 2203
				packetWriter.flush(); // L: 2204
				var2.offset = 0; // L: 2205
				HitSplatDefinition.method3624(3); // L: 2206
			}

			int var13;
			if (loginState == 3) { // L: 2208
				if (AttackOption.pcmPlayer0 != null) { // L: 2209
					AttackOption.pcmPlayer0.method715();
				}

				if (class238.pcmPlayer1 != null) { // L: 2210
					class238.pcmPlayer1.method715();
				}

				if (var1.isAvailable(1)) { // L: 2211
					var13 = var1.readUnsignedByte(); // L: 2212
					if (AttackOption.pcmPlayer0 != null) { // L: 2213
						AttackOption.pcmPlayer0.method715();
					}

					if (class238.pcmPlayer1 != null) { // L: 2214
						class238.pcmPlayer1.method715();
					}

					if (var13 != 0) { // L: 2215
						Canvas.getLoginError(var13); // L: 2216
						return; // L: 2217
					}

					var2.offset = 0; // L: 2219
					HitSplatDefinition.method3624(4); // L: 2220
				}
			}

			if (loginState == 4) { // L: 2223
				if (var2.offset < 8) { // L: 2224
					var13 = var1.available(); // L: 2225
					if (var13 > 8 - var2.offset) { // L: 2226
						var13 = 8 - var2.offset;
					}

					if (var13 > 0) { // L: 2227
						var1.read(var2.array, var2.offset, var13); // L: 2228
						var2.offset += var13; // L: 2229
					}
				}

				if (var2.offset == 8) { // L: 2232
					var2.offset = 0; // L: 2233
					UserList.field4320 = var2.readLong(); // L: 2234
					HitSplatDefinition.method3624(5); // L: 2235
				}
			}

			if (loginState == 5) { // L: 2238
				packetWriter.packetBuffer.offset = 0; // L: 2239
				packetWriter.clearBuffer(); // L: 2240
				PacketBuffer var28 = new PacketBuffer(500); // L: 2241
				int[] var27 = new int[]{class306.secureRandom.nextInt(), class306.secureRandom.nextInt(), class306.secureRandom.nextInt(), class306.secureRandom.nextInt()}; // L: 2242 2243 2244 2245 2246
				var28.offset = 0; // L: 2247
				var28.writeByte(1); // L: 2248
				var28.writeInt(var27[0]); // L: 2249
				var28.writeInt(var27[1]); // L: 2250
				var28.writeInt(var27[2]); // L: 2251
				var28.writeInt(var27[3]); // L: 2252
				var28.writeLong(UserList.field4320); // L: 2253
				if (gameState == 40) { // L: 2254
					var28.writeInt(field530[0]); // L: 2255
					var28.writeInt(field530[1]); // L: 2256
					var28.writeInt(field530[2]); // L: 2257
					var28.writeInt(field530[3]); // L: 2258
				} else {
					if (gameState == 50) { // L: 2261
						var28.writeByte(class124.field1547.rsOrdinal()); // L: 2262
						var28.writeInt(class174.field1891); // L: 2263
					} else {
						var28.writeByte(field515.rsOrdinal()); // L: 2266
						switch(field515.field1548) { // L: 2267
						case 0:
							var28.writeInt((Integer)class19.clientPreferences.parameters.get(Projectile.method1950(Login.Login_username))); // L: 2282
							break;
						case 1:
							var28.offset += 4; // L: 2270
							break; // L: 2271
						case 2:
						case 4:
							var28.writeMedium(class240.field2846); // L: 2276
							++var28.offset; // L: 2277
						case 3:
						}
					}

					if (field516.method8008()) { // L: 2287
						var28.writeByte(class446.field4750.rsOrdinal()); // L: 2288
						var28.writeStringCp1252NullTerminated(this.field518); // L: 2289
					} else {
						var28.writeByte(class446.field4751.rsOrdinal()); // L: 2292
						var28.writeStringCp1252NullTerminated(Login.Login_password); // L: 2293
					}
				}

				var28.encryptRsa(class67.field886, class67.field885); // L: 2296
				field530 = var27; // L: 2297
				PacketBufferNode var6;
				if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) { // L: 2302
					var6 = new PacketBufferNode(); // L: 2303
				} else {
					var6 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 2306
				}

				var6.clientPacket = null; // L: 2309
				var6.clientPacketLength = 0; // L: 2310
				var6.packetBuffer = new PacketBuffer(5000); // L: 2311
				var6.packetBuffer.offset = 0; // L: 2315
				if (gameState == 40) { // L: 2316
					var6.packetBuffer.writeByte(LoginPacket.field3146.id); // L: 2317
				} else {
					var6.packetBuffer.writeByte(LoginPacket.field3145.id); // L: 2320
				}

				var6.packetBuffer.writeShort(0); // L: 2322
				int var14 = var6.packetBuffer.offset; // L: 2323
				var6.packetBuffer.writeInt(206); // L: 2324
				var6.packetBuffer.writeInt(1); // L: 2325
				var6.packetBuffer.writeByte(clientType); // L: 2326
				var6.packetBuffer.writeByte(field484); // L: 2327
				var6.packetBuffer.writeBytes(var28.array, 0, var28.offset); // L: 2328
				int var8 = var6.packetBuffer.offset; // L: 2329
				var6.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2330
				var6.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2331
				var6.packetBuffer.writeShort(Script.canvasWidth); // L: 2332
				var6.packetBuffer.writeShort(class78.canvasHeight); // L: 2333
				PacketBuffer var9 = var6.packetBuffer; // L: 2334
				if (randomDatData != null) { // L: 2336
					var9.writeBytes(randomDatData, 0, randomDatData.length); // L: 2337
				} else {
					byte[] var10 = ModeWhere.method6082(); // L: 2340
					var9.writeBytes(var10, 0, var10.length); // L: 2341
				}

				var6.packetBuffer.writeStringCp1252NullTerminated(GrandExchangeOfferTotalQuantityComparator.field4045); // L: 2343
				var6.packetBuffer.writeInt(class17.field99); // L: 2344
				Buffer var38 = new Buffer(Occluder.platformInfo.size()); // L: 2345
				Occluder.platformInfo.write(var38); // L: 2346
				var6.packetBuffer.writeBytes(var38.array, 0, var38.array.length); // L: 2347
				var6.packetBuffer.writeByte(clientType); // L: 2348
				var6.packetBuffer.writeInt(0); // L: 2349
				var6.packetBuffer.method7760(Language.field4098.hash); // L: 2350
				var6.packetBuffer.method7784(WorldMapSectionType.archive9.hash); // L: 2351
				var6.packetBuffer.method7760(class121.archive6.hash); // L: 2352
				var6.packetBuffer.method7760(ApproximateRouteStrategy.archive10.hash); // L: 2353
				var6.packetBuffer.writeInt(Varcs.archive5.hash); // L: 2354
				var6.packetBuffer.method7760(AbstractUserComparator.archive18.hash); // L: 2355
				var6.packetBuffer.method7760(WorldMapEvent.field2882.hash); // L: 2356
				var6.packetBuffer.method7784(class341.archive7.hash); // L: 2357
				var6.packetBuffer.method7783(class140.archive2.hash); // L: 2358
				var6.packetBuffer.method7784(MouseHandler.archive19.hash); // L: 2359
				var6.packetBuffer.method7784(class304.archive8.hash); // L: 2360
				var6.packetBuffer.method7760(class10.archive11.hash); // L: 2361
				var6.packetBuffer.writeInt(0); // L: 2362
				var6.packetBuffer.method7760(WorldMapSprite.archive14.hash); // L: 2363
				var6.packetBuffer.method7783(UserComparator7.field1383.hash); // L: 2364
				var6.packetBuffer.method7783(archive4.hash); // L: 2365
				var6.packetBuffer.method7784(class67.archive15.hash); // L: 2366
				var6.packetBuffer.writeInt(AbstractByteArrayCopier.archive13.hash); // L: 2367
				var6.packetBuffer.method7760(class4.archive20.hash); // L: 2368
				var6.packetBuffer.method7760(class6.archive17.hash); // L: 2369
				var6.packetBuffer.method7783(class267.archive12.hash); // L: 2370
				var6.packetBuffer.xteaEncrypt(var27, var8, var6.packetBuffer.offset); // L: 2371
				var6.packetBuffer.writeLengthShort(var6.packetBuffer.offset - var14); // L: 2372
				packetWriter.addNode(var6); // L: 2373
				packetWriter.flush(); // L: 2374
				packetWriter.isaacCipher = new IsaacCipher(var27); // L: 2375
				int[] var11 = new int[4]; // L: 2376

				for (int var12 = 0; var12 < 4; ++var12) { // L: 2377
					var11[var12] = var27[var12] + 50;
				}

				var2.newIsaacCipher(var11); // L: 2378
				HitSplatDefinition.method3624(6); // L: 2379
			}

			int var15;
			if (loginState == 6 && var1.available() > 0) { // L: 2381 2382
				var13 = var1.readUnsignedByte(); // L: 2383
				if (var13 == 61) { // L: 2384
					var15 = var1.available(); // L: 2385
					VarpDefinition.field1821 = var15 == 1 && var1.readUnsignedByte() == 1; // L: 2386
					HitSplatDefinition.method3624(5); // L: 2387
				}

				if (var13 == 21 && gameState == 20) { // L: 2389
					HitSplatDefinition.method3624(12); // L: 2390
				} else if (var13 == 2) { // L: 2392
					HitSplatDefinition.method3624(14); // L: 2393
				} else if (var13 == 15 && gameState == 40) { // L: 2395
					packetWriter.serverPacketLength = -1; // L: 2396
					HitSplatDefinition.method3624(19); // L: 2397
				} else if (var13 == 64) { // L: 2399
					HitSplatDefinition.method3624(10); // L: 2400
				} else if (var13 == 23 && field609 < 1) { // L: 2402
					++field609; // L: 2403
					HitSplatDefinition.method3624(0); // L: 2404
				} else if (var13 == 29) { // L: 2406
					HitSplatDefinition.method3624(17); // L: 2407
				} else {
					if (var13 != 69) { // L: 2409
						Canvas.getLoginError(var13); // L: 2413
						return; // L: 2414
					}

					HitSplatDefinition.method3624(7); // L: 2410
				}
			}

			if (loginState == 7 && var1.available() >= 2) { // L: 2418 2419
				var1.read(var2.array, 0, 2); // L: 2420
				var2.offset = 0; // L: 2421
				HealthBarDefinition.field1888 = var2.readUnsignedShort(); // L: 2422
				HitSplatDefinition.method3624(8); // L: 2423
			}

			if (loginState == 8 && var1.available() >= HealthBarDefinition.field1888) { // L: 2426 2427
				var2.offset = 0; // L: 2428
				var1.read(var2.array, var2.offset, HealthBarDefinition.field1888); // L: 2429
				class6[] var30 = new class6[]{class6.field17}; // L: 2432
				class6 var29 = var30[var2.readUnsignedByte()]; // L: 2434

				try {
					switch(var29.field16) { // L: 2438
					case 0:
						class0 var5 = new class0(); // L: 2441
						this.field532 = new class7(var2, var5); // L: 2451
						HitSplatDefinition.method3624(9); // L: 2452
						break;
					default:
						throw new IllegalArgumentException(); // L: 2446
					}
				} catch (Exception var19) { // L: 2454
					Canvas.getLoginError(22); // L: 2455
					return; // L: 2456
				}
			}

			if (loginState == 9 && this.field532.method46()) { // L: 2460 2461
				this.field531 = this.field532.method42(); // L: 2462
				this.field532.method41(); // L: 2463
				this.field532 = null; // L: 2464
				if (this.field531 == null) { // L: 2465
					Canvas.getLoginError(22); // L: 2466
					return; // L: 2467
				}

				packetWriter.clearBuffer(); // L: 2469
				var26 = MusicPatchNode.method5473(); // L: 2470
				var26.packetBuffer.writeByte(LoginPacket.field3147.id); // L: 2471
				var26.packetBuffer.writeShort(this.field531.offset); // L: 2472
				var26.packetBuffer.method7727(this.field531); // L: 2473
				packetWriter.addNode(var26); // L: 2474
				packetWriter.flush(); // L: 2475
				this.field531 = null; // L: 2476
				HitSplatDefinition.method3624(6); // L: 2477
			}

			if (loginState == 10 && var1.available() > 0) { // L: 2480 2481
				DirectByteArrayCopier.field3306 = var1.readUnsignedByte(); // L: 2482
				HitSplatDefinition.method3624(11); // L: 2483
			}

			if (loginState == 11 && var1.available() >= DirectByteArrayCopier.field3306) { // L: 2486 2487
				var1.read(var2.array, 0, DirectByteArrayCopier.field3306); // L: 2488
				var2.offset = 0; // L: 2489
				HitSplatDefinition.method3624(6); // L: 2490
			}

			if (loginState == 12 && var1.available() > 0) { // L: 2493 2494
				field514 = (var1.readUnsignedByte() + 3) * 60; // L: 2495
				HitSplatDefinition.method3624(13); // L: 2496
			}

			if (loginState == 13) { // L: 2499
				field512 = 0; // L: 2500
				class101.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field514 / 60 + " seconds."); // L: 2501
				if (--field514 <= 0) { // L: 2502
					HitSplatDefinition.method3624(0);
				}

			} else {
				if (loginState == 14 && var1.available() >= 1) { // L: 2505 2506
					HealthBarUpdate.field1206 = var1.readUnsignedByte(); // L: 2507
					HitSplatDefinition.method3624(15); // L: 2508
				}

				int var16;
				boolean var40;
				if (loginState == 15 && var1.available() >= HealthBarUpdate.field1206) { // L: 2511 2512
					boolean var39 = var1.readUnsignedByte() == 1; // L: 2513
					var1.read(var2.array, 0, 4); // L: 2514
					var2.offset = 0; // L: 2515
					var40 = false; // L: 2516
					if (var39) { // L: 2517
						var15 = var2.readByteIsaac() << 24; // L: 2518
						var15 |= var2.readByteIsaac() << 16; // L: 2519
						var15 |= var2.readByteIsaac() << 8; // L: 2520
						var15 |= var2.readByteIsaac(); // L: 2521
						var16 = Projectile.method1950(Login.Login_username); // L: 2522
						if (class19.clientPreferences.parameters.size() >= 10 && !class19.clientPreferences.parameters.containsKey(var16)) { // L: 2523 2524
							Iterator var37 = class19.clientPreferences.parameters.entrySet().iterator(); // L: 2525
							var37.next(); // L: 2526
							var37.remove(); // L: 2527
						}

						class19.clientPreferences.parameters.put(var16, var15); // L: 2530
					}

					if (Login_isUsernameRemembered) { // L: 2532
						class19.clientPreferences.method2260(Login.Login_username); // L: 2533
					} else {
						class19.clientPreferences.method2260((String)null); // L: 2536
					}

					class220.savePreferences(); // L: 2538
					staffModLevel = var1.readUnsignedByte(); // L: 2539
					playerMod = var1.readUnsignedByte() == 1; // L: 2540
					localPlayerIndex = var1.readUnsignedByte(); // L: 2541
					localPlayerIndex <<= 8; // L: 2542
					localPlayerIndex += var1.readUnsignedByte(); // L: 2543
					field601 = var1.readUnsignedByte(); // L: 2544
					var1.read(var2.array, 0, 8); // L: 2545
					var2.offset = 0; // L: 2546
					this.field707 = var2.readLong(); // L: 2547
					if (HealthBarUpdate.field1206 >= 29) { // L: 2548
						var1.read(var2.array, 0, 8); // L: 2549
						var2.offset = 0; // L: 2550
						field612 = var2.readLong(); // L: 2551
					}

					var1.read(var2.array, 0, 1); // L: 2553
					var2.offset = 0; // L: 2554
					ServerPacket[] var33 = FloorUnderlayDefinition.ServerPacket_values(); // L: 2555
					int var17 = var2.readSmartByteShortIsaac(); // L: 2556
					if (var17 < 0 || var17 >= var33.length) { // L: 2557
						throw new IOException(var17 + " " + var2.offset);
					}

					packetWriter.serverPacket = var33[var17]; // L: 2558
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2559
					var1.read(var2.array, 0, 2); // L: 2560
					var2.offset = 0; // L: 2561
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2562

					try {
						class27.method346(class353.client, "zap"); // L: 2564
					} catch (Throwable var18) { // L: 2566
					}

					HitSplatDefinition.method3624(16); // L: 2567
				}

				if (loginState != 16) { // L: 2570
					if (loginState == 17 && var1.available() >= 2) { // L: 2688 2689
						var2.offset = 0; // L: 2690
						var1.read(var2.array, 0, 2); // L: 2691
						var2.offset = 0; // L: 2692
						class432.field4663 = var2.readUnsignedShort(); // L: 2693
						HitSplatDefinition.method3624(18); // L: 2694
					}

					if (loginState == 18 && var1.available() >= class432.field4663) { // L: 2697 2698
						var2.offset = 0; // L: 2699
						var1.read(var2.array, 0, class432.field4663); // L: 2700
						var2.offset = 0; // L: 2701
						String var36 = var2.readStringCp1252NullTerminated(); // L: 2702
						String var32 = var2.readStringCp1252NullTerminated(); // L: 2703
						String var34 = var2.readStringCp1252NullTerminated(); // L: 2704
						class101.setLoginResponseString(var36, var32, var34); // L: 2705
						HealthBarUpdate.updateGameState(10); // L: 2706
						if (field516.method8008()) { // L: 2707
							WorldMapData_1.method4872(9); // L: 2708
						}
					}

					if (loginState == 19) { // L: 2712
						if (packetWriter.serverPacketLength == -1) { // L: 2713
							if (var1.available() < 2) { // L: 2714
								return;
							}

							var1.read(var2.array, 0, 2); // L: 2715
							var2.offset = 0; // L: 2716
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2717
						}

						if (var1.available() >= packetWriter.serverPacketLength) { // L: 2719
							var1.read(var2.array, 0, packetWriter.serverPacketLength);
							var2.offset = 0;
							var13 = packetWriter.serverPacketLength;
							timer.method6514();
							SoundSystem.method736(); // L: 2724
							AbstractUserComparator.updatePlayer(var2);
							if (var13 != var2.offset) {
								throw new RuntimeException(); // L: 2727
							}
						}
					} else {
						++field512;
						if (field512 > 2000) {
							if (field609 < 1) { // L: 2733
								if (FloorDecoration.worldPort == currentPort) {
									currentPort = class18.js5Port;
								} else {
									currentPort = FloorDecoration.worldPort;
								}

								++field609; // L: 2736
								HitSplatDefinition.method3624(0);
							} else {
								Canvas.getLoginError(-3); // L: 2740
							}
						}
					}
				} else {
					if (var1.available() >= packetWriter.serverPacketLength) { // L: 2571
						var2.offset = 0; // L: 2572
						var1.read(var2.array, 0, packetWriter.serverPacketLength); // L: 2573
						timer.method6511(); // L: 2574
						mouseLastLastPressedTimeMillis = -1L; // L: 2577
						ItemLayer.mouseRecorder.index = 0; // L: 2578
						ModelData0.hasFocus = true; // L: 2579
						hadFocus = true; // L: 2580
						field728 = -1L; // L: 2581
						PacketBufferNode.method5202(); // L: 2582
						packetWriter.clearBuffer(); // L: 2583
						packetWriter.packetBuffer.offset = 0; // L: 2584
						packetWriter.serverPacket = null; // L: 2585
						packetWriter.field1350 = null; // L: 2586
						packetWriter.field1347 = null; // L: 2587
						packetWriter.field1352 = null; // L: 2588
						packetWriter.serverPacketLength = 0; // L: 2589
						packetWriter.field1342 = 0; // L: 2590
						rebootTimer = 0; // L: 2591
						logoutTimer = 0; // L: 2592
						hintArrowType = 0; // L: 2593
						class125.method2824(); // L: 2594
						class328.method6056(0); // L: 2595
						Messages.Messages_channels.clear(); // L: 2597
						Messages.Messages_hashTable.clear(); // L: 2598
						Messages.Messages_queue.clear(); // L: 2599
						Messages.Messages_count = 0; // L: 2600
						isItemSelected = 0; // L: 2602
						isSpellSelected = false; // L: 2603
						soundEffectCount = 0; // L: 2604
						camAngleY = 0; // L: 2605
						oculusOrbState = 0; // L: 2606
						UrlRequester.field1362 = null; // L: 2607
						minimapState = 0; // L: 2608
						field725 = -1; // L: 2609
						destinationX = 0; // L: 2610
						destinationY = 0; // L: 2611
						playerAttackOption = AttackOption.AttackOption_hidden; // L: 2612
						npcAttackOption = AttackOption.AttackOption_hidden; // L: 2613
						npcCount = 0; // L: 2614
						AbstractWorldMapData.method4958(); // L: 2615

						for (var13 = 0; var13 < 2048; ++var13) { // L: 2616
							players[var13] = null;
						}

						for (var13 = 0; var13 < 32768; ++var13) { // L: 2617
							npcs[var13] = null;
						}

						combatTargetPlayerIndex = -1; // L: 2618
						projectiles.clear(); // L: 2619
						graphicsObjects.clear(); // L: 2620

						for (var13 = 0; var13 < 4; ++var13) { // L: 2621
							for (var15 = 0; var15 < 104; ++var15) { // L: 2622
								for (var16 = 0; var16 < 104; ++var16) { // L: 2623
									groundItems[var13][var15][var16] = null; // L: 2624
								}
							}
						}

						pendingSpawns = new NodeDeque(); // L: 2628
						Player.friendSystem.clear(); // L: 2629

						for (var13 = 0; var13 < VarpDefinition.field1822; ++var13) { // L: 2630
							VarpDefinition var31 = FloorUnderlayDefinition.VarpDefinition_get(var13); // L: 2631
							if (var31 != null) { // L: 2632
								Varps.Varps_temp[var13] = 0; // L: 2633
								Varps.Varps_main[var13] = 0; // L: 2634
							}
						}

						class308.varcs.clearTransient(); // L: 2637
						followerIndex = -1; // L: 2638
						if (rootInterface != -1) { // L: 2639
							var13 = rootInterface; // L: 2640
							if (var13 != -1 && class228.Widget_loadedInterfaces[var13]) { // L: 2642 2643
								MusicPatchPcmStream.Widget_archive.clearFilesGroup(var13); // L: 2644
								if (SoundCache.Widget_interfaceComponents[var13] != null) { // L: 2645
									var40 = true; // L: 2646

									for (var16 = 0; var16 < SoundCache.Widget_interfaceComponents[var13].length; ++var16) { // L: 2647
										if (SoundCache.Widget_interfaceComponents[var13][var16] != null) { // L: 2648
											if (SoundCache.Widget_interfaceComponents[var13][var16].type != 2) { // L: 2649
												SoundCache.Widget_interfaceComponents[var13][var16] = null;
											} else {
												var40 = false; // L: 2650
											}
										}
									}

									if (var40) { // L: 2653
										SoundCache.Widget_interfaceComponents[var13] = null;
									}

									class228.Widget_loadedInterfaces[var13] = false; // L: 2654
								}
							}
						}

						for (InterfaceParent var35 = (InterfaceParent)interfaceParents.first(); var35 != null; var35 = (InterfaceParent)interfaceParents.next()) { // L: 2657
							MusicPatchPcmStream.closeInterface(var35, true); // L: 2658
						}

						rootInterface = -1; // L: 2660
						interfaceParents = new NodeHashTable(8); // L: 2661
						meslayerContinueWidget = null; // L: 2662
						class125.method2824(); // L: 2663
						playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1); // L: 2664

						for (var13 = 0; var13 < 8; ++var13) { // L: 2665
							playerMenuActions[var13] = null; // L: 2666
							playerOptionsPriorities[var13] = false; // L: 2667
						}

						class125.method2830(); // L: 2669
						isLoading = true; // L: 2670

						for (var13 = 0; var13 < 100; ++var13) { // L: 2671
							field703[var13] = true;
						}

						SpriteMask.method5522(); // L: 2672
						Huffman.friendsChat = null; // L: 2673
						HealthBar.guestClanSettings = null; // L: 2674
						Arrays.fill(currentClanSettings, (Object)null); // L: 2675
						class150.guestClanChannel = null; // L: 2676
						Arrays.fill(currentClanChannels, (Object)null); // L: 2677

						for (var13 = 0; var13 < 8; ++var13) { // L: 2678
							grandExchangeOffers[var13] = new GrandExchangeOffer();
						}

						class143.grandExchangeEvents = null; // L: 2679
						AbstractUserComparator.updatePlayer(var2); // L: 2681
						GrandExchangeOffer.field4070 = -1; // L: 2682
						class294.loadRegions(false, var2); // L: 2683
						packetWriter.serverPacket = null; // L: 2684
					}

				}
			}
		} catch (IOException var24) { // L: 2744
			if (field609 < 1) {
				if (FloorDecoration.worldPort == currentPort) {
					currentPort = class18.js5Port;
				} else {
					currentPort = FloorDecoration.worldPort;
				}

				++field609; // L: 2748
				HitSplatDefinition.method3624(0);
			} else {
				Canvas.getLoginError(-2); // L: 2752
			}
		}
	} // L: 2503 2686

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2106360630"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 3029
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 3030
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 3031
			hadNetworkError = false; // L: 3032
			class131.method2877(); // L: 3033
		} else {
			if (!isMenuOpen) { // L: 3036
				InterfaceParent.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1120(packetWriter); ++var1) { // L: 3037 3038
			}

			if (gameState == 30) { // L: 3040
				int var2;
				PacketBufferNode var14;
				while (class6.method37()) { // L: 3041
					var14 = EnumComposition.getPacketBufferNode(ClientPacket.field3001, packetWriter.isaacCipher); // L: 3042
					var14.packetBuffer.writeByte(0); // L: 3043
					var2 = var14.packetBuffer.offset; // L: 3044
					ArchiveDiskAction.performReflectionCheck(var14.packetBuffer); // L: 3045
					var14.packetBuffer.method7935(var14.packetBuffer.offset - var2); // L: 3046
					packetWriter.addNode(var14); // L: 3047
				}

				if (timer.field4223) { // L: 3049
					var14 = EnumComposition.getPacketBufferNode(ClientPacket.field2918, packetWriter.isaacCipher); // L: 3051
					var14.packetBuffer.writeByte(0); // L: 3052
					var2 = var14.packetBuffer.offset; // L: 3053
					timer.write(var14.packetBuffer); // L: 3054
					var14.packetBuffer.method7935(var14.packetBuffer.offset - var2); // L: 3055
					packetWriter.addNode(var14); // L: 3056
					timer.method6513(); // L: 3057
				}

				int var3;
				int var4;
				int var5;
				int var6;
				int var7;
				int var8;
				int var9;
				int var10;
				int var11;
				int var12;
				synchronized(ItemLayer.mouseRecorder.lock) { // L: 3060
					if (!field521) { // L: 3061
						ItemLayer.mouseRecorder.index = 0; // L: 3147
					} else if (MouseHandler.MouseHandler_lastButton != 0 || ItemLayer.mouseRecorder.index >= 40) { // L: 3062
						PacketBufferNode var15 = null; // L: 3064
						var3 = 0; // L: 3065
						var4 = 0; // L: 3066
						var5 = 0; // L: 3067
						var6 = 0; // L: 3068

						for (var7 = 0; var7 < ItemLayer.mouseRecorder.index && (var15 == null || var15.packetBuffer.offset - var3 < 246); ++var7) { // L: 3069 3070
							var4 = var7; // L: 3071
							var8 = ItemLayer.mouseRecorder.ys[var7]; // L: 3072
							if (var8 < -1) { // L: 3073
								var8 = -1;
							} else if (var8 > 65534) { // L: 3074
								var8 = 65534;
							}

							var9 = ItemLayer.mouseRecorder.xs[var7]; // L: 3075
							if (var9 < -1) { // L: 3076
								var9 = -1;
							} else if (var9 > 65534) { // L: 3077
								var9 = 65534;
							}

							if (var9 != field605 || var8 != field647) { // L: 3078
								if (var15 == null) { // L: 3081
									var15 = EnumComposition.getPacketBufferNode(ClientPacket.field2931, packetWriter.isaacCipher); // L: 3082
									var15.packetBuffer.writeByte(0); // L: 3083
									var3 = var15.packetBuffer.offset; // L: 3084
									PacketBuffer var10000 = var15.packetBuffer; // L: 3085
									var10000.offset += 2;
									var5 = 0; // L: 3086
									var6 = 0; // L: 3087
								}

								if (field662 != -1L) { // L: 3092
									var10 = var9 - field605; // L: 3093
									var11 = var8 - field647; // L: 3094
									var12 = (int)((ItemLayer.mouseRecorder.millis[var7] - field662) / 20L); // L: 3095
									var5 = (int)((long)var5 + (ItemLayer.mouseRecorder.millis[var7] - field662) % 20L); // L: 3096
								} else {
									var10 = var9; // L: 3099
									var11 = var8; // L: 3100
									var12 = Integer.MAX_VALUE; // L: 3101
								}

								field605 = var9; // L: 3103
								field647 = var8; // L: 3104
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 3105
									var10 += 32; // L: 3106
									var11 += 32; // L: 3107
									var15.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 3108
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 3110
									var10 += 128; // L: 3111
									var11 += 128; // L: 3112
									var15.packetBuffer.writeByte(var12 + 128); // L: 3113
									var15.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 3114
								} else if (var12 < 32) { // L: 3116
									var15.packetBuffer.writeByte(var12 + 192); // L: 3117
									if (var9 != -1 && var8 != -1) { // L: 3118
										var15.packetBuffer.writeInt(var9 | var8 << 16); // L: 3119
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var15.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 3122
									if (var9 != -1 && var8 != -1) { // L: 3123
										var15.packetBuffer.writeInt(var9 | var8 << 16); // L: 3124
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6; // L: 3126
								field662 = ItemLayer.mouseRecorder.millis[var7]; // L: 3127
							}
						}

						if (var15 != null) { // L: 3129
							var15.packetBuffer.method7935(var15.packetBuffer.offset - var3); // L: 3130
							var7 = var15.packetBuffer.offset; // L: 3131
							var15.packetBuffer.offset = var3; // L: 3132
							var15.packetBuffer.writeByte(var5 / var6); // L: 3133
							var15.packetBuffer.writeByte(var5 % var6); // L: 3134
							var15.packetBuffer.offset = var7; // L: 3135
							packetWriter.addNode(var15); // L: 3136
						}

						if (var4 >= ItemLayer.mouseRecorder.index) { // L: 3138
							ItemLayer.mouseRecorder.index = 0;
						} else {
							MouseRecorder var42 = ItemLayer.mouseRecorder; // L: 3140
							var42.index -= var4;
							System.arraycopy(ItemLayer.mouseRecorder.xs, var4, ItemLayer.mouseRecorder.xs, 0, ItemLayer.mouseRecorder.index); // L: 3141
							System.arraycopy(ItemLayer.mouseRecorder.ys, var4, ItemLayer.mouseRecorder.ys, 0, ItemLayer.mouseRecorder.index); // L: 3142
							System.arraycopy(ItemLayer.mouseRecorder.millis, var4, ItemLayer.mouseRecorder.millis, 0, ItemLayer.mouseRecorder.index); // L: 3143
						}
					}
				}

				PacketBufferNode var18;
				if (MouseHandler.MouseHandler_lastButton == 1 || !class122.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 3149
					long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis; // L: 3150
					if (var16 > 32767L) { // L: 3151
						var16 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis; // L: 3152
					var3 = MouseHandler.MouseHandler_lastPressedY; // L: 3153
					if (var3 < 0) { // L: 3154
						var3 = 0;
					} else if (var3 > class78.canvasHeight) { // L: 3155
						var3 = class78.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX; // L: 3156
					if (var4 < 0) { // L: 3157
						var4 = 0;
					} else if (var4 > Script.canvasWidth) { // L: 3158
						var4 = Script.canvasWidth;
					}

					var5 = (int)var16; // L: 3159
					var18 = EnumComposition.getPacketBufferNode(ClientPacket.field2957, packetWriter.isaacCipher); // L: 3160
					var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1)); // L: 3161
					var18.packetBuffer.writeShort(var4); // L: 3162
					var18.packetBuffer.writeShort(var3); // L: 3163
					packetWriter.addNode(var18); // L: 3164
				}

				if (KeyHandler.field144 > 0) { // L: 3166
					var14 = EnumComposition.getPacketBufferNode(ClientPacket.field2917, packetWriter.isaacCipher); // L: 3167
					var14.packetBuffer.writeShort(0); // L: 3168
					var2 = var14.packetBuffer.offset; // L: 3169
					long var19 = class115.method2692(); // L: 3170

					for (var5 = 0; var5 < KeyHandler.field144; ++var5) { // L: 3171
						long var21 = var19 - field728; // L: 3172
						if (var21 > 16777215L) { // L: 3173
							var21 = 16777215L;
						}

						field728 = var19; // L: 3174
						var14.packetBuffer.method7762(KeyHandler.field134[var5]); // L: 3175
						var14.packetBuffer.writeMedium((int)var21); // L: 3176
					}

					var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var2); // L: 3178
					packetWriter.addNode(var14); // L: 3179
				}

				if (field493 > 0) { // L: 3181
					--field493;
				}

				if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) { // L: 3182
					field578 = true;
				}

				if (field578 && field493 <= 0) { // L: 3183
					field493 = 20; // L: 3184
					field578 = false; // L: 3185
					var14 = EnumComposition.getPacketBufferNode(ClientPacket.field3006, packetWriter.isaacCipher); // L: 3187
					var14.packetBuffer.writeIntME(camAngleY); // L: 3188
					var14.packetBuffer.method7929(camAngleX); // L: 3189
					packetWriter.addNode(var14); // L: 3190
				}

				if (ModelData0.hasFocus && !hadFocus) { // L: 3192
					hadFocus = true; // L: 3193
					var14 = EnumComposition.getPacketBufferNode(ClientPacket.field3002, packetWriter.isaacCipher); // L: 3195
					var14.packetBuffer.writeByte(1); // L: 3196
					packetWriter.addNode(var14); // L: 3197
				}

				if (!ModelData0.hasFocus && hadFocus) { // L: 3199
					hadFocus = false; // L: 3200
					var14 = EnumComposition.getPacketBufferNode(ClientPacket.field3002, packetWriter.isaacCipher); // L: 3202
					var14.packetBuffer.writeByte(0); // L: 3203
					packetWriter.addNode(var14); // L: 3204
				}

				if (class121.worldMap != null) { // L: 3207
					class121.worldMap.method7182();
				}

				SoundSystem.method743(); // L: 3208
				AbstractWorldMapData.method4985(); // L: 3209
				Messages.method2494(); // L: 3210
				if (gameState == 30) { // L: 3211
					for (PendingSpawn var36 = (PendingSpawn)pendingSpawns.last(); var36 != null; var36 = (PendingSpawn)pendingSpawns.previous()) { // L: 3213 3214 3233
						if (var36.hitpoints > 0) { // L: 3215
							--var36.hitpoints;
						}

						if (var36.hitpoints == 0) { // L: 3216
							if (var36.objectId < 0 || class298.method5753(var36.objectId, var36.field1122)) { // L: 3217
								class285.addPendingSpawnToScene(var36.plane, var36.type, var36.x, var36.y, var36.objectId, var36.field1121, var36.field1122); // L: 3218
								var36.remove(); // L: 3219
							}
						} else {
							if (var36.delay > 0) { // L: 3223
								--var36.delay;
							}

							if (var36.delay == 0 && var36.x >= 1 && var36.y >= 1 && var36.x <= 102 && var36.y <= 102 && (var36.id < 0 || class298.method5753(var36.id, var36.field1125))) { // L: 3224 3225
								class285.addPendingSpawnToScene(var36.plane, var36.type, var36.x, var36.y, var36.id, var36.orientation, var36.field1125); // L: 3226
								var36.delay = -1; // L: 3227
								if (var36.objectId == var36.id && var36.objectId == -1) { // L: 3228
									var36.remove();
								} else if (var36.id == var36.objectId && var36.field1121 == var36.orientation && var36.field1125 == var36.field1122) { // L: 3229
									var36.remove();
								}
							}
						}
					}

					ModelData0.method4532(); // L: 3236
					++packetWriter.field1342; // L: 3237
					if (packetWriter.field1342 > 750) { // L: 3238
						class131.method2877(); // L: 3239
					} else {
						PacketBuffer.method7714(); // L: 3242

						for (var1 = 0; var1 < npcCount; ++var1) { // L: 3244
							var2 = npcIndices[var1]; // L: 3245
							NPC var23 = npcs[var2]; // L: 3246
							if (var23 != null) { // L: 3247
								class285.updateActorSequence(var23, var23.definition.size); // L: 3248
							}
						}

						UrlRequester.method2536(); // L: 3252
						++field555; // L: 3253
						if (mouseCrossColor != 0) { // L: 3254
							mouseCrossState += 20; // L: 3255
							if (mouseCrossState >= 400) { // L: 3256
								mouseCrossColor = 0;
							}
						}

						if (class1.field4 != null) { // L: 3258
							++field599; // L: 3259
							if (field599 >= 15) { // L: 3260
								ChatChannel.invalidateWidget(class1.field4); // L: 3261
								class1.field4 = null; // L: 3262
							}
						}

						Widget var37 = Language.mousedOverWidgetIf1; // L: 3265
						Widget var38 = SoundSystem.field313; // L: 3266
						Language.mousedOverWidgetIf1 = null; // L: 3267
						SoundSystem.field313 = null; // L: 3268
						draggedOnWidget = null; // L: 3269
						field675 = false; // L: 3270
						field767 = false; // L: 3271
						field719 = 0; // L: 3272

						while (class18.isKeyDown() && field719 < 128) { // L: 3273
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && class272.field3196 == 66) { // L: 3274
								String var40 = FloorOverlayDefinition.method3815(); // L: 3275
								class353.client.method385(var40); // L: 3276
							} else if (oculusOrbState != 1 || HealthBar.field1258 <= 0) { // L: 3279
								field721[field719] = class272.field3196; // L: 3282
								field720[field719] = HealthBar.field1258; // L: 3283
								++field719; // L: 3284
							}
						}

						boolean var31 = staffModLevel >= 2; // L: 3288
						if (var31 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) { // L: 3290
							var4 = class101.localPlayer.plane - mouseWheelRotation; // L: 3291
							if (var4 < 0) { // L: 3292
								var4 = 0;
							} else if (var4 > 3) { // L: 3293
								var4 = 3;
							}

							if (var4 != class101.localPlayer.plane) { // L: 3294
								var5 = class101.localPlayer.pathX[0] + class28.baseX; // L: 3295
								var6 = class101.localPlayer.pathY[0] + WorldMapLabelSize.baseY; // L: 3296
								PacketBufferNode var24 = EnumComposition.getPacketBufferNode(ClientPacket.field2966, packetWriter.isaacCipher); // L: 3299
								var24.packetBuffer.method7763(var4); // L: 3300
								var24.packetBuffer.writeIntME(var6); // L: 3301
								var24.packetBuffer.method7760(0); // L: 3302
								var24.packetBuffer.writeIntME(var5); // L: 3303
								packetWriter.addNode(var24); // L: 3304
							}

							mouseWheelRotation = 0; // L: 3307
						}

						if (rootInterface != -1) { // L: 3309
							class16.updateRootInterface(rootInterface, 0, 0, Script.canvasWidth, class78.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3310

						while (true) {
							ScriptEvent var25;
							Widget var26;
							Widget var39;
							do {
								var25 = (ScriptEvent)field698.removeLast(); // L: 3312
								if (var25 == null) { // L: 3313
									while (true) {
										do {
											var25 = (ScriptEvent)field699.removeLast(); // L: 3324
											if (var25 == null) { // L: 3325
												while (true) {
													do {
														var25 = (ScriptEvent)scriptEvents.removeLast(); // L: 3336
														if (var25 == null) { // L: 3337
															this.menu(); // L: 3347
															class132.method2887(); // L: 3348
															if (clickedWidget != null) { // L: 3349
																this.method1511();
															}

															PacketBufferNode var27;
															if (Interpreter.dragInventoryWidget != null) { // L: 3350
																ChatChannel.invalidateWidget(Interpreter.dragInventoryWidget); // L: 3351
																++itemDragDuration; // L: 3352
																if (MouseHandler.MouseHandler_currentButton == 0) { // L: 3353
																	if (field705) { // L: 3354
																		if (class161.hoveredItemContainer == Interpreter.dragInventoryWidget && dragItemSlotDestination != dragItemSlotSource) { // L: 3355
																			Widget var41 = Interpreter.dragInventoryWidget; // L: 3356
																			byte var32 = 0; // L: 3357
																			if (field676 == 1 && var41.contentType == 206) { // L: 3358
																				var32 = 1;
																			}

																			if (var41.itemIds[dragItemSlotDestination] <= 0) { // L: 3359
																				var32 = 0;
																			}

																			var7 = class124.getWidgetFlags(var41); // L: 3361
																			boolean var33 = (var7 >> 29 & 1) != 0; // L: 3363
																			if (var33) { // L: 3365
																				var8 = dragItemSlotSource; // L: 3366
																				var9 = dragItemSlotDestination; // L: 3367
																				var41.itemIds[var9] = var41.itemIds[var8]; // L: 3368
																				var41.itemQuantities[var9] = var41.itemQuantities[var8]; // L: 3369
																				var41.itemIds[var8] = -1; // L: 3370
																				var41.itemQuantities[var8] = 0; // L: 3371
																			} else if (var32 == 1) { // L: 3373
																				var8 = dragItemSlotSource; // L: 3374
																				var9 = dragItemSlotDestination; // L: 3375

																				while (var8 != var9) { // L: 3376
																					if (var8 > var9) { // L: 3377
																						var41.swapItems(var8 - 1, var8); // L: 3378
																						--var8; // L: 3379
																					} else if (var8 < var9) { // L: 3381
																						var41.swapItems(var8 + 1, var8); // L: 3382
																						++var8; // L: 3383
																					}
																				}
																			} else {
																				var41.swapItems(dragItemSlotDestination, dragItemSlotSource); // L: 3388
																			}

																			var27 = EnumComposition.getPacketBufferNode(ClientPacket.field2972, packetWriter.isaacCipher); // L: 3391
																			var27.packetBuffer.method7929(dragItemSlotSource); // L: 3392
																			var27.packetBuffer.method7783(Interpreter.dragInventoryWidget.id); // L: 3393
																			var27.packetBuffer.method7762(var32); // L: 3394
																			var27.packetBuffer.method7929(dragItemSlotDestination); // L: 3395
																			packetWriter.addNode(var27); // L: 3396
																		}
																	} else if (this.shouldLeftClickOpenMenu()) { // L: 3400
																		this.openMenu(draggedWidgetX, draggedWidgetY); // L: 3401
																	} else if (menuOptionsCount > 0) { // L: 3403
																		CollisionMap.method3906(draggedWidgetX, draggedWidgetY); // L: 3404
																	}

																	field599 = 10; // L: 3407
																	MouseHandler.MouseHandler_lastButton = 0; // L: 3408
																	Interpreter.dragInventoryWidget = null; // L: 3409
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) { // L: 3412 3413
																	field705 = true; // L: 3414
																}
															}

															if (Scene.shouldSendWalk()) { // L: 3419
																var4 = Scene.Scene_selectedX; // L: 3420
																var5 = Scene.Scene_selectedY; // L: 3421
																var18 = EnumComposition.getPacketBufferNode(ClientPacket.field2962, packetWriter.isaacCipher); // L: 3423
																var18.packetBuffer.writeByte(5); // L: 3424
																var18.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3425
																var18.packetBuffer.writeShort(var4 + class28.baseX); // L: 3426
																var18.packetBuffer.writeIntME(var5 + WorldMapLabelSize.baseY); // L: 3427
																packetWriter.addNode(var18); // L: 3428
																Scene.method4195(); // L: 3429
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3430
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3431
																mouseCrossColor = 1; // L: 3432
																mouseCrossState = 0; // L: 3433
																destinationX = var4; // L: 3434
																destinationY = var5; // L: 3435
															}

															if (var37 != Language.mousedOverWidgetIf1) { // L: 3437
																if (var37 != null) { // L: 3438
																	ChatChannel.invalidateWidget(var37);
																}

																if (Language.mousedOverWidgetIf1 != null) { // L: 3439
																	ChatChannel.invalidateWidget(Language.mousedOverWidgetIf1);
																}
															}

															if (var38 != SoundSystem.field313 && field638 == field646) { // L: 3441
																if (var38 != null) { // L: 3442
																	ChatChannel.invalidateWidget(var38);
																}

																if (SoundSystem.field313 != null) { // L: 3443
																	ChatChannel.invalidateWidget(SoundSystem.field313);
																}
															}

															if (SoundSystem.field313 != null) { // L: 3445
																if (field638 < field646) { // L: 3446
																	++field638; // L: 3447
																	if (field638 == field646) { // L: 3448
																		ChatChannel.invalidateWidget(SoundSystem.field313);
																	}
																}
															} else if (field638 > 0) { // L: 3451
																--field638;
															}

															if (oculusOrbState == 0) { // L: 3453
																var4 = class101.localPlayer.x; // L: 3454
																var5 = class101.localPlayer.y; // L: 3455
																if (InterfaceParent.oculusOrbFocalPointX - var4 < -500 || InterfaceParent.oculusOrbFocalPointX - var4 > 500 || class141.oculusOrbFocalPointY - var5 < -500 || class141.oculusOrbFocalPointY - var5 > 500) { // L: 3456
																	InterfaceParent.oculusOrbFocalPointX = var4; // L: 3457
																	class141.oculusOrbFocalPointY = var5; // L: 3458
																}

																if (var4 != InterfaceParent.oculusOrbFocalPointX) { // L: 3460
																	InterfaceParent.oculusOrbFocalPointX += (var4 - InterfaceParent.oculusOrbFocalPointX) / 16;
																}

																if (var5 != class141.oculusOrbFocalPointY) { // L: 3461
																	class141.oculusOrbFocalPointY += (var5 - class141.oculusOrbFocalPointY) / 16;
																}

																var6 = InterfaceParent.oculusOrbFocalPointX >> 7; // L: 3462
																var7 = class141.oculusOrbFocalPointY >> 7; // L: 3463
																var8 = SceneTilePaint.getTileHeight(InterfaceParent.oculusOrbFocalPointX, class141.oculusOrbFocalPointY, PacketWriter.Client_plane); // L: 3464
																var9 = 0; // L: 3465
																if (var6 > 3 && var7 > 3 && var6 < 100 && var7 < 100) { // L: 3466
																	for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) { // L: 3467
																		for (var11 = var7 - 4; var11 <= var7 + 4; ++var11) { // L: 3468
																			var12 = PacketWriter.Client_plane; // L: 3469
																			if (var12 < 3 && (Tiles.Tiles_renderFlags[1][var10][var11] & 2) == 2) { // L: 3470
																				++var12;
																			}

																			int var28 = var8 - Tiles.Tiles_heights[var12][var10][var11]; // L: 3471
																			if (var28 > var9) { // L: 3472
																				var9 = var28;
																			}
																		}
																	}
																}

																var10 = var9 * 192; // L: 3476
																if (var10 > 98048) { // L: 3477
																	var10 = 98048;
																}

																if (var10 < 32768) { // L: 3478
																	var10 = 32768;
																}

																if (var10 > field681) { // L: 3479
																	field681 += (var10 - field681) / 24;
																} else if (var10 < field681) { // L: 3480
																	field681 += (var10 - field681) / 80;
																}

																class181.field1992 = SceneTilePaint.getTileHeight(class101.localPlayer.x, class101.localPlayer.y, PacketWriter.Client_plane) - camFollowHeight; // L: 3481
															} else if (oculusOrbState == 1) { // L: 3483
																ScriptEvent.method2101(); // L: 3484
																short var34 = -1; // L: 3485
																if (KeyHandler.KeyHandler_pressedKeys[33]) { // L: 3486
																	var34 = 0;
																} else if (KeyHandler.KeyHandler_pressedKeys[49]) { // L: 3487
																	var34 = 1024;
																}

																if (KeyHandler.KeyHandler_pressedKeys[48]) { // L: 3488
																	if (var34 == 0) { // L: 3489
																		var34 = 1792;
																	} else if (var34 == 1024) { // L: 3490
																		var34 = 1280;
																	} else {
																		var34 = 1536; // L: 3491
																	}
																} else if (KeyHandler.KeyHandler_pressedKeys[50]) { // L: 3493
																	if (var34 == 0) { // L: 3494
																		var34 = 256;
																	} else if (var34 == 1024) { // L: 3495
																		var34 = 768;
																	} else {
																		var34 = 512; // L: 3496
																	}
																}

																byte var35 = 0; // L: 3498
																if (KeyHandler.KeyHandler_pressedKeys[35]) { // L: 3499
																	var35 = -1;
																} else if (KeyHandler.KeyHandler_pressedKeys[51]) { // L: 3500
																	var35 = 1;
																}

																var6 = 0; // L: 3501
																if (var34 >= 0 || var35 != 0) { // L: 3502
																	var6 = KeyHandler.KeyHandler_pressedKeys[81] ? oculusOrbSlowedSpeed * 31984657 * 7759089 : oculusOrbNormalSpeed * -149009651 * 2045082565; // L: 3503
																	var6 *= 16; // L: 3504
																	field571 = var34; // L: 3505
																	field572 = var35; // L: 3506
																}

																if (field570 < var6) { // L: 3508
																	field570 += var6 / 8; // L: 3509
																	if (field570 > var6) { // L: 3510
																		field570 = var6;
																	}
																} else if (field570 > var6) { // L: 3512
																	field570 = field570 * 9 / 10;
																}

																if (field570 > 0) { // L: 3513
																	var7 = field570 / 16; // L: 3514
																	if (field571 >= 0) { // L: 3515
																		var4 = field571 - SoundCache.cameraYaw & 2047; // L: 3516
																		var8 = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 3517
																		var9 = Rasterizer3D.Rasterizer3D_cosine[var4]; // L: 3518
																		InterfaceParent.oculusOrbFocalPointX += var7 * var8 / 65536; // L: 3519
																		class141.oculusOrbFocalPointY += var9 * var7 / 65536; // L: 3520
																	}

																	if (field572 != 0) { // L: 3522
																		class181.field1992 += var7 * field572; // L: 3523
																		if (class181.field1992 > 0) { // L: 3524
																			class181.field1992 = 0;
																		}
																	}
																} else {
																	field571 = -1; // L: 3528
																	field572 = -1; // L: 3529
																}

																if (KeyHandler.KeyHandler_pressedKeys[13]) { // L: 3531
																	HealthBarUpdate.method2205(); // L: 3532
																}
															}

															if (MouseHandler.MouseHandler_currentButton == 4 && class122.mouseCam) { // L: 3535
																var4 = MouseHandler.MouseHandler_y - mouseCamClickedY; // L: 3536
																camAngleDX = var4 * 2; // L: 3537
																mouseCamClickedY = var4 != -1 && var4 != 1 ? (mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y * -1019536109 * 673527067; // L: 3538
																var5 = mouseCamClickedX - MouseHandler.MouseHandler_x; // L: 3539
																camAngleDY = var5 * 2; // L: 3540
																mouseCamClickedX = var5 != -1 && var5 != 1 ? (mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x * 1882994615 * -1418373625; // L: 3541
															} else {
																if (KeyHandler.KeyHandler_pressedKeys[96]) { // L: 3544
																	camAngleDY += (-24 - camAngleDY) / 2;
																} else if (KeyHandler.KeyHandler_pressedKeys[97]) { // L: 3545
																	camAngleDY += (24 - camAngleDY) / 2;
																} else {
																	camAngleDY /= 2; // L: 3546
																}

																if (KeyHandler.KeyHandler_pressedKeys[98]) { // L: 3547
																	camAngleDX += (12 - camAngleDX) / 2;
																} else if (KeyHandler.KeyHandler_pressedKeys[99]) { // L: 3548
																	camAngleDX += (-12 - camAngleDX) / 2;
																} else {
																	camAngleDX /= 2; // L: 3549
																}

																mouseCamClickedY = MouseHandler.MouseHandler_y; // L: 3550
																mouseCamClickedX = MouseHandler.MouseHandler_x; // L: 3551
															}

															camAngleY = camAngleDY / 2 + camAngleY & 2047; // L: 3553
															camAngleX += camAngleDX / 2; // L: 3554
															if (camAngleX < 128) { // L: 3555
																camAngleX = 128;
															}

															if (camAngleX > 383) { // L: 3556
																camAngleX = 383;
															}

															if (field667) { // L: 3558
																InvDefinition.method3358(Interpreter.field846, WorldMapManager.field2743, BoundaryObject.field2622); // L: 3559
																KeyHandler.method300(Decimator.field402, class390.field4423); // L: 3560
																if (class18.cameraX == Interpreter.field846 && class16.cameraY == WorldMapManager.field2743 && BoundaryObject.field2622 == class228.cameraZ && ViewportMouse.cameraPitch == Decimator.field402 && class390.field4423 == SoundCache.cameraYaw) { // L: 3561
																	field667 = false; // L: 3562
																	isCameraLocked = false; // L: 3563
																	class165.field1809 = 0; // L: 3564
																	class434.field4664 = 0; // L: 3565
																	ClanChannel.field1690 = 0; // L: 3566
																	GameBuild.field3588 = 0; // L: 3567
																	MidiPcmStream.field3231 = 0; // L: 3568
																	UserComparator3.field1391 = 0; // L: 3569
																	PlayerComposition.field3346 = 0; // L: 3570
																	class12.field65 = 0; // L: 3571
																	class146.field1682 = 0; // L: 3572
																	InterfaceParent.field1043 = 0; // L: 3573
																}
															} else if (isCameraLocked) { // L: 3577
																var4 = class12.field65 * 128 + 64; // L: 3578
																var5 = class146.field1682 * 128 + 64; // L: 3579
																var6 = SceneTilePaint.getTileHeight(var4, var5, PacketWriter.Client_plane) - InterfaceParent.field1043; // L: 3580
																InvDefinition.method3358(var4, var6, var5); // L: 3581
																var4 = class165.field1809 * 128 + 64; // L: 3582
																var5 = class434.field4664 * 128 + 64; // L: 3583
																var6 = SceneTilePaint.getTileHeight(var4, var5, PacketWriter.Client_plane) - ClanChannel.field1690; // L: 3584
																var7 = var4 - class18.cameraX; // L: 3585
																var8 = var6 - class16.cameraY; // L: 3586
																var9 = var5 - class228.cameraZ; // L: 3587
																var10 = (int)Math.sqrt((double)(var9 * var9 + var7 * var7)); // L: 3588
																var11 = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047; // L: 3589
																var12 = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047; // L: 3590
																KeyHandler.method300(var11, var12); // L: 3591
															}

															for (var4 = 0; var4 < 5; ++var4) { // L: 3593
																int var10002 = field747[var4]++;
															}

															class308.varcs.tryWrite(); // L: 3594
															var4 = ++MouseHandler.MouseHandler_idleCycles - 1; // L: 3597
															var6 = KeyHandler.KeyHandler_idleCycles; // L: 3602
															if (var4 > 15000 && var6 > 15000) { // L: 3605
																logoutTimer = 250; // L: 3606
																class328.method6056(14500); // L: 3607
																var27 = EnumComposition.getPacketBufferNode(ClientPacket.field2956, packetWriter.isaacCipher); // L: 3609
																packetWriter.addNode(var27); // L: 3610
															}

															Player.friendSystem.processFriendUpdates(); // L: 3612
															++packetWriter.pendingWrites; // L: 3613
															if (packetWriter.pendingWrites > 50) { // L: 3614
																var27 = EnumComposition.getPacketBufferNode(ClientPacket.field2969, packetWriter.isaacCipher); // L: 3616
																packetWriter.addNode(var27); // L: 3617
															}

															try {
																packetWriter.flush(); // L: 3620
															} catch (IOException var29) { // L: 3622
																class131.method2877(); // L: 3623
															}

															return; // L: 3625
														}

														var26 = var25.widget; // L: 3338
														if (var26.childIndex < 0) { // L: 3339
															break;
														}

														var39 = class140.getWidget(var26.parentId); // L: 3340
													} while(var39 == null || var39.children == null || var26.childIndex >= var39.children.length || var26 != var39.children[var26.childIndex]); // L: 3341

													BoundaryObject.runScriptEvent(var25); // L: 3345
												}
											}

											var26 = var25.widget; // L: 3326
											if (var26.childIndex < 0) { // L: 3327
												break;
											}

											var39 = class140.getWidget(var26.parentId); // L: 3328
										} while(var39 == null || var39.children == null || var26.childIndex >= var39.children.length || var26 != var39.children[var26.childIndex]); // L: 3329

										BoundaryObject.runScriptEvent(var25); // L: 3333
									}
								}

								var26 = var25.widget; // L: 3314
								if (var26.childIndex < 0) { // L: 3315
									break;
								}

								var39 = class140.getWidget(var26.parentId); // L: 3316
							} while(var39 == null || var39.children == null || var26.childIndex >= var39.children.length || var26 != var39.children[var26.childIndex]); // L: 3317

							BoundaryObject.runScriptEvent(var25); // L: 3321
						}
					}
				}
			}
		}
	} // L: 3034 3240

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-933968807"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = Script.canvasWidth; // L: 4400
		int var2 = class78.canvasHeight; // L: 4401
		if (super.contentWidth < var1) { // L: 4402
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight; // L: 4403
		}

		if (class19.clientPreferences != null) { // L: 4404
			try {
				Client var3 = class353.client; // L: 4406
				Object[] var4 = new Object[]{class9.getWindowedMode()}; // L: 4407
				JSObject.getWindow(var3).call("resize", var4); // L: 4410
			} catch (Throwable var5) { // L: 4413
			}
		}

	} // L: 4415

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-798444922"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) { // L: 4418
			var1 = rootInterface; // L: 4419
			if (WorldMapSection2.loadInterface(var1)) { // L: 4421
				Archive.drawModelComponents(SoundCache.Widget_interfaceComponents[var1], -1); // L: 4422
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4425
			if (field703[var1]) { // L: 4426
				field704[var1] = true;
			}

			field751[var1] = field703[var1]; // L: 4427
			field703[var1] = false; // L: 4428
		}

		field702 = cycle; // L: 4430
		viewportX = -1; // L: 4431
		viewportY = -1; // L: 4432
		class161.hoveredItemContainer = null; // L: 4433
		if (rootInterface != -1) { // L: 4434
			rootWidgetCount = 0; // L: 4435
			class193.drawWidgets(rootInterface, 0, 0, Script.canvasWidth, class78.canvasHeight, 0, 0, -1); // L: 4436
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 4438
		if (showMouseCross) { // L: 4439
			if (mouseCrossColor == 1) { // L: 4440
				BuddyRankComparator.crossSprites[mouseCrossState / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4441
			}

			if (mouseCrossColor == 2) { // L: 4443
				BuddyRankComparator.crossSprites[mouseCrossState / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4444
			}
		}

		if (!isMenuOpen) { // L: 4447
			if (viewportX != -1) { // L: 4448
				class150.method3135(viewportX, viewportY);
			}
		} else {
			ArchiveDiskActionHandler.method5779(); // L: 4450
		}

		if (gameDrawingMode == 3) { // L: 4451
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4452
				if (field751[var1]) { // L: 4453
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4454
				} else if (field704[var1]) { // L: 4456
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4457
				}
			}
		}

		BoundaryObject.method4534(PacketWriter.Client_plane, class101.localPlayer.x, class101.localPlayer.y, field555); // L: 4461
		field555 = 0; // L: 4462
	} // L: 4463

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(Lcs;II)Z",
		garbageValue = "812716451"
	)
	boolean method1118(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) { // L: 6051
			Huffman.friendsChat = null; // L: 6052
		} else {
			if (Huffman.friendsChat == null) { // L: 6055
				Huffman.friendsChat = new FriendsChat(HealthBarDefinition.loginType, class353.client); // L: 6056
			}

			Huffman.friendsChat.method6592(var1.packetBuffer, var2); // L: 6058
		}

		class259.method5189(); // L: 6060
		var1.serverPacket = null; // L: 6061
		return true; // L: 6062
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(Lcs;I)Z",
		garbageValue = "1747425058"
	)
	boolean method1379(PacketWriter var1) {
		if (Huffman.friendsChat != null) { // L: 6066
			Huffman.friendsChat.method6612(var1.packetBuffer); // L: 6067
		}

		class259.method5189(); // L: 6069
		var1.serverPacket = null; // L: 6070
		return true; // L: 6071
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(Lcs;B)Z",
		garbageValue = "42"
	)
	final boolean method1120(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 6076
		PacketBuffer var3 = var1.packetBuffer; // L: 6077
		if (var2 == null) { // L: 6078
			return false;
		} else {
			int var6;
			String var34;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 6080
					if (var1.field1341) { // L: 6081
						if (!var2.isAvailable(1)) { // L: 6082
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 6083
						var1.field1342 = 0; // L: 6084
						var1.field1341 = false; // L: 6085
					}

					var3.offset = 0; // L: 6087
					if (var3.method7674()) { // L: 6088
						if (!var2.isAvailable(1)) { // L: 6089
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 6090
						var1.field1342 = 0; // L: 6091
					}

					var1.field1341 = true; // L: 6093
					ServerPacket[] var4 = FloorUnderlayDefinition.ServerPacket_values(); // L: 6094
					var5 = var3.readSmartByteShortIsaac(); // L: 6095
					if (var5 < 0 || var5 >= var4.length) { // L: 6096
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 6097
					var1.serverPacketLength = var1.serverPacket.length; // L: 6098
				}

				if (var1.serverPacketLength == -1) { // L: 6100
					if (!var2.isAvailable(1)) { // L: 6101
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 6102
					var1.serverPacketLength = var3.array[0] & 255; // L: 6103
				}

				if (var1.serverPacketLength == -2) { // L: 6105
					if (!var2.isAvailable(2)) { // L: 6106
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 6107
					var3.offset = 0; // L: 6108
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 6109
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 6111
					return false;
				}

				var3.offset = 0; // L: 6112
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 6113
				var1.field1342 = 0; // L: 6114
				timer.method6509(); // L: 6115
				var1.field1352 = var1.field1347; // L: 6116
				var1.field1347 = var1.field1350; // L: 6117
				var1.field1350 = var1.serverPacket; // L: 6118
				if (ServerPacket.field3051 == var1.serverPacket) { // L: 6119
					WorldMapSprite.method4998(class262.field3023); // L: 6120
					var1.serverPacket = null; // L: 6121
					return true; // L: 6122
				}

				int var7;
				int var8;
				int var9;
				int var10;
				int var11;
				int var20;
				if (ServerPacket.field3123 == var1.serverPacket) { // L: 6124
					var10 = var3.method7766(); // L: 6133
					var11 = var3.method7776(); // L: 6134
					var9 = var3.method7776(); // L: 6135
					var6 = var3.method7848(); // L: 6136
					var20 = var6 >> 16; // L: 6137
					var5 = var6 >> 8 & 255; // L: 6138
					var7 = var20 + (var6 >> 4 & 7); // L: 6139
					var8 = var5 + (var6 & 7); // L: 6140
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 6141
						var7 = var7 * 128 + 64; // L: 6142
						var8 = var8 * 128 + 64; // L: 6143
						GraphicsObject var60 = new GraphicsObject(var9, PacketWriter.Client_plane, var7, var8, SceneTilePaint.getTileHeight(var7, var8, PacketWriter.Client_plane) - var10, var11, cycle); // L: 6144
						graphicsObjects.addFirst(var60); // L: 6145
					}

					var1.serverPacket = null; // L: 6147
					return true; // L: 6148
				}

				if (ServerPacket.field3075 == var1.serverPacket) { // L: 6150
					var20 = var3.readUnsignedByte(); // L: 6151
					DefaultsGroup.forceDisconnect(var20); // L: 6152
					var1.serverPacket = null; // L: 6153
					return false; // L: 6154
				}

				if (ServerPacket.field3124 == var1.serverPacket) { // L: 6156
					if (FontName.field4584 == null) { // L: 6157
						FontName.field4584 = new class391(ModeWhere.HitSplatDefinition_cached);
					}

					class450 var56 = ModeWhere.HitSplatDefinition_cached.method7060(var3); // L: 6158
					FontName.field4584.field4424.vmethod7441(var56.field4765, var56.field4766); // L: 6159
					field686[++field687 - 1 & 31] = var56.field4765; // L: 6160
					var1.serverPacket = null; // L: 6161
					return true; // L: 6162
				}

				InterfaceParent var70;
				if (ServerPacket.field3085 == var1.serverPacket) { // L: 6164
					var20 = var3.readInt(); // L: 6165
					var5 = var3.readUnsignedByte(); // L: 6166
					var6 = var3.readUnsignedShort(); // L: 6167
					var70 = (InterfaceParent)interfaceParents.get((long)var20); // L: 6168
					if (var70 != null) { // L: 6169
						MusicPatchPcmStream.closeInterface(var70, var6 != var70.group);
					}

					Language.method6063(var20, var6, var5); // L: 6170
					var1.serverPacket = null; // L: 6171
					return true; // L: 6172
				}

				int var15;
				long var22;
				long var24;
				long var26;
				long var29;
				String var31;
				String var51;
				if (ServerPacket.field3045 == var1.serverPacket) { // L: 6174
					var51 = var3.readStringCp1252NullTerminated(); // L: 6175
					var22 = var3.readLong(); // L: 6176
					var24 = (long)var3.readUnsignedShort(); // L: 6177
					var26 = (long)var3.readMedium(); // L: 6178
					PlayerType var71 = (PlayerType)Actor.findEnumerated(SoundSystem.PlayerType_values(), var3.readUnsignedByte()); // L: 6179
					var29 = var26 + (var24 << 32); // L: 6180
					boolean var63 = false; // L: 6181

					for (var15 = 0; var15 < 100; ++var15) { // L: 6182
						if (crossWorldMessageIds[var15] == var29) { // L: 6183
							var63 = true; // L: 6184
							break; // L: 6185
						}
					}

					if (var71.isUser && Player.friendSystem.isIgnored(new Username(var51, HealthBarDefinition.loginType))) { // L: 6188 6189
						var63 = true;
					}

					if (!var63 && field607 == 0) { // L: 6191
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var29; // L: 6192
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6193
						var31 = AbstractFont.escapeBrackets(ArchiveDiskAction.method5777(class134.method2904(var3))); // L: 6194
						if (var71.modIcon != -1) { // L: 6195
							SecureRandomFuture.addChatMessage(9, SecureRandomCallable.method2066(var71.modIcon) + var51, var31, class229.base37DecodeLong(var22));
						} else {
							SecureRandomFuture.addChatMessage(9, var51, var31, class229.base37DecodeLong(var22)); // L: 6196
						}
					}

					var1.serverPacket = null; // L: 6198
					return true; // L: 6199
				}

				if (ServerPacket.field3134 == var1.serverPacket) { // L: 6201
					var20 = var3.offset + var1.serverPacketLength; // L: 6202
					var5 = var3.readUnsignedShort(); // L: 6203
					var6 = var3.readUnsignedShort(); // L: 6204
					if (var5 != rootInterface) { // L: 6205
						rootInterface = var5; // L: 6206
						this.resizeRoot(false); // L: 6207
						class17.Widget_resetModelFrames(rootInterface); // L: 6208
						WorldMapLabelSize.runWidgetOnLoadListener(rootInterface); // L: 6209

						for (var7 = 0; var7 < 100; ++var7) { // L: 6210
							field703[var7] = true;
						}
					}

					InterfaceParent var73;
					for (; var6-- > 0; var73.field1040 = true) { // L: 6212 6222
						var7 = var3.readInt(); // L: 6213
						var8 = var3.readUnsignedShort(); // L: 6214
						var9 = var3.readUnsignedByte(); // L: 6215
						var73 = (InterfaceParent)interfaceParents.get((long)var7); // L: 6216
						if (var73 != null && var8 != var73.group) { // L: 6217
							MusicPatchPcmStream.closeInterface(var73, true); // L: 6218
							var73 = null; // L: 6219
						}

						if (var73 == null) { // L: 6221
							var73 = Language.method6063(var7, var8, var9);
						}
					}

					for (var70 = (InterfaceParent)interfaceParents.first(); var70 != null; var70 = (InterfaceParent)interfaceParents.next()) { // L: 6224
						if (var70.field1040) { // L: 6225
							var70.field1040 = false;
						} else {
							MusicPatchPcmStream.closeInterface(var70, true); // L: 6227
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 6230

					while (var3.offset < var20) { // L: 6231
						var7 = var3.readInt(); // L: 6232
						var8 = var3.readUnsignedShort(); // L: 6233
						var9 = var3.readUnsignedShort(); // L: 6234
						var10 = var3.readInt(); // L: 6235

						for (var11 = var8; var11 <= var9; ++var11) { // L: 6236
							var29 = ((long)var7 << 32) + (long)var11; // L: 6237
							widgetFlags.put(new IntegerNode(var10), var29); // L: 6238
						}
					}

					var1.serverPacket = null; // L: 6241
					return true; // L: 6242
				}

				if (ServerPacket.field3044 == var1.serverPacket) { // L: 6244
					for (var20 = 0; var20 < players.length; ++var20) { // L: 6245
						if (players[var20] != null) { // L: 6246
							players[var20].sequence = -1;
						}
					}

					for (var20 = 0; var20 < npcs.length; ++var20) { // L: 6248
						if (npcs[var20] != null) { // L: 6249
							npcs[var20].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 6251
					return true; // L: 6252
				}

				if (ServerPacket.field3068 == var1.serverPacket) { // L: 6254
					isCameraLocked = false; // L: 6255

					for (var20 = 0; var20 < 5; ++var20) { // L: 6256
						field743[var20] = false;
					}

					var1.serverPacket = null; // L: 6257
					return true; // L: 6258
				}

				if (ServerPacket.field3090 == var1.serverPacket) { // L: 6260
					ClanSettings.updatePlayers(var3, var1.serverPacketLength); // L: 6261
					ScriptEvent.method2106(); // L: 6262
					var1.serverPacket = null; // L: 6263
					return true; // L: 6264
				}

				if (ServerPacket.field3050 == var1.serverPacket) { // L: 6266
					WorldMapSprite.method4998(class262.field3024); // L: 6267
					var1.serverPacket = null; // L: 6268
					return true; // L: 6269
				}

				if (ServerPacket.field3054 == var1.serverPacket) { // L: 6271
					WorldMapSprite.method4998(class262.field3017); // L: 6272
					var1.serverPacket = null; // L: 6273
					return true; // L: 6274
				}

				if (ServerPacket.field3103 == var1.serverPacket) { // L: 6276
					hintArrowType = var3.readUnsignedByte(); // L: 6277
					if (hintArrowType == 1) { // L: 6278
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 6279
						if (hintArrowType == 2) { // L: 6280
							hintArrowSubX = 64; // L: 6281
							hintArrowSubY = 64; // L: 6282
						}

						if (hintArrowType == 3) { // L: 6284
							hintArrowSubX = 0; // L: 6285
							hintArrowSubY = 64; // L: 6286
						}

						if (hintArrowType == 4) { // L: 6288
							hintArrowSubX = 128; // L: 6289
							hintArrowSubY = 64; // L: 6290
						}

						if (hintArrowType == 5) { // L: 6292
							hintArrowSubX = 64; // L: 6293
							hintArrowSubY = 0; // L: 6294
						}

						if (hintArrowType == 6) { // L: 6296
							hintArrowSubX = 64; // L: 6297
							hintArrowSubY = 128; // L: 6298
						}

						hintArrowType = 2; // L: 6300
						hintArrowX = var3.readUnsignedShort(); // L: 6301
						hintArrowY = var3.readUnsignedShort(); // L: 6302
						hintArrowHeight = var3.readUnsignedByte(); // L: 6303
					}

					if (hintArrowType == 10) { // L: 6305
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 6306
					return true; // L: 6307
				}

				if (ServerPacket.field3135 == var1.serverPacket) { // L: 6309
					class298.field3558 = var3.method7765(); // L: 6310
					class10.field53 = var3.method7766(); // L: 6311
					var1.serverPacket = null; // L: 6312
					return true; // L: 6313
				}

				boolean var68;
				Widget var74;
				if (ServerPacket.field3095 == var1.serverPacket) { // L: 6315
					var68 = var3.readUnsignedByte() == 1; // L: 6316
					var5 = var3.method7785(); // L: 6317
					var74 = class140.getWidget(var5); // L: 6318
					if (var68 != var74.isHidden) { // L: 6319
						var74.isHidden = var68; // L: 6320
						ChatChannel.invalidateWidget(var74); // L: 6321
					}

					var1.serverPacket = null; // L: 6323
					return true; // L: 6324
				}

				Widget var83;
				if (ServerPacket.field3129 == var1.serverPacket) { // L: 6326
					var20 = var3.readInt(); // L: 6327
					var83 = class140.getWidget(var20); // L: 6328
					var83.modelType = 3; // L: 6329
					var83.modelId = class101.localPlayer.appearance.getChatHeadId(); // L: 6330
					ChatChannel.invalidateWidget(var83); // L: 6331
					var1.serverPacket = null; // L: 6332
					return true; // L: 6333
				}

				if (ServerPacket.field3043 == var1.serverPacket) { // L: 6335
					var20 = var3.method7775(); // L: 6336
					var5 = var3.method7787(); // L: 6337
					var74 = class140.getWidget(var5); // L: 6338
					if (var74 != null && var74.type == 0) { // L: 6339
						if (var20 > var74.scrollHeight - var74.height) { // L: 6340
							var20 = var74.scrollHeight - var74.height;
						}

						if (var20 < 0) { // L: 6341
							var20 = 0;
						}

						if (var20 != var74.scrollY) { // L: 6342
							var74.scrollY = var20; // L: 6343
							ChatChannel.invalidateWidget(var74); // L: 6344
						}
					}

					var1.serverPacket = null; // L: 6347
					return true; // L: 6348
				}

				if (ServerPacket.field3106 == var1.serverPacket) { // L: 6350
					class101.field1366 = true; // L: 6351
					UserComparator4.updateNpcs(false, var3); // L: 6352
					var1.serverPacket = null; // L: 6353
					return true; // L: 6354
				}

				if (ServerPacket.field3079 == var1.serverPacket) { // L: 6356
					rebootTimer = var3.method7774() * 30; // L: 6357
					field695 = cycleCntr; // L: 6358
					var1.serverPacket = null; // L: 6359
					return true; // L: 6360
				}

				if (ServerPacket.field3077 == var1.serverPacket) { // L: 6362
					var20 = var3.readInt(); // L: 6363
					if (var20 != field635) { // L: 6364
						field635 = var20; // L: 6365
						MilliClock.method3304(); // L: 6366
					}

					var1.serverPacket = null; // L: 6368
					return true; // L: 6369
				}

				if (ServerPacket.field3094 == var1.serverPacket) { // L: 6371
					var20 = var3.readUnsignedByte(); // L: 6372
					if (var3.readUnsignedByte() == 0) { // L: 6373
						grandExchangeOffers[var20] = new GrandExchangeOffer(); // L: 6374
						var3.offset += 18; // L: 6375
					} else {
						--var3.offset; // L: 6378
						grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false); // L: 6379
					}

					field480 = cycleCntr; // L: 6381
					var1.serverPacket = null; // L: 6382
					return true; // L: 6383
				}

				if (ServerPacket.field3097 == var1.serverPacket) { // L: 6385
					UserComparator4.updateNpcs(true, var3); // L: 6386
					var1.serverPacket = null; // L: 6387
					return true; // L: 6388
				}

				if (ServerPacket.field3089 == var1.serverPacket) { // L: 6390
					Player.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 6391
					field689 = cycleCntr; // L: 6392
					var1.serverPacket = null; // L: 6393
					return true; // L: 6394
				}

				if (ServerPacket.field3073 == var1.serverPacket) { // L: 6396
					minimapState = var3.readUnsignedByte(); // L: 6397
					var1.serverPacket = null; // L: 6398
					return true; // L: 6399
				}

				if (ServerPacket.field3071 == var1.serverPacket) { // L: 6401
					var20 = var3.readUnsignedByte(); // L: 6402
					WorldMapDecoration.method4991(var20); // L: 6403
					var1.serverPacket = null; // L: 6404
					return true; // L: 6405
				}

				if (ServerPacket.field3056 == var1.serverPacket) { // L: 6407
					class101.field1366 = true; // L: 6408
					UserComparator4.updateNpcs(true, var3); // L: 6409
					var1.serverPacket = null; // L: 6410
					return true; // L: 6411
				}

				NPC var69;
				if (ServerPacket.field3102 == var1.serverPacket) { // L: 6413
					var5 = var3.method7787(); // L: 6418
					var6 = var3.method7775(); // L: 6419
					var20 = var3.method7774(); // L: 6420
					var69 = npcs[var20]; // L: 6421
					if (var69 != null) { // L: 6422
						var69.spotAnimation = var6; // L: 6423
						var69.spotAnimationHeight = var5 >> 16; // L: 6424
						var69.field1178 = (var5 & 65535) + cycle; // L: 6425
						var69.spotAnimationFrame = 0; // L: 6426
						var69.spotAnimationFrameCycle = 0; // L: 6427
						if (var69.field1178 > cycle) { // L: 6428
							var69.spotAnimationFrame = -1; // L: 6429
						}

						if (var69.spotAnimation == 65535) { // L: 6431
							var69.spotAnimation = -1; // L: 6432
						}
					}

					var1.serverPacket = null; // L: 6435
					return true; // L: 6436
				}

				if (ServerPacket.field3084 == var1.serverPacket) { // L: 6438
					var20 = var3.method7776(); // L: 6439
					rootInterface = var20; // L: 6440
					this.resizeRoot(false); // L: 6441
					class17.Widget_resetModelFrames(var20); // L: 6442
					WorldMapLabelSize.runWidgetOnLoadListener(rootInterface); // L: 6443

					for (var5 = 0; var5 < 100; ++var5) { // L: 6444
						field703[var5] = true;
					}

					var1.serverPacket = null; // L: 6445
					return true; // L: 6446
				}

				if (ServerPacket.field3127 == var1.serverPacket) { // L: 6448
					for (var20 = 0; var20 < VarpDefinition.field1822; ++var20) { // L: 6449
						VarpDefinition var87 = FloorUnderlayDefinition.VarpDefinition_get(var20); // L: 6450
						if (var87 != null) { // L: 6451
							Varps.Varps_temp[var20] = 0; // L: 6452
							Varps.Varps_main[var20] = 0; // L: 6453
						}
					}

					GraphicsObject.method1870(); // L: 6456
					changedVarpCount += 32; // L: 6457
					var1.serverPacket = null; // L: 6458
					return true; // L: 6459
				}

				byte var65;
				if (ServerPacket.field3115 == var1.serverPacket) { // L: 6461
					UserComparator5.method2586(); // L: 6462
					var65 = var3.readByte(); // L: 6463
					class131 var86 = new class131(var3); // L: 6464
					ClanSettings var89;
					if (var65 >= 0) { // L: 6466
						var89 = currentClanSettings[var65];
					} else {
						var89 = HealthBar.guestClanSettings; // L: 6467
					}

					var86.method2869(var89); // L: 6468
					var1.serverPacket = null; // L: 6469
					return true; // L: 6470
				}

				Widget var21;
				if (ServerPacket.field3060 == var1.serverPacket) { // L: 6472
					var20 = var3.method7775(); // L: 6473
					if (var20 == 65535) { // L: 6474
						var20 = -1;
					}

					var5 = var3.readInt(); // L: 6475
					var6 = var3.method7787(); // L: 6476
					var21 = class140.getWidget(var5); // L: 6477
					ItemComposition var82;
					if (!var21.isIf3) { // L: 6478
						if (var20 == -1) { // L: 6479
							var21.modelType = 0; // L: 6480
							var1.serverPacket = null; // L: 6481
							return true; // L: 6482
						}

						var82 = EnumComposition.ItemDefinition_get(var20); // L: 6484
						var21.modelType = 4; // L: 6485
						var21.modelId = var20; // L: 6486
						var21.modelAngleX = var82.xan2d; // L: 6487
						var21.modelAngleY = var82.yan2d; // L: 6488
						var21.modelZoom = var82.zoom2d * 100 / var6; // L: 6489
						ChatChannel.invalidateWidget(var21); // L: 6490
					} else {
						var21.itemId = var20; // L: 6493
						var21.itemQuantity = var6; // L: 6494
						var82 = EnumComposition.ItemDefinition_get(var20); // L: 6495
						var21.modelAngleX = var82.xan2d; // L: 6496
						var21.modelAngleY = var82.yan2d; // L: 6497
						var21.modelAngleZ = var82.zan2d; // L: 6498
						var21.modelOffsetX = var82.offsetX2d; // L: 6499
						var21.modelOffsetY = var82.offsetY2d; // L: 6500
						var21.modelZoom = var82.zoom2d; // L: 6501
						if (var82.isStackable == 1) { // L: 6502
							var21.itemQuantityMode = 1;
						} else {
							var21.itemQuantityMode = 2; // L: 6503
						}

						if (var21.field3424 > 0) { // L: 6504
							var21.modelZoom = var21.modelZoom * 32 / var21.field3424;
						} else if (var21.rawWidth > 0) { // L: 6505
							var21.modelZoom = var21.modelZoom * 32 / var21.rawWidth;
						}

						ChatChannel.invalidateWidget(var21); // L: 6506
					}

					var1.serverPacket = null; // L: 6508
					return true; // L: 6509
				}

				if (ServerPacket.field3067 == var1.serverPacket) { // L: 6511
					WorldMapSprite.method4998(class262.field3022); // L: 6512
					var1.serverPacket = null; // L: 6513
					return true; // L: 6514
				}

				if (ServerPacket.field3064 == var1.serverPacket) { // L: 6516
					field692 = cycleCntr; // L: 6517
					var65 = var3.readByte(); // L: 6518
					if (var1.serverPacketLength == 1) { // L: 6519
						if (var65 >= 0) { // L: 6520
							currentClanChannels[var65] = null;
						} else {
							class150.guestClanChannel = null; // L: 6521
						}

						var1.serverPacket = null; // L: 6522
						return true; // L: 6523
					}

					if (var65 >= 0) { // L: 6525
						currentClanChannels[var65] = new ClanChannel(var3); // L: 6526
					} else {
						class150.guestClanChannel = new ClanChannel(var3); // L: 6529
					}

					var1.serverPacket = null; // L: 6531
					return true; // L: 6532
				}

				if (ServerPacket.field3063 == var1.serverPacket) { // L: 6534
					WorldMapSprite.method4998(class262.field3019); // L: 6535
					var1.serverPacket = null; // L: 6536
					return true; // L: 6537
				}

				if (ServerPacket.field3132 == var1.serverPacket) { // L: 6539
					var20 = var3.method7776(); // L: 6540
					byte var64 = var3.method7952(); // L: 6541
					Varps.Varps_temp[var20] = var64; // L: 6542
					if (Varps.Varps_main[var20] != var64) { // L: 6543
						Varps.Varps_main[var20] = var64; // L: 6544
					}

					class306.changeGameOptions(var20); // L: 6546
					changedVarps[++changedVarpCount - 1 & 31] = var20; // L: 6547
					var1.serverPacket = null; // L: 6548
					return true; // L: 6549
				}

				if (ServerPacket.field3099 == var1.serverPacket) { // L: 6551
					var20 = var3.readInt(); // L: 6552
					var5 = var3.readUnsignedShort(); // L: 6553
					if (var20 < -70000) { // L: 6554
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 6556
						var74 = class140.getWidget(var20);
					} else {
						var74 = null; // L: 6557
					}

					if (var74 != null) { // L: 6558
						for (var7 = 0; var7 < var74.itemIds.length; ++var7) { // L: 6559
							var74.itemIds[var7] = 0; // L: 6560
							var74.itemQuantities[var7] = 0; // L: 6561
						}
					}

					VerticalAlignment.clearItemContainer(var5); // L: 6564
					var7 = var3.readUnsignedShort(); // L: 6565

					for (var8 = 0; var8 < var7; ++var8) { // L: 6566
						var9 = var3.method7766(); // L: 6567
						if (var9 == 255) { // L: 6568
							var9 = var3.readInt();
						}

						var10 = var3.readUnsignedShort(); // L: 6569
						if (var74 != null && var8 < var74.itemIds.length) { // L: 6570 6571
							var74.itemIds[var8] = var10; // L: 6572
							var74.itemQuantities[var8] = var9; // L: 6573
						}

						ReflectionCheck.itemContainerSetItem(var5, var8, var10 - 1, var9); // L: 6576
					}

					if (var74 != null) { // L: 6578
						ChatChannel.invalidateWidget(var74);
					}

					GraphicsObject.method1870(); // L: 6579
					changedItemContainers[++field683 - 1 & 31] = var5 & 32767; // L: 6580
					var1.serverPacket = null; // L: 6581
					return true; // L: 6582
				}

				if (ServerPacket.field3066 == var1.serverPacket) { // L: 6584
					Player.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 6585
					class126.FriendSystem_invalidateIgnoreds(); // L: 6586
					field689 = cycleCntr; // L: 6587
					var1.serverPacket = null; // L: 6588
					return true; // L: 6589
				}

				if (ServerPacket.field3105 == var1.serverPacket) { // L: 6591
					class10.field53 = var3.readUnsignedByte(); // L: 6592
					class298.field3558 = var3.method7765(); // L: 6593

					while (var3.offset < var1.serverPacketLength) { // L: 6594
						var20 = var3.readUnsignedByte(); // L: 6595
						class262 var85 = class128.method2856()[var20]; // L: 6596
						WorldMapSprite.method4998(var85); // L: 6597
					}

					var1.serverPacket = null; // L: 6599
					return true; // L: 6600
				}

				if (ServerPacket.field3082 == var1.serverPacket) { // L: 6602
					class294.loadRegions(false, var1.packetBuffer); // L: 6603
					var1.serverPacket = null; // L: 6604
					return true; // L: 6605
				}

				if (ServerPacket.field3139 == var1.serverPacket) { // L: 6607
					GraphicsObject.method1870(); // L: 6608
					weight = var3.readShort(); // L: 6609
					field695 = cycleCntr; // L: 6610
					var1.serverPacket = null; // L: 6611
					return true; // L: 6612
				}

				Widget var77;
				if (ServerPacket.field3119 == var1.serverPacket) { // L: 6614
					var20 = var3.method7785(); // L: 6615
					var5 = var3.method7786(); // L: 6616
					InterfaceParent var88 = (InterfaceParent)interfaceParents.get((long)var20); // L: 6617
					var70 = (InterfaceParent)interfaceParents.get((long)var5); // L: 6618
					if (var70 != null) { // L: 6619
						MusicPatchPcmStream.closeInterface(var70, var88 == null || var70.group != var88.group);
					}

					if (var88 != null) { // L: 6620
						var88.remove(); // L: 6621
						interfaceParents.put(var88, (long)var5); // L: 6622
					}

					var77 = class140.getWidget(var20); // L: 6624
					if (var77 != null) { // L: 6625
						ChatChannel.invalidateWidget(var77);
					}

					var77 = class140.getWidget(var5); // L: 6626
					if (var77 != null) { // L: 6627
						ChatChannel.invalidateWidget(var77); // L: 6628
						BufferedNetSocket.revalidateWidgetScroll(SoundCache.Widget_interfaceComponents[var77.id >>> 16], var77, true); // L: 6629
					}

					if (rootInterface != -1) { // L: 6631
						class7.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 6632
					return true; // L: 6633
				}

				if (ServerPacket.field3137 == var1.serverPacket) { // L: 6635
					UserComparator3.readReflectionCheck(var3, var1.serverPacketLength); // L: 6636
					var1.serverPacket = null; // L: 6637
					return true; // L: 6638
				}

				if (ServerPacket.field3100 == var1.serverPacket) { // L: 6640
					var20 = var3.readInt(); // L: 6641
					var5 = var3.readShort(); // L: 6642
					var74 = class140.getWidget(var20); // L: 6643
					if (var5 != var74.sequenceId || var5 == -1) { // L: 6644
						var74.sequenceId = var5; // L: 6645
						var74.modelFrame = 0; // L: 6646
						var74.modelFrameCycle = 0; // L: 6647
						ChatChannel.invalidateWidget(var74); // L: 6648
					}

					var1.serverPacket = null; // L: 6650
					return true; // L: 6651
				}

				int var13;
				int var14;
				int var16;
				int var36;
				if (ServerPacket.field3116 == var1.serverPacket) { // L: 6653
					var6 = var3.readMedium(); // L: 6669
					var20 = var6 >> 16; // L: 6670
					var5 = var6 >> 8 & 255; // L: 6671
					var7 = var20 + (var6 >> 4 & 7); // L: 6672
					var8 = var5 + (var6 & 7); // L: 6673
					var36 = var3.readUnsignedShort(); // L: 6674
					int var18 = var3.method7765(); // L: 6675
					var14 = var3.method7767() * 4; // L: 6676
					byte var59 = var3.method7768(); // L: 6677
					byte var57 = var3.readByte(); // L: 6678
					var15 = var3.readUnsignedShort(); // L: 6679
					int var17 = var3.method7765(); // L: 6680
					var16 = var3.method7776(); // L: 6681
					var13 = var3.method7765() * 4; // L: 6682
					var11 = var3.method7779(); // L: 6683
					var9 = var59 + var7; // L: 6684
					var10 = var57 + var8; // L: 6685
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var36 != 65535) { // L: 6686
						var7 = var7 * 128 + 64; // L: 6687
						var8 = var8 * 128 + 64; // L: 6688
						var9 = var9 * 128 + 64; // L: 6689
						var10 = var10 * 128 + 64; // L: 6690
						Projectile var19 = new Projectile(var36, PacketWriter.Client_plane, var7, var8, SceneTilePaint.getTileHeight(var7, var8, PacketWriter.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var11, var14); // L: 6691
						var19.setDestination(var9, var10, SceneTilePaint.getTileHeight(var9, var10, PacketWriter.Client_plane) - var14, var15 + cycle); // L: 6692
						projectiles.addFirst(var19); // L: 6693
					}

					var1.serverPacket = null; // L: 6695
					return true; // L: 6696
				}

				if (ServerPacket.field3122 == var1.serverPacket) { // L: 6698
					Player.friendSystem.method1635(); // L: 6699
					field689 = cycleCntr; // L: 6700
					var1.serverPacket = null; // L: 6701
					return true; // L: 6702
				}

				if (ServerPacket.field3121 == var1.serverPacket) { // L: 6704
					isCameraLocked = true; // L: 6705
					field667 = false; // L: 6706
					class12.field65 = var3.readUnsignedByte(); // L: 6707
					class146.field1682 = var3.readUnsignedByte(); // L: 6708
					InterfaceParent.field1043 = var3.readUnsignedShort(); // L: 6709
					PlayerComposition.field3346 = var3.readUnsignedByte(); // L: 6710
					UserComparator3.field1391 = var3.readUnsignedByte(); // L: 6711
					if (UserComparator3.field1391 >= 100) { // L: 6712
						class18.cameraX = class12.field65 * 128 + 64; // L: 6713
						class228.cameraZ = class146.field1682 * 128 + 64; // L: 6714
						class16.cameraY = SceneTilePaint.getTileHeight(class18.cameraX, class228.cameraZ, PacketWriter.Client_plane) - InterfaceParent.field1043; // L: 6715
					}

					var1.serverPacket = null; // L: 6717
					return true; // L: 6718
				}

				if (ServerPacket.field3062 == var1.serverPacket) { // L: 6720
					var68 = var3.readUnsignedByte() == 1; // L: 6721
					if (var68) { // L: 6722
						class270.field3177 = class115.method2692() - var3.readLong(); // L: 6723
						class143.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 6724
					} else {
						class143.grandExchangeEvents = null; // L: 6726
					}

					field661 = cycleCntr; // L: 6727
					var1.serverPacket = null; // L: 6728
					return true; // L: 6729
				}

				if (ServerPacket.field3039 == var1.serverPacket) { // L: 6731
					var20 = var3.readUnsignedByte(); // L: 6732
					var5 = var3.readUnsignedByte(); // L: 6733
					var6 = var3.readUnsignedByte(); // L: 6734
					var7 = var3.readUnsignedByte(); // L: 6735
					field743[var20] = true; // L: 6736
					field762[var20] = var5; // L: 6737
					field745[var20] = var6; // L: 6738
					field537[var20] = var7; // L: 6739
					field747[var20] = 0; // L: 6740
					var1.serverPacket = null; // L: 6741
					return true; // L: 6742
				}

				if (ServerPacket.field3061 == var1.serverPacket) { // L: 6744
					destinationX = var3.readUnsignedByte(); // L: 6745
					if (destinationX == 255) { // L: 6746
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 6747
					if (destinationY == 255) { // L: 6748
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 6749
					return true; // L: 6750
				}

				if (ServerPacket.field3057 == var1.serverPacket) { // L: 6752
					var5 = var3.readUnsignedShort(); // L: 6756
					var20 = var3.method7774(); // L: 6757
					var6 = var3.method7767(); // L: 6758
					if (var5 == 65535) { // L: 6759
						var5 = -1; // L: 6760
					}

					var69 = npcs[var20]; // L: 6762
					if (var69 != null) { // L: 6763
						if (var5 == var69.sequence && var5 != -1) { // L: 6764
							var8 = ScriptFrame.SequenceDefinition_get(var5).field2174; // L: 6765
							if (var8 == 1) { // L: 6766
								var69.sequenceFrame = 0; // L: 6767
								var69.sequenceFrameCycle = 0; // L: 6768
								var69.sequenceDelay = var6; // L: 6769
								var69.field1190 = 0; // L: 6770
							} else if (var8 == 2) { // L: 6772
								var69.field1190 = 0; // L: 6773
							}
						} else if (var5 == -1 || var69.sequence == -1 || ScriptFrame.SequenceDefinition_get(var5).field2183 >= ScriptFrame.SequenceDefinition_get(var69.sequence).field2183) { // L: 6776
							var69.sequence = var5; // L: 6777
							var69.sequenceFrame = 0; // L: 6778
							var69.sequenceFrameCycle = 0; // L: 6779
							var69.sequenceDelay = var6; // L: 6780
							var69.field1190 = 0; // L: 6781
							var69.field1203 = var69.pathLength; // L: 6782
						}
					}

					var1.serverPacket = null; // L: 6786
					return true; // L: 6787
				}

				if (ServerPacket.field3136 == var1.serverPacket) { // L: 6789
					var51 = var3.readStringCp1252NullTerminated(); // L: 6790
					var34 = AbstractFont.escapeBrackets(ArchiveDiskAction.method5777(class134.method2904(var3))); // L: 6791
					class290.addGameMessage(6, var51, var34); // L: 6792
					var1.serverPacket = null; // L: 6793
					return true; // L: 6794
				}

				if (ServerPacket.field3142 == var1.serverPacket) { // L: 6796
					class10.field53 = var3.method7766(); // L: 6797
					class298.field3558 = var3.method7767(); // L: 6798

					for (var20 = class10.field53; var20 < class10.field53 + 8; ++var20) { // L: 6799
						for (var5 = class298.field3558; var5 < class298.field3558 + 8; ++var5) { // L: 6800
							if (groundItems[PacketWriter.Client_plane][var20][var5] != null) { // L: 6801
								groundItems[PacketWriter.Client_plane][var20][var5] = null; // L: 6802
								class133.updateItemPile(var20, var5); // L: 6803
							}
						}
					}

					for (PendingSpawn var53 = (PendingSpawn)pendingSpawns.last(); var53 != null; var53 = (PendingSpawn)pendingSpawns.previous()) { // L: 6807 6808 6810
						if (var53.x >= class10.field53 && var53.x < class10.field53 + 8 && var53.y >= class298.field3558 && var53.y < class298.field3558 + 8 && var53.plane == PacketWriter.Client_plane) { // L: 6809
							var53.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 6812
					return true; // L: 6813
				}

				if (ServerPacket.field3125 == var1.serverPacket) { // L: 6815
					WorldMapSprite.method4998(class262.field3018); // L: 6816
					var1.serverPacket = null; // L: 6817
					return true; // L: 6818
				}

				if (ServerPacket.field3081 == var1.serverPacket) { // L: 6820
					var20 = var3.method7776(); // L: 6821
					var5 = var3.method7785(); // L: 6822
					Varps.Varps_temp[var20] = var5; // L: 6823
					if (Varps.Varps_main[var20] != var5) { // L: 6824
						Varps.Varps_main[var20] = var5; // L: 6825
					}

					class306.changeGameOptions(var20); // L: 6827
					changedVarps[++changedVarpCount - 1 & 31] = var20; // L: 6828
					var1.serverPacket = null; // L: 6829
					return true; // L: 6830
				}

				if (ServerPacket.field3080 == var1.serverPacket) { // L: 6832
					var20 = var3.method7787(); // L: 6833
					var83 = class140.getWidget(var20); // L: 6834

					for (var6 = 0; var6 < var83.itemIds.length; ++var6) { // L: 6835
						var83.itemIds[var6] = -1; // L: 6836
						var83.itemIds[var6] = 0; // L: 6837
					}

					ChatChannel.invalidateWidget(var83); // L: 6839
					var1.serverPacket = null; // L: 6840
					return true; // L: 6841
				}

				if (ServerPacket.field3037 == var1.serverPacket) { // L: 6843
					var20 = var3.method7787(); // L: 6844
					var5 = var3.method7774(); // L: 6845
					if (var5 == 65535) { // L: 6846
						var5 = -1;
					}

					var6 = var3.method7786(); // L: 6847
					var7 = var3.method7775(); // L: 6848
					if (var7 == 65535) { // L: 6849
						var7 = -1;
					}

					for (var8 = var7; var8 <= var5; ++var8) { // L: 6850
						var26 = (long)var8 + ((long)var6 << 32); // L: 6851
						Node var28 = widgetFlags.get(var26); // L: 6852
						if (var28 != null) { // L: 6853
							var28.remove();
						}

						widgetFlags.put(new IntegerNode(var20), var26); // L: 6854
					}

					var1.serverPacket = null; // L: 6856
					return true; // L: 6857
				}

				if (ServerPacket.field3107 == var1.serverPacket) { // L: 6859
					MouseRecorder.logOut(); // L: 6860
					var1.serverPacket = null; // L: 6861
					return false; // L: 6862
				}

				if (ServerPacket.field3117 == var1.serverPacket) { // L: 6864
					var20 = var3.method7786(); // L: 6865
					var5 = var3.method7776(); // L: 6866
					var6 = var3.readUnsignedShort(); // L: 6867
					var21 = class140.getWidget(var20); // L: 6868
					var21.field3373 = var5 + (var6 << 16); // L: 6869
					var1.serverPacket = null; // L: 6870
					return true; // L: 6871
				}

				if (ServerPacket.field3101 == var1.serverPacket) { // L: 6873
					var20 = var3.readUnsignedShort(); // L: 6874
					if (var20 == 65535) { // L: 6875
						var20 = -1;
					}

					class16.playSong(var20); // L: 6876
					var1.serverPacket = null; // L: 6877
					return true; // L: 6878
				}

				if (ServerPacket.field3059 == var1.serverPacket) { // L: 6880
					var20 = var3.method7775(); // L: 6881
					if (var20 == 65535) { // L: 6882
						var20 = -1;
					}

					var5 = var3.method7848(); // L: 6883
					PcmPlayer.method719(var20, var5); // L: 6884
					var1.serverPacket = null; // L: 6885
					return true; // L: 6886
				}

				if (ServerPacket.field3072 == var1.serverPacket) { // L: 6888
					FontName.field4584 = null; // L: 6889
					var1.serverPacket = null; // L: 6890
					return true; // L: 6891
				}

				if (ServerPacket.field3131 == var1.serverPacket) { // L: 6893
					UserComparator5.method2586(); // L: 6894
					var65 = var3.readByte(); // L: 6895
					if (var1.serverPacketLength == 1) { // L: 6896
						if (var65 >= 0) { // L: 6897
							currentClanSettings[var65] = null;
						} else {
							HealthBar.guestClanSettings = null; // L: 6898
						}

						var1.serverPacket = null; // L: 6899
						return true; // L: 6900
					}

					if (var65 >= 0) { // L: 6902
						currentClanSettings[var65] = new ClanSettings(var3); // L: 6903
					} else {
						HealthBar.guestClanSettings = new ClanSettings(var3); // L: 6906
					}

					var1.serverPacket = null; // L: 6908
					return true; // L: 6909
				}

				if (ServerPacket.field3040 == var1.serverPacket) { // L: 6911
					WorldMapSprite.method4998(class262.field3020); // L: 6912
					var1.serverPacket = null; // L: 6913
					return true; // L: 6914
				}

				if (ServerPacket.field3055 == var1.serverPacket) { // L: 6916
					if (rootInterface != -1) { // L: 6917
						class7.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 6918
					return true; // L: 6919
				}

				if (ServerPacket.field3109 == var1.serverPacket) { // L: 6921
					class4.method12(var3.readStringCp1252NullTerminated()); // L: 6922
					var1.serverPacket = null; // L: 6923
					return true; // L: 6924
				}

				if (ServerPacket.field3076 == var1.serverPacket) { // L: 6926
					FontName.field4584 = new class391(ModeWhere.HitSplatDefinition_cached); // L: 6927
					var1.serverPacket = null; // L: 6928
					return true; // L: 6929
				}

				if (ServerPacket.field3074 == var1.serverPacket) { // L: 6931
					var20 = var3.method7776(); // L: 6932
					var5 = var3.method7775(); // L: 6933
					var6 = var3.method7786(); // L: 6934
					var7 = var3.method7775(); // L: 6935
					var77 = class140.getWidget(var6); // L: 6936
					if (var7 != var77.modelAngleX || var5 != var77.modelAngleY || var20 != var77.modelZoom) { // L: 6937
						var77.modelAngleX = var7; // L: 6938
						var77.modelAngleY = var5; // L: 6939
						var77.modelZoom = var20; // L: 6940
						ChatChannel.invalidateWidget(var77); // L: 6941
					}

					var1.serverPacket = null; // L: 6943
					return true; // L: 6944
				}

				if (ServerPacket.field3114 == var1.serverPacket) { // L: 6946
					var51 = var3.readStringCp1252NullTerminated(); // L: 6947
					var5 = var3.method7766(); // L: 6948
					var6 = var3.method7766(); // L: 6949
					if (var6 >= 1 && var6 <= 8) { // L: 6950
						if (var51.equalsIgnoreCase("null")) { // L: 6951
							var51 = null;
						}

						playerMenuActions[var6 - 1] = var51; // L: 6952
						playerOptionsPriorities[var6 - 1] = var5 == 0; // L: 6953
					}

					var1.serverPacket = null; // L: 6955
					return true; // L: 6956
				}

				if (ServerPacket.field3042 == var1.serverPacket) { // L: 6958
					var20 = var3.readInt(); // L: 6959
					var5 = var3.readUnsignedShort(); // L: 6960
					if (var20 < -70000) { // L: 6961
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 6963
						var74 = class140.getWidget(var20);
					} else {
						var74 = null; // L: 6964
					}

					for (; var3.offset < var1.serverPacketLength; ReflectionCheck.itemContainerSetItem(var5, var7, var8 - 1, var9)) { // L: 6965 6979
						var7 = var3.readUShortSmart(); // L: 6966
						var8 = var3.readUnsignedShort(); // L: 6967
						var9 = 0; // L: 6968
						if (var8 != 0) { // L: 6969
							var9 = var3.readUnsignedByte(); // L: 6970
							if (var9 == 255) { // L: 6971
								var9 = var3.readInt();
							}
						}

						if (var74 != null && var7 >= 0 && var7 < var74.itemIds.length) { // L: 6973 6974
							var74.itemIds[var7] = var8; // L: 6975
							var74.itemQuantities[var7] = var9; // L: 6976
						}
					}

					if (var74 != null) { // L: 6981
						ChatChannel.invalidateWidget(var74);
					}

					GraphicsObject.method1870(); // L: 6982
					changedItemContainers[++field683 - 1 & 31] = var5 & 32767; // L: 6983
					var1.serverPacket = null; // L: 6984
					return true; // L: 6985
				}

				if (ServerPacket.field3138 == var1.serverPacket) { // L: 6987
					var20 = var3.method7786(); // L: 6988
					var5 = var3.method7775(); // L: 6989
					var74 = class140.getWidget(var20); // L: 6990
					if (var74.modelType != 2 || var5 != var74.modelId) { // L: 6991
						var74.modelType = 2; // L: 6992
						var74.modelId = var5; // L: 6993
						ChatChannel.invalidateWidget(var74); // L: 6994
					}

					var1.serverPacket = null; // L: 6996
					return true; // L: 6997
				}

				if (ServerPacket.field3126 == var1.serverPacket) { // L: 6999
					var20 = var3.readUnsignedShort(); // L: 7000
					var5 = var3.method7785(); // L: 7001
					var74 = class140.getWidget(var5); // L: 7002
					if (var74.modelType != 1 || var20 != var74.modelId) { // L: 7003
						var74.modelType = 1; // L: 7004
						var74.modelId = var20; // L: 7005
						ChatChannel.invalidateWidget(var74); // L: 7006
					}

					var1.serverPacket = null; // L: 7008
					return true; // L: 7009
				}

				if (ServerPacket.field3041 == var1.serverPacket) { // L: 7011
					var20 = var3.method7776(); // L: 7012
					var5 = var3.method7786(); // L: 7013
					var6 = var20 >> 10 & 31; // L: 7014
					var7 = var20 >> 5 & 31; // L: 7015
					var8 = var20 & 31; // L: 7016
					var9 = (var7 << 11) + (var6 << 19) + (var8 << 3); // L: 7017
					Widget var72 = class140.getWidget(var5); // L: 7018
					if (var9 != var72.color) { // L: 7019
						var72.color = var9; // L: 7020
						ChatChannel.invalidateWidget(var72); // L: 7021
					}

					var1.serverPacket = null; // L: 7023
					return true; // L: 7024
				}

				String var40;
				if (ServerPacket.field3083 == var1.serverPacket) { // L: 7026
					var51 = var3.readStringCp1252NullTerminated(); // L: 7027
					var22 = (long)var3.readUnsignedShort(); // L: 7028
					var24 = (long)var3.readMedium(); // L: 7029
					PlayerType var37 = (PlayerType)Actor.findEnumerated(SoundSystem.PlayerType_values(), var3.readUnsignedByte()); // L: 7030
					long var38 = var24 + (var22 << 32); // L: 7031
					boolean var84 = false; // L: 7032

					for (var13 = 0; var13 < 100; ++var13) { // L: 7033
						if (crossWorldMessageIds[var13] == var38) { // L: 7034
							var84 = true; // L: 7035
							break; // L: 7036
						}
					}

					if (Player.friendSystem.isIgnored(new Username(var51, HealthBarDefinition.loginType))) { // L: 7039
						var84 = true;
					}

					if (!var84 && field607 == 0) { // L: 7040
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var38; // L: 7041
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 7042
						var40 = AbstractFont.escapeBrackets(ArchiveDiskAction.method5777(class134.method2904(var3))); // L: 7043
						byte var62;
						if (var37.isPrivileged) { // L: 7045
							var62 = 7;
						} else {
							var62 = 3; // L: 7046
						}

						if (var37.modIcon != -1) { // L: 7047
							class290.addGameMessage(var62, SecureRandomCallable.method2066(var37.modIcon) + var51, var40);
						} else {
							class290.addGameMessage(var62, var51, var40); // L: 7048
						}
					}

					var1.serverPacket = null; // L: 7050
					return true; // L: 7051
				}

				if (ServerPacket.field3118 == var1.serverPacket) { // L: 7053
					WorldMapSprite.method4998(class262.field3021); // L: 7054
					var1.serverPacket = null; // L: 7055
					return true; // L: 7056
				}

				if (ServerPacket.field3140 == var1.serverPacket) { // L: 7058
					WorldMapSprite.method4998(class262.field3015); // L: 7059
					var1.serverPacket = null; // L: 7060
					return true; // L: 7061
				}

				if (ServerPacket.field3046 == var1.serverPacket) { // L: 7063
					class294.loadRegions(true, var1.packetBuffer); // L: 7064
					var1.serverPacket = null; // L: 7065
					return true; // L: 7066
				}

				if (ServerPacket.field3091 == var1.serverPacket) { // L: 7068
					GraphicsObject.method1870(); // L: 7069
					var20 = var3.method7767(); // L: 7070
					var5 = var3.readInt(); // L: 7071
					var6 = var3.method7765(); // L: 7072
					experience[var20] = var5; // L: 7073
					currentLevels[var20] = var6; // L: 7074
					levels[var20] = 1; // L: 7075

					for (var7 = 0; var7 < 98; ++var7) { // L: 7076
						if (var5 >= Skills.Skills_experienceTable[var7]) {
							levels[var20] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var20; // L: 7077
					var1.serverPacket = null; // L: 7078
					return true; // L: 7079
				}

				if (ServerPacket.field3078 == var1.serverPacket) { // L: 7081
					var20 = var3.readInt(); // L: 7082
					InterfaceParent var81 = (InterfaceParent)interfaceParents.get((long)var20); // L: 7083
					if (var81 != null) { // L: 7084
						MusicPatchPcmStream.closeInterface(var81, true);
					}

					if (meslayerContinueWidget != null) { // L: 7085
						ChatChannel.invalidateWidget(meslayerContinueWidget); // L: 7086
						meslayerContinueWidget = null; // L: 7087
					}

					var1.serverPacket = null; // L: 7089
					return true; // L: 7090
				}

				if (ServerPacket.field3049 == var1.serverPacket) { // L: 7092
					var20 = var3.readInt(); // L: 7093
					var5 = var3.readInt(); // L: 7094
					var6 = FileSystem.getGcDuration(); // L: 7095
					PacketBufferNode var67 = EnumComposition.getPacketBufferNode(ClientPacket.field3011, packetWriter.isaacCipher); // L: 7097
					var67.packetBuffer.method7764(GameEngine.fps); // L: 7098
					var67.packetBuffer.method7762(var6); // L: 7099
					var67.packetBuffer.method7784(var20); // L: 7100
					var67.packetBuffer.method7760(var5); // L: 7101
					packetWriter.addNode(var67); // L: 7102
					var1.serverPacket = null; // L: 7103
					return true; // L: 7104
				}

				if (ServerPacket.field3112 == var1.serverPacket) { // L: 7106
					return this.method1118(var1, 1); // L: 7107
				}

				if (ServerPacket.field3070 == var1.serverPacket) { // L: 7109
					var20 = var3.method7775(); // L: 7110
					GrandExchangeOfferTotalQuantityComparator.method5969(var20); // L: 7111
					changedItemContainers[++field683 - 1 & 31] = var20 & 32767; // L: 7112
					var1.serverPacket = null; // L: 7113
					return true; // L: 7114
				}

				String var75;
				if (ServerPacket.field3120 == var1.serverPacket) { // L: 7116
					byte[] var52 = new byte[var1.serverPacketLength]; // L: 7117
					var3.method7711(var52, 0, var52.length); // L: 7118
					Buffer var80 = new Buffer(var52); // L: 7119
					var75 = var80.readStringCp1252NullTerminated(); // L: 7120
					class258.openURL(var75, true, false); // L: 7121
					var1.serverPacket = null; // L: 7122
					return true; // L: 7123
				}

				if (ServerPacket.field3093 == var1.serverPacket) { // L: 7125
					var51 = var3.readStringCp1252NullTerminated(); // L: 7126
					Object[] var78 = new Object[var51.length() + 1]; // L: 7127

					for (var6 = var51.length() - 1; var6 >= 0; --var6) { // L: 7128
						if (var51.charAt(var6) == 's') { // L: 7129
							var78[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var78[var6 + 1] = new Integer(var3.readInt()); // L: 7130
						}
					}

					var78[0] = new Integer(var3.readInt()); // L: 7132
					ScriptEvent var79 = new ScriptEvent(); // L: 7133
					var79.args = var78; // L: 7134
					BoundaryObject.runScriptEvent(var79); // L: 7135
					var1.serverPacket = null; // L: 7136
					return true; // L: 7137
				}

				if (ServerPacket.field3069 == var1.serverPacket) { // L: 7139
					var20 = var3.readUShortSmart(); // L: 7140
					boolean var54 = var3.readUnsignedByte() == 1; // L: 7141
					var75 = ""; // L: 7142
					boolean var55 = false; // L: 7143
					if (var54) { // L: 7144
						var75 = var3.readStringCp1252NullTerminated(); // L: 7145
						if (Player.friendSystem.isIgnored(new Username(var75, HealthBarDefinition.loginType))) { // L: 7146
							var55 = true;
						}
					}

					String var35 = var3.readStringCp1252NullTerminated(); // L: 7148
					if (!var55) { // L: 7149
						class290.addGameMessage(var20, var75, var35);
					}

					var1.serverPacket = null; // L: 7150
					return true; // L: 7151
				}

				if (ServerPacket.field3047 == var1.serverPacket) { // L: 7153
					isCameraLocked = true; // L: 7154
					field667 = false; // L: 7155
					class165.field1809 = var3.readUnsignedByte(); // L: 7156
					class434.field4664 = var3.readUnsignedByte(); // L: 7157
					ClanChannel.field1690 = var3.readUnsignedShort(); // L: 7158
					GameBuild.field3588 = var3.readUnsignedByte(); // L: 7159
					MidiPcmStream.field3231 = var3.readUnsignedByte(); // L: 7160
					if (MidiPcmStream.field3231 >= 100) { // L: 7161
						var20 = class165.field1809 * 128 + 64; // L: 7162
						var5 = class434.field4664 * 128 + 64; // L: 7163
						var6 = SceneTilePaint.getTileHeight(var20, var5, PacketWriter.Client_plane) - ClanChannel.field1690; // L: 7164
						var7 = var20 - class18.cameraX; // L: 7165
						var8 = var6 - class16.cameraY; // L: 7166
						var9 = var5 - class228.cameraZ; // L: 7167
						var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9)); // L: 7168
						ViewportMouse.cameraPitch = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047; // L: 7169
						SoundCache.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047; // L: 7170
						if (ViewportMouse.cameraPitch < 128) { // L: 7171
							ViewportMouse.cameraPitch = 128;
						}

						if (ViewportMouse.cameraPitch > 383) { // L: 7172
							ViewportMouse.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 7174
					return true; // L: 7175
				}

				if (ServerPacket.field3052 == var1.serverPacket) { // L: 7177
					var20 = var3.readUnsignedShort(); // L: 7182
					Player var66;
					if (var20 == localPlayerIndex) { // L: 7183
						var66 = class101.localPlayer; // L: 7184
					} else {
						var66 = players[var20]; // L: 7187
					}

					var6 = var3.method7785(); // L: 7189
					var5 = var3.method7774(); // L: 7190
					if (var66 != null) { // L: 7191
						var66.spotAnimation = var5; // L: 7192
						var66.spotAnimationHeight = var6 >> 16; // L: 7193
						var66.field1178 = (var6 & 65535) + cycle; // L: 7194
						var66.spotAnimationFrame = 0; // L: 7195
						var66.spotAnimationFrameCycle = 0; // L: 7196
						if (var66.field1178 > cycle) { // L: 7197
							var66.spotAnimationFrame = -1; // L: 7198
						}

						if (var66.spotAnimation == 65535) { // L: 7200
							var66.spotAnimation = -1; // L: 7201
						}
					}

					var1.serverPacket = null; // L: 7204
					return true; // L: 7205
				}

				if (ServerPacket.field3108 == var1.serverPacket) { // L: 7207
					tradeChatMode = var3.readUnsignedByte(); // L: 7208
					publicChatMode = var3.method7767(); // L: 7209
					var1.serverPacket = null; // L: 7210
					return true; // L: 7211
				}

				if (ServerPacket.field3130 == var1.serverPacket) { // L: 7213
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) { // L: 7214
						if (Varps.Varps_main[var20] != Varps.Varps_temp[var20]) { // L: 7215
							Varps.Varps_main[var20] = Varps.Varps_temp[var20]; // L: 7216
							class306.changeGameOptions(var20); // L: 7217
							changedVarps[++changedVarpCount - 1 & 31] = var20; // L: 7218
						}
					}

					var1.serverPacket = null; // L: 7221
					return true; // L: 7222
				}

				if (ServerPacket.field3038 == var1.serverPacket) { // L: 7224
					WorldMapSprite.method4998(class262.field3016); // L: 7225
					var1.serverPacket = null; // L: 7226
					return true; // L: 7227
				}

				if (ServerPacket.field3058 == var1.serverPacket) { // L: 7229
					UserComparator4.updateNpcs(false, var3); // L: 7230
					var1.serverPacket = null; // L: 7231
					return true; // L: 7232
				}

				if (ServerPacket.field3113 == var1.serverPacket) { // L: 7234
					var65 = var3.readByte(); // L: 7235
					var22 = (long)var3.readUnsignedShort(); // L: 7236
					var24 = (long)var3.readMedium(); // L: 7237
					var26 = (var22 << 32) + var24; // L: 7238
					boolean var58 = false; // L: 7239
					ClanChannel var12 = var65 >= 0 ? currentClanChannels[var65] : class150.guestClanChannel; // L: 7240
					if (var12 == null) { // L: 7241
						var58 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) { // L: 7243
							if (crossWorldMessageIds[var13] == var26) { // L: 7244
								var58 = true; // L: 7245
								break; // L: 7246
							}
						}
					}

					if (!var58) { // L: 7250
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var26; // L: 7251
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 7252
						var40 = class134.method2904(var3); // L: 7253
						var14 = var65 >= 0 ? 43 : 46; // L: 7254
						SecureRandomFuture.addChatMessage(var14, "", var40, var12.name); // L: 7255
					}

					var1.serverPacket = null; // L: 7257
					return true; // L: 7258
				}

				if (ServerPacket.field3110 == var1.serverPacket) { // L: 7260
					var68 = var3.readBoolean(); // L: 7261
					if (var68) { // L: 7262
						if (UrlRequester.field1362 == null) { // L: 7263
							UrlRequester.field1362 = new class325();
						}
					} else {
						UrlRequester.field1362 = null; // L: 7265
					}

					var1.serverPacket = null; // L: 7266
					return true; // L: 7267
				}

				if (ServerPacket.field3088 == var1.serverPacket) { // L: 7269
					var51 = var3.readStringCp1252NullTerminated(); // L: 7270
					var5 = var3.method7786(); // L: 7271
					var74 = class140.getWidget(var5); // L: 7272
					if (!var51.equals(var74.text)) { // L: 7273
						var74.text = var51; // L: 7274
						ChatChannel.invalidateWidget(var74); // L: 7275
					}

					var1.serverPacket = null; // L: 7277
					return true; // L: 7278
				}

				if (ServerPacket.field3098 == var1.serverPacket) { // L: 7280
					return this.method1118(var1, 2); // L: 7281
				}

				if (ServerPacket.field3128 == var1.serverPacket) { // L: 7283
					World var50 = new World(); // L: 7284
					var50.host = var3.readStringCp1252NullTerminated(); // L: 7285
					var50.id = var3.readUnsignedShort(); // L: 7286
					var5 = var3.readInt(); // L: 7287
					var50.properties = var5; // L: 7288
					HealthBarUpdate.updateGameState(45); // L: 7289
					var2.close(); // L: 7290
					var2 = null; // L: 7291
					class295.changeWorld(var50); // L: 7292
					var1.serverPacket = null; // L: 7293
					return false; // L: 7294
				}

				if (ServerPacket.field3086 == var1.serverPacket) { // L: 7296
					return this.method1379(var1); // L: 7297
				}

				if (ServerPacket.field3096 == var1.serverPacket) { // L: 7299
					class339.privateChatMode = Ignored.method6780(var3.readUnsignedByte()); // L: 7300
					var1.serverPacket = null; // L: 7301
					return true; // L: 7302
				}

				if (ServerPacket.field3111 == var1.serverPacket) { // L: 7304
					GraphicsObject.method1870(); // L: 7305
					runEnergy = var3.readUnsignedByte(); // L: 7306
					field695 = cycleCntr; // L: 7307
					var1.serverPacket = null; // L: 7308
					return true; // L: 7309
				}

				if (ServerPacket.field3087 == var1.serverPacket) { // L: 7311
					var20 = var3.readShort(); // L: 7312
					var5 = var3.method7777(); // L: 7313
					var6 = var3.readInt(); // L: 7314
					var21 = class140.getWidget(var6); // L: 7315
					if (var5 != var21.rawX || var20 != var21.rawY || var21.xAlignment != 0 || var21.yAlignment != 0) { // L: 7316
						var21.rawX = var5; // L: 7317
						var21.rawY = var20; // L: 7318
						var21.xAlignment = 0; // L: 7319
						var21.yAlignment = 0; // L: 7320
						ChatChannel.invalidateWidget(var21); // L: 7321
						this.alignWidget(var21); // L: 7322
						if (var21.type == 0) { // L: 7323
							BufferedNetSocket.revalidateWidgetScroll(SoundCache.Widget_interfaceComponents[var6 >> 16], var21, false);
						}
					}

					var1.serverPacket = null; // L: 7325
					return true; // L: 7326
				}

				if (ServerPacket.field3065 == var1.serverPacket) { // L: 7328
					field692 = cycleCntr; // L: 7329
					var65 = var3.readByte(); // L: 7330
					class145 var76 = new class145(var3); // L: 7331
					ClanChannel var33;
					if (var65 >= 0) { // L: 7333
						var33 = currentClanChannels[var65];
					} else {
						var33 = class150.guestClanChannel; // L: 7334
					}

					var76.method3075(var33); // L: 7335
					var1.serverPacket = null; // L: 7336
					return true; // L: 7337
				}

				if (ServerPacket.field3053 == var1.serverPacket) { // L: 7339
					var20 = var3.readUnsignedShort(); // L: 7340
					var5 = var3.readUnsignedByte(); // L: 7341
					var6 = var3.readUnsignedShort(); // L: 7342
					SoundSystem.queueSoundEffect(var20, var5, var6); // L: 7343
					var1.serverPacket = null; // L: 7344
					return true; // L: 7345
				}

				GameObject var47;
				if (ServerPacket.field3048 == var1.serverPacket) { // L: 7347
					var65 = var3.readByte(); // L: 7348
					var34 = var3.readStringCp1252NullTerminated(); // L: 7349
					long var41 = (long)var3.readUnsignedShort(); // L: 7350
					long var43 = (long)var3.readMedium(); // L: 7351
					PlayerType var32 = (PlayerType)Actor.findEnumerated(SoundSystem.PlayerType_values(), var3.readUnsignedByte()); // L: 7352
					long var45 = (var41 << 32) + var43; // L: 7353
					boolean var61 = false; // L: 7354
					var47 = null; // L: 7355
					ClanChannel var93 = var65 >= 0 ? currentClanChannels[var65] : class150.guestClanChannel; // L: 7357
					if (var93 == null) { // L: 7358
						var61 = true; // L: 7359
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var32.isUser && Player.friendSystem.isIgnored(new Username(var34, HealthBarDefinition.loginType))) { // L: 7368 7369
									var61 = true;
								}
								break;
							}

							if (crossWorldMessageIds[var15] == var45) { // L: 7363
								var61 = true; // L: 7364
								break; // L: 7365
							}

							++var15; // L: 7362
						}
					}

					if (!var61) { // L: 7372
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var45; // L: 7373
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 7374
						var31 = AbstractFont.escapeBrackets(class134.method2904(var3)); // L: 7375
						var16 = var65 >= 0 ? 41 : 44; // L: 7376
						if (var32.modIcon != -1) { // L: 7377
							SecureRandomFuture.addChatMessage(var16, SecureRandomCallable.method2066(var32.modIcon) + var34, var31, var93.name);
						} else {
							SecureRandomFuture.addChatMessage(var16, var34, var31, var93.name); // L: 7378
						}
					}

					var1.serverPacket = null; // L: 7380
					return true; // L: 7381
				}

				if (ServerPacket.field3092 == var1.serverPacket) { // L: 7383
					var3.offset += 28; // L: 7384
					if (var3.checkCrc()) { // L: 7385
						WorldMapIcon_1.method4590(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 7386
					return true; // L: 7387
				}

				if (ServerPacket.field3133 == var1.serverPacket && isCameraLocked) { // L: 7389 7390
					field667 = true; // L: 7391
					PlayerComposition.field3346 = var3.readUnsignedByte(); // L: 7392
					UserComparator3.field1391 = var3.readUnsignedByte(); // L: 7393
					GameBuild.field3588 = var3.readUnsignedByte(); // L: 7394
					MidiPcmStream.field3231 = var3.readUnsignedByte(); // L: 7395

					for (var20 = 0; var20 < 5; ++var20) { // L: 7396
						field743[var20] = false;
					}

					var1.serverPacket = null; // L: 7397
					return true; // L: 7398
				}

				if (ServerPacket.field3104 == var1.serverPacket) { // L: 7401
					var9 = var3.method7765(); // L: 7412
					var10 = var9 >> 2; // L: 7413
					var11 = var9 & 3; // L: 7414
					var36 = field582[var10]; // L: 7415
					var13 = var3.method7776(); // L: 7416
					var6 = var3.method7780(); // L: 7417
					var20 = var6 >> 16; // L: 7418
					var5 = var6 >> 8 & 255; // L: 7419
					var7 = var20 + (var6 >> 4 & 7); // L: 7420
					var8 = var5 + (var6 & 7); // L: 7421
					if (var7 >= 0 && var8 >= 0 && var7 < 103 && var8 < 103) { // L: 7422
						if (var36 == 0) { // L: 7423
							BoundaryObject var92 = class356.scene.method4333(PacketWriter.Client_plane, var7, var8); // L: 7424
							if (var92 != null) { // L: 7425
								var15 = Decimator.Entity_unpackID(var92.tag); // L: 7426
								if (var10 == 2) { // L: 7427
									var92.renderable1 = new DynamicObject(var15, 2, var11 + 4, PacketWriter.Client_plane, var7, var8, var13, false, var92.renderable1); // L: 7428
									var92.renderable2 = new DynamicObject(var15, 2, var11 + 1 & 3, PacketWriter.Client_plane, var7, var8, var13, false, var92.renderable2); // L: 7429
								} else {
									var92.renderable1 = new DynamicObject(var15, var10, var11, PacketWriter.Client_plane, var7, var8, var13, false, var92.renderable1); // L: 7431
								}
							}
						} else if (var36 == 1) { // L: 7434
							WallDecoration var91 = class356.scene.method4178(PacketWriter.Client_plane, var7, var8); // L: 7435
							if (var91 != null) { // L: 7436
								var15 = Decimator.Entity_unpackID(var91.tag); // L: 7437
								if (var10 != 4 && var10 != 5) { // L: 7438
									if (var10 == 6) { // L: 7441
										var91.renderable1 = new DynamicObject(var15, 4, var11 + 4, PacketWriter.Client_plane, var7, var8, var13, false, var91.renderable1); // L: 7442
									} else if (var10 == 7) { // L: 7444
										var91.renderable1 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, PacketWriter.Client_plane, var7, var8, var13, false, var91.renderable1); // L: 7445
									} else if (var10 == 8) { // L: 7447
										var91.renderable1 = new DynamicObject(var15, 4, var11 + 4, PacketWriter.Client_plane, var7, var8, var13, false, var91.renderable1); // L: 7448
										var91.renderable2 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, PacketWriter.Client_plane, var7, var8, var13, false, var91.renderable2); // L: 7449
									}
								} else {
									var91.renderable1 = new DynamicObject(var15, 4, var11, PacketWriter.Client_plane, var7, var8, var13, false, var91.renderable1); // L: 7439
								}
							}
						} else if (var36 == 2) { // L: 7453
							var47 = class356.scene.getGameObject(PacketWriter.Client_plane, var7, var8); // L: 7454
							if (var10 == 11) { // L: 7455
								var10 = 10; // L: 7456
							}

							if (var47 != null) { // L: 7458
								var47.renderable = new DynamicObject(Decimator.Entity_unpackID(var47.tag), var10, var11, PacketWriter.Client_plane, var7, var8, var13, false, var47.renderable); // L: 7459
							}
						} else if (var36 == 3) { // L: 7462
							FloorDecoration var90 = class356.scene.getFloorDecoration(PacketWriter.Client_plane, var7, var8); // L: 7463
							if (var90 != null) { // L: 7464
								var90.renderable = new DynamicObject(Decimator.Entity_unpackID(var90.tag), 22, var11, PacketWriter.Client_plane, var7, var8, var13, false, var90.renderable); // L: 7465
							}
						}
					}

					var1.serverPacket = null; // L: 7469
					return true; // L: 7470
				}

				class249.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id * 1936739439 * -1523412337 : -1) + "," + (var1.field1347 != null ? var1.field1347.id * 1936739439 * -1523412337 : -1) + "," + (var1.field1352 != null ? var1.field1352.id * 1936739439 * -1523412337 : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 7472
				MouseRecorder.logOut(); // L: 7473
			} catch (IOException var48) { // L: 7475
				class131.method2877(); // L: 7476
			} catch (Exception var49) {
				var34 = "" + (var1.serverPacket != null ? var1.serverPacket.id * 1936739439 * -1523412337 : -1) + "," + (var1.field1347 != null ? var1.field1347.id * 1936739439 * -1523412337 : -1) + "," + (var1.field1352 != null ? var1.field1352.id * 1936739439 * -1523412337 : -1) + "," + var1.serverPacketLength + "," + (class101.localPlayer.pathX[0] + class28.baseX) + "," + (class101.localPlayer.pathY[0] + WorldMapLabelSize.baseY) + ","; // L: 7479

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) { // L: 7480
					var34 = var34 + var3.array[var6] + ",";
				}

				class249.RunException_sendStackTrace(var34, var49); // L: 7481
				MouseRecorder.logOut(); // L: 7482
			}

			return true; // L: 7484
		}
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "124880432"
	)
	@Export("menu")
	final void menu() {
		boolean var1 = false; // L: 8504

		int var2;
		int var5;
		while (!var1) { // L: 8505
			var1 = true; // L: 8506

			for (var2 = 0; var2 < menuOptionsCount - 1; ++var2) { // L: 8507
				if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) { // L: 8508
					String var18 = menuTargets[var2]; // L: 8509
					menuTargets[var2] = menuTargets[var2 + 1]; // L: 8510
					menuTargets[var2 + 1] = var18; // L: 8511
					String var19 = menuActions[var2]; // L: 8512
					menuActions[var2] = menuActions[var2 + 1]; // L: 8513
					menuActions[var2 + 1] = var19; // L: 8514
					var5 = menuOpcodes[var2]; // L: 8515
					menuOpcodes[var2] = menuOpcodes[var2 + 1]; // L: 8516
					menuOpcodes[var2 + 1] = var5; // L: 8517
					var5 = menuArguments1[var2]; // L: 8518
					menuArguments1[var2] = menuArguments1[var2 + 1]; // L: 8519
					menuArguments1[var2 + 1] = var5; // L: 8520
					var5 = menuArguments2[var2]; // L: 8521
					menuArguments2[var2] = menuArguments2[var2 + 1]; // L: 8522
					menuArguments2[var2 + 1] = var5; // L: 8523
					var5 = menuIdentifiers[var2]; // L: 8524
					menuIdentifiers[var2] = menuIdentifiers[var2 + 1]; // L: 8525
					menuIdentifiers[var2 + 1] = var5; // L: 8526
					boolean var14 = menuShiftClick[var2]; // L: 8527
					menuShiftClick[var2] = menuShiftClick[var2 + 1]; // L: 8528
					menuShiftClick[var2 + 1] = var14; // L: 8529
					var1 = false; // L: 8530
				}
			}
		}

		if (Interpreter.dragInventoryWidget == null) { // L: 8535
			if (clickedWidget == null) { // L: 8536
				int var20 = MouseHandler.MouseHandler_lastButton; // L: 8537
				int var3;
				int var4;
				int var8;
				int var10;
				int var23;
				if (isMenuOpen) { // L: 8538
					int var21;
					if (var20 != 1 && (class122.mouseCam || var20 != 4)) { // L: 8539
						var2 = MouseHandler.MouseHandler_x; // L: 8540
						var3 = MouseHandler.MouseHandler_y; // L: 8541
						if (var2 < UserComparator3.menuX - 10 || var2 > Language.menuWidth + UserComparator3.menuX + 10 || var3 < ViewportMouse.menuY - 10 || var3 > Player.menuHeight + ViewportMouse.menuY + 10) { // L: 8542
							isMenuOpen = false; // L: 8543
							var4 = UserComparator3.menuX; // L: 8544
							var5 = ViewportMouse.menuY; // L: 8545
							var23 = Language.menuWidth; // L: 8546
							var21 = Player.menuHeight; // L: 8547

							for (var8 = 0; var8 < rootWidgetCount; ++var8) { // L: 8549
								if (rootWidgetXs[var8] + rootWidgetWidths[var8] > var4 && rootWidgetXs[var8] < var4 + var23 && rootWidgetYs[var8] + rootWidgetHeights[var8] > var5 && rootWidgetYs[var8] < var21 + var5) { // L: 8550
									field703[var8] = true;
								}
							}
						}
					}

					if (var20 == 1 || !class122.mouseCam && var20 == 4) { // L: 8555
						var2 = UserComparator3.menuX; // L: 8556
						var3 = ViewportMouse.menuY; // L: 8557
						var4 = Language.menuWidth; // L: 8558
						var5 = MouseHandler.MouseHandler_lastPressedX; // L: 8559
						var23 = MouseHandler.MouseHandler_lastPressedY; // L: 8560
						var21 = -1; // L: 8561

						int var22;
						for (var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 8562
							var22 = (menuOptionsCount - 1 - var8) * 15 + var3 + 31; // L: 8563
							if (var5 > var2 && var5 < var2 + var4 && var23 > var22 - 13 && var23 < var22 + 3) { // L: 8564
								var21 = var8;
							}
						}

						int var11;
						if (var21 != -1 && var21 >= 0) { // L: 8566 8567
							var8 = menuArguments1[var21]; // L: 8568
							var22 = menuArguments2[var21]; // L: 8569
							var10 = menuOpcodes[var21]; // L: 8570
							var11 = menuIdentifiers[var21]; // L: 8571
							String var12 = menuActions[var21]; // L: 8572
							String var13 = menuTargets[var21]; // L: 8573
							FriendsList.menuAction(var8, var22, var10, var11, var12, var13, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 8574
						}

						isMenuOpen = false; // L: 8576
						var8 = UserComparator3.menuX; // L: 8577
						var22 = ViewportMouse.menuY; // L: 8578
						var10 = Language.menuWidth; // L: 8579
						var11 = Player.menuHeight; // L: 8580

						for (int var17 = 0; var17 < rootWidgetCount; ++var17) { // L: 8582
							if (rootWidgetXs[var17] + rootWidgetWidths[var17] > var8 && rootWidgetXs[var17] < var10 + var8 && rootWidgetYs[var17] + rootWidgetHeights[var17] > var22 && rootWidgetYs[var17] < var11 + var22) { // L: 8583
								field703[var17] = true;
							}
						}
					}
				} else {
					var2 = class240.method5005(); // L: 8589
					if ((var20 == 1 || !class122.mouseCam && var20 == 4) && var2 >= 0) { // L: 8590
						var3 = menuOpcodes[var2]; // L: 8591
						if (var3 == 39 || var3 == 40 || var3 == 41 || var3 == 42 || var3 == 43 || var3 == 33 || var3 == 34 || var3 == 35 || var3 == 36 || var3 == 37 || var3 == 38 || var3 == 1005) { // L: 8592
							label310: {
								var4 = menuArguments1[var2]; // L: 8593
								var5 = menuArguments2[var2]; // L: 8594
								Widget var6 = class140.getWidget(var5); // L: 8595
								var8 = class124.getWidgetFlags(var6); // L: 8597
								boolean var7 = (var8 >> 28 & 1) != 0; // L: 8599
								if (!var7) { // L: 8602
									var10 = class124.getWidgetFlags(var6); // L: 8604
									boolean var9 = (var10 >> 29 & 1) != 0; // L: 8606
									if (!var9) { // L: 8608
										break label310;
									}
								}

								if (Interpreter.dragInventoryWidget != null && !field705 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) { // L: 8610 8611
									CollisionMap.method3906(draggedWidgetX, draggedWidgetY); // L: 8612
								}

								field705 = false; // L: 8615
								itemDragDuration = 0; // L: 8616
								if (Interpreter.dragInventoryWidget != null) { // L: 8617
									ChatChannel.invalidateWidget(Interpreter.dragInventoryWidget);
								}

								Interpreter.dragInventoryWidget = class140.getWidget(var5); // L: 8618
								dragItemSlotSource = var4; // L: 8619
								draggedWidgetX = MouseHandler.MouseHandler_lastPressedX; // L: 8620
								draggedWidgetY = MouseHandler.MouseHandler_lastPressedY; // L: 8621
								if (var2 >= 0) { // L: 8622
									WorldMapLabelSize.method4566(var2);
								}

								ChatChannel.invalidateWidget(Interpreter.dragInventoryWidget); // L: 8623
								return; // L: 8624
							}
						}
					}

					if ((var20 == 1 || !class122.mouseCam && var20 == 4) && this.shouldLeftClickOpenMenu()) { // L: 8628 8629
						var20 = 2; // L: 8630
					}

					if ((var20 == 1 || !class122.mouseCam && var20 == 4) && menuOptionsCount > 0 && var2 >= 0) { // L: 8633 8635
						var3 = menuArguments1[var2]; // L: 8636
						var4 = menuArguments2[var2]; // L: 8637
						var5 = menuOpcodes[var2]; // L: 8638
						var23 = menuIdentifiers[var2]; // L: 8639
						String var15 = menuActions[var2]; // L: 8640
						String var16 = menuTargets[var2]; // L: 8641
						FriendsList.menuAction(var3, var4, var5, var23, var15, var16, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 8642
					}

					if (var20 == 2 && menuOptionsCount > 0) { // L: 8645
						this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}
				}

			}
		}
	} // L: 8647

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1842905867"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = class240.method5005(); // L: 8650
		return (leftClickOpensMenu == 1 && menuOptionsCount > 2 || VarpDefinition.method3373(var1)) && !menuShiftClick[var1]; // L: 8651
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1919809935"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		UserComparator8.method2571(var1, var2); // L: 8655
		var1 -= viewportOffsetX; // L: 8656
		var2 -= viewportOffsetY; // L: 8657
		class356.scene.menuOpen(PacketWriter.Client_plane, var1, var2, false); // L: 8658
		isMenuOpen = true; // L: 8659
	} // L: 8660

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "105"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		int var2 = rootInterface; // L: 10627
		int var3 = Script.canvasWidth; // L: 10628
		int var4 = class78.canvasHeight; // L: 10629
		if (WorldMapSection2.loadInterface(var2)) { // L: 10631
			class118.resizeInterface(SoundCache.Widget_interfaceComponents[var2], -1, var3, var4, var1); // L: 10632
		}

	} // L: 10634

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(Lkb;B)V",
		garbageValue = "93"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : class140.getWidget(var1.parentId); // L: 10637
		int var3;
		int var4;
		if (var2 == null) { // L: 10640
			var3 = Script.canvasWidth; // L: 10641
			var4 = class78.canvasHeight; // L: 10642
		} else {
			var3 = var2.width; // L: 10645
			var4 = var2.height; // L: 10646
		}

		Decimator.alignWidgetSize(var1, var3, var4, false); // L: 10648
		class240.alignWidgetPosition(var1, var3, var4); // L: 10649
	} // L: 10650

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1883142675"
	)
	final void method1511() {
		ChatChannel.invalidateWidget(clickedWidget); // L: 11646
		++Timer.widgetDragDuration; // L: 11647
		if (field675 && field767) { // L: 11648
			int var1 = MouseHandler.MouseHandler_x; // L: 11657
			int var2 = MouseHandler.MouseHandler_y; // L: 11658
			var1 -= widgetClickX; // L: 11659
			var2 -= widgetClickY; // L: 11660
			if (var1 < field664) { // L: 11661
				var1 = field664;
			}

			if (var1 + clickedWidget.width > field664 + clickedWidgetParent.width) { // L: 11662
				var1 = field664 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field550) { // L: 11663
				var2 = field550;
			}

			if (var2 + clickedWidget.height > field550 + clickedWidgetParent.height) { // L: 11664
				var2 = field550 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field775; // L: 11665
			int var4 = var2 - field677; // L: 11666
			int var5 = clickedWidget.dragZoneSize; // L: 11667
			if (Timer.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 11668 11669
				isDraggingWidget = true; // L: 11670
			}

			int var6 = var1 - field664 + clickedWidgetParent.scrollX; // L: 11673
			int var7 = var2 - field550 + clickedWidgetParent.scrollY; // L: 11674
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 11675
				var8 = new ScriptEvent(); // L: 11676
				var8.widget = clickedWidget; // L: 11677
				var8.mouseX = var6; // L: 11678
				var8.mouseY = var7; // L: 11679
				var8.args = clickedWidget.onDrag; // L: 11680
				BoundaryObject.runScriptEvent(var8); // L: 11681
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 11683
				if (isDraggingWidget) { // L: 11684
					if (clickedWidget.onDragComplete != null) { // L: 11685
						var8 = new ScriptEvent(); // L: 11686
						var8.widget = clickedWidget; // L: 11687
						var8.mouseX = var6; // L: 11688
						var8.mouseY = var7; // L: 11689
						var8.dragTarget = draggedOnWidget; // L: 11690
						var8.args = clickedWidget.onDragComplete; // L: 11691
						BoundaryObject.runScriptEvent(var8); // L: 11692
					}

					if (draggedOnWidget != null && UserComparator10.method2610(clickedWidget) != null) { // L: 11694
						PacketBufferNode var9 = EnumComposition.getPacketBufferNode(ClientPacket.field2912, packetWriter.isaacCipher); // L: 11696
						var9.packetBuffer.method7784(clickedWidget.id); // L: 11697
						var9.packetBuffer.method7863(clickedWidget.childIndex); // L: 11698
						var9.packetBuffer.method7760(draggedOnWidget.id); // L: 11699
						var9.packetBuffer.writeIntME(draggedOnWidget.childIndex); // L: 11700
						var9.packetBuffer.method7929(clickedWidget.itemId); // L: 11701
						var9.packetBuffer.writeIntME(draggedOnWidget.itemId); // L: 11702
						packetWriter.addNode(var9); // L: 11703
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 11707
					this.openMenu(field775 + widgetClickX, widgetClickY + field677); // L: 11708
				} else if (menuOptionsCount > 0) { // L: 11710
					CollisionMap.method3906(field775 + widgetClickX, widgetClickY + field677); // L: 11711
				}

				clickedWidget = null; // L: 11714
			}

		} else {
			if (Timer.widgetDragDuration > 1) { // L: 11649
				if (!isDraggingWidget && menuOptionsCount > 0) { // L: 11650
					CollisionMap.method3906(widgetClickX + field775, widgetClickY + field677); // L: 11651
				}

				clickedWidget = null; // L: 11653
			}

		}
	} // L: 11655 11716

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(I)Lqa;",
		garbageValue = "1509373240"
	)
	@Export("username")
	public Username username() {
		return class101.localPlayer != null ? class101.localPlayer.username : null; // L: 12410
	}

	public final void init() {
		try {
			if (this.checkHost()) { // L: 739
				for (int var1 = 0; var1 <= 28; ++var1) { // L: 740
					String var2 = this.getParameter(Integer.toString(var1)); // L: 741
					if (var2 != null) { // L: 742
						int var4;
						switch(var1) { // L: 743
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 840
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 841
							}
							break;
						case 4:
							if (clientType == -1) { // L: 772
								clientType = Integer.parseInt(var2); // L: 773
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 757
							break; // L: 758
						case 6:
							var4 = Integer.parseInt(var2); // L: 812
							Language var13;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) { // L: 814
								var13 = Language.Language_valuesOrdered[var4]; // L: 818
							} else {
								var13 = null; // L: 815
							}

							class134.clientLanguage = var13; // L: 820
							break; // L: 821
						case 7:
							var4 = Integer.parseInt(var2); // L: 785
							GameBuild[] var5 = MusicPatch.method5433(); // L: 788
							int var6 = 0;

							GameBuild var12;
							while (true) {
								if (var6 >= var5.length) {
									var12 = null; // L: 799
									break;
								}

								GameBuild var7 = var5[var6]; // L: 790
								if (var4 == var7.buildId) { // L: 792
									var12 = var7; // L: 793
									break; // L: 794
								}

								++var6; // L: 789
							}

							Players.field1305 = var12; // L: 801
							break; // L: 802
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 846
							}
							break;
						case 9:
							GrandExchangeOfferTotalQuantityComparator.field4045 = var2; // L: 830
							break; // L: 831
						case 10:
							StudioGame[] var3 = new StudioGame[]{StudioGame.game3, StudioGame.game4, StudioGame.stellardawn, StudioGame.oldscape, StudioGame.game5, StudioGame.runescape}; // L: 748
							class285.field3313 = (StudioGame)Actor.findEnumerated(var3, Integer.parseInt(var2)); // L: 750
							if (class285.field3313 == StudioGame.oldscape) { // L: 751
								HealthBarDefinition.loginType = LoginType.oldscape;
							} else {
								HealthBarDefinition.loginType = LoginType.field4620; // L: 752
							}
							break;
						case 11:
							UserComparator5.field1387 = var2; // L: 779
							break; // L: 780
						case 12:
							worldId = Integer.parseInt(var2); // L: 825
						case 13:
						case 16:
						case 18:
						case 19:
						case 20:
						default:
							break;
						case 14:
							class17.field99 = Integer.parseInt(var2); // L: 762
							break; // L: 763
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 767
							break; // L: 768
						case 17:
							field481 = var2; // L: 835
							break; // L: 836
						case 21:
							field482 = Integer.parseInt(var2); // L: 806
						}
					}
				}

				SecureRandomFuture.method1967(); // L: 853
				StructComposition.worldHost = this.getCodeBase().getHost(); // L: 854
				String var8 = Players.field1305.name; // L: 855
				byte var9 = 0; // L: 856

				try {
					class117.method2727("oldschool", var8, var9, 22); // L: 858
				} catch (Exception var10) { // L: 860
					class249.RunException_sendStackTrace((String)null, var10); // L: 861
				}

				class353.client = this; // L: 863
				class20.clientType = clientType; // L: 864
				if (field484 == -1) { // L: 865
					field484 = 0; // L: 866
				}

				class21.field122 = System.getenv("JX_ACCESS_TOKEN"); // L: 868
				VarcInt.field1851 = System.getenv("JX_REFRESH_TOKEN"); // L: 869
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) { // L: 870
					this.field523 = true; // L: 871
				}

				this.startThread(765, 503, 206, 1); // L: 873
			}
		} catch (RuntimeException var11) {
			throw MilliClock.newRunException(var11, "client.init(" + ')');
		}
	} // L: 874

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) { // L: 884
			this.field733 = var1; // L: 887
			WorldMapData_1.method4872(10); // L: 888
		}
	} // L: 885 889

	public boolean isOnLoginScreen() {
		return gameState == 10; // L: 903
	}

	public long getAccountHash() {
		return this.field707; // L: 908
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) { // L: 894
			this.field673 = var1; // L: 897
		}
	} // L: 895 898

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZB)I",
		garbageValue = "-92"
	)
	static int method1177(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) { // L: 2720
			if (HealthBar.guestClanSettings != null) { // L: 2721
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 1; // L: 2722
				WorldMapID.field2842 = HealthBar.guestClanSettings; // L: 2723
			} else {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 2725
			}

			return 1; // L: 2726
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) { // L: 2728
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2729
				if (currentClanSettings[var3] != null) { // L: 2730
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 1; // L: 2731
					WorldMapID.field2842 = currentClanSettings[var3]; // L: 2732
				} else {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 2734
				}

				return 1; // L: 2735
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) { // L: 2737
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapID.field2842.name; // L: 2738
				return 1; // L: 2739
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) { // L: 2741
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.field2842.allowGuests ? 1 : 0; // L: 2742
				return 1; // L: 2743
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) { // L: 2745
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.field2842.field1637; // L: 2746
				return 1; // L: 2747
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) { // L: 2749
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.field2842.field1633; // L: 2750
				return 1; // L: 2751
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) { // L: 2753
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.field2842.field1634; // L: 2754
				return 1; // L: 2755
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) { // L: 2757
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.field2842.field1645; // L: 2758
				return 1; // L: 2759
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) { // L: 2761
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.field2842.memberCount; // L: 2762
				return 1; // L: 2763
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) { // L: 2765
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2766
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapID.field2842.memberNames[var3]; // L: 2767
				return 1; // L: 2768
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) { // L: 2770
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2771
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.field2842.memberRanks[var3]; // L: 2772
				return 1; // L: 2773
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) { // L: 2775
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.field2842.bannedMemberCount; // L: 2776
				return 1; // L: 2777
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) { // L: 2779
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2780
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapID.field2842.bannedMemberNames[var3]; // L: 2781
				return 1; // L: 2782
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) { // L: 2784
					class446.Interpreter_intStackSize -= 3; // L: 2785
					var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 2786
					var6 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 2787
					var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2]; // L: 2788
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.field2842.method2972(var3, var6, var5); // L: 2789
					return 1; // L: 2790
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) { // L: 2792
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.field2842.currentOwner; // L: 2793
					return 1; // L: 2794
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) { // L: 2796
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.field2842.field1644; // L: 2797
					return 1; // L: 2798
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) { // L: 2800
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.field2842.method2991(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 2801
					return 1; // L: 2802
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) { // L: 2804
					Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize - 1] = WorldMapID.field2842.getSortedMembers()[Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize - 1]]; // L: 2805
					return 1; // L: 2806
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) { // L: 2808
					class446.Interpreter_intStackSize -= 2; // L: 2809
					var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 2810
					var6 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 2811
					ServerPacket.method5209(var6, var3); // L: 2812
					return 1; // L: 2813
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) { // L: 2815
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2816
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.field2842.field1649[var3]; // L: 2817
					return 1; // L: 2818
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) { // L: 2820
						class446.Interpreter_intStackSize -= 3; // L: 2821
						var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 2822
						boolean var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1] == 1; // L: 2823
						var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2]; // L: 2824
						SceneTilePaint.method4530(var5, var3, var4); // L: 2825
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) { // L: 2827
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2828
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.field2842.field1642[var3] ? 1 : 0; // L: 2829
						return 1; // L: 2830
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) { // L: 2832
						if (class150.guestClanChannel != null) { // L: 2833
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 1; // L: 2834
							UserComparator5.field1386 = class150.guestClanChannel; // L: 2835
						} else {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 2837
						}

						return 1; // L: 2838
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) { // L: 2840
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2841
						if (currentClanChannels[var3] != null) { // L: 2842
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 1; // L: 2843
							UserComparator5.field1386 = currentClanChannels[var3]; // L: 2844
							Interpreter.field838 = var3; // L: 2845
						} else {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 2847
						}

						return 1; // L: 2848
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) { // L: 2850
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = UserComparator5.field1386.name; // L: 2851
						return 1; // L: 2852
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) { // L: 2854
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = UserComparator5.field1386.field1696; // L: 2855
						return 1; // L: 2856
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) { // L: 2858
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = UserComparator5.field1386.field1695; // L: 2859
						return 1; // L: 2860
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) { // L: 2862
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = UserComparator5.field1386.method3113(); // L: 2863
						return 1; // L: 2864
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) { // L: 2866
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2867
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ((ClanChannelMember)UserComparator5.field1386.members.get(var3)).username.getName(); // L: 2868
						return 1; // L: 2869
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) { // L: 2871
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2872
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = ((ClanChannelMember)UserComparator5.field1386.members.get(var3)).rank; // L: 2873
						return 1; // L: 2874
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) { // L: 2876
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2877
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = ((ClanChannelMember)UserComparator5.field1386.members.get(var3)).world; // L: 2878
						return 1; // L: 2879
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) { // L: 2881
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2882
						ApproximateRouteStrategy.method1086(Interpreter.field838, var3); // L: 2883
						return 1; // L: 2884
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) { // L: 2886
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = UserComparator5.field1386.method3102(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 2887
						return 1; // L: 2888
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) { // L: 2890
						Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize - 1] = UserComparator5.field1386.getSortedMembers()[Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize - 1]]; // L: 2891
						return 1; // L: 2892
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) { // L: 2894
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = FontName.field4584 != null ? 1 : 0; // L: 2895
						return 1; // L: 2896
					} else {
						return 2; // L: 2898
					}
				}
			}
		}
	}
}
