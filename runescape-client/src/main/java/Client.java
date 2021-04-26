import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed {
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = -682660239
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = -747091901
	)
	static int field810;
	@ObfuscatedName("pl")
	@ObfuscatedGetter(
		longValue = 5382423932192303621L
	)
	static long field819;
	@ObfuscatedName("qy")
	static boolean field842;
	@ObfuscatedName("oo")
	static boolean[] field811;
	@ObfuscatedName("od")
	static boolean[] field704;
	@ObfuscatedName("og")
	static boolean[] field812;
	@ObfuscatedName("pv")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("tn")
	@ObfuscatedGetter(
		intValue = 1943798093
	)
	public static int field623;
	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("px")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("pi")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		intValue = 1273380035
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("pf")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("pb")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("tt")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	static final ApproximateRouteStrategy field878;
	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = -1162506743
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("qu")
	@ObfuscatedGetter(
		intValue = -642989317
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		intValue = -1926454051
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("td")
	static int[] field879;
	@ObfuscatedName("tq")
	static int[] field726;
	@ObfuscatedName("sk")
	@ObfuscatedSignature(
		descriptor = "[Ljn;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("oi")
	@ObfuscatedGetter(
		intValue = 1247880161
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("rw")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("qc")
	@ObfuscatedSignature(
		descriptor = "[Lp;"
	)
	static class3[] field820;
	@ObfuscatedName("rj")
	static boolean[] field850;
	@ObfuscatedName("sq")
	@ObfuscatedGetter(
		intValue = 1954140693
	)
	static int field871;
	@ObfuscatedName("ts")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("tj")
	@ObfuscatedGetter(
		intValue = -1745248339
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("sj")
	@ObfuscatedGetter(
		intValue = 48563957
	)
	static int field713;
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		intValue = -116212155
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("rq")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("rk")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("rm")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "[Lan;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("ru")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("qx")
	@ObfuscatedGetter(
		intValue = -381302747
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("pt")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("qt")
	@ObfuscatedGetter(
		intValue = -163319865
	)
	static int field833;
	@ObfuscatedName("po")
	@ObfuscatedGetter(
		longValue = 2385662544800034671L
	)
	static long field678;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = 1846796199
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("st")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("ra")
	static short field855;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = 454240781
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("sd")
	static short field856;
	@ObfuscatedName("sa")
	static short field707;
	@ObfuscatedName("qn")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("sr")
	static short field862;
	@ObfuscatedName("ss")
	static short field742;
	@ObfuscatedName("sw")
	@ObfuscatedGetter(
		intValue = 295711759
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("se")
	static short field859;
	@ObfuscatedName("sn")
	@ObfuscatedGetter(
		intValue = -64925191
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("qp")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("qm")
	@ObfuscatedSignature(
		descriptor = "[Loh;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("sb")
	@ObfuscatedGetter(
		intValue = -272940265
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("sm")
	@ObfuscatedGetter(
		intValue = 544272473
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = -163290725
	)
	static int field827;
	@ObfuscatedName("sx")
	@ObfuscatedGetter(
		intValue = 1561763743
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("ti")
	@ObfuscatedGetter(
		intValue = -1962349553
	)
	static int field740;
	@ObfuscatedName("sp")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("sf")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("pe")
	static int[] field792;
	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	static NodeDeque field806;
	@ObfuscatedName("pu")
	static int[] field828;
	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	static NodeDeque field688;
	@ObfuscatedName("rg")
	static int[] field698;
	@ObfuscatedName("rp")
	static int[] field601;
	@ObfuscatedName("rn")
	static int[] field853;
	@ObfuscatedName("rh")
	static int[] field854;
	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		descriptor = "[Lm;"
	)
	static class11[] field831;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = 241170089
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("pz")
	@ObfuscatedGetter(
		intValue = -1079120289
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("pc")
	static int[] field821;
	@ObfuscatedName("pd")
	static String field824;
	@ObfuscatedName("so")
	@ObfuscatedSignature(
		descriptor = "Lbz;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lel;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("ae")
	static boolean field867;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 552624005
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 2131247803
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -314365739
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bt")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("ba")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -288951115
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 2088572863
	)
	static int field605;
	@ObfuscatedName("bq")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 284753475
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("ca")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 923749023
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		longValue = -5043335151957037887L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1203452297
	)
	static int field875;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -1304944871
	)
	static int field759;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		longValue = 5446174913048845565L
	)
	static long field851;
	@ObfuscatedName("cj")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("cy")
	@Export("displayFps")
	static boolean displayFps;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1192352679
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -45138847
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1361076413
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -1697851223
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -98255553
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -538636661
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1932075829
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -1162986359
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 1666549933
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 296972281
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -2004840955
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -1450698847
	)
	static int field630;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = 1573978957
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = 1602941259
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = -1017174837
	)
	static int field633;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = -798312209
	)
	static int field634;
	@ObfuscatedName("eu")
	@ObfuscatedGetter(
		intValue = 189453593
	)
	static int field635;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	static class125 field636;
	@ObfuscatedName("ed")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("fy")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "[Ldo;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("fl")
	@ObfuscatedGetter(
		intValue = -1634539077
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("fv")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("fr")
	@ObfuscatedGetter(
		intValue = 1757350889
	)
	static int field645;
	@ObfuscatedName("fw")
	static int[] field646;
	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	static AbstractSocket field686;
	@ObfuscatedName("fc")
	@ObfuscatedGetter(
		intValue = 734890615
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("ft")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("fx")
	@Export("useBufferedSocket")
	static boolean useBufferedSocket;
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("fd")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = 1733290173
	)
	static int field655;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = -1750406597
	)
	static int field656;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = 1065721221
	)
	static int field657;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = 2141323521
	)
	static int field752;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = -906456671
	)
	static int field659;
	@ObfuscatedName("gf")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("gw")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("gm")
	static final int[] field663;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = 1694121313
	)
	static int field799;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = -1122631231
	)
	static int field665;
	@ObfuscatedName("hj")
	@ObfuscatedGetter(
		intValue = -479029123
	)
	static int field666;
	@ObfuscatedName("hq")
	@ObfuscatedGetter(
		intValue = 1599811931
	)
	static int field667;
	@ObfuscatedName("hh")
	@ObfuscatedGetter(
		intValue = 785660529
	)
	static int field668;
	@ObfuscatedName("hw")
	static boolean field669;
	@ObfuscatedName("hk")
	@ObfuscatedGetter(
		intValue = -76493703
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		intValue = 147847129
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("hf")
	@ObfuscatedGetter(
		intValue = 206120351
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("hb")
	@ObfuscatedGetter(
		intValue = -1232313345
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("hy")
	@ObfuscatedGetter(
		intValue = -480575637
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = -1057422407
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("hl")
	@ObfuscatedGetter(
		intValue = -660688745
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("ie")
	@ObfuscatedGetter(
		intValue = 1806653119
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("iu")
	@ObfuscatedGetter(
		intValue = 416588195
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = 793641371
	)
	static int field679;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = -1538078599
	)
	static int field702;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = -1065509781
	)
	static int field681;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = 2029670705
	)
	@Export("selectedItemId")
	static int selectedItemId;
	@ObfuscatedName("iq")
	@ObfuscatedGetter(
		intValue = -1466920965
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = -1126512847
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("iy")
	@ObfuscatedGetter(
		intValue = -320583695
	)
	static int field684;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("if")
	static boolean field685;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = 1428883113
	)
	static int field826;
	@ObfuscatedName("ig")
	static boolean field687;
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = -2048625487
	)
	static int field735;
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		intValue = -952041977
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = 1506427229
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("is")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("iw")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("iv")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("io")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("ib")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("jt")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("jn")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("ja")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("jf")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = -1422454763
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = -1419535011
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = 1293682241
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = -344110517
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("jb")
	@ObfuscatedGetter(
		intValue = -45016791
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = 1968877359
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = 299893465
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("ju")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = -308485147
	)
	static int field708;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = 1815166709
	)
	static int field709;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = 1995553501
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = -1701113733
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = -1899145373
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = -1317847501
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("jq")
	static boolean field714;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = 1705786143
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("ji")
	@ObfuscatedGetter(
		intValue = -1564319989
	)
	static int field716;
	@ObfuscatedName("jd")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "[Lcs;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = 507281317
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = -1786300969
	)
	static int field720;
	@ObfuscatedName("ka")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = -1826358719
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = 1014585
	)
	static int field723;
	@ObfuscatedName("kx")
	static int[] field724;
	@ObfuscatedName("ks")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("ku")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("km")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("kv")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("kn")
	@ObfuscatedGetter(
		intValue = -375939239
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "[[[Lju;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("kk")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("ki")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("le")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = -343514321
	)
	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("la")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = -676387903
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("ll")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("lf")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("lz")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("lg")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("ls")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("lw")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("li")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("lo")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("ld")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("lp")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("ln")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = 351354593
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("lc")
	@ObfuscatedGetter(
		intValue = -47840029
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = 233385425
	)
	static int field753;
	@ObfuscatedName("ms")
	@ObfuscatedGetter(
		intValue = -796964637
	)
	static int field696;
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		intValue = -1862250245
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("ma")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = 1559657187
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = -1973847065
	)
	static int field874;
	@ObfuscatedName("mw")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("mb")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = -1769483355
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = 432404741
	)
	static int field764;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = 943374115
	)
	static int field765;
	@ObfuscatedName("mv")
	@ObfuscatedGetter(
		intValue = 543822711
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = -632422509
	)
	static int field767;
	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = -1222250575
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = 1127684145
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		intValue = 613808213
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		intValue = -828285273
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("nm")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("nh")
	@ObfuscatedGetter(
		intValue = -48358575
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("nn")
	@ObfuscatedGetter(
		intValue = -691888487
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("np")
	static boolean field780;
	@ObfuscatedName("ns")
	@ObfuscatedGetter(
		intValue = -1314877581
	)
	static int field727;
	@ObfuscatedName("ne")
	@ObfuscatedGetter(
		intValue = 290813887
	)
	static int field782;
	@ObfuscatedName("nc")
	static boolean field783;
	@ObfuscatedName("nq")
	@ObfuscatedGetter(
		intValue = -1611922761
	)
	static int field784;
	@ObfuscatedName("ng")
	@ObfuscatedGetter(
		intValue = 719879569
	)
	static int field845;
	@ObfuscatedName("nr")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("nv")
	@ObfuscatedGetter(
		intValue = -1228541083
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("nj")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("nw")
	@ObfuscatedGetter(
		intValue = -544134857
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("nt")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("nz")
	@ObfuscatedGetter(
		intValue = -1782026175
	)
	static int field791;
	@ObfuscatedName("nl")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("ou")
	@ObfuscatedGetter(
		intValue = -1372172675
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("oe")
	static int[] field794;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = -1785174409
	)
	static int field613;
	@ObfuscatedName("ow")
	@ObfuscatedGetter(
		intValue = -507783339
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = -294436167
	)
	static int field797;
	@ObfuscatedName("os")
	@ObfuscatedGetter(
		intValue = 163984103
	)
	static int field798;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(
		intValue = 1092884023
	)
	static int field786;
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = 1340248461
	)
	static int field800;
	@ObfuscatedName("ok")
	@ObfuscatedGetter(
		intValue = 1564656757
	)
	static int field801;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = -1529362963
	)
	static int field802;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = 160490891
	)
	static int field803;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	Buffer field746;
	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	class35 field640;

	static {
		field867 = true; // L: 193
		worldId = 1; // L: 194
		worldProperties = 0; // L: 195
		gameBuild = 0; // L: 197
		isMembersWorld = false; // L: 200
		isLowDetail = false; // L: 201
		clientType = -1; // L: 206
		field605 = -1; // L: 207
		onMobile = false; // L: 208
		gameState = 0; // L: 209
		isLoading = true; // L: 230
		cycle = 0; // L: 231
		mouseLastLastPressedTimeMillis = -1L; // L: 232
		field875 = -1; // L: 234
		field759 = -1; // L: 235
		field851 = -1L; // L: 236
		hadFocus = true; // L: 237
		displayFps = false; // L: 238
		rebootTimer = 0; // L: 239
		hintArrowType = 0; // L: 240
		hintArrowNpcIndex = 0; // L: 241
		hintArrowPlayerIndex = 0; // L: 242
		hintArrowX = 0; // L: 243
		hintArrowY = 0; // L: 244
		hintArrowHeight = 0; // L: 245
		hintArrowSubX = 0; // L: 246
		hintArrowSubY = 0; // L: 247
		playerAttackOption = AttackOption.AttackOption_hidden; // L: 249
		npcAttackOption = AttackOption.AttackOption_hidden; // L: 250
		titleLoadingStage = 0; // L: 252
		js5ConnectState = 0; // L: 255
		field630 = 0; // L: 256
		js5Errors = 0; // L: 278
		loginState = 0; // L: 280
		field633 = 0; // L: 281
		field634 = 0; // L: 282
		field635 = 0; // L: 283
		field636 = class125.field1458; // L: 284
		Login_isUsernameRemembered = false; // L: 293
		secureRandomFuture = new SecureRandomFuture(); // L: 294
		randomDatData = null; // L: 299
		npcs = new NPC[32768]; // L: 303
		npcCount = 0; // L: 304
		npcIndices = new int[32768]; // L: 305
		field645 = 0; // L: 306
		field646 = new int[250]; // L: 307
		packetWriter = new PacketWriter(); // L: 310
		logoutTimer = 0; // L: 312
		hadNetworkError = false; // L: 313
		useBufferedSocket = true; // L: 314
		timer = new Timer(); // L: 315
		fontsMap = new HashMap(); // L: 321
		field655 = 0; // L: 328
		field656 = 1; // L: 329
		field657 = 0; // L: 330
		field752 = 1; // L: 331
		field659 = 0; // L: 332
		collisionMaps = new CollisionMap[4]; // L: 340
		isInInstance = false; // L: 341
		instanceChunkTemplates = new int[4][13][13]; // L: 342
		field663 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 343
		field799 = 0; // L: 346
		field665 = 2301979; // L: 358
		field666 = 5063219; // L: 359
		field667 = 3353893; // L: 360
		field668 = 7759444; // L: 361
		field669 = false; // L: 362
		alternativeScrollbarWidth = 0; // L: 363
		camAngleX = 128; // L: 371
		camAngleY = 0; // L: 372
		camAngleDY = 0; // L: 373
		camAngleDX = 0; // L: 374
		mouseCamClickedX = 0; // L: 375
		mouseCamClickedY = 0; // L: 376
		oculusOrbState = 0; // L: 377
		camFollowHeight = 50; // L: 378
		field679 = 0; // L: 382
		field702 = 0; // L: 383
		field681 = 0; // L: 384
		oculusOrbNormalSpeed = 12; // L: 386
		oculusOrbSlowedSpeed = 6; // L: 387
		field684 = 0; // L: 388
		field685 = false; // L: 389
		field826 = 0; // L: 390
		field687 = false; // L: 391
		field735 = 0; // L: 392
		overheadTextCount = 0; // L: 393
		overheadTextLimit = 50; // L: 394
		overheadTextXs = new int[overheadTextLimit]; // L: 395
		overheadTextYs = new int[overheadTextLimit]; // L: 396
		overheadTextAscents = new int[overheadTextLimit]; // L: 397
		overheadTextXOffsets = new int[overheadTextLimit]; // L: 398
		overheadTextColors = new int[overheadTextLimit]; // L: 399
		overheadTextEffects = new int[overheadTextLimit]; // L: 400
		overheadTextCyclesRemaining = new int[overheadTextLimit]; // L: 401
		overheadText = new String[overheadTextLimit]; // L: 402
		tileLastDrawnActor = new int[104][104]; // L: 403
		viewportDrawCount = 0; // L: 404
		viewportTempX = -1; // L: 405
		viewportTempY = -1; // L: 406
		mouseCrossX = 0; // L: 407
		mouseCrossY = 0; // L: 408
		mouseCrossState = 0; // L: 409
		mouseCrossColor = 0; // L: 410
		showMouseCross = true; // L: 411
		field708 = 0; // L: 413
		field709 = 0; // L: 414
		dragItemSlotSource = 0; // L: 417
		draggedWidgetX = 0; // L: 418
		draggedWidgetY = 0; // L: 419
		dragItemSlotDestination = 0; // L: 420
		field714 = false; // L: 421
		itemDragDuration = 0; // L: 422
		field716 = 0; // L: 423
		showLoadingMessages = true; // L: 425
		players = new Player[2048]; // L: 427
		localPlayerIndex = -1; // L: 429
		field720 = 0; // L: 430
		renderSelf = true; // L: 432
		drawPlayerNames = 0; // L: 437
		field723 = 0; // L: 438
		field724 = new int[1000]; // L: 439
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 441
		playerMenuActions = new String[8]; // L: 442
		playerOptionsPriorities = new boolean[8]; // L: 443
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 444
		combatTargetPlayerIndex = -1; // L: 445
		groundItems = new NodeDeque[4][104][104]; // L: 446
		pendingSpawns = new NodeDeque(); // L: 447
		projectiles = new NodeDeque(); // L: 448
		graphicsObjects = new NodeDeque(); // L: 449
		currentLevels = new int[25]; // L: 450
		levels = new int[25]; // L: 451
		experience = new int[25]; // L: 452
		leftClickOpensMenu = 0; // L: 453
		isMenuOpen = false; // L: 454
		menuOptionsCount = 0; // L: 460
		menuArguments1 = new int[500]; // L: 461
		menuArguments2 = new int[500]; // L: 462
		menuOpcodes = new int[500]; // L: 463
		menuIdentifiers = new int[500]; // L: 464
		menuActions = new String[500]; // L: 465
		menuTargets = new String[500]; // L: 466
		menuShiftClick = new boolean[500]; // L: 467
		followerOpsLowPriority = false; // L: 468
		shiftClickDrop = false; // L: 470
		tapToDrop = false; // L: 471
		showMouseOverText = true; // L: 472
		viewportX = -1; // L: 473
		viewportY = -1; // L: 474
		field753 = 0; // L: 478
		field696 = 50; // L: 479
		isItemSelected = 0; // L: 480
		selectedItemName = null; // L: 484
		isSpellSelected = false; // L: 485
		selectedSpellChildIndex = -1; // L: 487
		field874 = -1; // L: 488
		selectedSpellActionName = null; // L: 490
		selectedSpellName = null; // L: 491
		rootInterface = -1; // L: 492
		interfaceParents = new NodeHashTable(8); // L: 493
		field764 = 0; // L: 498
		field765 = -1; // L: 499
		chatEffects = 0; // L: 500
		field767 = 0; // L: 501
		meslayerContinueWidget = null; // L: 502
		runEnergy = 0; // L: 503
		weight = 0; // L: 504
		staffModLevel = 0; // L: 505
		followerIndex = -1; // L: 506
		playerMod = false; // L: 507
		viewportWidget = null; // L: 508
		clickedWidget = null; // L: 509
		clickedWidgetParent = null; // L: 510
		widgetClickX = 0; // L: 511
		widgetClickY = 0; // L: 512
		draggedOnWidget = null; // L: 513
		field780 = false; // L: 514
		field727 = -1; // L: 515
		field782 = -1; // L: 516
		field783 = false; // L: 517
		field784 = -1; // L: 518
		field845 = -1; // L: 519
		isDraggingWidget = false; // L: 520
		cycleCntr = 1; // L: 525
		changedVarps = new int[32]; // L: 528
		changedVarpCount = 0; // L: 529
		changedItemContainers = new int[32]; // L: 530
		field791 = 0; // L: 531
		changedSkills = new int[32]; // L: 532
		changedSkillsCount = 0; // L: 533
		field794 = new int[32]; // L: 534
		field613 = 0; // L: 535
		chatCycle = 0; // L: 536
		field797 = 0; // L: 537
		field798 = 0; // L: 538
		field786 = 0; // L: 539
		field800 = 0; // L: 540
		field801 = 0; // L: 541
		field802 = 0; // L: 542
		field803 = 0; // L: 543
		mouseWheelRotation = 0; // L: 548
		scriptEvents = new NodeDeque(); // L: 549
		field806 = new NodeDeque(); // L: 550
		field688 = new NodeDeque(); // L: 551
		widgetFlags = new NodeHashTable(512); // L: 552
		rootWidgetCount = 0; // L: 554
		field810 = -2; // L: 555
		field811 = new boolean[100]; // L: 556
		field812 = new boolean[100]; // L: 557
		field704 = new boolean[100]; // L: 558
		rootWidgetXs = new int[100]; // L: 559
		rootWidgetYs = new int[100]; // L: 560
		rootWidgetWidths = new int[100]; // L: 561
		rootWidgetHeights = new int[100]; // L: 562
		gameDrawingMode = 0; // L: 563
		field819 = 0L; // L: 564
		isResizable = true; // L: 565
		field821 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 572
		publicChatMode = 0; // L: 573
		tradeChatMode = 0; // L: 575
		field824 = ""; // L: 576
		crossWorldMessageIds = new long[100]; // L: 578
		crossWorldMessageIdsIndex = 0; // L: 579
		field827 = 0; // L: 581
		field828 = new int[128]; // L: 582
		field792 = new int[128]; // L: 583
		field678 = -1L; // L: 584
		field831 = new class11[1]; // L: 588
		field820 = new class3[1]; // L: 590
		field833 = -1; // L: 591
		mapIconCount = 0; // L: 592
		mapIconXs = new int[1000]; // L: 593
		mapIconYs = new int[1000]; // L: 594
		mapIcons = new SpritePixels[1000]; // L: 595
		destinationX = 0; // L: 596
		destinationY = 0; // L: 597
		minimapState = 0; // L: 604
		currentTrackGroupId = -1; // L: 605
		field842 = false; // L: 606
		soundEffectCount = 0; // L: 612
		soundEffectIds = new int[50]; // L: 613
		queuedSoundEffectLoops = new int[50]; // L: 614
		queuedSoundEffectDelays = new int[50]; // L: 615
		soundLocations = new int[50]; // L: 616
		soundEffects = new SoundEffect[50]; // L: 617
		isCameraLocked = false; // L: 619
		field850 = new boolean[5]; // L: 631
		field601 = new int[5]; // L: 632
		field698 = new int[5]; // L: 633
		field853 = new int[5]; // L: 634
		field854 = new int[5]; // L: 635
		field855 = 256; // L: 636
		field856 = 205; // L: 637
		zoomHeight = 256; // L: 638
		zoomWidth = 320; // L: 639
		field859 = 1; // L: 640
		field742 = 32767; // L: 641
		field707 = 1; // L: 642
		field862 = 32767; // L: 643
		viewportOffsetX = 0; // L: 644
		viewportOffsetY = 0; // L: 645
		viewportWidth = 0; // L: 646
		viewportHeight = 0; // L: 647
		viewportZoom = 0; // L: 648
		playerAppearance = new PlayerComposition(); // L: 650
		field871 = -1; // L: 651
		field713 = -1; // L: 652
		platformInfoProvider = new DesktopPlatformInfoProvider(); // L: 654
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 656
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 659
		field623 = -1; // L: 666
		archiveLoaders = new ArrayList(10); // L: 667
		archiveLoadersDone = 0; // L: 668
		field740 = 0; // L: 669
		field878 = new ApproximateRouteStrategy(); // L: 678
		field879 = new int[50]; // L: 679
		field726 = new int[50]; // L: 680
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1835470787"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field819 = ObjectSound.currentTimeMillis() + 500L; // L: 3621
		this.resizeJS(); // L: 3622
		if (rootInterface != -1) { // L: 3623
			this.resizeRoot(true);
		}

	} // L: 3624

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-473168642"
	)
	@Export("setUp")
	protected final void setUp() {
		class0.method12(new int[]{20, 260, 10000}, new int[]{1000, 100, 500}); // L: 798
		AttackOption.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 799
		Calendar.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 800
		class5.currentPort = AttackOption.worldPort; // L: 801
		PlayerComposition.field2601 = class223.field2609; // L: 802
		ChatChannel.field1086 = class223.field2608; // L: 803
		WorldMapSection1.field1753 = class223.field2611; // L: 804
		PlayerComposition.field2596 = class223.field2610; // L: 805
		class32.urlRequester = new UrlRequester(); // L: 806
		this.setUpKeyboard(); // L: 807
		this.setUpMouse(); // L: 808
		class9.mouseWheel = this.mouseWheel(); // L: 809
		FriendLoginUpdate.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 810
		AccessFile var2 = null; // L: 813
		ClientPreferences var3 = new ClientPreferences(); // L: 814

		try {
			var2 = class15.getPreferencesFile("", class27.field208.name, false); // L: 816
			byte[] var4 = new byte[(int)var2.length()]; // L: 817

			int var6;
			for (int var5 = 0; var5 < var4.length; var5 += var6) { // L: 818 819 822
				var6 = var2.read(var4, var5, var4.length - var5); // L: 820
				if (var6 == -1) { // L: 821
					throw new IOException();
				}
			}

			var3 = new ClientPreferences(new Buffer(var4)); // L: 824
		} catch (Exception var8) { // L: 826
		}

		try {
			if (var2 != null) { // L: 828
				var2.close();
			}
		} catch (Exception var7) { // L: 830
		}

		Login.clientPreferences = var3; // L: 833
		this.setUpClipboard(); // L: 834
		String var9 = DevicePcmPlayerProvider.null_string; // L: 836
		class44.applet = this; // L: 838
		if (var9 != null) { // L: 839
			class44.field294 = var9;
		}

		if (gameBuild != 0) { // L: 841
			displayFps = true;
		}

		Tile.setWindowedMode(Login.clientPreferences.windowMode); // L: 842
		class13.friendSystem = new FriendSystem(AbstractUserComparator.loginType); // L: 843
	} // L: 844

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-102"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 847
		this.doCycleJs5(); // L: 848

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 852
				var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast(); // L: 853
			} // L: 854

			if (var1 == null) { // L: 855
				int var4;
				try {
					if (class210.musicPlayerStatus == 1) { // L: 861
						var4 = class210.midiPcmStream.method4018(); // L: 862
						if (var4 > 0 && class210.midiPcmStream.isReady()) { // L: 863
							var4 -= class1.pcmSampleLength; // L: 864
							if (var4 < 0) { // L: 865
								var4 = 0;
							}

							class210.midiPcmStream.setPcmStreamVolume(var4); // L: 866
						} else {
							class210.midiPcmStream.clear(); // L: 869
							class210.midiPcmStream.removeAll(); // L: 870
							if (class210.musicTrackArchive != null) { // L: 871
								class210.musicPlayerStatus = 2;
							} else {
								class210.musicPlayerStatus = 0; // L: 872
							}

							WallDecoration.musicTrack = null; // L: 873
							class210.soundCache = null; // L: 874
						}
					}
				} catch (Exception var6) { // L: 877
					var6.printStackTrace(); // L: 878
					class210.midiPcmStream.clear(); // L: 879
					class210.musicPlayerStatus = 0; // L: 880
					WallDecoration.musicTrack = null; // L: 881
					class210.soundCache = null; // L: 882
					class210.musicTrackArchive = null; // L: 883
				}

				BoundaryObject.playPcmPlayers(); // L: 886
				WorldMapIcon_1.method2699(); // L: 887
				PlayerType.method4414(); // L: 888
				if (class9.mouseWheel != null) { // L: 889
					var4 = class9.mouseWheel.useRotation(); // L: 890
					mouseWheelRotation = var4; // L: 891
				}

				if (gameState == 0) { // L: 893
					class34.load(); // L: 894
					Decimator.clock.mark(); // L: 896

					for (var4 = 0; var4 < 32; ++var4) { // L: 897
						GameEngine.graphicsTickTimes[var4] = 0L;
					}

					for (var4 = 0; var4 < 32; ++var4) { // L: 898
						GameEngine.clientTickTimes[var4] = 0L;
					}

					class232.gameCyclesToDo = 0; // L: 899
				} else if (gameState == 5) { // L: 902
					UserComparator7.doCycleTitle(this); // L: 903
					class34.load(); // L: 904
					Decimator.clock.mark(); // L: 906

					for (var4 = 0; var4 < 32; ++var4) { // L: 907
						GameEngine.graphicsTickTimes[var4] = 0L;
					}

					for (var4 = 0; var4 < 32; ++var4) { // L: 908
						GameEngine.clientTickTimes[var4] = 0L;
					}

					class232.gameCyclesToDo = 0; // L: 909
				} else if (gameState != 10 && gameState != 11) { // L: 912
					if (gameState == 20) { // L: 913
						UserComparator7.doCycleTitle(this); // L: 914
						this.doCycleLoggedOut(); // L: 915
					} else if (gameState == 25) { // L: 917
						Varcs.method2340();
					}
				} else {
					UserComparator7.doCycleTitle(this);
				}

				if (gameState == 30) { // L: 918
					this.doCycleLoggedIn();
				} else if (gameState == 40 || gameState == 45) { // L: 919
					this.doCycleLoggedOut();
				}

				return; // L: 920
			}

			var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false); // L: 856
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-278821415"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2;
		label172: {
			try {
				if (class210.musicPlayerStatus == 2) { // L: 926
					if (WallDecoration.musicTrack == null) { // L: 927
						WallDecoration.musicTrack = MusicTrack.readTrack(class210.musicTrackArchive, FaceNormal.musicTrackGroupId, WorldMapID.musicTrackFileId); // L: 928
						if (WallDecoration.musicTrack == null) { // L: 929
							var2 = false; // L: 930
							break label172;
						}
					}

					if (class210.soundCache == null) { // L: 934
						class210.soundCache = new SoundCache(class210.soundEffectsArchive, class372.musicSamplesArchive);
					}

					if (class210.midiPcmStream.loadMusicTrack(WallDecoration.musicTrack, class210.musicPatchesArchive, class210.soundCache, 22050)) { // L: 935
						class210.midiPcmStream.clearAll(); // L: 936
						class210.midiPcmStream.setPcmStreamVolume(class375.musicTrackVolume); // L: 937
						class210.midiPcmStream.setMusicTrack(WallDecoration.musicTrack, class210.musicTrackBoolean); // L: 938
						class210.musicPlayerStatus = 0; // L: 939
						WallDecoration.musicTrack = null; // L: 940
						class210.soundCache = null; // L: 941
						class210.musicTrackArchive = null; // L: 942
						var2 = true; // L: 943
						break label172;
					}
				}
			} catch (Exception var6) { // L: 948
				var6.printStackTrace(); // L: 949
				class210.midiPcmStream.clear(); // L: 950
				class210.musicPlayerStatus = 0; // L: 951
				WallDecoration.musicTrack = null; // L: 952
				class210.soundCache = null; // L: 953
				class210.musicTrackArchive = null; // L: 954
			}

			var2 = false; // L: 956
		}

		if (var2 && field842 && ApproximateRouteStrategy.pcmPlayer0 != null) { // L: 959 960
			ApproximateRouteStrategy.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && field819 != 0L && ObjectSound.currentTimeMillis() > field819) { // L: 962 963
			Tile.setWindowedMode(WorldMapScaleHandler.getWindowedMode()); // L: 964
		}

		int var4;
		if (var1) { // L: 967
			for (var4 = 0; var4 < 100; ++var4) { // L: 968
				field811[var4] = true;
			}
		}

		if (gameState == 0) { // L: 970
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 971
			class32.drawTitle(class368.fontBold12, class0.fontPlain11, class14.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 972
			if (gameState == 20) { // L: 973
				class32.drawTitle(class368.fontBold12, class0.fontPlain11, class14.fontPlain12);
			} else if (gameState == 25) { // L: 974
				if (field659 == 1) { // L: 975
					if (field655 > field656) { // L: 976
						field656 = field655;
					}

					var4 = (field656 * 50 - field655 * 50) / field656; // L: 977
					class2.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false); // L: 978
				} else if (field659 == 2) { // L: 980
					if (field657 > field752) { // L: 981
						field752 = field657;
					}

					var4 = (field752 * 50 - field657 * 50) / field752 + 50; // L: 982
					class2.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false); // L: 983
				} else {
					class2.drawLoadingMessage("Loading - please wait.", false); // L: 985
				}
			} else if (gameState == 30) { // L: 987
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 988
				class2.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 989
				class2.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class32.drawTitle(class368.fontBold12, class0.fontPlain11, class14.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) { // L: 990
			for (var4 = 0; var4 < rootWidgetCount; ++var4) { // L: 991
				if (field812[var4]) { // L: 992
					GameEngine.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]); // L: 993
					field812[var4] = false; // L: 994
				}
			}
		} else if (gameState > 0) { // L: 998
			GameEngine.rasterProvider.drawFull(0, 0); // L: 999

			for (var4 = 0; var4 < rootWidgetCount; ++var4) { // L: 1000
				field812[var4] = false;
			}
		}

	} // L: 1002

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "74"
	)
	@Export("kill0")
	protected final void kill0() {
		if (TextureProvider.varcs.hasUnwrittenChanges()) { // L: 1005
			TextureProvider.varcs.write();
		}

		if (Language.mouseRecorder != null) { // L: 1006
			Language.mouseRecorder.isRunning = false;
		}

		Language.mouseRecorder = null; // L: 1007
		packetWriter.close(); // L: 1008
		if (KeyHandler.KeyHandler_instance != null) { // L: 1010
			synchronized(KeyHandler.KeyHandler_instance) { // L: 1011
				KeyHandler.KeyHandler_instance = null; // L: 1012
			} // L: 1013
		}

		class139.method2669(); // L: 1016
		class9.mouseWheel = null; // L: 1017
		if (ApproximateRouteStrategy.pcmPlayer0 != null) { // L: 1018
			ApproximateRouteStrategy.pcmPlayer0.shutdown();
		}

		if (class43.pcmPlayer1 != null) { // L: 1019
			class43.pcmPlayer1.shutdown();
		}

		Skills.method4377(); // L: 1020
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 1022
			if (ArchiveDiskActionHandler.field3239 != 0) { // L: 1023
				ArchiveDiskActionHandler.field3239 = 1; // L: 1024

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait(); // L: 1026
				} catch (InterruptedException var4) { // L: 1028
				}
			}
		}

		if (class32.urlRequester != null) { // L: 1032
			class32.urlRequester.close(); // L: 1033
			class32.urlRequester = null; // L: 1034
		}

		class19.method284(); // L: 1036
	} // L: 1037

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1242495393"
	)
	protected final void vmethod1219() {
	} // L: 687

	public final void init() {
		try {
			if (this.checkHost()) { // L: 693
				for (int var1 = 0; var1 <= 20; ++var1) { // L: 694
					String var2 = this.getParameter(Integer.toString(var1)); // L: 695
					if (var2 != null) { // L: 696
						switch(var1) { // L: 697
						case 1:
							useBufferedSocket = Integer.parseInt(var2) != 0; // L: 770
						case 2:
						case 11:
						case 13:
						case 16:
						default:
							break;
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 700
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 701
							}
							break;
						case 4:
							if (clientType == -1) { // L: 731
								clientType = Integer.parseInt(var2); // L: 732
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 726
							break; // L: 727
						case 6:
							class35.clientLanguage = Language.method4691(Integer.parseInt(var2)); // L: 760
							break; // L: 761
						case 7:
							FriendsList.field3812 = ItemLayer.method3270(Integer.parseInt(var2)); // L: 721
							break; // L: 722
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 738
							}
							break;
						case 9:
							class0.field4 = var2; // L: 765
							break; // L: 766
						case 10:
							StudioGame[] var3 = new StudioGame[]{StudioGame.game3, StudioGame.game4, StudioGame.game5, StudioGame.stellardawn, StudioGame.oldscape, StudioGame.runescape}; // L: 746
							class27.field208 = (StudioGame)UserComparator8.findEnumerated(var3, Integer.parseInt(var2)); // L: 748
							if (class27.field208 == StudioGame.oldscape) { // L: 749
								AbstractUserComparator.loginType = LoginType.oldscape;
							} else {
								AbstractUserComparator.loginType = LoginType.field4086; // L: 750
							}
							break;
						case 12:
							worldId = Integer.parseInt(var2); // L: 755
							break; // L: 756
						case 14:
							FaceNormal.field2002 = Integer.parseInt(var2); // L: 716
							break; // L: 717
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 711
							break; // L: 712
						case 17:
							class244.field2909 = var2; // L: 706
						}
					}
				}

				Scene.Scene_isLowDetail = false; // L: 777
				isLowDetail = false; // L: 778
				MusicPatch.worldHost = this.getCodeBase().getHost(); // L: 780
				String var4 = FriendsList.field3812.name; // L: 781
				byte var5 = 0; // L: 782

				try {
					CollisionMap.findAndLoadCache("oldschool", var4, var5, 21); // L: 784
				} catch (Exception var6) { // L: 786
					class223.RunException_sendStackTrace((String)null, var6); // L: 787
				}

				class10.client = this; // L: 789
				RunException.clientType = clientType; // L: 790
				if (field605 == -1) { // L: 791
					field605 = 0; // L: 792
				}

				this.startThread(765, 503, 195); // L: 794
			}
		} catch (RuntimeException var7) {
			throw UserComparator10.newRunException(var7, "client.init(" + ')');
		}
	} // L: 795

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-733084897"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1096
			boolean var1 = WorldMapCacheName.method3189(); // L: 1097
			if (!var1) { // L: 1098
				this.doCycleJs5Connect();
			}

		}
	} // L: 1099

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1791659166"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) { // L: 1102
			this.error("js5crc"); // L: 1103
			gameState = 1000; // L: 1104
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) { // L: 1107
				if (gameState <= 5) { // L: 1108
					this.error("js5io"); // L: 1109
					gameState = 1000; // L: 1110
					return; // L: 1111
				}

				field630 = 3000; // L: 1114
				NetCache.NetCache_ioExceptions = 3; // L: 1115
			}

			if (--field630 + 1 <= 0) { // L: 1118
				try {
					if (js5ConnectState == 0) { // L: 1120
						Message.js5SocketTask = GameEngine.taskHandler.newSocketTask(MusicPatch.worldHost, class5.currentPort); // L: 1121
						++js5ConnectState; // L: 1122
					}

					if (js5ConnectState == 1) { // L: 1124
						if (Message.js5SocketTask.status == 2) { // L: 1125
							this.js5Error(-1); // L: 1126
							return; // L: 1127
						}

						if (Message.js5SocketTask.status == 1) { // L: 1129
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 1131
						if (useBufferedSocket) { // L: 1132
							KeyHandler.js5Socket = ServerPacket.method3901((Socket)Message.js5SocketTask.result, 40000, 5000); // L: 1133
						} else {
							KeyHandler.js5Socket = new NetSocket((Socket)Message.js5SocketTask.result, GameEngine.taskHandler, 5000); // L: 1136
						}

						Buffer var1 = new Buffer(5); // L: 1138
						var1.writeByte(15); // L: 1139
						var1.writeInt(195); // L: 1140
						KeyHandler.js5Socket.write(var1.array, 0, 5); // L: 1141
						++js5ConnectState; // L: 1142
						PacketBufferNode.field2348 = ObjectSound.currentTimeMillis(); // L: 1143
					}

					if (js5ConnectState == 3) { // L: 1145
						if (KeyHandler.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) { // L: 1146
							int var5 = KeyHandler.js5Socket.readUnsignedByte(); // L: 1147
							if (var5 != 0) { // L: 1148
								this.js5Error(var5); // L: 1149
								return; // L: 1150
							}

							++js5ConnectState; // L: 1152
						} else if (ObjectSound.currentTimeMillis() - PacketBufferNode.field2348 > 30000L) { // L: 1155
							this.js5Error(-2); // L: 1156
							return; // L: 1157
						}
					}

					if (js5ConnectState == 4) { // L: 1161
						AbstractSocket var10 = KeyHandler.js5Socket; // L: 1162
						boolean var2 = gameState > 20; // L: 1163
						if (class303.NetCache_socket != null) { // L: 1165
							try {
								class303.NetCache_socket.close(); // L: 1167
							} catch (Exception var8) { // L: 1169
							}

							class303.NetCache_socket = null; // L: 1170
						}

						class303.NetCache_socket = var10; // L: 1172
						class246.method4409(var2); // L: 1173
						NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1174
						class208.NetCache_currentResponse = null; // L: 1175
						InterfaceParent.NetCache_responseArchiveBuffer = null; // L: 1176
						NetCache.field3295 = 0; // L: 1177

						while (true) {
							NetFileRequest var3 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first(); // L: 1179
							if (var3 == null) { // L: 1180
								while (true) {
									var3 = (NetFileRequest)NetCache.NetCache_pendingResponses.first(); // L: 1186
									if (var3 == null) { // L: 1187
										if (NetCache.field3287 != 0) { // L: 1193
											try {
												Buffer var11 = new Buffer(4); // L: 1195
												var11.writeByte(4); // L: 1196
												var11.writeByte(NetCache.field3287); // L: 1197
												var11.writeShort(0); // L: 1198
												class303.NetCache_socket.write(var11.array, 0, 4); // L: 1199
											} catch (IOException var7) {
												try {
													class303.NetCache_socket.close(); // L: 1203
												} catch (Exception var6) { // L: 1205
												}

												++NetCache.NetCache_ioExceptions; // L: 1206
												class303.NetCache_socket = null; // L: 1207
											}
										}

										NetCache.NetCache_loadTime = 0; // L: 1210
										NetCache.field3284 = ObjectSound.currentTimeMillis(); // L: 1211
										Message.js5SocketTask = null; // L: 1213
										KeyHandler.js5Socket = null; // L: 1214
										js5ConnectState = 0; // L: 1215
										js5Errors = 0; // L: 1216
										return; // L: 1222
									}

									NetCache.NetCache_pendingWritesQueue.addLast(var3); // L: 1188
									NetCache.NetCache_pendingWrites.put(var3, var3.key); // L: 1189
									++NetCache.NetCache_pendingWritesCount; // L: 1190
									--NetCache.NetCache_pendingResponsesCount; // L: 1191
								}
							}

							NetCache.NetCache_pendingPriorityWrites.put(var3, var3.key); // L: 1181
							++NetCache.NetCache_pendingPriorityWritesCount; // L: 1182
							--NetCache.NetCache_pendingPriorityResponsesCount; // L: 1183
						}
					}
				} catch (IOException var9) { // L: 1219
					this.js5Error(-3); // L: 1220
				}

			}
		}
	} // L: 1105

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1994468046"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		Message.js5SocketTask = null; // L: 1225
		KeyHandler.js5Socket = null; // L: 1226
		js5ConnectState = 0; // L: 1227
		if (class5.currentPort == AttackOption.worldPort) { // L: 1228
			class5.currentPort = Calendar.js5Port;
		} else {
			class5.currentPort = AttackOption.worldPort; // L: 1229
		}

		++js5Errors; // L: 1230
		if (js5Errors < 2 || var1 != 7 && var1 != 9) { // L: 1231
			if (js5Errors >= 2 && var1 == 6) { // L: 1238
				this.error("js5connect_outofdate"); // L: 1239
				gameState = 1000; // L: 1240
			} else if (js5Errors >= 4) { // L: 1242
				if (gameState <= 5) { // L: 1243
					this.error("js5connect"); // L: 1244
					gameState = 1000; // L: 1245
				} else {
					field630 = 3000; // L: 1247
				}
			}
		} else if (gameState <= 5) { // L: 1232
			this.error("js5connect_full"); // L: 1233
			gameState = 1000; // L: 1234
		} else {
			field630 = 3000; // L: 1236
		}

	} // L: 1249

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "36"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket(); // L: 1680
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 1681

		try {
			if (loginState == 0) { // L: 1683
				if (Canvas.secureRandom == null && (secureRandomFuture.isDone() || field633 > 250)) { // L: 1684
					Canvas.secureRandom = secureRandomFuture.get(); // L: 1685
					secureRandomFuture.shutdown(); // L: 1686
					secureRandomFuture = null; // L: 1687
				}

				if (Canvas.secureRandom != null) { // L: 1689
					if (var1 != null) { // L: 1690
						((AbstractSocket)var1).close(); // L: 1691
						var1 = null; // L: 1692
					}

					socketTask = null; // L: 1694
					hadNetworkError = false; // L: 1695
					field633 = 0; // L: 1696
					loginState = 1; // L: 1697
				}
			}

			if (loginState == 1) { // L: 1700
				if (socketTask == null) { // L: 1701
					socketTask = GameEngine.taskHandler.newSocketTask(MusicPatch.worldHost, class5.currentPort); // L: 1702
				}

				if (socketTask.status == 2) { // L: 1704
					throw new IOException();
				}

				if (socketTask.status == 1) { // L: 1705
					if (useBufferedSocket) { // L: 1706
						var1 = ServerPacket.method3901((Socket)socketTask.result, 40000, 5000); // L: 1707
					} else {
						var1 = new NetSocket((Socket)socketTask.result, GameEngine.taskHandler, 5000); // L: 1710
					}

					packetWriter.setSocket((AbstractSocket)var1); // L: 1712
					socketTask = null; // L: 1713
					loginState = 2; // L: 1714
				}
			}

			PacketBufferNode var3;
			if (loginState == 2) { // L: 1717
				packetWriter.clearBuffer(); // L: 1718
				var3 = class6.method98(); // L: 1719
				var3.packetBuffer.writeByte(LoginPacket.field2456.id); // L: 1720
				packetWriter.addNode(var3); // L: 1721
				packetWriter.flush(); // L: 1722
				var2.offset = 0; // L: 1723
				loginState = 3; // L: 1724
			}

			int var4;
			boolean var12;
			if (loginState == 3) { // L: 1726
				if (ApproximateRouteStrategy.pcmPlayer0 != null) { // L: 1727
					ApproximateRouteStrategy.pcmPlayer0.method807();
				}

				if (class43.pcmPlayer1 != null) { // L: 1728
					class43.pcmPlayer1.method807();
				}

				var12 = true; // L: 1729
				if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) { // L: 1730 1731
					var12 = false;
				}

				if (var12) { // L: 1733
					var4 = ((AbstractSocket)var1).readUnsignedByte(); // L: 1734
					if (ApproximateRouteStrategy.pcmPlayer0 != null) { // L: 1735
						ApproximateRouteStrategy.pcmPlayer0.method807();
					}

					if (class43.pcmPlayer1 != null) { // L: 1736
						class43.pcmPlayer1.method807();
					}

					if (var4 != 0) { // L: 1737
						Messages.getLoginError(var4); // L: 1738
						return; // L: 1739
					}

					var2.offset = 0; // L: 1741
					loginState = 4; // L: 1742
				}
			}

			int var34;
			if (loginState == 4) { // L: 1745
				if (var2.offset < 8) { // L: 1746
					var34 = ((AbstractSocket)var1).available(); // L: 1747
					if (var34 > 8 - var2.offset) { // L: 1748
						var34 = 8 - var2.offset;
					}

					if (var34 > 0) { // L: 1749
						((AbstractSocket)var1).read(var2.array, var2.offset, var34); // L: 1750
						var2.offset += var34; // L: 1751
					}
				}

				if (var2.offset == 8) { // L: 1754
					var2.offset = 0; // L: 1755
					HealthBarUpdate.field1277 = var2.readLong(); // L: 1756
					loginState = 5; // L: 1757
				}
			}

			int var7;
			int var9;
			int var14;
			if (loginState == 5) { // L: 1760
				packetWriter.packetBuffer.offset = 0; // L: 1761
				packetWriter.clearBuffer(); // L: 1762
				PacketBuffer var23 = new PacketBuffer(500); // L: 1763
				int[] var13 = new int[]{Canvas.secureRandom.nextInt(), Canvas.secureRandom.nextInt(), Canvas.secureRandom.nextInt(), Canvas.secureRandom.nextInt()}; // L: 1764 1765 1766 1767 1768
				var23.offset = 0; // L: 1769
				var23.writeByte(1); // L: 1770
				var23.writeInt(var13[0]); // L: 1771
				var23.writeInt(var13[1]); // L: 1772
				var23.writeInt(var13[2]); // L: 1773
				var23.writeInt(var13[3]); // L: 1774
				var23.writeLong(HealthBarUpdate.field1277); // L: 1775
				int var11;
				if (gameState == 40) { // L: 1776
					var23.writeInt(class231.field2803[0]); // L: 1777
					var23.writeInt(class231.field2803[1]); // L: 1778
					var23.writeInt(class231.field2803[2]); // L: 1779
					var23.writeInt(class231.field2803[3]); // L: 1780
				} else {
					var23.writeByte(field636.rsOrdinal()); // L: 1783
					switch(field636.field1460) { // L: 1784
					case 0:
					case 3:
						var23.writeMedium(class139.field1560); // L: 1793
						++var23.offset; // L: 1794
						break; // L: 1795
					case 1:
						LinkedHashMap var6 = Login.clientPreferences.parameters; // L: 1800
						String var8 = Login.Login_username; // L: 1802
						var9 = var8.length(); // L: 1804
						int var10 = 0; // L: 1805

						for (var11 = 0; var11 < var9; ++var11) { // L: 1806
							var10 = (var10 << 5) - var10 + var8.charAt(var11);
						}

						var23.writeInt((Integer)var6.get(var10)); // L: 1809
						break;
					case 2:
						var23.offset += 4; // L: 1787
					}

					var23.writeByte(class385.field4204.rsOrdinal()); // L: 1813
					var23.writeStringCp1252NullTerminated(Login.Login_password); // L: 1814
				}

				var23.encryptRsa(class82.field983, class82.field982); // L: 1816
				class231.field2803 = var13; // L: 1817
				PacketBufferNode var5 = class6.method98(); // L: 1818
				var5.packetBuffer.offset = 0; // L: 1819
				if (gameState == 40) { // L: 1820
					var5.packetBuffer.writeByte(LoginPacket.field2452.id); // L: 1821
				} else {
					var5.packetBuffer.writeByte(LoginPacket.field2451.id); // L: 1824
				}

				var5.packetBuffer.writeShort(0); // L: 1826
				var14 = var5.packetBuffer.offset; // L: 1827
				var5.packetBuffer.writeInt(195); // L: 1828
				var5.packetBuffer.writeInt(1); // L: 1829
				var5.packetBuffer.writeByte(clientType); // L: 1830
				var5.packetBuffer.writeByte(field605); // L: 1831
				var5.packetBuffer.writeBytes(var23.array, 0, var23.offset); // L: 1832
				var7 = var5.packetBuffer.offset; // L: 1833
				var5.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 1834
				var5.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 1835
				var5.packetBuffer.writeShort(InterfaceParent.canvasWidth); // L: 1836
				var5.packetBuffer.writeShort(GameEngine.canvasHeight); // L: 1837
				PacketBuffer var32 = var5.packetBuffer; // L: 1838
				if (randomDatData != null) { // L: 1840
					var32.writeBytes(randomDatData, 0, randomDatData.length); // L: 1841
				} else {
					byte[] var15 = Tile.method3356(); // L: 1844
					var32.writeBytes(var15, 0, var15.length); // L: 1845
				}

				var5.packetBuffer.writeStringCp1252NullTerminated(class0.field4); // L: 1847
				var5.packetBuffer.writeInt(FaceNormal.field2002); // L: 1848
				Buffer var37 = new Buffer(UserComparator8.platformInfo.size()); // L: 1849
				UserComparator8.platformInfo.write(var37); // L: 1850
				var5.packetBuffer.writeBytes(var37.array, 0, var37.array.length); // L: 1851
				var5.packetBuffer.writeByte(clientType); // L: 1852
				var5.packetBuffer.writeInt(0); // L: 1853
				var5.packetBuffer.method6754(MilliClock.archive13.hash); // L: 1854
				var5.packetBuffer.method6625(NPCComposition.archive20.hash); // L: 1855
				var5.packetBuffer.writeInt(class246.archive18.hash); // L: 1856
				var5.packetBuffer.writeInt(class373.archive10.hash); // L: 1857
				var5.packetBuffer.method6754(class8.archive6.hash); // L: 1858
				var5.packetBuffer.method6624(AbstractWorldMapData.archive9.hash); // L: 1859
				var5.packetBuffer.method6625(SoundSystem.archive8.hash); // L: 1860
				var5.packetBuffer.method6754(class12.archive7.hash); // L: 1861
				var5.packetBuffer.method6754(class283.archive19.hash); // L: 1862
				var5.packetBuffer.method6754(0); // L: 1863
				var5.packetBuffer.method6624(class10.archive11.hash); // L: 1864
				var5.packetBuffer.method6624(class0.archive17.hash); // L: 1865
				var5.packetBuffer.method6754(Buddy.archive15.hash); // L: 1866
				var5.packetBuffer.method6624(BuddyRankComparator.archive12.hash); // L: 1867
				var5.packetBuffer.writeInt(class367.archive1.hash); // L: 1868
				var5.packetBuffer.method6624(WorldMapSection0.archive14.hash); // L: 1869
				var5.packetBuffer.method6754(class5.archive3.hash); // L: 1870
				var5.packetBuffer.method6624(class157.archive5.hash); // L: 1871
				var5.packetBuffer.method6625(ItemContainer.archive4.hash); // L: 1872
				var5.packetBuffer.writeInt(TriBool.archive0.hash); // L: 1873
				var5.packetBuffer.method6625(class235.archive2.hash); // L: 1874
				var5.packetBuffer.xteaEncrypt(var13, var7, var5.packetBuffer.offset); // L: 1875
				var5.packetBuffer.writeLengthShort(var5.packetBuffer.offset - var14); // L: 1876
				packetWriter.addNode(var5); // L: 1877
				packetWriter.flush(); // L: 1878
				packetWriter.isaacCipher = new IsaacCipher(var13); // L: 1879
				int[] var16 = new int[4]; // L: 1880

				for (var11 = 0; var11 < 4; ++var11) { // L: 1881
					var16[var11] = var13[var11] + 50;
				}

				var2.newIsaacCipher(var16); // L: 1882
				loginState = 6; // L: 1883
			}

			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) { // L: 1885 1886
				var34 = ((AbstractSocket)var1).readUnsignedByte(); // L: 1887
				if (var34 == 21 && gameState == 20) { // L: 1888
					loginState = 12; // L: 1889
				} else if (var34 == 2) { // L: 1891
					loginState = 14; // L: 1892
				} else if (var34 == 15 && gameState == 40) { // L: 1894
					packetWriter.serverPacketLength = -1; // L: 1895
					loginState = 19; // L: 1896
				} else if (var34 == 64) { // L: 1898
					loginState = 10; // L: 1899
				} else if (var34 == 23 && field634 < 1) { // L: 1901
					++field634; // L: 1902
					loginState = 0; // L: 1903
				} else if (var34 == 29) { // L: 1905
					loginState = 17; // L: 1906
				} else {
					if (var34 != 69) { // L: 1908
						Messages.getLoginError(var34); // L: 1912
						return; // L: 1913
					}

					loginState = 7; // L: 1909
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) { // L: 1917 1918
				((AbstractSocket)var1).read(var2.array, 0, 2); // L: 1919
				var2.offset = 0; // L: 1920
				class367.field4117 = var2.readUnsignedShort(); // L: 1921
				loginState = 8; // L: 1922
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= class367.field4117) { // L: 1925 1926
				var2.offset = 0; // L: 1927
				((AbstractSocket)var1).read(var2.array, var2.offset, class367.field4117); // L: 1928
				class34[] var24 = new class34[]{class34.field236}; // L: 1931
				class34 var35 = var24[var2.readUnsignedByte()]; // L: 1933

				try {
					switch(var35.field230) { // L: 1937
					case 0:
						class28 var27 = new class28(); // L: 1944
						this.field640 = new class35(var2, var27); // L: 1950
						loginState = 9; // L: 1951
						break;
					default:
						throw new IllegalArgumentException(); // L: 1940
					}
				} catch (Exception var21) { // L: 1953
					Messages.getLoginError(22); // L: 1954
					return; // L: 1955
				}
			}

			if (loginState == 9 && this.field640.method426()) { // L: 1959 1960
				this.field746 = this.field640.method425(); // L: 1961
				this.field640.method427(); // L: 1962
				this.field640 = null; // L: 1963
				if (this.field746 == null) { // L: 1964
					Messages.getLoginError(22); // L: 1965
					return; // L: 1966
				}

				packetWriter.clearBuffer(); // L: 1968
				var3 = class6.method98(); // L: 1969
				var3.packetBuffer.writeByte(LoginPacket.field2450.id); // L: 1970
				var3.packetBuffer.writeShort(this.field746.offset); // L: 1971
				var3.packetBuffer.method6574(this.field746); // L: 1972
				packetWriter.addNode(var3); // L: 1973
				packetWriter.flush(); // L: 1974
				this.field746 = null; // L: 1975
				loginState = 6; // L: 1976
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) { // L: 1979 1980
				class11.field108 = ((AbstractSocket)var1).readUnsignedByte(); // L: 1981
				loginState = 11; // L: 1982
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= class11.field108) { // L: 1985 1986
				((AbstractSocket)var1).read(var2.array, 0, class11.field108); // L: 1987
				var2.offset = 0; // L: 1988
				loginState = 6; // L: 1989
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) { // L: 1992 1993
				field635 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60; // L: 1994
				loginState = 13; // L: 1995
			}

			if (loginState == 13) { // L: 1998
				field633 = 0; // L: 1999
				class9.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field635 / 60 + " seconds."); // L: 2000
				if (--field635 <= 0) { // L: 2001
					loginState = 0;
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) { // L: 2004 2005
					WorldMapLabelSize.field1572 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2006
					loginState = 15; // L: 2007
				}

				if (loginState == 15 && ((AbstractSocket)var1).available() >= WorldMapLabelSize.field1572) { // L: 2010 2011
					var12 = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2012
					((AbstractSocket)var1).read(var2.array, 0, 4); // L: 2013
					var2.offset = 0; // L: 2014
					boolean var25 = false; // L: 2015
					if (var12) { // L: 2016
						var4 = var2.readByteIsaac() << 24; // L: 2017
						var4 |= var2.readByteIsaac() << 16; // L: 2018
						var4 |= var2.readByteIsaac() << 8; // L: 2019
						var4 |= var2.readByteIsaac(); // L: 2020
						String var30 = Login.Login_username; // L: 2022
						var7 = var30.length(); // L: 2024
						int var17 = 0; // L: 2025
						var9 = 0; // L: 2026

						while (true) {
							if (var9 >= var7) {
								if (Login.clientPreferences.parameters.size() >= 10 && !Login.clientPreferences.parameters.containsKey(var17)) { // L: 2030 2031
									Iterator var33 = Login.clientPreferences.parameters.entrySet().iterator(); // L: 2032
									var33.next(); // L: 2033
									var33.remove(); // L: 2034
								}

								Login.clientPreferences.parameters.put(var17, var4); // L: 2037
								break;
							}

							var17 = (var17 << 5) - var17 + var30.charAt(var9);
							++var9;
						}
					}

					if (Login_isUsernameRemembered) { // L: 2039
						Login.clientPreferences.rememberedUsername = Login.Login_username; // L: 2040
					} else {
						Login.clientPreferences.rememberedUsername = null; // L: 2043
					}

					Message.savePreferences(); // L: 2045
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte(); // L: 2046
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2047
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte(); // L: 2048
					localPlayerIndex <<= 8; // L: 2049
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte(); // L: 2050
					field720 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2051
					((AbstractSocket)var1).read(var2.array, 0, 1); // L: 2052
					var2.offset = 0; // L: 2053
					ServerPacket[] var28 = ItemLayer.ServerPacket_values(); // L: 2054
					var14 = var2.readSmartByteShortIsaac(); // L: 2055
					if (var14 < 0 || var14 >= var28.length) { // L: 2056
						throw new IOException(var14 + " " + var2.offset);
					}

					packetWriter.serverPacket = var28[var14]; // L: 2057
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2058
					((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2059
					var2.offset = 0; // L: 2060
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2061

					try {
						class42.method509(class10.client, "zap"); // L: 2063
					} catch (Throwable var20) { // L: 2065
					}

					loginState = 16; // L: 2066
				}

				if (loginState == 16) { // L: 2069
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2070
						var2.offset = 0; // L: 2071
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2072
						timer.method5587(); // L: 2073
						class304.method5536(); // L: 2074
						AccessFile.updatePlayer(var2); // L: 2075
						class105.field1327 = -1; // L: 2076
						Players.loadRegions(false, var2); // L: 2077
						packetWriter.serverPacket = null; // L: 2078
					}

				} else {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) { // L: 2082 2083
						var2.offset = 0; // L: 2084
						((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2085
						var2.offset = 0; // L: 2086
						class9.field63 = var2.readUnsignedShort(); // L: 2087
						loginState = 18; // L: 2088
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= class9.field63) { // L: 2091 2092
						var2.offset = 0; // L: 2093
						((AbstractSocket)var1).read(var2.array, 0, class9.field63); // L: 2094
						var2.offset = 0; // L: 2095
						String var26 = var2.readStringCp1252NullTerminated(); // L: 2096
						String var36 = var2.readStringCp1252NullTerminated(); // L: 2097
						String var29 = var2.readStringCp1252NullTerminated(); // L: 2098
						class9.setLoginResponseString(var26, var36, var29); // L: 2099
						class20.updateGameState(10); // L: 2100
					}

					if (loginState != 19) { // L: 2103
						++field633; // L: 2153
						if (field633 > 2000) { // L: 2154
							if (field634 < 1) { // L: 2155
								if (AttackOption.worldPort == class5.currentPort) { // L: 2156
									class5.currentPort = Calendar.js5Port;
								} else {
									class5.currentPort = AttackOption.worldPort; // L: 2157
								}

								++field634; // L: 2158
								loginState = 0; // L: 2159
							} else {
								Messages.getLoginError(-3); // L: 2162
							}
						}
					} else {
						if (packetWriter.serverPacketLength == -1) { // L: 2104
							if (((AbstractSocket)var1).available() < 2) { // L: 2105
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2106
							var2.offset = 0; // L: 2107
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2108
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2110
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2111
							var2.offset = 0; // L: 2112
							var34 = packetWriter.serverPacketLength; // L: 2113
							timer.method5582(); // L: 2114
							packetWriter.clearBuffer(); // L: 2116
							packetWriter.packetBuffer.offset = 0; // L: 2117
							packetWriter.serverPacket = null; // L: 2118
							packetWriter.field1381 = null; // L: 2119
							packetWriter.field1392 = null; // L: 2120
							packetWriter.field1393 = null; // L: 2121
							packetWriter.serverPacketLength = 0; // L: 2122
							packetWriter.field1391 = 0; // L: 2123
							rebootTimer = 0; // L: 2124
							menuOptionsCount = 0; // L: 2126
							isMenuOpen = false; // L: 2127
							minimapState = 0; // L: 2129
							destinationX = 0; // L: 2130

							for (var4 = 0; var4 < 2048; ++var4) { // L: 2131
								players[var4] = null;
							}

							Varcs.localPlayer = null; // L: 2132

							for (var4 = 0; var4 < npcs.length; ++var4) { // L: 2133
								NPC var31 = npcs[var4]; // L: 2134
								if (var31 != null) { // L: 2135
									var31.targetIndex = -1; // L: 2136
									var31.false0 = false; // L: 2137
								}
							}

							ItemContainer.itemContainers = new NodeHashTable(32); // L: 2141
							class20.updateGameState(30); // L: 2143

							for (var4 = 0; var4 < 100; ++var4) { // L: 2144
								field811[var4] = true;
							}

							ItemContainer.method2093(); // L: 2145
							AccessFile.updatePlayer(var2); // L: 2147
							if (var34 != var2.offset) { // L: 2148
								throw new RuntimeException(); // L: 2149
							}
						}
					}
				}
			}
		} catch (IOException var22) { // L: 2166
			if (field634 < 1) { // L: 2167
				if (class5.currentPort == AttackOption.worldPort) { // L: 2168
					class5.currentPort = Calendar.js5Port;
				} else {
					class5.currentPort = AttackOption.worldPort; // L: 2169
				}

				++field634; // L: 2170
				loginState = 0; // L: 2171
			} else {
				Messages.getLoginError(-2); // L: 2174
			}
		}
	} // L: 2002 2080 2151 2160 2163 2172 2175 2177

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "25"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 2467
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 2468
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 2469
			hadNetworkError = false; // L: 2470
			HealthBarUpdate.method2181(); // L: 2471
		} else {
			if (!isMenuOpen) { // L: 2474
				VerticalAlignment.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1233(packetWriter); ++var1) { // L: 2475 2476
			}

			if (gameState == 30) { // L: 2478
				int var2;
				PacketBufferNode var15;
				while (class34.method415()) { // L: 2479
					var15 = ObjectComposition.getPacketBufferNode(ClientPacket.field2245, packetWriter.isaacCipher); // L: 2480
					var15.packetBuffer.writeByte(0); // L: 2481
					var2 = var15.packetBuffer.offset; // L: 2482
					class11.performReflectionCheck(var15.packetBuffer); // L: 2483
					var15.packetBuffer.writeLengthByte(var15.packetBuffer.offset - var2); // L: 2484
					packetWriter.addNode(var15); // L: 2485
				}

				if (timer.field3773) { // L: 2487
					var15 = ObjectComposition.getPacketBufferNode(ClientPacket.field2234, packetWriter.isaacCipher); // L: 2489
					var15.packetBuffer.writeByte(0); // L: 2490
					var2 = var15.packetBuffer.offset; // L: 2491
					timer.write(var15.packetBuffer); // L: 2492
					var15.packetBuffer.writeLengthByte(var15.packetBuffer.offset - var2); // L: 2493
					packetWriter.addNode(var15); // L: 2494
					timer.method5581(); // L: 2495
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
				PacketBuffer var10000;
				synchronized(Language.mouseRecorder.lock) { // L: 2498
					if (!field867) { // L: 2499
						Language.mouseRecorder.index = 0; // L: 2585
					} else if (MouseHandler.MouseHandler_lastButton != 0 || Language.mouseRecorder.index >= 40) { // L: 2500
						PacketBufferNode var16 = null; // L: 2502
						var3 = 0; // L: 2503
						var4 = 0; // L: 2504
						var5 = 0; // L: 2505
						var6 = 0; // L: 2506

						for (var7 = 0; var7 < Language.mouseRecorder.index && (var16 == null || var16.packetBuffer.offset - var3 < 246); ++var7) { // L: 2507 2508
							var4 = var7; // L: 2509
							var8 = Language.mouseRecorder.ys[var7]; // L: 2510
							if (var8 < -1) { // L: 2511
								var8 = -1;
							} else if (var8 > 65534) { // L: 2512
								var8 = 65534;
							}

							var9 = Language.mouseRecorder.xs[var7]; // L: 2513
							if (var9 < -1) { // L: 2514
								var9 = -1;
							} else if (var9 > 65534) { // L: 2515
								var9 = 65534;
							}

							if (var9 != field875 || var8 != field759) { // L: 2516
								if (var16 == null) { // L: 2519
									var16 = ObjectComposition.getPacketBufferNode(ClientPacket.field2241, packetWriter.isaacCipher); // L: 2520
									var16.packetBuffer.writeByte(0); // L: 2521
									var3 = var16.packetBuffer.offset; // L: 2522
									var10000 = var16.packetBuffer; // L: 2523
									var10000.offset += 2;
									var5 = 0; // L: 2524
									var6 = 0; // L: 2525
								}

								if (field851 != -1L) { // L: 2530
									var10 = var9 - field875; // L: 2531
									var11 = var8 - field759; // L: 2532
									var12 = (int)((Language.mouseRecorder.millis[var7] - field851) / 20L); // L: 2533
									var5 = (int)((long)var5 + (Language.mouseRecorder.millis[var7] - field851) % 20L); // L: 2534
								} else {
									var10 = var9; // L: 2537
									var11 = var8; // L: 2538
									var12 = Integer.MAX_VALUE; // L: 2539
								}

								field875 = var9; // L: 2541
								field759 = var8; // L: 2542
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 2543
									var10 += 32; // L: 2544
									var11 += 32; // L: 2545
									var16.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 2546
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 2548
									var10 += 128; // L: 2549
									var11 += 128; // L: 2550
									var16.packetBuffer.writeByte(var12 + 128); // L: 2551
									var16.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 2552
								} else if (var12 < 32) { // L: 2554
									var16.packetBuffer.writeByte(var12 + 192); // L: 2555
									if (var9 != -1 && var8 != -1) { // L: 2556
										var16.packetBuffer.writeInt(var9 | var8 << 16); // L: 2557
									} else {
										var16.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var16.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 2560
									if (var9 != -1 && var8 != -1) { // L: 2561
										var16.packetBuffer.writeInt(var9 | var8 << 16); // L: 2562
									} else {
										var16.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6; // L: 2564
								field851 = Language.mouseRecorder.millis[var7]; // L: 2565
							}
						}

						if (var16 != null) { // L: 2567
							var16.packetBuffer.writeLengthByte(var16.packetBuffer.offset - var3); // L: 2568
							var7 = var16.packetBuffer.offset; // L: 2569
							var16.packetBuffer.offset = var3; // L: 2570
							var16.packetBuffer.writeByte(var5 / var6); // L: 2571
							var16.packetBuffer.writeByte(var5 % var6); // L: 2572
							var16.packetBuffer.offset = var7; // L: 2573
							packetWriter.addNode(var16); // L: 2574
						}

						if (var4 >= Language.mouseRecorder.index) { // L: 2576
							Language.mouseRecorder.index = 0;
						} else {
							MouseRecorder var47 = Language.mouseRecorder; // L: 2578
							var47.index -= var4;
							System.arraycopy(Language.mouseRecorder.xs, var4, Language.mouseRecorder.xs, 0, Language.mouseRecorder.index); // L: 2579
							System.arraycopy(Language.mouseRecorder.ys, var4, Language.mouseRecorder.ys, 0, Language.mouseRecorder.index); // L: 2580
							System.arraycopy(Language.mouseRecorder.millis, var4, Language.mouseRecorder.millis, 0, Language.mouseRecorder.index); // L: 2581
						}
					}
				}

				PacketBufferNode var19;
				if (MouseHandler.MouseHandler_lastButton == 1 || !MouseHandler.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 2587
					long var17 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis; // L: 2588
					if (var17 > 32767L) { // L: 2589
						var17 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis; // L: 2590
					var3 = MouseHandler.MouseHandler_lastPressedY; // L: 2591
					if (var3 < 0) { // L: 2592
						var3 = 0;
					} else if (var3 > GameEngine.canvasHeight) { // L: 2593
						var3 = GameEngine.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX; // L: 2594
					if (var4 < 0) { // L: 2595
						var4 = 0;
					} else if (var4 > InterfaceParent.canvasWidth) { // L: 2596
						var4 = InterfaceParent.canvasWidth;
					}

					var5 = (int)var17; // L: 2597
					var19 = ObjectComposition.getPacketBufferNode(ClientPacket.field2216, packetWriter.isaacCipher); // L: 2598
					var19.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1)); // L: 2599
					var19.packetBuffer.writeShort(var4); // L: 2600
					var19.packetBuffer.writeShort(var3); // L: 2601
					packetWriter.addNode(var19); // L: 2602
				}

				if (KeyHandler.field263 > 0) { // L: 2604
					var15 = ObjectComposition.getPacketBufferNode(ClientPacket.field2226, packetWriter.isaacCipher); // L: 2605
					var15.packetBuffer.writeShort(0); // L: 2606
					var2 = var15.packetBuffer.offset; // L: 2607
					long var20 = ObjectSound.currentTimeMillis(); // L: 2608

					for (var5 = 0; var5 < KeyHandler.field263; ++var5) { // L: 2609
						long var22 = var20 - field678; // L: 2610
						if (var22 > 16777215L) { // L: 2611
							var22 = 16777215L;
						}

						field678 = var20; // L: 2612
						var15.packetBuffer.writeMedium((int)var22); // L: 2613
						var15.packetBuffer.method6639(KeyHandler.field262[var5]); // L: 2614
					}

					var15.packetBuffer.writeLengthShort(var15.packetBuffer.offset - var2); // L: 2616
					packetWriter.addNode(var15); // L: 2617
				}

				if (field826 > 0) { // L: 2619
					--field826;
				}

				if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) { // L: 2620
					field687 = true;
				}

				if (field687 && field826 <= 0) { // L: 2621
					field826 = 20; // L: 2622
					field687 = false; // L: 2623
					var15 = ObjectComposition.getPacketBufferNode(ClientPacket.field2293, packetWriter.isaacCipher); // L: 2625
					var15.packetBuffer.method6614(camAngleX); // L: 2626
					var15.packetBuffer.writeIntME(camAngleY); // L: 2627
					packetWriter.addNode(var15); // L: 2628
				}

				if (GrandExchangeOfferAgeComparator.hasFocus && !hadFocus) { // L: 2630
					hadFocus = true; // L: 2631
					var15 = ObjectComposition.getPacketBufferNode(ClientPacket.field2272, packetWriter.isaacCipher); // L: 2633
					var15.packetBuffer.writeByte(1); // L: 2634
					packetWriter.addNode(var15); // L: 2635
				}

				if (!GrandExchangeOfferAgeComparator.hasFocus && hadFocus) { // L: 2637
					hadFocus = false; // L: 2638
					var15 = ObjectComposition.getPacketBufferNode(ClientPacket.field2272, packetWriter.isaacCipher); // L: 2640
					var15.packetBuffer.writeByte(0); // L: 2641
					packetWriter.addNode(var15); // L: 2642
				}

				if (UserComparator4.worldMap != null) { // L: 2645
					UserComparator4.worldMap.method6148();
				}

				if (WorldMapSection2.ClanChat_inClanChat) { // L: 2647
					if (InterfaceParent.clanChat != null) { // L: 2648
						InterfaceParent.clanChat.sort(); // L: 2649
					}

					class157.method3112(); // L: 2651
					WorldMapSection2.ClanChat_inClanChat = false; // L: 2652
				}

				if (field833 != class26.Client_plane) { // L: 2656
					field833 = class26.Client_plane; // L: 2657
					class14.createMinimapSprite(class26.Client_plane); // L: 2658
				}

				if (gameState == 30) { // L: 2661
					PacketBufferNode.method3888(); // L: 2662

					int var10002;
					for (var1 = 0; var1 < soundEffectCount; ++var1) { // L: 2664
						var10002 = queuedSoundEffectDelays[var1]--; // L: 2665
						if (queuedSoundEffectDelays[var1] >= -10) { // L: 2666
							SoundEffect var35 = soundEffects[var1]; // L: 2678
							if (var35 == null) { // L: 2679
								var10000 = null; // L: 2680
								var35 = SoundEffect.readSoundEffect(ItemContainer.archive4, soundEffectIds[var1], 0);
								if (var35 == null) { // L: 2681
									continue;
								}

								int[] var48 = queuedSoundEffectDelays; // L: 2682
								var48[var1] += var35.calculateDelay();
								soundEffects[var1] = var35; // L: 2683
							}

							if (queuedSoundEffectDelays[var1] < 0) { // L: 2689
								if (soundLocations[var1] != 0) { // L: 2691
									var4 = (soundLocations[var1] & 255) * 128; // L: 2692
									var5 = soundLocations[var1] >> 16 & 255; // L: 2693
									var6 = var5 * 128 + 64 - Varcs.localPlayer.x; // L: 2694
									if (var6 < 0) { // L: 2695
										var6 = -var6;
									}

									var7 = soundLocations[var1] >> 8 & 255; // L: 2696
									var8 = var7 * 128 + 64 - Varcs.localPlayer.y; // L: 2697
									if (var8 < 0) { // L: 2698
										var8 = -var8;
									}

									var9 = var6 + var8 - 128; // L: 2699
									if (var9 > var4) { // L: 2700
										queuedSoundEffectDelays[var1] = -100; // L: 2701
										continue; // L: 2702
									}

									if (var9 < 0) { // L: 2704
										var9 = 0;
									}

									var3 = (var4 - var9) * Login.clientPreferences.areaSoundEffectsVolume / var4; // L: 2705
								} else {
									var3 = Login.clientPreferences.soundEffectsVolume; // L: 2707
								}

								if (var3 > 0) { // L: 2708
									RawSound var24 = var35.toRawSound().resample(class34.decimator); // L: 2709
									RawPcmStream var25 = RawPcmStream.createRawPcmStream(var24, 100, var3); // L: 2710
									var25.setNumLoops(queuedSoundEffectLoops[var1] - 1); // L: 2711
									Huffman.pcmStreamMixer.addSubStream(var25); // L: 2712
								}

								queuedSoundEffectDelays[var1] = -100; // L: 2714
							}
						} else {
							--soundEffectCount; // L: 2667

							for (var2 = var1; var2 < soundEffectCount; ++var2) { // L: 2668
								soundEffectIds[var2] = soundEffectIds[var2 + 1]; // L: 2669
								soundEffects[var2] = soundEffects[var2 + 1]; // L: 2670
								queuedSoundEffectLoops[var2] = queuedSoundEffectLoops[var2 + 1]; // L: 2671
								queuedSoundEffectDelays[var2] = queuedSoundEffectDelays[var2 + 1]; // L: 2672
								soundLocations[var2] = soundLocations[var2 + 1]; // L: 2673
							}

							--var1; // L: 2675
						}
					}

					if (field842) { // L: 2717
						boolean var30;
						if (class210.musicPlayerStatus != 0) { // L: 2720
							var30 = true; // L: 2721
						} else {
							var30 = class210.midiPcmStream.isReady(); // L: 2724
						}

						if (!var30) { // L: 2726
							if (Login.clientPreferences.musicVolume != 0 && currentTrackGroupId != -1) { // L: 2727
								PacketBufferNode.method3898(class8.archive6, currentTrackGroupId, 0, Login.clientPreferences.musicVolume, false);
							}

							field842 = false; // L: 2728
						}
					}

					++packetWriter.field1391; // L: 2732
					if (packetWriter.field1391 > 750) { // L: 2733
						HealthBarUpdate.method2181(); // L: 2734
					} else {
						var1 = Players.Players_count; // L: 2738
						int[] var36 = Players.Players_indices; // L: 2739

						for (var3 = 0; var3 < var1; ++var3) { // L: 2740
							Player var40 = players[var36[var3]]; // L: 2741
							if (var40 != null) { // L: 2742
								class137.updateActorSequence(var40, 1); // L: 2743
							}
						}

						WorldMapCacheName.method3188(); // L: 2747
						int[] var33 = Players.Players_indices; // L: 2749

						for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 2750
							Player var26 = players[var33[var2]]; // L: 2751
							if (var26 != null && var26.overheadTextCyclesRemaining > 0) { // L: 2752
								--var26.overheadTextCyclesRemaining; // L: 2753
								if (var26.overheadTextCyclesRemaining == 0) { // L: 2754
									var26.overheadText = null;
								}
							}
						}

						for (var2 = 0; var2 < npcCount; ++var2) { // L: 2757
							var3 = npcIndices[var2]; // L: 2758
							NPC var41 = npcs[var3]; // L: 2759
							if (var41 != null && var41.overheadTextCyclesRemaining > 0) { // L: 2760
								--var41.overheadTextCyclesRemaining; // L: 2761
								if (var41.overheadTextCyclesRemaining == 0) { // L: 2762
									var41.overheadText = null;
								}
							}
						}

						++field799; // L: 2766
						if (mouseCrossColor != 0) { // L: 2767
							mouseCrossState += 20; // L: 2768
							if (mouseCrossState >= 400) { // L: 2769
								mouseCrossColor = 0;
							}
						}

						if (PacketWriter.field1394 != null) { // L: 2771
							++field708; // L: 2772
							if (field708 >= 15) { // L: 2773
								class29.invalidateWidget(PacketWriter.field1394); // L: 2774
								PacketWriter.field1394 = null; // L: 2775
							}
						}

						Widget var34 = Varps.mousedOverWidgetIf1; // L: 2778
						Widget var37 = Player.field1192; // L: 2779
						Varps.mousedOverWidgetIf1 = null; // L: 2780
						Player.field1192 = null; // L: 2781
						draggedOnWidget = null; // L: 2782
						field783 = false; // L: 2783
						field780 = false; // L: 2784
						field827 = 0; // L: 2785

						while (class231.isKeyDown() && field827 < 128) { // L: 2786
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && class19.field146 == 66) { // L: 2787
								String var42 = ""; // L: 2790

								Message var38;
								for (Iterator var43 = Messages.Messages_hashTable.iterator(); var43.hasNext(); var42 = var42 + var38.sender + ':' + var38.text + '\n') { // L: 2791 2794
									var38 = (Message)var43.next(); // L: 2792
								}

								class10.client.clipboardSetString(var42); // L: 2800
							} else if (oculusOrbState != 1 || Message.field591 <= 0) { // L: 2803
								field792[field827] = class19.field146; // L: 2806
								field828[field827] = Message.field591; // L: 2807
								++field827; // L: 2808
							}
						}

						boolean var31 = staffModLevel >= 2; // L: 2812
						if (var31 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) { // L: 2814
							var4 = Varcs.localPlayer.plane - mouseWheelRotation; // L: 2815
							if (var4 < 0) { // L: 2816
								var4 = 0;
							} else if (var4 > 3) { // L: 2817
								var4 = 3;
							}

							if (var4 != Varcs.localPlayer.plane) { // L: 2818
								class9.method123(Varcs.localPlayer.pathX[0] + ItemLayer.baseX, Varcs.localPlayer.pathY[0] + Tile.baseY, var4, false); // L: 2819
							}

							mouseWheelRotation = 0; // L: 2821
						}

						if (rootInterface != -1) { // L: 2823
							class5.updateRootInterface(rootInterface, 0, 0, InterfaceParent.canvasWidth, GameEngine.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 2824

						while (true) {
							Widget var39;
							ScriptEvent var44;
							Widget var45;
							do {
								var44 = (ScriptEvent)field806.removeLast(); // L: 2826
								if (var44 == null) { // L: 2827
									while (true) {
										do {
											var44 = (ScriptEvent)field688.removeLast(); // L: 2838
											if (var44 == null) { // L: 2839
												while (true) {
													do {
														var44 = (ScriptEvent)scriptEvents.removeLast(); // L: 2850
														if (var44 == null) { // L: 2851
															this.menu(); // L: 2861
															if (UserComparator4.worldMap != null) { // L: 2863
																UserComparator4.worldMap.method6116(class26.Client_plane, (Varcs.localPlayer.x >> 7) + ItemLayer.baseX, (Varcs.localPlayer.y >> 7) + Tile.baseY, false); // L: 2864
																UserComparator4.worldMap.loadCache(); // L: 2865
															}

															if (clickedWidget != null) { // L: 2868
																this.method1239();
															}

															if (ClientPacket.dragInventoryWidget != null) { // L: 2869
																class29.invalidateWidget(ClientPacket.dragInventoryWidget); // L: 2870
																++itemDragDuration; // L: 2871
																if (MouseHandler.MouseHandler_currentButton == 0) { // L: 2872
																	if (field714) { // L: 2873
																		if (ClientPacket.dragInventoryWidget == ScriptFrame.hoveredItemContainer && dragItemSlotSource != dragItemSlotDestination) { // L: 2874
																			Widget var46 = ClientPacket.dragInventoryWidget; // L: 2875
																			byte var32 = 0; // L: 2876
																			if (field767 == 1 && var46.contentType == 206) { // L: 2877
																				var32 = 1;
																			}

																			if (var46.itemIds[dragItemSlotDestination] <= 0) { // L: 2878
																				var32 = 0;
																			}

																			if (class69.method1165(DirectByteArrayCopier.getWidgetFlags(var46))) { // L: 2879
																				var6 = dragItemSlotSource; // L: 2880
																				var7 = dragItemSlotDestination; // L: 2881
																				var46.itemIds[var7] = var46.itemIds[var6]; // L: 2882
																				var46.itemQuantities[var7] = var46.itemQuantities[var6]; // L: 2883
																				var46.itemIds[var6] = -1; // L: 2884
																				var46.itemQuantities[var6] = 0; // L: 2885
																			} else if (var32 == 1) { // L: 2887
																				var6 = dragItemSlotSource; // L: 2888
																				var7 = dragItemSlotDestination; // L: 2889

																				while (var6 != var7) { // L: 2890
																					if (var6 > var7) { // L: 2891
																						var46.swapItems(var6 - 1, var6); // L: 2892
																						--var6; // L: 2893
																					} else if (var6 < var7) { // L: 2895
																						var46.swapItems(var6 + 1, var6); // L: 2896
																						++var6; // L: 2897
																					}
																				}
																			} else {
																				var46.swapItems(dragItemSlotDestination, dragItemSlotSource); // L: 2902
																			}

																			var19 = ObjectComposition.getPacketBufferNode(ClientPacket.field2230, packetWriter.isaacCipher); // L: 2905
																			var19.packetBuffer.method6625(ClientPacket.dragInventoryWidget.id); // L: 2906
																			var19.packetBuffer.method6614(dragItemSlotSource); // L: 2907
																			var19.packetBuffer.method6606(var32); // L: 2908
																			var19.packetBuffer.method6614(dragItemSlotDestination); // L: 2909
																			packetWriter.addNode(var19); // L: 2910
																		}
																	} else if (this.shouldLeftClickOpenMenu()) { // L: 2914
																		this.openMenu(draggedWidgetX, draggedWidgetY); // L: 2915
																	} else if (menuOptionsCount > 0) { // L: 2917
																		class26.method357(draggedWidgetX, draggedWidgetY); // L: 2918
																	}

																	field708 = 10; // L: 2921
																	MouseHandler.MouseHandler_lastButton = 0; // L: 2922
																	ClientPacket.dragInventoryWidget = null; // L: 2923
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) { // L: 2926 2927
																	field714 = true; // L: 2928
																}
															}

															if (Scene.shouldSendWalk()) { // L: 2933
																var4 = Scene.Scene_selectedX; // L: 2934
																var5 = Scene.Scene_selectedY; // L: 2935
																var19 = ObjectComposition.getPacketBufferNode(ClientPacket.field2267, packetWriter.isaacCipher); // L: 2937
																var19.packetBuffer.writeByte(5); // L: 2938
																var19.packetBuffer.method6771(var5 + Tile.baseY); // L: 2939
																var19.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 2940
																var19.packetBuffer.writeIntME(var4 + ItemLayer.baseX); // L: 2941
																packetWriter.addNode(var19); // L: 2942
																Scene.method3476(); // L: 2943
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 2944
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 2945
																mouseCrossColor = 1; // L: 2946
																mouseCrossState = 0; // L: 2947
																destinationX = var4; // L: 2948
																destinationY = var5; // L: 2949
															}

															if (var34 != Varps.mousedOverWidgetIf1) { // L: 2951
																if (var34 != null) { // L: 2952
																	class29.invalidateWidget(var34);
																}

																if (Varps.mousedOverWidgetIf1 != null) { // L: 2953
																	class29.invalidateWidget(Varps.mousedOverWidgetIf1);
																}
															}

															if (var37 != Player.field1192 && field696 == field753) { // L: 2955
																if (var37 != null) { // L: 2956
																	class29.invalidateWidget(var37);
																}

																if (Player.field1192 != null) { // L: 2957
																	class29.invalidateWidget(Player.field1192);
																}
															}

															if (Player.field1192 != null) { // L: 2959
																if (field753 < field696) { // L: 2960
																	++field753; // L: 2961
																	if (field696 == field753) { // L: 2962
																		class29.invalidateWidget(Player.field1192);
																	}
																}
															} else if (field753 > 0) { // L: 2965
																--field753;
															}

															MusicPatchPcmStream.method4122(); // L: 2966
															if (isCameraLocked) { // L: 2967
																var4 = class5.field40 * 128 + 64; // L: 2968
																var5 = ApproximateRouteStrategy.field592 * 128 + 64; // L: 2969
																var6 = UserComparator7.getTileHeight(var4, var5, class26.Client_plane) - WorldMapLabelSize.field1569; // L: 2970
																if (ModeWhere.cameraX < var4) { // L: 2971
																	ModeWhere.cameraX = (var4 - ModeWhere.cameraX) * UserComparator9.field1435 / 1000 + ModeWhere.cameraX + Skeleton.field1927; // L: 2972
																	if (ModeWhere.cameraX > var4) { // L: 2973
																		ModeWhere.cameraX = var4;
																	}
																}

																if (ModeWhere.cameraX > var4) { // L: 2975
																	ModeWhere.cameraX -= UserComparator9.field1435 * (ModeWhere.cameraX - var4) / 1000 + Skeleton.field1927; // L: 2976
																	if (ModeWhere.cameraX < var4) { // L: 2977
																		ModeWhere.cameraX = var4;
																	}
																}

																if (WorldMapRectangle.cameraY < var6) { // L: 2979
																	WorldMapRectangle.cameraY = (var6 - WorldMapRectangle.cameraY) * UserComparator9.field1435 / 1000 + WorldMapRectangle.cameraY + Skeleton.field1927; // L: 2980
																	if (WorldMapRectangle.cameraY > var6) { // L: 2981
																		WorldMapRectangle.cameraY = var6;
																	}
																}

																if (WorldMapRectangle.cameraY > var6) { // L: 2983
																	WorldMapRectangle.cameraY -= UserComparator9.field1435 * (WorldMapRectangle.cameraY - var6) / 1000 + Skeleton.field1927; // L: 2984
																	if (WorldMapRectangle.cameraY < var6) { // L: 2985
																		WorldMapRectangle.cameraY = var6;
																	}
																}

																if (ReflectionCheck.cameraZ < var5) { // L: 2987
																	ReflectionCheck.cameraZ = (var5 - ReflectionCheck.cameraZ) * UserComparator9.field1435 / 1000 + ReflectionCheck.cameraZ + Skeleton.field1927; // L: 2988
																	if (ReflectionCheck.cameraZ > var5) { // L: 2989
																		ReflectionCheck.cameraZ = var5;
																	}
																}

																if (ReflectionCheck.cameraZ > var5) { // L: 2991
																	ReflectionCheck.cameraZ -= UserComparator9.field1435 * (ReflectionCheck.cameraZ - var5) / 1000 + Skeleton.field1927; // L: 2992
																	if (ReflectionCheck.cameraZ < var5) { // L: 2993
																		ReflectionCheck.cameraZ = var5;
																	}
																}

																var4 = ModeWhere.field3368 * 128 + 64; // L: 2995
																var5 = AttackOption.field1339 * 128 + 64; // L: 2996
																var6 = UserComparator7.getTileHeight(var4, var5, class26.Client_plane) - class2.field15; // L: 2997
																var7 = var4 - ModeWhere.cameraX; // L: 2998
																var8 = var6 - WorldMapRectangle.cameraY; // L: 2999
																var9 = var5 - ReflectionCheck.cameraZ; // L: 3000
																var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9)); // L: 3001
																var11 = (int)(Math.atan2((double)var8, (double)var10) * 325.949D) & 2047; // L: 3002
																var12 = (int)(Math.atan2((double)var7, (double)var9) * -325.949D) & 2047; // L: 3003
																if (var11 < 128) { // L: 3004
																	var11 = 128;
																}

																if (var11 > 383) { // L: 3005
																	var11 = 383;
																}

																if (WorldMapArea.cameraPitch < var11) { // L: 3006
																	WorldMapArea.cameraPitch = (var11 - WorldMapArea.cameraPitch) * class0.field6 / 1000 + WorldMapArea.cameraPitch + Players.field1363; // L: 3007
																	if (WorldMapArea.cameraPitch > var11) { // L: 3008
																		WorldMapArea.cameraPitch = var11;
																	}
																}

																if (WorldMapArea.cameraPitch > var11) { // L: 3010
																	WorldMapArea.cameraPitch -= class0.field6 * (WorldMapArea.cameraPitch - var11) / 1000 + Players.field1363; // L: 3011
																	if (WorldMapArea.cameraPitch < var11) { // L: 3012
																		WorldMapArea.cameraPitch = var11;
																	}
																}

																int var27 = var12 - class69.cameraYaw; // L: 3014
																if (var27 > 1024) { // L: 3015
																	var27 -= 2048;
																}

																if (var27 < -1024) { // L: 3016
																	var27 += 2048;
																}

																if (var27 > 0) { // L: 3017
																	class69.cameraYaw = class69.cameraYaw + Players.field1363 + var27 * class0.field6 / 1000; // L: 3018
																	class69.cameraYaw &= 2047; // L: 3019
																}

																if (var27 < 0) { // L: 3021
																	class69.cameraYaw -= Players.field1363 + -var27 * class0.field6 / 1000; // L: 3022
																	class69.cameraYaw &= 2047; // L: 3023
																}

																int var14 = var12 - class69.cameraYaw; // L: 3025
																if (var14 > 1024) { // L: 3026
																	var14 -= 2048;
																}

																if (var14 < -1024) { // L: 3027
																	var14 += 2048;
																}

																if (var14 < 0 && var27 > 0 || var14 > 0 && var27 < 0) { // L: 3028
																	class69.cameraYaw = var12;
																}
															}

															for (var4 = 0; var4 < 5; ++var4) { // L: 3030
																var10002 = field854[var4]++;
															}

															TextureProvider.varcs.tryWrite(); // L: 3031
															var4 = MouseRecorder.method2107(); // L: 3032
															var5 = class9.method125(); // L: 3033
															if (var4 > 15000 && var5 > 15000) { // L: 3034
																logoutTimer = 250; // L: 3035
																MouseHandler.MouseHandler_idleCycles = 14500; // L: 3037
																var19 = ObjectComposition.getPacketBufferNode(ClientPacket.field2269, packetWriter.isaacCipher); // L: 3040
																packetWriter.addNode(var19); // L: 3041
															}

															class13.friendSystem.processFriendUpdates(); // L: 3043
															++packetWriter.pendingWrites; // L: 3044
															if (packetWriter.pendingWrites > 50) { // L: 3045
																var19 = ObjectComposition.getPacketBufferNode(ClientPacket.field2271, packetWriter.isaacCipher); // L: 3047
																packetWriter.addNode(var19); // L: 3048
															}

															try {
																packetWriter.flush(); // L: 3051
															} catch (IOException var28) { // L: 3053
																HealthBarUpdate.method2181(); // L: 3054
															}

															return; // L: 3056
														}

														var45 = var44.widget; // L: 2852
														if (var45.childIndex < 0) { // L: 2853
															break;
														}

														var39 = class139.getWidget(var45.parentId); // L: 2854
													} while(var39 == null || var39.children == null || var45.childIndex >= var39.children.length || var45 != var39.children[var45.childIndex]); // L: 2855

													class19.runScriptEvent(var44); // L: 2859
												}
											}

											var45 = var44.widget; // L: 2840
											if (var45.childIndex < 0) { // L: 2841
												break;
											}

											var39 = class139.getWidget(var45.parentId); // L: 2842
										} while(var39 == null || var39.children == null || var45.childIndex >= var39.children.length || var45 != var39.children[var45.childIndex]); // L: 2843

										class19.runScriptEvent(var44); // L: 2847
									}
								}

								var45 = var44.widget; // L: 2828
								if (var45.childIndex < 0) { // L: 2829
									break;
								}

								var39 = class139.getWidget(var45.parentId); // L: 2830
							} while(var39 == null || var39.children == null || var45.childIndex >= var39.children.length || var45 != var39.children[var45.childIndex]); // L: 2831

							class19.runScriptEvent(var44); // L: 2835
						}
					}
				}
			}
		}
	} // L: 2472 2735

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-594125034"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = InterfaceParent.canvasWidth; // L: 3627
		int var2 = GameEngine.canvasHeight; // L: 3628
		if (super.contentWidth < var1) { // L: 3629
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight; // L: 3630
		}

		if (Login.clientPreferences != null) { // L: 3631
			try {
				class42.method511(class10.client, "resize", new Object[]{WorldMapScaleHandler.getWindowedMode()}); // L: 3633
			} catch (Throwable var4) { // L: 3635
			}
		}

	} // L: 3637

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-15264"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) { // L: 3640
			Archive.method4471(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 3641
			if (field811[var1]) { // L: 3642
				field812[var1] = true;
			}

			field704[var1] = field811[var1]; // L: 3643
			field811[var1] = false; // L: 3644
		}

		field810 = cycle; // L: 3646
		viewportX = -1; // L: 3647
		viewportY = -1; // L: 3648
		ScriptFrame.hoveredItemContainer = null; // L: 3649
		if (rootInterface != -1) { // L: 3650
			rootWidgetCount = 0; // L: 3651
			Skeleton.drawWidgets(rootInterface, 0, 0, InterfaceParent.canvasWidth, GameEngine.canvasHeight, 0, 0, -1); // L: 3652
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 3654
		if (showMouseCross) { // L: 3655
			if (mouseCrossColor == 1) { // L: 3656
				class18.crossSprites[mouseCrossState / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 3657
			}

			if (mouseCrossColor == 2) { // L: 3659
				class18.crossSprites[mouseCrossState / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 3660
			}
		}

		if (!isMenuOpen) { // L: 3663
			if (viewportX != -1) { // L: 3664
				WorldMapDecoration.method3105(viewportX, viewportY);
			}
		} else {
			BufferedSource.method5918(); // L: 3666
		}

		if (gameDrawingMode == 3) { // L: 3667
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 3668
				if (field704[var1]) { // L: 3669
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 3670
				} else if (field812[var1]) { // L: 3672
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 3673
				}
			}
		}

		class258.method4608(class26.Client_plane, Varcs.localPlayer.x, Varcs.localPlayer.y, field799); // L: 3677
		field799 = 0; // L: 3678
	} // L: 3679

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(Ldn;I)Z",
		garbageValue = "2074217891"
	)
	final boolean method1233(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 5328
		PacketBuffer var3 = var1.packetBuffer; // L: 5329
		if (var2 == null) { // L: 5330
			return false;
		} else {
			int var6;
			String var18;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 5332
					if (var1.field1388) { // L: 5333
						if (!var2.isAvailable(1)) { // L: 5334
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 5335
						var1.field1391 = 0; // L: 5336
						var1.field1388 = false; // L: 5337
					}

					var3.offset = 0; // L: 5339
					if (var3.method6529()) { // L: 5340
						if (!var2.isAvailable(1)) { // L: 5341
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 5342
						var1.field1391 = 0; // L: 5343
					}

					var1.field1388 = true; // L: 5345
					ServerPacket[] var4 = ItemLayer.ServerPacket_values(); // L: 5346
					var5 = var3.readSmartByteShortIsaac(); // L: 5347
					if (var5 < 0 || var5 >= var4.length) { // L: 5348
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 5349
					var1.serverPacketLength = var1.serverPacket.length; // L: 5350
				}

				if (var1.serverPacketLength == -1) { // L: 5352
					if (!var2.isAvailable(1)) { // L: 5353
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 5354
					var1.serverPacketLength = var3.array[0] & 255; // L: 5355
				}

				if (var1.serverPacketLength == -2) { // L: 5357
					if (!var2.isAvailable(2)) { // L: 5358
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 5359
					var3.offset = 0; // L: 5360
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 5361
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 5363
					return false;
				}

				var3.offset = 0; // L: 5364
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 5365
				var1.field1391 = 0; // L: 5366
				timer.method5577(); // L: 5367
				var1.field1393 = var1.field1392; // L: 5368
				var1.field1392 = var1.field1381; // L: 5369
				var1.field1381 = var1.serverPacket; // L: 5370
				int var17;
				Widget var57;
				if (ServerPacket.field2412 == var1.serverPacket) { // L: 5371
					var17 = var3.method6629(); // L: 5372
					var57 = class139.getWidget(var17); // L: 5373

					for (var6 = 0; var6 < var57.itemIds.length; ++var6) { // L: 5374
						var57.itemIds[var6] = -1; // L: 5375
						var57.itemIds[var6] = 0; // L: 5376
					}

					class29.invalidateWidget(var57); // L: 5378
					var1.serverPacket = null; // L: 5379
					return true; // L: 5380
				}

				Widget var19;
				boolean var73;
				if (ServerPacket.field2405 == var1.serverPacket) { // L: 5382
					var73 = var3.method6610() == 1; // L: 5383
					var5 = var3.readInt(); // L: 5384
					var19 = class139.getWidget(var5); // L: 5385
					if (var73 != var19.isHidden) { // L: 5386
						var19.isHidden = var73; // L: 5387
						class29.invalidateWidget(var19); // L: 5388
					}

					var1.serverPacket = null; // L: 5390
					return true; // L: 5391
				}

				if (ServerPacket.field2369 == var1.serverPacket) { // L: 5393
					class105.method2255(); // L: 5394
					runEnergy = var3.readUnsignedByte(); // L: 5395
					field803 = cycleCntr; // L: 5396
					var1.serverPacket = null; // L: 5397
					return true; // L: 5398
				}

				if (ServerPacket.field2370 == var1.serverPacket) { // L: 5400
					MusicPatchPcmStream.method4148(class203.field2327); // L: 5401
					var1.serverPacket = null; // L: 5402
					return true; // L: 5403
				}

				String var45;
				if (ServerPacket.field2435 == var1.serverPacket) { // L: 5405
					var45 = var3.readStringCp1252NullTerminated(); // L: 5406
					var18 = AbstractFont.escapeBrackets(GrandExchangeOfferAgeComparator.method4607(class16.method258(var3))); // L: 5407
					class69.addGameMessage(6, var45, var18); // L: 5408
					var1.serverPacket = null; // L: 5409
					return true; // L: 5410
				}

				if (ServerPacket.field2394 == var1.serverPacket) { // L: 5412
					var17 = var3.readInt(); // L: 5413
					var5 = var3.readUnsignedShort(); // L: 5414
					var19 = class139.getWidget(var17); // L: 5415
					if (var19.modelType != 1 || var5 != var19.modelId) { // L: 5416
						var19.modelType = 1; // L: 5417
						var19.modelId = var5; // L: 5418
						class29.invalidateWidget(var19); // L: 5419
					}

					var1.serverPacket = null; // L: 5421
					return true; // L: 5422
				}

				if (ServerPacket.field2432 == var1.serverPacket) { // L: 5424
					MusicPatchPcmStream.method4148(class203.field2335); // L: 5425
					var1.serverPacket = null; // L: 5426
					return true; // L: 5427
				}

				if (ServerPacket.field2378 == var1.serverPacket) { // L: 5429
					var17 = var3.readUnsignedByte(); // L: 5430
					if (var3.readUnsignedByte() == 0) { // L: 5431
						grandExchangeOffers[var17] = new GrandExchangeOffer(); // L: 5432
						var3.offset += 18; // L: 5433
					} else {
						--var3.offset; // L: 5436
						grandExchangeOffers[var17] = new GrandExchangeOffer(var3, false); // L: 5437
					}

					field801 = cycleCntr; // L: 5439
					var1.serverPacket = null; // L: 5440
					return true; // L: 5441
				}

				byte var56;
				if (ServerPacket.field2440 == var1.serverPacket) { // L: 5443
					field800 = cycleCntr; // L: 5444
					var56 = var3.readByte(); // L: 5445
					class19 var66 = new class19(var3); // L: 5446
					class3 var71;
					if (var56 >= 0) { // L: 5448
						var71 = field820[var56];
					} else {
						var71 = IsaacCipher.field4266; // L: 5449
					}

					var66.method286(var71); // L: 5450
					var1.serverPacket = null; // L: 5451
					return true; // L: 5452
				}

				long var7;
				long var20;
				String var22;
				int var53;
				if (ServerPacket.field2376 == var1.serverPacket) { // L: 5454
					var45 = var3.readStringCp1252NullTerminated(); // L: 5455
					var20 = (long)var3.readUnsignedShort(); // L: 5456
					var7 = (long)var3.readMedium(); // L: 5457
					PlayerType var9 = (PlayerType)UserComparator8.findEnumerated(WallDecoration.PlayerType_values(), var3.readUnsignedByte()); // L: 5458
					long var10 = var7 + (var20 << 32); // L: 5459
					boolean var12 = false; // L: 5460

					for (var53 = 0; var53 < 100; ++var53) { // L: 5461
						if (crossWorldMessageIds[var53] == var10) { // L: 5462
							var12 = true; // L: 5463
							break; // L: 5464
						}
					}

					if (class13.friendSystem.isIgnored(new Username(var45, AbstractUserComparator.loginType))) { // L: 5467
						var12 = true;
					}

					if (!var12 && field716 == 0) { // L: 5468
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var10; // L: 5469
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 5470
						var22 = AbstractFont.escapeBrackets(GrandExchangeOfferAgeComparator.method4607(class16.method258(var3))); // L: 5471
						byte var55;
						if (var9.isPrivileged) { // L: 5473
							var55 = 7;
						} else {
							var55 = 3; // L: 5474
						}

						if (var9.modIcon != -1) { // L: 5475
							class69.addGameMessage(var55, class337.method5986(var9.modIcon) + var45, var22);
						} else {
							class69.addGameMessage(var55, var45, var22); // L: 5476
						}
					}

					var1.serverPacket = null; // L: 5478
					return true; // L: 5479
				}

				if (ServerPacket.field2401 == var1.serverPacket) { // L: 5481
					isCameraLocked = false; // L: 5482

					for (var17 = 0; var17 < 5; ++var17) { // L: 5483
						field850[var17] = false;
					}

					var1.serverPacket = null; // L: 5484
					return true; // L: 5485
				}

				if (ServerPacket.field2411 == var1.serverPacket) { // L: 5487
					var56 = var3.method6678(); // L: 5488
					var5 = var3.method6766(); // L: 5489
					Varps.Varps_temp[var5] = var56; // L: 5490
					if (Varps.Varps_main[var5] != var56) { // L: 5491
						Varps.Varps_main[var5] = var56; // L: 5492
					}

					class27.changeGameOptions(var5); // L: 5494
					changedVarps[++changedVarpCount - 1 & 31] = var5; // L: 5495
					var1.serverPacket = null; // L: 5496
					return true; // L: 5497
				}

				if (ServerPacket.field2416 == var1.serverPacket) { // L: 5499
					ClanChat.field3818 = var3.method6609(); // L: 5500
					class18.field145 = var3.method6623(); // L: 5501

					while (var3.offset < var1.serverPacketLength) { // L: 5502
						var17 = var3.readUnsignedByte(); // L: 5503
						class203 var65 = AbstractWorldMapData.method3099()[var17]; // L: 5504
						MusicPatchPcmStream.method4148(var65); // L: 5505
					}

					var1.serverPacket = null; // L: 5507
					return true; // L: 5508
				}

				if (ServerPacket.field2380 == var1.serverPacket) { // L: 5510
					var45 = var3.readStringCp1252NullTerminated(); // L: 5511
					Object[] var64 = new Object[var45.length() + 1]; // L: 5512

					for (var6 = var45.length() - 1; var6 >= 0; --var6) { // L: 5513
						if (var45.charAt(var6) == 's') { // L: 5514
							var64[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var64[var6 + 1] = new Integer(var3.readInt()); // L: 5515
						}
					}

					var64[0] = new Integer(var3.readInt()); // L: 5517
					ScriptEvent var70 = new ScriptEvent(); // L: 5518
					var70.args = var64; // L: 5519
					class19.runScriptEvent(var70); // L: 5520
					var1.serverPacket = null; // L: 5521
					return true; // L: 5522
				}

				if (ServerPacket.field2385 == var1.serverPacket) { // L: 5524
					var45 = var3.readStringCp1252NullTerminated(); // L: 5525
					var5 = var3.method6609(); // L: 5526
					var6 = var3.readUnsignedByte(); // L: 5527
					if (var5 >= 1 && var5 <= 8) { // L: 5528
						if (var45.equalsIgnoreCase("null")) { // L: 5529
							var45 = null;
						}

						playerMenuActions[var5 - 1] = var45; // L: 5530
						playerOptionsPriorities[var5 - 1] = var6 == 0; // L: 5531
					}

					var1.serverPacket = null; // L: 5533
					return true; // L: 5534
				}

				String var68;
				if (ServerPacket.field2377 == var1.serverPacket) { // L: 5536
					byte[] var49 = new byte[var1.serverPacketLength]; // L: 5537
					var3.method6530(var49, 0, var49.length); // L: 5538
					Buffer var63 = new Buffer(var49); // L: 5539
					var68 = var63.readStringCp1252NullTerminated(); // L: 5540
					class302.openURL(var68, true, false); // L: 5541
					var1.serverPacket = null; // L: 5542
					return true; // L: 5543
				}

				if (ServerPacket.field2363 == var1.serverPacket) { // L: 5545
					for (var17 = 0; var17 < players.length; ++var17) { // L: 5546
						if (players[var17] != null) { // L: 5547
							players[var17].sequence = -1;
						}
					}

					for (var17 = 0; var17 < npcs.length; ++var17) { // L: 5549
						if (npcs[var17] != null) { // L: 5550
							npcs[var17].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 5552
					return true; // L: 5553
				}

				if (ServerPacket.field2419 == var1.serverPacket) { // L: 5555
					for (var17 = 0; var17 < VarpDefinition.VarpDefinition_fileCount; ++var17) { // L: 5556
						VarpDefinition var61 = class303.VarpDefinition_get(var17); // L: 5557
						if (var61 != null) { // L: 5558
							Varps.Varps_temp[var17] = 0; // L: 5559
							Varps.Varps_main[var17] = 0; // L: 5560
						}
					}

					class105.method2255(); // L: 5563
					changedVarpCount += 32; // L: 5564
					var1.serverPacket = null; // L: 5565
					return true; // L: 5566
				}

				if (ServerPacket.field2382 == var1.serverPacket) { // L: 5568
					var17 = var3.readUShortSmart(); // L: 5569
					boolean var58 = var3.readUnsignedByte() == 1; // L: 5570
					var68 = ""; // L: 5571
					boolean var76 = false; // L: 5572
					if (var58) { // L: 5573
						var68 = var3.readStringCp1252NullTerminated(); // L: 5574
						if (class13.friendSystem.isIgnored(new Username(var68, AbstractUserComparator.loginType))) { // L: 5575
							var76 = true;
						}
					}

					String var51 = var3.readStringCp1252NullTerminated(); // L: 5577
					if (!var76) { // L: 5578
						class69.addGameMessage(var17, var68, var51);
					}

					var1.serverPacket = null; // L: 5579
					return true; // L: 5580
				}

				if (ServerPacket.field2352 == var1.serverPacket) { // L: 5582
					hintArrowType = var3.readUnsignedByte(); // L: 5583
					if (hintArrowType == 1) { // L: 5584
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 5585
						if (hintArrowType == 2) { // L: 5586
							hintArrowSubX = 64; // L: 5587
							hintArrowSubY = 64; // L: 5588
						}

						if (hintArrowType == 3) { // L: 5590
							hintArrowSubX = 0; // L: 5591
							hintArrowSubY = 64; // L: 5592
						}

						if (hintArrowType == 4) { // L: 5594
							hintArrowSubX = 128; // L: 5595
							hintArrowSubY = 64; // L: 5596
						}

						if (hintArrowType == 5) { // L: 5598
							hintArrowSubX = 64; // L: 5599
							hintArrowSubY = 0; // L: 5600
						}

						if (hintArrowType == 6) { // L: 5602
							hintArrowSubX = 64; // L: 5603
							hintArrowSubY = 128; // L: 5604
						}

						hintArrowType = 2; // L: 5606
						hintArrowX = var3.readUnsignedShort(); // L: 5607
						hintArrowY = var3.readUnsignedShort(); // L: 5608
						hintArrowHeight = var3.readUnsignedByte(); // L: 5609
					}

					if (hintArrowType == 10) { // L: 5611
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 5612
					return true; // L: 5613
				}

				if (ServerPacket.field2441 == var1.serverPacket) { // L: 5615
					Coord.field2591 = new class338(FriendSystem.field910); // L: 5616
					var1.serverPacket = null; // L: 5617
					return true; // L: 5618
				}

				if (ServerPacket.field2425 == var1.serverPacket) { // L: 5620
					MusicPatchPcmStream.method4148(class203.field2334); // L: 5621
					var1.serverPacket = null; // L: 5622
					return true; // L: 5623
				}

				if (ServerPacket.field2365 == var1.serverPacket) { // L: 5625
					var73 = var3.readBoolean(); // L: 5626
					if (var73) { // L: 5627
						if (class105.field1331 == null) { // L: 5628
							class105.field1331 = new class263();
						}
					} else {
						class105.field1331 = null; // L: 5630
					}

					var1.serverPacket = null; // L: 5631
					return true; // L: 5632
				}

				if (ServerPacket.field2353 == var1.serverPacket) { // L: 5634
					rebootTimer = var3.method6766() * 30; // L: 5635
					field803 = cycleCntr; // L: 5636
					var1.serverPacket = null; // L: 5637
					return true; // L: 5638
				}

				int var23;
				Widget var50;
				if (ServerPacket.field2395 == var1.serverPacket) { // L: 5640
					var17 = var3.readUnsignedShort(); // L: 5641
					var5 = var3.method6617(); // L: 5642
					var6 = var3.method6628(); // L: 5643
					var23 = var3.method6766(); // L: 5644
					var50 = class139.getWidget(var6); // L: 5645
					if (var23 != var50.modelAngleX || var5 != var50.modelAngleY || var17 != var50.modelZoom) { // L: 5646
						var50.modelAngleX = var23; // L: 5647
						var50.modelAngleY = var5; // L: 5648
						var50.modelZoom = var17; // L: 5649
						class29.invalidateWidget(var50); // L: 5650
					}

					var1.serverPacket = null; // L: 5652
					return true; // L: 5653
				}

				if (ServerPacket.field2387 == var1.serverPacket) { // L: 5655
					var17 = var3.readInt(); // L: 5656
					var5 = var3.readInt(); // L: 5657
					var6 = class80.getGcDuration(); // L: 5658
					PacketBufferNode var72 = ObjectComposition.getPacketBufferNode(ClientPacket.field2297, packetWriter.isaacCipher); // L: 5660
					var72.packetBuffer.writeShortLE(GameEngine.fps); // L: 5661
					var72.packetBuffer.method6624(var17); // L: 5662
					var72.packetBuffer.writeInt(var5); // L: 5663
					var72.packetBuffer.method6606(var6); // L: 5664
					packetWriter.addNode(var72); // L: 5665
					var1.serverPacket = null; // L: 5666
					return true; // L: 5667
				}

				if (ServerPacket.field2354 == var1.serverPacket) { // L: 5669
					class13.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 5670
					class1.FriendSystem_invalidateIgnoreds(); // L: 5671
					field797 = cycleCntr; // L: 5672
					var1.serverPacket = null; // L: 5673
					return true; // L: 5674
				}

				if (ServerPacket.field2361 == var1.serverPacket) { // L: 5676
					class11.updatePlayers(var3, var1.serverPacketLength); // L: 5677
					TaskHandler.method2523(); // L: 5678
					var1.serverPacket = null; // L: 5679
					return true; // L: 5680
				}

				if (ServerPacket.field2384 == var1.serverPacket) { // L: 5682
					var17 = var3.method6766(); // L: 5683
					var5 = var3.method6629(); // L: 5684
					var19 = class139.getWidget(var5); // L: 5685
					if (var19.modelType != 2 || var17 != var19.modelId) { // L: 5686
						var19.modelType = 2; // L: 5687
						var19.modelId = var17; // L: 5688
						class29.invalidateWidget(var19); // L: 5689
					}

					var1.serverPacket = null; // L: 5691
					return true; // L: 5692
				}

				if (ServerPacket.field2355 == var1.serverPacket) { // L: 5694
					MusicPatchPcmStream.method4148(class203.field2331); // L: 5695
					var1.serverPacket = null; // L: 5696
					return true; // L: 5697
				}

				if (ServerPacket.field2442 == var1.serverPacket) { // L: 5699
					Coord.field2591 = null; // L: 5700
					var1.serverPacket = null; // L: 5701
					return true; // L: 5702
				}

				Widget var24;
				if (ServerPacket.field2364 == var1.serverPacket) { // L: 5704
					var17 = var3.method6621(); // L: 5705
					var5 = var3.method6622(); // L: 5706
					var6 = var3.method6629(); // L: 5707
					var24 = class139.getWidget(var6); // L: 5708
					if (var17 != var24.rawX || var5 != var24.rawY || var24.xAlignment != 0 || var24.yAlignment != 0) { // L: 5709
						var24.rawX = var17; // L: 5710
						var24.rawY = var5; // L: 5711
						var24.xAlignment = 0; // L: 5712
						var24.yAlignment = 0; // L: 5713
						class29.invalidateWidget(var24); // L: 5714
						this.alignWidget(var24); // L: 5715
						if (var24.type == 0) { // L: 5716
							UserList.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var6 >> 16], var24, false);
						}
					}

					var1.serverPacket = null; // L: 5718
					return true; // L: 5719
				}

				if (ServerPacket.field2445 == var1.serverPacket) { // L: 5721
					field800 = cycleCntr; // L: 5722
					var56 = var3.readByte(); // L: 5723
					if (var1.serverPacketLength == 1) { // L: 5724
						if (var56 >= 0) { // L: 5725
							field820[var56] = null;
						} else {
							IsaacCipher.field4266 = null; // L: 5726
						}

						var1.serverPacket = null; // L: 5727
						return true; // L: 5728
					}

					if (var56 >= 0) { // L: 5730
						field820[var56] = new class3(var3); // L: 5731
					} else {
						IsaacCipher.field4266 = new class3(var3); // L: 5734
					}

					var1.serverPacket = null; // L: 5736
					return true; // L: 5737
				}

				if (ServerPacket.field2430 == var1.serverPacket) { // L: 5739
					var17 = var3.readUnsignedShort(); // L: 5740
					var5 = var3.readUnsignedByte(); // L: 5741
					var6 = var3.readUnsignedShort(); // L: 5742
					ArchiveDiskAction.queueSoundEffect(var17, var5, var6); // L: 5743
					var1.serverPacket = null; // L: 5744
					return true; // L: 5745
				}

				if (ServerPacket.field2396 == var1.serverPacket) { // L: 5747
					var17 = var3.readInt(); // L: 5748
					InterfaceParent var60 = (InterfaceParent)interfaceParents.get((long)var17); // L: 5749
					if (var60 != null) { // L: 5750
						WorldMapData_1.closeInterface(var60, true);
					}

					if (meslayerContinueWidget != null) { // L: 5751
						class29.invalidateWidget(meslayerContinueWidget); // L: 5752
						meslayerContinueWidget = null; // L: 5753
					}

					var1.serverPacket = null; // L: 5755
					return true; // L: 5756
				}

				InterfaceParent var69;
				if (ServerPacket.field2448 == var1.serverPacket) { // L: 5758
					var17 = var3.method6629(); // L: 5759
					var5 = var3.method6766(); // L: 5760
					var6 = var3.method6623(); // L: 5761
					var69 = (InterfaceParent)interfaceParents.get((long)var17); // L: 5762
					if (var69 != null) { // L: 5763
						WorldMapData_1.closeInterface(var69, var5 != var69.group);
					}

					Player.method2151(var17, var5, var6); // L: 5764
					var1.serverPacket = null; // L: 5765
					return true; // L: 5766
				}

				if (ServerPacket.field2362 == var1.serverPacket) { // L: 5768
					class13.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 5769
					field797 = cycleCntr; // L: 5770
					var1.serverPacket = null; // L: 5771
					return true; // L: 5772
				}

				if (ServerPacket.field2402 == var1.serverPacket) { // L: 5774
					var3.offset += 28; // L: 5775
					if (var3.checkCrc()) { // L: 5776
						WorldMapLabelSize.method2679(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 5777
					return true; // L: 5778
				}

				if (ServerPacket.field2351 == var1.serverPacket) { // L: 5780
					for (var17 = 0; var17 < Varps.Varps_main.length; ++var17) { // L: 5781
						if (Varps.Varps_main[var17] != Varps.Varps_temp[var17]) { // L: 5782
							Varps.Varps_main[var17] = Varps.Varps_temp[var17]; // L: 5783
							class27.changeGameOptions(var17); // L: 5784
							changedVarps[++changedVarpCount - 1 & 31] = var17; // L: 5785
						}
					}

					var1.serverPacket = null; // L: 5788
					return true; // L: 5789
				}

				if (ServerPacket.field2422 == var1.serverPacket) { // L: 5791
					Canvas.privateChatMode = MidiPcmStream.method3952(var3.readUnsignedByte()); // L: 5792
					var1.serverPacket = null; // L: 5793
					return true; // L: 5794
				}

				int var25;
				int var26;
				int var28;
				long var29;
				if (ServerPacket.field2408 == var1.serverPacket) { // L: 5796
					var17 = var3.offset + var1.serverPacketLength; // L: 5797
					var5 = var3.readUnsignedShort(); // L: 5798
					var6 = var3.readUnsignedShort(); // L: 5799
					if (var5 != rootInterface) { // L: 5800
						rootInterface = var5; // L: 5801
						this.resizeRoot(false); // L: 5802
						PlayerComposition.Widget_resetModelFrames(rootInterface); // L: 5803
						AbstractSocket.runWidgetOnLoadListener(rootInterface); // L: 5804

						for (var23 = 0; var23 < 100; ++var23) { // L: 5805
							field811[var23] = true;
						}
					}

					InterfaceParent var75;
					for (; var6-- > 0; var75.field1136 = true) { // L: 5807 5817
						var23 = var3.readInt(); // L: 5808
						var25 = var3.readUnsignedShort(); // L: 5809
						var26 = var3.readUnsignedByte(); // L: 5810
						var75 = (InterfaceParent)interfaceParents.get((long)var23); // L: 5811
						if (var75 != null && var25 != var75.group) { // L: 5812
							WorldMapData_1.closeInterface(var75, true); // L: 5813
							var75 = null; // L: 5814
						}

						if (var75 == null) { // L: 5816
							var75 = Player.method2151(var23, var25, var26);
						}
					}

					for (var69 = (InterfaceParent)interfaceParents.first(); var69 != null; var69 = (InterfaceParent)interfaceParents.next()) { // L: 5819
						if (var69.field1136) { // L: 5820
							var69.field1136 = false;
						} else {
							WorldMapData_1.closeInterface(var69, true); // L: 5822
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 5825

					while (var3.offset < var17) { // L: 5826
						var23 = var3.readInt(); // L: 5827
						var25 = var3.readUnsignedShort(); // L: 5828
						var26 = var3.readUnsignedShort(); // L: 5829
						var28 = var3.readInt(); // L: 5830

						for (int var52 = var25; var52 <= var26; ++var52) { // L: 5831
							var29 = ((long)var23 << 32) + (long)var52; // L: 5832
							widgetFlags.put(new IntegerNode(var28), var29); // L: 5833
						}
					}

					var1.serverPacket = null; // L: 5836
					return true; // L: 5837
				}

				if (ServerPacket.field2357 == var1.serverPacket) { // L: 5839
					if (rootInterface != -1) { // L: 5840
						class379.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 5841
					return true; // L: 5842
				}

				if (ServerPacket.field2434 == var1.serverPacket) { // L: 5844
					World var48 = new World(); // L: 5845
					var48.host = var3.readStringCp1252NullTerminated(); // L: 5846
					var48.id = var3.readUnsignedShort(); // L: 5847
					var5 = var3.readInt(); // L: 5848
					var48.properties = var5; // L: 5849
					class20.updateGameState(45); // L: 5850
					var2.close(); // L: 5851
					var2 = null; // L: 5852
					class148.changeWorld(var48); // L: 5853
					var1.serverPacket = null; // L: 5854
					return false; // L: 5855
				}

				long var31;
				if (ServerPacket.field2439 == var1.serverPacket) { // L: 5857
					var56 = var3.readByte(); // L: 5858
					var20 = (long)var3.readUnsignedShort(); // L: 5859
					var7 = (long)var3.readMedium(); // L: 5860
					var31 = (var20 << 32) + var7; // L: 5861
					boolean var11 = false; // L: 5862
					class3 var33 = var56 >= 0 ? field820[var56] : IsaacCipher.field4266; // L: 5863
					if (var33 == null) { // L: 5864
						var11 = true;
					} else {
						for (var53 = 0; var53 < 100; ++var53) { // L: 5866
							if (crossWorldMessageIds[var53] == var31) { // L: 5867
								var11 = true; // L: 5868
								break; // L: 5869
							}
						}
					}

					if (!var11) { // L: 5873
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var31; // L: 5874
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 5875
						var22 = class16.method258(var3); // L: 5876
						int var54 = var56 >= 0 ? 43 : 46; // L: 5877
						Projectile.addChatMessage(var54, "", var22, var33.field25); // L: 5878
					}

					var1.serverPacket = null; // L: 5880
					return true; // L: 5881
				}

				if (ServerPacket.field2415 == var1.serverPacket) { // L: 5883
					isCameraLocked = true; // L: 5884
					ModeWhere.field3368 = var3.readUnsignedByte(); // L: 5885
					AttackOption.field1339 = var3.readUnsignedByte(); // L: 5886
					class2.field15 = var3.readUnsignedShort(); // L: 5887
					Players.field1363 = var3.readUnsignedByte(); // L: 5888
					class0.field6 = var3.readUnsignedByte(); // L: 5889
					if (class0.field6 >= 100) { // L: 5890
						var17 = ModeWhere.field3368 * 128 + 64; // L: 5891
						var5 = AttackOption.field1339 * 128 + 64; // L: 5892
						var6 = UserComparator7.getTileHeight(var17, var5, class26.Client_plane) - class2.field15; // L: 5893
						var23 = var17 - ModeWhere.cameraX; // L: 5894
						var25 = var6 - WorldMapRectangle.cameraY; // L: 5895
						var26 = var5 - ReflectionCheck.cameraZ; // L: 5896
						var28 = (int)Math.sqrt((double)(var26 * var26 + var23 * var23)); // L: 5897
						WorldMapArea.cameraPitch = (int)(Math.atan2((double)var25, (double)var28) * 325.949D) & 2047; // L: 5898
						class69.cameraYaw = (int)(Math.atan2((double)var23, (double)var26) * -325.949D) & 2047; // L: 5899
						if (WorldMapArea.cameraPitch < 128) { // L: 5900
							WorldMapArea.cameraPitch = 128;
						}

						if (WorldMapArea.cameraPitch > 383) { // L: 5901
							WorldMapArea.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 5903
					return true; // L: 5904
				}

				if (ServerPacket.field2358 == var1.serverPacket) { // L: 5906
					minimapState = var3.readUnsignedByte(); // L: 5907
					var1.serverPacket = null; // L: 5908
					return true; // L: 5909
				}

				if (ServerPacket.field2392 == var1.serverPacket) { // L: 5911
					var17 = var3.method6629(); // L: 5912
					var5 = var3.method6718(); // L: 5913
					var19 = class139.getWidget(var17); // L: 5914
					if (var5 != var19.sequenceId || var5 == -1) { // L: 5915
						var19.sequenceId = var5; // L: 5916
						var19.modelFrame = 0; // L: 5917
						var19.modelFrameCycle = 0; // L: 5918
						class29.invalidateWidget(var19); // L: 5919
					}

					var1.serverPacket = null; // L: 5921
					return true; // L: 5922
				}

				if (ServerPacket.field2424 == var1.serverPacket) { // L: 5924
					var73 = var3.readUnsignedByte() == 1; // L: 5925
					if (var73) { // L: 5926
						HealthBarUpdate.field1272 = ObjectSound.currentTimeMillis() - var3.readLong(); // L: 5927
						Calendar.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 5928
					} else {
						Calendar.grandExchangeEvents = null; // L: 5930
					}

					field802 = cycleCntr; // L: 5931
					var1.serverPacket = null; // L: 5932
					return true; // L: 5933
				}

				if (ServerPacket.field2404 == var1.serverPacket) { // L: 5935
					MusicPatchPcmStream.method4148(class203.field2328); // L: 5936
					var1.serverPacket = null; // L: 5937
					return true; // L: 5938
				}

				if (ServerPacket.field2393 == var1.serverPacket) { // L: 5940
					if (InterfaceParent.clanChat != null) { // L: 5941
						InterfaceParent.clanChat.method5653(var3); // L: 5942
					}

					class159.method3121(); // L: 5944
					var1.serverPacket = null; // L: 5945
					return true; // L: 5946
				}

				if (ServerPacket.field2390 == var1.serverPacket) { // L: 5948
					var17 = var3.method6617(); // L: 5949
					if (var17 == 65535) { // L: 5950
						var17 = -1;
					}

					var5 = var3.method6628(); // L: 5951
					var6 = var3.method6748(); // L: 5952
					if (var6 == 65535) { // L: 5953
						var6 = -1;
					}

					var23 = var3.readInt(); // L: 5954

					for (var25 = var17; var25 <= var6; ++var25) { // L: 5955
						var31 = ((long)var5 << 32) + (long)var25; // L: 5956
						Node var77 = widgetFlags.get(var31); // L: 5957
						if (var77 != null) { // L: 5958
							var77.remove();
						}

						widgetFlags.put(new IntegerNode(var23), var31); // L: 5959
					}

					var1.serverPacket = null; // L: 5961
					return true; // L: 5962
				}

				if (ServerPacket.field2418 == var1.serverPacket) { // L: 5964
					Players.loadRegions(true, var1.packetBuffer); // L: 5965
					var1.serverPacket = null; // L: 5966
					return true; // L: 5967
				}

				if (ServerPacket.field2413 == var1.serverPacket) { // L: 5969
					var17 = var3.method6628(); // L: 5970
					var5 = var3.readUnsignedShort(); // L: 5971
					var6 = var3.readUnsignedShort(); // L: 5972
					var24 = class139.getWidget(var17); // L: 5973
					var24.field2680 = var5 + (var6 << 16); // L: 5974
					var1.serverPacket = null; // L: 5975
					return true; // L: 5976
				}

				if (ServerPacket.field2366 == var1.serverPacket) { // L: 5978
					var45 = var3.readStringCp1252NullTerminated(); // L: 5979
					var5 = var3.method6627(); // L: 5980
					var19 = class139.getWidget(var5); // L: 5981
					if (!var45.equals(var19.text)) { // L: 5982
						var19.text = var45; // L: 5983
						class29.invalidateWidget(var19); // L: 5984
					}

					var1.serverPacket = null; // L: 5986
					return true; // L: 5987
				}

				if (ServerPacket.field2427 == var1.serverPacket) { // L: 5989
					MusicPatchPcmStream.method4148(class203.field2332); // L: 5990
					var1.serverPacket = null; // L: 5991
					return true; // L: 5992
				}

				if (ServerPacket.field2446 == var1.serverPacket) { // L: 5994
					var17 = var3.method6748(); // L: 5995
					if (var17 == 65535) { // L: 5996
						var17 = -1;
					}

					class4.playSong(var17); // L: 5997
					var1.serverPacket = null; // L: 5998
					return true; // L: 5999
				}

				if (ServerPacket.field2428 == var1.serverPacket) { // L: 6001
					var17 = var3.method6642(); // L: 6002
					var5 = var3.method6766(); // L: 6003
					if (var5 == 65535) { // L: 6004
						var5 = -1;
					}

					HealthBarUpdate.method2175(var5, var17); // L: 6005
					var1.serverPacket = null; // L: 6006
					return true; // L: 6007
				}

				if (ServerPacket.field2437 == var1.serverPacket) { // L: 6009
					UserComparator4.updateNpcs(true, var3, true); // L: 6010
					var1.serverPacket = null; // L: 6011
					return true; // L: 6012
				}

				if (ServerPacket.field2386 == var1.serverPacket) { // L: 6014
					MusicPatchPcmStream.method4148(class203.field2330); // L: 6015
					var1.serverPacket = null; // L: 6016
					return true; // L: 6017
				}

				if (ServerPacket.field2372 == var1.serverPacket) { // L: 6019
					MusicPatchPcmStream.method4148(class203.field2329); // L: 6020
					var1.serverPacket = null; // L: 6021
					return true; // L: 6022
				}

				if (ServerPacket.field2356 == var1.serverPacket) { // L: 6024
					MusicPatchPcmStream.method4148(class203.field2339); // L: 6025
					var1.serverPacket = null; // L: 6026
					return true; // L: 6027
				}

				if (ServerPacket.field2423 == var1.serverPacket) { // L: 6029
					var17 = var3.method6629(); // L: 6030
					var5 = var3.method6629(); // L: 6031
					InterfaceParent var67 = (InterfaceParent)interfaceParents.get((long)var5); // L: 6032
					var69 = (InterfaceParent)interfaceParents.get((long)var17); // L: 6033
					if (var69 != null) { // L: 6034
						WorldMapData_1.closeInterface(var69, var67 == null || var67.group != var69.group);
					}

					if (var67 != null) { // L: 6035
						var67.remove(); // L: 6036
						interfaceParents.put(var67, (long)var17); // L: 6037
					}

					var50 = class139.getWidget(var5); // L: 6039
					if (var50 != null) { // L: 6040
						class29.invalidateWidget(var50);
					}

					var50 = class139.getWidget(var17); // L: 6041
					if (var50 != null) { // L: 6042
						class29.invalidateWidget(var50); // L: 6043
						UserList.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var50.id >>> 16], var50, true); // L: 6044
					}

					if (rootInterface != -1) { // L: 6046
						class379.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 6047
					return true; // L: 6048
				}

				if (ServerPacket.field2429 == var1.serverPacket) { // L: 6050
					UserComparator4.updateNpcs(false, var3, true); // L: 6051
					var1.serverPacket = null; // L: 6052
					return true; // L: 6053
				}

				if (ServerPacket.field2367 == var1.serverPacket) { // L: 6055
					class23.logOut(); // L: 6056
					var1.serverPacket = null; // L: 6057
					return false; // L: 6058
				}

				int var15;
				String var42;
				if (ServerPacket.field2438 == var1.serverPacket) { // L: 6060
					var56 = var3.readByte(); // L: 6061
					var18 = var3.readStringCp1252NullTerminated(); // L: 6062
					long var35 = (long)var3.readUnsignedShort(); // L: 6063
					long var37 = (long)var3.readMedium(); // L: 6064
					PlayerType var74 = (PlayerType)UserComparator8.findEnumerated(WallDecoration.PlayerType_values(), var3.readUnsignedByte()); // L: 6065
					long var39 = var37 + (var35 << 32); // L: 6066
					boolean var13 = false; // L: 6067
					class3 var41 = null; // L: 6068
					var41 = var56 >= 0 ? field820[var56] : IsaacCipher.field4266; // L: 6070
					if (var41 == null) { // L: 6071
						var13 = true; // L: 6072
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var74.isUser && class13.friendSystem.isIgnored(new Username(var18, AbstractUserComparator.loginType))) { // L: 6081 6082
									var13 = true;
								}
								break;
							}

							if (var39 == crossWorldMessageIds[var15]) { // L: 6076
								var13 = true; // L: 6077
								break; // L: 6078
							}

							++var15; // L: 6075
						}
					}

					if (!var13) { // L: 6085
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var39; // L: 6086
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6087
						var42 = AbstractFont.escapeBrackets(class16.method258(var3)); // L: 6088
						int var16 = var56 >= 0 ? 41 : 44; // L: 6089
						if (var74.modIcon != -1) { // L: 6090
							Projectile.addChatMessage(var16, class337.method5986(var74.modIcon) + var18, var42, var41.field25);
						} else {
							Projectile.addChatMessage(var16, var18, var42, var41.field25); // L: 6091
						}
					}

					var1.serverPacket = null; // L: 6093
					return true; // L: 6094
				}

				if (ServerPacket.field2414 == var1.serverPacket) { // L: 6096
					class18.field145 = var3.method6610(); // L: 6097
					ClanChat.field3818 = var3.method6623(); // L: 6098
					var1.serverPacket = null; // L: 6099
					return true; // L: 6100
				}

				if (ServerPacket.field2374 == var1.serverPacket) { // L: 6102
					var17 = var3.readUnsignedByte(); // L: 6103
					ItemContainer.forceDisconnect(var17); // L: 6104
					var1.serverPacket = null; // L: 6105
					return false; // L: 6106
				}

				if (ServerPacket.field2431 == var1.serverPacket) { // L: 6108
					UserComparator4.updateNpcs(true, var3, false); // L: 6109
					var1.serverPacket = null; // L: 6110
					return true; // L: 6111
				}

				if (ServerPacket.field2379 == var1.serverPacket) { // L: 6113
					var17 = var3.readInt(); // L: 6114
					var5 = var3.method6617(); // L: 6115
					var19 = class139.getWidget(var17); // L: 6116
					if (var19 != null && var19.type == 0) { // L: 6117
						if (var5 > var19.scrollHeight - var19.height) { // L: 6118
							var5 = var19.scrollHeight - var19.height;
						}

						if (var5 < 0) { // L: 6119
							var5 = 0;
						}

						if (var5 != var19.scrollY) { // L: 6120
							var19.scrollY = var5; // L: 6121
							class29.invalidateWidget(var19); // L: 6122
						}
					}

					var1.serverPacket = null; // L: 6125
					return true; // L: 6126
				}

				if (ServerPacket.field2391 == var1.serverPacket) { // L: 6128
					var17 = var3.readUnsignedByte(); // L: 6129
					var5 = var3.readUnsignedByte(); // L: 6130
					var6 = var3.readUnsignedByte(); // L: 6131
					var23 = var3.readUnsignedByte(); // L: 6132
					field850[var17] = true; // L: 6133
					field601[var17] = var5; // L: 6134
					field698[var17] = var6; // L: 6135
					field853[var17] = var23; // L: 6136
					field854[var17] = 0; // L: 6137
					var1.serverPacket = null; // L: 6138
					return true; // L: 6139
				}

				if (ServerPacket.field2417 == var1.serverPacket) { // L: 6141
					isCameraLocked = true; // L: 6142
					class5.field40 = var3.readUnsignedByte(); // L: 6143
					ApproximateRouteStrategy.field592 = var3.readUnsignedByte(); // L: 6144
					WorldMapLabelSize.field1569 = var3.readUnsignedShort(); // L: 6145
					Skeleton.field1927 = var3.readUnsignedByte(); // L: 6146
					UserComparator9.field1435 = var3.readUnsignedByte(); // L: 6147
					if (UserComparator9.field1435 >= 100) { // L: 6148
						ModeWhere.cameraX = class5.field40 * 128 + 64; // L: 6149
						ReflectionCheck.cameraZ = ApproximateRouteStrategy.field592 * 128 + 64; // L: 6150
						WorldMapRectangle.cameraY = UserComparator7.getTileHeight(ModeWhere.cameraX, ReflectionCheck.cameraZ, class26.Client_plane) - WorldMapLabelSize.field1569; // L: 6151
					}

					var1.serverPacket = null; // L: 6153
					return true; // L: 6154
				}

				if (ServerPacket.field2400 == var1.serverPacket) { // L: 6156
					class105.method2255(); // L: 6157
					var17 = var3.method6609(); // L: 6158
					var5 = var3.method6628(); // L: 6159
					var6 = var3.method6623(); // L: 6160
					experience[var6] = var5; // L: 6161
					currentLevels[var6] = var17; // L: 6162
					levels[var6] = 1; // L: 6163

					for (var23 = 0; var23 < 98; ++var23) { // L: 6164
						if (var5 >= Skills.Skills_experienceTable[var23]) {
							levels[var6] = var23 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var6; // L: 6165
					var1.serverPacket = null; // L: 6166
					return true; // L: 6167
				}

				if (ServerPacket.field2443 == var1.serverPacket) { // L: 6169
					field786 = cycleCntr; // L: 6170
					var56 = var3.readByte(); // L: 6171
					if (var1.serverPacketLength == 1) { // L: 6172
						if (var56 >= 0) { // L: 6173
							field831[var56] = null;
						} else {
							ObjectSound.field928 = null; // L: 6174
						}

						var1.serverPacket = null; // L: 6175
						return true; // L: 6176
					}

					if (var56 >= 0) { // L: 6178
						field831[var56] = new class11(var3); // L: 6179
					} else {
						ObjectSound.field928 = new class11(var3); // L: 6182
					}

					var1.serverPacket = null; // L: 6184
					return true; // L: 6185
				}

				if (ServerPacket.field2375 == var1.serverPacket) { // L: 6187
					var17 = var3.method6766(); // L: 6188
					var5 = var3.method6627(); // L: 6189
					Varps.Varps_temp[var17] = var5; // L: 6190
					if (Varps.Varps_main[var17] != var5) { // L: 6191
						Varps.Varps_main[var17] = var5; // L: 6192
					}

					class27.changeGameOptions(var17); // L: 6194
					changedVarps[++changedVarpCount - 1 & 31] = var17; // L: 6195
					var1.serverPacket = null; // L: 6196
					return true; // L: 6197
				}

				if (ServerPacket.field2407 == var1.serverPacket) { // L: 6199
					class18.field145 = var3.method6609(); // L: 6200
					ClanChat.field3818 = var3.method6610(); // L: 6201

					for (var17 = class18.field145; var17 < class18.field145 + 8; ++var17) { // L: 6202
						for (var5 = ClanChat.field3818; var5 < ClanChat.field3818 + 8; ++var5) { // L: 6203
							if (groundItems[class26.Client_plane][var17][var5] != null) { // L: 6204
								groundItems[class26.Client_plane][var17][var5] = null; // L: 6205
								class225.updateItemPile(var17, var5); // L: 6206
							}
						}
					}

					for (PendingSpawn var47 = (PendingSpawn)pendingSpawns.last(); var47 != null; var47 = (PendingSpawn)pendingSpawns.previous()) { // L: 6210 6211 6213
						if (var47.x >= class18.field145 && var47.x < class18.field145 + 8 && var47.y >= ClanChat.field3818 && var47.y < ClanChat.field3818 + 8 && var47.plane == class26.Client_plane) { // L: 6212
							var47.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 6215
					return true; // L: 6216
				}

				if (ServerPacket.field2368 == var1.serverPacket) { // L: 6218
					var17 = var3.readInt(); // L: 6219
					var5 = var3.readUnsignedShort(); // L: 6220
					if (var17 < -70000) { // L: 6221
						var5 += 32768;
					}

					if (var17 >= 0) { // L: 6223
						var19 = class139.getWidget(var17);
					} else {
						var19 = null; // L: 6224
					}

					for (; var3.offset < var1.serverPacketLength; SecureRandomFuture.itemContainerSetItem(var5, var23, var25 - 1, var26)) { // L: 6225 6239
						var23 = var3.readUShortSmart(); // L: 6226
						var25 = var3.readUnsignedShort(); // L: 6227
						var26 = 0; // L: 6228
						if (var25 != 0) { // L: 6229
							var26 = var3.readUnsignedByte(); // L: 6230
							if (var26 == 255) { // L: 6231
								var26 = var3.readInt();
							}
						}

						if (var19 != null && var23 >= 0 && var23 < var19.itemIds.length) { // L: 6233 6234
							var19.itemIds[var23] = var25; // L: 6235
							var19.itemQuantities[var23] = var26; // L: 6236
						}
					}

					if (var19 != null) { // L: 6241
						class29.invalidateWidget(var19);
					}

					class105.method2255(); // L: 6242
					changedItemContainers[++field791 - 1 & 31] = var5 & 32767; // L: 6243
					var1.serverPacket = null; // L: 6244
					return true; // L: 6245
				}

				if (ServerPacket.field2433 == var1.serverPacket) { // L: 6247
					var17 = var3.readInt(); // L: 6248
					if (var17 != field684) { // L: 6249
						field684 = var17; // L: 6250
						class9.method119(); // L: 6251
					}

					var1.serverPacket = null; // L: 6253
					return true; // L: 6254
				}

				if (ServerPacket.field2359 == var1.serverPacket) { // L: 6256
					publicChatMode = var3.method6623(); // L: 6257
					tradeChatMode = var3.readUnsignedByte(); // L: 6258
					var1.serverPacket = null; // L: 6259
					return true; // L: 6260
				}

				if (ServerPacket.field2403 == var1.serverPacket) { // L: 6262
					var17 = var3.readInt(); // L: 6263
					var5 = var3.readUnsignedShort(); // L: 6264
					if (var5 == 65535) { // L: 6265
						var5 = -1;
					}

					var6 = var3.method6629(); // L: 6266
					var24 = class139.getWidget(var17); // L: 6267
					ItemComposition var8;
					if (!var24.isIf3) { // L: 6268
						if (var5 == -1) { // L: 6269
							var24.modelType = 0; // L: 6270
							var1.serverPacket = null; // L: 6271
							return true; // L: 6272
						}

						var8 = class23.ItemDefinition_get(var5); // L: 6274
						var24.modelType = 4; // L: 6275
						var24.modelId = var5; // L: 6276
						var24.modelAngleX = var8.xan2d; // L: 6277
						var24.modelAngleY = var8.yan2d; // L: 6278
						var24.modelZoom = var8.zoom2d * 100 / var6; // L: 6279
						class29.invalidateWidget(var24); // L: 6280
					} else {
						var24.itemId = var5; // L: 6283
						var24.itemQuantity = var6; // L: 6284
						var8 = class23.ItemDefinition_get(var5); // L: 6285
						var24.modelAngleX = var8.xan2d; // L: 6286
						var24.modelAngleY = var8.yan2d; // L: 6287
						var24.modelAngleZ = var8.zan2d; // L: 6288
						var24.modelOffsetX = var8.offsetX2d; // L: 6289
						var24.modelOffsetY = var8.offsetY2d; // L: 6290
						var24.modelZoom = var8.zoom2d; // L: 6291
						if (var8.isStackable == 1) { // L: 6292
							var24.itemQuantityMode = 1;
						} else {
							var24.itemQuantityMode = 2; // L: 6293
						}

						if (var24.field2720 > 0) { // L: 6294
							var24.modelZoom = var24.modelZoom * 32 / var24.field2720;
						} else if (var24.rawWidth > 0) { // L: 6295
							var24.modelZoom = var24.modelZoom * 32 / var24.rawWidth;
						}

						class29.invalidateWidget(var24); // L: 6296
					}

					var1.serverPacket = null; // L: 6298
					return true; // L: 6299
				}

				if (ServerPacket.field2383 == var1.serverPacket) { // L: 6301
					var17 = var3.readUnsignedByte(); // L: 6302
					Actor.method2174(var17); // L: 6303
					var1.serverPacket = null; // L: 6304
					return true; // L: 6305
				}

				if (ServerPacket.field2444 == var1.serverPacket) { // L: 6307
					field786 = cycleCntr; // L: 6308
					var56 = var3.readByte(); // L: 6309
					class2 var59 = new class2(var3); // L: 6310
					class11 var62;
					if (var56 >= 0) { // L: 6312
						var62 = field831[var56];
					} else {
						var62 = ObjectSound.field928; // L: 6313
					}

					var59.method29(var62); // L: 6314
					var1.serverPacket = null; // L: 6315
					return true; // L: 6316
				}

				if (ServerPacket.field2389 == var1.serverPacket) { // L: 6318
					if (Coord.field2591 == null) { // L: 6319
						Coord.field2591 = new class338(FriendSystem.field910);
					}

					class389 var46 = FriendSystem.field910.method5996(var3); // L: 6320
					Coord.field2591.field3926.vmethod6336(var46.field4215, var46.field4216); // L: 6321
					field794[++field613 - 1 & 31] = var46.field4215; // L: 6322
					var1.serverPacket = null; // L: 6323
					return true; // L: 6324
				}

				if (ServerPacket.field2410 == var1.serverPacket) { // L: 6326
					class13.friendSystem.method1720(); // L: 6327
					field797 = cycleCntr; // L: 6328
					var1.serverPacket = null; // L: 6329
					return true; // L: 6330
				}

				if (ServerPacket.field2360 == var1.serverPacket) { // L: 6332
					var17 = var3.method6748(); // L: 6333
					rootInterface = var17; // L: 6334
					this.resizeRoot(false); // L: 6335
					PlayerComposition.Widget_resetModelFrames(var17); // L: 6336
					AbstractSocket.runWidgetOnLoadListener(rootInterface); // L: 6337

					for (var5 = 0; var5 < 100; ++var5) { // L: 6338
						field811[var5] = true;
					}

					var1.serverPacket = null; // L: 6339
					return true; // L: 6340
				}

				if (ServerPacket.field2398 == var1.serverPacket) { // L: 6342
					var45 = var3.readStringCp1252NullTerminated(); // L: 6343
					var20 = var3.readLong(); // L: 6344
					var7 = (long)var3.readUnsignedShort(); // L: 6345
					var31 = (long)var3.readMedium(); // L: 6346
					PlayerType var34 = (PlayerType)UserComparator8.findEnumerated(WallDecoration.PlayerType_values(), var3.readUnsignedByte()); // L: 6347
					var29 = var31 + (var7 << 32); // L: 6348
					boolean var14 = false; // L: 6349

					for (var15 = 0; var15 < 100; ++var15) { // L: 6350
						if (var29 == crossWorldMessageIds[var15]) { // L: 6351
							var14 = true; // L: 6352
							break; // L: 6353
						}
					}

					if (var34.isUser && class13.friendSystem.isIgnored(new Username(var45, AbstractUserComparator.loginType))) { // L: 6356 6357
						var14 = true;
					}

					if (!var14 && field716 == 0) { // L: 6359
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var29; // L: 6360
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6361
						var42 = AbstractFont.escapeBrackets(GrandExchangeOfferAgeComparator.method4607(class16.method258(var3))); // L: 6362
						if (var34.modIcon != -1) { // L: 6363
							Projectile.addChatMessage(9, class337.method5986(var34.modIcon) + var45, var42, Varcs.base37DecodeLong(var20));
						} else {
							Projectile.addChatMessage(9, var45, var42, Varcs.base37DecodeLong(var20)); // L: 6364
						}
					}

					var1.serverPacket = null; // L: 6366
					return true; // L: 6367
				}

				if (ServerPacket.field2421 == var1.serverPacket) { // L: 6369
					if (var1.serverPacketLength == 0) { // L: 6370
						InterfaceParent.clanChat = null; // L: 6371
					} else {
						if (InterfaceParent.clanChat == null) { // L: 6374
							InterfaceParent.clanChat = new ClanChat(AbstractUserComparator.loginType, class10.client); // L: 6375
						}

						InterfaceParent.clanChat.readUpdate(var3); // L: 6377
					}

					class159.method3121(); // L: 6379
					var1.serverPacket = null; // L: 6380
					return true; // L: 6381
				}

				if (ServerPacket.field2399 == var1.serverPacket) { // L: 6383
					class105.method2255(); // L: 6384
					weight = var3.readShort(); // L: 6385
					field803 = cycleCntr; // L: 6386
					var1.serverPacket = null; // L: 6387
					return true; // L: 6388
				}

				if (ServerPacket.field2350 == var1.serverPacket) { // L: 6390
					var17 = var3.method6766(); // L: 6391
					class32.method393(var17); // L: 6392
					changedItemContainers[++field791 - 1 & 31] = var17 & 32767; // L: 6393
					var1.serverPacket = null; // L: 6394
					return true; // L: 6395
				}

				if (ServerPacket.field2409 == var1.serverPacket) { // L: 6397
					var17 = var3.method6766(); // L: 6398
					var5 = var3.method6628(); // L: 6399
					var6 = var17 >> 10 & 31; // L: 6400
					var23 = var17 >> 5 & 31; // L: 6401
					var25 = var17 & 31; // L: 6402
					var26 = (var23 << 11) + (var6 << 19) + (var25 << 3); // L: 6403
					Widget var27 = class139.getWidget(var5); // L: 6404
					if (var26 != var27.color) { // L: 6405
						var27.color = var26; // L: 6406
						class29.invalidateWidget(var27); // L: 6407
					}

					var1.serverPacket = null; // L: 6409
					return true; // L: 6410
				}

				if (ServerPacket.field2397 == var1.serverPacket) { // L: 6412
					UserComparator4.updateNpcs(false, var3, false); // L: 6413
					var1.serverPacket = null; // L: 6414
					return true; // L: 6415
				}

				if (ServerPacket.field2381 == var1.serverPacket) { // L: 6417
					Players.loadRegions(false, var1.packetBuffer); // L: 6418
					var1.serverPacket = null; // L: 6419
					return true; // L: 6420
				}

				if (ServerPacket.field2371 == var1.serverPacket) { // L: 6422
					class4.method77(var3.readStringCp1252NullTerminated()); // L: 6423
					var1.serverPacket = null; // L: 6424
					return true; // L: 6425
				}

				if (ServerPacket.field2406 == var1.serverPacket) { // L: 6427
					var17 = var3.readInt(); // L: 6428
					var5 = var3.readUnsignedShort(); // L: 6429
					if (var17 < -70000) { // L: 6430
						var5 += 32768;
					}

					if (var17 >= 0) { // L: 6432
						var19 = class139.getWidget(var17);
					} else {
						var19 = null; // L: 6433
					}

					if (var19 != null) { // L: 6434
						for (var23 = 0; var23 < var19.itemIds.length; ++var23) { // L: 6435
							var19.itemIds[var23] = 0; // L: 6436
							var19.itemQuantities[var23] = 0; // L: 6437
						}
					}

					UserComparator8.clearItemContainer(var5); // L: 6440
					var23 = var3.readUnsignedShort(); // L: 6441

					for (var25 = 0; var25 < var23; ++var25) { // L: 6442
						var26 = var3.method6617(); // L: 6443
						var28 = var3.method6623(); // L: 6444
						if (var28 == 255) { // L: 6445
							var28 = var3.method6628();
						}

						if (var19 != null && var25 < var19.itemIds.length) { // L: 6446 6447
							var19.itemIds[var25] = var26; // L: 6448
							var19.itemQuantities[var25] = var28; // L: 6449
						}

						SecureRandomFuture.itemContainerSetItem(var5, var25, var26 - 1, var28); // L: 6452
					}

					if (var19 != null) { // L: 6454
						class29.invalidateWidget(var19);
					}

					class105.method2255(); // L: 6455
					changedItemContainers[++field791 - 1 & 31] = var5 & 32767; // L: 6456
					var1.serverPacket = null; // L: 6457
					return true; // L: 6458
				}

				if (ServerPacket.field2426 == var1.serverPacket) { // L: 6460
					class1.readReflectionCheck(var3, var1.serverPacketLength); // L: 6461
					var1.serverPacket = null; // L: 6462
					return true; // L: 6463
				}

				if (ServerPacket.field2436 == var1.serverPacket) { // L: 6465
					var17 = var3.method6629(); // L: 6466
					var57 = class139.getWidget(var17); // L: 6467
					var57.modelType = 3; // L: 6468
					var57.modelId = Varcs.localPlayer.appearance.getChatHeadId(); // L: 6469
					class29.invalidateWidget(var57); // L: 6470
					var1.serverPacket = null; // L: 6471
					return true; // L: 6472
				}

				if (ServerPacket.field2373 == var1.serverPacket) { // L: 6474
					MusicPatchPcmStream.method4148(class203.field2333); // L: 6475
					var1.serverPacket = null; // L: 6476
					return true; // L: 6477
				}

				if (ServerPacket.field2388 == var1.serverPacket) { // L: 6479
					destinationX = var3.readUnsignedByte(); // L: 6480
					if (destinationX == 255) { // L: 6481
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 6482
					if (destinationY == 255) { // L: 6483
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 6484
					return true; // L: 6485
				}

				class223.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id * 1862353257 * -634167591 : -1) + "," + (var1.field1392 != null ? var1.field1392.id * 1862353257 * -634167591 : -1) + "," + (var1.field1393 != null ? var1.field1393.id * 1862353257 * -634167591 : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 6487
				class23.logOut(); // L: 6488
			} catch (IOException var43) { // L: 6490
				HealthBarUpdate.method2181(); // L: 6491
			} catch (Exception var44) {
				var18 = "" + (var1.serverPacket != null ? var1.serverPacket.id * 1862353257 * -634167591 : -1) + "," + (var1.field1392 != null ? var1.field1392.id * 1862353257 * -634167591 : -1) + "," + (var1.field1393 != null ? var1.field1393.id * 1862353257 * -634167591 : -1) + "," + var1.serverPacketLength + "," + (Varcs.localPlayer.pathX[0] + ItemLayer.baseX) + "," + (Varcs.localPlayer.pathY[0] + Tile.baseY) + ","; // L: 6494

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) { // L: 6495
					var18 = var18 + var3.array[var6] + ",";
				}

				class223.RunException_sendStackTrace(var18, var44); // L: 6496
				class23.logOut(); // L: 6497
			}

			return true; // L: 6499
		}
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "53"
	)
	@Export("menu")
	final void menu() {
		PlayerType.method4410(); // L: 7823
		if (ClientPacket.dragInventoryWidget == null) { // L: 7824
			if (clickedWidget == null) { // L: 7825
				int var1 = MouseHandler.MouseHandler_lastButton; // L: 7826
				int var2;
				int var4;
				int var5;
				int var6;
				int var14;
				if (isMenuOpen) { // L: 7827
					int var3;
					int var15;
					if (var1 != 1 && (MouseHandler.mouseCam || var1 != 4)) { // L: 7828
						var2 = MouseHandler.MouseHandler_x; // L: 7829
						var3 = MouseHandler.MouseHandler_y; // L: 7830
						if (var2 < class16.menuX - 10 || var2 > class16.menuX + Player.menuWidth + 10 || var3 < FontName.menuY - 10 || var3 > class11.menuHeight + FontName.menuY + 10) { // L: 7831
							isMenuOpen = false; // L: 7832
							var4 = class16.menuX; // L: 7833
							var5 = FontName.menuY; // L: 7834
							var6 = Player.menuWidth; // L: 7835
							var14 = class11.menuHeight; // L: 7836

							for (var15 = 0; var15 < rootWidgetCount; ++var15) { // L: 7838
								if (rootWidgetXs[var15] + rootWidgetWidths[var15] > var4 && rootWidgetXs[var15] < var6 + var4 && rootWidgetYs[var15] + rootWidgetHeights[var15] > var5 && rootWidgetYs[var15] < var14 + var5) { // L: 7839
									field811[var15] = true;
								}
							}
						}
					}

					if (var1 == 1 || !MouseHandler.mouseCam && var1 == 4) { // L: 7844
						var2 = class16.menuX; // L: 7845
						var3 = FontName.menuY; // L: 7846
						var4 = Player.menuWidth; // L: 7847
						var5 = MouseHandler.MouseHandler_lastPressedX; // L: 7848
						var6 = MouseHandler.MouseHandler_lastPressedY; // L: 7849
						var14 = -1; // L: 7850

						int var16;
						for (var15 = 0; var15 < menuOptionsCount; ++var15) { // L: 7851
							var16 = var3 + (menuOptionsCount - 1 - var15) * 15 + 31; // L: 7852
							if (var5 > var2 && var5 < var2 + var4 && var6 > var16 - 13 && var6 < var16 + 3) { // L: 7853
								var14 = var15;
							}
						}

						int var10;
						int var11;
						if (var14 != -1 && var14 >= 0) { // L: 7855 7856
							var15 = menuArguments1[var14]; // L: 7857
							var16 = menuArguments2[var14]; // L: 7858
							var10 = menuOpcodes[var14]; // L: 7859
							var11 = menuIdentifiers[var14]; // L: 7860
							String var12 = menuActions[var14]; // L: 7861
							String var13 = menuTargets[var14]; // L: 7862
							UserComparator9.menuAction(var15, var16, var10, var11, var12, var13, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 7863
						}

						isMenuOpen = false; // L: 7865
						var15 = class16.menuX; // L: 7866
						var16 = FontName.menuY; // L: 7867
						var10 = Player.menuWidth; // L: 7868
						var11 = class11.menuHeight; // L: 7869

						for (int var17 = 0; var17 < rootWidgetCount; ++var17) { // L: 7871
							if (rootWidgetXs[var17] + rootWidgetWidths[var17] > var15 && rootWidgetXs[var17] < var15 + var10 && rootWidgetHeights[var17] + rootWidgetYs[var17] > var16 && rootWidgetYs[var17] < var11 + var16) { // L: 7872
								field811[var17] = true;
							}
						}
					}
				} else {
					var2 = menuOptionsCount - 1; // L: 7880
					if ((var1 == 1 || !MouseHandler.mouseCam && var1 == 4) && var2 >= 0) { // L: 7883
						var4 = menuOpcodes[var2]; // L: 7884
						if (var4 == 39 || var4 == 40 || var4 == 41 || var4 == 42 || var4 == 43 || var4 == 33 || var4 == 34 || var4 == 35 || var4 == 36 || var4 == 37 || var4 == 38 || var4 == 1005) { // L: 7885
							var5 = menuArguments1[var2]; // L: 7886
							var6 = menuArguments2[var2]; // L: 7887
							Widget var7 = class139.getWidget(var6); // L: 7888
							if (class2.method39(DirectByteArrayCopier.getWidgetFlags(var7)) || class69.method1165(DirectByteArrayCopier.getWidgetFlags(var7))) { // L: 7889
								if (ClientPacket.dragInventoryWidget != null && !field714 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) { // L: 7890 7891
									class26.method357(draggedWidgetX, draggedWidgetY); // L: 7892
								}

								field714 = false; // L: 7895
								itemDragDuration = 0; // L: 7896
								if (ClientPacket.dragInventoryWidget != null) { // L: 7897
									class29.invalidateWidget(ClientPacket.dragInventoryWidget);
								}

								ClientPacket.dragInventoryWidget = class139.getWidget(var6); // L: 7898
								dragItemSlotSource = var5; // L: 7899
								draggedWidgetX = MouseHandler.MouseHandler_lastPressedX; // L: 7900
								draggedWidgetY = MouseHandler.MouseHandler_lastPressedY; // L: 7901
								if (var2 >= 0) { // L: 7902
									class25.tempMenuAction = new MenuAction(); // L: 7903
									class25.tempMenuAction.param0 = menuArguments1[var2]; // L: 7904
									class25.tempMenuAction.param1 = menuArguments2[var2]; // L: 7905
									class25.tempMenuAction.opcode = menuOpcodes[var2]; // L: 7906
									class25.tempMenuAction.identifier = menuIdentifiers[var2]; // L: 7907
									class25.tempMenuAction.action = menuActions[var2]; // L: 7908
								}

								class29.invalidateWidget(ClientPacket.dragInventoryWidget); // L: 7910
								return; // L: 7911
							}
						}
					}

					if ((var1 == 1 || !MouseHandler.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) { // L: 7915 7916
						var1 = 2; // L: 7917
					}

					if ((var1 == 1 || !MouseHandler.mouseCam && var1 == 4) && menuOptionsCount > 0 && var2 >= 0) { // L: 7920 7922
						var4 = menuArguments1[var2]; // L: 7923
						var5 = menuArguments2[var2]; // L: 7924
						var6 = menuOpcodes[var2]; // L: 7925
						var14 = menuIdentifiers[var2]; // L: 7926
						String var8 = menuActions[var2]; // L: 7927
						String var9 = menuTargets[var2]; // L: 7928
						UserComparator9.menuAction(var4, var5, var6, var14, var8, var9, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 7929
					}

					if (var1 == 2 && menuOptionsCount > 0) { // L: 7932
						this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}
				}

			}
		}
	} // L: 7934

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1310382933"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = Skeleton.method3433(); // L: 7937
		return (leftClickOpensMenu == 1 && menuOptionsCount > 2 || Player.method2150(var1)) && !menuShiftClick[var1]; // L: 7938
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1656231949"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		SpriteMask.method4172(var1, var2); // L: 7942
		WorldMapArea.scene.menuOpen(class26.Client_plane, var1, var2, false); // L: 7943
		isMenuOpen = true; // L: 7944
	} // L: 7945

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "230478005"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		ModelData0.method3784(rootInterface, InterfaceParent.canvasWidth, GameEngine.canvasHeight, var1); // L: 9940
	} // L: 9941

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(Lhu;I)V",
		garbageValue = "2095666186"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : class139.getWidget(var1.parentId); // L: 9944
		int var3;
		int var4;
		if (var2 == null) { // L: 9947
			var3 = InterfaceParent.canvasWidth; // L: 9948
			var4 = GameEngine.canvasHeight; // L: 9949
		} else {
			var3 = var2.width; // L: 9952
			var4 = var2.height; // L: 9953
		}

		class401.alignWidgetSize(var1, var3, var4, false); // L: 9955
		KeyHandler.alignWidgetPosition(var1, var3, var4); // L: 9956
	} // L: 9957

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2104011211"
	)
	final void method1239() {
		class29.invalidateWidget(clickedWidget); // L: 10938
		++class34.widgetDragDuration; // L: 10939
		if (field783 && field780) { // L: 10940
			int var1 = MouseHandler.MouseHandler_x; // L: 10946
			int var2 = MouseHandler.MouseHandler_y; // L: 10947
			var1 -= widgetClickX; // L: 10948
			var2 -= widgetClickY; // L: 10949
			if (var1 < field727) { // L: 10950
				var1 = field727;
			}

			if (var1 + clickedWidget.width > field727 + clickedWidgetParent.width) { // L: 10951
				var1 = field727 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field782) { // L: 10952
				var2 = field782;
			}

			if (var2 + clickedWidget.height > field782 + clickedWidgetParent.height) { // L: 10953
				var2 = field782 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field784; // L: 10954
			int var4 = var2 - field845; // L: 10955
			int var5 = clickedWidget.dragZoneSize; // L: 10956
			if (class34.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 10957 10958
				isDraggingWidget = true; // L: 10959
			}

			int var6 = var1 - field727 + clickedWidgetParent.scrollX; // L: 10962
			int var7 = var2 - field782 + clickedWidgetParent.scrollY; // L: 10963
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 10964
				var8 = new ScriptEvent(); // L: 10965
				var8.widget = clickedWidget; // L: 10966
				var8.mouseX = var6; // L: 10967
				var8.mouseY = var7; // L: 10968
				var8.args = clickedWidget.onDrag; // L: 10969
				class19.runScriptEvent(var8); // L: 10970
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 10972
				if (isDraggingWidget) { // L: 10973
					if (clickedWidget.onDragComplete != null) { // L: 10974
						var8 = new ScriptEvent(); // L: 10975
						var8.widget = clickedWidget; // L: 10976
						var8.mouseX = var6; // L: 10977
						var8.mouseY = var7; // L: 10978
						var8.dragTarget = draggedOnWidget; // L: 10979
						var8.args = clickedWidget.onDragComplete; // L: 10980
						class19.runScriptEvent(var8); // L: 10981
					}

					if (draggedOnWidget != null) { // L: 10983
						Widget var9 = clickedWidget; // L: 10985
						int var10 = AbstractWorldMapData.method3079(DirectByteArrayCopier.getWidgetFlags(var9)); // L: 10987
						Widget var13;
						if (var10 == 0) { // L: 10988
							var13 = null; // L: 10989
						} else {
							int var11 = 0;

							while (true) {
								if (var11 >= var10) {
									var13 = var9; // L: 10999
									break;
								}

								var9 = class139.getWidget(var9.parentId); // L: 10993
								if (var9 == null) { // L: 10994
									var13 = null; // L: 10995
									break; // L: 10996
								}

								++var11; // L: 10992
							}
						}

						if (var13 != null) { // L: 11001
							PacketBufferNode var12 = ObjectComposition.getPacketBufferNode(ClientPacket.field2307, packetWriter.isaacCipher); // L: 11003
							var12.packetBuffer.writeShort(clickedWidget.childIndex); // L: 11004
							var12.packetBuffer.writeShort(draggedOnWidget.itemId); // L: 11005
							var12.packetBuffer.method6614(clickedWidget.itemId); // L: 11006
							var12.packetBuffer.method6624(draggedOnWidget.id); // L: 11007
							var12.packetBuffer.writeShort(draggedOnWidget.childIndex); // L: 11008
							var12.packetBuffer.method6624(clickedWidget.id); // L: 11009
							packetWriter.addNode(var12); // L: 11010
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 11015
					this.openMenu(field784 + widgetClickX, widgetClickY + field845); // L: 11016
				} else if (menuOptionsCount > 0) { // L: 11018
					class26.method357(widgetClickX + field784, field845 + widgetClickY); // L: 11019
				}

				clickedWidget = null; // L: 11022
			}

		} else {
			if (class34.widgetDragDuration > 1) { // L: 10941
				clickedWidget = null; // L: 10942
			}

		}
	} // L: 10944 11024

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(I)Llw;",
		garbageValue = "-447538147"
	)
	@Export("username")
	public Username username() {
		return Varcs.localPlayer != null ? Varcs.localPlayer.username : null; // L: 11682
	}
}
