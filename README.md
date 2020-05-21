# PaintCostEstimatorForRoom

This is an application that can be used to estimate the cost to paint a room. 

This application have the following:

### Methods 
– the task broken down into independent modules and methods used to implement those modules and developd the solution to application.

### Data validation 
– Validated all the information entered by the user and provided an appropriate message to the user.

### Quality 
– Followed the rules and conventions of naming a variable, method and class. Provided comments and proper organization of the code.


### Following are assumptions for application:

•	Room is a rectangular room.
•	It has one window and a door and both are rectangular.
•	Not painting the floor. The walls will be painted with the egg shell paint, roof with the flat paint and all the doors and windows with the semi-gloss paint.
•	Units of measurements for length are in inches and paint are in gallon.
•	Cannot buy paint gallon in fraction.
•	Labour rate is $20 per hour.
•	Door and window can’t be bigger than a wall.


### Provided the following functionality:

•	Application continues as long as the user wants.
•	It Accepts length, width, and height of the room along with the dimensions of the door and window.
•	It accepts number of hours needed to paint.
•	It also accepts the information about the paint i.e. cost per gallon, coverage area and type of paint
•	Validates all the dimensions that they are positive and room height is between 8 feet to 16 feet both inclusive.


### Implemented the following:
•	Exception handling to handle all the possible exceptional situations i.e. abnormalities like data validation
•	Created and used the following classes:
   o	Room, Door, Window, and Paint
   
 ### Classes – created classes provided with appropriate associations between them and Implemented Inheritance and Composition/Aggregation
 
-	Provided the possible constructors 
-	Provided the appropriate attributes 
-	Provided the needed methods
-	Provided accessors and mutators


### Data validation – Implemented through exception handling

### I Made it menu-based application which displays the following menu and based upon the user’s choice the menu option gets selected:
********************************
Main Menu - Paint Cost Estimator
********************************
1.  Enter room dimensions
2.  Enter door dimensions
3.  Enter window dimensions
4.  Enter wall paint data
5.  Enter ceiling paint data
6.  Enter door/window paint data
7.  Enter labor data
8.  Display cost of paint for wall
9.  Display cost of paint for ceiling
10. Display cost of paint for Door/window
11. Display total cost to paint
0.  To exit
Enter your choice <0 to exit>:


# Output

# A small demo how the application works:
#### When application runs then following happens

run:
******************************************************
Main Menu - Paint Cost Estimator
******************************************************
1. Enter Room dimensions
2. Enter Door dimensions
3. Enter Window dimensions
4. Enter Wall paint data
5. Enter Ceiling paint data
6. Enter Door/Window paint data
7. Enter Labor data
8. Display cost of paint for wall
9. Display cost of paint for ceiling
10. Display cost of paint for door and window
11. Display total labor cost
12. Display total Estimate to paint Room
0 To Exit
Enter your choice: or 0 to exit:
1
Enter Room dimensions:
Enter Length of Room :
15
Enter Width of Room :
13
Enter Height of Room :
14
For Wall 1 :  Wall{ Width = 14.0 ft,    Height = 13.0 ft,    SideWallArea = 182.0 sqft }
For Wall 2 :  Wall{ Width = 13.0 ft,    Height = 15.0 ft,    SideWallArea = 195.0 sqft }
******************************************************
Main Menu - Paint Cost Estimator
******************************************************
1. Enter Room dimensions
2. Enter Door dimensions
3. Enter Window dimensions
4. Enter Wall paint data
5. Enter Ceiling paint data
6. Enter Door/Window paint data
7. Enter Labor data
8. Display cost of paint for wall
9. Display cost of paint for ceiling
10. Display cost of paint for door and window
11. Display total labor cost
12. Display total Estimate to paint Room
0 To Exit
Enter your choice: or 0 to exit:
2
Enter Door dimensions:
Enter Width of Door :
4
Enter Height of Door :
8
Door{ Width = 8.0 ft,   Height = 4.0 ft,     DoorArea = 32.0 sqft }
******************************************************
Main Menu - Paint Cost Estimator
******************************************************
1. Enter Room dimensions
2. Enter Door dimensions
3. Enter Window dimensions
4. Enter Wall paint data
5. Enter Ceiling paint data
6. Enter Door/Window paint data
7. Enter Labor data
8. Display cost of paint for wall
9. Display cost of paint for ceiling
10. Display cost of paint for door and window
11. Display total labor cost
12. Display total Estimate to paint Room
0 To Exit
Enter your choice: or 0 to exit:
3
Enter Window dimensions:
Enter Width of Window :
3
Enter Height of Window :
4
Window{ Width = 4.0 ft,   Height = 3.0 ft,    WindowArea = 12.0 sqft }
******************************************************
Main Menu - Paint Cost Estimator
******************************************************
1. Enter Room dimensions
2. Enter Door dimensions
3. Enter Window dimensions
4. Enter Wall paint data
5. Enter Ceiling paint data
6. Enter Door/Window paint data
7. Enter Labor data
8. Display cost of paint for wall
9. Display cost of paint for ceiling
10. Display cost of paint for door and window
11. Display total labor cost
12. Display total Estimate to paint Room
0 To Exit
Enter your choice: or 0 to exit:
4
Enter Wall Paint Data   :
Enter Paint type you want to use for Wall:
wallpaint
Enter Paint Coverage Area for Wall :
399
Enter Price per Gallon of Paint for Wall :
44
For WallPaint: Paint{CoverageArea=399.0, PricePerGallon=44.0, PaintType=wallpaint}
******************************************************
Main Menu - Paint Cost Estimator
******************************************************
1. Enter Room dimensions
2. Enter Door dimensions
3. Enter Window dimensions
4. Enter Wall paint data
5. Enter Ceiling paint data
6. Enter Door/Window paint data
7. Enter Labor data
8. Display cost of paint for wall
9. Display cost of paint for ceiling
10. Display cost of paint for door and window
11. Display total labor cost
12. Display total Estimate to paint Room
0 To Exit
Enter your choice: or 0 to exit:
5
Enter Ceiling Paint Data   :
Enter Paint type you want to use for Ceiling:
cielingpaint
Enter Paint Coverage Area for Ceiling :
390
Enter Price per Gallon of Paint for Ceiling :
43
For CeilingPaint: Paint{CoverageArea=390.0, PricePerGallon=43.0, PaintType=cielingpaint}
******************************************************
Main Menu - Paint Cost Estimator
******************************************************
1. Enter Room dimensions
2. Enter Door dimensions
3. Enter Window dimensions
4. Enter Wall paint data
5. Enter Ceiling paint data
6. Enter Door/Window paint data
7. Enter Labor data
8. Display cost of paint for wall
9. Display cost of paint for ceiling
10. Display cost of paint for door and window
11. Display total labor cost
12. Display total Estimate to paint Room
0 To Exit
Enter your choice: or 0 to exit:
6
Enter Door/Window Paint Data :
Enter Paint type you want to use for Door/window :
DWpaint
Enter Paint Coverage Area for Door/window :
300
Enter Price per Gallon of Paint for Door/window :
39
For DoorWindowPaint: Paint{CoverageArea=300.0, PricePerGallon=39.0, PaintType=DWpaint}
******************************************************
Main Menu - Paint Cost Estimator
******************************************************
1. Enter Room dimensions
2. Enter Door dimensions
3. Enter Window dimensions
4. Enter Wall paint data
5. Enter Ceiling paint data
6. Enter Door/Window paint data
7. Enter Labor data
8. Display cost of paint for wall
9. Display cost of paint for ceiling
10. Display cost of paint for door and window
11. Display total labor cost
12. Display total Estimate to paint Room
0 To Exit
Enter your choice: or 0 to exit:
7
Enter Labor data :
Enter Labor hourly Rate :
20
Enter Labor number of hours :
12
project_part4.RangeException: Error! Entered value for number of hours should be lower than 10 hours ie within 8 to 10
******************************************************
Main Menu - Paint Cost Estimator
******************************************************
1. Enter Room dimensions
2. Enter Door dimensions
3. Enter Window dimensions
4. Enter Wall paint data
5. Enter Ceiling paint data
6. Enter Door/Window paint data
7. Enter Labor data
8. Display cost of paint for wall
9. Display cost of paint for ceiling
10. Display cost of paint for door and window
11. Display total labor cost
12. Display total Estimate to paint Room
0 To Exit
Enter your choice: or 0 to exit:
7
Enter Labor data :
Enter Labor hourly Rate :
20
Enter Labor number of hours :
9
Labor{HourlyRate = 20.0, NumberOfHours = 9.0}
******************************************************
Main Menu - Paint Cost Estimator
******************************************************
1. Enter Room dimensions
2. Enter Door dimensions
3. Enter Window dimensions
4. Enter Wall paint data
5. Enter Ceiling paint data
6. Enter Door/Window paint data
7. Enter Labor data
8. Display cost of paint for wall
9. Display cost of paint for ceiling
10. Display cost of paint for door and window
11. Display total labor cost
12. Display total Estimate to paint Room
0 To Exit
Enter your choice: or 0 to exit:
8
--------------------------------------------------------
Total Cost to Paint Walls: 35.288220551378444
--------------------------------------------------------
******************************************************
Main Menu - Paint Cost Estimator
******************************************************
1. Enter Room dimensions
2. Enter Door dimensions
3. Enter Window dimensions
4. Enter Wall paint data
5. Enter Ceiling paint data
6. Enter Door/Window paint data
7. Enter Labor data
8. Display cost of paint for wall
9. Display cost of paint for ceiling
10. Display cost of paint for door and window
11. Display total labor cost
12. Display total Estimate to paint Room
0 To Exit
Enter your choice: or 0 to exit:
9
--------------------------------------------------------
Total Cost to Paint Ceiling: 21.5
--------------------------------------------------------
******************************************************
Main Menu - Paint Cost Estimator
******************************************************
1. Enter Room dimensions
2. Enter Door dimensions
3. Enter Window dimensions
4. Enter Wall paint data
5. Enter Ceiling paint data
6. Enter Door/Window paint data
7. Enter Labor data
8. Display cost of paint for wall
9. Display cost of paint for ceiling
10. Display cost of paint for door and window
11. Display total labor cost
12. Display total Estimate to paint Room
0 To Exit
Enter your choice: or 0 to exit:
10
--------------------------------------------------------
Total Cost to Paint Door and Window : 5.72
--------------------------------------------------------
******************************************************
Main Menu - Paint Cost Estimator
******************************************************
1. Enter Room dimensions
2. Enter Door dimensions
3. Enter Window dimensions
4. Enter Wall paint data
5. Enter Ceiling paint data
6. Enter Door/Window paint data
7. Enter Labor data
8. Display cost of paint for wall
9. Display cost of paint for ceiling
10. Display cost of paint for door and window
11. Display total labor cost
12. Display total Estimate to paint Room
0 To Exit
Enter your choice: or 0 to exit:
11
--------------------------------------------------------
Total Labor Cost : 260.7609022556391
--------------------------------------------------------
******************************************************
Main Menu - Paint Cost Estimator
******************************************************
1. Enter Room dimensions
2. Enter Door dimensions
3. Enter Window dimensions
4. Enter Wall paint data
5. Enter Ceiling paint data
6. Enter Door/Window paint data
7. Enter Labor data
8. Display cost of paint for wall
9. Display cost of paint for ceiling
10. Display cost of paint for door and window
11. Display total labor cost
12. Display total Estimate to paint Room
0 To Exit
Enter your choice: or 0 to exit:
12
--------------------------------------------------------
Total Estimate to Paint Room is $ 323.26912280701754
--------------------------------------------------------
******************************************************
Main Menu - Paint Cost Estimator
******************************************************
1. Enter Room dimensions
2. Enter Door dimensions
3. Enter Window dimensions
4. Enter Wall paint data
5. Enter Ceiling paint data
6. Enter Door/Window paint data
7. Enter Labor data
8. Display cost of paint for wall
9. Display cost of paint for ceiling
10. Display cost of paint for door and window
11. Display total labor cost
12. Display total Estimate to paint Room
0 To Exit
Enter your choice: or 0 to exit:
0
Thanks for using the application, See you.
 Bye Bye !
BUILD SUCCESSFUL (total time: 2 minutes 55 seconds)
