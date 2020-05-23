package com.yearup.Chuck.Norris;

public class Value {
    private Integer id;
    private String joke;

    public Value(){}

    public Integer getId() {
        return id;
    }

    public String getJoke() {
        return joke;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", joke='" + joke + '\'' +
                '}';
    }
}
