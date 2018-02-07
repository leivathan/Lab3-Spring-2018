package com.company;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;



public class Backthatclassup {
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
//    int wordCount(String fodder) {
//
//    }
     public static int wordSearch(final String searcher, final String find) {
         return searcher.split(find).length - 1;
     }
        public static void main(String[] unused) {
        System.out.println(wordSearch(urlToString("http://erdani.com/tdpl/hamlet.txt"), "prince"));
        }
    }

