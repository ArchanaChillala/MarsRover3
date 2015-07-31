DESCRIPTION
===========
Mars Rover : To navigate two rovers to explore a plateau with boundaries, on Mars.

A rover’s position and location is represented by a combination of x and y co-ordinates and 
a letter representing one of the four cardinal compass points. The plateau is divided up into 
a grid to simplify navigation. An example position might be 0, 0, N, which means the rover is 
in the bottom left corner and facing North.
In order to control a rover , NASA sends a simple string of letters. 
The possible letters are ‘L’, ‘R’ and ‘M’. ‘L’ and ‘R’ makes the rover spin 90 degrees left or right respectively, 
without moving from its current spot. ‘M’ means move forward one grid point, and maintain the same heading.

INPUT
=====
Plateau boundaries
Initial Position (for both Rovers)
Directions to explore (for both Rovers)


OUTPUT
======
Final Positions of Rovers after exploring the plateau.


SETUP
=====
[1] Install Oracle JAVA Version 7.0
[2] Install IntelliJ IDEA (Community edition)
[3] Install ANT
[4] Import JUnit 4.11.jar
[5] Import hamcrest-core-1.3.jar


COMPILE
=======
Create build.xml file using ANT
ant compile


RUN
===
Command to run specifications on Terminal : $ ant
 