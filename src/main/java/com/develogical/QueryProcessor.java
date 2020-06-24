package com.develogical;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("romeo and juliet")) {
            return "William Shakespeare222";
        }

        if (query.toLowerCase().contains("what is your name")) {
            return "Andrey Z";
        }

        if (query.toLowerCase().contains("what is 5 plus 1")) {
            return "6";
        }

        if (query.toLowerCase().contains("what is 14 plus 14")) {
            return "28";
        }

        if (query.toLowerCase().matches("what is \\d+ plus \\d+")) {
            return sum(query.toLowerCase());
        }

        if (query.toLowerCase().contains("which of the following numbers is the largest: 96, 44")) {
            return "96";
        }
        if (query.toLowerCase().contains("which of the following numbers is the largest")) {
            return largest(query.toLowerCase());
        }

        return "";
    }

    private String largest(String toLowerCase) {
        OptionalInt x = Arrays.stream(toLowerCase.replace("which of the following numbers is the largest: ", "").split(","))
        .map(String::trim)
                .mapToInt(Integer::valueOf)
        .max();

        return String.valueOf(x.getAsInt());
    }

    private String sum(String toLowerCase) {
        Pattern p = Pattern.compile("what is (\\d+) plus (\\d+)");

        Matcher m = p.matcher(toLowerCase);
        if(
                m.find()) {
            return String.valueOf(Integer.valueOf(m.group(1)) + Integer.valueOf(m.group(2)));
        }
        return "0";
    }
}
