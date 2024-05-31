import random

Noten = []
for _ in range(20):
    x = round(random.uniform(1.0, 6.1), 1)
    Noten.append(x)
print ("before", Noten)
min_num = min(Noten)
max_num = max(Noten)
Noten.remove(min_num)
Noten.remove(max_num)
print ("Without highest and lowest", Noten)
average = sum(Noten) / len(Noten)
rounded_average = round(average / 0.5) * 0.5
print("Rounded average:", rounded_average)
