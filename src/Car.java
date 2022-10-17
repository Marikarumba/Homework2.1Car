public class Car {

    String brand;
    String model;
    Float engineVolume;
    String color;
    int yearProduction;
    String countryProduction;

    public Car(String brand, String model, Float engineVolume, String color, int yearProduction, String countryProduction) {
        if (brand == null){
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume == null) {
            this.engineVolume = 1.5f;
        }else {
            this.engineVolume = engineVolume;
        }

        if (color== null){
            this.color="White";
        } else {
        this.color = color;
        }

        if (yearProduction == 0) {
            this.yearProduction = 2000;
        } else {
            this.yearProduction = yearProduction;
        }

        if (countryProduction == null){
            this.countryProduction = "default";
        } else {
            this.countryProduction = countryProduction;
        }
    }

    @Override
    public String toString() {
        return " Марка, модель: "+brand + " " + model + ", объем двигателя: " + engineVolume + ", цвет: " + color +
                ", год выпуска: " + yearProduction + ", страна изготовитель: " + countryProduction;
    }

    void printCar() {
        System.out.println(toString());
    }

}
