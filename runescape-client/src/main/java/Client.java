import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthTokens {
	@ObfuscatedName("rv")
	@ObfuscatedSignature(
		descriptor = "[Lej;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("qk")
	@ObfuscatedGetter(
		longValue = 380245954858485035L
	)
	static long field514;
	@ObfuscatedName("qd")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("ul")
	@ObfuscatedGetter(
		intValue = 594272369
	)
	public static int field559;
	@ObfuscatedName("rx")
	static boolean field743;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = -1584933369
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("qf")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("uu")
	@ObfuscatedSignature(
		descriptor = "Lbi;"
	)
	static final ApproximateRouteStrategy field754;
	@ObfuscatedName("ri")
	@ObfuscatedGetter(
		intValue = 633351775
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		intValue = 962993013
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("st")
	@ObfuscatedGetter(
		intValue = 1358957623
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("so")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("sj")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("sk")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("sf")
	@ObfuscatedSignature(
		descriptor = "[Lac;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("uq")
	static int[] field755;
	@ObfuscatedName("uh")
	static int[] field756;
	@ObfuscatedName("sc")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("rt")
	@ObfuscatedGetter(
		intValue = 1358189471
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("th")
	@ObfuscatedGetter(
		intValue = -769855681
	)
	static int field744;
	@ObfuscatedName("se")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("tw")
	@ObfuscatedSignature(
		descriptor = "Ljo;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("sb")
	static boolean field724;
	@ObfuscatedName("tr")
	@ObfuscatedGetter(
		intValue = -129722411
	)
	static int field571;
	@ObfuscatedName("rn")
	@ObfuscatedSignature(
		descriptor = "[Lei;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("rw")
	@ObfuscatedGetter(
		intValue = -1920478573
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("un")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("tu")
	static boolean[] field725;
	@ObfuscatedName("ue")
	@ObfuscatedGetter(
		intValue = 1616263669
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("qy")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("qx")
	@ObfuscatedGetter(
		intValue = 375303139
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("qu")
	@ObfuscatedGetter(
		longValue = -6601646598285595847L
	)
	static long field676;
	@ObfuscatedName("tp")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("ti")
	static short field690;
	@ObfuscatedName("tz")
	static short field707;
	@ObfuscatedName("rm")
	@ObfuscatedGetter(
		intValue = 795865193
	)
	static int field570;
	@ObfuscatedName("tq")
	static short field736;
	@ObfuscatedName("tk")
	static short field737;
	@ObfuscatedName("rh")
	@ObfuscatedGetter(
		intValue = 1614235025
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("tx")
	static short field735;
	@ObfuscatedName("rb")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("tc")
	@ObfuscatedGetter(
		intValue = -477293141
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("te")
	static short field619;
	@ObfuscatedName("tt")
	@ObfuscatedGetter(
		intValue = -1712028747
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("tj")
	@ObfuscatedGetter(
		intValue = 648823865
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("ry")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("re")
	@ObfuscatedSignature(
		descriptor = "[Lpl;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("tg")
	@ObfuscatedSignature(
		descriptor = "[Lkb;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("ty")
	@ObfuscatedGetter(
		intValue = -677299157
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("tm")
	@ObfuscatedGetter(
		intValue = -215790417
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("td")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("to")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = -2053041951
	)
	static int field701;
	@ObfuscatedName("uc")
	@ObfuscatedGetter(
		intValue = 1186068583
	)
	static int field753;
	@ObfuscatedName("tv")
	static int[] field679;
	@ObfuscatedName("tn")
	static int[] field726;
	@ObfuscatedName("qb")
	static int[] field522;
	@ObfuscatedName("tf")
	static int[] field618;
	@ObfuscatedName("tl")
	static int[] field729;
	@ObfuscatedName("qz")
	static int[] field758;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = 1425340839
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(
		intValue = 494366655
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("uf")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("qm")
	static int[] field749;
	@ObfuscatedName("qe")
	static String field645;
	@ObfuscatedName("uw")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lgf;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("ad")
	static boolean field713;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1047026675
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -148495881
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 406374125
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bi")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bm")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 78796799
	)
	static int field473;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -275050283
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1450677759
	)
	static int field499;
	@ObfuscatedName("bc")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1847663853
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("cf")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1674489649
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		longValue = -1983586746320389363L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -2087310985
	)
	static int field483;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 1122347211
	)
	static int field746;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		longValue = 3088441328861095551L
	)
	static long field485;
	@ObfuscatedName("dv")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("do")
	@Export("displayFps")
	static boolean displayFps;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -808894481
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = -1504010063
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = -789774913
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -1385232855
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -1355919591
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 686364275
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -1327714015
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -521195687
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -1689030643
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -799405801
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -1227560011
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 856515511
	)
	static int field517;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		intValue = -323349495
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = 993112849
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = -1252225801
	)
	static int field545;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = 670531889
	)
	static int field541;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = 1972488979
	)
	static int field506;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	static class122 field507;
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	static class422 field508;
	@ObfuscatedName("fl")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("fm")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "[Lcr;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = 1929700921
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("gj")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = 1848423267
	)
	static int field520;
	@ObfuscatedName("gw")
	static int[] field605;
	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = 1696118819
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("gp")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("gq")
	@Export("useBufferedSocket")
	static boolean useBufferedSocket;
	@ObfuscatedName("gi")
	static boolean field526;
	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("gc")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("hj")
	@ObfuscatedGetter(
		intValue = -628851273
	)
	static int field529;
	@ObfuscatedName("hp")
	@ObfuscatedGetter(
		intValue = -747625611
	)
	static int field530;
	@ObfuscatedName("hl")
	@ObfuscatedGetter(
		intValue = -826572867
	)
	static int field617;
	@ObfuscatedName("hn")
	@ObfuscatedGetter(
		intValue = -1786172371
	)
	static int field532;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		intValue = 1982308495
	)
	static int field602;
	@ObfuscatedName("hy")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("hc")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("hf")
	static final int[] field537;
	@ObfuscatedName("hz")
	@ObfuscatedGetter(
		intValue = 374050087
	)
	static int field538;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("ig")
	@ObfuscatedGetter(
		intValue = 327781137
	)
	static int field693;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = -331478875
	)
	static int field716;
	@ObfuscatedName("ib")
	@ObfuscatedGetter(
		intValue = -979832185
	)
	static int field509;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = 321039709
	)
	static int field544;
	@ObfuscatedName("ik")
	static boolean field543;
	@ObfuscatedName("iy")
	@ObfuscatedGetter(
		intValue = -83589583
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("if")
	@ObfuscatedGetter(
		intValue = 2024018565
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("iw")
	@ObfuscatedGetter(
		intValue = 576864047
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		intValue = 1332183157
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = 1090882813
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		intValue = -229171215
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("il")
	@ObfuscatedGetter(
		intValue = -939566641
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = 964987821
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = 579441507
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = 1740034233
	)
	static int field542;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = 1436075295
	)
	static int field584;
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = -890677005
	)
	static int field555;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = -535945653
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = 1403293651
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = 1420477321
	)
	static int field607;
	@ObfuscatedName("jz")
	static boolean field612;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = -1475270389
	)
	static int field560;
	@ObfuscatedName("jr")
	static boolean field561;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = -26905361
	)
	static int field562;
	@ObfuscatedName("ju")
	@ObfuscatedGetter(
		intValue = -773892707
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("jn")
	@ObfuscatedGetter(
		intValue = -1644053899
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("jo")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("jb")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("jm")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("je")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("ja")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("jy")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("ji")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("js")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("kf")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = 1916144699
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = 840193893
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("kd")
	@ObfuscatedGetter(
		intValue = -1886866651
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = 1160360799
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = 1838440319
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = 1581021399
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("kn")
	@ObfuscatedGetter(
		intValue = 1288921139
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("kl")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = 1920336167
	)
	static int field582;
	@ObfuscatedName("km")
	@ObfuscatedGetter(
		intValue = -1813426121
	)
	static int field599;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = 968662689
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("ku")
	@ObfuscatedGetter(
		intValue = 304129153
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("kg")
	@ObfuscatedGetter(
		intValue = 403550005
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("ka")
	@ObfuscatedGetter(
		intValue = 1141132311
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("kh")
	static boolean field572;
	@ObfuscatedName("ki")
	@ObfuscatedGetter(
		intValue = 316645859
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("kc")
	@ObfuscatedGetter(
		intValue = -1256248427
	)
	static int field590;
	@ObfuscatedName("kv")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "[Lck;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = 74597849
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = -1592996163
	)
	static int field594;
	@ObfuscatedName("li")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = 1840251113
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 1123511093
	)
	static int field597;
	@ObfuscatedName("lr")
	static int[] field598;
	@ObfuscatedName("lo")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("ls")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("lx")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("lm")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("lv")
	@ObfuscatedGetter(
		intValue = -1073316529
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "[[[Llh;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("le")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("lb")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("lj")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("ln")
	@ObfuscatedGetter(
		intValue = -2127848453
	)
	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("lg")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = 423776093
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("mm")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("mw")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("mc")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("ml")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("mx")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("mv")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("mn")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("mo")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("mp")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("mu")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("md")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = -1753321203
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = 1204843373
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = -1381888941
	)
	static int field714;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = 289077449
	)
	static int field628;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = -1313040449
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("ns")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("nu")
	@ObfuscatedGetter(
		intValue = -2020933549
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("nr")
	@ObfuscatedGetter(
		intValue = 170882311
	)
	static int field633;
	@ObfuscatedName("nq")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("nl")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("nv")
	@ObfuscatedGetter(
		intValue = 1900367295
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("nf")
	@ObfuscatedGetter(
		intValue = 862490937
	)
	static int field638;
	@ObfuscatedName("nk")
	@ObfuscatedGetter(
		intValue = 957984195
	)
	static int field639;
	@ObfuscatedName("nz")
	@ObfuscatedGetter(
		intValue = -1526655765
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("nc")
	@ObfuscatedGetter(
		intValue = 32014173
	)
	static int field641;
	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("nm")
	@ObfuscatedGetter(
		intValue = 2084747083
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("nd")
	@ObfuscatedGetter(
		intValue = 1192464333
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("nj")
	@ObfuscatedGetter(
		intValue = 1043298277
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("nw")
	@ObfuscatedGetter(
		intValue = -730109587
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("na")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		intValue = -1392233693
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = -1441412951
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("or")
	static boolean field531;
	@ObfuscatedName("oz")
	@ObfuscatedGetter(
		intValue = 1396470941
	)
	static int field681;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = -1204222991
	)
	static int field659;
	@ObfuscatedName("oc")
	static boolean field657;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = 446488355
	)
	static int field658;
	@ObfuscatedName("ow")
	@ObfuscatedGetter(
		intValue = 22597875
	)
	static int field660;
	@ObfuscatedName("ol")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = -697121075
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("os")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = -1549689841
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("oi")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = 840565577
	)
	static int field665;
	@ObfuscatedName("ob")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = -1130299111
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("oy")
	static int[] field695;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = -441533413
	)
	static int field734;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = -439883039
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = 985856881
	)
	static int field671;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(
		intValue = 1529981945
	)
	static int field672;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		intValue = -1376380489
	)
	static int field673;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = -223800901
	)
	static int field583;
	@ObfuscatedName("pp")
	@ObfuscatedGetter(
		intValue = 1659284265
	)
	static int field675;
	@ObfuscatedName("pf")
	@ObfuscatedGetter(
		intValue = 1108839673
	)
	static int field669;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = 45782605
	)
	static int field471;
	@ObfuscatedName("pg")
	@ObfuscatedGetter(
		intValue = 1320259871
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("pa")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	static NodeDeque field680;
	@ObfuscatedName("px")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	static NodeDeque field579;
	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = 1020186199
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = -140051155
	)
	static int field684;
	@ObfuscatedName("pu")
	static boolean[] field504;
	@ObfuscatedName("pv")
	static boolean[] field686;
	@ObfuscatedName("po")
	static boolean[] field687;
	@ObfuscatedName("pm")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("pb")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("qg")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("fd")
	String field576;
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Lg;"
	)
	class14 field510;
	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	class19 field613;
	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	Buffer field710;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lw;"
	)
	class7 field515;

	static {
		field713 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		field473 = -1;
		clientType = -1;
		field499 = -1;
		onMobile = false;
		gameState = 0;
		isLoading = true;
		cycle = 0;
		mouseLastLastPressedTimeMillis = -1L;
		field483 = -1;
		field746 = -1;
		field485 = -1L;
		hadFocus = true;
		displayFps = false;
		rebootTimer = 0;
		hintArrowType = 0;
		hintArrowNpcIndex = 0;
		hintArrowPlayerIndex = 0;
		hintArrowX = 0;
		hintArrowY = 0;
		hintArrowHeight = 0;
		hintArrowSubX = 0;
		hintArrowSubY = 0;
		playerAttackOption = AttackOption.AttackOption_hidden;
		npcAttackOption = AttackOption.AttackOption_hidden;
		titleLoadingStage = 0;
		js5ConnectState = 0;
		field517 = 0;
		js5Errors = 0;
		loginState = 0;
		field545 = 0;
		field541 = 0;
		field506 = 0;
		field507 = class122.field1473;
		field508 = class422.field4523;
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcs = new NPC[32768];
		npcCount = 0;
		npcIndices = new int[32768];
		field520 = 0;
		field605 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		hadNetworkError = false;
		useBufferedSocket = true;
		field526 = false;
		timer = new Timer();
		fontsMap = new HashMap();
		field529 = 0;
		field530 = 1;
		field617 = 0;
		field532 = 1;
		field602 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field537 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field538 = 0;
		field693 = 2301979;
		field716 = 5063219;
		field509 = 3353893;
		field544 = 7759444;
		field543 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field542 = 0;
		field584 = 0;
		field555 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		field607 = 0;
		field612 = false;
		field560 = 0;
		field561 = false;
		field562 = 0;
		overheadTextCount = 0;
		overheadTextLimit = 50;
		overheadTextXs = new int[overheadTextLimit];
		overheadTextYs = new int[overheadTextLimit];
		overheadTextAscents = new int[overheadTextLimit];
		overheadTextXOffsets = new int[overheadTextLimit];
		overheadTextColors = new int[overheadTextLimit];
		overheadTextEffects = new int[overheadTextLimit];
		overheadTextCyclesRemaining = new int[overheadTextLimit];
		overheadText = new String[overheadTextLimit];
		tileLastDrawnActor = new int[104][104];
		viewportDrawCount = 0;
		viewportTempX = -1;
		viewportTempY = -1;
		mouseCrossX = 0;
		mouseCrossY = 0;
		mouseCrossState = 0;
		mouseCrossColor = 0;
		showMouseCross = true;
		field582 = 0;
		field599 = 0;
		dragItemSlotSource = 0;
		draggedWidgetX = 0;
		draggedWidgetY = 0;
		dragItemSlotDestination = 0;
		field572 = false;
		itemDragDuration = 0;
		field590 = 0;
		showLoadingMessages = true;
		players = new Player[2048];
		localPlayerIndex = -1;
		field594 = 0;
		renderSelf = true;
		drawPlayerNames = 0;
		field597 = 0;
		field598 = new int[1000];
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		playerMenuActions = new String[8];
		playerOptionsPriorities = new boolean[8];
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		combatTargetPlayerIndex = -1;
		groundItems = new NodeDeque[4][104][104];
		pendingSpawns = new NodeDeque();
		projectiles = new NodeDeque();
		graphicsObjects = new NodeDeque();
		currentLevels = new int[25];
		levels = new int[25];
		experience = new int[25];
		leftClickOpensMenu = 0;
		isMenuOpen = false;
		menuOptionsCount = 0;
		menuArguments1 = new int[500];
		menuArguments2 = new int[500];
		menuOpcodes = new int[500];
		menuIdentifiers = new int[500];
		menuActions = new String[500];
		menuTargets = new String[500];
		menuShiftClick = new boolean[500];
		followerOpsLowPriority = false;
		shiftClickDrop = false;
		tapToDrop = false;
		showMouseOverText = true;
		viewportX = -1;
		viewportY = -1;
		field714 = 0;
		field628 = 50;
		isItemSelected = 0;
		selectedItemName = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		field633 = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field638 = 0;
		field639 = -1;
		chatEffects = 0;
		field641 = 0;
		meslayerContinueWidget = null;
		runEnergy = 0;
		weight = 0;
		staffModLevel = 0;
		followerIndex = -1;
		playerMod = false;
		viewportWidget = null;
		clickedWidget = null;
		clickedWidgetParent = null;
		widgetClickX = 0;
		widgetClickY = 0;
		draggedOnWidget = null;
		field531 = false;
		field681 = -1;
		field659 = -1;
		field657 = false;
		field658 = -1;
		field660 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field665 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field695 = new int[32];
		field734 = 0;
		chatCycle = 0;
		field671 = 0;
		field672 = 0;
		field673 = 0;
		field583 = 0;
		field675 = 0;
		field669 = 0;
		field471 = 0;
		mouseWheelRotation = 0;
		scriptEvents = new NodeDeque();
		field680 = new NodeDeque();
		field579 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field684 = -2;
		field504 = new boolean[100];
		field686 = new boolean[100];
		field687 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field514 = 0L;
		isResizable = true;
		field749 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field645 = "";
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		field701 = 0;
		field758 = new int[128];
		field522 = new int[128];
		field676 = -1L;
		currentClanSettings = new ClanSettings[2];
		currentClanChannels = new ClanChannel[2];
		field570 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		currentTrackGroupId = -1;
		field743 = false;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field724 = false;
		field725 = new boolean[5];
		field726 = new int[5];
		field679 = new int[5];
		field618 = new int[5];
		field729 = new int[5];
		field690 = 256;
		field707 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field619 = 1;
		field735 = 32767;
		field736 = 1;
		field737 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field744 = -1;
		field571 = -1;
		platformInfoProvider = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field559 = -1;
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field753 = 0;
		field754 = new ApproximateRouteStrategy();
		field755 = new int[50];
		field756 = new int[50];
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2122855875"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field514 = Ignored.method6459() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.resizeRoot(true);
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "264122801"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000};
		int[] var2 = new int[]{1000, 100, 500};
		if (var1 != null && var2 != null) {
			SoundCache.ByteArrayPool_alternativeSizes = var1;
			ApproximateRouteStrategy.ByteArrayPool_altSizeArrayCounts = new int[var1.length];
			World.ByteArrayPool_arrays = new byte[var1.length][][];

			for (int var3 = 0; var3 < SoundCache.ByteArrayPool_alternativeSizes.length; ++var3) {
				World.ByteArrayPool_arrays[var3] = new byte[var2[var3]][];
				ByteArrayPool.field4035.add(var1[var3]);
			}

			Collections.sort(ByteArrayPool.field4035);
		} else {
			SoundCache.ByteArrayPool_alternativeSizes = null;
			ApproximateRouteStrategy.ByteArrayPool_altSizeArrayCounts = null;
			World.ByteArrayPool_arrays = null;
			ByteArrayPool.field4035.clear();
			ByteArrayPool.field4035.add(100);
			ByteArrayPool.field4035.add(5000);
			ByteArrayPool.field4035.add(10000);
			ByteArrayPool.field4035.add(30000);
		}

		GameObject.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		class133.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		class129.currentPort = GameObject.worldPort;
		PlayerComposition.field3197 = class279.field3209;
		class114.field1382 = class279.field3208;
		class132.field1540 = class279.field3211;
		PlayerComposition.field3203 = class279.field3210;
		WorldMapData_1.urlRequester = new UrlRequester();
		this.setUpKeyboard();
		this.method472();
		WorldMapDecorationType.mouseWheel = this.mouseWheel();
		ParamComposition.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		AccessFile var4 = null;
		ClientPreferences var5 = new ClientPreferences();

		try {
			var4 = class231.getPreferencesFile("", class338.field4054.name, false);
			byte[] var6 = new byte[(int)var4.length()];

			int var8;
			for (int var7 = 0; var7 < var6.length; var7 += var8) {
				var8 = var4.read(var6, var7, var6.length - var7);
				if (var8 == -1) {
					throw new IOException();
				}
			}

			var5 = new ClientPreferences(new Buffer(var6));
		} catch (Exception var11) {
		}

		try {
			if (var4 != null) {
				var4.close();
			}
		} catch (Exception var10) {
		}

		SecureRandomFuture.clientPreferences = var5;
		this.setUpClipboard();
		String var12 = GrandExchangeOfferAgeComparator.field3882;
		class29.field172 = this;
		if (var12 != null) {
			class29.field177 = var12;
		}

		if (gameBuild != 0) {
			displayFps = true;
		}

		Occluder.setWindowedMode(SecureRandomFuture.clientPreferences.windowMode);
		GameEngine.friendSystem = new FriendSystem(class194.loginType);
		this.field510 = new class14("tokenRequest", 1, 1);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-24240"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
			}

			if (var1 == null) {
				class91.method2336();
				class148.playPcmPlayers();
				int var45;
				synchronized(KeyHandler.KeyHandler_instance) {
					++KeyHandler.KeyHandler_idleCycles;
					KeyHandler.field143 = KeyHandler.field145;
					KeyHandler.field140 = 0;
					KeyHandler.field142 = 0;
					Arrays.fill(KeyHandler.field132, false);
					Arrays.fill(KeyHandler.field130, false);
					if (KeyHandler.field120 < 0) {
						Arrays.fill(KeyHandler.KeyHandler_pressedKeys, false);
						KeyHandler.field120 = KeyHandler.field135;
					} else {
						while (KeyHandler.field120 != KeyHandler.field135) {
							var45 = KeyHandler.field134[KeyHandler.field135];
							KeyHandler.field135 = KeyHandler.field135 + 1 & 127;
							if (var45 < 0) {
								var45 = ~var45;
								if (KeyHandler.KeyHandler_pressedKeys[var45]) {
									KeyHandler.KeyHandler_pressedKeys[var45] = false;
									KeyHandler.field130[var45] = true;
									KeyHandler.field141[KeyHandler.field142] = var45;
									++KeyHandler.field142;
								}
							} else {
								if (!KeyHandler.KeyHandler_pressedKeys[var45] && KeyHandler.field140 < KeyHandler.field139.length - 1) {
									KeyHandler.field132[var45] = true;
									KeyHandler.field139[++KeyHandler.field140 - 1] = var45;
								}

								KeyHandler.KeyHandler_pressedKeys[var45] = true;
							}
						}
					}

					if (KeyHandler.field140 > 0) {
						KeyHandler.KeyHandler_idleCycles = 0;
					}

					KeyHandler.field145 = KeyHandler.field144;
				}

				MenuAction.method1961();
				int var46;
				if (WorldMapDecorationType.mouseWheel != null) {
					var46 = WorldMapDecorationType.mouseWheel.useRotation();
					mouseWheelRotation = var46;
				}

				if (gameState == 0) {
					UserComparator10.load();
					class17.method292();
				} else if (gameState == 5) {
					Skeleton.method3947(this, class114.fontPlain12);
					UserComparator10.load();
					class91.clock.mark();

					for (var46 = 0; var46 < 32; ++var46) {
						GameEngine.graphicsTickTimes[var46] = 0L;
					}

					for (var46 = 0; var46 < 32; ++var46) {
						GameEngine.clientTickTimes[var46] = 0L;
					}

					GameEngine.gameCyclesToDo = 0;
				} else if (gameState != 10 && gameState != 11) {
					if (gameState == 20) {
						Skeleton.method3947(this, class114.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 25) {
						ClientPacket.method5001(false);
						field529 = 0;
						boolean var77 = true;

						for (var45 = 0; var45 < TileItem.regionLandArchives.length; ++var45) {
							if (Tiles.regionMapArchiveIds[var45] != -1 && TileItem.regionLandArchives[var45] == null) {
								TileItem.regionLandArchives[var45] = class140.archive5.takeFile(Tiles.regionMapArchiveIds[var45], 0);
								if (TileItem.regionLandArchives[var45] == null) {
									var77 = false;
									++field529;
								}
							}

							if (class10.regionLandArchiveIds[var45] != -1 && VarpDefinition.regionMapArchives[var45] == null) {
								VarpDefinition.regionMapArchives[var45] = class140.archive5.takeFileEncrypted(class10.regionLandArchiveIds[var45], 0, WorldMapID.xteaKeys[var45]);
								if (VarpDefinition.regionMapArchives[var45] == null) {
									var77 = false;
									++field529;
								}
							}
						}

						if (!var77) {
							field602 = 1;
						} else {
							field617 = 0;
							var77 = true;

							int var5;
							boolean var8;
							Buffer var9;
							int var10;
							int var11;
							int var12;
							int var14;
							int var15;
							int var16;
							int var17;
							int var18;
							int var19;
							int var47;
							for (var45 = 0; var45 < TileItem.regionLandArchives.length; ++var45) {
								byte[] var3 = VarpDefinition.regionMapArchives[var45];
								if (var3 != null) {
									var47 = (class269.regions[var45] >> 8) * 64 - class131.baseX;
									var5 = (class269.regions[var45] & 255) * 64 - TileItem.baseY;
									if (isInInstance) {
										var47 = 10;
										var5 = 10;
									}

									var8 = true;
									var9 = new Buffer(var3);
									var10 = -1;

									label1403:
									while (true) {
										var11 = var9.method7378();
										if (var11 == 0) {
											var77 &= var8;
											break;
										}

										var10 += var11;
										var12 = 0;
										boolean var13 = false;

										while (true) {
											while (!var13) {
												var14 = var9.readUShortSmart();
												if (var14 == 0) {
													continue label1403;
												}

												var12 += var14 - 1;
												var15 = var12 & 63;
												var16 = var12 >> 6 & 63;
												var17 = var9.readUnsignedByte() >> 2;
												var18 = var16 + var47;
												var19 = var15 + var5;
												if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
													ObjectComposition var20 = class148.getObjectDefinition(var10);
													if (var17 != 22 || !isLowDetail || var20.int1 != 0 || var20.interactType == 1 || var20.boolean2) {
														if (!var20.needsModelFiles()) {
															++field617;
															var8 = false;
														}

														var13 = true;
													}
												}
											}

											var14 = var9.readUShortSmart();
											if (var14 == 0) {
												break;
											}

											var9.readUnsignedByte();
										}
									}
								}
							}

							if (!var77) {
								field602 = 2;
							} else {
								if (field602 != 0) {
									ArchiveDiskActionHandler.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
								}

								class148.playPcmPlayers();
								class7.scene.clear();

								for (var45 = 0; var45 < 4; ++var45) {
									collisionMaps[var45].clear();
								}

								int var48;
								for (var45 = 0; var45 < 4; ++var45) {
									for (var48 = 0; var48 < 104; ++var48) {
										for (var47 = 0; var47 < 104; ++var47) {
											Tiles.Tiles_renderFlags[var45][var48][var47] = 0;
										}
									}
								}

								class148.playPcmPlayers();
								class118.method2686();
								var45 = TileItem.regionLandArchives.length;
								GrandExchangeEvent.method5760();
								ClientPacket.method5001(true);
								int var6;
								int var21;
								int var22;
								int var52;
								int var72;
								if (!isInInstance) {
									byte[] var49;
									for (var48 = 0; var48 < var45; ++var48) {
										var47 = (class269.regions[var48] >> 8) * 64 - class131.baseX;
										var5 = (class269.regions[var48] & 255) * 64 - TileItem.baseY;
										var49 = TileItem.regionLandArchives[var48];
										if (var49 != null) {
											class148.playPcmPlayers();
											class10.method119(var49, var47, var5, Messages.field1277 * 8 - 48, class4.field9 * 8 - 48, collisionMaps);
										}
									}

									for (var48 = 0; var48 < var45; ++var48) {
										var47 = (class269.regions[var48] >> 8) * 64 - class131.baseX;
										var5 = (class269.regions[var48] & 255) * 64 - TileItem.baseY;
										var49 = TileItem.regionLandArchives[var48];
										if (var49 == null && class4.field9 < 800) {
											class148.playPcmPlayers();
											class112.method2572(var47, var5, 64, 64);
										}
									}

									ClientPacket.method5001(true);

									for (var48 = 0; var48 < var45; ++var48) {
										byte[] var4 = VarpDefinition.regionMapArchives[var48];
										if (var4 != null) {
											var5 = (class269.regions[var48] >> 8) * 64 - class131.baseX;
											var6 = (class269.regions[var48] & 255) * 64 - TileItem.baseY;
											class148.playPcmPlayers();
											Scene var50 = class7.scene;
											CollisionMap[] var51 = collisionMaps;
											var9 = new Buffer(var4);
											var10 = -1;

											while (true) {
												var11 = var9.method7378();
												if (var11 == 0) {
													break;
												}

												var10 += var11;
												var12 = 0;

												while (true) {
													var72 = var9.readUShortSmart();
													if (var72 == 0) {
														break;
													}

													var12 += var72 - 1;
													var14 = var12 & 63;
													var15 = var12 >> 6 & 63;
													var16 = var12 >> 12;
													var17 = var9.readUnsignedByte();
													var18 = var17 >> 2;
													var19 = var17 & 3;
													var52 = var5 + var15;
													var21 = var6 + var14;
													if (var52 > 0 && var21 > 0 && var52 < 103 && var21 < 103) {
														var22 = var16;
														if ((Tiles.Tiles_renderFlags[1][var52][var21] & 2) == 2) {
															var22 = var16 - 1;
														}

														CollisionMap var23 = null;
														if (var22 >= 0) {
															var23 = var51[var22];
														}

														ClanChannel.method2996(var16, var52, var21, var10, var19, var18, var50, var23);
													}
												}
											}
										}
									}
								}

								int var7;
								int[] var10000;
								int var25;
								int var26;
								int var27;
								int var28;
								int var29;
								int var30;
								int var33;
								int var34;
								int var35;
								int var36;
								int var37;
								int var39;
								int var40;
								int var41;
								int var53;
								int var56;
								int var59;
								int var69;
								if (isInInstance) {
									var48 = 0;

									label1308:
									while (true) {
										int var38;
										CollisionMap[] var55;
										Buffer var73;
										if (var48 >= 4) {
											for (var48 = 0; var48 < 13; ++var48) {
												for (var47 = 0; var47 < 13; ++var47) {
													var5 = instanceChunkTemplates[0][var48][var47];
													if (var5 == -1) {
														class112.method2572(var48 * 8, var47 * 8, 8, 8);
													}
												}
											}

											ClientPacket.method5001(true);
											var48 = 0;

											while (true) {
												if (var48 >= 4) {
													break label1308;
												}

												class148.playPcmPlayers();

												for (var47 = 0; var47 < 13; ++var47) {
													label1231:
													for (var5 = 0; var5 < 13; ++var5) {
														var6 = instanceChunkTemplates[var48][var47][var5];
														if (var6 != -1) {
															var7 = var6 >> 24 & 3;
															var69 = var6 >> 1 & 3;
															var53 = var6 >> 14 & 1023;
															var10 = var6 >> 3 & 2047;
															var11 = (var53 / 8 << 8) + var10 / 8;

															for (var12 = 0; var12 < class269.regions.length; ++var12) {
																if (class269.regions[var12] == var11 && VarpDefinition.regionMapArchives[var12] != null) {
																	byte[] var57 = VarpDefinition.regionMapArchives[var12];
																	var14 = var47 * 8;
																	var15 = var5 * 8;
																	var16 = (var53 & 7) * 8;
																	var17 = (var10 & 7) * 8;
																	Scene var58 = class7.scene;
																	var55 = collisionMaps;
																	var73 = new Buffer(var57);
																	var21 = -1;

																	while (true) {
																		var22 = var73.method7378();
																		if (var22 == 0) {
																			continue label1231;
																		}

																		var21 += var22;
																		var56 = 0;

																		while (true) {
																			var59 = var73.readUShortSmart();
																			if (var59 == 0) {
																				break;
																			}

																			var56 += var59 - 1;
																			var25 = var56 & 63;
																			var26 = var56 >> 6 & 63;
																			var27 = var56 >> 12;
																			var28 = var73.readUnsignedByte();
																			var29 = var28 >> 2;
																			var30 = var28 & 3;
																			if (var27 == var7 && var26 >= var16 && var26 < var16 + 8 && var25 >= var17 && var25 < var17 + 8) {
																				ObjectComposition var31 = class148.getObjectDefinition(var21);
																				var34 = var26 & 7;
																				var35 = var25 & 7;
																				var37 = var31.sizeX;
																				var38 = var31.sizeY;
																				if ((var30 & 1) == 1) {
																					var39 = var37;
																					var37 = var38;
																					var38 = var39;
																				}

																				var36 = var69 & 3;
																				if (var36 == 0) {
																					var33 = var34;
																				} else if (var36 == 1) {
																					var33 = var35;
																				} else if (var36 == 2) {
																					var33 = 7 - var34 - (var37 - 1);
																				} else {
																					var33 = 7 - var35 - (var38 - 1);
																				}

																				var39 = var33 + var14;
																				Object var10001 = null;
																				var40 = var15 + Calendar.method5320(var26 & 7, var25 & 7, var69, var31.sizeX, var31.sizeY, var30);
																				if (var39 > 0 && var40 > 0 && var39 < 103 && var40 < 103) {
																					var41 = var48;
																					if ((Tiles.Tiles_renderFlags[1][var39][var40] & 2) == 2) {
																						var41 = var48 - 1;
																					}

																					CollisionMap var42 = null;
																					if (var41 >= 0) {
																						var42 = var55[var41];
																					}

																					ClanChannel.method2996(var48, var39, var40, var21, var69 + var30 & 3, var29, var58, var42);
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}

												++var48;
											}
										}

										class148.playPcmPlayers();

										for (var47 = 0; var47 < 13; ++var47) {
											for (var5 = 0; var5 < 13; ++var5) {
												boolean var67 = false;
												var7 = instanceChunkTemplates[var48][var47][var5];
												if (var7 != -1) {
													var69 = var7 >> 24 & 3;
													var53 = var7 >> 1 & 3;
													var10 = var7 >> 14 & 1023;
													var11 = var7 >> 3 & 2047;
													var12 = (var10 / 8 << 8) + var11 / 8;

													for (var72 = 0; var72 < class269.regions.length; ++var72) {
														if (class269.regions[var72] == var12 && TileItem.regionLandArchives[var72] != null) {
															byte[] var54 = TileItem.regionLandArchives[var72];
															var15 = var47 * 8;
															var16 = var5 * 8;
															var17 = (var10 & 7) * 8;
															var18 = (var11 & 7) * 8;
															var55 = collisionMaps;

															for (var52 = 0; var52 < 8; ++var52) {
																for (var21 = 0; var21 < 8; ++var21) {
																	if (var52 + var15 > 0 && var15 + var52 < 103 && var16 + var21 > 0 && var16 + var21 < 103) {
																		var10000 = var55[var48].flags[var15 + var52];
																		var10000[var16 + var21] &= -16777217;
																	}
																}
															}

															var73 = new Buffer(var54);

															for (var21 = 0; var21 < 4; ++var21) {
																for (var22 = 0; var22 < 64; ++var22) {
																	for (var56 = 0; var56 < 64; ++var56) {
																		if (var69 == var21 && var22 >= var17 && var22 < var17 + 8 && var56 >= var18 && var56 < var18 + 8) {
																			var28 = var22 & 7;
																			var29 = var56 & 7;
																			var30 = var53 & 3;
																			if (var30 == 0) {
																				var27 = var28;
																			} else if (var30 == 1) {
																				var27 = var29;
																			} else if (var30 == 2) {
																				var27 = 7 - var28;
																			} else {
																				var27 = 7 - var29;
																			}

																			var33 = var15 + var27;
																			var36 = var22 & 7;
																			var37 = var56 & 7;
																			var38 = var53 & 3;
																			if (var38 == 0) {
																				var35 = var37;
																			} else if (var38 == 1) {
																				var35 = 7 - var36;
																			} else if (var38 == 2) {
																				var35 = 7 - var37;
																			} else {
																				var35 = var36;
																			}

																			ScriptFrame.loadTerrain(var73, var48, var33, var16 + var35, 0, 0, var53);
																		} else {
																			ScriptFrame.loadTerrain(var73, 0, -1, -1, 0, 0, 0);
																		}
																	}
																}
															}

															var67 = true;
															break;
														}
													}
												}

												if (!var67) {
													MenuAction.method1959(var48, var47 * 8, var5 * 8);
												}
											}
										}

										++var48;
									}
								}

								ClientPacket.method5001(true);
								class148.playPcmPlayers();
								Scene var65 = class7.scene;
								CollisionMap[] var66 = collisionMaps;

								for (var5 = 0; var5 < 4; ++var5) {
									for (var6 = 0; var6 < 104; ++var6) {
										for (var7 = 0; var7 < 104; ++var7) {
											if ((Tiles.Tiles_renderFlags[var5][var6][var7] & 1) == 1) {
												var69 = var5;
												if ((Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) {
													var69 = var5 - 1;
												}

												if (var69 >= 0) {
													var66[var69].setBlockedByFloor(var6, var7);
												}
											}
										}
									}
								}

								Tiles.rndHue += (int)(Math.random() * 5.0D) - 2;
								if (Tiles.rndHue < -8) {
									Tiles.rndHue = -8;
								}

								if (Tiles.rndHue > 8) {
									Tiles.rndHue = 8;
								}

								Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2;
								if (Tiles.rndLightness < -16) {
									Tiles.rndLightness = -16;
								}

								if (Tiles.rndLightness > 16) {
									Tiles.rndLightness = 16;
								}

								for (var5 = 0; var5 < 4; ++var5) {
									byte[][] var78 = SoundCache.field321[var5];
									boolean var68 = true;
									var8 = true;
									boolean var81 = true;
									boolean var70 = true;
									boolean var71 = true;
									var12 = (int)Math.sqrt(5100.0D);
									var72 = var12 * 768 >> 8;

									for (var14 = 1; var14 < 103; ++var14) {
										for (var15 = 1; var15 < 103; ++var15) {
											var16 = Tiles.Tiles_heights[var5][var15 + 1][var14] - Tiles.Tiles_heights[var5][var15 - 1][var14];
											var17 = Tiles.Tiles_heights[var5][var15][var14 + 1] - Tiles.Tiles_heights[var5][var15][var14 - 1];
											var18 = (int)Math.sqrt((double)(var17 * var17 + var16 * var16 + 65536));
											var19 = (var16 << 8) / var18;
											var52 = 65536 / var18;
											var21 = (var17 << 8) / var18;
											var22 = (var19 * -50 + var21 * -50 + var52 * -10) / var72 + 96;
											var56 = (var78[var15 - 1][var14] >> 2) + (var78[var15][var14 - 1] >> 2) + (var78[var15 + 1][var14] >> 3) + (var78[var15][var14 + 1] >> 3) + (var78[var15][var14] >> 1);
											class194.field2280[var15][var14] = var22 - var56;
										}
									}

									for (var14 = 0; var14 < 104; ++var14) {
										Tiles.Tiles_hue[var14] = 0;
										User.Tiles_saturation[var14] = 0;
										Tiles.Tiles_lightness[var14] = 0;
										UserComparator5.Tiles_hueMultiplier[var14] = 0;
										VerticalAlignment.field1874[var14] = 0;
									}

									for (var14 = -5; var14 < 109; ++var14) {
										for (var15 = 0; var15 < 104; ++var15) {
											var16 = var14 + 5;
											int var10002;
											if (var16 >= 0 && var16 < 104) {
												var17 = Tiles.Tiles_underlays[var5][var16][var15] & 255;
												if (var17 > 0) {
													FloorUnderlayDefinition var83 = InterfaceParent.method2144(var17 - 1);
													var10000 = Tiles.Tiles_hue;
													var10000[var15] += var83.hue;
													var10000 = User.Tiles_saturation;
													var10000[var15] += var83.saturation;
													var10000 = Tiles.Tiles_lightness;
													var10000[var15] += var83.lightness;
													var10000 = UserComparator5.Tiles_hueMultiplier;
													var10000[var15] += var83.hueMultiplier;
													var10002 = VerticalAlignment.field1874[var15]++;
												}
											}

											var17 = var14 - 5;
											if (var17 >= 0 && var17 < 104) {
												var18 = Tiles.Tiles_underlays[var5][var17][var15] & 255;
												if (var18 > 0) {
													FloorUnderlayDefinition var82 = InterfaceParent.method2144(var18 - 1);
													var10000 = Tiles.Tiles_hue;
													var10000[var15] -= var82.hue;
													var10000 = User.Tiles_saturation;
													var10000[var15] -= var82.saturation;
													var10000 = Tiles.Tiles_lightness;
													var10000[var15] -= var82.lightness;
													var10000 = UserComparator5.Tiles_hueMultiplier;
													var10000[var15] -= var82.hueMultiplier;
													var10002 = VerticalAlignment.field1874[var15]--;
												}
											}
										}

										if (var14 >= 1 && var14 < 103) {
											var15 = 0;
											var16 = 0;
											var17 = 0;
											var18 = 0;
											var19 = 0;

											for (var52 = -5; var52 < 109; ++var52) {
												var21 = var52 + 5;
												if (var21 >= 0 && var21 < 104) {
													var15 += Tiles.Tiles_hue[var21];
													var16 += User.Tiles_saturation[var21];
													var17 += Tiles.Tiles_lightness[var21];
													var18 += UserComparator5.Tiles_hueMultiplier[var21];
													var19 += VerticalAlignment.field1874[var21];
												}

												var22 = var52 - 5;
												if (var22 >= 0 && var22 < 104) {
													var15 -= Tiles.Tiles_hue[var22];
													var16 -= User.Tiles_saturation[var22];
													var17 -= Tiles.Tiles_lightness[var22];
													var18 -= UserComparator5.Tiles_hueMultiplier[var22];
													var19 -= VerticalAlignment.field1874[var22];
												}

												if (var52 >= 1 && var52 < 103 && (!isLowDetail || (Tiles.Tiles_renderFlags[0][var14][var52] & 2) != 0 || (Tiles.Tiles_renderFlags[var5][var14][var52] & 16) == 0)) {
													if (var5 < Tiles.Tiles_minPlane) {
														Tiles.Tiles_minPlane = var5;
													}

													var56 = Tiles.Tiles_underlays[var5][var14][var52] & 255;
													var59 = Tiles.Tiles_overlays[var5][var14][var52] & 255;
													if (var56 > 0 || var59 > 0) {
														var25 = Tiles.Tiles_heights[var5][var14][var52];
														var26 = Tiles.Tiles_heights[var5][var14 + 1][var52];
														var27 = Tiles.Tiles_heights[var5][var14 + 1][var52 + 1];
														var28 = Tiles.Tiles_heights[var5][var14][var52 + 1];
														var29 = class194.field2280[var14][var52];
														var30 = class194.field2280[var14 + 1][var52];
														int var60 = class194.field2280[var14 + 1][var52 + 1];
														int var32 = class194.field2280[var14][var52 + 1];
														var33 = -1;
														var34 = -1;
														if (var56 > 0) {
															var35 = var15 * 256 / var18;
															var36 = var16 / var19;
															var37 = var17 / var19;
															var33 = MusicPatchNode2.hslToRgb(var35, var36, var37);
															var35 = var35 + Tiles.rndHue & 255;
															var37 += Tiles.rndLightness;
															if (var37 < 0) {
																var37 = 0;
															} else if (var37 > 255) {
																var37 = 255;
															}

															var34 = MusicPatchNode2.hslToRgb(var35, var36, var37);
														}

														if (var5 > 0) {
															boolean var75 = true;
															if (var56 == 0 && Tiles.Tiles_shapes[var5][var14][var52] != 0) {
																var75 = false;
															}

															if (var59 > 0 && !class18.method302(var59 - 1).hideUnderlay) {
																var75 = false;
															}

															if (var75 && var25 == var26 && var25 == var27 && var25 == var28) {
																var10000 = ClanChannelMember.field1504[var5][var14];
																var10000[var52] |= 2340;
															}
														}

														var35 = 0;
														if (var34 != -1) {
															var35 = Rasterizer3D.Rasterizer3D_colorPalette[Login.method1995(var34, 96)];
														}

														if (var59 == 0) {
															var65.addTile(var5, var14, var52, 0, 0, -1, var25, var26, var27, var28, Login.method1995(var33, var29), Login.method1995(var33, var30), Login.method1995(var33, var60), Login.method1995(var33, var32), 0, 0, 0, 0, var35, 0);
														} else {
															var36 = Tiles.Tiles_shapes[var5][var14][var52] + 1;
															byte var76 = WorldMapLabelSize.field2580[var5][var14][var52];
															FloorOverlayDefinition var61 = class18.method302(var59 - 1);
															var39 = var61.texture;
															int var43;
															int var62;
															if (var39 >= 0) {
																var41 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var39);
																var40 = -1;
															} else if (var61.primaryRgb == 16711935) {
																var40 = -2;
																var39 = -1;
																var41 = -2;
															} else {
																var40 = MusicPatchNode2.hslToRgb(var61.hue, var61.saturation, var61.lightness);
																var62 = var61.hue + Tiles.rndHue & 255;
																var43 = var61.lightness + Tiles.rndLightness;
																if (var43 < 0) {
																	var43 = 0;
																} else if (var43 > 255) {
																	var43 = 255;
																}

																var41 = MusicPatchNode2.hslToRgb(var62, var61.saturation, var43);
															}

															var62 = 0;
															if (var41 != -2) {
																var62 = Rasterizer3D.Rasterizer3D_colorPalette[PendingSpawn.method2223(var41, 96)];
															}

															if (var61.secondaryRgb != -1) {
																var43 = var61.secondaryHue + Tiles.rndHue & 255;
																int var44 = var61.secondaryLightness + Tiles.rndLightness;
																if (var44 < 0) {
																	var44 = 0;
																} else if (var44 > 255) {
																	var44 = 255;
																}

																var41 = MusicPatchNode2.hslToRgb(var43, var61.secondarySaturation, var44);
																var62 = Rasterizer3D.Rasterizer3D_colorPalette[PendingSpawn.method2223(var41, 96)];
															}

															var65.addTile(var5, var14, var52, var36, var76, var39, var25, var26, var27, var28, Login.method1995(var33, var29), Login.method1995(var33, var30), Login.method1995(var33, var60), Login.method1995(var33, var32), PendingSpawn.method2223(var40, var29), PendingSpawn.method2223(var40, var30), PendingSpawn.method2223(var40, var60), PendingSpawn.method2223(var40, var32), var35, var62);
														}
													}
												}
											}
										}
									}

									for (var14 = 1; var14 < 103; ++var14) {
										for (var15 = 1; var15 < 103; ++var15) {
											var65.setTileMinPlane(var5, var15, var14, Login.method1993(var5, var15, var14));
										}
									}

									Tiles.Tiles_underlays[var5] = null;
									Tiles.Tiles_overlays[var5] = null;
									Tiles.Tiles_shapes[var5] = null;
									WorldMapLabelSize.field2580[var5] = null;
									SoundCache.field321[var5] = null;
								}

								var65.method3981(-50, -10, -50);

								for (var5 = 0; var5 < 104; ++var5) {
									for (var6 = 0; var6 < 104; ++var6) {
										if ((Tiles.Tiles_renderFlags[1][var5][var6] & 2) == 2) {
											var65.setLinkBelow(var5, var6);
										}
									}
								}

								var5 = 1;
								var6 = 2;
								var7 = 4;

								for (var69 = 0; var69 < 4; ++var69) {
									if (var69 > 0) {
										var5 <<= 3;
										var6 <<= 3;
										var7 <<= 3;
									}

									for (var53 = 0; var53 <= var69; ++var53) {
										for (var10 = 0; var10 <= 104; ++var10) {
											for (var11 = 0; var11 <= 104; ++var11) {
												short var74;
												if ((ClanChannelMember.field1504[var53][var11][var10] & var5) != 0) {
													var12 = var10;
													var72 = var10;
													var14 = var53;

													for (var15 = var53; var12 > 0 && (ClanChannelMember.field1504[var53][var11][var12 - 1] & var5) != 0; --var12) {
													}

													while (var72 < 104 && (ClanChannelMember.field1504[var53][var11][var72 + 1] & var5) != 0) {
														++var72;
													}

													label957:
													while (var14 > 0) {
														for (var16 = var12; var16 <= var72; ++var16) {
															if ((ClanChannelMember.field1504[var14 - 1][var11][var16] & var5) == 0) {
																break label957;
															}
														}

														--var14;
													}

													label946:
													while (var15 < var69) {
														for (var16 = var12; var16 <= var72; ++var16) {
															if ((ClanChannelMember.field1504[var15 + 1][var11][var16] & var5) == 0) {
																break label946;
															}
														}

														++var15;
													}

													var16 = (var15 + 1 - var14) * (var72 - var12 + 1);
													if (var16 >= 8) {
														var74 = 240;
														var18 = Tiles.Tiles_heights[var15][var11][var12] - var74;
														var19 = Tiles.Tiles_heights[var14][var11][var12];
														Scene.Scene_addOccluder(var69, 1, var11 * 128, var11 * 128, var12 * 128, var72 * 128 + 128, var18, var19);

														for (var52 = var14; var52 <= var15; ++var52) {
															for (var21 = var12; var21 <= var72; ++var21) {
																var10000 = ClanChannelMember.field1504[var52][var11];
																var10000[var21] &= ~var5;
															}
														}
													}
												}

												if ((ClanChannelMember.field1504[var53][var11][var10] & var6) != 0) {
													var12 = var11;
													var72 = var11;
													var14 = var53;

													for (var15 = var53; var12 > 0 && (ClanChannelMember.field1504[var53][var12 - 1][var10] & var6) != 0; --var12) {
													}

													while (var72 < 104 && (ClanChannelMember.field1504[var53][var72 + 1][var10] & var6) != 0) {
														++var72;
													}

													label1010:
													while (var14 > 0) {
														for (var16 = var12; var16 <= var72; ++var16) {
															if ((ClanChannelMember.field1504[var14 - 1][var16][var10] & var6) == 0) {
																break label1010;
															}
														}

														--var14;
													}

													label999:
													while (var15 < var69) {
														for (var16 = var12; var16 <= var72; ++var16) {
															if ((ClanChannelMember.field1504[var15 + 1][var16][var10] & var6) == 0) {
																break label999;
															}
														}

														++var15;
													}

													var16 = (var15 + 1 - var14) * (var72 - var12 + 1);
													if (var16 >= 8) {
														var74 = 240;
														var18 = Tiles.Tiles_heights[var15][var12][var10] - var74;
														var19 = Tiles.Tiles_heights[var14][var12][var10];
														Scene.Scene_addOccluder(var69, 2, var12 * 128, var72 * 128 + 128, var10 * 128, var10 * 128, var18, var19);

														for (var52 = var14; var52 <= var15; ++var52) {
															for (var21 = var12; var21 <= var72; ++var21) {
																var10000 = ClanChannelMember.field1504[var52][var21];
																var10000[var10] &= ~var6;
															}
														}
													}
												}

												if ((ClanChannelMember.field1504[var53][var11][var10] & var7) != 0) {
													var12 = var11;
													var72 = var11;
													var14 = var10;

													for (var15 = var10; var14 > 0 && (ClanChannelMember.field1504[var53][var11][var14 - 1] & var7) != 0; --var14) {
													}

													while (var15 < 104 && (ClanChannelMember.field1504[var53][var11][var15 + 1] & var7) != 0) {
														++var15;
													}

													label1063:
													while (var12 > 0) {
														for (var16 = var14; var16 <= var15; ++var16) {
															if ((ClanChannelMember.field1504[var53][var12 - 1][var16] & var7) == 0) {
																break label1063;
															}
														}

														--var12;
													}

													label1052:
													while (var72 < 104) {
														for (var16 = var14; var16 <= var15; ++var16) {
															if ((ClanChannelMember.field1504[var53][var72 + 1][var16] & var7) == 0) {
																break label1052;
															}
														}

														++var72;
													}

													if ((var72 - var12 + 1) * (var15 - var14 + 1) >= 4) {
														var16 = Tiles.Tiles_heights[var53][var12][var14];
														Scene.Scene_addOccluder(var69, 4, var12 * 128, var72 * 128 + 128, var14 * 128, var15 * 128 + 128, var16, var16);

														for (var17 = var12; var17 <= var72; ++var17) {
															for (var18 = var14; var18 <= var15; ++var18) {
																var10000 = ClanChannelMember.field1504[var53][var17];
																var10000[var18] &= ~var7;
															}
														}
													}
												}
											}
										}
									}
								}

								ClientPacket.method5001(true);
								var5 = Tiles.Tiles_minPlane;
								if (var5 > class20.Client_plane) {
									var5 = class20.Client_plane;
								}

								if (var5 < class20.Client_plane - 1) {
									var5 = class20.Client_plane - 1;
								}

								if (isLowDetail) {
									class7.scene.init(Tiles.Tiles_minPlane);
								} else {
									class7.scene.init(0);
								}

								for (var6 = 0; var6 < 104; ++var6) {
									for (var7 = 0; var7 < 104; ++var7) {
										MouseHandler.updateItemPile(var6, var7);
									}
								}

								class148.playPcmPlayers();

								for (PendingSpawn var79 = (PendingSpawn)pendingSpawns.last(); var79 != null; var79 = (PendingSpawn)pendingSpawns.previous()) {
									if (var79.hitpoints == -1) {
										var79.delay = 0;
										class4.method26(var79);
									} else {
										var79.remove();
									}
								}

								ObjectComposition.ObjectDefinition_cachedModelData.clear();
								PacketBufferNode var80;
								if (class295.client.hasFrame()) {
									var80 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2879, packetWriter.isaacCipher);
									var80.packetBuffer.writeInt(1057001181);
									packetWriter.addNode(var80);
								}

								if (!isInInstance) {
									var6 = (Messages.field1277 - 6) / 8;
									var7 = (Messages.field1277 + 6) / 8;
									var69 = (class4.field9 - 6) / 8;
									var53 = (class4.field9 + 6) / 8;

									for (var10 = var6 - 1; var10 <= var7 + 1; ++var10) {
										for (var11 = var69 - 1; var11 <= var53 + 1; ++var11) {
											if (var10 < var6 || var10 > var7 || var11 < var69 || var11 > var53) {
												class140.archive5.loadRegionFromName("m" + var10 + "_" + var11);
												class140.archive5.loadRegionFromName("l" + var10 + "_" + var11);
											}
										}
									}
								}

								VertexNormal.updateGameState(30);
								class148.playPcmPlayers();
								class119.method2689();
								var80 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2848, packetWriter.isaacCipher);
								packetWriter.addNode(var80);
								class17.method292();
							}
						}
					}
				} else {
					Skeleton.method3947(this, class114.fontPlain12);
				}

				if (gameState == 30) {
					this.doCycleLoggedIn();
				} else if (gameState == 40 || gameState == 45) {
					this.doCycleLoggedOut();
				}

				return;
			}

			var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false);
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "549681271"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2;
		label168: {
			try {
				if (class260.musicPlayerStatus == 2) {
					if (class21.musicTrack == null) {
						class21.musicTrack = MusicTrack.readTrack(class124.musicTrackArchive, VarcInt.musicTrackGroupId, class260.musicTrackFileId);
						if (class21.musicTrack == null) {
							var2 = false;
							break label168;
						}
					}

					if (class257.soundCache == null) {
						class257.soundCache = new SoundCache(class260.soundEffectsArchive, class331.musicSamplesArchive);
					}

					if (class260.midiPcmStream.loadMusicTrack(class21.musicTrack, class260.musicPatchesArchive, class257.soundCache, 22050)) {
						class260.midiPcmStream.clearAll();
						class260.midiPcmStream.setPcmStreamVolume(ChatChannel.musicTrackVolume);
						class260.midiPcmStream.setMusicTrack(class21.musicTrack, DynamicObject.musicTrackBoolean);
						class260.musicPlayerStatus = 0;
						class21.musicTrack = null;
						class257.soundCache = null;
						class124.musicTrackArchive = null;
						var2 = true;
						break label168;
					}
				}
			} catch (Exception var6) {
				var6.printStackTrace();
				class260.midiPcmStream.clear();
				class260.musicPlayerStatus = 0;
				class21.musicTrack = null;
				class257.soundCache = null;
				class124.musicTrackArchive = null;
			}

			var2 = false;
		}

		if (var2 && field743 && JagexCache.pcmPlayer0 != null) {
			JagexCache.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && field514 != 0L && Ignored.method6459() > field514) {
			Occluder.setWindowedMode(class143.getWindowedMode());
		}

		int var4;
		if (var1) {
			for (var4 = 0; var4 < 100; ++var4) {
				field504[var4] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) {
			class253.drawTitle(class136.fontBold12, class307.fontPlain11, class114.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				class253.drawTitle(class136.fontBold12, class307.fontPlain11, class114.fontPlain12);
			} else if (gameState == 25) {
				if (field602 == 1) {
					if (field529 > field530) {
						field530 = field529;
					}

					var4 = (field530 * 50 - field529 * 50) / field530;
					ArchiveDiskActionHandler.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
				} else if (field602 == 2) {
					if (field617 > field532) {
						field532 = field617;
					}

					var4 = (field532 * 50 - field617 * 50) / field532 + 50;
					ArchiveDiskActionHandler.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
				} else {
					ArchiveDiskActionHandler.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				ArchiveDiskActionHandler.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				ArchiveDiskActionHandler.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class253.drawTitle(class136.fontBold12, class307.fontPlain11, class114.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var4 = 0; var4 < rootWidgetCount; ++var4) {
				if (field686[var4]) {
					class19.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]);
					field686[var4] = false;
				}
			}
		} else if (gameState > 0) {
			class19.rasterProvider.drawFull(0, 0);

			for (var4 = 0; var4 < rootWidgetCount; ++var4) {
				field686[var4] = false;
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1665222357"
	)
	@Export("kill0")
	protected final void kill0() {
		if (class339.varcs.hasUnwrittenChanges()) {
			class339.varcs.write();
		}

		if (mouseRecorder != null) {
			mouseRecorder.isRunning = false;
		}

		mouseRecorder = null;
		packetWriter.close();
		GrandExchangeEvents.method5716();
		Friend.method6294();
		WorldMapDecorationType.mouseWheel = null;
		if (JagexCache.pcmPlayer0 != null) {
			JagexCache.pcmPlayer0.shutdown();
		}

		if (PacketWriter.pcmPlayer1 != null) {
			PacketWriter.pcmPlayer1.shutdown();
		}

		GraphicsObject.method1956();
		class213.method4356();
		if (WorldMapData_1.urlRequester != null) {
			WorldMapData_1.urlRequester.close();
			WorldMapData_1.urlRequester = null;
		}

		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var1 = 0; var1 < class143.idxCount; ++var1) {
				JagexCache.JagexCache_idxFiles[var1].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var3) {
		}

		this.field510.method206();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-3"
	)
	protected final void vmethod1151() {
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1448065083"
	)
	boolean method1154() {
		return WorldMapAreaData.field2772 != null && !WorldMapAreaData.field2772.trim().isEmpty();
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-82"
	)
	void method1625(String var1) throws MalformedURLException, IOException {
		class10 var2 = new class10(new URL(class257.field3044 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"), class9.field36);
		var2.method121("Authorization", "Bearer " + var1);
		this.field613 = this.field510.method213(var2);
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "139044598"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = class295.method5515();
			if (!var1) {
				this.doCycleJs5Connect();
			}

		}
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1295917828"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) {
			this.error("js5crc");
			VertexNormal.updateGameState(1000);
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					VertexNormal.updateGameState(1000);
					return;
				}

				field517 = 3000;
				NetCache.NetCache_ioExceptions = 3;
			}

			if (--field517 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						ScriptEvent.js5SocketTask = GameEngine.taskHandler.newSocketTask(class185.worldHost, class129.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (ScriptEvent.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (ScriptEvent.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						if (useBufferedSocket) {
							FontName.js5Socket = Login.method1965((Socket)ScriptEvent.js5SocketTask.result, 40000, 5000);
						} else {
							FontName.js5Socket = new NetSocket((Socket)ScriptEvent.js5SocketTask.result, GameEngine.taskHandler, 5000);
						}

						Buffer var1 = new Buffer(5);
						var1.writeByte(15);
						var1.writeInt(202);
						FontName.js5Socket.write(var1.array, 0, 5);
						++js5ConnectState;
						class120.field1450 = Ignored.method6459();
					}

					if (js5ConnectState == 3) {
						if (FontName.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) {
							int var5 = FontName.js5Socket.readUnsignedByte();
							if (var5 != 0) {
								this.js5Error(var5);
								return;
							}

							++js5ConnectState;
						} else if (Ignored.method6459() - class120.field1450 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						AbstractSocket var10 = FontName.js5Socket;
						boolean var2 = gameState > 20;
						if (NetCache.NetCache_socket != null) {
							try {
								NetCache.NetCache_socket.close();
							} catch (Exception var8) {
							}

							NetCache.NetCache_socket = null;
						}

						NetCache.NetCache_socket = var10;
						ClientPreferences.method2297(var2);
						NetCache.NetCache_responseHeaderBuffer.offset = 0;
						class279.NetCache_currentResponse = null;
						class149.NetCache_responseArchiveBuffer = null;
						NetCache.field3863 = 0;

						while (true) {
							NetFileRequest var3 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first();
							if (var3 == null) {
								while (true) {
									var3 = (NetFileRequest)NetCache.NetCache_pendingResponses.first();
									if (var3 == null) {
										if (NetCache.field3866 != 0) {
											try {
												Buffer var11 = new Buffer(4);
												var11.writeByte(4);
												var11.writeByte(NetCache.field3866);
												var11.writeShort(0);
												NetCache.NetCache_socket.write(var11.array, 0, 4);
											} catch (IOException var7) {
												try {
													NetCache.NetCache_socket.close();
												} catch (Exception var6) {
												}

												++NetCache.NetCache_ioExceptions;
												NetCache.NetCache_socket = null;
											}
										}

										NetCache.NetCache_loadTime = 0;
										UserComparator7.field1319 = Ignored.method6459();
										ScriptEvent.js5SocketTask = null;
										FontName.js5Socket = null;
										js5ConnectState = 0;
										js5Errors = 0;
										return;
									}

									NetCache.NetCache_pendingWritesQueue.addLast(var3);
									NetCache.NetCache_pendingWrites.put(var3, var3.key);
									++NetCache.NetCache_pendingWritesCount;
									--NetCache.NetCache_pendingResponsesCount;
								}
							}

							NetCache.NetCache_pendingPriorityWrites.put(var3, var3.key);
							++NetCache.NetCache_pendingPriorityWritesCount;
							--NetCache.NetCache_pendingPriorityResponsesCount;
						}
					}
				} catch (IOException var9) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "99"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		ScriptEvent.js5SocketTask = null;
		FontName.js5Socket = null;
		js5ConnectState = 0;
		if (GameObject.worldPort == class129.currentPort) {
			class129.currentPort = class133.js5Port;
		} else {
			class129.currentPort = GameObject.worldPort;
		}

		++js5Errors;
		if (js5Errors < 2 || var1 != 7 && var1 != 9) {
			if (js5Errors >= 2 && var1 == 6) {
				this.error("js5connect_outofdate");
				VertexNormal.updateGameState(1000);
			} else if (js5Errors >= 4) {
				if (gameState <= 5) {
					this.error("js5connect");
					VertexNormal.updateGameState(1000);
				} else {
					field517 = 3000;
				}
			}
		} else if (gameState <= 5) {
			this.error("js5connect_full");
			VertexNormal.updateGameState(1000);
		} else {
			field517 = 3000;
		}

	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (loginState == 0) {
				if (class19.secureRandom == null && (secureRandomFuture.isDone() || field545 > 250)) {
					class19.secureRandom = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (class19.secureRandom != null) {
					if (var1 != null) {
						((AbstractSocket)var1).close();
						var1 = null;
					}

					class334.socketTask = null;
					hadNetworkError = false;
					field545 = 0;
					if (field508.method7605()) {
						try {
							this.method1625(WorldMapAreaData.field2772);
							PacketBufferNode.method5016(20);
						} catch (Throwable var21) {
							AccessFile.RunException_sendStackTrace((String)null, var21);
							class29.getLoginError(65);
							return;
						}
					} else {
						PacketBufferNode.method5016(1);
					}
				}
			}

			if (loginState == 20) {
				if (!this.field613.method309()) {
					return;
				}

				if (this.field613.method331()) {
					AccessFile.RunException_sendStackTrace(this.field613.method307(), (Throwable)null);
					class29.getLoginError(65);
					return;
				}

				class21 var3 = this.field613.method310();
				if (var3.method338() != 200) {
					AccessFile.RunException_sendStackTrace("Response code: " + var3.method338() + "Response body: " + var3.method339(), (Throwable)null);
					class29.getLoginError(65);
					return;
				}

				field545 = 0;
				this.field576 = var3.method339();
				PacketBufferNode.method5016(1);
			}

			if (loginState == 1) {
				if (class334.socketTask == null) {
					class334.socketTask = GameEngine.taskHandler.newSocketTask(class185.worldHost, class129.currentPort);
				}

				if (class334.socketTask.status == 2) {
					throw new IOException();
				}

				if (class334.socketTask.status == 1) {
					if (useBufferedSocket) {
						var1 = Login.method1965((Socket)class334.socketTask.result, 40000, 5000);
					} else {
						var1 = new NetSocket((Socket)class334.socketTask.result, GameEngine.taskHandler, 5000);
					}

					packetWriter.setSocket((AbstractSocket)var1);
					class334.socketTask = null;
					PacketBufferNode.method5016(2);
				}
			}

			PacketBufferNode var23;
			if (loginState == 2) {
				packetWriter.clearBuffer();
				var23 = class231.method4802();
				var23.packetBuffer.writeByte(LoginPacket.field3032.id);
				packetWriter.addNode(var23);
				packetWriter.flush();
				var2.offset = 0;
				PacketBufferNode.method5016(3);
			}

			int var4;
			boolean var12;
			if (loginState == 3) {
				if (JagexCache.pcmPlayer0 != null) {
					JagexCache.pcmPlayer0.method747();
				}

				if (PacketWriter.pcmPlayer1 != null) {
					PacketWriter.pcmPlayer1.method747();
				}

				var12 = true;
				if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) {
					var12 = false;
				}

				if (var12) {
					var4 = ((AbstractSocket)var1).readUnsignedByte();
					if (JagexCache.pcmPlayer0 != null) {
						JagexCache.pcmPlayer0.method747();
					}

					if (PacketWriter.pcmPlayer1 != null) {
						PacketWriter.pcmPlayer1.method747();
					}

					if (var4 != 0) {
						class29.getLoginError(var4);
						return;
					}

					var2.offset = 0;
					PacketBufferNode.method5016(4);
				}
			}

			int var34;
			if (loginState == 4) {
				if (var2.offset < 8) {
					var34 = ((AbstractSocket)var1).available();
					if (var34 > 8 - var2.offset) {
						var34 = 8 - var2.offset;
					}

					if (var34 > 0) {
						((AbstractSocket)var1).read(var2.array, var2.offset, var34);
						var2.offset += var34;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					Messages.field1272 = var2.readLong();
					PacketBufferNode.method5016(5);
				}
			}

			int var7;
			int var9;
			int var14;
			if (loginState == 5) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var24 = new PacketBuffer(500);
				int[] var13 = new int[]{class19.secureRandom.nextInt(), class19.secureRandom.nextInt(), class19.secureRandom.nextInt(), class19.secureRandom.nextInt()};
				var24.offset = 0;
				var24.writeByte(1);
				var24.writeInt(var13[0]);
				var24.writeInt(var13[1]);
				var24.writeInt(var13[2]);
				var24.writeInt(var13[3]);
				var24.writeLong(Messages.field1272);
				int var10;
				if (gameState == 40) {
					var24.writeInt(ArchiveLoader.field984[0]);
					var24.writeInt(ArchiveLoader.field984[1]);
					var24.writeInt(ArchiveLoader.field984[2]);
					var24.writeInt(ArchiveLoader.field984[3]);
				} else {
					var24.writeByte(field507.rsOrdinal());
					switch(field507.field1475) {
					case 0:
					case 3:
						var24.writeMedium(class148.field1651);
						++var24.offset;
						break;
					case 1:
						LinkedHashMap var6 = SecureRandomFuture.clientPreferences.parameters;
						String var8 = Login.Login_username;
						var9 = var8.length();
						var10 = 0;

						for (int var11 = 0; var11 < var9; ++var11) {
							var10 = (var10 << 5) - var10 + var8.charAt(var11);
						}

						var24.writeInt((Integer)var6.get(var10));
						break;
					case 2:
						var24.offset += 4;
					}

					if (field508.method7605()) {
						var24.writeByte(class422.field4524.rsOrdinal());
						var24.writeStringCp1252NullTerminated(this.field576);
					} else {
						var24.writeByte(class422.field4523.rsOrdinal());
						var24.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var24.encryptRsa(class67.field856, class67.field857);
				ArchiveLoader.field984 = var13;
				PacketBufferNode var5 = class231.method4802();
				var5.packetBuffer.offset = 0;
				if (gameState == 40) {
					var5.packetBuffer.writeByte(LoginPacket.field3037.id);
				} else {
					var5.packetBuffer.writeByte(LoginPacket.field3038.id);
				}

				var5.packetBuffer.writeShort(0);
				var14 = var5.packetBuffer.offset;
				var5.packetBuffer.writeInt(202);
				var5.packetBuffer.writeInt(1);
				var5.packetBuffer.writeByte(clientType);
				var5.packetBuffer.writeByte(field499);
				var5.packetBuffer.writeBytes(var24.array, 0, var24.offset);
				var7 = var5.packetBuffer.offset;
				var5.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var5.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var5.packetBuffer.writeShort(class186.canvasWidth);
				var5.packetBuffer.writeShort(BoundaryObject.canvasHeight);
				Decimator.method1082(var5.packetBuffer);
				var5.packetBuffer.writeStringCp1252NullTerminated(class1.field3);
				var5.packetBuffer.writeInt(FriendLoginUpdate.field4096);
				Buffer var32 = new Buffer(Interpreter.platformInfo.size());
				Interpreter.platformInfo.write(var32);
				var5.packetBuffer.writeBytes(var32.array, 0, var32.array.length);
				var5.packetBuffer.writeByte(clientType);
				var5.packetBuffer.writeInt(0);
				var5.packetBuffer.writeInt(0);
				var5.packetBuffer.method7407(WorldMapScaleHandler.archive6.hash);
				var5.packetBuffer.writeIntME(class9.archive1.hash);
				var5.packetBuffer.method7407(ChatChannel.archive14.hash);
				var5.packetBuffer.method7527(class1.archive13.hash);
				var5.packetBuffer.writeInt(TaskHandler.archive12.hash);
				var5.packetBuffer.writeInt(class148.archive19.hash);
				var5.packetBuffer.method7407(class133.archive15.hash);
				var5.packetBuffer.writeIntME(class19.archive3.hash);
				var5.packetBuffer.writeIntME(UserComparator6.archive8.hash);
				var5.packetBuffer.method7527(class126.archive17.hash);
				var5.packetBuffer.writeIntME(class115.archive7.hash);
				var5.packetBuffer.writeInt(Players.archive11.hash);
				var5.packetBuffer.method7407(VertexNormal.archive18.hash);
				var5.packetBuffer.writeInt(class140.archive5.hash);
				var5.packetBuffer.writeIntME(class131.archive2.hash);
				var5.packetBuffer.method7407(KeyHandler.archive4.hash);
				var5.packetBuffer.writeIntME(NetSocket.archive9.hash);
				var5.packetBuffer.writeInt(class257.archive10.hash);
				var5.packetBuffer.method7407(HealthBarUpdate.archive20.hash);
				var5.packetBuffer.method7407(class115.archive0.hash);
				var5.packetBuffer.xteaEncrypt(var13, var7, var5.packetBuffer.offset);
				var5.packetBuffer.writeLengthShort(var5.packetBuffer.offset - var14);
				packetWriter.addNode(var5);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var13);
				int[] var15 = new int[4];

				for (var10 = 0; var10 < 4; ++var10) {
					var15[var10] = var13[var10] + 50;
				}

				var2.newIsaacCipher(var15);
				PacketBufferNode.method5016(6);
			}

			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) {
				var34 = ((AbstractSocket)var1).readUnsignedByte();
				if (var34 == 21 && gameState == 20) {
					PacketBufferNode.method5016(12);
				} else if (var34 == 2) {
					PacketBufferNode.method5016(14);
				} else if (var34 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					PacketBufferNode.method5016(19);
				} else if (var34 == 64) {
					PacketBufferNode.method5016(10);
				} else if (var34 == 23 && field541 < 1) {
					++field541;
					PacketBufferNode.method5016(0);
				} else if (var34 == 29) {
					PacketBufferNode.method5016(17);
				} else {
					if (var34 != 69) {
						class29.getLoginError(var34);
						return;
					}

					PacketBufferNode.method5016(7);
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) {
				((AbstractSocket)var1).read(var2.array, 0, 2);
				var2.offset = 0;
				WorldMapSection2.field2601 = var2.readUnsignedShort();
				PacketBufferNode.method5016(8);
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= WorldMapSection2.field2601) {
				var2.offset = 0;
				((AbstractSocket)var1).read(var2.array, var2.offset, WorldMapSection2.field2601);
				class6 var25 = FontName.method7075()[var2.readUnsignedByte()];

				try {
					class3 var35 = KitDefinition.method3238(var25);
					this.field515 = new class7(var2, var35);
					PacketBufferNode.method5016(9);
				} catch (Exception var20) {
					class29.getLoginError(22);
					return;
				}
			}

			if (loginState == 9 && this.field515.method61()) {
				this.field710 = this.field515.method75();
				this.field515.method65();
				this.field515 = null;
				if (this.field710 == null) {
					class29.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var23 = class231.method4802();
				var23.packetBuffer.writeByte(LoginPacket.field3034.id);
				var23.packetBuffer.writeShort(this.field710.offset);
				var23.packetBuffer.method7356(this.field710);
				packetWriter.addNode(var23);
				packetWriter.flush();
				this.field710 = null;
				PacketBufferNode.method5016(6);
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) {
				class10.field59 = ((AbstractSocket)var1).readUnsignedByte();
				PacketBufferNode.method5016(11);
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= class10.field59) {
				((AbstractSocket)var1).read(var2.array, 0, class10.field59);
				var2.offset = 0;
				PacketBufferNode.method5016(6);
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) {
				field506 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60;
				PacketBufferNode.method5016(13);
			}

			if (loginState == 13) {
				field545 = 0;
				class19.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field506 / 60 + " seconds.");
				if (--field506 <= 0) {
					PacketBufferNode.method5016(0);
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) {
					Canvas.field163 = ((AbstractSocket)var1).readUnsignedByte();
					PacketBufferNode.method5016(15);
				}

				if (loginState == 15 && ((AbstractSocket)var1).available() >= Canvas.field163) {
					var12 = ((AbstractSocket)var1).readUnsignedByte() == 1;
					((AbstractSocket)var1).read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var26 = false;
					if (var12) {
						var4 = var2.readByteIsaac() << 24;
						var4 |= var2.readByteIsaac() << 16;
						var4 |= var2.readByteIsaac() << 8;
						var4 |= var2.readByteIsaac();
						String var31 = Login.Login_username;
						var7 = var31.length();
						int var16 = 0;
						var9 = 0;

						while (true) {
							if (var9 >= var7) {
								if (SecureRandomFuture.clientPreferences.parameters.size() >= 10 && !SecureRandomFuture.clientPreferences.parameters.containsKey(var16)) {
									Iterator var33 = SecureRandomFuture.clientPreferences.parameters.entrySet().iterator();
									var33.next();
									var33.remove();
								}

								SecureRandomFuture.clientPreferences.parameters.put(var16, var4);
								break;
							}

							var16 = (var16 << 5) - var16 + var31.charAt(var9);
							++var9;
						}
					}

					if (Login_isUsernameRemembered) {
						SecureRandomFuture.clientPreferences.rememberedUsername = Login.Login_username;
					} else {
						SecureRandomFuture.clientPreferences.rememberedUsername = null;
					}

					class127.savePreferences();
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte();
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1;
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte();
					field594 = ((AbstractSocket)var1).readUnsignedByte();
					((AbstractSocket)var1).read(var2.array, 0, 1);
					var2.offset = 0;
					ServerPacket[] var28 = class129.ServerPacket_values();
					var14 = var2.readSmartByteShortIsaac();
					if (var14 < 0 || var14 >= var28.length) {
						throw new IOException(var14 + " " + var2.offset);
					}

					packetWriter.serverPacket = var28[var14];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					((AbstractSocket)var1).read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						Client var18 = class295.client;
						JSObject.getWindow(var18).call("zap", (Object[])null);
					} catch (Throwable var19) {
					}

					PacketBufferNode.method5016(16);
				}

				if (loginState != 16) {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, 2);
						var2.offset = 0;
						class126.field1497 = var2.readUnsignedShort();
						PacketBufferNode.method5016(18);
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= class126.field1497) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, class126.field1497);
						var2.offset = 0;
						String var29 = var2.readStringCp1252NullTerminated();
						String var37 = var2.readStringCp1252NullTerminated();
						String var30 = var2.readStringCp1252NullTerminated();
						class19.setLoginResponseString(var29, var37, var30);
						VertexNormal.updateGameState(10);
					}

					if (loginState == 19) {
						if (packetWriter.serverPacketLength == -1) {
							if (((AbstractSocket)var1).available() < 2) {
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2);
							var2.offset = 0;
							packetWriter.serverPacketLength = var2.readUnsignedShort();
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
							var2.offset = 0;
							var34 = packetWriter.serverPacketLength;
							timer.method6244();
							class116.method2662();
							HorizontalAlignment.updatePlayer(var2);
							if (var34 != var2.offset) {
								throw new RuntimeException();
							}
						}
					} else {
						++field545;
						if (field545 > 2000) {
							if (field541 < 1) {
								if (GameObject.worldPort == class129.currentPort) {
									class129.currentPort = class133.js5Port;
								} else {
									class129.currentPort = GameObject.worldPort;
								}

								++field541;
								PacketBufferNode.method5016(0);
							} else {
								class29.getLoginError(-3);
							}
						}
					}
				} else {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method6234();
						mouseLastLastPressedTimeMillis = -1L;
						mouseRecorder.index = 0;
						World.hasFocus = true;
						hadFocus = true;
						field676 = -1L;
						class33.reflectionChecks = new IterableNodeDeque();
						packetWriter.clearBuffer();
						packetWriter.packetBuffer.offset = 0;
						packetWriter.serverPacket = null;
						packetWriter.field1289 = null;
						packetWriter.field1290 = null;
						packetWriter.field1291 = null;
						packetWriter.serverPacketLength = 0;
						packetWriter.field1287 = 0;
						rebootTimer = 0;
						logoutTimer = 0;
						hintArrowType = 0;
						UrlRequest.method2489();
						class123.method2746(0);
						class123.method2745();
						isItemSelected = 0;
						isSpellSelected = false;
						soundEffectCount = 0;
						camAngleY = 0;
						oculusOrbState = 0;
						Messages.field1273 = null;
						minimapState = 0;
						field570 = -1;
						destinationX = 0;
						destinationY = 0;
						playerAttackOption = AttackOption.AttackOption_hidden;
						npcAttackOption = AttackOption.AttackOption_hidden;
						npcCount = 0;
						Players.Players_count = 0;

						for (var34 = 0; var34 < 2048; ++var34) {
							Players.field1248[var34] = null;
							Players.field1246[var34] = class185.field2123;
						}

						for (var34 = 0; var34 < 2048; ++var34) {
							players[var34] = null;
						}

						for (var34 = 0; var34 < 32768; ++var34) {
							npcs[var34] = null;
						}

						combatTargetPlayerIndex = -1;
						projectiles.clear();
						graphicsObjects.clear();

						for (var34 = 0; var34 < 4; ++var34) {
							for (var4 = 0; var4 < 104; ++var4) {
								for (int var17 = 0; var17 < 104; ++var17) {
									groundItems[var34][var4][var17] = null;
								}
							}
						}

						pendingSpawns = new NodeDeque();
						GameEngine.friendSystem.clear();

						for (var34 = 0; var34 < class433.VarpDefinition_fileCount; ++var34) {
							VarpDefinition var36 = SecureRandomCallable.VarpDefinition_get(var34);
							if (var36 != null) {
								Varps.Varps_temp[var34] = 0;
								Varps.Varps_main[var34] = 0;
							}
						}

						class339.varcs.clearTransient();
						followerIndex = -1;
						if (rootInterface != -1) {
							class273.method5333(rootInterface);
						}

						for (InterfaceParent var27 = (InterfaceParent)interfaceParents.first(); var27 != null; var27 = (InterfaceParent)interfaceParents.next()) {
							class10.closeInterface(var27, true);
						}

						rootInterface = -1;
						interfaceParents = new NodeHashTable(8);
						meslayerContinueWidget = null;
						UrlRequest.method2489();
						playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1);

						for (var34 = 0; var34 < 8; ++var34) {
							playerMenuActions[var34] = null;
							playerOptionsPriorities[var34] = false;
						}

						ItemContainer.itemContainers = new NodeHashTable(32);
						isLoading = true;

						for (var34 = 0; var34 < 100; ++var34) {
							field504[var34] = true;
						}

						var23 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2824, packetWriter.isaacCipher);
						var23.packetBuffer.writeByte(class143.getWindowedMode());
						var23.packetBuffer.writeShort(class186.canvasWidth);
						var23.packetBuffer.writeShort(BoundaryObject.canvasHeight);
						packetWriter.addNode(var23);
						Players.friendsChat = null;
						class222.guestClanSettings = null;
						Arrays.fill(currentClanSettings, (Object)null);
						UserComparator5.guestClanChannel = null;
						Arrays.fill(currentClanChannels, (Object)null);

						for (var34 = 0; var34 < 8; ++var34) {
							grandExchangeOffers[var34] = new GrandExchangeOffer();
						}

						grandExchangeEvents = null;
						HorizontalAlignment.updatePlayer(var2);
						Messages.field1277 = -1;
						DevicePcmPlayerProvider.loadRegions(false, var2);
						packetWriter.serverPacket = null;
					}

				}
			}
		} catch (IOException var22) {
			if (field541 < 1) {
				if (class129.currentPort == GameObject.worldPort) {
					class129.currentPort = class133.js5Port;
				} else {
					class129.currentPort = GameObject.worldPort;
				}

				++field541;
				PacketBufferNode.method5016(0);
			} else {
				class29.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1374404947"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) {
			--rebootTimer;
		}

		if (logoutTimer > 0) {
			--logoutTimer;
		}

		if (hadNetworkError) {
			hadNetworkError = false;
			Varcs.method2411();
		} else {
			if (!isMenuOpen) {
				WorldMapElement.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1394(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class33.reflectionChecks.last();
					boolean var30;
					if (var2 == null) {
						var30 = false;
					} else {
						var30 = true;
					}

					int var3;
					PacketBufferNode var31;
					if (!var30) {
						PacketBufferNode var14;
						int var15;
						if (timer.field4043) {
							var14 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2907, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(0);
							var15 = var14.packetBuffer.offset;
							timer.write(var14.packetBuffer);
							var14.packetBuffer.method7357(var14.packetBuffer.offset - var15);
							packetWriter.addNode(var14);
							timer.method6238();
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
						synchronized(mouseRecorder.lock) {
							if (!field713) {
								mouseRecorder.index = 0;
							} else if (MouseHandler.MouseHandler_lastButton != 0 || mouseRecorder.index >= 40) {
								var31 = null;
								var3 = 0;
								var4 = 0;
								var5 = 0;
								var6 = 0;

								for (var7 = 0; var7 < mouseRecorder.index && (var31 == null || var31.packetBuffer.offset - var3 < 246); ++var7) {
									var4 = var7;
									var8 = mouseRecorder.ys[var7];
									if (var8 < -1) {
										var8 = -1;
									} else if (var8 > 65534) {
										var8 = 65534;
									}

									var9 = mouseRecorder.xs[var7];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									if (var9 != field483 || var8 != field746) {
										if (var31 == null) {
											var31 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2889, packetWriter.isaacCipher);
											var31.packetBuffer.writeByte(0);
											var3 = var31.packetBuffer.offset;
											var10000 = var31.packetBuffer;
											var10000.offset += 2;
											var5 = 0;
											var6 = 0;
										}

										if (field485 != -1L) {
											var10 = var9 - field483;
											var11 = var8 - field746;
											var12 = (int)((mouseRecorder.millis[var7] - field485) / 20L);
											var5 = (int)((long)var5 + (mouseRecorder.millis[var7] - field485) % 20L);
										} else {
											var10 = var9;
											var11 = var8;
											var12 = Integer.MAX_VALUE;
										}

										field483 = var9;
										field746 = var8;
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
											var10 += 32;
											var11 += 32;
											var31.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
											var10 += 128;
											var11 += 128;
											var31.packetBuffer.writeByte(var12 + 128);
											var31.packetBuffer.writeShort(var11 + (var10 << 8));
										} else if (var12 < 32) {
											var31.packetBuffer.writeByte(var12 + 192);
											if (var9 != -1 && var8 != -1) {
												var31.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var31.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var31.packetBuffer.writeShort((var12 & 8191) + 57344);
											if (var9 != -1 && var8 != -1) {
												var31.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var31.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6;
										field485 = mouseRecorder.millis[var7];
									}
								}

								if (var31 != null) {
									var31.packetBuffer.method7357(var31.packetBuffer.offset - var3);
									var7 = var31.packetBuffer.offset;
									var31.packetBuffer.offset = var3;
									var31.packetBuffer.writeByte(var5 / var6);
									var31.packetBuffer.writeByte(var5 % var6);
									var31.packetBuffer.offset = var7;
									packetWriter.addNode(var31);
								}

								if (var4 >= mouseRecorder.index) {
									mouseRecorder.index = 0;
								} else {
									MouseRecorder var43 = mouseRecorder;
									var43.index -= var4;
									System.arraycopy(mouseRecorder.xs, var4, mouseRecorder.xs, 0, mouseRecorder.index);
									System.arraycopy(mouseRecorder.ys, var4, mouseRecorder.ys, 0, mouseRecorder.index);
									System.arraycopy(mouseRecorder.millis, var4, mouseRecorder.millis, 0, mouseRecorder.index);
								}
							}
						}

						PacketBufferNode var18;
						if (MouseHandler.MouseHandler_lastButton == 1 || !class150.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis;
							if (var16 > 32767L) {
								var16 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis;
							var3 = MouseHandler.MouseHandler_lastPressedY;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > BoundaryObject.canvasHeight) {
								var3 = BoundaryObject.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > class186.canvasWidth) {
								var4 = class186.canvasWidth;
							}

							var5 = (int)var16;
							var18 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2894, packetWriter.isaacCipher);
							var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
							var18.packetBuffer.writeShort(var4);
							var18.packetBuffer.writeShort(var3);
							packetWriter.addNode(var18);
						}

						if (KeyHandler.field140 > 0) {
							var14 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2899, packetWriter.isaacCipher);
							var14.packetBuffer.writeShort(0);
							var15 = var14.packetBuffer.offset;
							long var19 = Ignored.method6459();

							for (var5 = 0; var5 < KeyHandler.field140; ++var5) {
								long var21 = var19 - field676;
								if (var21 > 16777215L) {
									var21 = 16777215L;
								}

								field676 = var19;
								var14.packetBuffer.writeMedium((int)var21);
								var14.packetBuffer.method7362(KeyHandler.field139[var5]);
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15);
							packetWriter.addNode(var14);
						}

						if (field560 > 0) {
							--field560;
						}

						if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) {
							field561 = true;
						}

						if (field561 && field560 <= 0) {
							field560 = 20;
							field561 = false;
							var14 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2869, packetWriter.isaacCipher);
							var14.packetBuffer.method7493(camAngleX);
							var14.packetBuffer.method7398(camAngleY);
							packetWriter.addNode(var14);
						}

						if (World.hasFocus && !hadFocus) {
							hadFocus = true;
							var14 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2861, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(1);
							packetWriter.addNode(var14);
						}

						if (!World.hasFocus && hadFocus) {
							hadFocus = false;
							var14 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2861, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(0);
							packetWriter.addNode(var14);
						}

						if (Varcs.worldMap != null) {
							Varcs.worldMap.method6902();
						}

						class65.method1958();
						class117.method2682();
						class145.method2985();
						if (gameState != 30) {
							return;
						}

						AbstractArchive.method5693();

						int var10002;
						for (var1 = 0; var1 < soundEffectCount; ++var1) {
							var10002 = queuedSoundEffectDelays[var1]--;
							if (queuedSoundEffectDelays[var1] >= -10) {
								SoundEffect var32 = soundEffects[var1];
								if (var32 == null) {
									var10000 = null;
									var32 = SoundEffect.readSoundEffect(KeyHandler.archive4, soundEffectIds[var1], 0);
									if (var32 == null) {
										continue;
									}

									int[] var44 = queuedSoundEffectDelays;
									var44[var1] += var32.calculateDelay();
									soundEffects[var1] = var32;
								}

								if (queuedSoundEffectDelays[var1] < 0) {
									if (soundLocations[var1] != 0) {
										var4 = (soundLocations[var1] & 255) * 128;
										var5 = soundLocations[var1] >> 16 & 255;
										var6 = var5 * 128 + 64 - class340.localPlayer.x;
										if (var6 < 0) {
											var6 = -var6;
										}

										var7 = soundLocations[var1] >> 8 & 255;
										var8 = var7 * 128 + 64 - class340.localPlayer.y;
										if (var8 < 0) {
											var8 = -var8;
										}

										var9 = var8 + var6 - 128;
										if (var9 > var4) {
											queuedSoundEffectDelays[var1] = -100;
											continue;
										}

										if (var9 < 0) {
											var9 = 0;
										}

										var3 = (var4 - var9) * SecureRandomFuture.clientPreferences.areaSoundEffectsVolume / var4;
									} else {
										var3 = SecureRandomFuture.clientPreferences.soundEffectsVolume;
									}

									if (var3 > 0) {
										RawSound var23 = var32.toRawSound().resample(BoundaryObject.decimator);
										RawPcmStream var24 = RawPcmStream.createRawPcmStream(var23, 100, var3);
										var24.setNumLoops(queuedSoundEffectLoops[var1] - 1);
										class281.pcmStreamMixer.addSubStream(var24);
									}

									queuedSoundEffectDelays[var1] = -100;
								}
							} else {
								--soundEffectCount;

								for (var15 = var1; var15 < soundEffectCount; ++var15) {
									soundEffectIds[var15] = soundEffectIds[var15 + 1];
									soundEffects[var15] = soundEffects[var15 + 1];
									queuedSoundEffectLoops[var15] = queuedSoundEffectLoops[var15 + 1];
									queuedSoundEffectDelays[var15] = queuedSoundEffectDelays[var15 + 1];
									soundLocations[var15] = soundLocations[var15 + 1];
								}

								--var1;
							}
						}

						if (field743 && !Projectile.method2008()) {
							if (SecureRandomFuture.clientPreferences.musicVolume != 0 && currentTrackGroupId != -1) {
								NetSocket.method3118(WorldMapScaleHandler.archive6, currentTrackGroupId, 0, SecureRandomFuture.clientPreferences.musicVolume, false);
							}

							field743 = false;
						}

						++packetWriter.field1287;
						if (packetWriter.field1287 > 750) {
							Varcs.method2411();
							return;
						}

						class341.method6257();
						Canvas.method406();
						class91.method2337();
						++field538;
						if (mouseCrossColor != 0) {
							mouseCrossState += 20;
							if (mouseCrossState >= 400) {
								mouseCrossColor = 0;
							}
						}

						if (WorldMapDecoration.field2722 != null) {
							++field582;
							if (field582 >= 15) {
								SecureRandomCallable.invalidateWidget(WorldMapDecoration.field2722);
								WorldMapDecoration.field2722 = null;
							}
						}

						Widget var38 = class4.mousedOverWidgetIf1;
						Widget var33 = class281.field3375;
						class4.mousedOverWidgetIf1 = null;
						class281.field3375 = null;
						draggedOnWidget = null;
						field657 = false;
						field531 = false;
						field701 = 0;

						while (NPCComposition.isKeyDown() && field701 < 128) {
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && Players.field1247 == 66) {
								String var25 = method1668();
								class295.client.method492(var25);
							} else if (oculusOrbState != 1 || ModeWhere.field3954 <= 0) {
								field522[field701] = Players.field1247;
								field758[field701] = ModeWhere.field3954;
								++field701;
							}
						}

						boolean var34 = staffModLevel >= 2;
						if (var34 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) {
							var4 = class340.localPlayer.plane - mouseWheelRotation;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > 3) {
								var4 = 3;
							}

							if (var4 != class340.localPlayer.plane) {
								BuddyRankComparator.method2547(class340.localPlayer.pathX[0] + class131.baseX, class340.localPlayer.pathY[0] + TileItem.baseY, var4, false);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							class13.updateRootInterface(rootInterface, 0, 0, class186.canvasWidth, BoundaryObject.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var39;
							ScriptEvent var40;
							Widget var41;
							do {
								var40 = (ScriptEvent)field680.removeLast();
								if (var40 == null) {
									while (true) {
										do {
											var40 = (ScriptEvent)field579.removeLast();
											if (var40 == null) {
												while (true) {
													do {
														var40 = (ScriptEvent)scriptEvents.removeLast();
														if (var40 == null) {
															this.menu();
															WorldMapLabelSize.method4358();
															if (clickedWidget != null) {
																this.method1174();
															}

															if (class143.dragInventoryWidget != null) {
																SecureRandomCallable.invalidateWidget(class143.dragInventoryWidget);
																++itemDragDuration;
																if (MouseHandler.MouseHandler_currentButton == 0) {
																	if (field572) {
																		if (class143.dragInventoryWidget == FloorOverlayDefinition.hoveredItemContainer && dragItemSlotDestination != dragItemSlotSource) {
																			Widget var42 = class143.dragInventoryWidget;
																			byte var35 = 0;
																			if (field641 == 1 && var42.contentType == 206) {
																				var35 = 1;
																			}

																			if (var42.itemIds[dragItemSlotDestination] <= 0) {
																				var35 = 0;
																			}

																			if (MouseHandler.method649(class363.getWidgetFlags(var42))) {
																				var6 = dragItemSlotSource;
																				var7 = dragItemSlotDestination;
																				var42.itemIds[var7] = var42.itemIds[var6];
																				var42.itemQuantities[var7] = var42.itemQuantities[var6];
																				var42.itemIds[var6] = -1;
																				var42.itemQuantities[var6] = 0;
																			} else if (var35 == 1) {
																				var6 = dragItemSlotSource;
																				var7 = dragItemSlotDestination;

																				while (var6 != var7) {
																					if (var6 > var7) {
																						var42.swapItems(var6 - 1, var6);
																						--var6;
																					} else if (var6 < var7) {
																						var42.swapItems(var6 + 1, var6);
																						++var6;
																					}
																				}
																			} else {
																				var42.swapItems(dragItemSlotDestination, dragItemSlotSource);
																			}

																			var18 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2811, packetWriter.isaacCipher);
																			var18.packetBuffer.method7398(dragItemSlotDestination);
																			var18.packetBuffer.method7362(var35);
																			var18.packetBuffer.method7407(class143.dragInventoryWidget.id);
																			var18.packetBuffer.method7493(dragItemSlotSource);
																			packetWriter.addNode(var18);
																		}
																	} else if (this.shouldLeftClickOpenMenu()) {
																		this.openMenu(draggedWidgetX, draggedWidgetY);
																	} else if (menuOptionsCount > 0) {
																		var4 = draggedWidgetX;
																		var5 = draggedWidgetY;
																		WorldMapIcon_1.method4385(class87.tempMenuAction, var4, var5);
																		class87.tempMenuAction = null;
																	}

																	field582 = 10;
																	MouseHandler.MouseHandler_lastButton = 0;
																	class143.dragInventoryWidget = null;
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) {
																	field572 = true;
																}
															}

															if (Scene.shouldSendWalk()) {
																var4 = Scene.Scene_selectedX;
																var5 = Scene.Scene_selectedY;
																var18 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2859, packetWriter.isaacCipher);
																var18.packetBuffer.writeByte(5);
																var18.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
																var18.packetBuffer.method7493(var5 + TileItem.baseY);
																var18.packetBuffer.method7349(var4 + class131.baseX);
																packetWriter.addNode(var18);
																Scene.method3990();
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																mouseCrossColor = 1;
																mouseCrossState = 0;
																destinationX = var4;
																destinationY = var5;
															}

															if (var38 != class4.mousedOverWidgetIf1) {
																if (var38 != null) {
																	SecureRandomCallable.invalidateWidget(var38);
																}

																if (class4.mousedOverWidgetIf1 != null) {
																	SecureRandomCallable.invalidateWidget(class4.mousedOverWidgetIf1);
																}
															}

															if (var33 != class281.field3375 && field628 == field714) {
																if (var33 != null) {
																	SecureRandomCallable.invalidateWidget(var33);
																}

																if (class281.field3375 != null) {
																	SecureRandomCallable.invalidateWidget(class281.field3375);
																}
															}

															if (class281.field3375 != null) {
																if (field714 < field628) {
																	++field714;
																	if (field714 == field628) {
																		SecureRandomCallable.invalidateWidget(class281.field3375);
																	}
																}
															} else if (field714 > 0) {
																--field714;
															}

															if (oculusOrbState == 0) {
																var4 = class340.localPlayer.x;
																var5 = class340.localPlayer.y;
																if (class7.oculusOrbFocalPointX - var4 < -500 || class7.oculusOrbFocalPointX - var4 > 500 || Actor.oculusOrbFocalPointY - var5 < -500 || Actor.oculusOrbFocalPointY - var5 > 500) {
																	class7.oculusOrbFocalPointX = var4;
																	Actor.oculusOrbFocalPointY = var5;
																}

																if (var4 != class7.oculusOrbFocalPointX) {
																	class7.oculusOrbFocalPointX += (var4 - class7.oculusOrbFocalPointX) / 16;
																}

																if (var5 != Actor.oculusOrbFocalPointY) {
																	Actor.oculusOrbFocalPointY += (var5 - Actor.oculusOrbFocalPointY) / 16;
																}

																var6 = class7.oculusOrbFocalPointX >> 7;
																var7 = Actor.oculusOrbFocalPointY >> 7;
																var8 = FaceNormal.getTileHeight(class7.oculusOrbFocalPointX, Actor.oculusOrbFocalPointY, class20.Client_plane);
																var9 = 0;
																if (var6 > 3 && var7 > 3 && var6 < 100 && var7 < 100) {
																	for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
																		for (var11 = var7 - 4; var11 <= var7 + 4; ++var11) {
																			var12 = class20.Client_plane;
																			if (var12 < 3 && (Tiles.Tiles_renderFlags[1][var10][var11] & 2) == 2) {
																				++var12;
																			}

																			int var26 = var8 - Tiles.Tiles_heights[var12][var10][var11];
																			if (var26 > var9) {
																				var9 = var26;
																			}
																		}
																	}
																}

																var10 = var9 * 192;
																if (var10 > 98048) {
																	var10 = 98048;
																}

																if (var10 < 32768) {
																	var10 = 32768;
																}

																if (var10 > field562) {
																	field562 += (var10 - field562) / 24;
																} else if (var10 < field562) {
																	field562 += (var10 - field562) / 80;
																}

																MouseHandler.field231 = FaceNormal.getTileHeight(class340.localPlayer.x, class340.localPlayer.y, class20.Client_plane) - camFollowHeight;
															} else if (oculusOrbState == 1) {
																if (field612 && class340.localPlayer != null) {
																	var4 = class340.localPlayer.pathX[0];
																	var5 = class340.localPlayer.pathY[0];
																	if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
																		class7.oculusOrbFocalPointX = class340.localPlayer.x;
																		var6 = FaceNormal.getTileHeight(class340.localPlayer.x, class340.localPlayer.y, class20.Client_plane) - camFollowHeight;
																		if (var6 < MouseHandler.field231) {
																			MouseHandler.field231 = var6;
																		}

																		Actor.oculusOrbFocalPointY = class340.localPlayer.y;
																		field612 = false;
																	}
																}

																short var36 = -1;
																if (KeyHandler.KeyHandler_pressedKeys[33]) {
																	var36 = 0;
																} else if (KeyHandler.KeyHandler_pressedKeys[49]) {
																	var36 = 1024;
																}

																if (KeyHandler.KeyHandler_pressedKeys[48]) {
																	if (var36 == 0) {
																		var36 = 1792;
																	} else if (var36 == 1024) {
																		var36 = 1280;
																	} else {
																		var36 = 1536;
																	}
																} else if (KeyHandler.KeyHandler_pressedKeys[50]) {
																	if (var36 == 0) {
																		var36 = 256;
																	} else if (var36 == 1024) {
																		var36 = 768;
																	} else {
																		var36 = 512;
																	}
																}

																byte var37 = 0;
																if (KeyHandler.KeyHandler_pressedKeys[35]) {
																	var37 = -1;
																} else if (KeyHandler.KeyHandler_pressedKeys[51]) {
																	var37 = 1;
																}

																var6 = 0;
																if (var36 >= 0 || var37 != 0) {
																	var6 = KeyHandler.KeyHandler_pressedKeys[81] ? oculusOrbSlowedSpeed * 1403293651 * 97493083 : oculusOrbNormalSpeed * -535945653 * -682804381;
																	var6 *= 16;
																	field584 = var36;
																	field555 = var37;
																}

																if (field542 < var6) {
																	field542 += var6 / 8;
																	if (field542 > var6) {
																		field542 = var6;
																	}
																} else if (field542 > var6) {
																	field542 = field542 * 9 / 10;
																}

																if (field542 > 0) {
																	var7 = field542 / 16;
																	if (field584 >= 0) {
																		var4 = field584 - class379.cameraYaw & 2047;
																		var8 = Rasterizer3D.Rasterizer3D_sine[var4];
																		var9 = Rasterizer3D.Rasterizer3D_cosine[var4];
																		class7.oculusOrbFocalPointX += var8 * var7 / 65536;
																		Actor.oculusOrbFocalPointY += var7 * var9 / 65536;
																	}

																	if (field555 != 0) {
																		MouseHandler.field231 += var7 * field555;
																		if (MouseHandler.field231 > 0) {
																			MouseHandler.field231 = 0;
																		}
																	}
																} else {
																	field584 = -1;
																	field555 = -1;
																}

																if (KeyHandler.KeyHandler_pressedKeys[13]) {
																	packetWriter.addNode(HitSplatDefinition.getPacketBufferNode(ClientPacket.field2867, packetWriter.isaacCipher));
																	oculusOrbState = 0;
																}
															}

															if (MouseHandler.MouseHandler_currentButton == 4 && class150.mouseCam) {
																var4 = MouseHandler.MouseHandler_y - mouseCamClickedY;
																camAngleDX = var4 * 2;
																mouseCamClickedY = var4 != -1 && var4 != 1 ? (MouseHandler.MouseHandler_y + mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y * 84217699 * -688068021;
																var5 = mouseCamClickedX - MouseHandler.MouseHandler_x;
																camAngleDY = var5 * 2;
																mouseCamClickedX = var5 != -1 && var5 != 1 ? (mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x * 635129293 * -971872507;
															} else {
																if (KeyHandler.KeyHandler_pressedKeys[96]) {
																	camAngleDY += (-24 - camAngleDY) / 2;
																} else if (KeyHandler.KeyHandler_pressedKeys[97]) {
																	camAngleDY += (24 - camAngleDY) / 2;
																} else {
																	camAngleDY /= 2;
																}

																if (KeyHandler.KeyHandler_pressedKeys[98]) {
																	camAngleDX += (12 - camAngleDX) / 2;
																} else if (KeyHandler.KeyHandler_pressedKeys[99]) {
																	camAngleDX += (-12 - camAngleDX) / 2;
																} else {
																	camAngleDX /= 2;
																}

																mouseCamClickedY = MouseHandler.MouseHandler_y;
																mouseCamClickedX = MouseHandler.MouseHandler_x;
															}

															camAngleY = camAngleDY / 2 + camAngleY & 2047;
															camAngleX += camAngleDX / 2;
															if (camAngleX < 128) {
																camAngleX = 128;
															}

															if (camAngleX > 383) {
																camAngleX = 383;
															}

															if (field724) {
																GrandExchangeOfferOwnWorldComparator.method1148();
															} else if (isCameraLocked) {
																var4 = class167.field1811 * 128 + 64;
																var5 = VarpDefinition.field1748 * 128 + 64;
																var6 = FaceNormal.getTileHeight(var4, var5, class20.Client_plane) - UserComparator9.field1335;
																class1.method12(var4, var6, var5);
																var4 = PlayerComposition.field3193 * 128 + 64;
																var5 = MusicPatchNode.field3150 * 128 + 64;
																var6 = FaceNormal.getTileHeight(var4, var5, class20.Client_plane) - ModeWhere.field3951;
																var7 = var4 - UserComparator7.cameraX;
																var8 = var6 - AbstractByteArrayCopier.cameraY;
																var9 = var5 - UserComparator10.cameraZ;
																var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9));
																var11 = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047;
																var12 = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047;
																SecureRandomFuture.method2025(var11, var12);
															}

															for (var4 = 0; var4 < 5; ++var4) {
																var10002 = field729[var4]++;
															}

															class339.varcs.tryWrite();
															var4 = ++MouseHandler.MouseHandler_idleCycles - 1;
															var6 = KeyHandler.KeyHandler_idleCycles;
															PacketBufferNode var27;
															if (var4 > 15000 && var6 > 15000) {
																logoutTimer = 250;
																class123.method2746(14500);
																var27 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2837, packetWriter.isaacCipher);
																packetWriter.addNode(var27);
															}

															GameEngine.friendSystem.processFriendUpdates();
															++packetWriter.pendingWrites;
															if (packetWriter.pendingWrites > 50) {
																var27 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2814, packetWriter.isaacCipher);
																packetWriter.addNode(var27);
															}

															try {
																packetWriter.flush();
															} catch (IOException var28) {
																Varcs.method2411();
															}

															return;
														}

														var41 = var40.widget;
														if (var41.childIndex < 0) {
															break;
														}

														var39 = ChatChannel.getWidget(var41.parentId);
													} while(var39 == null || var39.children == null || var41.childIndex >= var39.children.length || var41 != var39.children[var41.childIndex]);

													class285.runScriptEvent(var40);
												}
											}

											var41 = var40.widget;
											if (var41.childIndex < 0) {
												break;
											}

											var39 = ChatChannel.getWidget(var41.parentId);
										} while(var39 == null || var39.children == null || var41.childIndex >= var39.children.length || var41 != var39.children[var41.childIndex]);

										class285.runScriptEvent(var40);
									}
								}

								var41 = var40.widget;
								if (var41.childIndex < 0) {
									break;
								}

								var39 = ChatChannel.getWidget(var41.parentId);
							} while(var39 == null || var39.children == null || var41.childIndex >= var39.children.length || var41 != var39.children[var41.childIndex]);

							class285.runScriptEvent(var40);
						}
					}

					var31 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2852, packetWriter.isaacCipher);
					var31.packetBuffer.writeByte(0);
					var3 = var31.packetBuffer.offset;
					UserComparator3.performReflectionCheck(var31.packetBuffer);
					var31.packetBuffer.method7357(var31.packetBuffer.offset - var3);
					packetWriter.addNode(var31);
				}
			}
		}
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-5"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = class186.canvasWidth;
		int var2 = BoundaryObject.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (SecureRandomFuture.clientPreferences != null) {
			try {
				Client var3 = class295.client;
				Object[] var4 = new Object[]{class143.getWindowedMode()};
				JSObject.getWindow(var3).call("resize", var4);
			} catch (Throwable var5) {
			}
		}

	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2013418749"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) {
			GraphicsObject.method1955(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (field504[var1]) {
				field686[var1] = true;
			}

			field687[var1] = field504[var1];
			field504[var1] = false;
		}

		field684 = cycle;
		viewportX = -1;
		viewportY = -1;
		FloorOverlayDefinition.hoveredItemContainer = null;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			class12.drawWidgets(rootInterface, 0, 0, class186.canvasWidth, BoundaryObject.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				UserComparator5.crossSprites[mouseCrossState / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				UserComparator5.crossSprites[mouseCrossState / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		if (!isMenuOpen) {
			if (viewportX != -1) {
				Friend.method6288(viewportX, viewportY);
			}
		} else {
			class4.method25();
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field687[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field686[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		var1 = class20.Client_plane;
		int var2 = class340.localPlayer.x;
		int var3 = class340.localPlayer.y;
		int var4 = field538;

		for (ObjectSound var5 = (ObjectSound)ObjectSound.objectSounds.last(); var5 != null; var5 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var5.soundEffectId != -1 || var5.soundEffectIds != null) {
				int var6 = 0;
				if (var2 > var5.maxX) {
					var6 += var2 - var5.maxX;
				} else if (var2 < var5.x) {
					var6 += var5.x - var2;
				}

				if (var3 > var5.maxY) {
					var6 += var3 - var5.maxY;
				} else if (var3 < var5.y) {
					var6 += var5.y - var3;
				}

				if (var6 - 64 <= var5.field793 && SecureRandomFuture.clientPreferences.areaSoundEffectsVolume != 0 && var1 == var5.plane) {
					var6 -= 64;
					if (var6 < 0) {
						var6 = 0;
					}

					int var7 = (var5.field793 - var6) * SecureRandomFuture.clientPreferences.areaSoundEffectsVolume / var5.field793;
					Object var10000;
					if (var5.stream1 == null) {
						if (var5.soundEffectId >= 0) {
							var10000 = null;
							SoundEffect var8 = SoundEffect.readSoundEffect(KeyHandler.archive4, var5.soundEffectId, 0);
							if (var8 != null) {
								RawSound var9 = var8.toRawSound().resample(BoundaryObject.decimator);
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var7);
								var10.setNumLoops(-1);
								class281.pcmStreamMixer.addSubStream(var10);
								var5.stream1 = var10;
							}
						}
					} else {
						var5.stream1.method843(var7);
					}

					if (var5.stream2 == null) {
						if (var5.soundEffectIds != null && (var5.field789 -= var4) <= 0) {
							int var12 = (int)(Math.random() * (double)var5.soundEffectIds.length);
							var10000 = null;
							SoundEffect var13 = SoundEffect.readSoundEffect(KeyHandler.archive4, var5.soundEffectIds[var12], 0);
							if (var13 != null) {
								RawSound var14 = var13.toRawSound().resample(BoundaryObject.decimator);
								RawPcmStream var11 = RawPcmStream.createRawPcmStream(var14, 100, var7);
								var11.setNumLoops(0);
								class281.pcmStreamMixer.addSubStream(var11);
								var5.stream2 = var11;
								var5.field789 = var5.field796 + (int)(Math.random() * (double)(var5.field797 - var5.field796));
							}
						}
					} else {
						var5.stream2.method843(var7);
						if (!var5.stream2.hasNext()) {
							var5.stream2 = null;
						}
					}
				} else {
					if (var5.stream1 != null) {
						class281.pcmStreamMixer.removeSubStream(var5.stream1);
						var5.stream1 = null;
					}

					if (var5.stream2 != null) {
						class281.pcmStreamMixer.removeSubStream(var5.stream2);
						var5.stream2 = null;
					}
				}
			}
		}

		field538 = 0;
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(Lch;I)Z",
		garbageValue = "-1371711107"
	)
	final boolean method1394(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			int var6;
			String var19;
			try {
				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1278) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1287 = 0;
						var1.field1278 = false;
					}

					var3.offset = 0;
					if (var3.method7311()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1287 = 0;
					}

					var1.field1278 = true;
					ServerPacket[] var4 = class129.ServerPacket_values();
					var5 = var3.readSmartByteShortIsaac();
					if (var5 < 0 || var5 >= var4.length) {
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5];
					var1.serverPacketLength = var1.serverPacket.length;
				}

				if (var1.serverPacketLength == -1) {
					if (!var2.isAvailable(1)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1);
					var1.serverPacketLength = var3.array[0] & 255;
				}

				if (var1.serverPacketLength == -2) {
					if (!var2.isAvailable(2)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2);
					var3.offset = 0;
					var1.serverPacketLength = var3.readUnsignedShort();
				}

				if (!var2.isAvailable(var1.serverPacketLength)) {
					return false;
				}

				var3.offset = 0;
				var2.read(var3.array, 0, var1.serverPacketLength);
				var1.field1287 = 0;
				timer.method6253();
				var1.field1291 = var1.field1290;
				var1.field1290 = var1.field1289;
				var1.field1289 = var1.serverPacket;
				int var7;
				int var17;
				Widget var52;
				if (ServerPacket.field2978 == var1.serverPacket) {
					var17 = var3.method7403();
					var5 = var3.method7411();
					var6 = var3.readUnsignedShort();
					var7 = var3.method7403();
					var52 = ChatChannel.getWidget(var5);
					if (var17 != var52.modelAngleX || var6 != var52.modelAngleY || var7 != var52.modelZoom) {
						var52.modelAngleX = var17;
						var52.modelAngleY = var6;
						var52.modelZoom = var7;
						SecureRandomCallable.invalidateWidget(var52);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3011 == var1.serverPacket) {
					var17 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					LoginScreenAnimation.queueSoundEffect(var17, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				Widget var18;
				if (ServerPacket.field2952 == var1.serverPacket) {
					var17 = var3.method7411();
					var5 = var3.readShort();
					var18 = ChatChannel.getWidget(var17);
					if (var5 != var18.sequenceId || var5 == -1) {
						var18.sequenceId = var5;
						var18.modelFrame = 0;
						var18.modelFrameCycle = 0;
						SecureRandomCallable.invalidateWidget(var18);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2972 == var1.serverPacket) {
					DirectByteArrayCopier.method5328(class253.field2915);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3002 == var1.serverPacket) {
					if (BuddyRankComparator.field1342 == null) {
						BuddyRankComparator.field1342 = new class370(Ignored.HitSplatDefinition_cached);
					}

					class426 var49 = Ignored.HitSplatDefinition_cached.method6761(var3);
					BuddyRankComparator.field1342.field4221.vmethod7129(var49.field4539, var49.field4537);
					field695[++field734 - 1 & 31] = var49.field4539;
					var1.serverPacket = null;
					return true;
				}

				int var15;
				String var24;
				byte var68;
				if (ServerPacket.field3005 == var1.serverPacket) {
					var68 = var3.readByte();
					var19 = var3.readStringCp1252NullTerminated();
					long var20 = (long)var3.readUnsignedShort();
					long var22 = (long)var3.readMedium();
					PlayerType var55 = (PlayerType)class130.findEnumerated(SpotAnimationDefinition.PlayerType_values(), var3.readUnsignedByte());
					long var11 = (var20 << 32) + var22;
					boolean var56 = false;
					ClanChannel var14 = null;
					var14 = var68 >= 0 ? currentClanChannels[var68] : UserComparator5.guestClanChannel;
					if (var14 == null) {
						var56 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var55.isUser && GameEngine.friendSystem.isIgnored(new Username(var19, class194.loginType))) {
									var56 = true;
								}
								break;
							}

							if (crossWorldMessageIds[var15] == var11) {
								var56 = true;
								break;
							}

							++var15;
						}
					}

					if (!var56) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var11;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var24 = AbstractFont.escapeBrackets(SequenceDefinition.method3689(var3));
						int var16 = var68 >= 0 ? 41 : 44;
						if (var55.modIcon != -1) {
							DevicePcmPlayerProvider.addChatMessage(var16, class221.method4705(var55.modIcon) + var19, var24, var14.name);
						} else {
							DevicePcmPlayerProvider.addChatMessage(var16, var19, var24, var14.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				String var45;
				if (ServerPacket.field3001 == var1.serverPacket) {
					var45 = var3.readStringCp1252NullTerminated();
					Object[] var67 = new Object[var45.length() + 1];

					for (var6 = var45.length() - 1; var6 >= 0; --var6) {
						if (var45.charAt(var6) == 's') {
							var67[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var67[var6 + 1] = new Integer(var3.readInt());
						}
					}

					var67[0] = new Integer(var3.readInt());
					ScriptEvent var72 = new ScriptEvent();
					var72.args = var67;
					class285.runScriptEvent(var72);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2980 == var1.serverPacket) {
					UserComparator6.method2551();
					weight = var3.readShort();
					field471 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3023 == var1.serverPacket) {
					destinationX = var3.readUnsignedByte();
					if (destinationX == 255) {
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte();
					if (destinationY == 255) {
						destinationY = 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2930 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.readInt();
					var6 = class143.getGcDuration();
					PacketBufferNode var73 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2890, packetWriter.isaacCipher);
					var73.packetBuffer.writeByte(GameEngine.fps);
					var73.packetBuffer.method7343(var6);
					var73.packetBuffer.method7407(var17);
					var73.packetBuffer.writeIntME(var5);
					packetWriter.addNode(var73);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2955 == var1.serverPacket) {
					if (Players.friendsChat != null) {
						Players.friendsChat.method6305(var3);
					}

					class334.method6216();
					var1.serverPacket = null;
					return true;
				}

				Widget var25;
				if (ServerPacket.field2960 == var1.serverPacket) {
					var17 = var3.readShort();
					var5 = var3.readInt();
					var6 = var3.method7405();
					var25 = ChatChannel.getWidget(var5);
					if (var17 != var25.rawX || var6 != var25.rawY || var25.xAlignment != 0 || var25.yAlignment != 0) {
						var25.rawX = var17;
						var25.rawY = var6;
						var25.xAlignment = 0;
						var25.yAlignment = 0;
						SecureRandomCallable.invalidateWidget(var25);
						this.alignWidget(var25);
						if (var25.type == 0) {
							class115.revalidateWidgetScroll(MouseRecorder.Widget_interfaceComponents[var5 >> 16], var25, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2996 == var1.serverPacket) {
					DirectByteArrayCopier.method5328(class253.field2918);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2998 == var1.serverPacket) {
					BuddyRankComparator.field1342 = null;
					var1.serverPacket = null;
					return true;
				}

				int var9;
				long var12;
				int var26;
				int var27;
				InterfaceParent var71;
				if (ServerPacket.field3021 == var1.serverPacket) {
					var17 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.resizeRoot(false);
						class140.Widget_resetModelFrames(rootInterface);
						class33.runWidgetOnLoadListener(rootInterface);

						for (var7 = 0; var7 < 100; ++var7) {
							field504[var7] = true;
						}
					}

					InterfaceParent var54;
					for (; var6-- > 0; var54.field1014 = true) {
						var7 = var3.readInt();
						var26 = var3.readUnsignedShort();
						var9 = var3.readUnsignedByte();
						var54 = (InterfaceParent)interfaceParents.get((long)var7);
						if (var54 != null && var26 != var54.group) {
							class10.closeInterface(var54, true);
							var54 = null;
						}

						if (var54 == null) {
							var54 = ChatChannel.method2058(var7, var26, var9);
						}
					}

					for (var71 = (InterfaceParent)interfaceParents.first(); var71 != null; var71 = (InterfaceParent)interfaceParents.next()) {
						if (var71.field1014) {
							var71.field1014 = false;
						} else {
							class10.closeInterface(var71, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var17) {
						var7 = var3.readInt();
						var26 = var3.readUnsignedShort();
						var9 = var3.readUnsignedShort();
						var27 = var3.readInt();

						for (int var74 = var26; var74 <= var9; ++var74) {
							var12 = (long)var74 + ((long)var7 << 32);
							widgetFlags.put(new IntegerNode(var27), var12);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3018 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var17 < -70000) {
						var5 += 32768;
					}

					if (var17 >= 0) {
						var18 = ChatChannel.getWidget(var17);
					} else {
						var18 = null;
					}

					if (var18 != null) {
						for (var7 = 0; var7 < var18.itemIds.length; ++var7) {
							var18.itemIds[var7] = 0;
							var18.itemQuantities[var7] = 0;
						}
					}

					class141.clearItemContainer(var5);
					var7 = var3.readUnsignedShort();

					for (var26 = 0; var26 < var7; ++var26) {
						var9 = var3.method7392();
						if (var9 == 255) {
							var9 = var3.readInt();
						}

						var27 = var3.method7401();
						if (var18 != null && var26 < var18.itemIds.length) {
							var18.itemIds[var26] = var27;
							var18.itemQuantities[var26] = var9;
						}

						GraphicsObject.itemContainerSetItem(var5, var26, var27 - 1, var9);
					}

					if (var18 != null) {
						SecureRandomCallable.invalidateWidget(var18);
					}

					UserComparator6.method2551();
					changedItemContainers[++field665 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2944 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					VarpDefinition.method3168(var17);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3027 == var1.serverPacket && isCameraLocked) {
					field724 = true;
					Renderable.field2358 = var3.readUnsignedByte();
					ItemComposition.field2012 = var3.readUnsignedByte();
					WorldMapSection1.field2755 = var3.readUnsignedByte();
					ChatChannel.field956 = var3.readUnsignedByte();

					for (var17 = 0; var17 < 5; ++var17) {
						field725[var17] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2949 == var1.serverPacket) {
					World var48 = new World();
					var48.host = var3.readStringCp1252NullTerminated();
					var48.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var48.properties = var5;
					VertexNormal.updateGameState(45);
					var2.close();
					var2 = null;
					BoundaryObject.changeWorld(var48);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2984 == var1.serverPacket) {
					DevicePcmPlayerProvider.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2940 == var1.serverPacket) {
					field583 = cycleCntr;
					var68 = var3.readByte();
					class143 var65 = new class143(var3);
					ClanChannel var70;
					if (var68 >= 0) {
						var70 = currentClanChannels[var68];
					} else {
						var70 = UserComparator5.guestClanChannel;
					}

					var65.method2960(var70);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2938 == var1.serverPacket) {
					var17 = var3.readUnsignedShort();
					rootInterface = var17;
					this.resizeRoot(false);
					class140.Widget_resetModelFrames(var17);
					class33.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						field504[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3029 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.readInt();
					InterfaceParent var69 = (InterfaceParent)interfaceParents.get((long)var17);
					var71 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var71 != null) {
						class10.closeInterface(var71, var69 == null || var71.group != var69.group);
					}

					if (var69 != null) {
						var69.remove();
						interfaceParents.put(var69, (long)var5);
					}

					var52 = ChatChannel.getWidget(var17);
					if (var52 != null) {
						SecureRandomCallable.invalidateWidget(var52);
					}

					var52 = ChatChannel.getWidget(var5);
					if (var52 != null) {
						SecureRandomCallable.invalidateWidget(var52);
						class115.revalidateWidgetScroll(MouseRecorder.Widget_interfaceComponents[var52.id >>> 16], var52, true);
					}

					if (rootInterface != -1) {
						Message.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2937 == var1.serverPacket) {
					DirectByteArrayCopier.method5328(class253.field2919);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2934 == var1.serverPacket) {
					if (var1.serverPacketLength == 0) {
						Players.friendsChat = null;
					} else {
						if (Players.friendsChat == null) {
							Players.friendsChat = new FriendsChat(class194.loginType, class295.client);
						}

						Players.friendsChat.readUpdate(var3);
					}

					class334.method6216();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2989 == var1.serverPacket) {
					UserComparator6.method2551();
					runEnergy = var3.readUnsignedByte();
					field471 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2961 == var1.serverPacket) {
					for (var17 = 0; var17 < class433.VarpDefinition_fileCount; ++var17) {
						VarpDefinition var64 = SecureRandomCallable.VarpDefinition_get(var17);
						if (var64 != null) {
							Varps.Varps_temp[var17] = 0;
							Varps.Varps_main[var17] = 0;
						}
					}

					UserComparator6.method2551();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2982 == var1.serverPacket) {
					DirectByteArrayCopier.method5328(class253.field2913);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3016 == var1.serverPacket) {
					class167.field1813 = var3.method7520();
					class17.field90 = var3.readUnsignedByte();

					while (var3.offset < var1.serverPacketLength) {
						var17 = var3.readUnsignedByte();
						class253 var63 = Timer.method6230()[var17];
						DirectByteArrayCopier.method5328(var63);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2991 == var1.serverPacket) {
					DirectByteArrayCopier.method5328(class253.field2914);
					var1.serverPacket = null;
					return true;
				}

				long var29;
				long var31;
				long var33;
				if (ServerPacket.field2931 == var1.serverPacket) {
					var45 = var3.readStringCp1252NullTerminated();
					var29 = var3.readLong();
					var31 = (long)var3.readUnsignedShort();
					var33 = (long)var3.readMedium();
					PlayerType var75 = (PlayerType)class130.findEnumerated(SpotAnimationDefinition.PlayerType_values(), var3.readUnsignedByte());
					var12 = var33 + (var31 << 32);
					boolean var77 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (var12 == crossWorldMessageIds[var15]) {
							var77 = true;
							break;
						}
					}

					if (var75.isUser && GameEngine.friendSystem.isIgnored(new Username(var45, class194.loginType))) {
						var77 = true;
					}

					if (!var77 && field590 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var12;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var24 = AbstractFont.escapeBrackets(class412.method7287(SequenceDefinition.method3689(var3)));
						if (var75.modIcon != -1) {
							DevicePcmPlayerProvider.addChatMessage(9, class221.method4705(var75.modIcon) + var45, var24, GraphicsDefaults.base37DecodeLong(var29));
						} else {
							DevicePcmPlayerProvider.addChatMessage(9, var45, var24, GraphicsDefaults.base37DecodeLong(var29));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var66;
				if (ServerPacket.field3017 == var1.serverPacket) {
					var66 = var3.readUnsignedByte() == 1;
					var5 = var3.method7411();
					var18 = ChatChannel.getWidget(var5);
					if (var66 != var18.isHidden) {
						var18.isHidden = var66;
						SecureRandomCallable.invalidateWidget(var18);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2965 == var1.serverPacket) {
					isCameraLocked = false;

					for (var17 = 0; var17 < 5; ++var17) {
						field725[var17] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2986 == var1.serverPacket) {
					if (rootInterface != -1) {
						Message.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3000 == var1.serverPacket) {
					DirectByteArrayCopier.method5328(class253.field2912);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2948 == var1.serverPacket) {
					DirectByteArrayCopier.method5328(class253.field2916);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3004 == var1.serverPacket) {
					GrandExchangeOfferOwnWorldComparator.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2968 == var1.serverPacket) {
					GameEngine.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field671 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2957 == var1.serverPacket) {
					var17 = var3.method7401();
					var5 = var3.method7411();
					var18 = ChatChannel.getWidget(var5);
					if (var18 != null && var18.type == 0) {
						if (var17 > var18.scrollHeight - var18.height) {
							var17 = var18.scrollHeight - var18.height;
						}

						if (var17 < 0) {
							var17 = 0;
						}

						if (var17 != var18.scrollY) {
							var18.scrollY = var17;
							SecureRandomCallable.invalidateWidget(var18);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2994 == var1.serverPacket) {
					DirectByteArrayCopier.method5328(class253.field2920);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3026 == var1.serverPacket) {
					GameEngine.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					Skeleton.FriendSystem_invalidateIgnoreds();
					field671 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2970 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var17 < -70000) {
						var5 += 32768;
					}

					if (var17 >= 0) {
						var18 = ChatChannel.getWidget(var17);
					} else {
						var18 = null;
					}

					for (; var3.offset < var1.serverPacketLength; GraphicsObject.itemContainerSetItem(var5, var7, var26 - 1, var9)) {
						var7 = var3.readUShortSmart();
						var26 = var3.readUnsignedShort();
						var9 = 0;
						if (var26 != 0) {
							var9 = var3.readUnsignedByte();
							if (var9 == 255) {
								var9 = var3.readInt();
							}
						}

						if (var18 != null && var7 >= 0 && var7 < var18.itemIds.length) {
							var18.itemIds[var7] = var26;
							var18.itemQuantities[var7] = var9;
						}
					}

					if (var18 != null) {
						SecureRandomCallable.invalidateWidget(var18);
					}

					UserComparator6.method2551();
					changedItemContainers[++field665 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2942 == var1.serverPacket) {
					isCameraLocked = true;
					field724 = false;
					PlayerComposition.field3193 = var3.readUnsignedByte();
					MusicPatchNode.field3150 = var3.readUnsignedByte();
					ModeWhere.field3951 = var3.readUnsignedShort();
					WorldMapSection1.field2755 = var3.readUnsignedByte();
					ChatChannel.field956 = var3.readUnsignedByte();
					if (ChatChannel.field956 >= 100) {
						var17 = PlayerComposition.field3193 * 128 + 64;
						var5 = MusicPatchNode.field3150 * 128 + 64;
						var6 = FaceNormal.getTileHeight(var17, var5, class20.Client_plane) - ModeWhere.field3951;
						var7 = var17 - UserComparator7.cameraX;
						var26 = var6 - AbstractByteArrayCopier.cameraY;
						var9 = var5 - UserComparator10.cameraZ;
						var27 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9));
						UserComparator7.cameraPitch = (int)(Math.atan2((double)var26, (double)var27) * 325.9490051269531D) & 2047;
						class379.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047;
						if (UserComparator7.cameraPitch < 128) {
							UserComparator7.cameraPitch = 128;
						}

						if (UserComparator7.cameraPitch > 383) {
							UserComparator7.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3007 == var1.serverPacket) {
					isCameraLocked = true;
					field724 = false;
					class167.field1811 = var3.readUnsignedByte();
					VarpDefinition.field1748 = var3.readUnsignedByte();
					UserComparator9.field1335 = var3.readUnsignedShort();
					Renderable.field2358 = var3.readUnsignedByte();
					ItemComposition.field2012 = var3.readUnsignedByte();
					if (ItemComposition.field2012 >= 100) {
						UserComparator7.cameraX = class167.field1811 * 128 + 64;
						UserComparator10.cameraZ = VarpDefinition.field1748 * 128 + 64;
						AbstractByteArrayCopier.cameraY = FaceNormal.getTileHeight(UserComparator7.cameraX, UserComparator10.cameraZ, class20.Client_plane) - UserComparator9.field1335;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2983 == var1.serverPacket) {
					var17 = var3.method7401();
					var5 = var3.method7394();
					var6 = var3.readInt();
					var71 = (InterfaceParent)interfaceParents.get((long)var6);
					if (var71 != null) {
						class10.closeInterface(var71, var17 != var71.group);
					}

					ChatChannel.method2058(var6, var17, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3020 == var1.serverPacket) {
					class12.field72 = true;
					GrandExchangeOfferOwnWorldComparator.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2990 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var17] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var17] = new GrandExchangeOffer(var3, false);
					}

					field675 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2951 == var1.serverPacket) {
					Strings.method5509();
					var68 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var68 >= 0) {
							currentClanSettings[var68] = null;
						} else {
							class222.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var68 >= 0) {
						currentClanSettings[var68] = new ClanSettings(var3);
					} else {
						class222.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2993 == var1.serverPacket) {
					Strings.method5509();
					var68 = var3.readByte();
					class129 var61 = new class129(var3);
					ClanSettings var62;
					if (var68 >= 0) {
						var62 = currentClanSettings[var68];
					} else {
						var62 = class222.guestClanSettings;
					}

					var61.method2781(var62);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2939 == var1.serverPacket) {
					class167.field1813 = var3.readUnsignedByte();
					class17.field90 = var3.method7394();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2973 == var1.serverPacket) {
					DevicePcmPlayerProvider.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2932 == var1.serverPacket) {
					hintArrowType = var3.readUnsignedByte();
					if (hintArrowType == 1) {
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) {
						if (hintArrowType == 2) {
							hintArrowSubX = 64;
							hintArrowSubY = 64;
						}

						if (hintArrowType == 3) {
							hintArrowSubX = 0;
							hintArrowSubY = 64;
						}

						if (hintArrowType == 4) {
							hintArrowSubX = 128;
							hintArrowSubY = 64;
						}

						if (hintArrowType == 5) {
							hintArrowSubX = 64;
							hintArrowSubY = 0;
						}

						if (hintArrowType == 6) {
							hintArrowSubX = 64;
							hintArrowSubY = 128;
						}

						hintArrowType = 2;
						hintArrowX = var3.readUnsignedShort();
						hintArrowY = var3.readUnsignedShort();
						hintArrowHeight = var3.readUnsignedByte();
					}

					if (hintArrowType == 10) {
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2935 == var1.serverPacket) {
					var17 = var3.method7412();
					var5 = var3.method7411();
					var6 = var3.method7401();
					if (var6 == 65535) {
						var6 = -1;
					}

					var25 = ChatChannel.getWidget(var5);
					ItemComposition var51;
					if (!var25.isIf3) {
						if (var6 == -1) {
							var25.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var51 = UserComparator6.ItemDefinition_get(var6);
						var25.modelType = 4;
						var25.modelId = var6;
						var25.modelAngleX = var51.xan2d;
						var25.modelAngleY = var51.yan2d;
						var25.modelZoom = var51.zoom2d * 100 / var17;
						SecureRandomCallable.invalidateWidget(var25);
					} else {
						var25.itemId = var6;
						var25.itemQuantity = var17;
						var51 = UserComparator6.ItemDefinition_get(var6);
						var25.modelAngleX = var51.xan2d;
						var25.modelAngleY = var51.yan2d;
						var25.modelAngleZ = var51.zan2d;
						var25.modelOffsetX = var51.offsetX2d;
						var25.modelOffsetY = var51.offsetY2d;
						var25.modelZoom = var51.zoom2d;
						if (var51.isStackable == 1) {
							var25.itemQuantityMode = 1;
						} else {
							var25.itemQuantityMode = 2;
						}

						if (var25.field3280 > 0) {
							var25.modelZoom = var25.modelZoom * 32 / var25.field3280;
						} else if (var25.rawWidth > 0) {
							var25.modelZoom = var25.modelZoom * 32 / var25.rawWidth;
						}

						SecureRandomCallable.invalidateWidget(var25);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2988 == var1.serverPacket) {
					var17 = var3.method7412();
					var5 = var3.method7401();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.method7401();
					if (var6 == 65535) {
						var6 = -1;
					}

					var7 = var3.readInt();

					for (var26 = var5; var26 <= var6; ++var26) {
						var33 = ((long)var7 << 32) + (long)var26;
						Node var35 = widgetFlags.get(var33);
						if (var35 != null) {
							var35.remove();
						}

						widgetFlags.put(new IntegerNode(var17), var33);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2967 == var1.serverPacket) {
					class12.field72 = true;
					GrandExchangeOfferOwnWorldComparator.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2943 == var1.serverPacket) {
					GameEngine.friendSystem.method1764();
					field671 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2981 == var1.serverPacket) {
					BuddyRankComparator.field1342 = new class370(Ignored.HitSplatDefinition_cached);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2945 == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShort() * 30;
					field471 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				Widget var58;
				if (ServerPacket.field2985 == var1.serverPacket) {
					var17 = var3.method7412();
					var58 = ChatChannel.getWidget(var17);

					for (var6 = 0; var6 < var58.itemIds.length; ++var6) {
						var58.itemIds[var6] = -1;
						var58.itemIds[var6] = 0;
					}

					SecureRandomCallable.invalidateWidget(var58);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3008 == var1.serverPacket) {
					var45 = var3.readStringCp1252NullTerminated();
					var5 = var3.method7568();
					var18 = ChatChannel.getWidget(var5);
					if (!var45.equals(var18.text)) {
						var18.text = var45;
						SecureRandomCallable.invalidateWidget(var18);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2963 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					field725[var17] = true;
					field726[var17] = var5;
					field679[var17] = var6;
					field618[var17] = var7;
					field729[var17] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2958 == var1.serverPacket) {
					for (var17 = 0; var17 < players.length; ++var17) {
						if (players[var17] != null) {
							players[var17].sequence = -1;
						}
					}

					for (var17 = 0; var17 < npcs.length; ++var17) {
						if (npcs[var17] != null) {
							npcs[var17].sequence = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3015 == var1.serverPacket) {
					Projectile.privateChatMode = WorldMapData_0.method4353(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2976 == var1.serverPacket) {
					var17 = var3.readInt();
					if (var17 != field607) {
						field607 = var17;
						class291.method5502();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2969 == var1.serverPacket) {
					UserComparator4.method2499(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2962 == var1.serverPacket) {
					publicChatMode = var3.readUnsignedByte();
					tradeChatMode = var3.method7520();
					var1.serverPacket = null;
					return true;
				}

				String var57;
				if (ServerPacket.field2999 == var1.serverPacket) {
					var17 = var3.readUShortSmart();
					boolean var53 = var3.readUnsignedByte() == 1;
					var57 = "";
					boolean var50 = false;
					if (var53) {
						var57 = var3.readStringCp1252NullTerminated();
						if (GameEngine.friendSystem.isIgnored(new Username(var57, class194.loginType))) {
							var50 = true;
						}
					}

					String var8 = var3.readStringCp1252NullTerminated();
					if (!var50) {
						class194.addGameMessage(var17, var57, var8);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3009 == var1.serverPacket) {
					var66 = var3.readBoolean();
					if (var66) {
						if (Messages.field1273 == null) {
							Messages.field1273 = new class312();
						}
					} else {
						Messages.field1273 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2953 == var1.serverPacket) {
					var17 = var3.method7411();
					var5 = var3.method7403();
					var6 = var3.readUnsignedShort();
					var25 = ChatChannel.getWidget(var17);
					var25.field3260 = var6 + (var5 << 16);
					var1.serverPacket = null;
					return true;
				}

				int var13;
				String var41;
				if (ServerPacket.field3012 == var1.serverPacket) {
					var45 = var3.readStringCp1252NullTerminated();
					var29 = (long)var3.readUnsignedShort();
					var31 = (long)var3.readMedium();
					PlayerType var37 = (PlayerType)class130.findEnumerated(SpotAnimationDefinition.PlayerType_values(), var3.readUnsignedByte());
					long var38 = (var29 << 32) + var31;
					boolean var40 = false;

					for (var13 = 0; var13 < 100; ++var13) {
						if (crossWorldMessageIds[var13] == var38) {
							var40 = true;
							break;
						}
					}

					if (GameEngine.friendSystem.isIgnored(new Username(var45, class194.loginType))) {
						var40 = true;
					}

					if (!var40 && field590 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var38;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var41 = AbstractFont.escapeBrackets(class412.method7287(SequenceDefinition.method3689(var3)));
						byte var76;
						if (var37.isPrivileged) {
							var76 = 7;
						} else {
							var76 = 3;
						}

						if (var37.modIcon != -1) {
							class194.addGameMessage(var76, class221.method4705(var37.modIcon) + var45, var41);
						} else {
							class194.addGameMessage(var76, var45, var41);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3025 == var1.serverPacket) {
					LoginScreenAnimation.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3024 == var1.serverPacket) {
					var68 = var3.method7465();
					var5 = var3.readUnsignedShort();
					Varps.Varps_temp[var5] = var68;
					if (Varps.Varps_main[var5] != var68) {
						Varps.Varps_main[var5] = var68;
					}

					class281.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2971 == var1.serverPacket) {
					var17 = var3.method7392();
					var5 = var3.method7392();
					var57 = var3.readStringCp1252NullTerminated();
					if (var5 >= 1 && var5 <= 8) {
						if (var57.equalsIgnoreCase("null")) {
							var57 = null;
						}

						playerMenuActions[var5 - 1] = var57;
						playerOptionsPriorities[var5 - 1] = var17 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2979 == var1.serverPacket) {
					var68 = var3.readByte();
					var29 = (long)var3.readUnsignedShort();
					var31 = (long)var3.readMedium();
					var33 = (var29 << 32) + var31;
					boolean var28 = false;
					ClanChannel var42 = var68 >= 0 ? currentClanChannels[var68] : UserComparator5.guestClanChannel;
					if (var42 == null) {
						var28 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) {
							if (var33 == crossWorldMessageIds[var13]) {
								var28 = true;
								break;
							}
						}
					}

					if (!var28) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var33;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var41 = SequenceDefinition.method3689(var3);
						int var36 = var68 >= 0 ? 43 : 46;
						DevicePcmPlayerProvider.addChatMessage(var36, "", var41, var42.name);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3014 == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2997 == var1.serverPacket) {
					GrandExchangeOfferOwnWorldComparator.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3022 == var1.serverPacket) {
					field583 = cycleCntr;
					var68 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var68 >= 0) {
							currentClanChannels[var68] = null;
						} else {
							UserComparator5.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var68 >= 0) {
						currentClanChannels[var68] = new ClanChannel(var3);
					} else {
						UserComparator5.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3013 == var1.serverPacket) {
					var17 = var3.method7411();
					var5 = var3.method7403();
					Varps.Varps_temp[var5] = var17;
					if (Varps.Varps_main[var5] != var17) {
						Varps.Varps_main[var5] = var17;
					}

					class281.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2933 == var1.serverPacket) {
					var66 = var3.readUnsignedByte() == 1;
					if (var66) {
						WorldMapSprite.field2727 = Ignored.method6459() - var3.readLong();
						grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						grandExchangeEvents = null;
					}

					field669 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2946 == var1.serverPacket) {
					class17.field90 = var3.method7392();
					class167.field1813 = var3.readUnsignedByte();

					for (var17 = class17.field90; var17 < class17.field90 + 8; ++var17) {
						for (var5 = class167.field1813; var5 < class167.field1813 + 8; ++var5) {
							if (groundItems[class20.Client_plane][var17][var5] != null) {
								groundItems[class20.Client_plane][var17][var5] = null;
								MouseHandler.updateItemPile(var17, var5);
							}
						}
					}

					for (PendingSpawn var47 = (PendingSpawn)pendingSpawns.last(); var47 != null; var47 = (PendingSpawn)pendingSpawns.previous()) {
						if (var47.x >= class17.field90 && var47.x < class17.field90 + 8 && var47.y >= class167.field1813 && var47.y < class167.field1813 + 8 && var47.plane == class20.Client_plane) {
							var47.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3019 == var1.serverPacket) {
					DirectByteArrayCopier.method5328(class253.field2911);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3006 == var1.serverPacket) {
					var17 = var3.readInt();
					InterfaceParent var60 = (InterfaceParent)interfaceParents.get((long)var17);
					if (var60 != null) {
						class10.closeInterface(var60, true);
					}

					if (meslayerContinueWidget != null) {
						SecureRandomCallable.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2947 == var1.serverPacket) {
					byte[] var46 = new byte[var1.serverPacketLength];
					var3.method7312(var46, 0, var46.length);
					Buffer var59 = new Buffer(var46);
					var57 = var59.readStringCp1252NullTerminated();
					WorldMapSprite.openURL(var57, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2959 == var1.serverPacket) {
					var17 = var3.method7411();
					var5 = var3.method7499();
					var18 = ChatChannel.getWidget(var17);
					if (var18.modelType != 2 || var5 != var18.modelId) {
						var18.modelType = 2;
						var18.modelId = var5;
						SecureRandomCallable.invalidateWidget(var18);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2936 == var1.serverPacket) {
					for (var17 = 0; var17 < Varps.Varps_main.length; ++var17) {
						if (Varps.Varps_temp[var17] != Varps.Varps_main[var17]) {
							Varps.Varps_main[var17] = Varps.Varps_temp[var17];
							class281.changeGameOptions(var17);
							changedVarps[++changedVarpCount - 1 & 31] = var17;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2974 == var1.serverPacket) {
					var17 = var3.method7412();
					var58 = ChatChannel.getWidget(var17);
					var58.modelType = 3;
					var58.modelId = class340.localPlayer.appearance.getChatHeadId();
					SecureRandomCallable.invalidateWidget(var58);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3010 == var1.serverPacket) {
					updatePlayers(var3, var1.serverPacketLength);
					WorldMapLabelSize.method4373();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2966 == var1.serverPacket) {
					ObjectSound.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2964 == var1.serverPacket) {
					UserComparator6.method2551();
					var17 = var3.readUnsignedByte();
					var5 = var3.method7394();
					var6 = var3.method7411();
					experience[var5] = var6;
					currentLevels[var5] = var17;
					levels[var5] = 1;

					for (var7 = 0; var7 < 98; ++var7) {
						if (var6 >= Skills.Skills_experienceTable[var7]) {
							levels[var5] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2995 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						ObjectComposition.method3541(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2975 == var1.serverPacket) {
					var17 = var3.readUnsignedShort();
					if (var17 == 65535) {
						var17 = -1;
					}

					class18.playSong(var17);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3003 == var1.serverPacket) {
					var17 = var3.method7508();
					var5 = var3.method7401();
					if (var5 == 65535) {
						var5 = -1;
					}

					class315.method5822(var5, var17);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2987 == var1.serverPacket) {
					var17 = var3.readUnsignedShort();
					var5 = var3.method7411();
					var18 = ChatChannel.getWidget(var5);
					if (var18.modelType != 1 || var17 != var18.modelId) {
						var18.modelType = 1;
						var18.modelId = var17;
						SecureRandomCallable.invalidateWidget(var18);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2941 == var1.serverPacket) {
					var17 = var3.method7401();
					ReflectionCheck.method662(var17);
					changedItemContainers[++field665 - 1 & 31] = var17 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2950 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					SecureRandomFuture.forceDisconnect(var17);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2992 == var1.serverPacket) {
					var17 = var3.method7412();
					var5 = var3.method7401();
					var6 = var5 >> 10 & 31;
					var7 = var5 >> 5 & 31;
					var26 = var5 & 31;
					var9 = (var7 << 11) + (var6 << 19) + (var26 << 3);
					Widget var10 = ChatChannel.getWidget(var17);
					if (var9 != var10.color) {
						var10.color = var9;
						SecureRandomCallable.invalidateWidget(var10);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2954 == var1.serverPacket) {
					var45 = var3.readStringCp1252NullTerminated();
					var19 = AbstractFont.escapeBrackets(class412.method7287(SequenceDefinition.method3689(var3)));
					class194.addGameMessage(6, var45, var19);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2956 == var1.serverPacket) {
					DirectByteArrayCopier.method5328(class253.field2917);
					var1.serverPacket = null;
					return true;
				}

				AccessFile.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id * -836596687 * 884821201 : -1) + "," + (var1.field1290 != null ? var1.field1290.id * -836596687 * 884821201 : -1) + "," + (var1.field1291 != null ? var1.field1291.id * -836596687 * 884821201 : -1) + "," + var1.serverPacketLength, (Throwable)null);
				LoginScreenAnimation.logOut();
			} catch (IOException var43) {
				Varcs.method2411();
			} catch (Exception var44) {
				var19 = "" + (var1.serverPacket != null ? var1.serverPacket.id * -836596687 * 884821201 : -1) + "," + (var1.field1290 != null ? var1.field1290.id * -836596687 * 884821201 : -1) + "," + (var1.field1291 != null ? var1.field1291.id * -836596687 * 884821201 : -1) + "," + var1.serverPacketLength + "," + (class340.localPlayer.pathX[0] + class131.baseX) + "," + (class340.localPlayer.pathY[0] + TileItem.baseY) + ",";

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
					var19 = var19 + var3.array[var6] + ",";
				}

				AccessFile.RunException_sendStackTrace(var19, var44);
				LoginScreenAnimation.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "49"
	)
	@Export("menu")
	final void menu() {
		Message.incrementMenuEntries();
		if (class143.dragInventoryWidget == null) {
			if (clickedWidget == null) {
				int var1 = MouseHandler.MouseHandler_lastButton;
				int var2;
				int var3;
				int var4;
				int var5;
				int var7;
				int var8;
				if (isMenuOpen) {
					if (var1 != 1 && (class150.mouseCam || var1 != 4)) {
						var2 = MouseHandler.MouseHandler_x;
						var3 = MouseHandler.MouseHandler_y;
						if (var2 < ModeWhere.menuX - 10 || var2 > GameObject.menuWidth + ModeWhere.menuX + 10 || var3 < BufferedSink.menuY - 10 || var3 > BufferedSink.menuY + UserComparator3.menuHeight + 10) {
							isMenuOpen = false;
							class10.method124(ModeWhere.menuX, BufferedSink.menuY, GameObject.menuWidth, UserComparator3.menuHeight);
						}
					}

					if (var1 == 1 || !class150.mouseCam && var1 == 4) {
						var2 = ModeWhere.menuX;
						var3 = BufferedSink.menuY;
						var4 = GameObject.menuWidth;
						var5 = MouseHandler.MouseHandler_lastPressedX;
						int var10 = MouseHandler.MouseHandler_lastPressedY;
						var7 = -1;

						for (var8 = 0; var8 < menuOptionsCount; ++var8) {
							int var9 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31;
							if (var5 > var2 && var5 < var4 + var2 && var10 > var9 - 13 && var10 < var9 + 3) {
								var7 = var8;
							}
						}

						if (var7 != -1) {
							class17.method291(var7);
						}

						isMenuOpen = false;
						class10.method124(ModeWhere.menuX, BufferedSink.menuY, GameObject.menuWidth, UserComparator3.menuHeight);
					}
				} else {
					var2 = UserComparator10.method2543();
					if ((var1 == 1 || !class150.mouseCam && var1 == 4) && var2 >= 0) {
						var3 = menuOpcodes[var2];
						if (var3 == 39 || var3 == 40 || var3 == 41 || var3 == 42 || var3 == 43 || var3 == 33 || var3 == 34 || var3 == 35 || var3 == 36 || var3 == 37 || var3 == 38 || var3 == 1005) {
							var4 = menuArguments1[var2];
							var5 = menuArguments2[var2];
							Widget var6 = ChatChannel.getWidget(var5);
							if (class257.method5020(class363.getWidgetFlags(var6)) || MouseHandler.method649(class363.getWidgetFlags(var6))) {
								if (class143.dragInventoryWidget != null && !field572 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) {
									var7 = draggedWidgetX;
									var8 = draggedWidgetY;
									WorldMapIcon_1.method4385(class87.tempMenuAction, var7, var8);
									class87.tempMenuAction = null;
								}

								field572 = false;
								itemDragDuration = 0;
								if (class143.dragInventoryWidget != null) {
									SecureRandomCallable.invalidateWidget(class143.dragInventoryWidget);
								}

								class143.dragInventoryWidget = ChatChannel.getWidget(var5);
								dragItemSlotSource = var4;
								draggedWidgetX = MouseHandler.MouseHandler_lastPressedX;
								draggedWidgetY = MouseHandler.MouseHandler_lastPressedY;
								if (var2 >= 0) {
									class16.method239(var2);
								}

								SecureRandomCallable.invalidateWidget(class143.dragInventoryWidget);
								return;
							}
						}
					}

					if ((var1 == 1 || !class150.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) {
						var1 = 2;
					}

					if ((var1 == 1 || !class150.mouseCam && var1 == 4) && menuOptionsCount > 0) {
						class17.method291(var2);
					}

					if (var1 == 2 && menuOptionsCount > 0) {
						this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}
				}

			}
		}
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2019357274"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = UserComparator10.method2543();
		boolean var2 = leftClickOpensMenu == 1 && menuOptionsCount > 2;
		if (!var2) {
			boolean var3;
			if (var1 < 0) {
				var3 = false;
			} else {
				int var4 = menuOpcodes[var1];
				if (var4 >= 2000) {
					var4 -= 2000;
				}

				if (var4 == 1007) {
					var3 = true;
				} else {
					var3 = false;
				}
			}

			var2 = var3;
		}

		return var2 && !menuShiftClick[var1];
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-193534652"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		MouseHandler.method646(var1, var2);
		class7.scene.menuOpen(class20.Client_plane, var1, var2, false);
		isMenuOpen = true;
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-48"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		class18.method297(rootInterface, class186.canvasWidth, BoundaryObject.canvasHeight, var1);
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Ljm;I)V",
		garbageValue = "-1768383258"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : ChatChannel.getWidget(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = class186.canvasWidth;
			var4 = BoundaryObject.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		class29.alignWidgetSize(var1, var3, var4, false);
		MouseHandler.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1117157787"
	)
	final void method1174() {
		SecureRandomCallable.invalidateWidget(clickedWidget);
		++class87.widgetDragDuration;
		if (field657 && field531) {
			int var1 = MouseHandler.MouseHandler_x;
			int var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field681) {
				var1 = field681;
			}

			if (var1 + clickedWidget.width > field681 + clickedWidgetParent.width) {
				var1 = field681 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field659) {
				var2 = field659;
			}

			if (var2 + clickedWidget.height > field659 + clickedWidgetParent.height) {
				var2 = field659 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field658;
			int var4 = var2 - field660;
			int var5 = clickedWidget.dragZoneSize;
			if (class87.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field681 + clickedWidgetParent.scrollX;
			int var7 = var2 - field659 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				class285.runScriptEvent(var8);
			}

			if (MouseHandler.MouseHandler_currentButton == 0) {
				if (isDraggingWidget) {
					if (clickedWidget.onDragComplete != null) {
						var8 = new ScriptEvent();
						var8.widget = clickedWidget;
						var8.mouseX = var6;
						var8.mouseY = var7;
						var8.dragTarget = draggedOnWidget;
						var8.args = clickedWidget.onDragComplete;
						class285.runScriptEvent(var8);
					}

					if (draggedOnWidget != null && SpotAnimationDefinition.method3340(clickedWidget) != null) {
						PacketBufferNode var11 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2816, packetWriter.isaacCipher);
						var11.packetBuffer.method7407(draggedOnWidget.id);
						var11.packetBuffer.method7398(clickedWidget.childIndex);
						var11.packetBuffer.method7493(draggedOnWidget.itemId);
						var11.packetBuffer.method7493(draggedOnWidget.childIndex);
						var11.packetBuffer.writeShort(clickedWidget.itemId);
						var11.packetBuffer.writeInt(clickedWidget.id);
						packetWriter.addNode(var11);
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(field658 + widgetClickX, widgetClickY + field660);
				} else if (menuOptionsCount > 0) {
					int var10 = widgetClickX + field658;
					int var9 = widgetClickY + field660;
					WorldMapIcon_1.method4385(class87.tempMenuAction, var10, var9);
					class87.tempMenuAction = null;
				}

				clickedWidget = null;
			}

		} else {
			if (class87.widgetDragDuration > 1) {
				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(I)Lpo;",
		garbageValue = "-1191894118"
	)
	@Export("username")
	public Username username() {
		return class340.localPlayer != null ? class340.localPlayer.username : null;
	}

	public final void init() {
		try {
			if (this.checkHost()) {
				int var7;
				for (int var1 = 0; var1 <= 27; ++var1) {
					String var2 = this.getParameter(Integer.toString(var1));
					if (var2 != null) {
						switch(var1) {
						case 1:
							useBufferedSocket = Integer.parseInt(var2) != 0;
						case 2:
						case 13:
						case 16:
						case 18:
						case 19:
						case 20:
						default:
							break;
						case 3:
							if (var2.equalsIgnoreCase("true")) {
								isMembersWorld = true;
							} else {
								isMembersWorld = false;
							}
							break;
						case 4:
							if (clientType == -1) {
								clientType = Integer.parseInt(var2);
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2);
							break;
						case 6:
							ScriptFrame.clientLanguage = Language.method5826(Integer.parseInt(var2));
							break;
						case 7:
							int var4 = Integer.parseInt(var2);
							GameBuild[] var5 = new GameBuild[]{GameBuild.BUILDLIVE, GameBuild.RC, GameBuild.LIVE, GameBuild.WIP};
							GameBuild[] var6 = var5;
							var7 = 0;

							GameBuild var3;
							while (true) {
								if (var7 >= var6.length) {
									var3 = null;
									break;
								}

								GameBuild var8 = var6[var7];
								if (var4 == var8.buildId) {
									var3 = var8;
									break;
								}

								++var7;
							}

							StudioGame.field3456 = var3;
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							class1.field3 = var2;
							break;
						case 10:
							class338.field4054 = (StudioGame)class130.findEnumerated(WorldMapAreaData.method4894(), Integer.parseInt(var2));
							if (class338.field4054 == StudioGame.oldscape) {
								class194.loginType = LoginType.oldscape;
							} else {
								class194.loginType = LoginType.field4405;
							}
							break;
						case 11:
							class257.field3044 = var2;
							break;
						case 12:
							worldId = Integer.parseInt(var2);
							break;
						case 14:
							FriendLoginUpdate.field4096 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							AbstractWorldMapIcon.field2761 = var2;
							break;
						case 21:
							field473 = Integer.parseInt(var2);
							break;
						case 22:
							field526 = Integer.parseInt(var2) != 0;
						}
					}
				}

				Scene.Scene_isLowDetail = false;
				isLowDetail = false;
				class185.worldHost = this.getCodeBase().getHost();
				String var17 = StudioGame.field3456.name;
				byte var18 = 0;

				try {
					class143.idxCount = 21;
					UserComparator3.cacheGamebuild = var18;

					try {
						Coord.operatingSystemName = System.getProperty("os.name");
					} catch (Exception var32) {
						Coord.operatingSystemName = "Unknown";
					}

					JagexCache.formattedOperatingSystemName = Coord.operatingSystemName.toLowerCase();

					try {
						class409.userHomeDirectory = System.getProperty("user.home");
						if (class409.userHomeDirectory != null) {
							class409.userHomeDirectory = class409.userHomeDirectory + "/";
						}
					} catch (Exception var31) {
					}

					try {
						if (JagexCache.formattedOperatingSystemName.startsWith("win")) {
							if (class409.userHomeDirectory == null) {
								class409.userHomeDirectory = System.getenv("USERPROFILE");
							}
						} else if (class409.userHomeDirectory == null) {
							class409.userHomeDirectory = System.getenv("HOME");
						}

						if (class409.userHomeDirectory != null) {
							class409.userHomeDirectory = class409.userHomeDirectory + "/";
						}
					} catch (Exception var30) {
					}

					if (class409.userHomeDirectory == null) {
						class409.userHomeDirectory = "~/";
					}

					UserComparator3.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class409.userHomeDirectory, "/tmp/", ""};
					BufferedSource.cacheSubPaths = new String[]{".jagex_cache_" + UserComparator3.cacheGamebuild, ".file_store_" + UserComparator3.cacheGamebuild};
					int var19 = 0;

					label275:
					while (var19 < 4) {
						String var37 = var19 == 0 ? "" : "" + var19;
						Huffman.JagexCache_locationFile = new File(class409.userHomeDirectory, "jagex_cl_oldschool_" + var17 + var37 + ".dat");
						String var39 = null;
						String var20 = null;
						boolean var21 = false;
						File var42;
						if (Huffman.JagexCache_locationFile.exists()) {
							try {
								AccessFile var9 = new AccessFile(Huffman.JagexCache_locationFile, "rw", 10000L);

								Buffer var10;
								int var11;
								for (var10 = new Buffer((int)var9.length()); var10.offset < var10.array.length; var10.offset += var11) {
									var11 = var9.read(var10.array, var10.offset, var10.array.length - var10.offset);
									if (var11 == -1) {
										throw new IOException();
									}
								}

								var10.offset = 0;
								var11 = var10.readUnsignedByte();
								if (var11 < 1 || var11 > 3) {
									throw new IOException("" + var11);
								}

								int var12 = 0;
								if (var11 > 1) {
									var12 = var10.readUnsignedByte();
								}

								if (var11 <= 2) {
									var39 = var10.readStringCp1252NullCircumfixed();
									if (var12 == 1) {
										var20 = var10.readStringCp1252NullCircumfixed();
									}
								} else {
									var39 = var10.readCESU8();
									if (var12 == 1) {
										var20 = var10.readCESU8();
									}
								}

								var9.close();
							} catch (IOException var34) {
								var34.printStackTrace();
							}

							if (var39 != null) {
								var42 = new File(var39);
								if (!var42.exists()) {
									var39 = null;
								}
							}

							if (var39 != null) {
								var42 = new File(var39, "test.dat");
								if (!BoundaryObject.method4321(var42, true)) {
									var39 = null;
								}
							}
						}

						if (var39 == null && var19 == 0) {
							label250:
							for (int var22 = 0; var22 < BufferedSource.cacheSubPaths.length; ++var22) {
								for (int var23 = 0; var23 < UserComparator3.cacheParentPaths.length; ++var23) {
									File var24 = new File(UserComparator3.cacheParentPaths[var23] + BufferedSource.cacheSubPaths[var22] + File.separatorChar + "oldschool" + File.separatorChar);
									if (var24.exists()) {
										File var13 = new File(var24, "test.dat");

										boolean var44;
										try {
											RandomAccessFile var14 = new RandomAccessFile(var13, "rw");
											int var15 = var14.read();
											var14.seek(0L);
											var14.write(var15);
											var14.seek(0L);
											var14.close();
											var13.delete();
											var44 = true;
										} catch (Exception var29) {
											var44 = false;
										}

										if (var44) {
											var39 = var24.toString();
											var21 = true;
											break label250;
										}
									}
								}
							}
						}

						if (var39 == null) {
							var39 = class409.userHomeDirectory + File.separatorChar + "jagexcache" + var37 + File.separatorChar + "oldschool" + File.separatorChar + var17 + File.separatorChar;
							var21 = true;
						}

						if (var20 != null) {
							File var41 = new File(var20);
							var42 = new File(var39);

							try {
								File[] var46 = var41.listFiles();
								File[] var25 = var46;

								for (int var26 = 0; var26 < var25.length; ++var26) {
									File var45 = var25[var26];
									File var27 = new File(var42, var45.getName());
									boolean var16 = var45.renameTo(var27);
									if (!var16) {
										throw new IOException();
									}
								}
							} catch (Exception var33) {
								var33.printStackTrace();
							}

							var21 = true;
						}

						if (var21) {
							MusicPatchPcmStream.method5272(new File(var39), (File)null);
						}

						File var28 = new File(var39);
						class13.cacheDir = var28;
						if (!class13.cacheDir.exists()) {
							class13.cacheDir.mkdirs();
						}

						File[] var38 = class13.cacheDir.listFiles();
						if (var38 != null) {
							File[] var43 = var38;

							for (var7 = 0; var7 < var43.length; ++var7) {
								File var40 = var43[var7];
								if (!BoundaryObject.method4321(var40, false)) {
									++var19;
									continue label275;
								}
							}
						}
						break;
					}

					MusicPatchNode2.method5048(class13.cacheDir);
					class368.method6744();
					JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(GameEngine.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
					JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(GameEngine.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
					JagexCache.JagexCache_idxFiles = new BufferedFile[class143.idxCount];

					for (var19 = 0; var19 < class143.idxCount; ++var19) {
						JagexCache.JagexCache_idxFiles[var19] = new BufferedFile(new AccessFile(GameEngine.getFile("main_file_cache.idx" + var19), "rw", 1048576L), 6000, 0);
					}
				} catch (Exception var35) {
					AccessFile.RunException_sendStackTrace((String)null, var35);
				}

				class295.client = this;
				class398.clientType = clientType;
				if (field499 == -1) {
					field499 = 0;
				}

				WorldMapAreaData.field2772 = System.getenv("JX_ACCESS_TOKEN");
				System.getenv("JX_REFRESH_TOKEN");
				this.startThread(765, 503, 202);
			}
		} catch (RuntimeException var36) {
			throw class139.newRunException(var36, "client.init(" + ')');
		}
	}

	public void setOAuthTokens(String var1, String var2) {
		if (var1 != null && !var1.trim().isEmpty() && var2 != null && !var2.trim().isEmpty()) {
			WorldMapAreaData.field2772 = var1;
			PlayerType.method5521(10);
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "242484540"
	)
	static void method1623(int var0) {
		class366.field4192 = var0;
		class366.field4191 = new class366[var0];
		class149.field1663 = 0;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lpj;II)V",
		garbageValue = "-925897416"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset;
		Players.Players_pendingUpdateCount = 0;
		int var3 = 0;
		var0.importIndex();

		byte[] var10000;
		int var4;
		int var6;
		int var7;
		for (var4 = 0; var4 < Players.Players_count; ++var4) {
			var7 = Players.Players_indices[var4];
			if ((Players.field1243[var7] & 1) == 0) {
				if (var3 > 0) {
					--var3;
					var10000 = Players.field1243;
					var10000[var7] = (byte)(var10000[var7] | 2);
				} else {
					var6 = var0.readBits(1);
					if (var6 == 0) {
						var3 = class124.method2747(var0);
						var10000 = Players.field1243;
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						class231.readPlayerUpdate(var0, var7);
					}
				}
			}
		}

		var0.exportIndex();
		if (var3 != 0) {
			throw new RuntimeException();
		} else {
			var0.importIndex();

			for (var4 = 0; var4 < Players.Players_count; ++var4) {
				var7 = Players.Players_indices[var4];
				if ((Players.field1243[var7] & 1) != 0) {
					if (var3 > 0) {
						--var3;
						var10000 = Players.field1243;
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						var6 = var0.readBits(1);
						if (var6 == 0) {
							var3 = class124.method2747(var0);
							var10000 = Players.field1243;
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							class231.readPlayerUpdate(var0, var7);
						}
					}
				}
			}

			var0.exportIndex();
			if (var3 != 0) {
				throw new RuntimeException();
			} else {
				var0.importIndex();

				for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) {
					var7 = Players.Players_emptyIndices[var4];
					if ((Players.field1243[var7] & 1) != 0) {
						if (var3 > 0) {
							--var3;
							var10000 = Players.field1243;
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							var6 = var0.readBits(1);
							if (var6 == 0) {
								var3 = class124.method2747(var0);
								var10000 = Players.field1243;
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else if (Decimator.updateExternalPlayer(var0, var7)) {
								var10000 = Players.field1243;
								var10000[var7] = (byte)(var10000[var7] | 2);
							}
						}
					}
				}

				var0.exportIndex();
				if (var3 != 0) {
					throw new RuntimeException();
				} else {
					var0.importIndex();

					for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) {
						var7 = Players.Players_emptyIndices[var4];
						if ((Players.field1243[var7] & 1) == 0) {
							if (var3 > 0) {
								--var3;
								var10000 = Players.field1243;
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else {
								var6 = var0.readBits(1);
								if (var6 == 0) {
									var3 = class124.method2747(var0);
									var10000 = Players.field1243;
									var10000[var7] = (byte)(var10000[var7] | 2);
								} else if (Decimator.updateExternalPlayer(var0, var7)) {
									var10000 = Players.field1243;
									var10000[var7] = (byte)(var10000[var7] | 2);
								}
							}
						}
					}

					var0.exportIndex();
					if (var3 != 0) {
						throw new RuntimeException();
					} else {
						Players.Players_count = 0;
						Players.Players_emptyIdxCount = 0;

						Player var5;
						for (var4 = 1; var4 < 2048; ++var4) {
							var10000 = Players.field1243;
							var10000[var4] = (byte)(var10000[var4] >> 1);
							var5 = players[var4];
							if (var5 != null) {
								Players.Players_indices[++Players.Players_count - 1] = var4;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var4;
							}
						}

						for (var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) {
							var4 = Players.Players_pendingUpdateIndices[var3];
							var5 = players[var4];
							var6 = var0.readUnsignedByte();
							if ((var6 & 16) != 0) {
								var6 += var0.readUnsignedByte() << 8;
							}

							class65.method1957(var0, var4, var5, var6);
						}

						if (var0.offset - var2 != var1) {
							throw new RuntimeException(var0.offset - var2 + " " + var1);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1203328056"
	)
	static final void method1662(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Object var10001 = null;
		var10000 = var10000.append("Please remove ").append(var0);
		var10001 = null;
		String var1 = var10000.append(" from your ignore list first").toString();
		class194.addGameMessage(30, "", var1);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2037672270"
	)
	static String method1668() {
		String var0 = "";

		Message var2;
		for (Iterator var1 = Messages.Messages_hashTable.iterator(); var1.hasNext(); var0 = var0 + var2.sender + ':' + var2.text + '\n') {
			var2 = (Message)var1.next();
		}

		return var0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZB)I",
		garbageValue = "-56"
	)
	static int method1667(int var0, Script var1, boolean var2) {
		if (var0 == 6800) {
			Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else if (var0 != 6801 && var0 != 6802) {
			if (var0 == 6850) {
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
				return 1;
			} else if (var0 != 6851 && var0 != 6852) {
				if (var0 == 6853) {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
				return 1;
			}
		} else {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
			return 1;
		}
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Ljm;III)V",
		garbageValue = "-1503401807"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) {
			class11.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id);
		}

		String var3;
		if (var0.buttonType == 2 && !isSpellSelected) {
			var3 = SecureRandomFuture.Widget_getSpellActionName(var0);
			if (var3 != null) {
				class11.insertMenuItemNoShift(var3, UserComparator5.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id);
			}
		}

		if (var0.buttonType == 3) {
			class11.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			class11.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			class11.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && meslayerContinueWidget == null) {
			class11.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		int var4;
		int var19;
		if (var0.type == 2) {
			var19 = 0;

			for (var4 = 0; var4 < var0.height; ++var4) {
				for (int var21 = 0; var21 < var0.width; ++var21) {
					int var22 = (var0.paddingX + 32) * var21;
					int var7 = (var0.paddingY + 32) * var4;
					if (var19 < 20) {
						var22 += var0.inventoryXOffsets[var19];
						var7 += var0.inventoryYOffsets[var19];
					}

					if (var1 >= var22 && var2 >= var7 && var1 < var22 + 32 && var2 < var7 + 32) {
						dragItemSlotDestination = var19;
						FloorOverlayDefinition.hoveredItemContainer = var0;
						if (var0.itemIds[var19] > 0) {
							label365: {
								ItemComposition var8 = UserComparator6.ItemDefinition_get(var0.itemIds[var19] - 1);
								boolean var9;
								int var10;
								if (isItemSelected == 1) {
									var10 = class363.getWidgetFlags(var0);
									var9 = (var10 >> 30 & 1) != 0;
									if (var9) {
										if (var0.id != MidiPcmStream.selectedItemWidget || var19 != Calendar.selectedItemSlot) {
											class11.insertMenuItemNoShift("Use", selectedItemName + " " + "->" + " " + UserComparator5.colorStartTag(16748608) + var8.name, 31, var8.id, var19, var0.id);
										}
										break label365;
									}
								}

								if (isSpellSelected) {
									var10 = class363.getWidgetFlags(var0);
									var9 = (var10 >> 30 & 1) != 0;
									if (var9) {
										if ((class91.selectedSpellFlags & 16) == 16) {
											class11.insertMenuItemNoShift(selectedSpellActionName, selectedSpellName + " " + "->" + " " + UserComparator5.colorStartTag(16748608) + var8.name, 32, var8.id, var19, var0.id);
										}
										break label365;
									}
								}

								String[] var23 = var8.inventoryActions;
								var10 = -1;
								if (shiftClickDrop && ArchiveLoader.method2125()) {
									var10 = var8.getShiftClickIndex();
								}

								int var12 = class363.getWidgetFlags(var0);
								boolean var11 = (var12 >> 30 & 1) != 0;
								if (var11) {
									for (int var13 = 4; var13 >= 3; --var13) {
										if (var13 != var10) {
											VarbitComposition.addWidgetItemMenuItem(var0, var8, var19, var13, false);
										}
									}
								}

								int var14 = class363.getWidgetFlags(var0);
								boolean var24 = (var14 >> 31 & 1) != 0;
								if (var24) {
									class11.insertMenuItemNoShift("Use", UserComparator5.colorStartTag(16748608) + var8.name, 38, var8.id, var19, var0.id);
								}

								int var16 = class363.getWidgetFlags(var0);
								boolean var15 = (var16 >> 30 & 1) != 0;
								int var17;
								if (var15) {
									for (var17 = 2; var17 >= 0; --var17) {
										if (var17 != var10) {
											VarbitComposition.addWidgetItemMenuItem(var0, var8, var19, var17, false);
										}
									}

									if (var10 >= 0) {
										VarbitComposition.addWidgetItemMenuItem(var0, var8, var19, var10, true);
									}
								}

								var23 = var0.itemActions;
								if (var23 != null) {
									for (var17 = 4; var17 >= 0; --var17) {
										if (var23[var17] != null) {
											byte var18 = 0;
											if (var17 == 0) {
												var18 = 39;
											}

											if (var17 == 1) {
												var18 = 40;
											}

											if (var17 == 2) {
												var18 = 41;
											}

											if (var17 == 3) {
												var18 = 42;
											}

											if (var17 == 4) {
												var18 = 43;
											}

											class11.insertMenuItemNoShift(var23[var17], UserComparator5.colorStartTag(16748608) + var8.name, var18, var8.id, var19, var0.id);
										}
									}
								}

								class11.insertMenuItemNoShift("Examine", UserComparator5.colorStartTag(16748608) + var8.name, 1005, var8.id, var19, var0.id);
							}
						}
					}

					++var19;
				}
			}
		}

		if (var0.isIf3) {
			if (isSpellSelected) {
				var4 = class363.getWidgetFlags(var0);
				boolean var25 = (var4 >> 21 & 1) != 0;
				if (var25 && (class91.selectedSpellFlags & 32) == 32) {
					class11.insertMenuItemNoShift(selectedSpellActionName, selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id);
				}
			} else {
				for (var19 = 9; var19 >= 5; --var19) {
					String var20;
					if (!WorldMapCacheName.method4864(class363.getWidgetFlags(var0), var19) && var0.onOp == null) {
						var20 = null;
					} else if (var0.actions != null && var0.actions.length > var19 && var0.actions[var19] != null && var0.actions[var19].trim().length() != 0) {
						var20 = var0.actions[var19];
					} else {
						var20 = null;
					}

					if (var20 != null) {
						class11.insertMenuItemNoShift(var20, var0.dataText, 1007, var19 + 1, var0.childIndex, var0.id);
					}
				}

				var3 = SecureRandomFuture.Widget_getSpellActionName(var0);
				if (var3 != null) {
					class11.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id);
				}

				for (var4 = 4; var4 >= 0; --var4) {
					String var5;
					if (!WorldMapCacheName.method4864(class363.getWidgetFlags(var0), var4) && var0.onOp == null) {
						var5 = null;
					} else if (var0.actions != null && var0.actions.length > var4 && var0.actions[var4] != null && var0.actions[var4].trim().length() != 0) {
						var5 = var0.actions[var4];
					} else {
						var5 = null;
					}

					if (var5 != null) {
						class21.insertMenuItem(var5, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry);
					}
				}

				if (class20.method332(class363.getWidgetFlags(var0))) {
					class11.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}
}
