# import numpy


# arr = numpy.array([1, 2, 3, 4, 5])
# print(arr)

# fruits = ["apple", "banana", "cherry", "kiwi", "mango"]
# fruits.reverse()
# print(fruits)

# if 5 > 2:
#     print("it is well")


# thistuple = ("apple", "banana", "cherry", "apple", "cherry")
# print(thistuple)


# class Person:
#     def __init__(self, name, age):
#         self.name = name

#         self.age = age


# p1 = Person("John", 36)


# print(p1.name)
# print(p1.age)

# dictTest = {
#     "name": "John",
#     "age": "24",
#     "class": "Person",
#     "family": "Ainoo",
#     "location": "Accra",
# }


# def readFile():
#     f = open("Labs/Python/Data Science/file.txt", "r")
#     # print(f.read())
#     print(f.readline())


# readFile()



# def evenOdd(number):
#     if number % 2 == 0:
#         return "even"
#     return "odd"


import random
def randomGuess():
    rand = random.randint(1,5)
    print(rand)
    
    print("Random Guess Game ")
    print("Please guess a random number between (1 - 5) I have picked")
    print("Enter 0 to quit")
    print(" ")

    while True:
        num = eval(input("Enter another Guess: "))
        if num == rand:
            break
    print("You entered the correct guess")
    
randomGuess()