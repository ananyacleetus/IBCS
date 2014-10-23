# entry = raw_input("Enter items, separated by commas: ")
# items = [int(n) for n in entry.split()]

#I decided to populate my data set to begin with, just for now, to submit the working sort.
items = [2,67,3,89,0,1,4,54,56,3,5,62,125,29] 

for i in range(0, len(items)):
        mini = i
        for j in range(i,len(items)):
            if items[mini] > items[j]:
                mini = j
        items[i], items[mini] = items[mini], items[i]
print items
		