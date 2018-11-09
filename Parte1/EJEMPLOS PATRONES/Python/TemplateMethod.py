import abc


class Vehicle(metaclass=abc.ABCMeta):
    @abc.abstractmethod
    def _start(self):
        pass

    @abc.abstractmethod
    def _stop(self):
        pass

    @abc.abstractmethod
    def _run(self):
        pass

    def testYourVehicle(self):
        self._start()
        self._run()
        self._stop()


class Car(Vehicle):
    def _start(self):
        pass

    def _stop(self):
        pass

    def _run(self):
        pass


class Truck(Vehicle):
    def _start(self):
        pass

    def _stop(self):
        pass

    def _run(self):
        pass


def main():
    vehicle = Car()
    vehicle.testYourVehicle()
