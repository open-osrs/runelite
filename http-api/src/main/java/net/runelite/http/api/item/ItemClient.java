/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
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
package net.runelite.http.api.item;

import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import io.reactivex.Observable;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Map;
import javax.imageio.ImageIO;
import net.runelite.http.api.RuneLiteAPI;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ItemClient
{
	private static final Logger logger = LoggerFactory.getLogger(ItemClient.class);

	public ItemPrice lookupItemPrice(int itemId) throws IOException
	{
		HttpUrl url = RuneLiteAPI.getApiBase().newBuilder()
			.addPathSegment("item")
			.addPathSegment("" + itemId)
			.addPathSegment("price")
			.build();

		logger.debug("Built URI: {}", url);

		Request request = new Request.Builder()
			.url(url)
			.build();

		try (Response response = RuneLiteAPI.CLIENT.newCall(request).execute())
		{
			if (!response.isSuccessful())
			{
				logger.debug("Error looking up item {}: {}", itemId, response);
				return null;
			}

			InputStream in = response.body().byteStream();
			return RuneLiteAPI.GSON.fromJson(new InputStreamReader(in), ItemPrice.class);
		}
		catch (JsonParseException ex)
		{
			throw new IOException(ex);
		}
	}

	public ItemPrice[] lookupItemPrice(Integer[] itemIds) throws IOException
	{
		HttpUrl.Builder urlBuilder = RuneLiteAPI.getApiBase().newBuilder()
				.addPathSegment("item")
				.addPathSegment("price");

		for (int itemId : itemIds)
		{
			urlBuilder.addQueryParameter("id", String.valueOf(itemId));
		}

		HttpUrl url = urlBuilder.build();

		logger.debug("Built URI: {}", url);

		Request request = new Request.Builder()
				.url(url)
				.build();

		try (Response response = RuneLiteAPI.CLIENT.newCall(request).execute())
		{
			if (!response.isSuccessful())
			{
				logger.debug("Error looking up items {}: {}", Arrays.toString(itemIds), response);
				return null;
			}

			InputStream in = response.body().byteStream();
			return RuneLiteAPI.GSON.fromJson(new InputStreamReader(in), ItemPrice[].class);
		}
		catch (JsonParseException ex)
		{
			throw new IOException(ex);
		}
	}

	public Observable<BufferedImage> getIcon(int itemId)
	{
		HttpUrl url = RuneLiteAPI.getApiBase().newBuilder()
			.addPathSegment("item")
			.addPathSegment("" + itemId)
			.addPathSegment("icon")
			.build();

		logger.debug("Built URI: {}", url);

		Request request = new Request.Builder()
			.url(url)
			.build();

		return Observable.defer(() ->
		{
			try (Response response = RuneLiteAPI.CLIENT.newCall(request).execute())
			{
				if (!response.isSuccessful())
				{
					logger.debug("Error grabbing icon {}: {}", itemId, response);
					return Observable.just(null);
				}

				InputStream in = response.body().byteStream();
				synchronized (ImageIO.class)
				{
					return Observable.just(ImageIO.read(in));
				}
			}
		});
	}

	public Observable<SearchResult> search(String itemName)
	{
		HttpUrl url = RuneLiteAPI.getApiBase().newBuilder()
			.addPathSegment("item")
			.addPathSegment("search")
			.addQueryParameter("query", itemName)
			.build();

		logger.debug("Built URI: {}", url);

		return Observable.defer(() ->
		{
			Request request = new Request.Builder()
				.url(url)
				.build();

			try (Response response = RuneLiteAPI.CLIENT.newCall(request).execute())
			{
				if (!response.isSuccessful())
				{
					logger.debug("Error looking up item {}: {}", itemName, response);
					return Observable.just(null);
				}

				InputStream in = response.body().byteStream();
				return Observable.just(RuneLiteAPI.GSON.fromJson(new InputStreamReader(in), SearchResult.class));
			}
			catch (JsonParseException ex)
			{
				return Observable.error(ex);
			}
		});
	}

	public Observable<ItemPrice[]> getPrices()
	{
		HttpUrl.Builder urlBuilder = RuneLiteAPI.getApiBase().newBuilder()
			.addPathSegment("item")
			.addPathSegment("prices.js");

		HttpUrl url = urlBuilder.build();

		logger.debug("Built URI: {}", url);


		return Observable.defer(() ->
		{
			Request request = new Request.Builder()
				.url(url)
				.build();

			try (Response response = RuneLiteAPI.CLIENT.newCall(request).execute())
			{
				if (!response.isSuccessful())
				{
					logger.warn("Error looking up prices: {}", response);
					return Observable.just(null);
				}

				InputStream in = response.body().byteStream();
				return Observable.just(RuneLiteAPI.GSON.fromJson(new InputStreamReader(in), ItemPrice[].class));
			}
			catch (JsonParseException ex)
			{
				return Observable.error(ex);
			}
		});
	}

	public Observable<Map<Integer, ItemStats>> getStats()
	{
		HttpUrl.Builder urlBuilder = RuneLiteAPI.getStaticBase().newBuilder()
			.addPathSegment("item")
			// TODO: Change this to stats.min.json later after release is undeployed
			.addPathSegment("stats.ids.min.json");

		HttpUrl url = urlBuilder.build();

		logger.debug("Built URI: {}", url);


		return Observable.defer(() ->
		{
			Request request = new Request.Builder()
				.url(url)
				.build();

			try (Response response = RuneLiteAPI.CLIENT.newCall(request).execute())
			{
				if (!response.isSuccessful())
				{
					logger.warn("Error looking up item stats: {}", response);
					return Observable.just(null);
				}

				InputStream in = response.body().byteStream();
				final Type typeToken = new TypeToken<Map<Integer, ItemStats>>()
				{
				}.getType();
				return Observable.just(RuneLiteAPI.GSON.fromJson(new InputStreamReader(in), typeToken));
			}
			catch (JsonParseException ex)
			{
				return Observable.error(ex);
			}
		});
	}
}
