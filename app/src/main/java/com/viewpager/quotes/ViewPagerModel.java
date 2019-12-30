package com.viewpager.quotes;

public class ViewPagerModel {

    private String quotes, quotetypes, quoteauthor;

    // empty constructor
    public ViewPagerModel() {
    }

    public ViewPagerModel(String quotes, String quotetypes, String quoteauthor) {

        this.quotes = quotes;
        this.quotetypes = quotetypes;
        this.quoteauthor = quoteauthor;
    }

    public String getQuotes() {
        return quotes;
    }

    public void setQuotes(String quotes) {
        this.quotes = quotes;
    }

    public String getQuotetypes() {
        return quotetypes;
    }

    public void setQuotetypes(String quotetypes) {
        this.quotetypes = quotetypes;
    }

    public String getQuoteauthor() {
        return quoteauthor;
    }

    public void setQuoteauthor(String quoteauthor) {
        this.quoteauthor = quoteauthor;
    }
}
