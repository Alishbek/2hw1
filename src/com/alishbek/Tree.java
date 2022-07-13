package com.alishbek;

final public class Tree extends Plants{
    private Color colorOfLeaves;
    private String typeOfTree;

    public Tree(int age, Color color, String name, Place placeOfPlant, Color colorOfLeaves, String typeOfTree) {
        super(age, color, name, placeOfPlant);
        this.colorOfLeaves=colorOfLeaves;
        this.typeOfTree=typeOfTree;
    }

    public Color getColorOfLeaves() {
        return colorOfLeaves;
    }

    public String getTypeOfTree() {
        return typeOfTree;
    }

    @Override
    public void grow(int centimetres) {
        System.out.println("Tree "+this.getName()+" grew by "+centimetres+"cm");
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Color of leaves: "+colorOfLeaves+
                "\nType of tree: "+typeOfTree);
    }
}

