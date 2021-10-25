import numpy


arr = numpy.array([1, 2, 3, 4, 5])
print(arr)

fruits = ["apple", "banana", "cherry", "kiwi", "mango"]
fruits.reverse()
print(fruits)

if 5 > 2:
    print("it is well")


thistuple = ("apple", "banana", "cherry", "apple", "cherry")
print(thistuple)


class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age


p1 = Person("John", 36)


print(p1.name)
print(p1.age)

dictTest = {
    "name": "John",
    "age": "24",
    "class": "Person",
    "family": "Ainoo",
    "location": "Accra",
}
