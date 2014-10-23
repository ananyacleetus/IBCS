data = [5,2,3,6,7,9,1,0,10,23,8,34,4] 
numb = len(data) 
swapped = True 
count = 0 
low = 0
high = 0

while swapped == True:
 	swapped = False 
 	for count in xrange(1, numb):
 		if data[count-1] > data[count]:
 			high = data[count-1]
 			low = data[count]
 			data[count-1] = low 
 			data[count] = high 
 			swapped = True
print data




