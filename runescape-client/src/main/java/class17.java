import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("m")
class class17 implements SSLSession {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lh;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lh;)V"
	)
	class17(class12 var1) {
		this.this$1 = var1; // L: 133
	}

	public int getApplicationBufferSize() {
		return 0; // L: 136
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException(); // L: 141
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException(); // L: 146
	}

	public byte[] getId() {
		throw new UnsupportedOperationException(); // L: 151
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException(); // L: 156
	}

	public boolean isValid() {
		throw new UnsupportedOperationException(); // L: 226
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException(); // L: 166
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException(); // L: 236
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null; // L: 176
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field71; // L: 181
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException(); // L: 186
	}

	public int getPeerPort() {
		return 0; // L: 191
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null; // L: 196
	}

	public String getProtocol() {
		throw new UnsupportedOperationException(); // L: 201
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException(); // L: 211
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException(); // L: 216
	}

	public void invalidate() {
		throw new UnsupportedOperationException(); // L: 221
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException(); // L: 231
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException(); // L: 206
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException(); // L: 161
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException(); // L: 171
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "8045"
	)
	static final void method258() {
		if (Client.logoutTimer > 0) { // L: 2824
			class133.logOut(); // L: 2825
		} else {
			Client.timer.method6243(); // L: 2828
			class111.updateGameState(40); // L: 2829
			JagexCache.field1699 = Client.packetWriter.getSocket(); // L: 2830
			Client.packetWriter.removeSocket(); // L: 2831
		}
	} // L: 2826 2832

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(Lcq;I)V",
		garbageValue = "-464852881"
	)
	static final void method219(Actor var0) {
		var0.movementSequence = var0.idleSequence; // L: 3902
		if (var0.pathLength == 0) { // L: 3903
			var0.field1175 = 0; // L: 3904
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 3907
				SequenceDefinition var1 = class78.SequenceDefinition_get(var0.sequence); // L: 3908
				if (var0.field1176 > 0 && var1.field2107 == 0) { // L: 3909
					++var0.field1175; // L: 3910
					return; // L: 3911
				}

				if (var0.field1176 <= 0 && var1.field2099 == 0) { // L: 3913
					++var0.field1175; // L: 3914
					return; // L: 3915
				}
			}

			int var10 = var0.x; // L: 3918
			int var2 = var0.y; // L: 3919
			int var3 = var0.field1113 * 64 + var0.pathX[var0.pathLength - 1] * 128; // L: 3920
			int var4 = var0.field1113 * 64 + var0.pathY[var0.pathLength - 1] * 128; // L: 3921
			if (var10 < var3) { // L: 3922
				if (var2 < var4) { // L: 3923
					var0.orientation = 1280;
				} else if (var2 > var4) { // L: 3924
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536; // L: 3925
				}
			} else if (var10 > var3) { // L: 3927
				if (var2 < var4) { // L: 3928
					var0.orientation = 768;
				} else if (var2 > var4) { // L: 3929
					var0.orientation = 256;
				} else {
					var0.orientation = 512; // L: 3930
				}
			} else if (var2 < var4) { // L: 3932
				var0.orientation = 1024;
			} else if (var2 > var4) { // L: 3933
				var0.orientation = 0;
			}

			class185 var5 = var0.pathTraversed[var0.pathLength - 1]; // L: 3934
			if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) { // L: 3935
				int var6 = var0.orientation - var0.rotation & 2047; // L: 3942
				if (var6 > 1024) { // L: 3943
					var6 -= 2048;
				}

				int var7 = var0.walkBackSequence; // L: 3944
				if (var6 >= -256 && var6 <= 256) { // L: 3945
					var7 = var0.walkSequence;
				} else if (var6 >= 256 && var6 < 768) { // L: 3946
					var7 = var0.walkRightSequence;
				} else if (var6 >= -768 && var6 <= -256) { // L: 3947
					var7 = var0.walkLeftSequence;
				}

				if (var7 == -1) { // L: 3948
					var7 = var0.walkSequence;
				}

				var0.movementSequence = var7; // L: 3949
				int var8 = 4; // L: 3950
				boolean var9 = true; // L: 3951
				if (var0 instanceof NPC) { // L: 3952
					var9 = ((NPC)var0).definition.isClickable;
				}

				if (var9) { // L: 3953
					if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1170 != 0) { // L: 3954
						var8 = 2;
					}

					if (var0.pathLength > 2) { // L: 3955
						var8 = 6;
					}

					if (var0.pathLength > 3) { // L: 3956
						var8 = 8;
					}

					if (var0.field1175 > 0 && var0.pathLength > 1) { // L: 3957
						var8 = 8; // L: 3958
						--var0.field1175; // L: 3959
					}
				} else {
					if (var0.pathLength > 1) { // L: 3963
						var8 = 6;
					}

					if (var0.pathLength > 2) { // L: 3964
						var8 = 8;
					}

					if (var0.field1175 > 0 && var0.pathLength > 1) { // L: 3965
						var8 = 8; // L: 3966
						--var0.field1175; // L: 3967
					}
				}

				if (var5 == class185.field2132) { // L: 3970
					var8 <<= 1;
				} else if (var5 == class185.field2133) { // L: 3971
					var8 >>= 1;
				}

				if (var8 >= 8 && var0.walkSequence == var0.movementSequence && var0.runSequence != -1) { // L: 3972
					var0.movementSequence = var0.runSequence;
				}

				if (var10 != var3 || var2 != var4) { // L: 3973
					if (var10 < var3) { // L: 3974
						var0.x += var8; // L: 3975
						if (var0.x > var3) { // L: 3976
							var0.x = var3;
						}
					} else if (var10 > var3) { // L: 3978
						var0.x -= var8; // L: 3979
						if (var0.x < var3) { // L: 3980
							var0.x = var3;
						}
					}

					if (var2 < var4) { // L: 3982
						var0.y += var8; // L: 3983
						if (var0.y > var4) { // L: 3984
							var0.y = var4;
						}
					} else if (var2 > var4) { // L: 3986
						var0.y -= var8; // L: 3987
						if (var0.y < var4) { // L: 3988
							var0.y = var4;
						}
					}
				}

				if (var3 == var0.x && var4 == var0.y) { // L: 3991
					--var0.pathLength; // L: 3992
					if (var0.field1176 > 0) { // L: 3993
						--var0.field1176;
					}
				}

			} else {
				var0.x = var3; // L: 3936
				var0.y = var4; // L: 3937
				--var0.pathLength; // L: 3938
				if (var0.field1176 > 0) { // L: 3939
					--var0.field1176;
				}

			}
		}
	} // L: 3905 3940 3995

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	static final boolean method247() {
		return Client.isMenuOpen; // L: 8154
	}
}
