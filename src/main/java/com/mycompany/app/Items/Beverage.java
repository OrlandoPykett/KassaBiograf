package com.mycompany.app.Items;

import static com.mycompany.app.Items.AgeRequirement.*;

public class Beverage extends Item {

    private BeverageSize size;
    private AgeRequirement ageReq;

    public Beverage(String id, String name, long price, BeverageSize size, boolean isAlcoholic) {
        super(id, name, price);
        this.size = size;

        if (isAlcoholic) {
            this.ageReq = AGE_18;
        }
        else {
            this.ageReq = AGE_0;
        }
    }
}
