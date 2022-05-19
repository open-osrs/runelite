/*
 * MIT License
 *
 * Copyright (c) 2018 Tomas Slusny
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package net.runelite.data.dump;

import java.io.UnsupportedEncodingException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.data.App;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import okhttp3.ResponseBody;
import org.apache.commons.lang3.tuple.Pair;

@Slf4j
public class MediaWiki
{
	private static final class WikiInnerResponse
	{
		Map<String, String> wikitext;
	}

	private static final class WikiResponse
	{
		WikiInnerResponse parse;
	}

	private final OkHttpClient client = new OkHttpClient();
	private final OkHttpClient clientNoRedirect = client.newBuilder()
		.followRedirects(false)
		.followSslRedirects(false)
		.build();

	@Getter
	private final HttpUrl base;

	public MediaWiki(final String base)
	{
		this.base = HttpUrl.parse(base);
	}

	public Pair<String, String> getSpecialLookupData(final String type, final int id, final int section)
	{
		final HttpUrl url = base.newBuilder()
			.addPathSegment("w")
			.addPathSegment("Special:Lookup")
			.addQueryParameter("type", type)
			.addQueryParameter("id", String.valueOf(id))
			.build();

		final Request request = new Request.Builder()
			.url(url)
			.build();

		try (final Response response = clientNoRedirect.newCall(request).execute())
		{
			if (response.isRedirect())
			{
				String responseHeaderLocation = response.header("Location");

				if (responseHeaderLocation == null)
				{
					return null;
				}

				final String page = responseHeaderLocation
					.replace(base.newBuilder().addPathSegment("w").build().toString() + "/", "");

				return getPageData(page, section);
			}
			else
			{
				log.info("unsuccessful: {}", response.code());

				if (response.code() == 429)
				{
					Thread.sleep(2500);
					return getSpecialLookupData(type, id, section);
				}
			}
		}
		catch (Exception e)
		{
			log.info("exception: {}", e.getMessage());
			return null;
		}

		return null;
	}

	public Pair<String, String> getPageData(String page, int section)
	{
		// decode html encoded page name
		// ex: Mage%27s book -> Mage's_book
		try
		{
			page = URLDecoder.decode(page, StandardCharsets.UTF_8.name());
		}
		catch (UnsupportedEncodingException e)
		{
			// do nothing, keep page the same
		}

		final HttpUrl.Builder urlBuilder = base.newBuilder()
			.addPathSegment("api.php")
			.addQueryParameter("action", "parse")
			.addQueryParameter("format", "json")
			.addQueryParameter("prop", "wikitext")
			.addQueryParameter("redirects", "true")
			.addQueryParameter("page", page.replaceAll(" ", "_"));

		if (section != -1)
		{
			urlBuilder.addQueryParameter("section", String.valueOf(section));
		}

		final HttpUrl url = urlBuilder.build();

		final Request request = new Request.Builder()
			.url(url)
			.build();

		try (final Response response = client.newCall(request).execute())
		{
			if (response.isSuccessful())
			{
				ResponseBody responseBody = response.body();

				if (responseBody == null)
				{
					return null;
				}

				final InputStream in = responseBody.byteStream();
				return Pair.of(page.replaceAll(" ", "_"), App.GSON.fromJson(new InputStreamReader(in), WikiResponse.class).parse.wikitext.get("*"));
			}
			else
			{
				log.info("page data unsuccessful: {}", response.code());

				if (response.code() == 429)
				{
					Thread.sleep(2500);
					return getPageData(page, section);
				}
			}
		}
		catch (Exception e)
		{
			log.info("exception page data: {}", e.getMessage());
			return null;
		}

		return null;
	}
}
