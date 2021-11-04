package com.company;

public class Robot extends Car{


    private EnumColor enumColor;

    public Robot(EnumColor enumColor) {

        super.getEnumColor(enumColor);
    }
    public EnumColor getEnumColor() {
        return enumColor;
    }

    public String getInfo() {
        return  "Color: " + this.enumColor;
    }


}
