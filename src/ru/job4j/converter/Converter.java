package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

        public static void main(String[]args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(180);
        System.out.println("indicated rubles are " + euro + " euro.");
        System.out.println("indicated rubles are " + dollar + " dollars.");
            float inEu = 140;
            float expectedEu = 2;
            float inDol = 180;
            float expectedDol = 3;
            float out1 = Converter.rubleToEuro(inEu);
            float out2 = Converter.rubleToDollar(inDol);
            boolean passed1 = expectedEu == out1;
            boolean passed2 = expectedDol == out2;
            System.out.println("indicated rubles are 2.0 euro Test result : " + passed1);
            System.out.println("indicated rubles are 3.0 dollars Test result : " + passed2);
    }
}