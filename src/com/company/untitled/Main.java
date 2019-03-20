package com.company.untitled;


class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat [5];
        cats[0] = new Cat("Murzik", 10 );
        cats[1] = new Cat("Barsik", 15 );
        cats[2] = new Cat("Tom", 16 );
        cats[3] = new Cat("Ryzhik", 12 );
        cats[4] = new Cat("Belik", 15 );



        Plate plate = new Plate(30);

        for (Cat cat: cats) {
            cat.eat(plate);
            plate.info();
            cat.info();
        }
        plate.addFood(100);
        plate.info();
    }
}