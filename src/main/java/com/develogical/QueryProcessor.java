package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("romeo and juliet")) {
            return "William Shakespeare222";
        }

        if (query.toLowerCase().contains("what is your name")) {
            return "Andrey Z :)";
        }

        return "";
    }
}
