<?php

class Player {

    private $state = null;

    public function __construct($state) {
        $this->state = $state;
    }

    public function getState() {
        return $this->state;
    }

}

interface State {

    public function executeCommand();
}

class DeadState implements State {

    public function executeCommand() {
        echo "this player is dead";
    }

}

class HurtState implements State {

    public function executeCommand() {
        echo "this player is hurt, do command slowly";
    }

}

class HealtyState implements State {

    public function executeCommand() {
        echo "this player is Healthy, do command so fast";
    }

}
