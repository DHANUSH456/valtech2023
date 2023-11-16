package com.valtech.training.pattern.checker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PatternChecker {

    @SuppressWarnings("unchecked")
	public static List<PhoneNumberScore> checkPatterns(List<String> phoneNumbers) {
        List<PhoneNumberScore> fancyNumbers = new ArrayList<>();
        @SuppressWarnings("rawtypes")
		List<PhoneNumberScore> nonFancyNumbers = new ArrayList();

        for (String phoneNumber : phoneNumbers) {
            int score = 0;

            if (isAllDigitsSame(phoneNumber)) {
                score += 6;
            }

            if (isPalindrome(phoneNumber)) {
                score += 5;
            }

            if (hasRepeatedDigit(phoneNumber)) {
                score += 4;
            }

            if (isAscendingOrder(phoneNumber)) {
                score += 3;
            }

            if (isDescendingOrder(phoneNumber)) {
                score += 2;
            }

            if (hasConsecutiveSequence(phoneNumber)) {
                score += 1;
            }

            PhoneNumberScore phoneScore = new PhoneNumberScore(phoneNumber, score);

            if (score > 0) {
                fancyNumbers.add(phoneScore);
            } else {
                nonFancyNumbers.add(phoneScore);
            }
        }

        List<PhoneNumberScore> combinedList = new ArrayList<>();
        combinedList.addAll(fancyNumbers);
        combinedList.addAll(nonFancyNumbers);

        return combinedList;
    }

    private static boolean isAllDigitsSame(String phoneNumber) {
        return phoneNumber.matches("^(.)\\1*$");
    }

    private static boolean isPalindrome(String phoneNumber) {
        String reversed = new StringBuilder(phoneNumber).reverse().toString();
        return phoneNumber.equals(reversed);
    }

    private static boolean hasRepeatedDigit(String phoneNumber) {
        return phoneNumber.matches(".*(\\d)\\1.*");
    }

    private static boolean isAscendingOrder(String phoneNumber) {
        for (int i = 0; i < phoneNumber.length() - 1; i++) {
            if (phoneNumber.charAt(i) > phoneNumber.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isDescendingOrder(String phoneNumber) {
        int length = phoneNumber.length();
        
        for (int i = 0; i < length - 1; i++) {
            if (phoneNumber.charAt(i) < phoneNumber.charAt(i + 1)) {
                return false;
            }
        }
        
        return true;
    }
//HashMap<String, Integer> hashMap=new HashMap<String, Integer>();
    private static boolean hasConsecutiveSequence(String phoneNumber) {
        return phoneNumber.matches(".*0123456789.*");
    }

    public static class PhoneNumberScore {
        public String phoneNumber;
        public int score;

        PhoneNumberScore(String phoneNumber, int score) {
            this.phoneNumber = phoneNumber;
            this.score = score;
        }
    }
}
