n = int(input())
a = 0
b = 0
c = 0
for i in range(n+1):
    a += i
    b += i
    c += i * i * i
print(a)
print(b*b)
print(c)