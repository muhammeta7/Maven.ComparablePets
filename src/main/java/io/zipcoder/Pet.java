package io.zipcoder;

public class Pet implements Comparable<Pet>{

    String name;

    public Pet() {

    }

    public void speak(){

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int compareTo(Pet p) {
        if(this.getName().compareTo(p.getName())==0)
            return this.getClass().getSimpleName().compareTo(p.getClass().getSimpleName());
        else
            return this.getName().compareTo(p.getName());
    }

}
