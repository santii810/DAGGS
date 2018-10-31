class Singleton:
    class __Singleton:
        def __init__(self, arg):
            self.val = arg

        def __str__(self):
            return repr(self) + self.val

    instance = None

    def __init__(self, arg):
        if not Singleton.instance:
            Singleton.instance = Singleton.__Singleton(arg)
        else:
            Singleton.instance.val = arg

    def __getattr__(self, name):
        return getattr(self.instance, name)


x = Singleton('Santi')
print(x)
y = Singleton('Pepe')
print(y)
z = Singleton('Paco')
print(z)
print(x)
print(y)
