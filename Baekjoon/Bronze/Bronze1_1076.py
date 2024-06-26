value = ['black', 'brown', 'red', 'orange', 'yellow', 'green', 'blue', 'violet', 'grey', 'white']

a = input()
b = input()
c = input()

res = 0
res = value.index(a) * 10 + value.index(b)
iterator = value.index(c)

for i in range(iterator):
    res = res * 10
print(res)