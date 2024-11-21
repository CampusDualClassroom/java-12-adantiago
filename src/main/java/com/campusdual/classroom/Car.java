package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car (String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car() {
        this("-", "-", "-");
    }

    public void start() {
        if (this.isTachometerEqualToZero()) {
            this.tachometer = 1000;
            System.out.println("Vehículo acendido");
        } else {
            System.out.println("O vehículo xa está acendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0 && this.isTachometerGreaterThanZero()) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("Non se pode apagar o vehículo, primeiro ten que estar detido");
        }
    }

    public void accelerate() {
        this.speedometer += 10;
        if (this.speedometer > MAX_SPEED) {
            this.speedometer = 120;
        }
    }

    public void brake() {
        this.speedometer -= 10;
        if (this.speedometer < 0) {
            this.speedometer = 0;
        }
    }

    public void turnAngleOfWheels (int angle) {
        this.wheelsAngle += angle;
        if (this.wheelsAngle < -45) {
            this.wheelsAngle = -45;
        }
        if (this.wheelsAngle > 45) {
            this.wheelsAngle = 45;
        }
    }

    public String showSteeringWheelDetail () {
        return null;
    }

    public boolean isReverse() {
        return this.reverse;
    }

    public void setReverse(boolean reverse) {
        if (this.speedometer == 0 && reverse) {
            this.reverse = reverse;
            if (reverse) {
                this.gear = "R";
            } else {
                this.gear = "N";
            }
        }
    }

    public void showDetails() {
    }

    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }

    public boolean isTachometerGreaterThanZero() {
        return this.tachometer > 0;
    }

}
