import math 

sides = eval(raw_input("how many sides? ")) #number of sides 
radius= eval(raw_input("how long is radius? ")) #radius

#returns angle in radians
def calculateAngle(sides):
	angle = math.pi/sides
	return angle

def calculateSideLength(angle, radius):
	slength = 2*radius*(math.cos(angle))
	return slength

def calculateHeight(angle, radius):
	height = radius*math.sin(angle)
	return height 

def calculateArea(height, slength, sides):
	area = sides*(height*slength/2)
	return area

def getArea(sides, radius):
	angle = calculateAngle(sides)
	slength = calculateSideLength(angle, radius)
	height = calculateHeight(angle, radius)
	area = calculateArea(height, slength, sides)
	return area

print "The area of a(n) " + str(sides) + "-sided polygon with radius " + str(radius) + " is " + str(getArea(sides, radius)) + "."


