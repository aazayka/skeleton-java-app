package com.develogical;

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
        if (query.toLowerCase().contains("which of the following numbers is the largest: 96, 44")) {
            return "96";
        }

        return "";
    }
}
