import math 


def geometricDistance(lat1,long1,lat2,long2):
	point1 = [lat1,long1]
	point2 = [lat2, long2]
	r=6371
	N = (math.pi/180)
	p1rad = [x*N for x in point1]
	p2rad = [x*N for x in point2]
	lat1 = p1rad[0]
	long1 = p1rad[1]
	lat2 = p2rad[0]
	long2 = p2rad[1]
	x = r*math.cos(lat2)*math.cos(long2)-r*math.cos(lat1)*math.cos(long1)
	y = r*math.cos(lat2)*math.sin(long2)-r*math.cos(lat1)*math.sin(long1)
	z = r*math.sin(lat2)-r*math.sin(lat1)

	d = math.sqrt(math.pow(x,2) + math.pow(y,2) + math.pow(z,2))

	return d

print geometricDistance(40,-80,28,77)
