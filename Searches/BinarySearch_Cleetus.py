entry = raw_input("Enter items, separated by commas: ")
items = entry.split(",")
search = raw_input("Enter search term: ")

low = 1
high = len(items) 
guess = high/2 
dist = 0
compCount = 0


while not(items[guess-1]==search):
	dist = (high-low+1)/2 
	if search > items[guess-1]:
		compCount=compCount+1
		low = guess
		dist = (high-low+1)/2 
		guess = guess + dist 
	if search < items[guess-1]:
		compCount=compCount+1
		high = guess
		dist = (high-low+1)/2 
		guess = guess-dist
	if high-low == 0:
		break
if (items[guess-1]==search):
	print (str(guess-1) + " is the position of the search term.")
	print (str(compCount +1 ) + " comparison(s) were made.")
else: 	
	print "Item not found."
	print (str(compCount) + " comparison(s) were made.")
