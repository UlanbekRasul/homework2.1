package com.company;

public class Main {



    public static void main(String[] args) {
Robot robot = new Robot(EnumColor.BLACK);
Transformers Megatron = new Transformers(EnumColor.GREY, "Megatron","Cyber-attack", "gun");
Transformers Bumblebee = new Transformers(EnumColor.YELLOW,"Bumblebee","Sudden attack");
        System.out.println(robot.getInfo());
        System.out.println(Megatron.getInfo());
        System.out.println(Bumblebee.getInfo());


    }
}
