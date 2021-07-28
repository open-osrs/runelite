import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = 68758219064422731L
	)
	long field3785;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = -9128845049846382831L
	)
	long field3780;
	@ObfuscatedName("v")
	public boolean field3781;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = -930718680271849775L
	)
	long field3782;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = -2186555360260394021L
	)
	long field3784;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = 8669267677054780603L
	)
	long field3788;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1497157347
	)
	int field3786;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1042800783
	)
	int field3779;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1399840741
	)
	int field3787;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -626916419
	)
	int field3783;

	public Timer() {
		this.field3785 = -1L;
		this.field3780 = -1L;
		this.field3781 = false;
		this.field3782 = 0L;
		this.field3784 = 0L;
		this.field3788 = 0L;
		this.field3786 = 0;
		this.field3779 = 0;
		this.field3787 = 0;
		this.field3783 = 0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1486512703"
	)
	public void method5657() {
		this.field3785 = UrlRequester.method2125();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1053887599"
	)
	public void method5658() {
		if (this.field3785 != -1L) {
			this.field3784 = UrlRequester.method2125() - this.field3785;
			this.field3785 = -1L;
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-537573102"
	)
	public void method5662(int var1) {
		this.field3780 = UrlRequester.method2125();
		this.field3786 = var1;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "337371050"
	)
	public void method5677() {
		if (-1L != this.field3780) {
			this.field3782 = UrlRequester.method2125() - this.field3780;
			this.field3780 = -1L;
		}

		++this.field3787;
		this.field3781 = true;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "962935655"
	)
	public void method5661() {
		this.field3781 = false;
		this.field3779 = 0;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1319729393"
	)
	public void method5666() {
		this.method5677();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lnv;I)V",
		garbageValue = "774902222"
	)
	@Export("write")
	public void write(Buffer var1) {
		class262.method4896(var1, this.field3784);
		class262.method4896(var1, this.field3782);
		class262.method4896(var1, this.field3788);
		var1.writeShort(this.field3786);
		var1.writeShort(this.field3779);
		var1.writeShort(this.field3787);
		var1.writeShort(this.field3783);
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "24"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (Huffman.loadInterface(var0)) {
			Widget[] var1 = Widget.Widget_interfaceComponents[var0];

			for (int var2 = 0; var2 < var1.length; ++var2) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
				}
			}

		}
	}
}
