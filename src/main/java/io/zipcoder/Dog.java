package io.zipcoder;

public class Dog extends Pet{

    public Dog(String name){
        super.setName(name);
    }

    @Override
    public void speak(){
        System.out.println("Ruff Ruff! I am "+super.getName()+" the "+getClass().getSimpleName());
    }

}
