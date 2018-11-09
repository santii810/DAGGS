<?php

class Manufacturer {
    private $builder = null;

    public function __contruct($builder) {
        $this->builder = $builder;
    }
    public function contruct() {
        $this->builder->buildBase();
        $this->builder->buildScreen();
        $this->builder->buildButtons();
    }
}

interface PhoneBuilder {
    public function buildBase();
    public function buildScreen();
    public function buildButtons();
}

class WindowsPhoneBuilder implements PhoneBuilder {

    public function buildBase() {
        
        
    }

    public function buildButtons() {
        
        
        
    }

    public function buildScreen() {
        
        
        
        
        //TODO build method
    }

}
class AndroidBuilder implements PhoneBuilder {

    public function buildBase() {
        
        
        
    }

    public function buildButtons() {
        //TODO build method
        
        
        
    }

    public function buildScreen() {
        //TODO build method
        
        
    }

}
