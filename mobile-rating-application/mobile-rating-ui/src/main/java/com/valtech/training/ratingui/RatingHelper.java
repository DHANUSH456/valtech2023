package com.valtech.training.ratingui;

import com.valtech.training.mobile.ranking.MobileRankingService;

public class RatingHelper {
	private MobileRankingService mobRankService;
	public int getRating(String mobile) {
		return mobRankService.rankMobile(mobile);
	}
}
