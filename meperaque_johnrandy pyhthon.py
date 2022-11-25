group1 = set()
group2 = set()
self = set()
for i in range(1, 3 + 1):
    birthmonth1 = input("Enter Birthmonth" + str(i) + ": ")
    group1.add(birthmonth1)
    
for i in range(1, 3 + 1):
    birthmonth2 = input("Enter Birthmonth" + str(i) + ": ")
    group2.add(birthmonth2)
    
print("Group 1: " + str(group1))
print("Group 2: " + str(group2))

birthmonth = input("Enter your Birthmonth: ")
self.add(birthmonth)

union = group1 | group2

print("Union: " + str(union))
print("Intersection: " + str(group1 & group2 ))
print("Difference: " + str(group1 - group2 ))

sameBday1 = group1 - self
sameBday2 = group2 - self
sameBday3 = len(sameBday1) + len(sameBday2)
if(sameBday3==6):
    print("You don't have the same birthday with any of your classmates")
elif(sameBday3==5):
    print("You have the same birthday with one of your classmates")
elif(sameBday3==4):
    print("You have the same birthday with two of your classmates")
elif(sameBday3==3):
    print("You have the same birthday with three of your classmates")
elif(sameBday3==2):
    print("You have the same birthday with four of your classmates")
elif(sameBday3==1):
    print("You have the same birthday with five of your classmates")
else:
    print("You have the same birthday with all of your classmates")