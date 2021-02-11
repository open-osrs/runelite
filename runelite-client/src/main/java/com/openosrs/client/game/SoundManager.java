/*
 * Copyright (c) 2021, ThatGamerBlue <thatgamerblue@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.openosrs.client.game;

import java.io.IOException;
import javax.inject.Singleton;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.BooleanControl;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

@Singleton
public class SoundManager
{
	public void play(final Sound sound)
	{
		new Thread(() ->
		{
			try (AudioInputStream in = AudioSystem.getAudioInputStream(sound.getPath()))
			{
				AudioFormat outFormat = SoundManager.this.getOutFormat(in.getFormat());
				DataLine.Info info = new DataLine.Info(SourceDataLine.class, outFormat);
				try (SourceDataLine line = (SourceDataLine) AudioSystem.getLine(info))
				{
					if (line != null)
					{
						line.open(outFormat, 2200);
						if (line.isControlSupported(FloatControl.Type.MASTER_GAIN))
						{
							int volume = 50;
							FloatControl gainControl = (FloatControl) line.getControl(FloatControl.Type.MASTER_GAIN);
							BooleanControl muteControl = (BooleanControl) line.getControl(BooleanControl.Type.MUTE);
							muteControl.setValue(false);
							gainControl.setValue((float) (Math.log((double) volume / 100.0) / Math.log(10.0) * 20.0));
						}
						line.start();
						stream(AudioSystem.getAudioInputStream(outFormat, in), line);
						line.drain();
						line.stop();
					}
				}
			}
			catch (IOException | LineUnavailableException | UnsupportedAudioFileException e)
			{
				throw new IllegalStateException(e);
			}
		}).start();
	}

	private AudioFormat getOutFormat(AudioFormat inFormat)
	{
		int ch = inFormat.getChannels();
		float rate = inFormat.getSampleRate();
		return new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, rate, 16, ch, ch * 2, rate, false);
	}

	private void stream(AudioInputStream in, SourceDataLine line) throws IOException
	{
		byte[] buffer = new byte[2200];
		int n = 0;
		while (n != -1)
		{
			line.write(buffer, 0, n);
			n = in.read(buffer, 0, buffer.length);
		}
	}

}