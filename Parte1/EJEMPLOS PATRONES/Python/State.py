import abc


class Player:
    def __init__(self, state):
        self.__state = state

    def request(self):
        self._state.handle()


class State(metaclass=abc.ABCMeta):
    @abc.abstractmethod
    def executeCommand(self):
        pass


class DeadState(State):
    def executeCommand(self):
        print("this player is dead")


class HurtState(State):
    def executeCommand(self):
        print("this player is hurt, do command slowly")


class HealthyState(State):
    def executeCommand(self):
        print("this player is Healthy, do command so fast")


