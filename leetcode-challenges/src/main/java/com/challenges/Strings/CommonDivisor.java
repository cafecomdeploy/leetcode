package com.challenges.Strings;

import java.math.BigInteger;

public class CommonDivisor {

    public String gcdOfStrings(String str1, String str2) {
        if(!str1.concat(str2).equals(str2.concat(str1))){
            return "";
        }
        int common = BigInteger.valueOf(str1.length())
                .gcd(BigInteger.valueOf(str2.length()))
                .intValue();
        return str1.substring(0, common);
    }
}
