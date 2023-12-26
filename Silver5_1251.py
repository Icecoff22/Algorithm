word = list(input())
res = []
for i in range(1,len(word)-1):
    for j in range(i+1,len(word)):
        preword = word[:i]
        midword = word[i:j]
        postword = word[j:]
        preword.reverse()
        midword.reverse()
        postword.reverse()
        
        res.append("".join(preword+midword+postword))
print(min(res))
#풀이 : 단어를 배열화, join의 사용