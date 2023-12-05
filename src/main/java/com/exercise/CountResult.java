package com.exercise;

public class CountResult {
    private String word;
    private Integer vowelCount;
    private Integer consonantCount;

    public CountResult(String word, Integer vowelCount, Integer consonantCount) {
        this.word = word;
        this.vowelCount = vowelCount;
        this.consonantCount = consonantCount;
    }

    public Integer getVowelCount() {
        return vowelCount;
    }
    public Integer getConsonantCount(){return  consonantCount;}

    public void setVowelCount(Integer vowelCount) {
        this.vowelCount = vowelCount;
    }

    public void setConsonantCount(Integer consonantCount){
        this.consonantCount = consonantCount;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
    
    @Override
    public String toString() {
        return "CountResult{" +
                "word='" + word + '\'' +
                ", vowelCount=" + vowelCount +
                ", consonantCount=" + consonantCount +
                '}';
    }
}
