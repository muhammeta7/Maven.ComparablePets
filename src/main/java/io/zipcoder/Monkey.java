package io.zipcoder;

public class Monkey extends Pet{

    public Monkey(String name){
        super.setName(name);
    }

    @Override
    public void speak(){
        System.out.println("OooOoo Ahah! I am "+super.getName()+" the "+getClass().getSimpleName());
    }

}
