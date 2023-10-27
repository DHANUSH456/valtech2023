package com.valtech.training.mobile.ranking;

import java.util.List;

import com.valtech.training.pattern.checker.*;

public class MobileRankingServiceImpl implements MobileRankingService {
	
	private PatternCheckerService pattCheckService = new PatternCheckerServiceImpl();
	
	@Override
	public int  rankMobile(String mobile) {
		List<String> patterns=pattCheckService.listPatterns(mobile);
		return 0;
	}
}
