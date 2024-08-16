movie_rank = ['닥터 스트레인지','스플릿','럭키']
movie_rank.append('배트맨')
print(movie_rank)

movie_rank2 = ['닥터 스트레인지', '스플릿', '럭키', '배트맨']
movie_rank.insert(1,'슈퍼맨')
print(movie_rank2)

movie_rank3 = ['닥터 스트레인지', '슈퍼맨', '스플릿', '럭키', '배트맨']
del movie_rank[4]
print(movie_rank3)

if movie_rank3[i]=='럭키' :
    result.append(i)
    

movie_rank4 = ['닥터 스트레인지', '슈퍼맨', '스플릿', '배트맨']
del movie_rank4[2]
del movie_rank4[4]
print(movie_rank4)

result = []
for i in range(0, len(movie_rank4)) :
    if movie_rank4[i]=='스플릿':
        result.append(i)
    elif movie_rank4[i]=='배트맨' :
        result.append(i)

lang1 = ["C", "C++", "JAVA"]
lang2 = ["Python", "Go", "C#"]
lang = lang1 + lang2
print(lang)

nums = [1, 2, 3, 4, 5, 6, 7]
min(1)
max(7)
print(min)
print(max)