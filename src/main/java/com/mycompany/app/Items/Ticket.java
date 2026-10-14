package com.mycompany.app.Items;

public class Ticket {

    private final String title;
    private final long price;
    private AgeRequirement ageReq;

    public Ticket(String title, long price, AgeRequirement ageReq) {
        this.title = title;
        this.price = price;
    }


}
