package com.alishbek;

public class Main {

    public static void main(String[] args) {
        Place place1 = new Place("mountain", "Russia");
	    Plants grass = new Plants(4, Color.GREEN, "Grass", place1);
        grass.getInfo();
	    grass.grow();
	    grass.grow(15);

        System.out.println();
        Place place2 = new Place("forest", "Kyrgyzstan");
        Tree oakTree = new Tree(40, Color.BROWN, "Oak", place2, Color.GREEN, "Oak");
        oakTree.getInfo();
        oakTree.grow();
        oakTree.grow(3);

        System.out.println();
        Place place3 = new Place("hill", "Italy");
        Tree birchTree = new Tree(27, Color.WHITE, "Lucky Tree", place3, Color.GREEN, "Birch Tree");
        birchTree.getInfo();
        birchTree.grow();
        birchTree.grow(2);

    }
}
