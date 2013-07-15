stringThing = "40"
doubleVal = (stringThing)
intVal = int(stringThing)
floatVal = float(stringThing)
print (stringThing)

print ("""the
dragon
is
helpful""")

hello = r"Wow this string is far too long, I don't why, but I feel like a long string would do just fine here in my random easy script"
print (hello)

word = "word"
print (word)
print (word[0])
print (word [1])

print (word[:2])
print (word[2:])
print (word[1:3])

print ("What?! " + str(20) + " Why?!")
print ("What?!"*500)

word = "word"
print (word[-1])
print (word[-2])
print (word[-3])
print (word[-4])

#static values
vars = "ilovemelons"
vars = 89
vars = 'j'
vars = 666
print (vars)

#easy list
a = ['spam', 'eggs', 100, 1234]
a[0]
a[-2]
a[1:-1]
a[:2] + ['bacon', 2*2]
3*a[:3] + ['Boo!']  #concatenates the list together 3 times

a[2] = a[2] + 23

#replace a range of items
a[0:2] = [1, 12]

#length of list
len(a)

#if statements234234234234234
x = int(input("Please enter an integer: "))
if x < 0:
    x = 0
    print ('Negative changed to zero')
elif x == 0:
    print ('Zero')
elif x == 1:
    print ('Single')
else:
    print ('More')

#while loop
while True:
    n = input("Please enter'hello':")
    if n.strip() == 'hello':
        break
words = ['poop', 'poopy', 'pooped']
for w in words:
    print (w, len(w))
    #note: regular print is println, the comma prevents the newline character

    range(10)

    a = ['Mary', 'had', 'a', 'giantfucking', 'razor']
    for i in range(len(a)):
         print (i, a[i])

def primes(n):
    for n in range(2, n):
         for x in range(2, n):
             if n % x == 0:
                 break345324
         else:
             print (n, 'is a prime number')

class MyClass:
    def __init__(self):
        self.data = []

    i = 12345
    def f(self):
        return ('hello world')

x = MyClass()
print(x)



def f1(self, x, y):
    return min(x, x+y)

class C:
    f = f1
    def g(self):
        return ('hello world')
    h = g

x = C()
print(x.g)
print (x.f(2,10))
print (x.h())
x.bannanavar = "10"

#A tuple consists of a number of values separated by commas, for instance:
t = 12345, 54321, 'hello!'  #this is tuple packing
t[0]
print (t)
u = t, (1, 2, 3, 4, 5)
print (u)

#empty tuple
empty = ()

#tuple unpacking
x, y, z = t

print(x,y,z)

#function that uses tuples
def swap(a,b):
   return b,a  #WHAT??!!, returning TWO values!

a=2
b=5
a,b = swap(a,b)

print (str(a) + ", " + str(b))

#or an easier way to swap
a, b = b, a  #woah
print(b,a)

#dictionary
tel = {'jack': 4098, 'sape': 4139}
tel['guido'] = 4127
print (tel['jack'])
del tel['sape']    #delete it from list
print (tel.keys())        #print all keys
print ('guido') in tel    #returns true if 'guido' is a key in the dictionary
x=4
if 1<x<10:
    print('true')
