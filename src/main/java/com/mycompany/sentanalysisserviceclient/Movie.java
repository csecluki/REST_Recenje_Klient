package com.mycompany.sentanalysisserviceclient;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Movie {

    private String title;
    private String director;
    private int positiveSentimentCoutner;
    private int negativeSentimentCounter;
    private String id;

    public Movie() {
    }
    
    public Movie(String title, String director) {
        this.id = String.join("", title.split(" ")).toLowerCase();
        this.title = title;
        this.director = director;
        this.positiveSentimentCoutner = 0;
        this.negativeSentimentCounter = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getPositiveSentimentCoutner() {
        return positiveSentimentCoutner;
    }

    public void setPositiveSentimentCoutner(int positiveSentimentCoutner) {
        this.positiveSentimentCoutner = positiveSentimentCoutner;
    }

    public int getNegativeSentimentCounter() {
        return negativeSentimentCounter;
    }

    public void setNegativeSentimentCounter(int negativeSentimentCounter) {
        this.negativeSentimentCounter = negativeSentimentCounter;
    }

    @JsonIgnore
    public String getId() {
        return id;
    }
    
    @JsonIgnore
    public void recordPositiveSentimentReview()
    {
        this.positiveSentimentCoutner++;
    }
    
    @JsonIgnore
    public void recordNegativeSentimentReview()
    {
        this.negativeSentimentCounter++;
    }
        
}
