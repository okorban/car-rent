package com.comarch.camp.it.rent.car;


import com.comarch.camp.it.rent.car.model.Car;
import org.apache.commons.codec.digest.DigestUtils;

public class Test {
    public static void main(String[] args) {
/*        String seed = "mAvgiT9pbWHj^.Z+H&v8OG7{cxk,%i2iE{)Lajec";
        String haslo = "admin123";

        String hash = DigestUtils.md2Hex(haslo+seed);

        System.out.println(hash);*/

        Car car = new Car("Audi", "A5", 2023, 34.5, "KR1");
        System.out.println(car.getClass().getSimpleName());

    }

}
