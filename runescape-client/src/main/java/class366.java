import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
public final class class366 {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Lno;"
	)
	public static class366[] field4191;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1036924523
	)
	static int field4192;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	public static final class366 field4194;
	@ObfuscatedName("t")
	public float[] field4196;

	static {
		field4191 = new class366[0];
		Client.method1623(100);
		field4194 = new class366();
	}

	public class366() {
		this.field4196 = new float[16];
		this.method6652();
	}

	@ObfuscatedSignature(
		descriptor = "(Lno;)V"
	)
	public class366(class366 var1) {
		this.field4196 = new float[16];
		this.method6654(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Lpi;Z)V"
	)
	public class366(Buffer var1, boolean var2) {
		this.field4196 = new float[16];
		this.method6649(var1, var2);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "340941633"
	)
	public void method6656() {
		synchronized(field4191) {
			if (class149.field1663 < field4192 - 1) {
				field4191[++class149.field1663 - 1] = this;
			}

		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lpi;ZI)V",
		garbageValue = "-1222867877"
	)
	void method6649(Buffer var1, boolean var2) {
		if (var2) {
			class367 var4 = new class367();
			var4.method6732(class329.method6135(var1.readShort()));
			var4.method6717(class329.method6135(var1.readShort()));
			var4.method6718(class329.method6135(var1.readShort()));
			var4.method6719((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
			this.method6713(var4);
		} else {
			for (int var3 = 0; var3 < 16; ++var3) {
				this.field4196[var3] = var1.method7369();
			}
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "42"
	)
	float[] method6650() {
		float[] var1 = new float[3];
		if ((double)this.field4196[2] < 0.999D && (double)this.field4196[2] > -0.999D) {
			var1[1] = (float)(-Math.asin((double)this.field4196[2]));
			double var2 = Math.cos((double)var1[1]);
			var1[0] = (float)Math.atan2((double)this.field4196[6] / var2, (double)this.field4196[10] / var2);
			var1[2] = (float)Math.atan2((double)this.field4196[1] / var2, (double)this.field4196[0] / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float)Math.atan2((double)this.field4196[2], 0.0D);
			var1[2] = (float)Math.atan2((double)(-this.field4196[9]), (double)this.field4196[5]);
		}

		return var1;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-1676317150"
	)
	public float[] method6651() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4196[6])), 0.0F, 0.0F};
		double var2 = Math.cos((double)var1[0]);
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) {
			var4 = (double)this.field4196[2];
			var6 = (double)this.field4196[10];
			double var8 = (double)this.field4196[4];
			double var10 = (double)this.field4196[5];
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			var4 = (double)this.field4196[1];
			var6 = (double)this.field4196[0];
			if (this.field4196[6] < 0.0F) {
				var1[1] = (float)Math.atan2(var4, var6);
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6));
			}

			var1[2] = 0.0F;
		}

		return var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "525334950"
	)
	public void method6652() {
		this.field4196[0] = 1.0F;
		this.field4196[1] = 0.0F;
		this.field4196[2] = 0.0F;
		this.field4196[3] = 0.0F;
		this.field4196[4] = 0.0F;
		this.field4196[5] = 1.0F;
		this.field4196[6] = 0.0F;
		this.field4196[7] = 0.0F;
		this.field4196[8] = 0.0F;
		this.field4196[9] = 0.0F;
		this.field4196[10] = 1.0F;
		this.field4196[11] = 0.0F;
		this.field4196[12] = 0.0F;
		this.field4196[13] = 0.0F;
		this.field4196[14] = 0.0F;
		this.field4196[15] = 1.0F;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1795899803"
	)
	public void method6708() {
		this.field4196[0] = 0.0F;
		this.field4196[1] = 0.0F;
		this.field4196[2] = 0.0F;
		this.field4196[3] = 0.0F;
		this.field4196[4] = 0.0F;
		this.field4196[5] = 0.0F;
		this.field4196[6] = 0.0F;
		this.field4196[7] = 0.0F;
		this.field4196[8] = 0.0F;
		this.field4196[9] = 0.0F;
		this.field4196[10] = 0.0F;
		this.field4196[11] = 0.0F;
		this.field4196[12] = 0.0F;
		this.field4196[13] = 0.0F;
		this.field4196[14] = 0.0F;
		this.field4196[15] = 0.0F;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lno;I)V",
		garbageValue = "-1679840989"
	)
	public void method6654(class366 var1) {
		System.arraycopy(var1.field4196, 0, this.field4196, 0, 16);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "-31"
	)
	public void method6655(float var1) {
		this.method6667(var1, var1, var1);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "1410403960"
	)
	public void method6667(float var1, float var2, float var3) {
		this.method6652();
		this.field4196[0] = var1;
		this.field4196[5] = var2;
		this.field4196[10] = var3;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lno;S)V",
		garbageValue = "-15383"
	)
	public void method6657(class366 var1) {
		for (int var2 = 0; var2 < this.field4196.length; ++var2) {
			float[] var10000 = this.field4196;
			var10000[var2] += var1.field4196[var2];
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lno;I)V",
		garbageValue = "1087473268"
	)
	public void method6670(class366 var1) {
		float var2 = this.field4196[1] * var1.field4196[4] + var1.field4196[0] * this.field4196[0] + this.field4196[2] * var1.field4196[8] + var1.field4196[12] * this.field4196[3];
		float var3 = var1.field4196[5] * this.field4196[1] + var1.field4196[1] * this.field4196[0] + this.field4196[2] * var1.field4196[9] + var1.field4196[13] * this.field4196[3];
		float var4 = var1.field4196[6] * this.field4196[1] + this.field4196[0] * var1.field4196[2] + var1.field4196[10] * this.field4196[2] + var1.field4196[14] * this.field4196[3];
		float var5 = var1.field4196[15] * this.field4196[3] + this.field4196[2] * var1.field4196[11] + this.field4196[1] * var1.field4196[7] + var1.field4196[3] * this.field4196[0];
		float var6 = this.field4196[4] * var1.field4196[0] + var1.field4196[4] * this.field4196[5] + this.field4196[6] * var1.field4196[8] + this.field4196[7] * var1.field4196[12];
		float var7 = var1.field4196[9] * this.field4196[6] + var1.field4196[5] * this.field4196[5] + this.field4196[4] * var1.field4196[1] + this.field4196[7] * var1.field4196[13];
		float var8 = this.field4196[7] * var1.field4196[14] + this.field4196[5] * var1.field4196[6] + var1.field4196[2] * this.field4196[4] + this.field4196[6] * var1.field4196[10];
		float var9 = this.field4196[5] * var1.field4196[7] + this.field4196[4] * var1.field4196[3] + this.field4196[6] * var1.field4196[11] + this.field4196[7] * var1.field4196[15];
		float var10 = var1.field4196[12] * this.field4196[11] + this.field4196[10] * var1.field4196[8] + var1.field4196[0] * this.field4196[8] + this.field4196[9] * var1.field4196[4];
		float var11 = var1.field4196[5] * this.field4196[9] + this.field4196[8] * var1.field4196[1] + var1.field4196[9] * this.field4196[10] + this.field4196[11] * var1.field4196[13];
		float var12 = var1.field4196[10] * this.field4196[10] + this.field4196[8] * var1.field4196[2] + this.field4196[9] * var1.field4196[6] + this.field4196[11] * var1.field4196[14];
		float var13 = this.field4196[8] * var1.field4196[3] + this.field4196[9] * var1.field4196[7] + var1.field4196[11] * this.field4196[10] + this.field4196[11] * var1.field4196[15];
		float var14 = var1.field4196[8] * this.field4196[14] + var1.field4196[4] * this.field4196[13] + this.field4196[12] * var1.field4196[0] + var1.field4196[12] * this.field4196[15];
		float var15 = var1.field4196[13] * this.field4196[15] + this.field4196[12] * var1.field4196[1] + var1.field4196[5] * this.field4196[13] + this.field4196[14] * var1.field4196[9];
		float var16 = this.field4196[14] * var1.field4196[10] + var1.field4196[6] * this.field4196[13] + this.field4196[12] * var1.field4196[2] + this.field4196[15] * var1.field4196[14];
		float var17 = var1.field4196[15] * this.field4196[15] + var1.field4196[11] * this.field4196[14] + var1.field4196[7] * this.field4196[13] + this.field4196[12] * var1.field4196[3];
		this.field4196[0] = var2;
		this.field4196[1] = var3;
		this.field4196[2] = var4;
		this.field4196[3] = var5;
		this.field4196[4] = var6;
		this.field4196[5] = var7;
		this.field4196[6] = var8;
		this.field4196[7] = var9;
		this.field4196[8] = var10;
		this.field4196[9] = var11;
		this.field4196[10] = var12;
		this.field4196[11] = var13;
		this.field4196[12] = var14;
		this.field4196[13] = var15;
		this.field4196[14] = var16;
		this.field4196[15] = var17;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lns;B)V",
		garbageValue = "-62"
	)
	public void method6711(class365 var1) {
		float var2 = var1.field4183 * var1.field4183;
		float var3 = var1.field4183 * var1.field4186;
		float var4 = var1.field4188 * var1.field4183;
		float var5 = var1.field4183 * var1.field4187;
		float var6 = var1.field4186 * var1.field4186;
		float var7 = var1.field4188 * var1.field4186;
		float var8 = var1.field4186 * var1.field4187;
		float var9 = var1.field4188 * var1.field4188;
		float var10 = var1.field4188 * var1.field4187;
		float var11 = var1.field4187 * var1.field4187;
		this.field4196[0] = var6 + var2 - var11 - var9;
		this.field4196[1] = var7 + var7 + var5 + var5;
		this.field4196[2] = var8 - var4 - var4 + var8;
		this.field4196[4] = var7 + (var7 - var5 - var5);
		this.field4196[5] = var9 + var2 - var6 - var11;
		this.field4196[6] = var3 + var10 + var3 + var10;
		this.field4196[8] = var8 + var4 + var8 + var4;
		this.field4196[9] = var10 + (var10 - var3 - var3);
		this.field4196[10] = var11 + var2 - var9 - var6;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnu;B)V",
		garbageValue = "-7"
	)
	void method6713(class367 var1) {
		this.field4196[0] = var1.field4197;
		this.field4196[1] = var1.field4198;
		this.field4196[2] = var1.field4199;
		this.field4196[3] = 0.0F;
		this.field4196[4] = var1.field4200;
		this.field4196[5] = var1.field4201;
		this.field4196[6] = var1.field4202;
		this.field4196[7] = 0.0F;
		this.field4196[8] = var1.field4204;
		this.field4196[9] = var1.field4203;
		this.field4196[10] = var1.field4205;
		this.field4196[11] = 0.0F;
		this.field4196[12] = var1.field4206;
		this.field4196[13] = var1.field4207;
		this.field4196[14] = var1.field4208;
		this.field4196[15] = 1.0F;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "115"
	)
	float method6679() {
		return this.field4196[8] * this.field4196[3] * this.field4196[5] * this.field4196[14] + this.field4196[13] * this.field4196[8] * this.field4196[2] * this.field4196[7] + this.field4196[12] * this.field4196[2] * this.field4196[5] * this.field4196[11] + (this.field4196[15] * this.field4196[9] * this.field4196[2] * this.field4196[4] + this.field4196[6] * this.field4196[0] * this.field4196[11] * this.field4196[13] + (this.field4196[5] * this.field4196[0] * this.field4196[10] * this.field4196[15] - this.field4196[14] * this.field4196[5] * this.field4196[0] * this.field4196[11] - this.field4196[9] * this.field4196[0] * this.field4196[6] * this.field4196[15]) + this.field4196[14] * this.field4196[9] * this.field4196[7] * this.field4196[0] - this.field4196[13] * this.field4196[7] * this.field4196[0] * this.field4196[10] - this.field4196[15] * this.field4196[10] * this.field4196[4] * this.field4196[1] + this.field4196[14] * this.field4196[11] * this.field4196[1] * this.field4196[4] + this.field4196[15] * this.field4196[8] * this.field4196[6] * this.field4196[1] - this.field4196[11] * this.field4196[6] * this.field4196[1] * this.field4196[12] - this.field4196[7] * this.field4196[1] * this.field4196[8] * this.field4196[14] + this.field4196[12] * this.field4196[10] * this.field4196[1] * this.field4196[7] - this.field4196[11] * this.field4196[4] * this.field4196[2] * this.field4196[13] - this.field4196[15] * this.field4196[5] * this.field4196[2] * this.field4196[8]) - this.field4196[2] * this.field4196[7] * this.field4196[9] * this.field4196[12] - this.field4196[3] * this.field4196[4] * this.field4196[9] * this.field4196[14] + this.field4196[10] * this.field4196[3] * this.field4196[4] * this.field4196[13] - this.field4196[10] * this.field4196[5] * this.field4196[3] * this.field4196[12] - this.field4196[3] * this.field4196[6] * this.field4196[8] * this.field4196[13] + this.field4196[3] * this.field4196[6] * this.field4196[9] * this.field4196[12];
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "817560716"
	)
	public void method6678() {
		float var1 = 1.0F / this.method6679();
		float var2 = var1 * (this.field4196[15] * this.field4196[5] * this.field4196[10] - this.field4196[14] * this.field4196[5] * this.field4196[11] - this.field4196[6] * this.field4196[9] * this.field4196[15] + this.field4196[13] * this.field4196[6] * this.field4196[11] + this.field4196[9] * this.field4196[7] * this.field4196[14] - this.field4196[10] * this.field4196[7] * this.field4196[13]);
		float var3 = (this.field4196[9] * this.field4196[2] * this.field4196[15] + this.field4196[14] * this.field4196[11] * this.field4196[1] + -this.field4196[1] * this.field4196[10] * this.field4196[15] - this.field4196[13] * this.field4196[2] * this.field4196[11] - this.field4196[14] * this.field4196[9] * this.field4196[3] + this.field4196[13] * this.field4196[3] * this.field4196[10]) * var1;
		float var4 = var1 * (this.field4196[15] * this.field4196[1] * this.field4196[6] - this.field4196[7] * this.field4196[1] * this.field4196[14] - this.field4196[2] * this.field4196[5] * this.field4196[15] + this.field4196[13] * this.field4196[7] * this.field4196[2] + this.field4196[14] * this.field4196[5] * this.field4196[3] - this.field4196[3] * this.field4196[6] * this.field4196[13]);
		float var5 = (this.field4196[6] * this.field4196[3] * this.field4196[9] + (this.field4196[11] * this.field4196[2] * this.field4196[5] + this.field4196[10] * this.field4196[7] * this.field4196[1] + this.field4196[6] * -this.field4196[1] * this.field4196[11] - this.field4196[9] * this.field4196[7] * this.field4196[2] - this.field4196[5] * this.field4196[3] * this.field4196[10])) * var1;
		float var6 = var1 * (this.field4196[8] * this.field4196[6] * this.field4196[15] + this.field4196[11] * this.field4196[4] * this.field4196[14] + -this.field4196[4] * this.field4196[10] * this.field4196[15] - this.field4196[6] * this.field4196[11] * this.field4196[12] - this.field4196[8] * this.field4196[7] * this.field4196[14] + this.field4196[12] * this.field4196[10] * this.field4196[7]);
		float var7 = var1 * (this.field4196[15] * this.field4196[0] * this.field4196[10] - this.field4196[14] * this.field4196[11] * this.field4196[0] - this.field4196[15] * this.field4196[8] * this.field4196[2] + this.field4196[11] * this.field4196[2] * this.field4196[12] + this.field4196[14] * this.field4196[8] * this.field4196[3] - this.field4196[3] * this.field4196[10] * this.field4196[12]);
		float var8 = var1 * (this.field4196[15] * this.field4196[4] * this.field4196[2] + this.field4196[0] * this.field4196[7] * this.field4196[14] + this.field4196[6] * -this.field4196[0] * this.field4196[15] - this.field4196[7] * this.field4196[2] * this.field4196[12] - this.field4196[4] * this.field4196[3] * this.field4196[14] + this.field4196[12] * this.field4196[3] * this.field4196[6]);
		float var9 = (this.field4196[2] * this.field4196[7] * this.field4196[8] + (this.field4196[11] * this.field4196[0] * this.field4196[6] - this.field4196[10] * this.field4196[0] * this.field4196[7] - this.field4196[11] * this.field4196[2] * this.field4196[4]) + this.field4196[10] * this.field4196[4] * this.field4196[3] - this.field4196[3] * this.field4196[6] * this.field4196[8]) * var1;
		float var10 = var1 * (this.field4196[4] * this.field4196[9] * this.field4196[15] - this.field4196[13] * this.field4196[4] * this.field4196[11] - this.field4196[15] * this.field4196[5] * this.field4196[8] + this.field4196[12] * this.field4196[5] * this.field4196[11] + this.field4196[13] * this.field4196[7] * this.field4196[8] - this.field4196[7] * this.field4196[9] * this.field4196[12]);
		float var11 = var1 * (this.field4196[15] * this.field4196[1] * this.field4196[8] + this.field4196[13] * this.field4196[0] * this.field4196[11] + this.field4196[15] * this.field4196[9] * -this.field4196[0] - this.field4196[11] * this.field4196[1] * this.field4196[12] - this.field4196[3] * this.field4196[8] * this.field4196[13] + this.field4196[12] * this.field4196[9] * this.field4196[3]);
		float var12 = var1 * (this.field4196[13] * this.field4196[3] * this.field4196[4] + this.field4196[0] * this.field4196[5] * this.field4196[15] - this.field4196[0] * this.field4196[7] * this.field4196[13] - this.field4196[15] * this.field4196[4] * this.field4196[1] + this.field4196[7] * this.field4196[1] * this.field4196[12] - this.field4196[12] * this.field4196[3] * this.field4196[5]);
		float var13 = var1 * (this.field4196[11] * this.field4196[4] * this.field4196[1] + this.field4196[9] * this.field4196[0] * this.field4196[7] + this.field4196[11] * -this.field4196[0] * this.field4196[5] - this.field4196[8] * this.field4196[1] * this.field4196[7] - this.field4196[9] * this.field4196[3] * this.field4196[4] + this.field4196[8] * this.field4196[5] * this.field4196[3]);
		float var14 = (this.field4196[12] * this.field4196[9] * this.field4196[6] + (this.field4196[5] * this.field4196[8] * this.field4196[14] + this.field4196[10] * this.field4196[4] * this.field4196[13] + this.field4196[9] * -this.field4196[4] * this.field4196[14] - this.field4196[5] * this.field4196[10] * this.field4196[12] - this.field4196[6] * this.field4196[8] * this.field4196[13])) * var1;
		float var15 = (this.field4196[13] * this.field4196[8] * this.field4196[2] + this.field4196[12] * this.field4196[10] * this.field4196[1] + (this.field4196[9] * this.field4196[0] * this.field4196[14] - this.field4196[13] * this.field4196[0] * this.field4196[10] - this.field4196[8] * this.field4196[1] * this.field4196[14]) - this.field4196[12] * this.field4196[2] * this.field4196[9]) * var1;
		float var16 = var1 * (this.field4196[5] * this.field4196[2] * this.field4196[12] + (this.field4196[4] * this.field4196[1] * this.field4196[14] + this.field4196[0] * this.field4196[6] * this.field4196[13] + this.field4196[5] * -this.field4196[0] * this.field4196[14] - this.field4196[12] * this.field4196[1] * this.field4196[6] - this.field4196[13] * this.field4196[4] * this.field4196[2]));
		float var17 = (this.field4196[9] * this.field4196[2] * this.field4196[4] + this.field4196[8] * this.field4196[6] * this.field4196[1] + (this.field4196[0] * this.field4196[5] * this.field4196[10] - this.field4196[6] * this.field4196[0] * this.field4196[9] - this.field4196[10] * this.field4196[4] * this.field4196[1]) - this.field4196[8] * this.field4196[2] * this.field4196[5]) * var1;
		this.field4196[0] = var2;
		this.field4196[1] = var3;
		this.field4196[2] = var4;
		this.field4196[3] = var5;
		this.field4196[4] = var6;
		this.field4196[5] = var7;
		this.field4196[6] = var8;
		this.field4196[7] = var9;
		this.field4196[8] = var10;
		this.field4196[9] = var11;
		this.field4196[10] = var12;
		this.field4196[11] = var13;
		this.field4196[12] = var14;
		this.field4196[13] = var15;
		this.field4196[14] = var16;
		this.field4196[15] = var17;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(S)[F",
		garbageValue = "768"
	)
	public float[] method6663() {
		float[] var1 = new float[3];
		class364 var2 = new class364(this.field4196[0], this.field4196[1], this.field4196[2]);
		class364 var3 = new class364(this.field4196[4], this.field4196[5], this.field4196[6]);
		class364 var4 = new class364(this.field4196[8], this.field4196[9], this.field4196[10]);
		var1[0] = var2.method6618();
		var1[1] = var3.method6618();
		var1[2] = var4.method6618();
		return var1;
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = 31 * var2 + Arrays.hashCode(this.field4196);
		return var3;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class366)) {
			return false;
		} else {
			class366 var2 = (class366)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (this.field4196[var3] != var2.field4196[var3]) {
					return false;
				}
			}

			return true;
		}
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method6651();
		this.method6650();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4196[var3 + var2 * 4];
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
					var4 = 0.0F;
				}

				var1.append(var4);
			}

			var1.append("\n");
		}

		return var1.toString();
	}
}
