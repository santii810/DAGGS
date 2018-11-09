<?php

abstract class Vehicle {

    public abstract function start();

    public abstract function run();

    public abstract function stop();

    public function testYourVehicle() {
        $this->start();
        $this->run();
        $this->stop();
    }

}

class Car extends Vehicle {
    private function start() {
        
    }
    private function run() {
        
    }
    private function stop() {
        
    }

}

class Truck extends Vehicle {
    private function start() {
        
    }
    private function run() {
        
    }
    private function stop() {
        
    }
}

class Tester {
    public function testVehicle() {
        $car = new Car();
        $truck = new Truck();
        
        $car->testYourVehicle();
        $truck->testYourVehicle();
    }

}
