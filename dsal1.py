def setinput():
    set1 = []
    set2 = []
    
    num1 = int(input("Enter number of elements in set1:"))
    for i in range(num1):
        elements = int(input("Enter the element:"))
        set1.append(elements)
    
    num2 = int(input("Enter number of elements in set2:"))
    for j in range(num2):
        elem = int(input("Enter the element:"))
        set2.append(elem)
    
    return set1, set2 

set1, set2 = setinput()


def union(set1,set2):
 addset=[]
 for elem in set1:
  addset.append(elem)
 for elem in set2:
  if elem not in set1:
      addset.append(elem)

 print("Union of the sets is:",addset) 
 
def intersec(set1,set2):
 intsec=[]
 for elem in set1:
  if elem in set2:
   intsec.append(elem)
 print("Intersection of the sets is:",intsec)
 
def diff(set1,set2):
 diffset1=[]
 diffset2=[]
 for elem in set1:
  if elem not in set2:
   diffset1.append(elem)
 for elem in set2:
  if elem not in set1:
   diffset2.append(elem)
 print("Difference between set1 and set2 is:", diffset1)
 print("Difference between set2 and set1 is:", diffset2)
 
def subset(set1,set2):
 if all(elem in set2 for elem in set1):
  print("Set1 is subset of set2")
 else:
  print("Set1 is not subset of set2")

while True:
 print("MENU")
 print("1. Display the sets")
 print("2. Union of sets")
 print("3. Intersection of sets")
 print("4. Difference between the sets")
 print("5. Check for subset")
 print("6. Terminate program")
 ch=int(input("Enter your choice:"))
 

 if ch==1:
  print("Set 1:", set1)
  print("Set 2:", set2)
  
 elif ch==2:
  union(set1,set2)
  
 elif ch==3:
  intersec(set1,set2)
  
 elif ch==4:
  diff(set1,set2)
 
 elif ch==5:
  subset(set1,set2)
  
 elif ch==6:
  break
 else:
  print("Enter a valid choice!")
