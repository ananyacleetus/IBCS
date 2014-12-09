import math 


def geometricDistance(lat1,long1,lat2,long2):
	point1 = [lat1,long1]
	point2 = [lat2, long2]
	R=6371
	N = math.pi/180
	p1rad = [x*N for x in point1]
	p2rad = [x*N for x in point2]
	# p1rad = point1 * (math.pi/180)
	# p2rad = point2 * (math.pi/180)		
	d = math.sin(p1rad[1])*math.sin(p2rad[1])+math.cos(p1rad[1])*math.cos(p2rad[1])*math.cos(math.fabs(p1rad[0]-p2rad[0]))	
	d = math.acos(d)
	return R*d

print geometricDistance(40,-80,28,77)