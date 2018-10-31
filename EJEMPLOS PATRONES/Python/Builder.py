import abc


class Manufacturer:

    def __init__(self):
        self._builder = None

    def constuct(self, builder):
        self._builder = builder
        self._builder.buildBase()
        self._builder.buildScreen()
        self._builder.buildButtons()


class PhoneBuilder(metaclass=abc.ABCMeta):

    @abc.abstractmethod
    def buildBase(self):
        pass

    @abc.abstractmethod
    def buildScreen(self):
        pass

    @abc.abstractmethod
    def buildButtons(self):
        pass


class WindowsPhoneBuilder(PhoneBuilder):
    def buildBase(self):
        pass

    def buildScreen(self):
        pass

    def buildButtons(self):
        pass


class AndroidPhoneBuilder(PhoneBuilder):
    def buildBase(self):
        pass

    def buildScreen(self):
        pass

    def buildButtons(self):
        pass
