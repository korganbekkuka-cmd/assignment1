oop-assignment-01
Classes and Objects, Encapsulation

Point (1 point)
Create a package named geometry.
Design a class named Point inside the package geometry to represent a geometrical 2D point. The class contains:
The data fields x and y that represent the coordinates with getter methods.
A no-arg constructor that creates a point (0,0).
A constructor that constructs a point with specified coordinates.
A method named distance that returns the distance from this point to a specified point of the Point type.
A method named distance that returns the distance from this point to another point with specified x and y coordinates.
Create a separate class PointTest with the static main method to test the Point class and all it's methods.
Circle (1 point)
Define the Circle class inside the package geometry that contains:
Two double data fields named x and y that specify the center of the circle with getter methods.
The data field radius of the type double with a getter method.
A no-arg constructor that creates a default circle with (0,0) for (x,y) and 1 for radius.
A constructor that creates a circle with the specified x, y, and radius.
A method getArea() that returns the area of the circle.
A method getPerimeter() that returns the perimeter of the circle.
A method contains(double x, double y) that returns true if the specified point (x,y) is inside this circle.
A method contains(Circle circle) that returns true if the specified circle is inside this circle.
A method overlaps(Circle circle) that returns true if the specified circle overlaps with this circle.
Create a separate class CircleTest with the static main method to test the Circle class and all it's methods.
Triangle (1 point)
Define the Triangle class inside the geometry package that contains:
Three points named p1, p2, and p3 of the type Point with getter and setter methods.
Point is defined in the same package.
A no-arg constructor that creates a default triangle with the points (0,0), (1,1), and (2,5).
A constructor that creates a triangle with the specified points.
A method getArea() that returns the area of the triangle.
A method getPerimeter() that returns the perimeter of the triangle.
A method contains(Point p) that returns true if the specified point p is inside this triangle.
A method contains(Triangle t) that returns true if the specified triangle is inside this triangle.
A method overlaps(Triangle t) that returns true if the specified triangle overlaps with this triangle.
You are free to create any private helpful static or non-static methods.
Create a separate class TriangleTest with the static main method to test the Triangle class and all it's methods.
Hints:
a 2D vector can be represented as a point;
the vector A from point p1 to point p2 is A = p2 - p1, which is also a point with A.x = p2.x - p1.x and A.y = p2.y - p2.y;
the magnitude of the cross product of two vectors A and B can be found by the following formula: |A x B| = A.x * B.y - B.x * A.y;
the magnitude of the cross product of two vectors is two times the area of the triangle between the vectors
the cross product can be positive, negative, or zero
A x B = -(B x A) = |A| * |B| * cos(angle between A and B)
Rectangle (1 point)
Define the Rectangle inside the geometry class that contains:
Two double data fields named x and y that specify the center of the rectangle with getter and setter methods. (Assume that the rectangle sides are parallel to x- or y-axes.)
The data fields width and height of the type double with getter and setter methods.
A no-arg constructor that creates a default rectangle with (0,0) for (x,y) and 1 for both width and height.
A constructor that creates a rectangle with the specified x, y, width, and height.
A method getArea() that returns the area of the rectangle.
A method getPerimeter() that returns the perimeter of the rectangle.
A method contains(double x, double y) that returns true if the specified point (x, y) is inside this rectangle.
A method contains(Rectangle r) that returns true if the specified rectangle is inside this rectangle.
A method overlaps(Rectangle r) that returns true if the specified rectangle overlaps with this rectangle.
Create a separate class RectangleTest with the static main method to test the Rectangle class and all it's methods.
Student (2 points)
Create the aitu package.
Define the Student class that contains:
The data fields id of the type int, firstname and lastname of the type String, and grades of the type double[];
The static field nextId of the type int that is used in constructors to initialize the id of a newly created Student;
The static field domain of the type String that is used to generate emails and initialized to "astanait.edu.kz";
A no-arg constructor that initializes the firstname as "John", the lastname as "Wick", the id with nextId, and post-increments nextId;
A 2-arg constructor (without grades and id) that initializes the fields with the specified arguments and post-increments nextId;
A 3-arg constructor that initializes the fields with the specified arguments and post-increments nextId;
Getters for all fields including nextId;
Setters for all fields;
A method String getFullName() that returns the full name of a student;
A method double getGpa() that returns the gpa of a student;
A method boolean isHonors() that returns true if the gpa of a student is greater or equal to 3.5 and returns false otherwise;
A method String getEmail() that returns the email of a student by concatenating the id, "@" and the domain;
A method void addGrade(double grade) that adds a grade to the grades array.
Use only simple built-in arrays (without ArrayList etc.).
Create a separate class StudentTest with the static main method to test the Student class:
Create an array of Student objects;
Read the students' firstnames and lastnames from the console or a file;
Given each student random 5 grades;
Give each student an id starting from 250001;
Output all list of students in the format id firstname lastname email gpa.
Group (3 points)
In the aitu package, define the Group class that contains:
The data field title of the type String;
The data field students of the type Student[];
The data field capacity of the type int;
The data field numberOfStudents of the type int;
Any additional data fields that you feel are necessary to implement the class;
Getters and setters for the fields title;
A no-arg constructor that initializes a newly created group with a title of your choice and initial capacity of 4 students and 0 students inside;
A constructor that accepts title, set initial capacity to 4 students and no students inside;
A method void addStudent(Student student), that adds a student to the group, if the capacity is not enough it should be increased;
A method double getAverageGpa();
A methods void printHallOfFame() that prints all the students with honors gpa;
A method String toString() that returns the group's title, numberOfStudents, and the averageGpa bundled in as a String.
A method boolean removeStudent(int id) that removes a student by id and returns true if the operation succeeds.
Create a separate class GroupTest with the static main method to test the Group class with all its methods.
Use only simple built-in arrays (without ArrayList etc.).
Grading Rubrics
problem	unknown 0%	novice 25%	intermediate 50%	proficient 75%	expert 100%
Point	0.0	0.25	0.50	0.75	1.00
Circle	0.0	0.25	0.50	0.75	1.00
Triangle	0.0	0.25	0.50	0.75	1.00
Rectangle	0.0	0.25	0.50	0.75	1.00
Student	0.0	0.50	1.00	1.50	2.00
Group	0.0	0.75	1.50	2.25	3.00
total	0.0	2.25	4.50	5.75	9.00
Unknown is a hidden treasure that does not want to show up.
Novice is able to declare, create and initialize objects with constructors, invoke various methods like getters and setter and others.
Intermediate is able to declare and create an array of objects and populate it with real objects, and manipulate the objects in the array.
Proficient is able to implement the class with constructors and getters and setters, and various methods.
Expert is able to implement and discuss all the methods including the ones heavy on algorithms and math.
