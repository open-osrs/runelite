/*
 * Copyright (c) 2019, https://openosrs.com
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

package net.runelite.client.config

import java.io.File
import java.io.FileNotFoundException
import java.io.PrintWriter

import scala.io.Source

import cats.effect.IO
import io.circe._
import io.circe.syntax._

object UsableConfig {

  val configDir = System.getProperty("user.home") + "/.runelite/configs/"

  def configFilePath(config: String): String =
    configDir + config + ".json"

  def loadConfig[A: Decoder](configName: String, fallback: A): IO[A] = {
    IO(parser.decode[A](Source.fromFile(configFilePath(configName)).getLines.mkString("\n")))
      .flatMap {
        case Left(ex)      => IO.raiseError(ex)
        case Right(result) => IO.pure(result)
      }
      .handleErrorWith { case _: FileNotFoundException => IO.pure(fallback) }
  }

  def saveConfig[A: Encoder](configName: String, data: A): IO[Unit] = IO {
    val file = new File(configFilePath(configName))
    val parentDir = file.getParentFile()

    if (!parentDir.exists()) parentDir.mkdirs()

    val writer = new PrintWriter(file)
    writer.write(data.asJson.spaces2)
    writer.close()
  }

}
