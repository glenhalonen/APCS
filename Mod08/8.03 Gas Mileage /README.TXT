------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: CarV3
PURPOSE OF PROJECT: Calculate mileage on car
VERSION or DATE: Sunday, Dec 4th
AUTHORS: Glen Halonen

Class Diagram: 

            CarV3
     << In main() method >>
+ double gallons
+ double start
+ double end
+ double miles
+ double mileage

      << Constructor >>
+ CarV3

        << Methods >>
+ double calcDistance(double start, double finish)
+ double calcMPG(double difference, double gallons)

PMR:

    The positives of this program is the object that we created which can be reused in another class. The negatives 
would be the current uselessness of the extra lines of code. I learned how to code in OOP style. 