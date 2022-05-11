import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.Future;
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
	@ObfuscatedName("rk")
	@ObfuscatedSignature(
		descriptor = "[Lek;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("un")
	@ObfuscatedGetter(
		intValue = 127608033
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("up")
	@ObfuscatedGetter(
		intValue = 332427901
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("uz")
	@ObfuscatedGetter(
		intValue = 734962691
	)
	public static int field767;
	@ObfuscatedName("si")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("vu")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	static final ApproximateRouteStrategy field771;
	@ObfuscatedName("vk")
	static int[] field772;
	@ObfuscatedName("vl")
	static int[] field773;
	@ObfuscatedName("rq")
	@ObfuscatedGetter(
		intValue = -1537020861
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("sq")
	@ObfuscatedGetter(
		intValue = -512520213
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("uc")
	@ObfuscatedGetter(
		intValue = 2034802331
	)
	static int field602;
	@ObfuscatedName("uv")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("sf")
	@ObfuscatedGetter(
		intValue = 438457609
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("ur")
	@ObfuscatedGetter(
		intValue = -125837253
	)
	static int field763;
	@ObfuscatedName("so")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("sv")
	@ObfuscatedGetter(
		intValue = -1463523237
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("th")
	static boolean[] field743;
	@ObfuscatedName("rw")
	@ObfuscatedGetter(
		intValue = 1443023427
	)
	static int field515;
	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "[Let;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("ti")
	static boolean field742;
	@ObfuscatedName("ri")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("rj")
	@ObfuscatedGetter(
		intValue = 1619055061
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("rm")
	@ObfuscatedGetter(
		longValue = -2855623584539877235L
	)
	static long field722;
	@ObfuscatedName("uh")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("vp")
	@ObfuscatedGetter(
		intValue = 430177943
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("sz")
	@ObfuscatedGetter(
		intValue = -2066946189
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("sa")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("td")
	static short field748;
	@ObfuscatedName("ty")
	static short field749;
	@ObfuscatedName("se")
	@ObfuscatedSignature(
		descriptor = "[Lau;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("ug")
	static short field656;
	@ObfuscatedName("sn")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("uj")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("uk")
	static short field755;
	@ObfuscatedName("tt")
	static short field753;
	@ObfuscatedName("sy")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("ry")
	@ObfuscatedGetter(
		intValue = 1318674061
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("st")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("ua")
	@ObfuscatedGetter(
		intValue = 1333373151
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("tz")
	static short field752;
	@ObfuscatedName("rf")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("uu")
	@ObfuscatedGetter(
		intValue = 731924017
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("us")
	@ObfuscatedGetter(
		intValue = -1035456419
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("rl")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("rs")
	@ObfuscatedSignature(
		descriptor = "[Lqr;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("tf")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("tw")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		intValue = -509945839
	)
	static int field719;
	@ObfuscatedName("tx")
	static int[] field745;
	@ObfuscatedName("rp")
	static int[] field721;
	@ObfuscatedName("vc")
	@ObfuscatedGetter(
		intValue = 1709573475
	)
	static int field770;
	@ObfuscatedName("rn")
	static int[] field720;
	@ObfuscatedName("tg")
	static int[] field744;
	@ObfuscatedName("tp")
	static int[] field714;
	@ObfuscatedName("tv")
	static int[] field677;
	@ObfuscatedName("ux")
	@ObfuscatedSignature(
		descriptor = "[Lly;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("rz")
	static int[] field769;
	@ObfuscatedName("ru")
	@ObfuscatedGetter(
		intValue = -1427601113
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("rt")
	@ObfuscatedGetter(
		intValue = -1897700155
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("rd")
	static String field549;
	@ObfuscatedName("uy")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lgh;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("at")
	static boolean field659;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1278418291
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1944187969
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -792348705
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bl")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bs")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("bj")
	static String field662;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -217293771
	)
	static int field484;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 499498919
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -965368167
	)
	static int field486;
	@ObfuscatedName("bt")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 1544003447
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("cp")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 469489167
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		longValue = -7486676481103711511L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = -1940299159
	)
	static int field492;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 1700797465
	)
	static int field681;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		longValue = 4238643244622265373L
	)
	static long field494;
	@ObfuscatedName("dx")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 2094140741
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 1533095709
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 327943909
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -1320763851
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -48902629
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 618879367
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -523368967
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 554007097
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -741189791
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -1074005895
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = -1048838289
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = -732279823
	)
	static int field625;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("eu")
	@ObfuscatedGetter(
		intValue = 186266927
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = -1220447691
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("fs")
	@ObfuscatedGetter(
		intValue = 2023084757
	)
	static int field626;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = -70601535
	)
	static int field514;
	@ObfuscatedName("fy")
	@ObfuscatedGetter(
		intValue = -30088535
	)
	static int field654;
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	static class124 field615;
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	static class443 field517;
	@ObfuscatedName("fk")
	static final String field526;
	@ObfuscatedName("gp")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("gy")
	@Export("secureRandom")
	static SecureRandom secureRandom;
	@ObfuscatedName("gd")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "[Lcd;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = 1947856981
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("gu")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = 1608740447
	)
	static int field565;
	@ObfuscatedName("gr")
	static int[] field601;
	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("gg")
	@ObfuscatedGetter(
		intValue = 1726076607
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("gt")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("hy")
	@Export("useBufferedSocket")
	static boolean useBufferedSocket;
	@ObfuscatedName("ht")
	static boolean field493;
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("hc")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("hb")
	@ObfuscatedGetter(
		intValue = -1668545791
	)
	static int field545;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = 689366699
	)
	static int field546;
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = -262177223
	)
	static int field570;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		intValue = 1267729281
	)
	static int field548;
	@ObfuscatedName("hp")
	@ObfuscatedGetter(
		intValue = 1293908739
	)
	static int field597;
	@ObfuscatedName("ig")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("iy")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("ip")
	static final int[] field553;
	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = -1672744051
	)
	static int field727;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = 1810344519
	)
	static int field555;
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		intValue = -780915989
	)
	static int field556;
	@ObfuscatedName("il")
	@ObfuscatedGetter(
		intValue = -1243173565
	)
	static int field640;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = -1989374159
	)
	static int field483;
	@ObfuscatedName("io")
	static boolean field559;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = -684171709
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("ju")
	@ObfuscatedGetter(
		intValue = 1197895497
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = 1252457677
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = -1755070001
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = -1679026773
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = -906562689
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = -1720159471
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("jw")
	@ObfuscatedGetter(
		intValue = 335114329
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = -314035411
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("ji")
	@ObfuscatedGetter(
		intValue = 1232038605
	)
	static int field569;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = 1950209385
	)
	static int field567;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = 1023354667
	)
	static int field571;
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = 208832309
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("jz")
	@ObfuscatedGetter(
		intValue = -175885413
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = -1673751255
	)
	static int field482;
	@ObfuscatedName("kf")
	static boolean field575;
	@ObfuscatedName("ka")
	@ObfuscatedGetter(
		intValue = -270296809
	)
	static int field576;
	@ObfuscatedName("kn")
	static boolean field557;
	@ObfuscatedName("kd")
	@ObfuscatedGetter(
		intValue = -2076113975
	)
	static int field578;
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		intValue = 483768037
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("kk")
	@ObfuscatedGetter(
		intValue = 1581123849
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("kp")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("kl")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("ki")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("kv")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("ks")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("kw")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("kj")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("kb")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("kc")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("kr")
	@ObfuscatedGetter(
		intValue = 1351448589
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = 1803325213
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = 807038053
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("ke")
	@ObfuscatedGetter(
		intValue = 47728385
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("kz")
	@ObfuscatedGetter(
		intValue = 2041470719
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("ku")
	@ObfuscatedGetter(
		intValue = -1687090233
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = 379603381
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("kq")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("kg")
	@ObfuscatedGetter(
		intValue = -759271611
	)
	static int field598;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = 1437033155
	)
	static int field599;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = -294428911
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = -1303003277
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("lc")
	@ObfuscatedGetter(
		intValue = -813690107
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = 637964015
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("ld")
	static boolean field604;
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = -1631862171
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = -1891907085
	)
	static int field606;
	@ObfuscatedName("lj")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "[Lca;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = -1171887655
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = 770928633
	)
	static int field610;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		longValue = 3707872763962830187L
	)
	static long field611;
	@ObfuscatedName("lq")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = -154688775
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = -1065459261
	)
	static int field621;
	@ObfuscatedName("lm")
	static int[] field616;
	@ObfuscatedName("ma")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("mi")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("ms")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("ml")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = -599570105
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "[[[Llv;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("mr")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("mx")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("mo")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		intValue = 2040476069
	)
	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("mp")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = 942781313
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("my")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("mc")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("mz")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("mh")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("mw")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("nd")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("nj")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("na")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("nn")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("nr")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("nm")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("nb")
	@ObfuscatedGetter(
		intValue = -967949353
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("ng")
	@ObfuscatedGetter(
		intValue = 1936177467
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("nq")
	@ObfuscatedGetter(
		intValue = -1234203737
	)
	static int field645;
	@ObfuscatedName("nf")
	@ObfuscatedGetter(
		intValue = -690580105
	)
	static int field702;
	@ObfuscatedName("ni")
	@ObfuscatedGetter(
		intValue = -1712799689
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("no")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("ny")
	@ObfuscatedGetter(
		intValue = 1489754623
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("nu")
	@ObfuscatedGetter(
		intValue = 1640085877
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("nk")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("nv")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("nh")
	@ObfuscatedGetter(
		intValue = -628280401
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = -381412093
	)
	static int field487;
	@ObfuscatedName("ow")
	@ObfuscatedGetter(
		intValue = -1385659211
	)
	static int field657;
	@ObfuscatedName("ou")
	@ObfuscatedGetter(
		intValue = 1129390483
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("ol")
	@ObfuscatedGetter(
		intValue = -1268599939
	)
	static int field480;
	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("oz")
	@ObfuscatedGetter(
		intValue = 942376391
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = 93181997
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = 1679259971
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		intValue = 840097293
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("or")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = -251848545
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		intValue = 701573001
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("ok")
	static boolean field574;
	@ObfuscatedName("os")
	@ObfuscatedGetter(
		intValue = 1943275901
	)
	static int field747;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = 2047583569
	)
	static int field674;
	@ObfuscatedName("om")
	static boolean field675;
	@ObfuscatedName("oi")
	@ObfuscatedGetter(
		intValue = 352021831
	)
	static int field653;
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = 1143795035
	)
	static int field612;
	@ObfuscatedName("op")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("pv")
	@ObfuscatedGetter(
		intValue = 1746638637
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("pj")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = -1300368255
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("pu")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("pz")
	@ObfuscatedGetter(
		intValue = -386041557
	)
	static int field683;
	@ObfuscatedName("pg")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = 1687044341
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("pb")
	static int[] field686;
	@ObfuscatedName("pp")
	@ObfuscatedGetter(
		intValue = -31940881
	)
	static int field687;
	@ObfuscatedName("pa")
	@ObfuscatedGetter(
		intValue = 743328381
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = 1498936325
	)
	static int field689;
	@ObfuscatedName("pm")
	@ObfuscatedGetter(
		intValue = -1311780869
	)
	static int field690;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = -1047813865
	)
	static int field691;
	@ObfuscatedName("pq")
	@ObfuscatedGetter(
		intValue = -316236861
	)
	static int field692;
	@ObfuscatedName("pl")
	@ObfuscatedGetter(
		intValue = 330047093
	)
	static int field762;
	@ObfuscatedName("pf")
	@ObfuscatedGetter(
		intValue = 907254029
	)
	static int field512;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = -1728010509
	)
	static int field695;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = 189830111
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("qn")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	static NodeDeque field698;
	@ObfuscatedName("qx")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	static NodeDeque field701;
	@ObfuscatedName("qc")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = 863306169
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = 300350499
	)
	static int field694;
	@ObfuscatedName("qr")
	static boolean[] field652;
	@ObfuscatedName("qk")
	static boolean[] field704;
	@ObfuscatedName("qa")
	static boolean[] field524;
	@ObfuscatedName("qh")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("qb")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("qj")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("qz")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = -1165338739
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("qv")
	@ObfuscatedGetter(
		longValue = 5765024780864769377L
	)
	static long field711;
	@ObfuscatedName("qq")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("fx")
	String field518;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Lt;"
	)
	class14 field519;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Lh;"
	)
	class19 field520;
	@ObfuscatedName("fr")
	OtlTokenRequester field478;
	@ObfuscatedName("fu")
	Future field550;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Lh;"
	)
	class19 field523;
	@ObfuscatedName("fj")
	RefreshAccessTokenRequester field577;
	@ObfuscatedName("fm")
	Future field581;
	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	Buffer field529;
	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "Ls;"
	)
	class7 field592;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		longValue = 5000728514975258643L
	)
	long field531;

	static {
		field659 = true; // L: 142
		worldId = 1; // L: 143
		worldProperties = 0; // L: 144
		gameBuild = 0; // L: 146
		isMembersWorld = false; // L: 149
		isLowDetail = false; // L: 150
		field484 = -1; // L: 155
		clientType = -1; // L: 156
		field486 = -1; // L: 157
		onMobile = false; // L: 158
		gameState = 0; // L: 170
		isLoading = true; // L: 194
		cycle = 0; // L: 195
		mouseLastLastPressedTimeMillis = -1L; // L: 196
		field492 = -1; // L: 198
		field681 = -1; // L: 199
		field494 = -1L; // L: 200
		hadFocus = true; // L: 201
		rebootTimer = 0; // L: 202
		hintArrowType = 0; // L: 203
		hintArrowNpcIndex = 0; // L: 204
		hintArrowPlayerIndex = 0; // L: 205
		hintArrowX = 0; // L: 206
		hintArrowY = 0; // L: 207
		hintArrowHeight = 0; // L: 208
		hintArrowSubX = 0; // L: 209
		hintArrowSubY = 0; // L: 210
		playerAttackOption = AttackOption.AttackOption_hidden; // L: 212
		npcAttackOption = AttackOption.AttackOption_hidden; // L: 213
		titleLoadingStage = 0; // L: 218
		js5ConnectState = 0; // L: 221
		field625 = 0; // L: 222
		js5Errors = 0; // L: 244
		loginState = 0; // L: 246
		field626 = 0; // L: 247
		field514 = 0; // L: 248
		field654 = 0; // L: 249
		field615 = class124.field1553; // L: 250
		field517 = class443.field4734; // L: 251
		field526 = class119.method2745(SecureRandomCallable.method2035("com_jagex_auth_desktop_osrs:public")); // L: 270
		Login_isUsernameRemembered = false; // L: 276
		secureRandomFuture = new SecureRandomFuture(); // L: 277
		randomDatData = null; // L: 284
		npcs = new NPC[32768]; // L: 288
		npcCount = 0; // L: 289
		npcIndices = new int[32768]; // L: 290
		field565 = 0; // L: 291
		field601 = new int[250]; // L: 292
		packetWriter = new PacketWriter(); // L: 295
		logoutTimer = 0; // L: 297
		hadNetworkError = false; // L: 298
		useBufferedSocket = true; // L: 299
		field493 = false; // L: 300
		timer = new Timer(); // L: 301
		fontsMap = new HashMap(); // L: 307
		field545 = 0; // L: 314
		field546 = 1; // L: 315
		field570 = 0; // L: 316
		field548 = 1; // L: 317
		field597 = 0; // L: 318
		collisionMaps = new CollisionMap[4]; // L: 326
		isInInstance = false; // L: 327
		instanceChunkTemplates = new int[4][13][13]; // L: 328
		field553 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 329
		field727 = 0; // L: 332
		field555 = 2301979; // L: 344
		field556 = 5063219; // L: 345
		field640 = 3353893; // L: 346
		field483 = 7759444; // L: 347
		field559 = false; // L: 348
		alternativeScrollbarWidth = 0; // L: 349
		camAngleX = 128; // L: 357
		camAngleY = 0; // L: 358
		camAngleDY = 0; // L: 359
		camAngleDX = 0; // L: 360
		mouseCamClickedX = 0; // L: 361
		mouseCamClickedY = 0; // L: 362
		oculusOrbState = 0; // L: 363
		camFollowHeight = 50; // L: 364
		field569 = 0; // L: 368
		field567 = 0; // L: 369
		field571 = 0; // L: 370
		oculusOrbNormalSpeed = 12; // L: 372
		oculusOrbSlowedSpeed = 6; // L: 373
		field482 = 0; // L: 374
		field575 = false; // L: 375
		field576 = 0; // L: 376
		field557 = false; // L: 377
		field578 = 0; // L: 378
		overheadTextCount = 0; // L: 379
		overheadTextLimit = 50; // L: 380
		overheadTextXs = new int[overheadTextLimit]; // L: 381
		overheadTextYs = new int[overheadTextLimit]; // L: 382
		overheadTextAscents = new int[overheadTextLimit]; // L: 383
		overheadTextXOffsets = new int[overheadTextLimit]; // L: 384
		overheadTextColors = new int[overheadTextLimit]; // L: 385
		overheadTextEffects = new int[overheadTextLimit]; // L: 386
		overheadTextCyclesRemaining = new int[overheadTextLimit]; // L: 387
		overheadText = new String[overheadTextLimit]; // L: 388
		tileLastDrawnActor = new int[104][104]; // L: 389
		viewportDrawCount = 0; // L: 390
		viewportTempX = -1; // L: 391
		viewportTempY = -1; // L: 392
		mouseCrossX = 0; // L: 393
		mouseCrossY = 0; // L: 394
		mouseCrossState = 0; // L: 395
		mouseCrossColor = 0; // L: 396
		showMouseCross = true; // L: 397
		field598 = 0; // L: 399
		field599 = 0; // L: 400
		dragItemSlotSource = 0; // L: 403
		draggedWidgetX = 0; // L: 404
		draggedWidgetY = 0; // L: 405
		dragItemSlotDestination = 0; // L: 406
		field604 = false; // L: 407
		itemDragDuration = 0; // L: 408
		field606 = 0; // L: 409
		showLoadingMessages = true; // L: 411
		players = new Player[2048]; // L: 413
		localPlayerIndex = -1; // L: 415
		field610 = 0; // L: 416
		field611 = -1L; // L: 417
		renderSelf = true; // L: 419
		drawPlayerNames = 0; // L: 424
		field621 = 0; // L: 425
		field616 = new int[1000]; // L: 426
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 428
		playerMenuActions = new String[8]; // L: 429
		playerOptionsPriorities = new boolean[8]; // L: 430
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 431
		combatTargetPlayerIndex = -1; // L: 432
		groundItems = new NodeDeque[4][104][104]; // L: 433
		pendingSpawns = new NodeDeque(); // L: 434
		projectiles = new NodeDeque(); // L: 435
		graphicsObjects = new NodeDeque(); // L: 436
		currentLevels = new int[25]; // L: 437
		levels = new int[25]; // L: 438
		experience = new int[25]; // L: 439
		leftClickOpensMenu = 0; // L: 440
		isMenuOpen = false; // L: 441
		menuOptionsCount = 0; // L: 447
		menuArguments1 = new int[500]; // L: 448
		menuArguments2 = new int[500]; // L: 449
		menuOpcodes = new int[500]; // L: 450
		menuIdentifiers = new int[500]; // L: 451
		menuActions = new String[500]; // L: 452
		menuTargets = new String[500]; // L: 453
		menuShiftClick = new boolean[500]; // L: 454
		followerOpsLowPriority = false; // L: 455
		shiftClickDrop = false; // L: 457
		tapToDrop = false; // L: 458
		showMouseOverText = true; // L: 459
		viewportX = -1; // L: 460
		viewportY = -1; // L: 461
		field645 = 0; // L: 465
		field702 = 50; // L: 466
		isItemSelected = 0; // L: 467
		selectedItemName = null; // L: 471
		isSpellSelected = false; // L: 472
		selectedSpellChildIndex = -1; // L: 474
		selectedSpellItemId = -1; // L: 475
		selectedSpellActionName = null; // L: 477
		selectedSpellName = null; // L: 478
		rootInterface = -1; // L: 479
		interfaceParents = new NodeHashTable(8); // L: 480
		field487 = 0; // L: 485
		field657 = -1; // L: 486
		chatEffects = 0; // L: 487
		field480 = 0; // L: 488
		meslayerContinueWidget = null; // L: 489
		runEnergy = 0; // L: 490
		weight = 0; // L: 491
		staffModLevel = 0; // L: 492
		followerIndex = -1; // L: 493
		playerMod = false; // L: 494
		viewportWidget = null; // L: 495
		clickedWidget = null; // L: 496
		clickedWidgetParent = null; // L: 497
		widgetClickX = 0; // L: 498
		widgetClickY = 0; // L: 499
		draggedOnWidget = null; // L: 500
		field574 = false; // L: 501
		field747 = -1; // L: 502
		field674 = -1; // L: 503
		field675 = false; // L: 504
		field653 = -1; // L: 505
		field612 = -1; // L: 506
		isDraggingWidget = false; // L: 507
		cycleCntr = 1; // L: 512
		changedVarps = new int[32]; // L: 515
		changedVarpCount = 0; // L: 516
		changedItemContainers = new int[32]; // L: 517
		field683 = 0; // L: 518
		changedSkills = new int[32]; // L: 519
		changedSkillsCount = 0; // L: 520
		field686 = new int[32]; // L: 521
		field687 = 0; // L: 522
		chatCycle = 0; // L: 523
		field689 = 0; // L: 524
		field690 = 0; // L: 525
		field691 = 0; // L: 526
		field692 = 0; // L: 527
		field762 = 0; // L: 528
		field512 = 0; // L: 529
		field695 = 0; // L: 530
		mouseWheelRotation = 0; // L: 536
		scriptEvents = new NodeDeque(); // L: 537
		field698 = new NodeDeque(); // L: 538
		field701 = new NodeDeque(); // L: 539
		widgetFlags = new NodeHashTable(512); // L: 540
		rootWidgetCount = 0; // L: 542
		field694 = -2; // L: 543
		field652 = new boolean[100]; // L: 544
		field704 = new boolean[100]; // L: 545
		field524 = new boolean[100]; // L: 546
		rootWidgetXs = new int[100]; // L: 547
		rootWidgetYs = new int[100]; // L: 548
		rootWidgetWidths = new int[100]; // L: 549
		rootWidgetHeights = new int[100]; // L: 550
		gameDrawingMode = 0; // L: 551
		field711 = 0L; // L: 552
		isResizable = true; // L: 553
		field769 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 560
		publicChatMode = 0; // L: 561
		tradeChatMode = 0; // L: 563
		field549 = ""; // L: 564
		crossWorldMessageIds = new long[100]; // L: 566
		crossWorldMessageIdsIndex = 0; // L: 567
		field719 = 0; // L: 569
		field720 = new int[128]; // L: 570
		field721 = new int[128]; // L: 571
		field722 = -1L; // L: 572
		currentClanSettings = new ClanSettings[4]; // L: 576
		currentClanChannels = new ClanChannel[4]; // L: 578
		field515 = -1; // L: 580
		mapIconCount = 0; // L: 581
		mapIconXs = new int[1000]; // L: 582
		mapIconYs = new int[1000]; // L: 583
		mapIcons = new SpritePixels[1000]; // L: 584
		destinationX = 0; // L: 585
		destinationY = 0; // L: 586
		minimapState = 0; // L: 593
		currentTrackGroupId = -1; // L: 594
		playingJingle = false; // L: 595
		soundEffectCount = 0; // L: 601
		soundEffectIds = new int[50]; // L: 602
		queuedSoundEffectLoops = new int[50]; // L: 603
		queuedSoundEffectDelays = new int[50]; // L: 604
		soundLocations = new int[50]; // L: 605
		soundEffects = new SoundEffect[50]; // L: 606
		isCameraLocked = false; // L: 608
		field742 = false; // L: 619
		field743 = new boolean[5]; // L: 627
		field744 = new int[5]; // L: 628
		field745 = new int[5]; // L: 629
		field714 = new int[5]; // L: 630
		field677 = new int[5]; // L: 631
		field748 = 256; // L: 632
		field749 = 205; // L: 633
		zoomHeight = 256; // L: 634
		zoomWidth = 320; // L: 635
		field752 = 1; // L: 636
		field753 = 32767; // L: 637
		field656 = 1; // L: 638
		field755 = 32767; // L: 639
		viewportOffsetX = 0; // L: 640
		viewportOffsetY = 0; // L: 641
		viewportWidth = 0; // L: 642
		viewportHeight = 0; // L: 643
		viewportZoom = 0; // L: 644
		playerAppearance = new PlayerComposition(); // L: 646
		field602 = -1; // L: 647
		field763 = -1; // L: 648
		platformInfoProvider = new DesktopPlatformInfoProvider(); // L: 650
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 652
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 655
		field767 = -1; // L: 662
		archiveLoaders = new ArrayList(10); // L: 663
		archiveLoadersDone = 0; // L: 664
		field770 = 0; // L: 665
		field771 = new ApproximateRouteStrategy(); // L: 674
		field772 = new int[50]; // L: 675
		field773 = new int[50]; // L: 676
	}

	public Client() {
		this.field531 = -1L; // L: 282
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1437501286"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field711 = class113.method2624() + 500L; // L: 4375
		this.resizeJS(); // L: 4376
		if (rootInterface != -1) { // L: 4377
			this.resizeRoot(true);
		}

	} // L: 4378

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-1311"
	)
	@Export("setUp")
	protected final void setUp() {
		Interpreter.method1866(new int[]{20, 260, 10000}, new int[]{1000, 100, 500}); // L: 907
		Tiles.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 908
		GrandExchangeEvent.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 909
		WorldMapRegion.currentPort = Tiles.worldPort; // L: 910
		Coord.field3352 = class293.field3375; // L: 911
		DesktopPlatformInfoProvider.field4469 = class293.field3371; // L: 912
		class340.field4156 = class293.field3376; // L: 913
		PlayerComposition.field3366 = class293.field3374; // L: 914
		UserComparator7.urlRequester = new class101(); // L: 915
		this.setUpKeyboard(); // L: 916
		this.method415(); // L: 917
		Clock.mouseWheel = this.mouseWheel(); // L: 918
		class135.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 919
		AccessFile var2 = null; // L: 922
		ClientPreferences var3 = new ClientPreferences(); // L: 923

		try {
			var2 = UserComparator3.getPreferencesFile("", ApproximateRouteStrategy.field473.name, false); // L: 925
			byte[] var4 = new byte[(int)var2.length()]; // L: 926

			int var6;
			for (int var5 = 0; var5 < var4.length; var5 += var6) { // L: 927 928 931
				var6 = var2.read(var4, var5, var4.length - var5); // L: 929
				if (var6 == -1) { // L: 930
					throw new IOException();
				}
			}

			var3 = new ClientPreferences(new Buffer(var4)); // L: 933
		} catch (Exception var8) { // L: 935
		}

		try {
			if (var2 != null) { // L: 937
				var2.close();
			}
		} catch (Exception var7) { // L: 939
		}

		class12.clientPreferences = var3; // L: 942
		this.setUpClipboard(); // L: 943
		Tiles.method1996(this, GameEngine.field206); // L: 944
		Widget.setWindowedMode(class12.clientPreferences.method2274()); // L: 945
		BufferedSource.friendSystem = new FriendSystem(class391.loginType); // L: 946
		this.field519 = new class14("tokenRequest", 1, 1); // L: 947
	} // L: 948

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-772264838"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 952
		this.doCycleJs5(); // L: 953

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 957
				var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast(); // L: 958
			} // L: 959

			if (var1 == null) { // L: 960
				int var5;
				try {
					if (class273.musicPlayerStatus == 1) { // L: 966
						var5 = class273.midiPcmStream.method5080(); // L: 967
						if (var5 > 0 && class273.midiPcmStream.isReady()) { // L: 968
							var5 -= GrandExchangeEvent.pcmSampleLength; // L: 969
							if (var5 < 0) { // L: 970
								var5 = 0;
							}

							class273.midiPcmStream.setPcmStreamVolume(var5); // L: 971
						} else {
							class273.midiPcmStream.clear(); // L: 974
							class273.midiPcmStream.removeAll(); // L: 975
							if (ClanChannelMember.musicTrackArchive != null) { // L: 976
								class273.musicPlayerStatus = 2;
							} else {
								class273.musicPlayerStatus = 0; // L: 977
							}

							class273.musicTrack = null; // L: 978
							class152.soundCache = null; // L: 979
						}
					}
				} catch (Exception var9) { // L: 982
					var9.printStackTrace(); // L: 983
					class273.midiPcmStream.clear(); // L: 984
					class273.musicPlayerStatus = 0; // L: 985
					class273.musicTrack = null; // L: 986
					class152.soundCache = null; // L: 987
					ClanChannelMember.musicTrackArchive = null; // L: 988
				}

				ArchiveLoader.playPcmPlayers(); // L: 991
				synchronized(KeyHandler.KeyHandler_instance) { // L: 993
					++KeyHandler.KeyHandler_idleCycles; // L: 994
					KeyHandler.field142 = KeyHandler.field144; // L: 995
					KeyHandler.field139 = 0; // L: 996
					KeyHandler.field134 = 0; // L: 997
					Arrays.fill(KeyHandler.field120, false); // L: 998
					Arrays.fill(KeyHandler.field132, false); // L: 999
					if (KeyHandler.field135 < 0) { // L: 1000
						Arrays.fill(KeyHandler.KeyHandler_pressedKeys, false); // L: 1001
						KeyHandler.field135 = KeyHandler.field150; // L: 1002
					} else {
						while (KeyHandler.field135 != KeyHandler.field150) { // L: 1005
							int var6 = KeyHandler.field133[KeyHandler.field150]; // L: 1006
							KeyHandler.field150 = KeyHandler.field150 + 1 & 127; // L: 1007
							if (var6 < 0) { // L: 1008
								var6 = ~var6; // L: 1009
								if (KeyHandler.KeyHandler_pressedKeys[var6]) { // L: 1010
									KeyHandler.KeyHandler_pressedKeys[var6] = false; // L: 1011
									KeyHandler.field132[var6] = true; // L: 1012
									KeyHandler.field140[KeyHandler.field134] = var6; // L: 1013
									++KeyHandler.field134; // L: 1014
								}
							} else {
								if (!KeyHandler.KeyHandler_pressedKeys[var6] && KeyHandler.field139 < KeyHandler.field138.length - 1) { // L: 1018
									KeyHandler.field120[var6] = true; // L: 1019
									KeyHandler.field138[++KeyHandler.field139 - 1] = var6; // L: 1020
								}

								KeyHandler.KeyHandler_pressedKeys[var6] = true; // L: 1022
							}
						}
					}

					if (KeyHandler.field139 > 0) { // L: 1026
						KeyHandler.KeyHandler_idleCycles = 0;
					}

					KeyHandler.field144 = KeyHandler.field143; // L: 1027
				}

				WorldMapLabelSize.method4414(); // L: 1030
				if (Clock.mouseWheel != null) { // L: 1031
					var5 = Clock.mouseWheel.useRotation(); // L: 1032
					mouseWheelRotation = var5; // L: 1033
				}

				if (gameState == 0) { // L: 1035
					ClanSettings.load(); // L: 1036
					WorldMap.method7222(); // L: 1037
				} else if (gameState == 5) { // L: 1039
					class136.loginScreen(this, class149.fontPlain12); // L: 1040
					ClanSettings.load(); // L: 1041
					WorldMap.method7222(); // L: 1042
				} else if (gameState != 10 && gameState != 11) { // L: 1044
					if (gameState == 20) { // L: 1045
						class136.loginScreen(this, class149.fontPlain12); // L: 1046
						this.doCycleLoggedOut(); // L: 1047
					} else if (gameState == 50) { // L: 1049
						class136.loginScreen(this, class149.fontPlain12); // L: 1050
						this.doCycleLoggedOut(); // L: 1051
					} else if (gameState == 25) { // L: 1053
						class301.method5580();
					}
				} else {
					class136.loginScreen(this, class149.fontPlain12);
				}

				if (gameState == 30) { // L: 1054
					this.doCycleLoggedIn();
				} else if (gameState == 40 || gameState == 45) { // L: 1055
					this.doCycleLoggedOut();
				}

				return; // L: 1056
			}

			var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false); // L: 961
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-375798495"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2 = Players.method2427(); // L: 1060
		if (var2 && playingJingle && SecureRandomCallable.pcmPlayer0 != null) { // L: 1061 1062
			SecureRandomCallable.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && field711 != 0L && class113.method2624() > field711) { // L: 1064 1065
			Widget.setWindowedMode(ClanChannelMember.getWindowedMode()); // L: 1066
		}

		int var3;
		if (var1) { // L: 1069
			for (var3 = 0; var3 < 100; ++var3) { // L: 1070
				field652[var3] = true;
			}
		}

		if (gameState == 0) { // L: 1072
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1073
			SoundCache.drawTitle(ChatChannel.fontBold12, Varcs.fontPlain11, class149.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1074
			if (gameState == 20) { // L: 1075
				SoundCache.drawTitle(ChatChannel.fontBold12, Varcs.fontPlain11, class149.fontPlain12);
			} else if (gameState == 50) { // L: 1076
				SoundCache.drawTitle(ChatChannel.fontBold12, Varcs.fontPlain11, class149.fontPlain12);
			} else if (gameState == 25) { // L: 1077
				if (field597 == 1) { // L: 1078
					if (field545 > field546) { // L: 1079
						field546 = field545;
					}

					var3 = (field546 * 50 - field545 * 50) / field546; // L: 1080
					class259.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false); // L: 1081
				} else if (field597 == 2) { // L: 1083
					if (field570 > field548) { // L: 1084
						field548 = field570;
					}

					var3 = (field548 * 50 - field570 * 50) / field548 + 50; // L: 1085
					class259.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false); // L: 1086
				} else {
					class259.drawLoadingMessage("Loading - please wait.", false); // L: 1088
				}
			} else if (gameState == 30) { // L: 1090
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1091
				class259.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1092
				class259.drawLoadingMessage("Please wait...", false);
			}
		} else {
			SoundCache.drawTitle(ChatChannel.fontBold12, Varcs.fontPlain11, class149.fontPlain12); // L: 1082
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) { // L: 1093
			for (var3 = 0; var3 < rootWidgetCount; ++var3) { // L: 1094
				if (field704[var3]) { // L: 1095
					DevicePcmPlayerProvider.rasterProvider.draw(rootWidgetXs[var3], rootWidgetYs[var3], rootWidgetWidths[var3], rootWidgetHeights[var3]); // L: 1096
					field704[var3] = false; // L: 1097
				}
			}
		} else if (gameState > 0) { // L: 1101
			DevicePcmPlayerProvider.rasterProvider.drawFull(0, 0); // L: 1102

			for (var3 = 0; var3 < rootWidgetCount; ++var3) { // L: 1103
				field704[var3] = false;
			}
		}

	} // L: 1105

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-31"
	)
	@Export("kill0")
	protected final void kill0() {
		if (class125.varcs.hasUnwrittenChanges()) { // L: 1108
			class125.varcs.write();
		}

		if (Varcs.mouseRecorder != null) { // L: 1109
			Varcs.mouseRecorder.isRunning = false;
		}

		Varcs.mouseRecorder = null; // L: 1110
		packetWriter.close(); // L: 1111
		class162.method3209(); // L: 1112
		if (MouseHandler.MouseHandler_instance != null) { // L: 1114
			synchronized(MouseHandler.MouseHandler_instance) { // L: 1115
				MouseHandler.MouseHandler_instance = null; // L: 1116
			} // L: 1117
		}

		Clock.mouseWheel = null; // L: 1120
		if (SecureRandomCallable.pcmPlayer0 != null) { // L: 1121
			SecureRandomCallable.pcmPlayer0.shutdown();
		}

		if (Fonts.pcmPlayer1 != null) { // L: 1122
			Fonts.pcmPlayer1.shutdown();
		}

		if (NetCache.NetCache_socket != null) { // L: 1124
			NetCache.NetCache_socket.close();
		}

		Occluder.method4221(); // L: 1126
		if (UserComparator7.urlRequester != null) { // L: 1127
			UserComparator7.urlRequester.close(); // L: 1128
			UserComparator7.urlRequester = null; // L: 1129
		}

		try {
			JagexCache.JagexCache_dat2File.close(); // L: 1133

			for (int var3 = 0; var3 < UserComparator6.idxCount; ++var3) { // L: 1134
				JagexCache.JagexCache_idxFiles[var3].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 1135
			JagexCache.JagexCache_randomDat.close(); // L: 1136
		} catch (Exception var5) { // L: 1138
		}

		this.field519.method161(); // L: 1140
	} // L: 1141

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-9"
	)
	protected final void vmethod1448() {
	} // L: 683

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1606202603"
	)
	boolean method1128() {
		return Decimator.field406 != null && !Decimator.field406.trim().isEmpty(); // L: 852
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-69"
	)
	boolean method1520() {
		return this.field478 != null; // L: 856
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "64"
	)
	void method1130(String var1) throws IOException {
		HashMap var2 = new HashMap(); // L: 860
		var2.put("grant_type", "refresh_token"); // L: 861
		var2.put("scope", "gamesso.token.create"); // L: 862
		var2.put("refresh_token", var1); // L: 863
		URL var3 = new URL(ApproximateRouteStrategy.field471 + "shield/oauth/token" + (new class401(var2)).method6961()); // L: 864
		HashMap var4 = new HashMap(); // L: 865
		var4.put("Authorization", "Basic " + field526); // L: 866
		var4.put("Host", (new URL(ApproximateRouteStrategy.field471)).getHost()); // L: 867
		var4.put("Accept", class398.field4432.method6940()); // L: 868
		class9 var5 = class9.field32; // L: 869
		RefreshAccessTokenRequester var6 = this.field577; // L: 870
		if (var6 != null) { // L: 871
			this.field581 = var6.request(var5.method67(), var3, var4, ""); // L: 872
		} else {
			class10 var7 = new class10(var3, var5); // L: 875
			Iterator var8 = var4.entrySet().iterator(); // L: 876

			while (var8.hasNext()) {
				Entry var9 = (Entry)var8.next(); // L: 877
				var7.method78((String)var9.getKey(), (String)var9.getValue()); // L: 879
			}

			this.field523 = this.field519.method160(var7); // L: 882
		}
	} // L: 873 883

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1218305449"
	)
	void method1229(String var1) throws MalformedURLException, IOException {
		URL var2 = new URL(ApproximateRouteStrategy.field471 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"); // L: 886
		HashMap var3 = new HashMap(); // L: 887
		var3.put("Authorization", "Bearer " + var1); // L: 888
		class9 var4 = class9.field40; // L: 889
		OtlTokenRequester var5 = this.field478; // L: 890
		if (var5 != null) { // L: 891
			this.field550 = var5.request(var4.method67(), var2, var3, ""); // L: 892
		} else {
			class10 var6 = new class10(var2, var4); // L: 895
			Iterator var7 = var3.entrySet().iterator(); // L: 896

			while (var7.hasNext()) {
				Entry var8 = (Entry)var7.next(); // L: 897
				var6.method78((String)var8.getKey(), (String)var8.getValue()); // L: 899
			}

			this.field520 = this.field519.method160(var6); // L: 902
		}
	} // L: 893 903

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-568109507"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1206
			long var2 = class113.method2624(); // L: 1209
			int var4 = (int)(var2 - NetCache.field4041); // L: 1210
			NetCache.field4041 = var2; // L: 1211
			if (var4 > 200) { // L: 1212
				var4 = 200;
			}

			NetCache.NetCache_loadTime += var4; // L: 1213
			boolean var1;
			if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) { // L: 1214
				var1 = true; // L: 1215
			} else if (NetCache.NetCache_socket == null) { // L: 1218
				var1 = false; // L: 1219
			} else {
				try {
					label243: {
						if (NetCache.NetCache_loadTime > 30000) { // L: 1223
							throw new IOException();
						}

						NetFileRequest var5;
						Buffer var6;
						while (NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) { // L: 1224
							var5 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first(); // L: 1225
							var6 = new Buffer(4); // L: 1226
							var6.writeByte(1); // L: 1227
							var6.writeMedium((int)var5.key); // L: 1228
							NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 1229
							NetCache.NetCache_pendingPriorityResponses.put(var5, var5.key); // L: 1230
							--NetCache.NetCache_pendingPriorityWritesCount; // L: 1231
							++NetCache.NetCache_pendingPriorityResponsesCount; // L: 1232
						}

						while (NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) { // L: 1234
							var5 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast(); // L: 1235
							var6 = new Buffer(4); // L: 1236
							var6.writeByte(0); // L: 1237
							var6.writeMedium((int)var5.key); // L: 1238
							NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 1239
							var5.removeDual(); // L: 1240
							NetCache.NetCache_pendingResponses.put(var5, var5.key); // L: 1241
							--NetCache.NetCache_pendingWritesCount; // L: 1242
							++NetCache.NetCache_pendingResponsesCount; // L: 1243
						}

						for (int var17 = 0; var17 < 100; ++var17) { // L: 1245
							int var18 = NetCache.NetCache_socket.available(); // L: 1246
							if (var18 < 0) { // L: 1247
								throw new IOException();
							}

							if (var18 == 0) { // L: 1248
								break;
							}

							NetCache.NetCache_loadTime = 0; // L: 1249
							byte var7 = 0; // L: 1250
							if (WorldMapIcon_0.NetCache_currentResponse == null) { // L: 1251
								var7 = 8;
							} else if (NetCache.field4052 == 0) { // L: 1252
								var7 = 1;
							}

							int var8;
							int var9;
							int var10;
							int var12;
							byte[] var10000;
							int var10001;
							Buffer var25;
							if (var7 > 0) { // L: 1253
								var8 = var7 - NetCache.NetCache_responseHeaderBuffer.offset; // L: 1254
								if (var8 > var18) { // L: 1255
									var8 = var18;
								}

								NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var8); // L: 1256
								if (NetCache.field4043 != 0) { // L: 1257
									for (var9 = 0; var9 < var8; ++var9) { // L: 1258
										var10000 = NetCache.NetCache_responseHeaderBuffer.array;
										var10001 = var9 + NetCache.NetCache_responseHeaderBuffer.offset;
										var10000[var10001] ^= NetCache.field4043;
									}
								}

								var25 = NetCache.NetCache_responseHeaderBuffer; // L: 1260
								var25.offset += var8;
								if (NetCache.NetCache_responseHeaderBuffer.offset < var7) { // L: 1261
									break;
								}

								if (WorldMapIcon_0.NetCache_currentResponse == null) { // L: 1262
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1263
									var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1264
									var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort(); // L: 1265
									int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1266
									var12 = NetCache.NetCache_responseHeaderBuffer.readInt(); // L: 1267
									long var13 = (long)(var10 + (var9 << 16)); // L: 1268
									NetFileRequest var15 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var13); // L: 1269
									class270.field3218 = true; // L: 1270
									if (var15 == null) { // L: 1271
										var15 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var13); // L: 1272
										class270.field3218 = false; // L: 1273
									}

									if (var15 == null) { // L: 1275
										throw new IOException(); // L: 1276
									}

									int var16 = var11 == 0 ? 5 : 9; // L: 1278
									WorldMapIcon_0.NetCache_currentResponse = var15; // L: 1279
									class357.NetCache_responseArchiveBuffer = new Buffer(var16 + var12 + WorldMapIcon_0.NetCache_currentResponse.padding); // L: 1280
									class357.NetCache_responseArchiveBuffer.writeByte(var11); // L: 1281
									class357.NetCache_responseArchiveBuffer.writeInt(var12); // L: 1282
									NetCache.field4052 = 8; // L: 1283
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1284
								} else if (NetCache.field4052 == 0) { // L: 1287
									if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) { // L: 1288
										NetCache.field4052 = 1; // L: 1289
										NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1290
									} else {
										WorldMapIcon_0.NetCache_currentResponse = null; // L: 1294
									}
								}
							} else {
								var8 = class357.NetCache_responseArchiveBuffer.array.length - WorldMapIcon_0.NetCache_currentResponse.padding; // L: 1300
								var9 = 512 - NetCache.field4052; // L: 1301
								if (var9 > var8 - class357.NetCache_responseArchiveBuffer.offset) { // L: 1302
									var9 = var8 - class357.NetCache_responseArchiveBuffer.offset;
								}

								if (var9 > var18) { // L: 1303
									var9 = var18;
								}

								NetCache.NetCache_socket.read(class357.NetCache_responseArchiveBuffer.array, class357.NetCache_responseArchiveBuffer.offset, var9); // L: 1304
								if (NetCache.field4043 != 0) { // L: 1305
									for (var10 = 0; var10 < var9; ++var10) { // L: 1306
										var10000 = class357.NetCache_responseArchiveBuffer.array;
										var10001 = class357.NetCache_responseArchiveBuffer.offset + var10;
										var10000[var10001] ^= NetCache.field4043;
									}
								}

								var25 = class357.NetCache_responseArchiveBuffer; // L: 1308
								var25.offset += var9;
								NetCache.field4052 += var9; // L: 1309
								if (var8 == class357.NetCache_responseArchiveBuffer.offset) { // L: 1310
									if (WorldMapIcon_0.NetCache_currentResponse.key == 16711935L) { // L: 1311
										class300.NetCache_reference = class357.NetCache_responseArchiveBuffer; // L: 1312

										for (var10 = 0; var10 < 256; ++var10) { // L: 1313
											Archive var19 = NetCache.NetCache_archives[var10]; // L: 1314
											if (var19 != null) { // L: 1315
												class300.NetCache_reference.offset = var10 * 8 + 5; // L: 1316
												var12 = class300.NetCache_reference.readInt(); // L: 1317
												int var20 = class300.NetCache_reference.readInt(); // L: 1318
												var19.loadIndex(var12, var20); // L: 1319
											}
										}
									} else {
										NetCache.NetCache_crc.reset(); // L: 1324
										NetCache.NetCache_crc.update(class357.NetCache_responseArchiveBuffer.array, 0, var8); // L: 1325
										var10 = (int)NetCache.NetCache_crc.getValue(); // L: 1326
										if (var10 != WorldMapIcon_0.NetCache_currentResponse.crc) { // L: 1327
											try {
												NetCache.NetCache_socket.close(); // L: 1329
											} catch (Exception var23) { // L: 1331
											}

											++NetCache.NetCache_crcMismatches; // L: 1332
											NetCache.NetCache_socket = null; // L: 1333
											NetCache.field4043 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 1334
											var1 = false; // L: 1335
											break label243;
										}

										NetCache.NetCache_crcMismatches = 0; // L: 1338
										NetCache.NetCache_ioExceptions = 0; // L: 1339
										WorldMapIcon_0.NetCache_currentResponse.archive.write((int)(WorldMapIcon_0.NetCache_currentResponse.key & 65535L), class357.NetCache_responseArchiveBuffer.array, (WorldMapIcon_0.NetCache_currentResponse.key & 16711680L) == 16711680L, class270.field3218); // L: 1340
									}

									WorldMapIcon_0.NetCache_currentResponse.remove(); // L: 1342
									if (class270.field3218) { // L: 1343
										--NetCache.NetCache_pendingPriorityResponsesCount;
									} else {
										--NetCache.NetCache_pendingResponsesCount; // L: 1344
									}

									NetCache.field4052 = 0; // L: 1345
									WorldMapIcon_0.NetCache_currentResponse = null; // L: 1346
									class357.NetCache_responseArchiveBuffer = null; // L: 1347
								} else {
									if (NetCache.field4052 != 512) { // L: 1349
										break;
									}

									NetCache.field4052 = 0;
								}
							}
						}

						var1 = true; // L: 1353
					}
				} catch (IOException var24) {
					try {
						NetCache.NetCache_socket.close(); // L: 1357
					} catch (Exception var22) { // L: 1359
					}

					++NetCache.NetCache_ioExceptions; // L: 1360
					NetCache.NetCache_socket = null; // L: 1361
					var1 = false; // L: 1362
				}
			}

			if (!var1) { // L: 1366
				this.doCycleJs5Connect();
			}

		}
	} // L: 1367

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "17214"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) { // L: 1370
			this.error("js5crc"); // L: 1371
			PendingSpawn.updateGameState(1000); // L: 1372
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) { // L: 1375
				if (gameState <= 5) { // L: 1376
					this.error("js5io"); // L: 1377
					PendingSpawn.updateGameState(1000); // L: 1378
					return; // L: 1379
				}

				field625 = 3000; // L: 1382
				NetCache.NetCache_ioExceptions = 3; // L: 1383
			}

			if (--field625 + 1 <= 0) { // L: 1386
				try {
					if (js5ConnectState == 0) { // L: 1388
						class259.js5SocketTask = GameEngine.taskHandler.newSocketTask(Timer.worldHost, WorldMapRegion.currentPort); // L: 1389
						++js5ConnectState; // L: 1390
					}

					if (js5ConnectState == 1) { // L: 1392
						if (class259.js5SocketTask.status == 2) { // L: 1393
							this.js5Error(-1); // L: 1394
							return; // L: 1395
						}

						if (class259.js5SocketTask.status == 1) { // L: 1397
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 1399
						if (useBufferedSocket) { // L: 1400
							Socket var2 = (Socket)class259.js5SocketTask.result; // L: 1402
							BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000); // L: 1404
							Varcs.js5Socket = var1; // L: 1406
						} else {
							Varcs.js5Socket = new NetSocket((Socket)class259.js5SocketTask.result, GameEngine.taskHandler, 5000); // L: 1409
						}

						Buffer var5 = new Buffer(5); // L: 1411
						var5.writeByte(15); // L: 1412
						var5.writeInt(205); // L: 1413
						Varcs.js5Socket.write(var5.array, 0, 5); // L: 1414
						++js5ConnectState; // L: 1415
						class147.field1704 = class113.method2624(); // L: 1416
					}

					if (js5ConnectState == 3) { // L: 1418
						if (Varcs.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) { // L: 1419
							int var3 = Varcs.js5Socket.readUnsignedByte(); // L: 1420
							if (var3 != 0) { // L: 1421
								this.js5Error(var3); // L: 1422
								return; // L: 1423
							}

							++js5ConnectState; // L: 1425
						} else if (class113.method2624() - class147.field1704 > 30000L) { // L: 1428
							this.js5Error(-2); // L: 1429
							return; // L: 1430
						}
					}

					if (js5ConnectState == 4) { // L: 1434
						Skeleton.method4024(Varcs.js5Socket, gameState > 20); // L: 1435
						class259.js5SocketTask = null; // L: 1436
						Varcs.js5Socket = null; // L: 1437
						js5ConnectState = 0; // L: 1438
						js5Errors = 0; // L: 1439
					}
				} catch (IOException var4) { // L: 1442
					this.js5Error(-3); // L: 1443
				}

			}
		}
	} // L: 1373 1445

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1106896178"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class259.js5SocketTask = null; // L: 1448
		Varcs.js5Socket = null; // L: 1449
		js5ConnectState = 0; // L: 1450
		if (Tiles.worldPort == WorldMapRegion.currentPort) { // L: 1451
			WorldMapRegion.currentPort = GrandExchangeEvent.js5Port;
		} else {
			WorldMapRegion.currentPort = Tiles.worldPort; // L: 1452
		}

		++js5Errors; // L: 1453
		if (js5Errors < 2 || var1 != 7 && var1 != 9) { // L: 1454
			if (js5Errors >= 2 && var1 == 6) { // L: 1461
				this.error("js5connect_outofdate"); // L: 1462
				PendingSpawn.updateGameState(1000); // L: 1463
			} else if (js5Errors >= 4) { // L: 1465
				if (gameState <= 5) { // L: 1466
					this.error("js5connect"); // L: 1467
					PendingSpawn.updateGameState(1000); // L: 1468
				} else {
					field625 = 3000; // L: 1470
				}
			}
		} else if (gameState <= 5) { // L: 1455
			this.error("js5connect_full"); // L: 1456
			PendingSpawn.updateGameState(1000); // L: 1457
		} else {
			field625 = 3000; // L: 1459
		}

	} // L: 1472

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "57"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket(); // L: 2077
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 2078

		try {
			if (loginState == 0) { // L: 2080
				if (secureRandom == null && (secureRandomFuture.isDone() || field626 > 250)) { // L: 2081
					secureRandom = secureRandomFuture.get(); // L: 2082
					secureRandomFuture.shutdown(); // L: 2083
					secureRandomFuture = null; // L: 2084
				}

				if (secureRandom != null) { // L: 2086
					if (var1 != null) { // L: 2087
						((AbstractSocket)var1).close(); // L: 2088
						var1 = null; // L: 2089
					}

					WorldMapCacheName.socketTask = null; // L: 2091
					hadNetworkError = false; // L: 2092
					field626 = 0; // L: 2093
					if (field517.method7790()) { // L: 2094
						try {
							this.method1130(ModelData0.field2661); // L: 2096
							Canvas.method347(21); // L: 2097
						} catch (Throwable var21) { // L: 2099
							ArchiveDiskActionHandler.RunException_sendStackTrace((String)null, var21); // L: 2100
							PcmPlayer.getLoginError(65); // L: 2101
							return; // L: 2102
						}
					} else {
						Canvas.method347(1); // L: 2106
					}
				}
			}

			class21 var23;
			if (loginState == 21) { // L: 2110
				if (this.field581 != null) { // L: 2111
					if (!this.field581.isDone()) { // L: 2112
						return; // L: 2113
					}

					if (this.field581.isCancelled()) { // L: 2115
						PcmPlayer.getLoginError(65); // L: 2116
						this.field581 = null; // L: 2117
						return; // L: 2118
					}

					try {
						OtlTokenResponse var3 = (OtlTokenResponse)this.field581.get(); // L: 2121
						if (!var3.isSuccess()) { // L: 2122
							PcmPlayer.getLoginError(65); // L: 2123
							this.field581 = null; // L: 2124
							return; // L: 2125
						}

						Decimator.field406 = var3.getAccessToken(); // L: 2127
						ModelData0.field2661 = var3.getRefreshToken(); // L: 2128
						this.field581 = null; // L: 2129
					} catch (Exception var20) { // L: 2131
						ArchiveDiskActionHandler.RunException_sendStackTrace((String)null, var20); // L: 2132
						PcmPlayer.getLoginError(65); // L: 2133
						this.field581 = null; // L: 2134
						return; // L: 2135
					}
				} else {
					if (this.field523 == null) { // L: 2138
						PcmPlayer.getLoginError(65); // L: 2168
						return; // L: 2169
					}

					if (!this.field523.method253()) { // L: 2139
						return; // L: 2140
					}

					if (this.field523.method250()) { // L: 2142
						ArchiveDiskActionHandler.RunException_sendStackTrace(this.field523.method251(), (Throwable)null); // L: 2143
						PcmPlayer.getLoginError(65); // L: 2144
						this.field523 = null; // L: 2145
						return; // L: 2146
					}

					var23 = this.field523.method254(); // L: 2148
					if (var23.method271() != 200) { // L: 2149
						PcmPlayer.getLoginError(65); // L: 2150
						this.field523 = null; // L: 2151
						return; // L: 2152
					}

					field626 = 0; // L: 2154
					class400 var4 = new class400(var23.method276()); // L: 2155

					try {
						Decimator.field406 = var4.method6947().getString("access_token"); // L: 2157
						ModelData0.field2661 = var4.method6947().getString("refresh_token"); // L: 2158
					} catch (Exception var19) { // L: 2160
						ArchiveDiskActionHandler.RunException_sendStackTrace("Error parsing tokens", var19); // L: 2161
						PcmPlayer.getLoginError(65); // L: 2162
						this.field523 = null; // L: 2163
						return; // L: 2164
					}
				}

				this.method1229(Decimator.field406); // L: 2171
				Canvas.method347(20); // L: 2172
			}

			if (loginState == 20) { // L: 2174
				if (this.field550 != null) { // L: 2175
					if (!this.field550.isDone()) { // L: 2176
						return; // L: 2177
					}

					if (this.field550.isCancelled()) { // L: 2179
						PcmPlayer.getLoginError(65); // L: 2180
						this.field550 = null; // L: 2181
						return; // L: 2182
					}

					try {
						com.jagex.oldscape.pub.OtlTokenResponse var24 = (com.jagex.oldscape.pub.OtlTokenResponse)this.field550.get(); // L: 2185
						if (!var24.isSuccess()) { // L: 2186
							PcmPlayer.getLoginError(65); // L: 2187
							this.field550 = null; // L: 2188
							return; // L: 2189
						}

						this.field518 = var24.getToken(); // L: 2191
						this.field550 = null; // L: 2192
					} catch (Exception var18) { // L: 2194
						ArchiveDiskActionHandler.RunException_sendStackTrace((String)null, var18); // L: 2195
						PcmPlayer.getLoginError(65); // L: 2196
						this.field550 = null; // L: 2197
						return; // L: 2198
					}
				} else {
					if (this.field520 == null) { // L: 2201
						PcmPlayer.getLoginError(65); // L: 2222
						return; // L: 2223
					}

					if (!this.field520.method253()) { // L: 2202
						return; // L: 2203
					}

					if (this.field520.method250()) { // L: 2205
						ArchiveDiskActionHandler.RunException_sendStackTrace(this.field520.method251(), (Throwable)null); // L: 2206
						PcmPlayer.getLoginError(65); // L: 2207
						this.field520 = null; // L: 2208
						return; // L: 2209
					}

					var23 = this.field520.method254(); // L: 2211
					if (var23.method271() != 200) { // L: 2212
						ArchiveDiskActionHandler.RunException_sendStackTrace("Response code: " + var23.method271() + "Response body: " + var23.method276(), (Throwable)null); // L: 2213
						PcmPlayer.getLoginError(65); // L: 2214
						this.field520 = null; // L: 2215
						return; // L: 2216
					}

					this.field518 = var23.method276(); // L: 2218
					this.field520 = null; // L: 2219
				}

				field626 = 0; // L: 2225
				Canvas.method347(1); // L: 2226
			}

			if (loginState == 1) { // L: 2228
				if (WorldMapCacheName.socketTask == null) { // L: 2229
					WorldMapCacheName.socketTask = GameEngine.taskHandler.newSocketTask(Timer.worldHost, WorldMapRegion.currentPort); // L: 2230
				}

				if (WorldMapCacheName.socketTask.status == 2) { // L: 2232
					throw new IOException();
				}

				if (WorldMapCacheName.socketTask.status == 1) { // L: 2233
					if (useBufferedSocket) { // L: 2234
						Socket var25 = (Socket)WorldMapCacheName.socketTask.result; // L: 2236
						BufferedNetSocket var26 = new BufferedNetSocket(var25, 40000, 5000); // L: 2238
						var1 = var26; // L: 2240
					} else {
						var1 = new NetSocket((Socket)WorldMapCacheName.socketTask.result, GameEngine.taskHandler, 5000); // L: 2243
					}

					packetWriter.setSocket((AbstractSocket)var1); // L: 2245
					WorldMapCacheName.socketTask = null; // L: 2246
					Canvas.method347(2); // L: 2247
				}
			}

			PacketBufferNode var27;
			if (loginState == 2) { // L: 2250
				packetWriter.clearBuffer(); // L: 2251
				var27 = class162.method3208(); // L: 2252
				var27.packetBuffer.writeByte(LoginPacket.field3192.id); // L: 2253
				packetWriter.addNode(var27); // L: 2254
				packetWriter.flush(); // L: 2255
				var2.offset = 0; // L: 2256
				Canvas.method347(3); // L: 2257
			}

			boolean var11;
			int var12;
			if (loginState == 3) { // L: 2259
				if (SecureRandomCallable.pcmPlayer0 != null) { // L: 2260
					SecureRandomCallable.pcmPlayer0.method739();
				}

				if (Fonts.pcmPlayer1 != null) { // L: 2261
					Fonts.pcmPlayer1.method739();
				}

				var11 = true; // L: 2262
				if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) { // L: 2263 2264
					var11 = false;
				}

				if (var11) { // L: 2266
					var12 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2267
					if (SecureRandomCallable.pcmPlayer0 != null) { // L: 2268
						SecureRandomCallable.pcmPlayer0.method739();
					}

					if (Fonts.pcmPlayer1 != null) { // L: 2269
						Fonts.pcmPlayer1.method739();
					}

					if (var12 != 0) { // L: 2270
						PcmPlayer.getLoginError(var12); // L: 2271
						return; // L: 2272
					}

					var2.offset = 0; // L: 2274
					Canvas.method347(4); // L: 2275
				}
			}

			int var40;
			if (loginState == 4) { // L: 2278
				if (var2.offset < 8) { // L: 2279
					var40 = ((AbstractSocket)var1).available(); // L: 2280
					if (var40 > 8 - var2.offset) { // L: 2281
						var40 = 8 - var2.offset;
					}

					if (var40 > 0) { // L: 2282
						((AbstractSocket)var1).read(var2.array, var2.offset, var40); // L: 2283
						var2.offset += var40; // L: 2284
					}
				}

				if (var2.offset == 8) { // L: 2287
					var2.offset = 0; // L: 2288
					ModelData0.field2658 = var2.readLong(); // L: 2289
					Canvas.method347(5); // L: 2290
				}
			}

			int var6;
			if (loginState == 5) { // L: 2293
				packetWriter.packetBuffer.offset = 0; // L: 2294
				packetWriter.clearBuffer(); // L: 2295
				PacketBuffer var29 = new PacketBuffer(500); // L: 2296
				int[] var28 = new int[]{secureRandom.nextInt(), secureRandom.nextInt(), secureRandom.nextInt(), secureRandom.nextInt()}; // L: 2297 2298 2299 2300 2301
				var29.offset = 0; // L: 2302
				var29.writeByte(1); // L: 2303
				var29.writeInt(var28[0]); // L: 2304
				var29.writeInt(var28[1]); // L: 2305
				var29.writeInt(var28[2]); // L: 2306
				var29.writeInt(var28[3]); // L: 2307
				var29.writeLong(ModelData0.field2658); // L: 2308
				if (gameState == 40) { // L: 2309
					var29.writeInt(LoginType.field4619[0]); // L: 2310
					var29.writeInt(LoginType.field4619[1]); // L: 2311
					var29.writeInt(LoginType.field4619[2]); // L: 2312
					var29.writeInt(LoginType.field4619[3]); // L: 2313
				} else {
					if (gameState == 50) { // L: 2316
						var29.writeByte(class124.field1555.rsOrdinal()); // L: 2317
						var29.writeInt(class7.field26); // L: 2318
					} else {
						var29.writeByte(field615.rsOrdinal()); // L: 2321
						switch(field615.field1552) { // L: 2322
						case 0:
						case 1:
							var29.writeMedium(WorldMapCacheName.field2912); // L: 2336
							++var29.offset; // L: 2337
							break;
						case 2:
							var29.offset += 4; // L: 2325
							break; // L: 2326
						case 3:
							var29.writeInt((Integer)class12.clientPreferences.parameters.get(class239.method4810(Login.Login_username))); // L: 2330
						}
					}

					if (field517.method7790()) { // L: 2342
						var29.writeByte(class443.field4730.rsOrdinal()); // L: 2343
						var29.writeStringCp1252NullTerminated(this.field518); // L: 2344
					} else {
						var29.writeByte(class443.field4734.rsOrdinal()); // L: 2347
						var29.writeStringCp1252NullTerminated(Login.Login_password); // L: 2348
					}
				}

				var29.encryptRsa(class67.field875, class67.field871); // L: 2351
				LoginType.field4619 = var28; // L: 2352
				PacketBufferNode var5 = class162.method3208(); // L: 2353
				var5.packetBuffer.offset = 0; // L: 2354
				if (gameState == 40) { // L: 2355
					var5.packetBuffer.writeByte(LoginPacket.field3194.id); // L: 2356
				} else {
					var5.packetBuffer.writeByte(LoginPacket.field3193.id); // L: 2359
				}

				var5.packetBuffer.writeShort(0); // L: 2361
				var6 = var5.packetBuffer.offset; // L: 2362
				var5.packetBuffer.writeInt(205); // L: 2363
				var5.packetBuffer.writeInt(1); // L: 2364
				var5.packetBuffer.writeByte(clientType); // L: 2365
				var5.packetBuffer.writeByte(field486); // L: 2366
				var5.packetBuffer.writeBytes(var29.array, 0, var29.offset); // L: 2367
				int var7 = var5.packetBuffer.offset; // L: 2368
				var5.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2369
				var5.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2370
				var5.packetBuffer.writeShort(GraphicsObject.canvasWidth); // L: 2371
				var5.packetBuffer.writeShort(class433.canvasHeight); // L: 2372
				IntHashTable.method8124(var5.packetBuffer); // L: 2373
				if (!field662.endsWith(";A")) { // L: 2374
					field662 = field662 + ";A"; // L: 2375
				}

				var5.packetBuffer.writeStringCp1252NullTerminated(field662); // L: 2377
				var5.packetBuffer.writeInt(class230.field2807); // L: 2378
				Buffer var8 = new Buffer(class135.platformInfo.size()); // L: 2379
				class135.platformInfo.write(var8); // L: 2380
				var5.packetBuffer.writeBytes(var8.array, 0, var8.array.length); // L: 2381
				var5.packetBuffer.writeByte(clientType); // L: 2382
				var5.packetBuffer.writeInt(0); // L: 2383
				var5.packetBuffer.method7563(AbstractUserComparator.archive6.hash); // L: 2384
				var5.packetBuffer.writeInt(ItemContainer.archive20.hash); // L: 2385
				var5.packetBuffer.method7565(class305.archive8.hash); // L: 2386
				var5.packetBuffer.method7565(0); // L: 2387
				var5.packetBuffer.writeInt(class356.archive2.hash); // L: 2388
				var5.packetBuffer.method7563(VarpDefinition.archive19.hash); // L: 2389
				var5.packetBuffer.method7565(InterfaceParent.archive7.hash); // L: 2390
				var5.packetBuffer.method7565(class101.archive14.hash); // L: 2391
				var5.packetBuffer.writeIntME(UrlRequest.archive11.hash); // L: 2392
				var5.packetBuffer.writeInt(Clock.archive1.hash); // L: 2393
				var5.packetBuffer.method7563(Message.archive5.hash); // L: 2394
				var5.packetBuffer.writeInt(class16.archive13.hash); // L: 2395
				var5.packetBuffer.method7565(class114.archive17.hash); // L: 2396
				var5.packetBuffer.method7565(class92.archive18.hash); // L: 2397
				var5.packetBuffer.writeInt(ObjectSound.archive10.hash); // L: 2398
				var5.packetBuffer.writeInt(class194.archive3.hash); // L: 2399
				var5.packetBuffer.writeIntME(archive15.hash); // L: 2400
				var5.packetBuffer.writeInt(MouseHandler.archive4.hash); // L: 2401
				var5.packetBuffer.method7565(class115.archive12.hash); // L: 2402
				var5.packetBuffer.method7563(TileItem.archive9.hash); // L: 2403
				var5.packetBuffer.method7563(NetSocket.archive0.hash); // L: 2404
				var5.packetBuffer.xteaEncrypt(var28, var7, var5.packetBuffer.offset); // L: 2405
				var5.packetBuffer.writeLengthShort(var5.packetBuffer.offset - var6); // L: 2406
				packetWriter.addNode(var5); // L: 2407
				packetWriter.flush(); // L: 2408
				packetWriter.isaacCipher = new IsaacCipher(var28); // L: 2409
				int[] var9 = new int[4]; // L: 2410

				for (int var10 = 0; var10 < 4; ++var10) { // L: 2411
					var9[var10] = var28[var10] + 50;
				}

				var2.newIsaacCipher(var9); // L: 2412
				Canvas.method347(6); // L: 2413
			}

			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) { // L: 2415 2416
				var40 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2417
				if (var40 == 61) { // L: 2418
					var12 = ((AbstractSocket)var1).available(); // L: 2419
					class92.field1273 = var12 == 1 && ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2420
					Canvas.method347(5); // L: 2421
				}

				if (var40 == 21 && gameState == 20) { // L: 2423
					Canvas.method347(12); // L: 2424
				} else if (var40 == 2) { // L: 2426
					Canvas.method347(14); // L: 2427
				} else if (var40 == 15 && gameState == 40) { // L: 2429
					packetWriter.serverPacketLength = -1; // L: 2430
					Canvas.method347(19); // L: 2431
				} else if (var40 == 64) { // L: 2433
					Canvas.method347(10); // L: 2434
				} else if (var40 == 23 && field514 < 1) { // L: 2436
					++field514; // L: 2437
					Canvas.method347(0); // L: 2438
				} else if (var40 == 29) { // L: 2440
					Canvas.method347(17); // L: 2441
				} else {
					if (var40 != 69) { // L: 2443
						PcmPlayer.getLoginError(var40); // L: 2447
						return; // L: 2448
					}

					Canvas.method347(7); // L: 2444
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) { // L: 2452 2453
				((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2454
				var2.offset = 0; // L: 2455
				AttackOption.field1290 = var2.readUnsignedShort(); // L: 2456
				Canvas.method347(8); // L: 2457
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= AttackOption.field1290) { // L: 2460 2461
				var2.offset = 0; // L: 2462
				((AbstractSocket)var1).read(var2.array, var2.offset, AttackOption.field1290); // L: 2463
				class6[] var31 = new class6[]{class6.field16}; // L: 2466
				class6 var30 = var31[var2.readUnsignedByte()]; // L: 2468

				try {
					switch(var30.field11) { // L: 2472
					case 0:
						class0 var32 = new class0(); // L: 2479
						this.field592 = new class7(var2, var32); // L: 2485
						Canvas.method347(9); // L: 2486
						break;
					default:
						throw new IllegalArgumentException(); // L: 2475
					}
				} catch (Exception var17) { // L: 2488
					PcmPlayer.getLoginError(22); // L: 2489
					return; // L: 2490
				}
			}

			if (loginState == 9 && this.field592.method49()) { // L: 2494 2495
				this.field529 = this.field592.method51(); // L: 2496
				this.field592.method50(); // L: 2497
				this.field592 = null; // L: 2498
				if (this.field529 == null) { // L: 2499
					PcmPlayer.getLoginError(22); // L: 2500
					return; // L: 2501
				}

				packetWriter.clearBuffer(); // L: 2503
				var27 = class162.method3208(); // L: 2504
				var27.packetBuffer.writeByte(LoginPacket.field3195.id); // L: 2505
				var27.packetBuffer.writeShort(this.field529.offset); // L: 2506
				var27.packetBuffer.method7530(this.field529); // L: 2507
				packetWriter.addNode(var27); // L: 2508
				packetWriter.flush(); // L: 2509
				this.field529 = null; // L: 2510
				Canvas.method347(6); // L: 2511
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) { // L: 2514 2515
				class263.field3070 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2516
				Canvas.method347(11); // L: 2517
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= class263.field3070) { // L: 2520 2521
				((AbstractSocket)var1).read(var2.array, 0, class263.field3070); // L: 2522
				var2.offset = 0; // L: 2523
				Canvas.method347(6); // L: 2524
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) { // L: 2527 2528
				field654 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60; // L: 2529
				Canvas.method347(13); // L: 2530
			}

			if (loginState == 13) { // L: 2533
				field626 = 0; // L: 2534
				class345.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field654 / 60 + " seconds."); // L: 2535
				if (--field654 <= 0) { // L: 2536
					Canvas.method347(0);
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) { // L: 2539 2540
					Varcs.field1329 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2541
					Canvas.method347(15); // L: 2542
				}

				int var14;
				boolean var41;
				if (loginState == 15 && ((AbstractSocket)var1).available() >= Varcs.field1329) { // L: 2545 2546
					var11 = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2547
					((AbstractSocket)var1).read(var2.array, 0, 4); // L: 2548
					var2.offset = 0; // L: 2549
					var41 = false; // L: 2550
					if (var11) { // L: 2551
						var12 = var2.readByteIsaac() << 24; // L: 2552
						var12 |= var2.readByteIsaac() << 16; // L: 2553
						var12 |= var2.readByteIsaac() << 8; // L: 2554
						var12 |= var2.readByteIsaac(); // L: 2555
						var14 = class239.method4810(Login.Login_username); // L: 2556
						if (class12.clientPreferences.parameters.size() >= 10 && !class12.clientPreferences.parameters.containsKey(var14)) { // L: 2557 2558
							Iterator var13 = class12.clientPreferences.parameters.entrySet().iterator(); // L: 2559
							var13.next(); // L: 2560
							var13.remove(); // L: 2561
						}

						class12.clientPreferences.parameters.put(var14, var12); // L: 2564
					}

					if (Login_isUsernameRemembered) { // L: 2566
						class12.clientPreferences.method2297(Login.Login_username); // L: 2567
					} else {
						class12.clientPreferences.method2297((String)null); // L: 2570
					}

					class270.savePreferences(); // L: 2572
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte(); // L: 2573
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2574
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte(); // L: 2575
					localPlayerIndex <<= 8; // L: 2576
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte(); // L: 2577
					field610 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2578
					((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2579
					var2.offset = 0; // L: 2580
					this.field531 = var2.readLong(); // L: 2581
					if (Varcs.field1329 >= 29) { // L: 2582
						((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2583
						var2.offset = 0; // L: 2584
						field611 = var2.readLong(); // L: 2585
					}

					((AbstractSocket)var1).read(var2.array, 0, 1); // L: 2587
					var2.offset = 0; // L: 2588
					ServerPacket[] var34 = BuddyRankComparator.ServerPacket_values(); // L: 2589
					var6 = var2.readSmartByteShortIsaac(); // L: 2590
					if (var6 < 0 || var6 >= var34.length) { // L: 2591
						throw new IOException(var6 + " " + var2.offset);
					}

					packetWriter.serverPacket = var34[var6]; // L: 2592
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2593
					((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2594
					var2.offset = 0; // L: 2595
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2596

					try {
						class27.method370(class82.client, "zap"); // L: 2598
					} catch (Throwable var16) { // L: 2600
					}

					Canvas.method347(16); // L: 2601
				}

				if (loginState == 16) { // L: 2604
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2605
						var2.offset = 0; // L: 2606
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2607
						timer.method6370(); // L: 2608
						mouseLastLastPressedTimeMillis = -1L; // L: 2611
						Varcs.mouseRecorder.index = 0; // L: 2612
						WorldMapArea.hasFocus = true; // L: 2613
						hadFocus = true; // L: 2614
						field722 = -1L; // L: 2615
						class33.reflectionChecks = new IterableNodeDeque(); // L: 2617
						packetWriter.clearBuffer(); // L: 2619
						packetWriter.packetBuffer.offset = 0; // L: 2620
						packetWriter.serverPacket = null; // L: 2621
						packetWriter.field1351 = null; // L: 2622
						packetWriter.field1340 = null; // L: 2623
						packetWriter.field1345 = null; // L: 2624
						packetWriter.serverPacketLength = 0; // L: 2625
						packetWriter.field1349 = 0; // L: 2626
						rebootTimer = 0; // L: 2627
						logoutTimer = 0; // L: 2628
						hintArrowType = 0; // L: 2629
						menuOptionsCount = 0; // L: 2631
						isMenuOpen = false; // L: 2632
						MouseHandler.MouseHandler_idleCycles = 0; // L: 2635
						class152.method3044(); // L: 2637
						isItemSelected = 0; // L: 2638
						isSpellSelected = false; // L: 2639
						soundEffectCount = 0; // L: 2640
						camAngleY = 0; // L: 2641
						oculusOrbState = 0; // L: 2642
						class127.field1570 = null; // L: 2643
						minimapState = 0; // L: 2644
						field515 = -1; // L: 2645
						destinationX = 0; // L: 2646
						destinationY = 0; // L: 2647
						playerAttackOption = AttackOption.AttackOption_hidden; // L: 2648
						npcAttackOption = AttackOption.AttackOption_hidden; // L: 2649
						npcCount = 0; // L: 2650
						Players.Players_count = 0; // L: 2652

						for (var40 = 0; var40 < 2048; ++var40) { // L: 2653
							Players.field1307[var40] = null; // L: 2654
							Players.field1302[var40] = class193.field2251; // L: 2655
						}

						for (var40 = 0; var40 < 2048; ++var40) { // L: 2658
							players[var40] = null;
						}

						for (var40 = 0; var40 < 32768; ++var40) { // L: 2659
							npcs[var40] = null;
						}

						combatTargetPlayerIndex = -1; // L: 2660
						projectiles.clear(); // L: 2661
						graphicsObjects.clear(); // L: 2662

						for (var40 = 0; var40 < 4; ++var40) { // L: 2663
							for (var12 = 0; var12 < 104; ++var12) { // L: 2664
								for (var14 = 0; var14 < 104; ++var14) { // L: 2665
									groundItems[var40][var12][var14] = null; // L: 2666
								}
							}
						}

						pendingSpawns = new NodeDeque(); // L: 2670
						BufferedSource.friendSystem.clear(); // L: 2671

						for (var40 = 0; var40 < VarpDefinition.VarpDefinition_fileCount; ++var40) { // L: 2672
							VarpDefinition var35 = class21.VarpDefinition_get(var40); // L: 2673
							if (var35 != null) { // L: 2674
								Varps.Varps_temp[var40] = 0; // L: 2675
								Varps.Varps_main[var40] = 0; // L: 2676
							}
						}

						class125.varcs.clearTransient(); // L: 2679
						followerIndex = -1; // L: 2680
						if (rootInterface != -1) { // L: 2681
							var40 = rootInterface; // L: 2682
							if (var40 != -1 && class120.Widget_loadedInterfaces[var40]) { // L: 2684 2685
								class134.Widget_archive.clearFilesGroup(var40); // L: 2686
								if (NetSocket.Widget_interfaceComponents[var40] != null) { // L: 2687
									var41 = true; // L: 2688

									for (var14 = 0; var14 < NetSocket.Widget_interfaceComponents[var40].length; ++var14) { // L: 2689
										if (NetSocket.Widget_interfaceComponents[var40][var14] != null) { // L: 2690
											if (NetSocket.Widget_interfaceComponents[var40][var14].type != 2) { // L: 2691
												NetSocket.Widget_interfaceComponents[var40][var14] = null;
											} else {
												var41 = false; // L: 2692
											}
										}
									}

									if (var41) { // L: 2695
										NetSocket.Widget_interfaceComponents[var40] = null;
									}

									class120.Widget_loadedInterfaces[var40] = false; // L: 2696
								}
							}
						}

						for (InterfaceParent var39 = (InterfaceParent)interfaceParents.first(); var39 != null; var39 = (InterfaceParent)interfaceParents.next()) { // L: 2699
							NetSocket.closeInterface(var39, true); // L: 2700
						}

						rootInterface = -1; // L: 2702
						interfaceParents = new NodeHashTable(8); // L: 2703
						meslayerContinueWidget = null; // L: 2704
						menuOptionsCount = 0; // L: 2706
						isMenuOpen = false; // L: 2707
						playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1); // L: 2709

						for (var40 = 0; var40 < 8; ++var40) { // L: 2710
							playerMenuActions[var40] = null; // L: 2711
							playerOptionsPriorities[var40] = false; // L: 2712
						}

						ItemContainer.itemContainers = new NodeHashTable(32); // L: 2715
						isLoading = true; // L: 2717

						for (var40 = 0; var40 < 100; ++var40) { // L: 2718
							field652[var40] = true;
						}

						var27 = WallDecoration.getPacketBufferNode(ClientPacket.field3054, packetWriter.isaacCipher); // L: 2721
						var27.packetBuffer.writeByte(ClanChannelMember.getWindowedMode()); // L: 2722
						var27.packetBuffer.writeShort(GraphicsObject.canvasWidth); // L: 2723
						var27.packetBuffer.writeShort(class433.canvasHeight); // L: 2724
						packetWriter.addNode(var27); // L: 2725
						PcmPlayer.friendsChat = null; // L: 2727
						class358.guestClanSettings = null; // L: 2728
						Arrays.fill(currentClanSettings, (Object)null); // L: 2729
						UserComparator10.guestClanChannel = null; // L: 2730
						Arrays.fill(currentClanChannels, (Object)null); // L: 2731

						for (var40 = 0; var40 < 8; ++var40) { // L: 2732
							grandExchangeOffers[var40] = new GrandExchangeOffer();
						}

						class120.grandExchangeEvents = null; // L: 2733
						Player.updatePlayer(var2); // L: 2735
						WorldMapSectionType.field2828 = -1; // L: 2736
						class144.loadRegions(false, var2); // L: 2737
						packetWriter.serverPacket = null; // L: 2738
					}

				} else {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) { // L: 2742 2743
						var2.offset = 0; // L: 2744
						((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2745
						var2.offset = 0; // L: 2746
						User.field4323 = var2.readUnsignedShort(); // L: 2747
						Canvas.method347(18); // L: 2748
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= User.field4323) { // L: 2751 2752
						var2.offset = 0; // L: 2753
						((AbstractSocket)var1).read(var2.array, 0, User.field4323); // L: 2754
						var2.offset = 0; // L: 2755
						String var36 = var2.readStringCp1252NullTerminated(); // L: 2756
						String var33 = var2.readStringCp1252NullTerminated(); // L: 2757
						String var37 = var2.readStringCp1252NullTerminated(); // L: 2758
						class345.setLoginResponseString(var36, var33, var37); // L: 2759
						PendingSpawn.updateGameState(10); // L: 2760
						if (field517.method7790()) { // L: 2761
							class126.method2799(9); // L: 2762
						}
					}

					if (loginState != 19) { // L: 2766
						++field626; // L: 2813
						if (field626 > 2000) { // L: 2814
							if (field514 < 1) { // L: 2815
								if (Tiles.worldPort == WorldMapRegion.currentPort) { // L: 2816
									WorldMapRegion.currentPort = GrandExchangeEvent.js5Port;
								} else {
									WorldMapRegion.currentPort = Tiles.worldPort; // L: 2817
								}

								++field514; // L: 2818
								Canvas.method347(0); // L: 2819
							} else {
								PcmPlayer.getLoginError(-3); // L: 2822
							}
						}
					} else {
						if (packetWriter.serverPacketLength == -1) { // L: 2767
							if (((AbstractSocket)var1).available() < 2) { // L: 2768
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2769
							var2.offset = 0; // L: 2770
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2771
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2773
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2774
							var2.offset = 0; // L: 2775
							var40 = packetWriter.serverPacketLength; // L: 2776
							timer.method6372(); // L: 2777
							packetWriter.clearBuffer(); // L: 2779
							packetWriter.packetBuffer.offset = 0; // L: 2780
							packetWriter.serverPacket = null; // L: 2781
							packetWriter.field1351 = null; // L: 2782
							packetWriter.field1340 = null; // L: 2783
							packetWriter.field1345 = null; // L: 2784
							packetWriter.serverPacketLength = 0; // L: 2785
							packetWriter.field1349 = 0; // L: 2786
							rebootTimer = 0; // L: 2787
							HealthBar.method2336(); // L: 2788
							minimapState = 0; // L: 2789
							destinationX = 0; // L: 2790

							for (var12 = 0; var12 < 2048; ++var12) { // L: 2791
								players[var12] = null;
							}

							ModelData0.localPlayer = null; // L: 2792

							for (var12 = 0; var12 < npcs.length; ++var12) { // L: 2793
								NPC var38 = npcs[var12]; // L: 2794
								if (var38 != null) { // L: 2795
									var38.targetIndex = -1; // L: 2796
									var38.false0 = false; // L: 2797
								}
							}

							ItemContainer.itemContainers = new NodeHashTable(32); // L: 2801
							PendingSpawn.updateGameState(30); // L: 2803

							for (var12 = 0; var12 < 100; ++var12) { // L: 2804
								field652[var12] = true;
							}

							class140.method2951(); // L: 2805
							Player.updatePlayer(var2); // L: 2807
							if (var40 != var2.offset) { // L: 2808
								throw new RuntimeException(); // L: 2809
							}
						}
					}
				}
			}
		} catch (IOException var22) { // L: 2826
			if (field514 < 1) { // L: 2827
				if (Tiles.worldPort == WorldMapRegion.currentPort) { // L: 2828
					WorldMapRegion.currentPort = GrandExchangeEvent.js5Port;
				} else {
					WorldMapRegion.currentPort = Tiles.worldPort; // L: 2829
				}

				++field514; // L: 2830
				Canvas.method347(0); // L: 2831
			} else {
				PcmPlayer.getLoginError(-2); // L: 2834
			}
		}
	} // L: 2537 2740 2811 2820 2823 2832 2835 2837

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 3073
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 3074
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 3075
			hadNetworkError = false; // L: 3076
			class129.method2812(); // L: 3077
		} else {
			if (!isMenuOpen) { // L: 3080
				class20.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1254(packetWriter); ++var1) { // L: 3081 3082
			}

			if (gameState == 30) { // L: 3084
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class33.reflectionChecks.last(); // L: 3088
					boolean var30;
					if (var2 == null) { // L: 3089
						var30 = false; // L: 3090
					} else {
						var30 = true; // L: 3093
					}

					int var3;
					PacketBufferNode var31;
					if (!var30) { // L: 3095
						PacketBufferNode var14;
						int var15;
						if (timer.field4235) { // L: 3103
							var14 = WallDecoration.getPacketBufferNode(ClientPacket.field3009, packetWriter.isaacCipher); // L: 3105
							var14.packetBuffer.writeByte(0); // L: 3106
							var15 = var14.packetBuffer.offset; // L: 3107
							timer.write(var14.packetBuffer); // L: 3108
							var14.packetBuffer.method7740(var14.packetBuffer.offset - var15); // L: 3109
							packetWriter.addNode(var14); // L: 3110
							timer.method6371(); // L: 3111
						}

						int var4;
						int var5;
						int var6;
						int var7;
						int var8;
						int var9;
						int var10;
						int var11;
						int var12;
						PacketBuffer var10000;
						synchronized(Varcs.mouseRecorder.lock) { // L: 3114
							if (!field659) { // L: 3115
								Varcs.mouseRecorder.index = 0; // L: 3201
							} else if (MouseHandler.MouseHandler_lastButton != 0 || Varcs.mouseRecorder.index >= 40) { // L: 3116
								var31 = null; // L: 3118
								var3 = 0; // L: 3119
								var4 = 0; // L: 3120
								var5 = 0; // L: 3121
								var6 = 0; // L: 3122

								for (var7 = 0; var7 < Varcs.mouseRecorder.index && (var31 == null || var31.packetBuffer.offset - var3 < 246); ++var7) { // L: 3123 3124
									var4 = var7; // L: 3125
									var8 = Varcs.mouseRecorder.ys[var7]; // L: 3126
									if (var8 < -1) { // L: 3127
										var8 = -1;
									} else if (var8 > 65534) { // L: 3128
										var8 = 65534;
									}

									var9 = Varcs.mouseRecorder.xs[var7]; // L: 3129
									if (var9 < -1) { // L: 3130
										var9 = -1;
									} else if (var9 > 65534) { // L: 3131
										var9 = 65534;
									}

									if (var9 != field492 || var8 != field681) { // L: 3132
										if (var31 == null) { // L: 3135
											var31 = WallDecoration.getPacketBufferNode(ClientPacket.field2952, packetWriter.isaacCipher); // L: 3136
											var31.packetBuffer.writeByte(0); // L: 3137
											var3 = var31.packetBuffer.offset; // L: 3138
											var10000 = var31.packetBuffer; // L: 3139
											var10000.offset += 2;
											var5 = 0; // L: 3140
											var6 = 0; // L: 3141
										}

										if (-1L != field494) { // L: 3146
											var10 = var9 - field492; // L: 3147
											var11 = var8 - field681; // L: 3148
											var12 = (int)((Varcs.mouseRecorder.millis[var7] - field494) / 20L); // L: 3149
											var5 = (int)((long)var5 + (Varcs.mouseRecorder.millis[var7] - field494) % 20L); // L: 3150
										} else {
											var10 = var9; // L: 3153
											var11 = var8; // L: 3154
											var12 = Integer.MAX_VALUE; // L: 3155
										}

										field492 = var9; // L: 3157
										field681 = var8; // L: 3158
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 3159
											var10 += 32; // L: 3160
											var11 += 32; // L: 3161
											var31.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 3162
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 3164
											var10 += 128; // L: 3165
											var11 += 128; // L: 3166
											var31.packetBuffer.writeByte(var12 + 128); // L: 3167
											var31.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 3168
										} else if (var12 < 32) { // L: 3170
											var31.packetBuffer.writeByte(var12 + 192); // L: 3171
											if (var9 != -1 && var8 != -1) { // L: 3172
												var31.packetBuffer.writeInt(var9 | var8 << 16); // L: 3173
											} else {
												var31.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var31.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 3176
											if (var9 != -1 && var8 != -1) { // L: 3177
												var31.packetBuffer.writeInt(var9 | var8 << 16); // L: 3178
											} else {
												var31.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6; // L: 3180
										field494 = Varcs.mouseRecorder.millis[var7]; // L: 3181
									}
								}

								if (var31 != null) { // L: 3183
									var31.packetBuffer.method7740(var31.packetBuffer.offset - var3); // L: 3184
									var7 = var31.packetBuffer.offset; // L: 3185
									var31.packetBuffer.offset = var3; // L: 3186
									var31.packetBuffer.writeByte(var5 / var6); // L: 3187
									var31.packetBuffer.writeByte(var5 % var6); // L: 3188
									var31.packetBuffer.offset = var7; // L: 3189
									packetWriter.addNode(var31); // L: 3190
								}

								if (var4 >= Varcs.mouseRecorder.index) { // L: 3192
									Varcs.mouseRecorder.index = 0;
								} else {
									MouseRecorder var54 = Varcs.mouseRecorder; // L: 3194
									var54.index -= var4;
									System.arraycopy(Varcs.mouseRecorder.xs, var4, Varcs.mouseRecorder.xs, 0, Varcs.mouseRecorder.index); // L: 3195
									System.arraycopy(Varcs.mouseRecorder.ys, var4, Varcs.mouseRecorder.ys, 0, Varcs.mouseRecorder.index); // L: 3196
									System.arraycopy(Varcs.mouseRecorder.millis, var4, Varcs.mouseRecorder.millis, 0, Varcs.mouseRecorder.index); // L: 3197
								}
							}
						}

						PacketBufferNode var18;
						if (MouseHandler.MouseHandler_lastButton == 1 || !Login.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 3203
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis; // L: 3204
							if (var16 > 32767L) { // L: 3205
								var16 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis; // L: 3206
							var3 = MouseHandler.MouseHandler_lastPressedY; // L: 3207
							if (var3 < 0) { // L: 3208
								var3 = 0;
							} else if (var3 > class433.canvasHeight) { // L: 3209
								var3 = class433.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX; // L: 3210
							if (var4 < 0) { // L: 3211
								var4 = 0;
							} else if (var4 > GraphicsObject.canvasWidth) { // L: 3212
								var4 = GraphicsObject.canvasWidth;
							}

							var5 = (int)var16; // L: 3213
							var18 = WallDecoration.getPacketBufferNode(ClientPacket.field3051, packetWriter.isaacCipher); // L: 3214
							var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1)); // L: 3215
							var18.packetBuffer.writeShort(var4); // L: 3216
							var18.packetBuffer.writeShort(var3); // L: 3217
							packetWriter.addNode(var18); // L: 3218
						}

						if (KeyHandler.field139 > 0) { // L: 3220
							var14 = WallDecoration.getPacketBufferNode(ClientPacket.field2949, packetWriter.isaacCipher); // L: 3221
							var14.packetBuffer.writeShort(0); // L: 3222
							var15 = var14.packetBuffer.offset; // L: 3223
							long var19 = class113.method2624(); // L: 3224

							for (var5 = 0; var5 < KeyHandler.field139; ++var5) { // L: 3225
								long var21 = var19 - field722; // L: 3226
								if (var21 > 16777215L) { // L: 3227
									var21 = 16777215L;
								}

								field722 = var19; // L: 3228
								var14.packetBuffer.method7559((int)var21); // L: 3229
								var14.packetBuffer.writeByte(KeyHandler.field138[var5]); // L: 3230
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15); // L: 3232
							packetWriter.addNode(var14); // L: 3233
						}

						if (field576 > 0) { // L: 3235
							--field576;
						}

						if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) { // L: 3236
							field557 = true;
						}

						if (field557 && field576 <= 0) { // L: 3237
							field576 = 20; // L: 3238
							field557 = false; // L: 3239
							var14 = WallDecoration.getPacketBufferNode(ClientPacket.field3035, packetWriter.isaacCipher); // L: 3241
							var14.packetBuffer.writeShort(camAngleY); // L: 3242
							var14.packetBuffer.writeShort(camAngleX); // L: 3243
							packetWriter.addNode(var14); // L: 3244
						}

						if (WorldMapArea.hasFocus && !hadFocus) { // L: 3246
							hadFocus = true; // L: 3247
							var14 = WallDecoration.getPacketBufferNode(ClientPacket.field3038, packetWriter.isaacCipher); // L: 3249
							var14.packetBuffer.writeByte(1); // L: 3250
							packetWriter.addNode(var14); // L: 3251
						}

						if (!WorldMapArea.hasFocus && hadFocus) { // L: 3253
							hadFocus = false; // L: 3254
							var14 = WallDecoration.getPacketBufferNode(ClientPacket.field3038, packetWriter.isaacCipher); // L: 3256
							var14.packetBuffer.writeByte(0); // L: 3257
							packetWriter.addNode(var14); // L: 3258
						}

						if (ServerPacket.worldMap != null) { // L: 3261
							ServerPacket.worldMap.method7023();
						}

						WorldMapSection1.method4839(); // L: 3262
						HealthBar.method2334(); // L: 3263
						if (field515 != class128.Client_plane) { // L: 3265
							field515 = class128.Client_plane; // L: 3266
							GraphicsDefaults.method6732(class128.Client_plane); // L: 3267
						}

						if (gameState != 30) { // L: 3270
							return;
						}

						Tiles.method2031(); // L: 3271

						int var10002;
						for (var1 = 0; var1 < soundEffectCount; ++var1) { // L: 3273
							var10002 = queuedSoundEffectDelays[var1]--; // L: 3274
							if (queuedSoundEffectDelays[var1] >= -10) { // L: 3275
								SoundEffect var32 = soundEffects[var1]; // L: 3287
								if (var32 == null) { // L: 3288
									var10000 = null; // L: 3289
									var32 = SoundEffect.readSoundEffect(MouseHandler.archive4, soundEffectIds[var1], 0);
									if (var32 == null) { // L: 3290
										continue;
									}

									int[] var55 = queuedSoundEffectDelays; // L: 3291
									var55[var1] += var32.calculateDelay();
									soundEffects[var1] = var32; // L: 3292
								}

								if (queuedSoundEffectDelays[var1] < 0) { // L: 3298
									if (soundLocations[var1] != 0) { // L: 3300
										var4 = (soundLocations[var1] & 255) * 128; // L: 3301
										var5 = soundLocations[var1] >> 16 & 255; // L: 3302
										var6 = var5 * 128 + 64 - ModelData0.localPlayer.x; // L: 3303
										if (var6 < 0) { // L: 3304
											var6 = -var6;
										}

										var7 = soundLocations[var1] >> 8 & 255; // L: 3305
										var8 = var7 * 128 + 64 - ModelData0.localPlayer.y; // L: 3306
										if (var8 < 0) { // L: 3307
											var8 = -var8;
										}

										var9 = var6 + var8 - 128; // L: 3308
										if (var9 > var4) { // L: 3309
											queuedSoundEffectDelays[var1] = -100; // L: 3310
											continue; // L: 3311
										}

										if (var9 < 0) { // L: 3313
											var9 = 0;
										}

										var3 = (var4 - var9) * class12.clientPreferences.method2239() / var4; // L: 3314
									} else {
										var3 = class12.clientPreferences.method2244(); // L: 3316
									}

									if (var3 > 0) { // L: 3317
										RawSound var23 = var32.toRawSound().resample(class403.decimator); // L: 3318
										RawPcmStream var24 = RawPcmStream.createRawPcmStream(var23, 100, var3); // L: 3319
										var24.setNumLoops(queuedSoundEffectLoops[var1] - 1); // L: 3320
										class122.pcmStreamMixer.addSubStream(var24); // L: 3321
									}

									queuedSoundEffectDelays[var1] = -100; // L: 3323
								}
							} else {
								--soundEffectCount; // L: 3276

								for (var15 = var1; var15 < soundEffectCount; ++var15) { // L: 3277
									soundEffectIds[var15] = soundEffectIds[var15 + 1]; // L: 3278
									soundEffects[var15] = soundEffects[var15 + 1]; // L: 3279
									queuedSoundEffectLoops[var15] = queuedSoundEffectLoops[var15 + 1]; // L: 3280
									queuedSoundEffectDelays[var15] = queuedSoundEffectDelays[var15 + 1]; // L: 3281
									soundLocations[var15] = soundLocations[var15 + 1]; // L: 3282
								}

								--var1; // L: 3284
							}
						}

						if (playingJingle && !Coord.method5370()) { // L: 3326
							if (class12.clientPreferences.method2248() != 0 && currentTrackGroupId != -1) { // L: 3327
								UserComparator8.method2574(AbstractUserComparator.archive6, currentTrackGroupId, 0, class12.clientPreferences.method2248(), false);
							}

							playingJingle = false; // L: 3328
						}

						++packetWriter.field1349; // L: 3331
						if (packetWriter.field1349 > 750) { // L: 3332
							class129.method2812(); // L: 3333
							return; // L: 3334
						}

						var1 = Players.Players_count; // L: 3337
						int[] var33 = Players.Players_indices; // L: 3338

						for (var3 = 0; var3 < var1; ++var3) { // L: 3339
							Player var45 = players[var33[var3]]; // L: 3340
							if (var45 != null) { // L: 3341
								class301.updateActorSequence(var45, 1); // L: 3342
							}
						}

						for (var1 = 0; var1 < npcCount; ++var1) { // L: 3347
							var15 = npcIndices[var1]; // L: 3348
							NPC var25 = npcs[var15]; // L: 3349
							if (var25 != null) { // L: 3350
								class301.updateActorSequence(var25, var25.definition.size); // L: 3351
							}
						}

						int[] var40 = Players.Players_indices; // L: 3356

						for (var15 = 0; var15 < Players.Players_count; ++var15) { // L: 3357
							Player var51 = players[var40[var15]]; // L: 3358
							if (var51 != null && var51.overheadTextCyclesRemaining > 0) { // L: 3359
								--var51.overheadTextCyclesRemaining; // L: 3360
								if (var51.overheadTextCyclesRemaining == 0) { // L: 3361
									var51.overheadText = null;
								}
							}
						}

						for (var15 = 0; var15 < npcCount; ++var15) { // L: 3364
							var3 = npcIndices[var15]; // L: 3365
							NPC var46 = npcs[var3]; // L: 3366
							if (var46 != null && var46.overheadTextCyclesRemaining > 0) { // L: 3367
								--var46.overheadTextCyclesRemaining; // L: 3368
								if (var46.overheadTextCyclesRemaining == 0) { // L: 3369
									var46.overheadText = null;
								}
							}
						}

						++field727; // L: 3373
						if (mouseCrossColor != 0) { // L: 3374
							mouseCrossState += 20; // L: 3375
							if (mouseCrossState >= 400) { // L: 3376
								mouseCrossColor = 0;
							}
						}

						if (NPCComposition.field1991 != null) { // L: 3378
							++field598; // L: 3379
							if (field598 >= 15) { // L: 3380
								GrandExchangeOfferTotalQuantityComparator.invalidateWidget(NPCComposition.field1991); // L: 3381
								NPCComposition.field1991 = null; // L: 3382
							}
						}

						Widget var41 = class144.mousedOverWidgetIf1; // L: 3385
						Widget var34 = class113.field1422; // L: 3386
						class144.mousedOverWidgetIf1 = null; // L: 3387
						class113.field1422 = null; // L: 3388
						draggedOnWidget = null; // L: 3389
						field675 = false; // L: 3390
						field574 = false; // L: 3391
						field719 = 0; // L: 3392

						while (TaskHandler.isKeyDown() && field719 < 128) { // L: 3393
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && class12.field61 == 66) { // L: 3394
								StringBuilder var47 = new StringBuilder(); // L: 3397

								Message var42;
								for (Iterator var48 = Messages.Messages_hashTable.iterator(); var48.hasNext(); var47.append(var42.text).append('\n')) { // L: 3398 3404
									var42 = (Message)var48.next(); // L: 3399
									if (var42.sender != null && !var42.sender.isEmpty()) { // L: 3401
										var47.append(var42.sender).append(':'); // L: 3402
									}
								}

								String var53 = var47.toString(); // L: 3407
								class82.client.method429(var53); // L: 3410
							} else if (oculusOrbState != 1 || InvDefinition.field1850 <= 0) { // L: 3413
								field721[field719] = class12.field61; // L: 3416
								field720[field719] = InvDefinition.field1850; // L: 3417
								++field719; // L: 3418
							}
						}

						boolean var35 = staffModLevel >= 2; // L: 3422
						if (var35 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) { // L: 3424
							var4 = ModelData0.localPlayer.plane - mouseWheelRotation; // L: 3425
							if (var4 < 0) { // L: 3426
								var4 = 0;
							} else if (var4 > 3) { // L: 3427
								var4 = 3;
							}

							if (var4 != ModelData0.localPlayer.plane) { // L: 3428
								class123.method2781(ModelData0.localPlayer.pathX[0] + SecureRandomCallable.baseX, ModelData0.localPlayer.pathY[0] + GrandExchangeOfferOwnWorldComparator.baseY, var4, false); // L: 3429
							}

							mouseWheelRotation = 0; // L: 3431
						}

						if (rootInterface != -1) { // L: 3433
							class4.updateRootInterface(rootInterface, 0, 0, GraphicsObject.canvasWidth, class433.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3434

						while (true) {
							Widget var43;
							ScriptEvent var49;
							Widget var50;
							do {
								var49 = (ScriptEvent)field698.removeLast(); // L: 3436
								if (var49 == null) { // L: 3437
									while (true) {
										do {
											var49 = (ScriptEvent)field701.removeLast(); // L: 3448
											if (var49 == null) { // L: 3449
												while (true) {
													do {
														var49 = (ScriptEvent)scriptEvents.removeLast(); // L: 3460
														if (var49 == null) { // L: 3461
															this.menu(); // L: 3471
															if (ServerPacket.worldMap != null) { // L: 3473
																ServerPacket.worldMap.method7033(class128.Client_plane, (ModelData0.localPlayer.x >> 7) + SecureRandomCallable.baseX, (ModelData0.localPlayer.y >> 7) + GrandExchangeOfferOwnWorldComparator.baseY, false); // L: 3474
																ServerPacket.worldMap.loadCache(); // L: 3475
															}

															if (clickedWidget != null) { // L: 3478
																this.method1150();
															}

															if (Canvas.dragInventoryWidget != null) { // L: 3479
																GrandExchangeOfferTotalQuantityComparator.invalidateWidget(Canvas.dragInventoryWidget); // L: 3480
																++itemDragDuration; // L: 3481
																if (MouseHandler.MouseHandler_currentButton == 0) { // L: 3482
																	if (field604) { // L: 3483
																		if (Canvas.dragInventoryWidget == class155.hoveredItemContainer && dragItemSlotSource != dragItemSlotDestination) { // L: 3484
																			Widget var52 = Canvas.dragInventoryWidget; // L: 3485
																			byte var36 = 0; // L: 3486
																			if (field480 == 1 && var52.contentType == 206) { // L: 3487
																				var36 = 1;
																			}

																			if (var52.itemIds[dragItemSlotDestination] <= 0) { // L: 3488
																				var36 = 0;
																			}

																			var7 = UrlRequester.getWidgetFlags(var52); // L: 3490
																			boolean var37 = (var7 >> 29 & 1) != 0; // L: 3492
																			if (var37) { // L: 3494
																				var8 = dragItemSlotSource; // L: 3495
																				var9 = dragItemSlotDestination; // L: 3496
																				var52.itemIds[var9] = var52.itemIds[var8]; // L: 3497
																				var52.itemQuantities[var9] = var52.itemQuantities[var8]; // L: 3498
																				var52.itemIds[var8] = -1; // L: 3499
																				var52.itemQuantities[var8] = 0; // L: 3500
																			} else if (var36 == 1) { // L: 3502
																				var8 = dragItemSlotSource; // L: 3503
																				var9 = dragItemSlotDestination; // L: 3504

																				while (var8 != var9) { // L: 3505
																					if (var8 > var9) { // L: 3506
																						var52.swapItems(var8 - 1, var8); // L: 3507
																						--var8; // L: 3508
																					} else if (var8 < var9) { // L: 3510
																						var52.swapItems(var8 + 1, var8); // L: 3511
																						++var8; // L: 3512
																					}
																				}
																			} else {
																				var52.swapItems(dragItemSlotDestination, dragItemSlotSource); // L: 3517
																			}

																			PacketBufferNode var26 = WallDecoration.getPacketBufferNode(ClientPacket.field3042, packetWriter.isaacCipher); // L: 3520
																			var26.packetBuffer.writeShort(dragItemSlotSource); // L: 3521
																			var26.packetBuffer.writeShort(dragItemSlotDestination); // L: 3522
																			var26.packetBuffer.writeByte(var36); // L: 3523
																			var26.packetBuffer.writeInt(Canvas.dragInventoryWidget.id); // L: 3524
																			packetWriter.addNode(var26); // L: 3525
																		}
																	} else if (this.shouldLeftClickOpenMenu()) { // L: 3529
																		this.openMenu(draggedWidgetX, draggedWidgetY); // L: 3530
																	} else if (menuOptionsCount > 0) { // L: 3532
																		var4 = draggedWidgetX; // L: 3533
																		var5 = draggedWidgetY; // L: 3534
																		MenuAction var44 = class116.tempMenuAction; // L: 3536
																		if (var44 != null) { // L: 3538
																			ModeWhere.menuAction(var44.param0, var44.param1, var44.opcode, var44.identifier, var44.action, var44.action, var4, var5); // L: 3539
																		}

																		class116.tempMenuAction = null; // L: 3542
																	}

																	field598 = 10; // L: 3546
																	MouseHandler.MouseHandler_lastButton = 0; // L: 3547
																	Canvas.dragInventoryWidget = null; // L: 3548
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) { // L: 3551 3552
																	field604 = true; // L: 3553
																}
															}

															if (Scene.shouldSendWalk()) { // L: 3558
																var4 = Scene.Scene_selectedX; // L: 3559
																var5 = Scene.Scene_selectedY; // L: 3560
																var18 = WallDecoration.getPacketBufferNode(ClientPacket.field2957, packetWriter.isaacCipher); // L: 3562
																var18.packetBuffer.writeByte(5); // L: 3563
																var18.packetBuffer.method7596(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3564
																var18.packetBuffer.method7641(var5 + GrandExchangeOfferOwnWorldComparator.baseY); // L: 3565
																var18.packetBuffer.writeShort(var4 + SecureRandomCallable.baseX); // L: 3566
																packetWriter.addNode(var18); // L: 3567
																Scene.method4066(); // L: 3568
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3569
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3570
																mouseCrossColor = 1; // L: 3571
																mouseCrossState = 0; // L: 3572
																destinationX = var4; // L: 3573
																destinationY = var5; // L: 3574
															}

															if (var41 != class144.mousedOverWidgetIf1) { // L: 3576
																if (var41 != null) { // L: 3577
																	GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var41);
																}

																if (class144.mousedOverWidgetIf1 != null) { // L: 3578
																	GrandExchangeOfferTotalQuantityComparator.invalidateWidget(class144.mousedOverWidgetIf1);
																}
															}

															if (var34 != class113.field1422 && field645 == field702) { // L: 3580
																if (var34 != null) { // L: 3581
																	GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var34);
																}

																if (class113.field1422 != null) { // L: 3582
																	GrandExchangeOfferTotalQuantityComparator.invalidateWidget(class113.field1422);
																}
															}

															if (class113.field1422 != null) { // L: 3584
																if (field645 < field702) { // L: 3585
																	++field645; // L: 3586
																	if (field645 == field702) { // L: 3587
																		GrandExchangeOfferTotalQuantityComparator.invalidateWidget(class113.field1422);
																	}
																}
															} else if (field645 > 0) { // L: 3590
																--field645;
															}

															if (oculusOrbState == 0) { // L: 3592
																var4 = ModelData0.localPlayer.x; // L: 3593
																var5 = ModelData0.localPlayer.y; // L: 3594
																if (HorizontalAlignment.oculusOrbFocalPointX - var4 < -500 || HorizontalAlignment.oculusOrbFocalPointX - var4 > 500 || class28.oculusOrbFocalPointY - var5 < -500 || class28.oculusOrbFocalPointY - var5 > 500) { // L: 3595
																	HorizontalAlignment.oculusOrbFocalPointX = var4; // L: 3596
																	class28.oculusOrbFocalPointY = var5; // L: 3597
																}

																if (var4 != HorizontalAlignment.oculusOrbFocalPointX) { // L: 3599
																	HorizontalAlignment.oculusOrbFocalPointX += (var4 - HorizontalAlignment.oculusOrbFocalPointX) / 16;
																}

																if (var5 != class28.oculusOrbFocalPointY) { // L: 3600
																	class28.oculusOrbFocalPointY += (var5 - class28.oculusOrbFocalPointY) / 16;
																}

																var6 = HorizontalAlignment.oculusOrbFocalPointX >> 7; // L: 3601
																var7 = class28.oculusOrbFocalPointY >> 7; // L: 3602
																var8 = class202.getTileHeight(HorizontalAlignment.oculusOrbFocalPointX, class28.oculusOrbFocalPointY, class128.Client_plane); // L: 3603
																var9 = 0; // L: 3604
																if (var6 > 3 && var7 > 3 && var6 < 100 && var7 < 100) { // L: 3605
																	for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) { // L: 3606
																		for (var11 = var7 - 4; var11 <= var7 + 4; ++var11) { // L: 3607
																			var12 = class128.Client_plane; // L: 3608
																			if (var12 < 3 && (Tiles.Tiles_renderFlags[1][var10][var11] & 2) == 2) { // L: 3609
																				++var12;
																			}

																			int var27 = var8 - Tiles.Tiles_heights[var12][var10][var11]; // L: 3610
																			if (var27 > var9) { // L: 3611
																				var9 = var27;
																			}
																		}
																	}
																}

																var10 = var9 * 192; // L: 3615
																if (var10 > 98048) { // L: 3616
																	var10 = 98048;
																}

																if (var10 < 32768) { // L: 3617
																	var10 = 32768;
																}

																if (var10 > field578) { // L: 3618
																	field578 += (var10 - field578) / 24;
																} else if (var10 < field578) { // L: 3619
																	field578 += (var10 - field578) / 80;
																}

																class140.field1666 = class202.getTileHeight(ModelData0.localPlayer.x, ModelData0.localPlayer.y, class128.Client_plane) - camFollowHeight; // L: 3620
															} else if (oculusOrbState == 1) { // L: 3622
																if (field575 && ModelData0.localPlayer != null) { // L: 3624
																	var4 = ModelData0.localPlayer.pathX[0]; // L: 3625
																	var5 = ModelData0.localPlayer.pathY[0]; // L: 3626
																	if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 3627
																		HorizontalAlignment.oculusOrbFocalPointX = ModelData0.localPlayer.x; // L: 3628
																		var6 = class202.getTileHeight(ModelData0.localPlayer.x, ModelData0.localPlayer.y, class128.Client_plane) - camFollowHeight; // L: 3629
																		if (var6 < class140.field1666) { // L: 3630
																			class140.field1666 = var6;
																		}

																		class28.oculusOrbFocalPointY = ModelData0.localPlayer.y; // L: 3631
																		field575 = false; // L: 3632
																	}
																}

																short var38 = -1; // L: 3635
																if (KeyHandler.KeyHandler_pressedKeys[33]) { // L: 3636
																	var38 = 0;
																} else if (KeyHandler.KeyHandler_pressedKeys[49]) { // L: 3637
																	var38 = 1024;
																}

																if (KeyHandler.KeyHandler_pressedKeys[48]) { // L: 3638
																	if (var38 == 0) { // L: 3639
																		var38 = 1792;
																	} else if (var38 == 1024) { // L: 3640
																		var38 = 1280;
																	} else {
																		var38 = 1536; // L: 3641
																	}
																} else if (KeyHandler.KeyHandler_pressedKeys[50]) { // L: 3643
																	if (var38 == 0) { // L: 3644
																		var38 = 256;
																	} else if (var38 == 1024) { // L: 3645
																		var38 = 768;
																	} else {
																		var38 = 512; // L: 3646
																	}
																}

																byte var39 = 0; // L: 3648
																if (KeyHandler.KeyHandler_pressedKeys[35]) { // L: 3649
																	var39 = -1;
																} else if (KeyHandler.KeyHandler_pressedKeys[51]) { // L: 3650
																	var39 = 1;
																}

																var6 = 0; // L: 3651
																if (var38 >= 0 || var39 != 0) { // L: 3652
																	var6 = KeyHandler.KeyHandler_pressedKeys[81] ? oculusOrbSlowedSpeed * -175885413 * -1650197869 : oculusOrbNormalSpeed * 208832309 * 1073664797; // L: 3653
																	var6 *= 16; // L: 3654
																	field567 = var38; // L: 3655
																	field571 = var39; // L: 3656
																}

																if (field569 < var6) { // L: 3658
																	field569 += var6 / 8; // L: 3659
																	if (field569 > var6) { // L: 3660
																		field569 = var6;
																	}
																} else if (field569 > var6) { // L: 3662
																	field569 = field569 * 9 / 10;
																}

																if (field569 > 0) { // L: 3663
																	var7 = field569 / 16; // L: 3664
																	if (field567 >= 0) { // L: 3665
																		var4 = field567 - StudioGame.cameraYaw & 2047; // L: 3666
																		var8 = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 3667
																		var9 = Rasterizer3D.Rasterizer3D_cosine[var4]; // L: 3668
																		HorizontalAlignment.oculusOrbFocalPointX += var8 * var7 / 65536; // L: 3669
																		class28.oculusOrbFocalPointY += var9 * var7 / 65536; // L: 3670
																	}

																	if (field571 != 0) { // L: 3672
																		class140.field1666 += var7 * field571; // L: 3673
																		if (class140.field1666 > 0) { // L: 3674
																			class140.field1666 = 0;
																		}
																	}
																} else {
																	field567 = -1; // L: 3678
																	field571 = -1; // L: 3679
																}

																if (KeyHandler.KeyHandler_pressedKeys[13]) { // L: 3681
																	class4.method22(); // L: 3682
																}
															}

															if (MouseHandler.MouseHandler_currentButton == 4 && Login.mouseCam) { // L: 3685
																var4 = MouseHandler.MouseHandler_y - mouseCamClickedY; // L: 3686
																camAngleDX = var4 * 2; // L: 3687
																mouseCamClickedY = var4 != -1 && var4 != 1 ? (MouseHandler.MouseHandler_y + mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y * -1263316171 * -1077369059; // L: 3688
																var5 = mouseCamClickedX - MouseHandler.MouseHandler_x; // L: 3689
																camAngleDY = var5 * 2; // L: 3690
																mouseCamClickedX = var5 != -1 && var5 != 1 ? (mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x * 1681939429 * -130913811; // L: 3691
															} else {
																if (KeyHandler.KeyHandler_pressedKeys[96]) { // L: 3694
																	camAngleDY += (-24 - camAngleDY) / 2;
																} else if (KeyHandler.KeyHandler_pressedKeys[97]) { // L: 3695
																	camAngleDY += (24 - camAngleDY) / 2;
																} else {
																	camAngleDY /= 2; // L: 3696
																}

																if (KeyHandler.KeyHandler_pressedKeys[98]) { // L: 3697
																	camAngleDX += (12 - camAngleDX) / 2;
																} else if (KeyHandler.KeyHandler_pressedKeys[99]) { // L: 3698
																	camAngleDX += (-12 - camAngleDX) / 2;
																} else {
																	camAngleDX /= 2; // L: 3699
																}

																mouseCamClickedY = MouseHandler.MouseHandler_y; // L: 3700
																mouseCamClickedX = MouseHandler.MouseHandler_x; // L: 3701
															}

															camAngleY = camAngleDY / 2 + camAngleY & 2047; // L: 3703
															camAngleX += camAngleDX / 2; // L: 3704
															if (camAngleX < 128) { // L: 3705
																camAngleX = 128;
															}

															if (camAngleX > 383) { // L: 3706
																camAngleX = 383;
															}

															if (field742) { // L: 3708
																class422.method7303(class271.field3221, Message.field469, NPC.field1262); // L: 3709
																class241.method4813(Interpreter.field838, Timer.field4239); // L: 3710
																if (class271.field3221 == class343.cameraX && class295.cameraY == Message.field469 && FaceNormal.cameraZ == NPC.field1262 && Interpreter.field838 == GameEngine.cameraPitch && StudioGame.cameraYaw == Timer.field4239) { // L: 3711
																	field742 = false; // L: 3712
																	isCameraLocked = false; // L: 3713
																	class267.field3206 = 0; // L: 3714
																	AbstractWorldMapData.field2851 = 0; // L: 3715
																	ScriptFrame.field457 = 0; // L: 3716
																	class17.field88 = 0; // L: 3717
																	PacketBufferNode.field3083 = 0; // L: 3718
																	HitSplatDefinition.field2077 = 0; // L: 3719
																	class229.field2805 = 0; // L: 3720
																	Players.field1317 = 0; // L: 3721
																	TileItem.field1292 = 0; // L: 3722
																	WorldMapSection1.field2898 = 0; // L: 3723
																}
															} else if (isCameraLocked) { // L: 3727
																class1.method11();
															}

															for (var4 = 0; var4 < 5; ++var4) { // L: 3728
																var10002 = field677[var4]++;
															}

															class125.varcs.tryWrite(); // L: 3729
															var4 = class293.method5429(); // L: 3730
															var5 = ObjectSound.method1734(); // L: 3731
															if (var4 > 15000 && var5 > 15000) { // L: 3732
																logoutTimer = 250; // L: 3733
																MouseHandler.MouseHandler_idleCycles = 14500; // L: 3735
																var18 = WallDecoration.getPacketBufferNode(ClientPacket.field3027, packetWriter.isaacCipher); // L: 3738
																packetWriter.addNode(var18); // L: 3739
															}

															BufferedSource.friendSystem.processFriendUpdates(); // L: 3741
															++packetWriter.pendingWrites; // L: 3742
															if (packetWriter.pendingWrites > 50) { // L: 3743
																var18 = WallDecoration.getPacketBufferNode(ClientPacket.field2982, packetWriter.isaacCipher); // L: 3745
																packetWriter.addNode(var18); // L: 3746
															}

															try {
																packetWriter.flush(); // L: 3749
															} catch (IOException var28) { // L: 3751
																class129.method2812(); // L: 3752
															}

															return; // L: 3754
														}

														var50 = var49.widget; // L: 3462
														if (var50.childIndex < 0) { // L: 3463
															break;
														}

														var43 = class92.getWidget(var50.parentId); // L: 3464
													} while(var43 == null || var43.children == null || var50.childIndex >= var43.children.length || var50 != var43.children[var50.childIndex]); // L: 3465

													class144.runScriptEvent(var49); // L: 3469
												}
											}

											var50 = var49.widget; // L: 3450
											if (var50.childIndex < 0) { // L: 3451
												break;
											}

											var43 = class92.getWidget(var50.parentId); // L: 3452
										} while(var43 == null || var43.children == null || var50.childIndex >= var43.children.length || var50 != var43.children[var50.childIndex]); // L: 3453

										class144.runScriptEvent(var49); // L: 3457
									}
								}

								var50 = var49.widget; // L: 3438
								if (var50.childIndex < 0) { // L: 3439
									break;
								}

								var43 = class92.getWidget(var50.parentId); // L: 3440
							} while(var43 == null || var43.children == null || var50.childIndex >= var43.children.length || var50 != var43.children[var50.childIndex]); // L: 3441

							class144.runScriptEvent(var49); // L: 3445
						}
					}

					var31 = WallDecoration.getPacketBufferNode(ClientPacket.field3047, packetWriter.isaacCipher); // L: 3096
					var31.packetBuffer.writeByte(0); // L: 3097
					var3 = var31.packetBuffer.offset; // L: 3098
					UserComparator3.performReflectionCheck(var31.packetBuffer); // L: 3099
					var31.packetBuffer.method7740(var31.packetBuffer.offset - var3); // L: 3100
					packetWriter.addNode(var31); // L: 3101
				}
			}
		}
	} // L: 3078

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1836577440"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = GraphicsObject.canvasWidth; // L: 4381
		int var2 = class433.canvasHeight; // L: 4382
		if (super.contentWidth < var1) { // L: 4383
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight; // L: 4384
		}

		if (class12.clientPreferences != null) { // L: 4385
			try {
				Client var3 = class82.client; // L: 4387
				Object[] var4 = new Object[]{ClanChannelMember.getWindowedMode()}; // L: 4388
				JSObject.getWindow(var3).call("resize", var4); // L: 4391
			} catch (Throwable var5) { // L: 4394
			}
		}

	} // L: 4396

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "296030878"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) { // L: 4399
			var1 = rootInterface; // L: 4400
			if (WorldMapDecoration.loadInterface(var1)) { // L: 4402
				class342.drawModelComponents(NetSocket.Widget_interfaceComponents[var1], -1); // L: 4403
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4406
			if (field652[var1]) { // L: 4407
				field704[var1] = true;
			}

			field524[var1] = field652[var1]; // L: 4408
			field652[var1] = false; // L: 4409
		}

		field694 = cycle; // L: 4411
		viewportX = -1; // L: 4412
		viewportY = -1; // L: 4413
		class155.hoveredItemContainer = null; // L: 4414
		if (rootInterface != -1) { // L: 4415
			rootWidgetCount = 0; // L: 4416
			class175.drawWidgets(rootInterface, 0, 0, GraphicsObject.canvasWidth, class433.canvasHeight, 0, 0, -1); // L: 4417
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 4419
		if (showMouseCross) { // L: 4420
			if (mouseCrossColor == 1) { // L: 4421
				Projectile.crossSprites[mouseCrossState / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4422
			}

			if (mouseCrossColor == 2) { // L: 4424
				Projectile.crossSprites[mouseCrossState / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4425
			}
		}

		int var2;
		int var3;
		int var4;
		int var6;
		int var7;
		int var8;
		if (!isMenuOpen) { // L: 4428
			if (viewportX != -1) { // L: 4429
				var1 = viewportX; // L: 4430
				var2 = viewportY; // L: 4431
				if ((menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) { // L: 4433 4434
					var3 = menuOptionsCount - 1; // L: 4437
					String var13;
					if (isItemSelected == 1 && menuOptionsCount < 2) { // L: 4441
						var13 = "Use" + " " + selectedItemName + " " + "->";
					} else if (isSpellSelected && menuOptionsCount < 2) { // L: 4442
						var13 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
					} else {
						String var14;
						if (var3 < 0) { // L: 4446
							var14 = ""; // L: 4447
						} else if (menuTargets[var3].length() > 0) { // L: 4450
							var14 = menuActions[var3] + " " + menuTargets[var3];
						} else {
							var14 = menuActions[var3]; // L: 4451
						}

						var13 = var14; // L: 4453
					}

					if (menuOptionsCount > 2) { // L: 4455
						var13 = var13 + class166.colorStartTag(16777215) + " " + '/' + " " + (menuOptionsCount - 2) + " more options";
					}

					ChatChannel.fontBold12.drawRandomAlphaAndSpacing(var13, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000); // L: 4456
				}
			}
		} else {
			var1 = BuddyRankComparator.menuX; // L: 4461
			var2 = FontName.menuY; // L: 4462
			var3 = KeyHandler.menuWidth; // L: 4463
			var4 = class7.menuHeight; // L: 4464
			int var5 = 6116423; // L: 4465
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5); // L: 4466
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0); // L: 4467
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0); // L: 4468
			ChatChannel.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1); // L: 4469
			var6 = MouseHandler.MouseHandler_x; // L: 4470
			var7 = MouseHandler.MouseHandler_y; // L: 4471

			for (var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 4472
				int var9 = var2 + (menuOptionsCount - 1 - var8) * 15 + 31; // L: 4473
				int var10 = 16777215; // L: 4474
				if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) { // L: 4475
					var10 = 16776960;
				}

				Font var11 = ChatChannel.fontBold12; // L: 4476
				String var12;
				if (var8 < 0) { // L: 4479
					var12 = ""; // L: 4480
				} else if (menuTargets[var8].length() > 0) { // L: 4483
					var12 = menuActions[var8] + " " + menuTargets[var8];
				} else {
					var12 = menuActions[var8]; // L: 4484
				}

				var11.draw(var12, var1 + 3, var9, var10, 0); // L: 4486
			}

			ItemContainer.method2061(BuddyRankComparator.menuX, FontName.menuY, KeyHandler.menuWidth, class7.menuHeight); // L: 4488
		}

		if (gameDrawingMode == 3) { // L: 4490
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4491
				if (field524[var1]) { // L: 4492
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4493
				} else if (field704[var1]) { // L: 4495
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4496
				}
			}
		}

		var1 = class128.Client_plane; // L: 4500
		var2 = ModelData0.localPlayer.x; // L: 4501
		var3 = ModelData0.localPlayer.y; // L: 4502
		var4 = field727; // L: 4503

		for (ObjectSound var19 = (ObjectSound)ObjectSound.objectSounds.last(); var19 != null; var19 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 4505
			if (var19.soundEffectId != -1 || var19.soundEffectIds != null) { // L: 4506
				var6 = 0; // L: 4507
				if (var2 > var19.maxX) { // L: 4508
					var6 += var2 - var19.maxX;
				} else if (var2 < var19.x) { // L: 4509
					var6 += var19.x - var2;
				}

				if (var3 > var19.maxY) {
					var6 += var3 - var19.maxY; // L: 4510
				} else if (var3 < var19.y) { // L: 4511
					var6 += var19.y - var3;
				}

				if (var6 - 64 <= var19.field817 && class12.clientPreferences.method2239() != 0 && var1 == var19.plane) { // L: 4512
					var6 -= 64; // L: 4523
					if (var6 < 0) { // L: 4524
						var6 = 0;
					}

					var7 = (var19.field817 - var6) * class12.clientPreferences.method2239() / var19.field817; // L: 4525
					Object var10000;
					if (var19.stream1 == null) { // L: 4526
						if (var19.soundEffectId >= 0) { // L: 4527
							var10000 = null; // L: 4528
							SoundEffect var15 = SoundEffect.readSoundEffect(MouseHandler.archive4, var19.soundEffectId, 0);
							if (var15 != null) { // L: 4529
								RawSound var16 = var15.toRawSound().resample(class403.decimator); // L: 4530
								RawPcmStream var17 = RawPcmStream.createRawPcmStream(var16, 100, var7); // L: 4531
								var17.setNumLoops(-1); // L: 4532
								class122.pcmStreamMixer.addSubStream(var17); // L: 4533
								var19.stream1 = var17; // L: 4534
							}
						}
					} else {
						var19.stream1.method802(var7); // L: 4538
					}

					if (var19.stream2 == null) { // L: 4539
						if (var19.soundEffectIds != null && (var19.field810 -= var4) <= 0) { // L: 4540
							var8 = (int)(Math.random() * (double)var19.soundEffectIds.length); // L: 4541
							var10000 = null; // L: 4542
							SoundEffect var20 = SoundEffect.readSoundEffect(MouseHandler.archive4, var19.soundEffectIds[var8], 0);
							if (var20 != null) { // L: 4543
								RawSound var21 = var20.toRawSound().resample(class403.decimator); // L: 4544
								RawPcmStream var18 = RawPcmStream.createRawPcmStream(var21, 100, var7); // L: 4545
								var18.setNumLoops(0); // L: 4546
								class122.pcmStreamMixer.addSubStream(var18); // L: 4547
								var19.stream2 = var18; // L: 4548
								var19.field810 = var19.field813 + (int)(Math.random() * (double)(var19.field808 - var19.field813)); // L: 4549
							}
						}
					} else {
						var19.stream2.method802(var7); // L: 4554
						if (!var19.stream2.hasNext()) { // L: 4555
							var19.stream2 = null; // L: 4556
						}
					}
				} else {
					if (var19.stream1 != null) { // L: 4513
						class122.pcmStreamMixer.removeSubStream(var19.stream1); // L: 4514
						var19.stream1 = null; // L: 4515
					}

					if (var19.stream2 != null) { // L: 4517
						class122.pcmStreamMixer.removeSubStream(var19.stream2); // L: 4518
						var19.stream2 = null; // L: 4519
					}
				}
			}
		}

		field727 = 0; // L: 4561
	} // L: 4562

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(Lcz;I)Z",
		garbageValue = "1953749853"
	)
	final boolean method1254(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 6121
		PacketBuffer var3 = var1.packetBuffer; // L: 6122
		if (var2 == null) { // L: 6123
			return false;
		} else {
			int var6;
			String var21;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 6125
					if (var1.field1348) { // L: 6126
						if (!var2.isAvailable(1)) { // L: 6127
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 6128
						var1.field1349 = 0; // L: 6129
						var1.field1348 = false; // L: 6130
					}

					var3.offset = 0; // L: 6132
					if (var3.method7495()) { // L: 6133
						if (!var2.isAvailable(1)) { // L: 6134
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 6135
						var1.field1349 = 0; // L: 6136
					}

					var1.field1348 = true; // L: 6138
					ServerPacket[] var4 = BuddyRankComparator.ServerPacket_values(); // L: 6139
					var5 = var3.readSmartByteShortIsaac(); // L: 6140
					if (var5 < 0 || var5 >= var4.length) { // L: 6141
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 6142
					var1.serverPacketLength = var1.serverPacket.length; // L: 6143
				}

				if (var1.serverPacketLength == -1) { // L: 6145
					if (!var2.isAvailable(1)) { // L: 6146
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 6147
					var1.serverPacketLength = var3.array[0] & 255; // L: 6148
				}

				if (var1.serverPacketLength == -2) { // L: 6150
					if (!var2.isAvailable(2)) { // L: 6151
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 6152
					var3.offset = 0; // L: 6153
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 6154
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 6156
					return false;
				}

				var3.offset = 0; // L: 6157
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 6158
				var1.field1349 = 0; // L: 6159
				timer.method6374(); // L: 6160
				var1.field1345 = var1.field1340; // L: 6161
				var1.field1340 = var1.field1351; // L: 6162
				var1.field1351 = var1.serverPacket; // L: 6163
				if (ServerPacket.field3141 == var1.serverPacket) { // L: 6164
					UserComparator8.field1378 = new class392(class221.HitSplatDefinition_cached); // L: 6165
					var1.serverPacket = null; // L: 6166
					return true; // L: 6167
				}

				int var67;
				if (ServerPacket.field3131 == var1.serverPacket) { // L: 6169
					var67 = var3.readInt(); // L: 6170
					if (var67 != field482) { // L: 6171
						field482 = var67; // L: 6172
						class134.method2850(); // L: 6173
					}

					var1.serverPacket = null; // L: 6175
					return true; // L: 6176
				}

				if (ServerPacket.field3099 == var1.serverPacket) { // L: 6178
					class119.method2737(); // L: 6179
					runEnergy = var3.readUnsignedByte(); // L: 6180
					field695 = cycleCntr; // L: 6181
					var1.serverPacket = null; // L: 6182
					return true; // L: 6183
				}

				if (ServerPacket.field3113 == var1.serverPacket) { // L: 6185
					var67 = var3.readUnsignedByte(); // L: 6186
					var21 = var3.readStringCp1252NullTerminated(); // L: 6187
					var6 = var3.method7593(); // L: 6188
					if (var6 >= 1 && var6 <= 8) { // L: 6189
						if (var21.equalsIgnoreCase("null")) { // L: 6190
							var21 = null;
						}

						playerMenuActions[var6 - 1] = var21; // L: 6191
						playerOptionsPriorities[var6 - 1] = var67 == 0; // L: 6192
					}

					var1.serverPacket = null; // L: 6194
					return true; // L: 6195
				}

				Widget var22;
				if (ServerPacket.field3148 == var1.serverPacket) { // L: 6197
					var67 = var3.method7568(); // L: 6198
					var5 = var3.method7576(); // L: 6199
					var22 = class92.getWidget(var67); // L: 6200
					if (var22.modelType != 1 || var5 != var22.modelId) { // L: 6201
						var22.modelType = 1; // L: 6202
						var22.modelId = var5; // L: 6203
						GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var22); // L: 6204
					}

					var1.serverPacket = null; // L: 6206
					return true; // L: 6207
				}

				if (ServerPacket.field3092 == var1.serverPacket) { // L: 6209
					BufferedSource.friendSystem.method1667(); // L: 6210
					field689 = cycleCntr; // L: 6211
					var1.serverPacket = null; // L: 6212
					return true; // L: 6213
				}

				GameObject var14;
				int var15;
				int var16;
				byte var20;
				String var25;
				if (ServerPacket.field3103 == var1.serverPacket) { // L: 6215
					var20 = var3.readByte(); // L: 6216
					var21 = var3.readStringCp1252NullTerminated(); // L: 6217
					long var23 = (long)var3.readUnsignedShort(); // L: 6218
					long var8 = (long)var3.readMedium(); // L: 6219
					PlayerType var59 = (PlayerType)class291.findEnumerated(class118.PlayerType_values(), var3.readUnsignedByte()); // L: 6220
					long var11 = var8 + (var23 << 32); // L: 6221
					boolean var64 = false; // L: 6222
					var14 = null; // L: 6223
					ClanChannel var66 = var20 >= 0 ? currentClanChannels[var20] : UserComparator10.guestClanChannel; // L: 6225
					if (var66 == null) { // L: 6226
						var64 = true; // L: 6227
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var59.isUser && BufferedSource.friendSystem.isIgnored(new Username(var21, class391.loginType))) { // L: 6236 6237
									var64 = true;
								}
								break;
							}

							if (crossWorldMessageIds[var15] == var11) { // L: 6231
								var64 = true; // L: 6232
								break; // L: 6233
							}

							++var15; // L: 6230
						}
					}

					if (!var64) { // L: 6240
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var11; // L: 6241
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6242
						var25 = AbstractFont.escapeBrackets(LoginPacket.method5025(var3)); // L: 6243
						var16 = var20 >= 0 ? 41 : 44; // L: 6244
						if (var59.modIcon != -1) { // L: 6245
							UserComparator7.addChatMessage(var16, StudioGame.method5590(var59.modIcon) + var21, var25, var66.name);
						} else {
							UserComparator7.addChatMessage(var16, var21, var25, var66.name); // L: 6246
						}
					}

					var1.serverPacket = null; // L: 6248
					return true; // L: 6249
				}

				if (ServerPacket.field3155 == var1.serverPacket) { // L: 6251
					var67 = var3.readUnsignedByte(); // L: 6252
					class193.method3800(var67); // L: 6253
					var1.serverPacket = null; // L: 6254
					return true; // L: 6255
				}

				if (ServerPacket.field3122 == var1.serverPacket) { // L: 6257
					UserComparator8.field1378 = null; // L: 6258
					var1.serverPacket = null; // L: 6259
					return true; // L: 6260
				}

				Widget var55;
				if (ServerPacket.field3174 == var1.serverPacket) { // L: 6262
					var67 = var3.method7576(); // L: 6263
					if (var67 == 65535) { // L: 6264
						var67 = -1;
					}

					var5 = var3.method7701(); // L: 6265
					var6 = var3.method7701(); // L: 6266
					var55 = class92.getWidget(var6); // L: 6267
					ItemComposition var81;
					if (!var55.isIf3) { // L: 6268
						if (var67 == -1) { // L: 6269
							var55.modelType = 0; // L: 6270
							var1.serverPacket = null; // L: 6271
							return true; // L: 6272
						}

						var81 = FileSystem.ItemDefinition_get(var67); // L: 6274
						var55.modelType = 4; // L: 6275
						var55.modelId = var67; // L: 6276
						var55.modelAngleX = var81.xan2d; // L: 6277
						var55.modelAngleY = var81.yan2d; // L: 6278
						var55.modelZoom = var81.zoom2d * 100 / var5; // L: 6279
						GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var55); // L: 6280
					} else {
						var55.itemId = var67; // L: 6283
						var55.itemQuantity = var5; // L: 6284
						var81 = FileSystem.ItemDefinition_get(var67); // L: 6285
						var55.modelAngleX = var81.xan2d; // L: 6286
						var55.modelAngleY = var81.yan2d; // L: 6287
						var55.modelAngleZ = var81.zan2d; // L: 6288
						var55.modelOffsetX = var81.offsetX2d; // L: 6289
						var55.modelOffsetY = var81.offsetY2d; // L: 6290
						var55.modelZoom = var81.zoom2d; // L: 6291
						if (var81.isStackable == 1) { // L: 6292
							var55.itemQuantityMode = 1;
						} else {
							var55.itemQuantityMode = 2; // L: 6293
						}

						if (var55.field3406 > 0) { // L: 6294
							var55.modelZoom = var55.modelZoom * 32 / var55.field3406;
						} else if (var55.rawWidth > 0) { // L: 6295
							var55.modelZoom = var55.modelZoom * 32 / var55.rawWidth;
						}

						GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var55); // L: 6296
					}

					var1.serverPacket = null; // L: 6298
					return true; // L: 6299
				}

				if (ServerPacket.field3091 == var1.serverPacket) { // L: 6301
					class145.field1690 = var3.method7546(); // L: 6302
					class321.field4076 = var3.readUnsignedByte(); // L: 6303

					while (var3.offset < var1.serverPacketLength) { // L: 6304
						var67 = var3.readUnsignedByte(); // L: 6305
						class263 var78 = class194.method3807()[var67]; // L: 6306
						Occluder.method4222(var78); // L: 6307
					}

					var1.serverPacket = null; // L: 6309
					return true; // L: 6310
				}

				if (ServerPacket.field3095 == var1.serverPacket) { // L: 6312
					PendingSpawn.readReflectionCheck(var3, var1.serverPacketLength); // L: 6313
					var1.serverPacket = null; // L: 6314
					return true; // L: 6315
				}

				int var9;
				int var27;
				int var28;
				int var29;
				int var86;
				if (ServerPacket.field3158 == var1.serverPacket) { // L: 6317
					var6 = var3.readMedium(); // L: 6326
					var67 = var6 >> 16; // L: 6327
					var5 = var6 >> 8 & 255; // L: 6328
					var27 = var67 + (var6 >> 4 & 7); // L: 6329
					var28 = var5 + (var6 & 7); // L: 6330
					var9 = var3.readUnsignedShort(); // L: 6331
					var29 = var3.method7593(); // L: 6332
					var86 = var3.method7716(); // L: 6333
					if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) { // L: 6334
						var27 = var27 * 128 + 64; // L: 6335
						var28 = var28 * 128 + 64; // L: 6336
						GraphicsObject var60 = new GraphicsObject(var9, class128.Client_plane, var27, var28, class202.getTileHeight(var27, var28, class128.Client_plane) - var29, var86, cycle); // L: 6337
						graphicsObjects.addFirst(var60); // L: 6338
					}

					var1.serverPacket = null; // L: 6340
					return true; // L: 6341
				}

				if (ServerPacket.field3182 == var1.serverPacket) { // L: 6343
					var67 = var3.readInt(); // L: 6344
					InterfaceParent var77 = (InterfaceParent)interfaceParents.get((long)var67); // L: 6345
					if (var77 != null) { // L: 6346
						NetSocket.closeInterface(var77, true);
					}

					if (meslayerContinueWidget != null) { // L: 6347
						GrandExchangeOfferTotalQuantityComparator.invalidateWidget(meslayerContinueWidget); // L: 6348
						meslayerContinueWidget = null; // L: 6349
					}

					var1.serverPacket = null; // L: 6351
					return true; // L: 6352
				}

				if (ServerPacket.field3098 == var1.serverPacket) { // L: 6354
					var20 = var3.readByte(); // L: 6355
					var5 = var3.method7576(); // L: 6356
					Varps.Varps_temp[var5] = var20; // L: 6357
					if (Varps.Varps_main[var5] != var20) { // L: 6358
						Varps.Varps_main[var5] = var20; // L: 6359
					}

					class321.changeGameOptions(var5); // L: 6361
					changedVarps[++changedVarpCount - 1 & 31] = var5; // L: 6362
					var1.serverPacket = null; // L: 6363
					return true; // L: 6364
				}

				if (ServerPacket.field3165 == var1.serverPacket) { // L: 6366
					var67 = var3.method7554(); // L: 6367
					if (var67 == 65535) { // L: 6368
						var67 = -1;
					}

					WorldMapIcon_0.playSong(var67); // L: 6369
					var1.serverPacket = null; // L: 6370
					return true; // L: 6371
				}

				if (ServerPacket.field3096 == var1.serverPacket) { // L: 6373
					var67 = var3.readUnsignedShort(); // L: 6374
					if (var67 == 65535) { // L: 6375
						var67 = -1;
					}

					var5 = var3.method7503(); // L: 6376
					class306.method5593(var67, var5); // L: 6377
					var1.serverPacket = null; // L: 6378
					return true; // L: 6379
				}

				if (ServerPacket.field3112 == var1.serverPacket) { // L: 6381
					class119.method2737(); // L: 6382
					var67 = var3.method7701(); // L: 6383
					var5 = var3.method7545(); // L: 6384
					var6 = var3.method7545(); // L: 6385
					experience[var5] = var67; // L: 6386
					currentLevels[var5] = var6; // L: 6387
					levels[var5] = 1; // L: 6388

					for (var27 = 0; var27 < 98; ++var27) { // L: 6389
						if (var67 >= Skills.Skills_experienceTable[var27]) {
							levels[var5] = var27 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var5; // L: 6390
					var1.serverPacket = null; // L: 6391
					return true; // L: 6392
				}

				boolean var84;
				if (ServerPacket.field3140 == var1.serverPacket) { // L: 6394
					var84 = var3.readBoolean(); // L: 6395
					if (var84) { // L: 6396
						if (class127.field1570 == null) { // L: 6397
							class127.field1570 = new class326();
						}
					} else {
						class127.field1570 = null; // L: 6399
					}

					var1.serverPacket = null; // L: 6400
					return true; // L: 6401
				}

				String var48;
				if (ServerPacket.field3163 == var1.serverPacket) { // L: 6403
					var48 = var3.readStringCp1252NullTerminated(); // L: 6404
					var21 = AbstractFont.escapeBrackets(WorldMapManager.method4679(LoginPacket.method5025(var3))); // L: 6405
					WorldMapEvent.addGameMessage(6, var48, var21); // L: 6406
					var1.serverPacket = null; // L: 6407
					return true; // L: 6408
				}

				if (ServerPacket.field3166 == var1.serverPacket) { // L: 6410
					class144.loadRegions(false, var1.packetBuffer); // L: 6411
					var1.serverPacket = null; // L: 6412
					return true; // L: 6413
				}

				if (ServerPacket.field3162 == var1.serverPacket) { // L: 6415
					Occluder.method4222(class263.field3058); // L: 6416
					var1.serverPacket = null; // L: 6417
					return true; // L: 6418
				}

				if (ServerPacket.field3147 == var1.serverPacket) { // L: 6420
					isCameraLocked = false; // L: 6421

					for (var67 = 0; var67 < 5; ++var67) { // L: 6422
						field743[var67] = false;
					}

					var1.serverPacket = null; // L: 6423
					return true; // L: 6424
				}

				if (ServerPacket.field3186 == var1.serverPacket) { // L: 6426
					var67 = var3.readInt(); // L: 6427
					var5 = var3.readInt(); // L: 6428
					var6 = class17.getGcDuration(); // L: 6429
					PacketBufferNode var58 = WallDecoration.getPacketBufferNode(ClientPacket.field3053, packetWriter.isaacCipher); // L: 6431
					var58.packetBuffer.method7565(var67); // L: 6432
					var58.packetBuffer.method7565(var5); // L: 6433
					var58.packetBuffer.method7596(GameEngine.fps); // L: 6434
					var58.packetBuffer.method7596(var6); // L: 6435
					packetWriter.addNode(var58); // L: 6436
					var1.serverPacket = null; // L: 6437
					return true; // L: 6438
				}

				if (ServerPacket.field3169 == var1.serverPacket) { // L: 6440
					Occluder.method4222(class263.field3059); // L: 6441
					var1.serverPacket = null; // L: 6442
					return true; // L: 6443
				}

				if (ServerPacket.field3177 == var1.serverPacket) { // L: 6445
					Occluder.method4222(class263.field3067); // L: 6446
					var1.serverPacket = null; // L: 6447
					return true; // L: 6448
				}

				if (ServerPacket.field3134 == var1.serverPacket) { // L: 6450
					var84 = var3.method7593() == 1; // L: 6451
					var5 = var3.method7567(); // L: 6452
					var22 = class92.getWidget(var5); // L: 6453
					if (var84 != var22.isHidden) { // L: 6454
						var22.isHidden = var84; // L: 6455
						GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var22); // L: 6456
					}

					var1.serverPacket = null; // L: 6458
					return true; // L: 6459
				}

				if (ServerPacket.field3132 == var1.serverPacket && isCameraLocked) { // L: 6461 6462
					field742 = true; // L: 6463
					class229.field2805 = var3.readUnsignedByte(); // L: 6464
					HitSplatDefinition.field2077 = var3.readUnsignedByte(); // L: 6465
					class17.field88 = var3.readUnsignedByte(); // L: 6466
					PacketBufferNode.field3083 = var3.readUnsignedByte(); // L: 6467

					for (var67 = 0; var67 < 5; ++var67) { // L: 6468
						field743[var67] = false;
					}

					var1.serverPacket = null; // L: 6469
					return true; // L: 6470
				}

				String var76;
				if (ServerPacket.field3184 == var1.serverPacket) { // L: 6473
					byte[] var52 = new byte[var1.serverPacketLength]; // L: 6474
					var3.method7460(var52, 0, var52.length); // L: 6475
					Buffer var75 = new Buffer(var52); // L: 6476
					var76 = var75.readStringCp1252NullTerminated(); // L: 6477
					ScriptEvent.openURL(var76, true, false); // L: 6478
					var1.serverPacket = null; // L: 6479
					return true; // L: 6480
				}

				if (ServerPacket.field3084 == var1.serverPacket) { // L: 6482
					if (PcmPlayer.friendsChat != null) { // L: 6483
						PcmPlayer.friendsChat.method6463(var3); // L: 6484
					}

					class194.method3804(); // L: 6486
					var1.serverPacket = null; // L: 6487
					return true; // L: 6488
				}

				if (ServerPacket.field3187 == var1.serverPacket) { // L: 6490
					class393.field4428 = true; // L: 6491
					HorizontalAlignment.updateNpcs(false, var3); // L: 6492
					var1.serverPacket = null; // L: 6493
					return true; // L: 6494
				}

				if (ServerPacket.field3152 == var1.serverPacket) { // L: 6496
					for (var67 = 0; var67 < players.length; ++var67) { // L: 6497
						if (players[var67] != null) { // L: 6498
							players[var67].sequence = -1;
						}
					}

					for (var67 = 0; var67 < npcs.length; ++var67) { // L: 6500
						if (npcs[var67] != null) { // L: 6501
							npcs[var67].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 6503
					return true; // L: 6504
				}

				if (ServerPacket.field3157 == var1.serverPacket) { // L: 6506
					var67 = var3.method7554(); // L: 6507
					var5 = var3.readInt(); // L: 6508
					var6 = var3.method7716(); // L: 6509
					var55 = class92.getWidget(var5); // L: 6510
					var55.field3451 = var6 + (var67 << 16); // L: 6511
					var1.serverPacket = null; // L: 6512
					return true; // L: 6513
				}

				if (ServerPacket.field3097 == var1.serverPacket) { // L: 6515
					var67 = var3.method7568(); // L: 6516
					var5 = var3.method7716(); // L: 6517
					var22 = class92.getWidget(var67); // L: 6518
					if (var22 != null && var22.type == 0) { // L: 6519
						if (var5 > var22.scrollHeight - var22.height) { // L: 6520
							var5 = var22.scrollHeight - var22.height;
						}

						if (var5 < 0) { // L: 6521
							var5 = 0;
						}

						if (var5 != var22.scrollY) { // L: 6522
							var22.scrollY = var5; // L: 6523
							GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var22); // L: 6524
						}
					}

					var1.serverPacket = null; // L: 6527
					return true; // L: 6528
				}

				if (ServerPacket.field3116 == var1.serverPacket) { // L: 6530
					if (UserComparator8.field1378 == null) { // L: 6531
						UserComparator8.field1378 = new class392(class221.HitSplatDefinition_cached);
					}

					class447 var51 = class221.HitSplatDefinition_cached.method6920(var3); // L: 6532
					UserComparator8.field1378.field4427.vmethod7295(var51.field4741, var51.field4742); // L: 6533
					field686[++field687 - 1 & 31] = var51.field4741; // L: 6534
					var1.serverPacket = null; // L: 6535
					return true; // L: 6536
				}

				if (ServerPacket.field3089 == var1.serverPacket) { // L: 6538
					var48 = var3.readStringCp1252NullTerminated(); // L: 6539
					Object[] var74 = new Object[var48.length() + 1]; // L: 6540

					for (var6 = var48.length() - 1; var6 >= 0; --var6) { // L: 6541
						if (var48.charAt(var6) == 's') { // L: 6542
							var74[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var74[var6 + 1] = new Integer(var3.readInt()); // L: 6543
						}
					}

					var74[0] = new Integer(var3.readInt()); // L: 6545
					ScriptEvent var83 = new ScriptEvent(); // L: 6546
					var83.args = var74; // L: 6547
					class144.runScriptEvent(var83); // L: 6548
					var1.serverPacket = null; // L: 6549
					return true; // L: 6550
				}

				if (ServerPacket.field3090 == var1.serverPacket) { // L: 6552
					class119.method2737(); // L: 6553
					weight = var3.readShort(); // L: 6554
					field695 = cycleCntr; // L: 6555
					var1.serverPacket = null; // L: 6556
					return true; // L: 6557
				}

				if (ServerPacket.field3175 == var1.serverPacket) { // L: 6559
					Occluder.method4222(class263.field3066); // L: 6560
					var1.serverPacket = null; // L: 6561
					return true; // L: 6562
				}

				if (ServerPacket.field3150 == var1.serverPacket) { // L: 6564
					Occluder.method4222(class263.field3071); // L: 6565
					var1.serverPacket = null; // L: 6566
					return true; // L: 6567
				}

				if (ServerPacket.field3115 == var1.serverPacket) { // L: 6569
					field692 = cycleCntr; // L: 6570
					var20 = var3.readByte(); // L: 6571
					if (var1.serverPacketLength == 1) { // L: 6572
						if (var20 >= 0) { // L: 6573
							currentClanChannels[var20] = null;
						} else {
							UserComparator10.guestClanChannel = null; // L: 6574
						}

						var1.serverPacket = null; // L: 6575
						return true; // L: 6576
					}

					if (var20 >= 0) { // L: 6578
						currentClanChannels[var20] = new ClanChannel(var3); // L: 6579
					} else {
						UserComparator10.guestClanChannel = new ClanChannel(var3); // L: 6582
					}

					var1.serverPacket = null; // L: 6584
					return true; // L: 6585
				}

				if (ServerPacket.field3126 == var1.serverPacket) { // L: 6587
					var3.offset += 28; // L: 6588
					if (var3.checkCrc()) { // L: 6589
						ViewportMouse.method4374(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 6590
					return true; // L: 6591
				}

				if (ServerPacket.field3183 == var1.serverPacket) { // L: 6593
					HorizontalAlignment.updateNpcs(false, var3); // L: 6594
					var1.serverPacket = null; // L: 6595
					return true; // L: 6596
				}

				if (ServerPacket.field3142 == var1.serverPacket) { // L: 6598
					var67 = var3.readInt(); // L: 6599
					var5 = var3.readUnsignedShort(); // L: 6600
					var22 = class92.getWidget(var67); // L: 6601
					if (var22.modelType != 2 || var5 != var22.modelId) { // L: 6602
						var22.modelType = 2; // L: 6603
						var22.modelId = var5; // L: 6604
						GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var22); // L: 6605
					}

					var1.serverPacket = null; // L: 6607
					return true; // L: 6608
				}

				int var13;
				long var31;
				long var33;
				String var39;
				if (ServerPacket.field3086 == var1.serverPacket) { // L: 6610
					var48 = var3.readStringCp1252NullTerminated(); // L: 6611
					var31 = (long)var3.readUnsignedShort(); // L: 6612
					var33 = (long)var3.readMedium(); // L: 6613
					PlayerType var35 = (PlayerType)class291.findEnumerated(class118.PlayerType_values(), var3.readUnsignedByte()); // L: 6614
					long var36 = var33 + (var31 << 32); // L: 6615
					boolean var87 = false; // L: 6616

					for (var13 = 0; var13 < 100; ++var13) { // L: 6617
						if (var36 == crossWorldMessageIds[var13]) { // L: 6618
							var87 = true; // L: 6619
							break; // L: 6620
						}
					}

					if (BufferedSource.friendSystem.isIgnored(new Username(var48, class391.loginType))) { // L: 6623
						var87 = true;
					}

					if (!var87 && field606 == 0) { // L: 6624
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var36; // L: 6625
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6626
						var39 = AbstractFont.escapeBrackets(WorldMapManager.method4679(LoginPacket.method5025(var3))); // L: 6627
						byte var89;
						if (var35.isPrivileged) { // L: 6629
							var89 = 7;
						} else {
							var89 = 3; // L: 6630
						}

						if (var35.modIcon != -1) { // L: 6631
							WorldMapEvent.addGameMessage(var89, StudioGame.method5590(var35.modIcon) + var48, var39);
						} else {
							WorldMapEvent.addGameMessage(var89, var48, var39); // L: 6632
						}
					}

					var1.serverPacket = null; // L: 6634
					return true; // L: 6635
				}

				if (ServerPacket.field3087 == var1.serverPacket) { // L: 6637
					var67 = var3.readShort(); // L: 6638
					var5 = var3.readInt(); // L: 6639
					var22 = class92.getWidget(var5); // L: 6640
					if (var67 != var22.sequenceId || var67 == -1) { // L: 6641
						var22.sequenceId = var67; // L: 6642
						var22.modelFrame = 0; // L: 6643
						var22.modelFrameCycle = 0; // L: 6644
						GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var22); // L: 6645
					}

					var1.serverPacket = null; // L: 6647
					return true; // L: 6648
				}

				if (ServerPacket.field3119 == var1.serverPacket) { // L: 6650
					isCameraLocked = true; // L: 6651
					field742 = false; // L: 6652
					class267.field3206 = var3.readUnsignedByte(); // L: 6653
					AbstractWorldMapData.field2851 = var3.readUnsignedByte(); // L: 6654
					ScriptFrame.field457 = var3.readUnsignedShort(); // L: 6655
					class17.field88 = var3.readUnsignedByte(); // L: 6656
					PacketBufferNode.field3083 = var3.readUnsignedByte(); // L: 6657
					if (PacketBufferNode.field3083 >= 100) { // L: 6658
						var67 = class267.field3206 * 128 + 64; // L: 6659
						var5 = AbstractWorldMapData.field2851 * 128 + 64; // L: 6660
						var6 = class202.getTileHeight(var67, var5, class128.Client_plane) - ScriptFrame.field457; // L: 6661
						var27 = var67 - class343.cameraX; // L: 6662
						var28 = var6 - class295.cameraY; // L: 6663
						var9 = var5 - FaceNormal.cameraZ; // L: 6664
						var29 = (int)Math.sqrt((double)(var9 * var9 + var27 * var27)); // L: 6665
						GameEngine.cameraPitch = (int)(Math.atan2((double)var28, (double)var29) * 325.9490051269531D) & 2047; // L: 6666
						StudioGame.cameraYaw = (int)(Math.atan2((double)var27, (double)var9) * -325.9490051269531D) & 2047; // L: 6667
						if (GameEngine.cameraPitch < 128) { // L: 6668
							GameEngine.cameraPitch = 128;
						}

						if (GameEngine.cameraPitch > 383) { // L: 6669
							GameEngine.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 6671
					return true; // L: 6672
				}

				if (ServerPacket.field3139 == var1.serverPacket) { // L: 6674
					World var50 = new World(); // L: 6675
					var50.host = var3.readStringCp1252NullTerminated(); // L: 6676
					var50.id = var3.readUnsignedShort(); // L: 6677
					var5 = var3.readInt(); // L: 6678
					var50.properties = var5; // L: 6679
					PendingSpawn.updateGameState(45); // L: 6680
					var2.close(); // L: 6681
					var2 = null; // L: 6682
					InvDefinition.changeWorld(var50); // L: 6683
					var1.serverPacket = null; // L: 6684
					return false; // L: 6685
				}

				if (ServerPacket.field3161 == var1.serverPacket) { // L: 6687
					var67 = var3.method7716(); // L: 6688
					ScriptFrame.method1066(var67); // L: 6689
					changedItemContainers[++field683 - 1 & 31] = var67 & 32767; // L: 6690
					var1.serverPacket = null; // L: 6691
					return true; // L: 6692
				}

				NPC var54;
				if (ServerPacket.field3123 == var1.serverPacket) { // L: 6694
					var6 = var3.method7716(); // L: 6699
					var67 = var3.readUnsignedShort(); // L: 6700
					var54 = npcs[var67]; // L: 6701
					var5 = var3.method7567(); // L: 6702
					if (var54 != null) { // L: 6703
						var54.spotAnimation = var6; // L: 6704
						var54.spotAnimationHeight = var5 >> 16; // L: 6705
						var54.field1185 = (var5 & 65535) + cycle; // L: 6706
						var54.spotAnimationFrame = 0; // L: 6707
						var54.spotAnimationFrameCycle = 0; // L: 6708
						if (var54.field1185 > cycle) { // L: 6709
							var54.spotAnimationFrame = -1; // L: 6710
						}

						if (var54.spotAnimation == 65535) { // L: 6712
							var54.spotAnimation = -1; // L: 6713
						}
					}

					var1.serverPacket = null; // L: 6716
					return true; // L: 6717
				}

				Widget var26;
				if (ServerPacket.field3153 == var1.serverPacket) { // L: 6719
					var67 = var3.method7716(); // L: 6720
					var5 = var3.method7716(); // L: 6721
					var6 = var3.method7568(); // L: 6722
					var27 = var3.method7554(); // L: 6723
					var26 = class92.getWidget(var6); // L: 6724
					if (var27 != var26.modelAngleX || var67 != var26.modelAngleY || var5 != var26.modelZoom) { // L: 6725
						var26.modelAngleX = var27; // L: 6726
						var26.modelAngleY = var67; // L: 6727
						var26.modelZoom = var5; // L: 6728
						GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var26); // L: 6729
					}

					var1.serverPacket = null; // L: 6731
					return true; // L: 6732
				}

				if (ServerPacket.field3106 == var1.serverPacket) { // L: 6734
					BufferedSource.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 6735
					field689 = cycleCntr; // L: 6736
					var1.serverPacket = null; // L: 6737
					return true; // L: 6738
				}

				if (ServerPacket.field3172 == var1.serverPacket) { // L: 6740
					var67 = var3.method7576(); // L: 6745
					Player var56;
					if (var67 == localPlayerIndex) { // L: 6746
						var56 = ModelData0.localPlayer; // L: 6747
					} else {
						var56 = players[var67]; // L: 6750
					}

					var6 = var3.readInt(); // L: 6752
					var5 = var3.method7716(); // L: 6753
					if (var56 != null) { // L: 6754
						var56.spotAnimation = var5; // L: 6755
						var56.spotAnimationHeight = var6 >> 16; // L: 6756
						var56.field1185 = (var6 & 65535) + cycle; // L: 6757
						var56.spotAnimationFrame = 0; // L: 6758
						var56.spotAnimationFrameCycle = 0; // L: 6759
						if (var56.field1185 > cycle) { // L: 6760
							var56.spotAnimationFrame = -1; // L: 6761
						}

						if (var56.spotAnimation == 65535) { // L: 6763
							var56.spotAnimation = -1; // L: 6764
						}
					}

					var1.serverPacket = null; // L: 6767
					return true; // L: 6768
				}

				if (ServerPacket.field3118 == var1.serverPacket) { // L: 6770
					var67 = var3.method7576(); // L: 6771
					var5 = var3.method7701(); // L: 6772
					Varps.Varps_temp[var67] = var5; // L: 6773
					if (Varps.Varps_main[var67] != var5) { // L: 6774
						Varps.Varps_main[var67] = var5; // L: 6775
					}

					class321.changeGameOptions(var67); // L: 6777
					changedVarps[++changedVarpCount - 1 & 31] = var67; // L: 6778
					var1.serverPacket = null; // L: 6779
					return true; // L: 6780
				}

				if (ServerPacket.field3146 == var1.serverPacket) { // L: 6782
					minimapState = var3.readUnsignedByte(); // L: 6783
					var1.serverPacket = null; // L: 6784
					return true; // L: 6785
				}

				if (ServerPacket.field3154 == var1.serverPacket) { // L: 6787
					Occluder.method4222(class263.field3062); // L: 6788
					var1.serverPacket = null; // L: 6789
					return true; // L: 6790
				}

				if (ServerPacket.field3121 == var1.serverPacket) { // L: 6792
					var67 = var3.readShort(); // L: 6793
					var5 = var3.method7567(); // L: 6794
					var6 = var3.method7522(); // L: 6795
					var55 = class92.getWidget(var5); // L: 6796
					if (var67 != var55.rawX || var6 != var55.rawY || var55.xAlignment != 0 || var55.yAlignment != 0) { // L: 6797
						var55.rawX = var67; // L: 6798
						var55.rawY = var6; // L: 6799
						var55.xAlignment = 0; // L: 6800
						var55.yAlignment = 0; // L: 6801
						GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var55); // L: 6802
						this.alignWidget(var55); // L: 6803
						if (var55.type == 0) { // L: 6804
							UserComparator8.revalidateWidgetScroll(NetSocket.Widget_interfaceComponents[var5 >> 16], var55, false);
						}
					}

					var1.serverPacket = null; // L: 6806
					return true; // L: 6807
				}

				if (ServerPacket.field3180 == var1.serverPacket) { // L: 6809
					HorizontalAlignment.updateNpcs(true, var3); // L: 6810
					var1.serverPacket = null; // L: 6811
					return true; // L: 6812
				}

				int var38;
				int var40;
				if (ServerPacket.field3085 == var1.serverPacket) { // L: 6814
					byte var61 = var3.readByte(); // L: 6830
					var38 = var3.method7716(); // L: 6831
					var6 = var3.method7561(); // L: 6832
					var67 = var6 >> 16; // L: 6833
					var5 = var6 >> 8 & 255; // L: 6834
					var27 = var67 + (var6 >> 4 & 7); // L: 6835
					var28 = var5 + (var6 & 7); // L: 6836
					var86 = var3.method7558(); // L: 6837
					int var18 = var3.readUnsignedByte(); // L: 6838
					byte var85 = var3.method7547(); // L: 6839
					var40 = var3.method7546() * 4; // L: 6840
					var16 = var3.method7716(); // L: 6841
					int var17 = var3.method7545(); // L: 6842
					var15 = var3.method7716(); // L: 6843
					var13 = var3.readUnsignedByte() * 4; // L: 6844
					var9 = var61 + var27; // L: 6845
					var29 = var85 + var28; // L: 6846
					if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && var9 >= 0 && var29 >= 0 && var9 < 104 && var29 < 104 && var38 != 65535) { // L: 6847
						var27 = var27 * 128 + 64; // L: 6848
						var28 = var28 * 128 + 64; // L: 6849
						var9 = var9 * 128 + 64; // L: 6850
						var29 = var29 * 128 + 64; // L: 6851
						Projectile var19 = new Projectile(var38, class128.Client_plane, var27, var28, class202.getTileHeight(var27, var28, class128.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var86, var40); // L: 6852
						var19.setDestination(var9, var29, class202.getTileHeight(var9, var29, class128.Client_plane) - var40, var15 + cycle); // L: 6853
						projectiles.addFirst(var19); // L: 6854
					}

					var1.serverPacket = null; // L: 6856
					return true; // L: 6857
				}

				if (ServerPacket.field3111 == var1.serverPacket) { // L: 6859
					var67 = var3.readUnsignedByte(); // L: 6860
					Varcs.forceDisconnect(var67); // L: 6861
					var1.serverPacket = null; // L: 6862
					return false; // L: 6863
				}

				if (ServerPacket.field3179 == var1.serverPacket) { // L: 6865
					var84 = var3.readUnsignedByte() == 1; // L: 6866
					if (var84) { // L: 6867
						UserComparator8.field1380 = class113.method2624() - var3.readLong(); // L: 6868
						class120.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 6869
					} else {
						class120.grandExchangeEvents = null; // L: 6871
					}

					field512 = cycleCntr; // L: 6872
					var1.serverPacket = null; // L: 6873
					return true; // L: 6874
				}

				long var41;
				if (ServerPacket.field3171 == var1.serverPacket) { // L: 6876
					var67 = var3.method7701(); // L: 6877
					var5 = var3.method7716(); // L: 6878
					if (var5 == 65535) { // L: 6879
						var5 = -1;
					}

					var6 = var3.method7701(); // L: 6880
					var27 = var3.method7576(); // L: 6881
					if (var27 == 65535) { // L: 6882
						var27 = -1;
					}

					for (var28 = var27; var28 <= var5; ++var28) { // L: 6883
						var41 = ((long)var67 << 32) + (long)var28; // L: 6884
						Node var90 = widgetFlags.get(var41); // L: 6885
						if (var90 != null) { // L: 6886
							var90.remove();
						}

						widgetFlags.put(new IntegerNode(var6), var41); // L: 6887
					}

					var1.serverPacket = null; // L: 6889
					return true; // L: 6890
				}

				if (ServerPacket.field3130 == var1.serverPacket) { // L: 6892
					var5 = var3.readUnsignedShort(); // L: 6896
					var6 = var3.method7546(); // L: 6897
					var67 = var3.method7554(); // L: 6898
					if (var5 == 65535) { // L: 6899
						var5 = -1; // L: 6900
					}

					var54 = npcs[var67]; // L: 6902
					if (var54 != null) { // L: 6903
						if (var5 == var54.sequence && var5 != -1) { // L: 6904
							var28 = class114.SequenceDefinition_get(var5).field2208; // L: 6905
							if (var28 == 1) { // L: 6906
								var54.sequenceFrame = 0; // L: 6907
								var54.sequenceFrameCycle = 0; // L: 6908
								var54.sequenceDelay = var6; // L: 6909
								var54.field1186 = 0; // L: 6910
							} else if (var28 == 2) { // L: 6912
								var54.field1186 = 0; // L: 6913
							}
						} else if (var5 == -1 || var54.sequence == -1 || class114.SequenceDefinition_get(var5).field2220 >= class114.SequenceDefinition_get(var54.sequence).field2220) { // L: 6916
							var54.sequence = var5; // L: 6917
							var54.sequenceFrame = 0; // L: 6918
							var54.sequenceFrameCycle = 0; // L: 6919
							var54.sequenceDelay = var6; // L: 6920
							var54.field1186 = 0; // L: 6921
							var54.field1200 = var54.pathLength; // L: 6922
						}
					}

					var1.serverPacket = null; // L: 6926
					return true; // L: 6927
				}

				if (ServerPacket.field3144 == var1.serverPacket) { // L: 6929
					class145.field1690 = var3.method7593(); // L: 6930
					class321.field4076 = var3.readUnsignedByte(); // L: 6931

					for (var67 = class145.field1690; var67 < class145.field1690 + 8; ++var67) { // L: 6932
						for (var5 = class321.field4076; var5 < class321.field4076 + 8; ++var5) { // L: 6933
							if (groundItems[class128.Client_plane][var67][var5] != null) { // L: 6934
								groundItems[class128.Client_plane][var67][var5] = null; // L: 6935
								Frames.updateItemPile(var67, var5); // L: 6936
							}
						}
					}

					for (PendingSpawn var49 = (PendingSpawn)pendingSpawns.last(); var49 != null; var49 = (PendingSpawn)pendingSpawns.previous()) { // L: 6940 6941 6943
						if (var49.x >= class145.field1690 && var49.x < class145.field1690 + 8 && var49.y >= class321.field4076 && var49.y < class321.field4076 + 8 && var49.plane == class128.Client_plane) { // L: 6942
							var49.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 6945
					return true; // L: 6946
				}

				if (ServerPacket.field3127 == var1.serverPacket) { // L: 6948
					rebootTimer = var3.method7554() * 30; // L: 6949
					field695 = cycleCntr; // L: 6950
					var1.serverPacket = null; // L: 6951
					return true; // L: 6952
				}

				InterfaceParent var7;
				long var44;
				if (ServerPacket.field3125 == var1.serverPacket) { // L: 6954
					var67 = var3.offset + var1.serverPacketLength; // L: 6955
					var5 = var3.readUnsignedShort(); // L: 6956
					var6 = var3.readUnsignedShort(); // L: 6957
					if (var5 != rootInterface) { // L: 6958
						rootInterface = var5; // L: 6959
						this.resizeRoot(false); // L: 6960
						GraphicsDefaults.Widget_resetModelFrames(rootInterface); // L: 6961
						AbstractWorldMapData.runWidgetOnLoadListener(rootInterface); // L: 6962

						for (var27 = 0; var27 < 100; ++var27) { // L: 6963
							field652[var27] = true;
						}
					}

					InterfaceParent var57;
					for (; var6-- > 0; var57.field1034 = true) { // L: 6965 6975
						var27 = var3.readInt(); // L: 6966
						var28 = var3.readUnsignedShort(); // L: 6967
						var9 = var3.readUnsignedByte(); // L: 6968
						var57 = (InterfaceParent)interfaceParents.get((long)var27); // L: 6969
						if (var57 != null && var28 != var57.group) { // L: 6970
							NetSocket.closeInterface(var57, true); // L: 6971
							var57 = null; // L: 6972
						}

						if (var57 == null) { // L: 6974
							var57 = class241.method4812(var27, var28, var9);
						}
					}

					for (var7 = (InterfaceParent)interfaceParents.first(); var7 != null; var7 = (InterfaceParent)interfaceParents.next()) { // L: 6977
						if (var7.field1034) { // L: 6978
							var7.field1034 = false;
						} else {
							NetSocket.closeInterface(var7, true); // L: 6980
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 6983

					while (var3.offset < var67) { // L: 6984
						var27 = var3.readInt(); // L: 6985
						var28 = var3.readUnsignedShort(); // L: 6986
						var9 = var3.readUnsignedShort(); // L: 6987
						var29 = var3.readInt(); // L: 6988

						for (var86 = var28; var86 <= var9; ++var86) { // L: 6989
							var44 = ((long)var27 << 32) + (long)var86; // L: 6990
							widgetFlags.put(new IntegerNode(var29), var44); // L: 6991
						}
					}

					var1.serverPacket = null; // L: 6994
					return true; // L: 6995
				}

				if (ServerPacket.field3167 == var1.serverPacket) { // L: 6997
					Occluder.method4222(class263.field3068); // L: 6998
					var1.serverPacket = null; // L: 6999
					return true; // L: 7000
				}

				if (ServerPacket.field3159 == var1.serverPacket) { // L: 7002
					for (var67 = 0; var67 < VarpDefinition.VarpDefinition_fileCount; ++var67) { // L: 7003
						VarpDefinition var73 = class21.VarpDefinition_get(var67); // L: 7004
						if (var73 != null) { // L: 7005
							Varps.Varps_temp[var67] = 0; // L: 7006
							Varps.Varps_main[var67] = 0; // L: 7007
						}
					}

					class119.method2737(); // L: 7010
					changedVarpCount += 32; // L: 7011
					var1.serverPacket = null; // L: 7012
					return true; // L: 7013
				}

				if (ServerPacket.field3135 == var1.serverPacket) { // L: 7015
					Occluder.method4222(class263.field3064); // L: 7016
					var1.serverPacket = null; // L: 7017
					return true; // L: 7018
				}

				if (ServerPacket.field3102 == var1.serverPacket) { // L: 7020
					if (rootInterface != -1) { // L: 7021
						WorldMapLabelSize.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 7022
					return true; // L: 7023
				}

				if (ServerPacket.field3136 == var1.serverPacket) { // L: 7025
					class144.loadRegions(true, var1.packetBuffer); // L: 7026
					var1.serverPacket = null; // L: 7027
					return true; // L: 7028
				}

				if (ServerPacket.field3088 == var1.serverPacket) { // L: 7030
					var67 = var3.readUnsignedByte(); // L: 7031
					if (var3.readUnsignedByte() == 0) { // L: 7032
						grandExchangeOffers[var67] = new GrandExchangeOffer(); // L: 7033
						var3.offset += 18; // L: 7034
					} else {
						--var3.offset; // L: 7037
						grandExchangeOffers[var67] = new GrandExchangeOffer(var3, false); // L: 7038
					}

					field762 = cycleCntr; // L: 7040
					var1.serverPacket = null; // L: 7041
					return true; // L: 7042
				}

				if (ServerPacket.field3110 == var1.serverPacket) { // L: 7044
					for (var67 = 0; var67 < Varps.Varps_main.length; ++var67) { // L: 7045
						if (Varps.Varps_main[var67] != Varps.Varps_temp[var67]) { // L: 7046
							Varps.Varps_main[var67] = Varps.Varps_temp[var67]; // L: 7047
							class321.changeGameOptions(var67); // L: 7048
							changedVarps[++changedVarpCount - 1 & 31] = var67; // L: 7049
						}
					}

					var1.serverPacket = null; // L: 7052
					return true; // L: 7053
				}

				if (ServerPacket.field3178 == var1.serverPacket) { // L: 7055
					Occluder.method4222(class263.field3060); // L: 7056
					var1.serverPacket = null; // L: 7057
					return true; // L: 7058
				}

				if (ServerPacket.field3117 == var1.serverPacket) { // L: 7060
					var67 = var3.readUnsignedShort(); // L: 7061
					var5 = var3.readUnsignedByte(); // L: 7062
					var6 = var3.readUnsignedShort(); // L: 7063
					WorldMapLabelSize.queueSoundEffect(var67, var5, var6); // L: 7064
					var1.serverPacket = null; // L: 7065
					return true; // L: 7066
				}

				if (ServerPacket.field3114 == var1.serverPacket) { // L: 7068
					var67 = var3.readInt(); // L: 7069
					var5 = var3.readUnsignedShort(); // L: 7070
					if (var67 < -70000) { // L: 7071
						var5 += 32768;
					}

					if (var67 >= 0) { // L: 7073
						var22 = class92.getWidget(var67);
					} else {
						var22 = null; // L: 7074
					}

					if (var22 != null) { // L: 7075
						for (var27 = 0; var27 < var22.itemIds.length; ++var27) { // L: 7076
							var22.itemIds[var27] = 0; // L: 7077
							var22.itemQuantities[var27] = 0; // L: 7078
						}
					}

					class29.clearItemContainer(var5); // L: 7081
					var27 = var3.readUnsignedShort(); // L: 7082

					for (var28 = 0; var28 < var27; ++var28) { // L: 7083
						var9 = var3.readUnsignedByte(); // L: 7084
						if (var9 == 255) { // L: 7085
							var9 = var3.method7568();
						}

						var29 = var3.method7716(); // L: 7086
						if (var22 != null && var28 < var22.itemIds.length) { // L: 7087 7088
							var22.itemIds[var28] = var29; // L: 7089
							var22.itemQuantities[var28] = var9; // L: 7090
						}

						InvDefinition.itemContainerSetItem(var5, var28, var29 - 1, var9); // L: 7093
					}

					if (var22 != null) { // L: 7095
						GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var22);
					}

					class119.method2737(); // L: 7096
					changedItemContainers[++field683 - 1 & 31] = var5 & 32767; // L: 7097
					var1.serverPacket = null; // L: 7098
					return true; // L: 7099
				}

				if (ServerPacket.field3173 == var1.serverPacket) { // L: 7101
					class175.method3373(); // L: 7102
					var20 = var3.readByte(); // L: 7103
					class131 var71 = new class131(var3); // L: 7104
					ClanSettings var79;
					if (var20 >= 0) { // L: 7106
						var79 = currentClanSettings[var20];
					} else {
						var79 = class358.guestClanSettings; // L: 7107
					}

					var71.method2822(var79); // L: 7108
					var1.serverPacket = null; // L: 7109
					return true; // L: 7110
				}

				if (ServerPacket.field3094 == var1.serverPacket) { // L: 7112
					class21.privateChatMode = class116.method2686(var3.readUnsignedByte()); // L: 7113
					var1.serverPacket = null; // L: 7114
					return true; // L: 7115
				}

				if (ServerPacket.field3145 == var1.serverPacket) { // L: 7117
					var67 = var3.readInt(); // L: 7118
					var5 = var3.readUnsignedShort(); // L: 7119
					if (var67 < -70000) { // L: 7120
						var5 += 32768;
					}

					if (var67 >= 0) { // L: 7122
						var22 = class92.getWidget(var67);
					} else {
						var22 = null; // L: 7123
					}

					for (; var3.offset < var1.serverPacketLength; InvDefinition.itemContainerSetItem(var5, var27, var28 - 1, var9)) { // L: 7124 7138
						var27 = var3.readUShortSmart(); // L: 7125
						var28 = var3.readUnsignedShort(); // L: 7126
						var9 = 0; // L: 7127
						if (var28 != 0) { // L: 7128
							var9 = var3.readUnsignedByte(); // L: 7129
							if (var9 == 255) { // L: 7130
								var9 = var3.readInt();
							}
						}

						if (var22 != null && var27 >= 0 && var27 < var22.itemIds.length) { // L: 7132 7133
							var22.itemIds[var27] = var28; // L: 7134
							var22.itemQuantities[var27] = var9; // L: 7135
						}
					}

					if (var22 != null) { // L: 7140
						GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var22);
					}

					class119.method2737(); // L: 7141
					changedItemContainers[++field683 - 1 & 31] = var5 & 32767; // L: 7142
					var1.serverPacket = null; // L: 7143
					return true; // L: 7144
				}

				if (ServerPacket.field3120 == var1.serverPacket) { // L: 7146
					var67 = var3.readUShortSmart(); // L: 7147
					boolean var53 = var3.readUnsignedByte() == 1; // L: 7148
					var76 = ""; // L: 7149
					boolean var82 = false; // L: 7150
					if (var53) { // L: 7151
						var76 = var3.readStringCp1252NullTerminated(); // L: 7152
						if (BufferedSource.friendSystem.isIgnored(new Username(var76, class391.loginType))) { // L: 7153
							var82 = true;
						}
					}

					String var80 = var3.readStringCp1252NullTerminated(); // L: 7155
					if (!var82) { // L: 7156
						WorldMapEvent.addGameMessage(var67, var76, var80);
					}

					var1.serverPacket = null; // L: 7157
					return true; // L: 7158
				}

				if (ServerPacket.field3133 == var1.serverPacket) { // L: 7160
					var67 = var3.method7716(); // L: 7161
					rootInterface = var67; // L: 7162
					this.resizeRoot(false); // L: 7163
					GraphicsDefaults.Widget_resetModelFrames(var67); // L: 7164
					AbstractWorldMapData.runWidgetOnLoadListener(rootInterface); // L: 7165

					for (var5 = 0; var5 < 100; ++var5) { // L: 7166
						field652[var5] = true;
					}

					var1.serverPacket = null; // L: 7167
					return true; // L: 7168
				}

				if (ServerPacket.field3124 == var1.serverPacket) { // L: 7170
					var13 = var3.method7554(); // L: 7181
					var9 = var3.method7545(); // L: 7182
					var29 = var9 >> 2; // L: 7183
					var86 = var9 & 3; // L: 7184
					var38 = field553[var29]; // L: 7185
					var6 = var3.method7544(); // L: 7186
					var67 = var6 >> 16; // L: 7187
					var5 = var6 >> 8 & 255; // L: 7188
					var27 = var67 + (var6 >> 4 & 7); // L: 7189
					var28 = var5 + (var6 & 7); // L: 7190
					if (var27 >= 0 && var28 >= 0 && var27 < 103 && var28 < 103) { // L: 7191
						if (var38 == 0) { // L: 7192
							BoundaryObject var65 = class175.scene.method4147(class128.Client_plane, var27, var28); // L: 7193
							if (var65 != null) { // L: 7194
								var15 = NetSocket.Entity_unpackID(var65.tag); // L: 7195
								if (var29 == 2) { // L: 7196
									var65.renderable1 = new DynamicObject(var15, 2, var86 + 4, class128.Client_plane, var27, var28, var13, false, var65.renderable1); // L: 7197
									var65.renderable2 = new DynamicObject(var15, 2, var86 + 1 & 3, class128.Client_plane, var27, var28, var13, false, var65.renderable2); // L: 7198
								} else {
									var65.renderable1 = new DynamicObject(var15, var29, var86, class128.Client_plane, var27, var28, var13, false, var65.renderable1); // L: 7200
								}
							}
						} else if (var38 == 1) { // L: 7203
							WallDecoration var63 = class175.scene.method4049(class128.Client_plane, var27, var28); // L: 7204
							if (var63 != null) { // L: 7205
								var15 = NetSocket.Entity_unpackID(var63.tag); // L: 7206
								if (var29 != 4 && var29 != 5) { // L: 7207
									if (var29 == 6) { // L: 7210
										var63.renderable1 = new DynamicObject(var15, 4, var86 + 4, class128.Client_plane, var27, var28, var13, false, var63.renderable1); // L: 7211
									} else if (var29 == 7) { // L: 7213
										var63.renderable1 = new DynamicObject(var15, 4, (var86 + 2 & 3) + 4, class128.Client_plane, var27, var28, var13, false, var63.renderable1); // L: 7214
									} else if (var29 == 8) { // L: 7216
										var63.renderable1 = new DynamicObject(var15, 4, var86 + 4, class128.Client_plane, var27, var28, var13, false, var63.renderable1); // L: 7217
										var63.renderable2 = new DynamicObject(var15, 4, (var86 + 2 & 3) + 4, class128.Client_plane, var27, var28, var13, false, var63.renderable2); // L: 7218
									}
								} else {
									var63.renderable1 = new DynamicObject(var15, 4, var86, class128.Client_plane, var27, var28, var13, false, var63.renderable1); // L: 7208
								}
							}
						} else if (var38 == 2) { // L: 7222
							var14 = class175.scene.getGameObject(class128.Client_plane, var27, var28); // L: 7223
							if (var29 == 11) { // L: 7224
								var29 = 10; // L: 7225
							}

							if (var14 != null) { // L: 7227
								var14.renderable = new DynamicObject(NetSocket.Entity_unpackID(var14.tag), var29, var86, class128.Client_plane, var27, var28, var13, false, var14.renderable); // L: 7228
							}
						} else if (var38 == 3) { // L: 7231
							FloorDecoration var62 = class175.scene.getFloorDecoration(class128.Client_plane, var27, var28); // L: 7232
							if (var62 != null) { // L: 7233
								var62.renderable = new DynamicObject(NetSocket.Entity_unpackID(var62.tag), 22, var86, class128.Client_plane, var27, var28, var13, false, var62.renderable); // L: 7234
							}
						}
					}

					var1.serverPacket = null; // L: 7238
					return true; // L: 7239
				}

				if (ServerPacket.field3105 == var1.serverPacket) { // L: 7241
					class321.field4076 = var3.readUnsignedByte(); // L: 7242
					class145.field1690 = var3.method7545(); // L: 7243
					var1.serverPacket = null; // L: 7244
					return true; // L: 7245
				}

				if (ServerPacket.field3164 == var1.serverPacket) { // L: 7247
					class1.updatePlayers(var3, var1.serverPacketLength); // L: 7248
					class101.method2552(); // L: 7249
					var1.serverPacket = null; // L: 7250
					return true; // L: 7251
				}

				Widget var68;
				if (ServerPacket.field3156 == var1.serverPacket) { // L: 7253
					var67 = var3.method7701(); // L: 7254
					var68 = class92.getWidget(var67); // L: 7255
					var68.modelType = 3; // L: 7256
					var68.modelId = ModelData0.localPlayer.appearance.getChatHeadId(); // L: 7257
					GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var68); // L: 7258
					var1.serverPacket = null; // L: 7259
					return true; // L: 7260
				}

				if (ServerPacket.field3176 == var1.serverPacket) { // L: 7262
					SecureRandomCallable.logOut(); // L: 7263
					var1.serverPacket = null; // L: 7264
					return false; // L: 7265
				}

				if (ServerPacket.field3181 == var1.serverPacket) { // L: 7267
					field692 = cycleCntr; // L: 7268
					var20 = var3.readByte(); // L: 7269
					class145 var69 = new class145(var3); // L: 7270
					ClanChannel var72;
					if (var20 >= 0) { // L: 7272
						var72 = currentClanChannels[var20];
					} else {
						var72 = UserComparator10.guestClanChannel; // L: 7273
					}

					var69.method2987(var72); // L: 7274
					var1.serverPacket = null; // L: 7275
					return true; // L: 7276
				}

				if (ServerPacket.field3143 == var1.serverPacket) { // L: 7278
					Occluder.method4222(class263.field3063); // L: 7279
					var1.serverPacket = null; // L: 7280
					return true; // L: 7281
				}

				if (ServerPacket.field3188 == var1.serverPacket) { // L: 7283
					var67 = var3.method7554(); // L: 7284
					var5 = var3.method7593(); // L: 7285
					var6 = var3.method7567(); // L: 7286
					var7 = (InterfaceParent)interfaceParents.get((long)var6); // L: 7287
					if (var7 != null) { // L: 7288
						NetSocket.closeInterface(var7, var67 != var7.group);
					}

					class241.method4812(var6, var67, var5); // L: 7289
					var1.serverPacket = null; // L: 7290
					return true; // L: 7291
				}

				if (ServerPacket.field3170 == var1.serverPacket) { // L: 7293
					var67 = var3.method7701(); // L: 7294
					var5 = var3.method7701(); // L: 7295
					InterfaceParent var70 = (InterfaceParent)interfaceParents.get((long)var67); // L: 7296
					var7 = (InterfaceParent)interfaceParents.get((long)var5); // L: 7297
					if (var7 != null) { // L: 7298
						NetSocket.closeInterface(var7, var70 == null || var70.group != var7.group);
					}

					if (var70 != null) { // L: 7299
						var70.remove(); // L: 7300
						interfaceParents.put(var70, (long)var5); // L: 7301
					}

					var26 = class92.getWidget(var67); // L: 7303
					if (var26 != null) { // L: 7304
						GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var26);
					}

					var26 = class92.getWidget(var5); // L: 7305
					if (var26 != null) { // L: 7306
						GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var26); // L: 7307
						UserComparator8.revalidateWidgetScroll(NetSocket.Widget_interfaceComponents[var26.id >>> 16], var26, true); // L: 7308
					}

					if (rootInterface != -1) { // L: 7310
						WorldMapLabelSize.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 7311
					return true; // L: 7312
				}

				if (ServerPacket.field3108 == var1.serverPacket) { // L: 7314
					var48 = var3.readStringCp1252NullTerminated(); // L: 7315
					var31 = var3.readLong(); // L: 7316
					var33 = (long)var3.readUnsignedShort(); // L: 7317
					var41 = (long)var3.readMedium(); // L: 7318
					PlayerType var43 = (PlayerType)class291.findEnumerated(class118.PlayerType_values(), var3.readUnsignedByte()); // L: 7319
					var44 = (var33 << 32) + var41; // L: 7320
					boolean var88 = false; // L: 7321

					for (var15 = 0; var15 < 100; ++var15) { // L: 7322
						if (crossWorldMessageIds[var15] == var44) { // L: 7323
							var88 = true; // L: 7324
							break; // L: 7325
						}
					}

					if (var43.isUser && BufferedSource.friendSystem.isIgnored(new Username(var48, class391.loginType))) { // L: 7328 7329
						var88 = true;
					}

					if (!var88 && field606 == 0) { // L: 7331
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var44; // L: 7332
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 7333
						var25 = AbstractFont.escapeBrackets(WorldMapManager.method4679(LoginPacket.method5025(var3))); // L: 7334
						if (var43.modIcon != -1) { // L: 7335
							UserComparator7.addChatMessage(9, StudioGame.method5590(var43.modIcon) + var48, var25, class263.base37DecodeLong(var31));
						} else {
							UserComparator7.addChatMessage(9, var48, var25, class263.base37DecodeLong(var31)); // L: 7336
						}
					}

					var1.serverPacket = null; // L: 7338
					return true; // L: 7339
				}

				if (ServerPacket.field3093 == var1.serverPacket) { // L: 7341
					class92.method2377(var3.readStringCp1252NullTerminated()); // L: 7342
					var1.serverPacket = null; // L: 7343
					return true; // L: 7344
				}

				if (ServerPacket.field3190 == var1.serverPacket) { // L: 7346
					var67 = var3.method7701(); // L: 7347
					var68 = class92.getWidget(var67); // L: 7348

					for (var6 = 0; var6 < var68.itemIds.length; ++var6) { // L: 7349
						var68.itemIds[var6] = -1; // L: 7350
						var68.itemIds[var6] = 0; // L: 7351
					}

					GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var68); // L: 7353
					var1.serverPacket = null; // L: 7354
					return true; // L: 7355
				}

				if (ServerPacket.field3185 == var1.serverPacket) { // L: 7357
					var20 = var3.readByte(); // L: 7358
					var31 = (long)var3.readUnsignedShort(); // L: 7359
					var33 = (long)var3.readMedium(); // L: 7360
					var41 = var33 + (var31 << 32); // L: 7361
					boolean var30 = false; // L: 7362
					ClanChannel var12 = var20 >= 0 ? currentClanChannels[var20] : UserComparator10.guestClanChannel; // L: 7363
					if (var12 == null) { // L: 7364
						var30 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) { // L: 7366
							if (crossWorldMessageIds[var13] == var41) { // L: 7367
								var30 = true; // L: 7368
								break; // L: 7369
							}
						}
					}

					if (!var30) { // L: 7373
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var41; // L: 7374
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 7375
						var39 = LoginPacket.method5025(var3); // L: 7376
						var40 = var20 >= 0 ? 43 : 46; // L: 7377
						UserComparator7.addChatMessage(var40, "", var39, var12.name); // L: 7378
					}

					var1.serverPacket = null; // L: 7380
					return true; // L: 7381
				}

				if (ServerPacket.field3101 == var1.serverPacket) { // L: 7383
					if (var1.serverPacketLength == 0) { // L: 7384
						PcmPlayer.friendsChat = null; // L: 7385
					} else {
						if (PcmPlayer.friendsChat == null) { // L: 7388
							PcmPlayer.friendsChat = new FriendsChat(class391.loginType, class82.client); // L: 7389
						}

						PcmPlayer.friendsChat.readUpdate(var3); // L: 7391
					}

					class194.method3804(); // L: 7393
					var1.serverPacket = null; // L: 7394
					return true; // L: 7395
				}

				if (ServerPacket.field3104 == var1.serverPacket) { // L: 7397
					publicChatMode = var3.readUnsignedByte(); // L: 7398
					tradeChatMode = var3.method7546(); // L: 7399
					var1.serverPacket = null; // L: 7400
					return true; // L: 7401
				}

				if (ServerPacket.field3168 == var1.serverPacket) { // L: 7403
					var67 = var3.readUnsignedByte(); // L: 7404
					var5 = var3.readUnsignedByte(); // L: 7405
					var6 = var3.readUnsignedByte(); // L: 7406
					var27 = var3.readUnsignedByte(); // L: 7407
					field743[var67] = true; // L: 7408
					field744[var67] = var5; // L: 7409
					field745[var67] = var6; // L: 7410
					field714[var67] = var27; // L: 7411
					field677[var67] = 0; // L: 7412
					var1.serverPacket = null; // L: 7413
					return true; // L: 7414
				}

				if (ServerPacket.field3109 == var1.serverPacket) { // L: 7416
					destinationX = var3.readUnsignedByte(); // L: 7417
					if (destinationX == 255) { // L: 7418
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 7419
					if (destinationY == 255) { // L: 7420
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 7421
					return true; // L: 7422
				}

				if (ServerPacket.field3100 == var1.serverPacket) { // L: 7424
					class393.field4428 = true; // L: 7425
					HorizontalAlignment.updateNpcs(true, var3); // L: 7426
					var1.serverPacket = null; // L: 7427
					return true; // L: 7428
				}

				if (ServerPacket.field3137 == var1.serverPacket) { // L: 7430
					var67 = var3.method7567(); // L: 7431
					var5 = var3.method7716(); // L: 7432
					var6 = var5 >> 10 & 31; // L: 7433
					var27 = var5 >> 5 & 31; // L: 7434
					var28 = var5 & 31; // L: 7435
					var9 = (var27 << 11) + (var6 << 19) + (var28 << 3); // L: 7436
					Widget var10 = class92.getWidget(var67); // L: 7437
					if (var9 != var10.color) { // L: 7438
						var10.color = var9; // L: 7439
						GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var10); // L: 7440
					}

					var1.serverPacket = null; // L: 7442
					return true; // L: 7443
				}

				if (ServerPacket.field3129 == var1.serverPacket) { // L: 7445
					isCameraLocked = true; // L: 7446
					field742 = false; // L: 7447
					Players.field1317 = var3.readUnsignedByte(); // L: 7448
					TileItem.field1292 = var3.readUnsignedByte(); // L: 7449
					WorldMapSection1.field2898 = var3.readUnsignedShort(); // L: 7450
					class229.field2805 = var3.readUnsignedByte(); // L: 7451
					HitSplatDefinition.field2077 = var3.readUnsignedByte(); // L: 7452
					if (HitSplatDefinition.field2077 >= 100) { // L: 7453
						class343.cameraX = Players.field1317 * 128 + 64; // L: 7454
						FaceNormal.cameraZ = TileItem.field1292 * 128 + 64; // L: 7455
						class295.cameraY = class202.getTileHeight(class343.cameraX, FaceNormal.cameraZ, class128.Client_plane) - WorldMapSection1.field2898; // L: 7456
					}

					var1.serverPacket = null; // L: 7458
					return true; // L: 7459
				}

				if (ServerPacket.field3160 == var1.serverPacket) { // L: 7461
					hintArrowType = var3.readUnsignedByte(); // L: 7462
					if (hintArrowType == 1) { // L: 7463
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 7464
						if (hintArrowType == 2) { // L: 7465
							hintArrowSubX = 64; // L: 7466
							hintArrowSubY = 64; // L: 7467
						}

						if (hintArrowType == 3) { // L: 7469
							hintArrowSubX = 0; // L: 7470
							hintArrowSubY = 64; // L: 7471
						}

						if (hintArrowType == 4) { // L: 7473
							hintArrowSubX = 128; // L: 7474
							hintArrowSubY = 64; // L: 7475
						}

						if (hintArrowType == 5) { // L: 7477
							hintArrowSubX = 64; // L: 7478
							hintArrowSubY = 0; // L: 7479
						}

						if (hintArrowType == 6) { // L: 7481
							hintArrowSubX = 64; // L: 7482
							hintArrowSubY = 128; // L: 7483
						}

						hintArrowType = 2; // L: 7485
						hintArrowX = var3.readUnsignedShort(); // L: 7486
						hintArrowY = var3.readUnsignedShort(); // L: 7487
						hintArrowHeight = var3.readUnsignedByte(); // L: 7488
					}

					if (hintArrowType == 10) { // L: 7490
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 7491
					return true; // L: 7492
				}

				if (ServerPacket.field3107 == var1.serverPacket) { // L: 7494
					var48 = var3.readStringCp1252NullTerminated(); // L: 7495
					var5 = var3.readInt(); // L: 7496
					var22 = class92.getWidget(var5); // L: 7497
					if (!var48.equals(var22.text)) { // L: 7498
						var22.text = var48; // L: 7499
						GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var22); // L: 7500
					}

					var1.serverPacket = null; // L: 7502
					return true; // L: 7503
				}

				if (ServerPacket.field3151 == var1.serverPacket) { // L: 7505
					class175.method3373(); // L: 7506
					var20 = var3.readByte(); // L: 7507
					if (var1.serverPacketLength == 1) { // L: 7508
						if (var20 >= 0) { // L: 7509
							currentClanSettings[var20] = null;
						} else {
							class358.guestClanSettings = null; // L: 7510
						}

						var1.serverPacket = null; // L: 7511
						return true; // L: 7512
					}

					if (var20 >= 0) { // L: 7514
						currentClanSettings[var20] = new ClanSettings(var3); // L: 7515
					} else {
						class358.guestClanSettings = new ClanSettings(var3); // L: 7518
					}

					var1.serverPacket = null; // L: 7520
					return true; // L: 7521
				}

				if (ServerPacket.field3149 == var1.serverPacket) { // L: 7523
					BufferedSource.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 7524
					class121.FriendSystem_invalidateIgnoreds(); // L: 7525
					field689 = cycleCntr; // L: 7526
					var1.serverPacket = null; // L: 7527
					return true; // L: 7528
				}

				ArchiveDiskActionHandler.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id * 1118619813 * -1591353555 : -1) + "," + (var1.field1340 != null ? var1.field1340.id * 1118619813 * -1591353555 : -1) + "," + (var1.field1345 != null ? var1.field1345.id * 1118619813 * -1591353555 : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 7530
				SecureRandomCallable.logOut(); // L: 7531
			} catch (IOException var46) { // L: 7533
				class129.method2812(); // L: 7534
			} catch (Exception var47) {
				var21 = "" + (var1.serverPacket != null ? var1.serverPacket.id * 1118619813 * -1591353555 : -1) + "," + (var1.field1340 != null ? var1.field1340.id * 1118619813 * -1591353555 : -1) + "," + (var1.field1345 != null ? var1.field1345.id * 1118619813 * -1591353555 : -1) + "," + var1.serverPacketLength + "," + (ModelData0.localPlayer.pathX[0] + SecureRandomCallable.baseX) + "," + (ModelData0.localPlayer.pathY[0] + GrandExchangeOfferOwnWorldComparator.baseY) + ","; // L: 7537

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) { // L: 7538
					var21 = var21 + var3.array[var6] + ",";
				}

				ArchiveDiskActionHandler.RunException_sendStackTrace(var21, var47); // L: 7539
				SecureRandomCallable.logOut(); // L: 7540
			}

			return true; // L: 7542
		}
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1950620416"
	)
	@Export("menu")
	final void menu() {
		boolean var1 = false; // L: 8728

		int var2;
		int var5;
		while (!var1) { // L: 8729
			var1 = true; // L: 8730

			for (var2 = 0; var2 < menuOptionsCount - 1; ++var2) { // L: 8731
				if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) { // L: 8732
					String var14 = menuTargets[var2]; // L: 8733
					menuTargets[var2] = menuTargets[var2 + 1]; // L: 8734
					menuTargets[var2 + 1] = var14; // L: 8735
					String var15 = menuActions[var2]; // L: 8736
					menuActions[var2] = menuActions[var2 + 1]; // L: 8737
					menuActions[var2 + 1] = var15; // L: 8738
					var5 = menuOpcodes[var2]; // L: 8739
					menuOpcodes[var2] = menuOpcodes[var2 + 1]; // L: 8740
					menuOpcodes[var2 + 1] = var5; // L: 8741
					var5 = menuArguments1[var2]; // L: 8742
					menuArguments1[var2] = menuArguments1[var2 + 1]; // L: 8743
					menuArguments1[var2 + 1] = var5; // L: 8744
					var5 = menuArguments2[var2]; // L: 8745
					menuArguments2[var2] = menuArguments2[var2 + 1]; // L: 8746
					menuArguments2[var2 + 1] = var5; // L: 8747
					var5 = menuIdentifiers[var2]; // L: 8748
					menuIdentifiers[var2] = menuIdentifiers[var2 + 1]; // L: 8749
					menuIdentifiers[var2 + 1] = var5; // L: 8750
					boolean var6 = menuShiftClick[var2]; // L: 8751
					menuShiftClick[var2] = menuShiftClick[var2 + 1]; // L: 8752
					menuShiftClick[var2 + 1] = var6; // L: 8753
					var1 = false; // L: 8754
				}
			}
		}

		if (Canvas.dragInventoryWidget == null) { // L: 8759
			if (clickedWidget == null) { // L: 8760
				int var11;
				int var17;
				label262: {
					int var16 = MouseHandler.MouseHandler_lastButton; // L: 8761
					int var4;
					int var9;
					if (isMenuOpen) { // L: 8762
						int var3;
						if (var16 != 1 && (Login.mouseCam || var16 != 4)) { // L: 8763
							var2 = MouseHandler.MouseHandler_x; // L: 8764
							var3 = MouseHandler.MouseHandler_y; // L: 8765
							if (var2 < BuddyRankComparator.menuX - 10 || var2 > KeyHandler.menuWidth + BuddyRankComparator.menuX + 10 || var3 < FontName.menuY - 10 || var3 > FontName.menuY + class7.menuHeight + 10) { // L: 8766
								isMenuOpen = false; // L: 8767
								class132.method2836(BuddyRankComparator.menuX, FontName.menuY, KeyHandler.menuWidth, class7.menuHeight); // L: 8768
							}
						}

						if (var16 == 1 || !Login.mouseCam && var16 == 4) { // L: 8771
							var2 = BuddyRankComparator.menuX; // L: 8772
							var3 = FontName.menuY; // L: 8773
							var4 = KeyHandler.menuWidth; // L: 8774
							var5 = MouseHandler.MouseHandler_lastPressedX; // L: 8775
							var17 = MouseHandler.MouseHandler_lastPressedY; // L: 8776
							int var13 = -1; // L: 8777

							for (int var18 = 0; var18 < menuOptionsCount; ++var18) { // L: 8778
								var9 = (menuOptionsCount - 1 - var18) * 15 + var3 + 31; // L: 8779
								if (var5 > var2 && var5 < var2 + var4 && var17 > var9 - 13 && var17 < var9 + 3) { // L: 8780
									var13 = var18;
								}
							}

							if (var13 != -1) { // L: 8782
								Renderable.method4211(var13);
							}

							isMenuOpen = false; // L: 8783
							class132.method2836(BuddyRankComparator.menuX, FontName.menuY, KeyHandler.menuWidth, class7.menuHeight); // L: 8784
						}
					} else {
						var2 = menuOptionsCount - 1; // L: 8790
						if ((var16 == 1 || !Login.mouseCam && var16 == 4) && var2 >= 0) { // L: 8793
							var4 = menuOpcodes[var2]; // L: 8794
							if (var4 == 39 || var4 == 40 || var4 == 41 || var4 == 42 || var4 == 43 || var4 == 33 || var4 == 34 || var4 == 35 || var4 == 36 || var4 == 37 || var4 == 38 || var4 == 1005) { // L: 8795
								var5 = menuArguments1[var2]; // L: 8796
								var17 = menuArguments2[var2]; // L: 8797
								Widget var7 = class92.getWidget(var17); // L: 8798
								var9 = UrlRequester.getWidgetFlags(var7); // L: 8800
								boolean var8 = (var9 >> 28 & 1) != 0; // L: 8802
								if (var8) { // L: 8805
									break label262;
								}

								var11 = UrlRequester.getWidgetFlags(var7); // L: 8807
								boolean var10 = (var11 >> 29 & 1) != 0; // L: 8809
								if (var10) { // L: 8811
									break label262;
								}
							}
						}

						if ((var16 == 1 || !Login.mouseCam && var16 == 4) && this.shouldLeftClickOpenMenu()) { // L: 8841 8842
							var16 = 2; // L: 8843
						}

						if ((var16 == 1 || !Login.mouseCam && var16 == 4) && menuOptionsCount > 0) { // L: 8846
							Renderable.method4211(var2); // L: 8847
						}

						if (var16 == 2 && menuOptionsCount > 0) { // L: 8849
							this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}
					}

					return; // L: 8851
				}

				if (Canvas.dragInventoryWidget != null && !field604 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) { // L: 8813 8814
					int var19 = draggedWidgetX; // L: 8815
					var11 = draggedWidgetY; // L: 8816
					MenuAction var12 = class116.tempMenuAction; // L: 8818
					if (var12 != null) { // L: 8820
						ModeWhere.menuAction(var12.param0, var12.param1, var12.opcode, var12.identifier, var12.action, var12.action, var19, var11); // L: 8821
					}

					class116.tempMenuAction = null; // L: 8824
				}

				field604 = false; // L: 8828
				itemDragDuration = 0; // L: 8829
				if (Canvas.dragInventoryWidget != null) { // L: 8830
					GrandExchangeOfferTotalQuantityComparator.invalidateWidget(Canvas.dragInventoryWidget);
				}

				Canvas.dragInventoryWidget = class92.getWidget(var17); // L: 8831
				dragItemSlotSource = var5; // L: 8832
				draggedWidgetX = MouseHandler.MouseHandler_lastPressedX; // L: 8833
				draggedWidgetY = MouseHandler.MouseHandler_lastPressedY; // L: 8834
				if (var2 >= 0) { // L: 8835
					Players.method2426(var2);
				}

				GrandExchangeOfferTotalQuantityComparator.invalidateWidget(Canvas.dragInventoryWidget); // L: 8836
			}
		}
	} // L: 8837

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = menuOptionsCount - 1; // L: 8856
		return (leftClickOpensMenu == 1 && menuOptionsCount > 2 || UrlRequester.method2539(var1)) && !menuShiftClick[var1]; // L: 8859
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-25"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		class119.method2739(var1, var2); // L: 8863
		var1 -= viewportOffsetX; // L: 8864
		var2 -= viewportOffsetY; // L: 8865
		class175.scene.menuOpen(class128.Client_plane, var1, var2, false); // L: 8866
		isMenuOpen = true; // L: 8867
	} // L: 8868

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "16"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		int var2 = rootInterface; // L: 10739
		int var3 = GraphicsObject.canvasWidth; // L: 10740
		int var4 = class433.canvasHeight; // L: 10741
		if (WorldMapDecoration.loadInterface(var2)) { // L: 10743
			Language.resizeInterface(NetSocket.Widget_interfaceComponents[var2], -1, var3, var4, var1); // L: 10744
		}

	} // L: 10746

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Lki;B)V",
		garbageValue = "7"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : class92.getWidget(var1.parentId); // L: 10749
		int var3;
		int var4;
		if (var2 == null) { // L: 10752
			var3 = GraphicsObject.canvasWidth; // L: 10753
			var4 = class433.canvasHeight; // L: 10754
		} else {
			var3 = var2.width; // L: 10757
			var4 = var2.height; // L: 10758
		}

		FloorOverlayDefinition.alignWidgetSize(var1, var3, var4, false); // L: 10760
		ChatChannel.alignWidgetPosition(var1, var3, var4); // L: 10761
	} // L: 10762

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1857303053"
	)
	final void method1150() {
		GrandExchangeOfferTotalQuantityComparator.invalidateWidget(clickedWidget); // L: 11793
		++SoundSystem.widgetDragDuration; // L: 11794
		int var1;
		int var2;
		if (field675 && field574) { // L: 11795
			var1 = MouseHandler.MouseHandler_x; // L: 11814
			var2 = MouseHandler.MouseHandler_y; // L: 11815
			var1 -= widgetClickX; // L: 11816
			var2 -= widgetClickY; // L: 11817
			if (var1 < field747) { // L: 11818
				var1 = field747;
			}

			if (var1 + clickedWidget.width > field747 + clickedWidgetParent.width) { // L: 11819
				var1 = field747 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field674) { // L: 11820
				var2 = field674;
			}

			if (var2 + clickedWidget.height > field674 + clickedWidgetParent.height) { // L: 11821
				var2 = field674 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field653; // L: 11822
			int var4 = var2 - field612; // L: 11823
			int var5 = clickedWidget.dragZoneSize; // L: 11824
			if (SoundSystem.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 11825 11826
				isDraggingWidget = true; // L: 11827
			}

			int var6 = var1 - field747 + clickedWidgetParent.scrollX; // L: 11830
			int var7 = var2 - field674 + clickedWidgetParent.scrollY; // L: 11831
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 11832
				var8 = new ScriptEvent(); // L: 11833
				var8.widget = clickedWidget; // L: 11834
				var8.mouseX = var6; // L: 11835
				var8.mouseY = var7; // L: 11836
				var8.args = clickedWidget.onDrag; // L: 11837
				class144.runScriptEvent(var8); // L: 11838
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 11840
				if (isDraggingWidget) { // L: 11841
					if (clickedWidget.onDragComplete != null) { // L: 11842
						var8 = new ScriptEvent(); // L: 11843
						var8.widget = clickedWidget; // L: 11844
						var8.mouseX = var6; // L: 11845
						var8.mouseY = var7; // L: 11846
						var8.dragTarget = draggedOnWidget; // L: 11847
						var8.args = clickedWidget.onDragComplete; // L: 11848
						class144.runScriptEvent(var8); // L: 11849
					}

					if (draggedOnWidget != null) { // L: 11851
						Widget var15 = clickedWidget; // L: 11853
						int var11 = UrlRequester.getWidgetFlags(var15); // L: 11856
						int var16 = var11 >> 17 & 7; // L: 11858
						int var12 = var16; // L: 11860
						Widget var18;
						if (var16 == 0) { // L: 11861
							var18 = null; // L: 11862
						} else {
							int var13 = 0;

							while (true) {
								if (var13 >= var12) {
									var18 = var15; // L: 11872
									break;
								}

								var15 = class92.getWidget(var15.parentId); // L: 11866
								if (var15 == null) { // L: 11867
									var18 = null; // L: 11868
									break; // L: 11869
								}

								++var13; // L: 11865
							}
						}

						if (var18 != null) { // L: 11874
							PacketBufferNode var19 = WallDecoration.getPacketBufferNode(ClientPacket.field3029, packetWriter.isaacCipher); // L: 11876
							var19.packetBuffer.writeShort(clickedWidget.childIndex); // L: 11877
							var19.packetBuffer.method7563(draggedOnWidget.id); // L: 11878
							var19.packetBuffer.writeShort(draggedOnWidget.childIndex); // L: 11879
							var19.packetBuffer.writeShort(draggedOnWidget.itemId); // L: 11880
							var19.packetBuffer.writeIntME(clickedWidget.id); // L: 11881
							var19.packetBuffer.writeShort(clickedWidget.itemId); // L: 11882
							packetWriter.addNode(var19); // L: 11883
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 11888
					this.openMenu(widgetClickX + field653, widgetClickY + field612); // L: 11889
				} else if (menuOptionsCount > 0) { // L: 11891
					int var14 = field653 + widgetClickX; // L: 11892
					int var9 = widgetClickY + field612; // L: 11893
					MenuAction var10 = class116.tempMenuAction; // L: 11895
					if (var10 != null) { // L: 11897
						ModeWhere.menuAction(var10.param0, var10.param1, var10.opcode, var10.identifier, var10.action, var10.action, var14, var9); // L: 11898
					}

					class116.tempMenuAction = null; // L: 11901
				}

				clickedWidget = null; // L: 11905
			}

		} else {
			if (SoundSystem.widgetDragDuration > 1) { // L: 11796
				if (!isDraggingWidget && menuOptionsCount > 0) { // L: 11797
					var1 = widgetClickX + field653; // L: 11798
					var2 = field612 + widgetClickY; // L: 11799
					MenuAction var17 = class116.tempMenuAction; // L: 11801
					if (var17 != null) { // L: 11803
						ModeWhere.menuAction(var17.param0, var17.param1, var17.opcode, var17.identifier, var17.action, var17.action, var1, var2); // L: 11804
					}

					class116.tempMenuAction = null; // L: 11807
				}

				clickedWidget = null; // L: 11810
			}

		}
	} // L: 11812 11907

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(B)Lqv;",
		garbageValue = "-38"
	)
	@Export("username")
	public Username username() {
		return ModelData0.localPlayer != null ? ModelData0.localPlayer.username : null; // L: 12651
	}

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) { // L: 824
			this.field478 = var1; // L: 827
			class126.method2799(10); // L: 828
		}
	} // L: 825 829

	public long getAccountHash() {
		return this.field531; // L: 848
	}

	public boolean isOnLoginScreen() {
		return gameState == 10; // L: 843
	}

	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) { // L: 834
			this.field577 = var1; // L: 837
		}
	} // L: 835 838

	public final void init() {
		try {
			if (this.checkHost()) { // L: 689
				for (int var1 = 0; var1 <= 28; ++var1) { // L: 690
					String var2 = this.getParameter(Integer.toString(var1)); // L: 691
					if (var2 != null) { // L: 692
						switch(var1) { // L: 693
						case 1:
							useBufferedSocket = Integer.parseInt(var2) != 0; // L: 696
						case 2:
						case 13:
						case 16:
						case 18:
						case 19:
						case 20:
						default:
							break;
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 747
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 748
							}
							break;
						case 4:
							if (clientType == -1) { // L: 773
								clientType = Integer.parseInt(var2); // L: 774
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 753
							break; // L: 754
						case 6:
							int var4 = Integer.parseInt(var2); // L: 713
							Language var9;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) { // L: 715
								var9 = Language.Language_valuesOrdered[var4]; // L: 719
							} else {
								var9 = null; // L: 716
							}

							class263.clientLanguage = var9; // L: 721
							break; // L: 722
						case 7:
							AbstractArchive.field4038 = AbstractWorldMapData.method4799(Integer.parseInt(var2)); // L: 763
							break; // L: 764
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 706
							}
							break;
						case 9:
							field662 = var2; // L: 758
							break; // L: 759
						case 10:
							StudioGame[] var3 = new StudioGame[]{StudioGame.game3, StudioGame.runescape, StudioGame.stellardawn, StudioGame.game5, StudioGame.game4, StudioGame.oldscape}; // L: 728
							ApproximateRouteStrategy.field473 = (StudioGame)class291.findEnumerated(var3, Integer.parseInt(var2)); // L: 730
							if (ApproximateRouteStrategy.field473 == StudioGame.oldscape) { // L: 731
								class391.loginType = LoginType.oldscape;
							} else {
								class391.loginType = LoginType.field4616; // L: 732
							}
							break;
						case 11:
							ApproximateRouteStrategy.field471 = var2; // L: 780
							break; // L: 781
						case 12:
							worldId = Integer.parseInt(var2); // L: 785
							break; // L: 786
						case 14:
							class230.field2807 = Integer.parseInt(var2); // L: 742
							break; // L: 743
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 790
							break;
						case 17:
							class93.field1280 = var2; // L: 737
							break; // L: 738
						case 21:
							field484 = Integer.parseInt(var2); // L: 768
							break; // L: 769
						case 22:
							field493 = Integer.parseInt(var2) != 0; // L: 701
						}
					}
				}

				JagexCache.method3155(); // L: 796
				Timer.worldHost = this.getCodeBase().getHost(); // L: 797
				String var5 = AbstractArchive.field4038.name; // L: 798
				byte var6 = 0; // L: 799

				try {
					PendingSpawn.method2160("oldschool", var5, var6, 21); // L: 801
				} catch (Exception var7) { // L: 803
					ArchiveDiskActionHandler.RunException_sendStackTrace((String)null, var7); // L: 804
				}

				class82.client = this; // L: 806
				class430.clientType = clientType; // L: 807
				if (field486 == -1) { // L: 808
					field486 = 0; // L: 809
				}

				Decimator.field406 = System.getenv("JX_ACCESS_TOKEN"); // L: 811
				ModelData0.field2661 = System.getenv("JX_REFRESH_TOKEN"); // L: 812
				this.startThread(765, 503, 205); // L: 813
			}
		} catch (RuntimeException var8) {
			throw HealthBarUpdate.newRunException(var8, "client.init(" + ')');
		}
	} // L: 814

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "2074222337"
	)
	static int method1240(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 3845
			class12.Interpreter_intStackSize -= 2; // L: 3846
			field748 = (short)InterfaceParent.method2066(Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]); // L: 3847
			if (field748 <= 0) { // L: 3848
				field748 = 256;
			}

			field749 = (short)InterfaceParent.method2066(Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]); // L: 3849
			if (field749 <= 0) { // L: 3850
				field749 = 256;
			}

			return 1; // L: 3851
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 3853
			class12.Interpreter_intStackSize -= 2; // L: 3854
			zoomHeight = (short)Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 3855
			if (zoomHeight <= 0) { // L: 3856
				zoomHeight = 256;
			}

			zoomWidth = (short)Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 3857
			if (zoomWidth <= 0) { // L: 3858
				zoomWidth = 320;
			}

			return 1; // L: 3859
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 3861
			class12.Interpreter_intStackSize -= 4; // L: 3862
			field752 = (short)Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 3863
			if (field752 <= 0) { // L: 3864
				field752 = 1;
			}

			field753 = (short)Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 3865
			if (field753 <= 0) { // L: 3866
				field753 = 32767;
			} else if (field753 < field752) { // L: 3867
				field753 = field752;
			}

			field656 = (short)Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2]; // L: 3868
			if (field656 <= 0) { // L: 3869
				field656 = 1;
			}

			field755 = (short)Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 3]; // L: 3870
			if (field755 <= 0) { // L: 3871
				field755 = 32767;
			} else if (field755 < field656) { // L: 3872
				field755 = field656;
			}

			return 1; // L: 3873
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 3875
			if (viewportWidget != null) { // L: 3876
				GrandExchangeOfferOwnWorldComparator.setViewportShape(0, 0, viewportWidget.width, viewportWidget.height, false); // L: 3877
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = viewportWidth; // L: 3878
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = viewportHeight; // L: 3879
			} else {
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 3882
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 3883
			}

			return 1; // L: 3885
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 3887
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = zoomHeight; // L: 3888
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = zoomWidth; // L: 3889
			return 1; // L: 3890
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 3892
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class21.method278(field748); // L: 3893
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class21.method278(field749); // L: 3894
			return 1; // L: 3895
		} else if (var0 == 6220) { // L: 3897
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 3898
			return 1; // L: 3899
		} else if (var0 == 6221) { // L: 3901
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 3902
			return 1; // L: 3903
		} else if (var0 == 6222) { // L: 3905
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = GraphicsObject.canvasWidth; // L: 3906
			return 1; // L: 3907
		} else if (var0 == 6223) { // L: 3909
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class433.canvasHeight; // L: 3910
			return 1; // L: 3911
		} else {
			return 2; // L: 3913
		}
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(Lcx;IIIIII)V",
		garbageValue = "-1622528173"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 5032
			if (var0 instanceof NPC) { // L: 5033
				NPCComposition var6 = ((NPC)var0).definition; // L: 5034
				if (var6.transforms != null) { // L: 5035
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 5036
					return;
				}
			}

			int var75 = Players.Players_count; // L: 5038
			int[] var7 = Players.Players_indices; // L: 5039
			byte var8 = 0; // L: 5040
			if (var1 < var75 && var0.playerCycle == cycle && class118.method2720((Player)var0)) { // L: 5041
				Player var9 = (Player)var0; // L: 5042
				if (var1 < var75) { // L: 5043
					ByteArrayPool.method6357(var0, var0.defaultHeight + 15); // L: 5044
					AbstractFont var10 = (AbstractFont)fontsMap.get(FontName.FontName_plain12); // L: 5045
					byte var11 = 9; // L: 5046
					var10.drawCentered(var9.username.getName(), var2 + viewportTempX, var3 + viewportTempY - var11, 16777215, 0); // L: 5047
					var8 = 18; // L: 5048
				}
			}

			int var76 = -2; // L: 5051
			int var22;
			int var23;
			int var24;
			int var77;
			if (!var0.healthBars.method5986()) { // L: 5052
				var77 = var0.defaultHeight + 15; // L: 5053
				AbstractWorldMapIcon.worldToScreen(var0.x, var0.y, var77); // L: 5055

				for (HealthBar var78 = (HealthBar)var0.healthBars.last(); var78 != null; var78 = (HealthBar)var0.healthBars.previous()) { // L: 5057
					HealthBarUpdate var80 = var78.get(cycle); // L: 5058
					if (var80 == null) { // L: 5059
						if (var78.isEmpty()) { // L: 5117
							var78.remove();
						}
					} else {
						HealthBarDefinition var13 = var78.definition; // L: 5060
						SpritePixels var81 = var13.getBackSprite(); // L: 5061
						SpritePixels var82 = var13.getFrontSprite(); // L: 5062
						int var17 = 0; // L: 5064
						int var83;
						if (var81 != null && var82 != null) { // L: 5065
							if (var13.widthPadding * 2 < var82.subWidth) { // L: 5066
								var17 = var13.widthPadding;
							}

							var83 = var82.subWidth - var17 * 2; // L: 5067
						} else {
							var83 = var13.width; // L: 5069
						}

						int var84 = 255; // L: 5070
						boolean var85 = true; // L: 5071
						int var86 = cycle - var80.cycle; // L: 5072
						int var87 = var83 * var80.health2 / var13.width; // L: 5073
						int var94;
						if (var80.cycleOffset > var86) { // L: 5074
							var22 = var13.field1915 == 0 ? 0 : var13.field1915 * (var86 / var13.field1915); // L: 5075
							var23 = var83 * var80.health / var13.width; // L: 5076
							var94 = var22 * (var87 - var23) / var80.cycleOffset + var23; // L: 5077
						} else {
							var94 = var87; // L: 5080
							var22 = var13.int5 + var80.cycleOffset - var86; // L: 5081
							if (var13.int3 >= 0) { // L: 5082
								var84 = (var22 << 8) / (var13.int5 - var13.int3);
							}
						}

						if (var80.health2 > 0 && var94 < 1) { // L: 5084
							var94 = 1;
						}

						if (var81 != null && var82 != null) { // L: 5085
							if (var83 == var94) { // L: 5086
								var94 += var17 * 2;
							} else {
								var94 += var17; // L: 5087
							}

							var22 = var81.subHeight; // L: 5088
							var76 += var22; // L: 5089
							var23 = var2 + viewportTempX - (var83 >> 1); // L: 5090
							var24 = var3 + viewportTempY - var76; // L: 5091
							var23 -= var17; // L: 5092
							if (var84 >= 0 && var84 < 255) { // L: 5093
								var81.drawTransAt(var23, var24, var84); // L: 5094
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var23 + var94, var22 + var24); // L: 5095
								var82.drawTransAt(var23, var24, var84); // L: 5096
							} else {
								var81.drawTransBgAt(var23, var24); // L: 5099
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var23 + var94, var22 + var24); // L: 5100
								var82.drawTransBgAt(var23, var24); // L: 5101
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 5103
							var76 += 2; // L: 5104
						} else {
							var76 += 5; // L: 5107
							if (viewportTempX > -1) { // L: 5108
								var22 = var2 + viewportTempX - (var83 >> 1); // L: 5109
								var23 = var3 + viewportTempY - var76; // L: 5110
								Rasterizer2D.Rasterizer2D_fillRectangle(var22, var23, var94, 5, 65280); // L: 5111
								Rasterizer2D.Rasterizer2D_fillRectangle(var94 + var22, var23, var83 - var94, 5, 16711680); // L: 5112
							}

							var76 += 2; // L: 5114
						}
					}
				}
			}

			if (var76 == -2) { // L: 5120
				var76 += 7;
			}

			var76 += var8; // L: 5121
			if (var1 < var75) { // L: 5122
				Player var88 = (Player)var0; // L: 5123
				if (var88.isHidden) { // L: 5124
					return;
				}

				if (var88.headIconPk != -1 || var88.headIconPrayer != -1) { // L: 5125
					ByteArrayPool.method6357(var0, var0.defaultHeight + 15); // L: 5126
					if (viewportTempX > -1) { // L: 5127
						if (var88.headIconPk != -1) { // L: 5128
							var76 += 25; // L: 5129
							UserComparator4.headIconPkSprites[var88.headIconPk].drawTransBgAt(var2 + viewportTempX - 12, var3 + viewportTempY - var76); // L: 5130
						}

						if (var88.headIconPrayer != -1) { // L: 5132
							var76 += 25; // L: 5133
							ChatChannel.headIconPrayerSprites[var88.headIconPrayer].drawTransBgAt(var2 + viewportTempX - 12, var3 + viewportTempY - var76); // L: 5134
						}
					}
				}

				if (var1 >= 0 && hintArrowType == 10 && var7[var1] == hintArrowPlayerIndex) { // L: 5138
					ByteArrayPool.method6357(var0, var0.defaultHeight + 15); // L: 5139
					if (viewportTempX > -1) { // L: 5140
						var76 += class21.headIconHintSprites[1].subHeight; // L: 5141
						class21.headIconHintSprites[1].drawTransBgAt(var2 + viewportTempX - 12, var3 + viewportTempY - var76); // L: 5142
					}
				}
			} else {
				NPCComposition var89 = ((NPC)var0).definition; // L: 5147
				if (var89.transforms != null) { // L: 5148
					var89 = var89.transform();
				}

				if (var89.headIconPrayer >= 0 && var89.headIconPrayer < ChatChannel.headIconPrayerSprites.length) { // L: 5149
					ByteArrayPool.method6357(var0, var0.defaultHeight + 15); // L: 5150
					if (viewportTempX > -1) { // L: 5151
						ChatChannel.headIconPrayerSprites[var89.headIconPrayer].drawTransBgAt(var2 + viewportTempX - 12, var3 + viewportTempY - 30); // L: 5152
					}
				}

				if (hintArrowType == 1 && npcIndices[var1 - var75] == hintArrowNpcIndex && cycle % 20 < 10) { // L: 5155
					ByteArrayPool.method6357(var0, var0.defaultHeight + 15); // L: 5156
					if (viewportTempX > -1) { // L: 5157
						class21.headIconHintSprites[0].drawTransBgAt(var2 + viewportTempX - 12, var3 + viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var75 || !var0.field1198 && (publicChatMode == 4 || !var0.isAutoChatting && (publicChatMode == 0 || publicChatMode == 3 || publicChatMode == 1 && ((Player)var0).isFriend())))) { // L: 5160 5161
				ByteArrayPool.method6357(var0, var0.defaultHeight); // L: 5162
				if (viewportTempX > -1 && overheadTextCount < overheadTextLimit) { // L: 5163
					overheadTextXOffsets[overheadTextCount] = ChatChannel.fontBold12.stringWidth(var0.overheadText) / 2; // L: 5164
					overheadTextAscents[overheadTextCount] = ChatChannel.fontBold12.ascent; // L: 5165
					overheadTextXs[overheadTextCount] = viewportTempX; // L: 5166
					overheadTextYs[overheadTextCount] = viewportTempY; // L: 5167
					overheadTextColors[overheadTextCount] = var0.overheadTextColor; // L: 5168
					overheadTextEffects[overheadTextCount] = var0.overheadTextEffect; // L: 5169
					overheadTextCyclesRemaining[overheadTextCount] = var0.overheadTextCyclesRemaining; // L: 5170
					overheadText[overheadTextCount] = var0.overheadText; // L: 5171
					++overheadTextCount; // L: 5172
				}
			}

			for (var77 = 0; var77 < 4; ++var77) { // L: 5176
				int var90 = var0.hitSplatCycles[var77]; // L: 5177
				int var12 = var0.hitSplatTypes[var77]; // L: 5178
				HitSplatDefinition var91 = null; // L: 5179
				int var14 = 0; // L: 5180
				if (var12 >= 0) { // L: 5181
					if (var90 <= cycle) { // L: 5182
						continue;
					}

					var91 = UserComparator4.method2567(var0.hitSplatTypes[var77]); // L: 5183
					var14 = var91.field2071; // L: 5184
					if (var91 != null && var91.transforms != null) { // L: 5185
						var91 = var91.transform(); // L: 5186
						if (var91 == null) { // L: 5187
							var0.hitSplatCycles[var77] = -1; // L: 5188
							continue;
						}
					}
				} else if (var90 < 0) { // L: 5193
					continue;
				}

				int var15 = var0.hitSplatTypes2[var77]; // L: 5194
				HitSplatDefinition var16 = null; // L: 5195
				if (var15 >= 0) { // L: 5196
					var16 = UserComparator4.method2567(var15); // L: 5197
					if (var16 != null && var16.transforms != null) { // L: 5198
						var16 = var16.transform();
					}
				}

				if (var90 - var14 <= cycle) { // L: 5200
					if (var91 == null) { // L: 5201
						var0.hitSplatCycles[var77] = -1; // L: 5202
					} else {
						ByteArrayPool.method6357(var0, var0.defaultHeight / 2); // L: 5205
						if (viewportTempX > -1) { // L: 5206
							boolean var92 = true; // L: 5207
							if (var77 == 1) { // L: 5208
								viewportTempY -= 20; // L: 5209
							}

							if (var77 == 2) { // L: 5211
								viewportTempX -= 15; // L: 5212
								viewportTempY -= 10; // L: 5213
							}

							if (var77 == 3) { // L: 5215
								viewportTempX += 15; // L: 5216
								viewportTempY -= 10; // L: 5217
							}

							SpritePixels var18 = null; // L: 5219
							SpritePixels var19 = null; // L: 5220
							SpritePixels var20 = null; // L: 5221
							SpritePixels var21 = null; // L: 5222
							var22 = 0; // L: 5223
							var23 = 0; // L: 5224
							var24 = 0; // L: 5225
							int var25 = 0; // L: 5226
							int var26 = 0; // L: 5227
							int var27 = 0; // L: 5228
							int var28 = 0; // L: 5229
							int var29 = 0; // L: 5230
							SpritePixels var30 = null; // L: 5231
							SpritePixels var31 = null; // L: 5232
							SpritePixels var32 = null; // L: 5233
							SpritePixels var33 = null; // L: 5234
							int var34 = 0; // L: 5235
							int var35 = 0; // L: 5236
							int var36 = 0; // L: 5237
							int var37 = 0; // L: 5238
							int var38 = 0; // L: 5239
							int var39 = 0; // L: 5240
							int var40 = 0; // L: 5241
							int var41 = 0; // L: 5242
							int var42 = 0; // L: 5243
							var18 = var91.method3531(); // L: 5244
							int var43;
							if (var18 != null) { // L: 5245
								var22 = var18.subWidth; // L: 5246
								var43 = var18.subHeight; // L: 5247
								if (var43 > var42) { // L: 5248
									var42 = var43;
								}

								var26 = var18.xOffset; // L: 5249
							}

							var19 = var91.method3534(); // L: 5251
							if (var19 != null) { // L: 5252
								var23 = var19.subWidth; // L: 5253
								var43 = var19.subHeight; // L: 5254
								if (var43 > var42) { // L: 5255
									var42 = var43;
								}

								var27 = var19.xOffset; // L: 5256
							}

							var20 = var91.method3533(); // L: 5258
							if (var20 != null) { // L: 5259
								var24 = var20.subWidth; // L: 5260
								var43 = var20.subHeight; // L: 5261
								if (var43 > var42) { // L: 5262
									var42 = var43;
								}

								var28 = var20.xOffset; // L: 5263
							}

							var21 = var91.method3559(); // L: 5265
							if (var21 != null) { // L: 5266
								var25 = var21.subWidth; // L: 5267
								var43 = var21.subHeight; // L: 5268
								if (var43 > var42) { // L: 5269
									var42 = var43;
								}

								var29 = var21.xOffset; // L: 5270
							}

							if (var16 != null) { // L: 5272
								var30 = var16.method3531(); // L: 5273
								if (var30 != null) { // L: 5274
									var34 = var30.subWidth; // L: 5275
									var43 = var30.subHeight; // L: 5276
									if (var43 > var42) { // L: 5277
										var42 = var43;
									}

									var38 = var30.xOffset; // L: 5278
								}

								var31 = var16.method3534(); // L: 5280
								if (var31 != null) { // L: 5281
									var35 = var31.subWidth; // L: 5282
									var43 = var31.subHeight; // L: 5283
									if (var43 > var42) { // L: 5284
										var42 = var43;
									}

									var39 = var31.xOffset; // L: 5285
								}

								var32 = var16.method3533(); // L: 5287
								if (var32 != null) { // L: 5288
									var36 = var32.subWidth; // L: 5289
									var43 = var32.subHeight; // L: 5290
									if (var43 > var42) { // L: 5291
										var42 = var43;
									}

									var40 = var32.xOffset; // L: 5292
								}

								var33 = var16.method3559(); // L: 5294
								if (var33 != null) { // L: 5295
									var37 = var33.subWidth; // L: 5296
									var43 = var33.subHeight; // L: 5297
									if (var43 > var42) { // L: 5298
										var42 = var43;
									}

									var41 = var33.xOffset; // L: 5299
								}
							}

							Font var79 = var91.getFont(); // L: 5304
							if (var79 == null) { // L: 5305
								var79 = Varcs.fontPlain11;
							}

							Font var44;
							if (var16 != null) { // L: 5306
								var44 = var16.getFont(); // L: 5307
								if (var44 == null) { // L: 5308
									var44 = Varcs.fontPlain11;
								}
							} else {
								var44 = Varcs.fontPlain11; // L: 5310
							}

							String var45 = null; // L: 5311
							String var46 = null; // L: 5312
							boolean var47 = false; // L: 5313
							int var48 = 0; // L: 5314
							var45 = var91.getString(var0.hitSplatValues[var77]); // L: 5315
							int var93 = var79.stringWidth(var45); // L: 5316
							if (var16 != null) { // L: 5317
								var46 = var16.getString(var0.hitSplatValues2[var77]); // L: 5318
								var48 = var44.stringWidth(var46); // L: 5319
							}

							int var49 = 0; // L: 5321
							int var50 = 0; // L: 5322
							if (var23 > 0) { // L: 5323
								if (var20 == null && var21 == null) { // L: 5324
									var49 = 1; // L: 5325
								} else {
									var49 = var93 / var23 + 1;
								}
							}

							if (var16 != null && var35 > 0) { // L: 5327 5328
								if (var32 == null && var33 == null) { // L: 5329
									var50 = 1; // L: 5330
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0; // L: 5333
							int var52 = var51; // L: 5334
							if (var22 > 0) { // L: 5335
								var51 += var22;
							}

							var51 += 2; // L: 5336
							int var53 = var51; // L: 5337
							if (var24 > 0) { // L: 5338
								var51 += var24;
							}

							int var54 = var51; // L: 5339
							int var55 = var51; // L: 5340
							int var56;
							if (var23 > 0) { // L: 5341
								var56 = var49 * var23; // L: 5342
								var51 += var56; // L: 5343
								var55 += (var56 - var93) / 2; // L: 5344
							} else {
								var51 += var93; // L: 5347
							}

							var56 = var51; // L: 5349
							if (var25 > 0) { // L: 5350
								var51 += var25;
							}

							int var57 = 0; // L: 5351
							int var58 = 0; // L: 5352
							int var59 = 0; // L: 5353
							int var60 = 0; // L: 5354
							int var61 = 0; // L: 5355
							int var62;
							if (var16 != null) { // L: 5356
								var51 += 2; // L: 5357
								var57 = var51; // L: 5358
								if (var34 > 0) { // L: 5359
									var51 += var34;
								}

								var51 += 2; // L: 5360
								var58 = var51; // L: 5361
								if (var36 > 0) { // L: 5362
									var51 += var36;
								}

								var59 = var51; // L: 5363
								var61 = var51; // L: 5364
								if (var35 > 0) { // L: 5365
									var62 = var50 * var35; // L: 5366
									var51 += var62; // L: 5367
									var61 += (var62 - var48) / 2; // L: 5368
								} else {
									var51 += var48; // L: 5371
								}

								var60 = var51; // L: 5373
								if (var37 > 0) { // L: 5374
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var77] - cycle; // L: 5376
							int var63 = var91.field2055 - var62 * var91.field2055 / var91.field2071; // L: 5377
							int var64 = var62 * var91.field2074 / var91.field2071 + -var91.field2074; // L: 5378
							int var65 = var63 + (var2 + viewportTempX - (var51 >> 1)); // L: 5379
							int var66 = var3 + viewportTempY - 12 + var64; // L: 5380
							int var67 = var66; // L: 5381
							int var68 = var66 + var42; // L: 5382
							int var69 = var66 + var91.field2068 + 15; // L: 5383
							int var70 = var69 - var79.maxAscent; // L: 5384
							int var71 = var69 + var79.maxDescent; // L: 5385
							if (var70 < var66) { // L: 5386
								var67 = var70;
							}

							if (var71 > var68) { // L: 5387
								var68 = var71;
							}

							int var72 = 0; // L: 5388
							int var73;
							int var74;
							if (var16 != null) { // L: 5389
								var72 = var66 + var16.field2068 + 15; // L: 5390
								var73 = var72 - var44.maxAscent; // L: 5391
								var74 = var72 + var44.maxDescent; // L: 5392
								if (var73 < var67) { // L: 5393
									;
								}

								if (var74 > var68) { // L: 5394
									;
								}
							}

							var73 = 255; // L: 5396
							if (var91.field2072 >= 0) { // L: 5397
								var73 = (var62 << 8) / (var91.field2071 - var91.field2072);
							}

							if (var73 >= 0 && var73 < 255) { // L: 5398
								if (var18 != null) { // L: 5399
									var18.drawTransAt(var52 + var65 - var26, var66, var73);
								}

								if (var20 != null) { // L: 5400
									var20.drawTransAt(var65 + var53 - var28, var66, var73);
								}

								if (var19 != null) { // L: 5401
									for (var74 = 0; var74 < var49; ++var74) { // L: 5402
										var19.drawTransAt(var23 * var74 + (var65 + var54 - var27), var66, var73); // L: 5403
									}
								}

								if (var21 != null) { // L: 5406
									var21.drawTransAt(var65 + var56 - var29, var66, var73);
								}

								var79.drawAlpha(var45, var55 + var65, var69, var91.textColor, 0, var73); // L: 5407
								if (var16 != null) { // L: 5408
									if (var30 != null) { // L: 5409
										var30.drawTransAt(var65 + var57 - var38, var66, var73);
									}

									if (var32 != null) { // L: 5410
										var32.drawTransAt(var65 + var58 - var40, var66, var73);
									}

									if (var31 != null) { // L: 5411
										for (var74 = 0; var74 < var50; ++var74) { // L: 5412
											var31.drawTransAt(var74 * var35 + (var59 + var65 - var39), var66, var73); // L: 5413
										}
									}

									if (var33 != null) { // L: 5416
										var33.drawTransAt(var60 + var65 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var65 + var61, var72, var16.textColor, 0, var73); // L: 5417
								}
							} else {
								if (var18 != null) { // L: 5421
									var18.drawTransBgAt(var52 + var65 - var26, var66);
								}

								if (var20 != null) { // L: 5422
									var20.drawTransBgAt(var65 + var53 - var28, var66);
								}

								if (var19 != null) { // L: 5423
									for (var74 = 0; var74 < var49; ++var74) { // L: 5424
										var19.drawTransBgAt(var23 * var74 + (var54 + var65 - var27), var66); // L: 5425
									}
								}

								if (var21 != null) { // L: 5428
									var21.drawTransBgAt(var56 + var65 - var29, var66);
								}

								var79.draw(var45, var65 + var55, var69, var91.textColor | -16777216, 0); // L: 5429
								if (var16 != null) { // L: 5430
									if (var30 != null) { // L: 5431
										var30.drawTransBgAt(var57 + var65 - var38, var66);
									}

									if (var32 != null) { // L: 5432
										var32.drawTransBgAt(var65 + var58 - var40, var66);
									}

									if (var31 != null) { // L: 5433
										for (var74 = 0; var74 < var50; ++var74) { // L: 5434
											var31.drawTransBgAt(var74 * var35 + (var65 + var59 - var39), var66); // L: 5435
										}
									}

									if (var33 != null) { // L: 5438
										var33.drawTransBgAt(var65 + var60 - var41, var66);
									}

									var44.draw(var46, var61 + var65, var72, var16.textColor | -16777216, 0); // L: 5439
								}
							}
						}
					}
				}
			}

		}
	} // L: 5444
}
