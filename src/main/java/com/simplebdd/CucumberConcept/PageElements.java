package com.simplebdd.CucumberConcept;

import java.util.Hashtable;

public final class PageElements {
	public static final String CSS_BETWAY_LIVE_GAMES = "#inplay-module .marketTitle a";
	public static final String CSS_GOOGLE_NEWS_HEADLINES = ".esc-lead-article-title .titletext";

	public static final Hashtable<String, String> webSiteValues = new Hashtable<String, String>()
			{{
				put("google news headlines", CSS_GOOGLE_NEWS_HEADLINES);
				put("betway live games", CSS_BETWAY_LIVE_GAMES);
			
			}};


}
