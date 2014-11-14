import Inscribed_Cleetus as ic
import Circumscribed_Cleetus as cc

sides = eval(raw_input("how many sides? ")) #number of sides 
radius= eval(raw_input("how long is radius? ")) #radius

def findPiUpper(sides, radius):
	UpPi = cc.getArea(sides,radius)/(radius*radius)
	return UpPi

def findPiLow(sides, radius):
	LowPi = ic.getArea(sides,radius)/(radius*radius)
	return LowPi

def findPiAvg(sides, radius):
	LowPi = findPiLow(sides,radius)
	UpPi = findPiUpper(sides,radius)
	AvgPi = (LowPi + UpPi)/2 
	return AvgPi

print "The upper approximation of pi is " + str(findPiUpper(sides, radius)) + " and the lower approximation of pi is " + str(findPiLow(sides, radius)) + " and the average approximation of pi is " + str(findPiAvg(sides, radius)) + "."