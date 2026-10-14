package com.mycompany.app.Items;

public class Ticket {

    private Movie movie;
    private final long price;
    private AgeRequirement ageReq;

    public Ticket(Movie movie, long price, AgeRequirement ageReq) {
        this.movie = movie;
        this.price = price;
    }


}
