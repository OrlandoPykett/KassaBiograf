package com.mycompany.app.Items;

import static com.mycompany.app.Items.AgeRequirement.age_18;

public class Beverage extends Item {

    private String name;
    private BeverageSize size;
    private AgeRequirement ageReq;

    public Beverage(String name, BeverageSize size, boolean isAlcoholic) {
        this.name = name;
        this.size = size;

        if( isAlcoholic ) this.ageReq = age_18;
    }
}
