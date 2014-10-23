entry = raw_input("Enter items, separated by commas: ")
items = entry.split(",")
search = raw_input("Enter search term: ")
found = False
for x in xrange(0, len(items)):
	if items[x]==search: 
		print x
		found = True
		break
if found == False: 
	print "Item not found"

