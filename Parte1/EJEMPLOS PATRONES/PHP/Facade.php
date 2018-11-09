<?php

class Facade {
    public function __construct() {
        $this->bankSystem = new BankSistem();
        $this->billingSystem = new BillingSystem();
        $this->CRM = new CustomerRelationshipManager();
        $this->Email = new Email();
    }
    public function pay() {
        $this->BankSistem::pay;
        $this->Email::notify;
    }
}

class BankSistem {
    public function __construct();
    public function pay();
}

class Email {
    public function notify();
}




