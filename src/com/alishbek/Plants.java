package com.alishbek;

public class Plants extends LivingOrganism{
    private Place placeOfPlant;

    public Plants(int age, Color color, String name, Place placeOfPlant) {
        super(age, color, name);
        this.placeOfPlant=placeOfPlant;
    }

    public Place getPlaceOfPlant() {
        return placeOfPlant;
    }
    final public void grow(){
        System.out.println("Plant grew by 10cm");
    }
    public void grow(int centimetres){
        System.out.println("Plant grew by "+centimetres+"cm");
    }
    public void getInfo(){
        System.out.println("Age: "+this.getAge()+
                "\nColor: "+this.getColor()+
                "\nName: "+this.getName()+
                "\nPlace: " + placeOfPlant.getPlace() +
                "\nCountry: "+placeOfPlant.getCountry());
    }
}
