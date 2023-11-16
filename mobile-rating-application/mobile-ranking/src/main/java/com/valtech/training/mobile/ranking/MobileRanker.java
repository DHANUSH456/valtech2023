package com.valtech.training.mobile.ranking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.valtech.training.pattern.checker.PatternChecker;

public class MobileRanker {

    public static List<String> rankMobiles(List<PatternChecker.PhoneNumberScore> phoneScores) {
        Collections.sort(phoneScores, new PhoneNumberScoreComparator());

        List<String> rankedPhoneNumbers = new ArrayList<>();

        for (PatternChecker.PhoneNumberScore phoneScore : phoneScores) {
            rankedPhoneNumbers.add(phoneScore.phoneNumber);
        }

        return rankedPhoneNumbers;
    }

    private static class PhoneNumberScoreComparator implements Comparator<PatternChecker.PhoneNumberScore> {
        @Override
        public int compare(PatternChecker.PhoneNumberScore p1, PatternChecker.PhoneNumberScore p2) {
            return Integer.compare(p2.score, p1.score);
        }
    }

}
