class BankSystem:
    def pay(self):
        pass


class Email:
    def notifyPay(self):
        pass


class BillingSystem:
    pass


class CustomerRelationshipManager:
    pass


class Facade:
    def __init__(self):
        self._bankSystem = BankSystem()
        self._billingSystem = BillingSystem()
        self._CRM = CustomerRelationshipManager()
        self._Email = Email()

    def pey(self):
        self._bankSystem.pay()
        self._Email.notifyPay()


def main():
    facade = Facade()
    facade.pay()
