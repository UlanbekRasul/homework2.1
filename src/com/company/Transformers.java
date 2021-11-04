package com.company;

public final class  Transformers extends Robot{
private String name;
private String superAbility;
private String weapon;

    public Transformers(EnumColor enumColor, String name, String superAbility) {
        super(enumColor);
        this.name = name;
        this.superAbility = superAbility;
    }

    public Transformers(EnumColor enumColor, String name, String superAbility, String weapon) {
        super(enumColor);
        this.name = name;
        this.superAbility = superAbility;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public String getWeapon() {
        return weapon;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nName:" + name +
                "\nSuper Ability:" + superAbility +
                "\nWeapon:" + weapon;

    }

}