==========
# README #
==========

Program: Alibi's Car Wash (Service terminal)
[Fictional] Client: Alibi's Car Wash
Programmer: Spencer Trumbore
[Fictional] Development Studio: The Disorganization

This is documentation for a car wash program for fictional company "Alibi's Car Wash".
I needed to come up with an idea I could turn around quickly but wanted it to be
unique. First I thought of a carwash that let you order and eat pizza while in the car.
Then I decided to change it to a mob-themed car wash that destroys cars so clients
have excuses not to attend events (i.e. court, weddings, anything). The idea is
ludicrous, of course, but I hope it's at least mildly amusing.

The driver program is a menu that launches one of 3 constructors, each creating a car wash
object. In addition to the base class CarWash, there is the MidGradeWash, which is a subclass
of it, and the PremiumWash (dubbed "The Soprano") that is a subclass of the MidGrade. So
effectively, each extends the other. This means that if a user selects a Regular wash, only
the base constructor runs, but if the Premium wash is selected, all 3 constructors run
back-to-back. Each kind of carWash has one unique method. Each subclass of car wash has all
the features of the superclass. Those features are popTires() (Regular), applyMud() (MidGrade),
and breakLegs() (Premium).

My goal for the program was to be humorous while implying more depth for a legitimate business.
I wanted the program to be as streamlined as possible, performing as many tasks as possible
directly from constructors (leaving the main() method as uncluttered as possible). Towards that
end, there were not a lot of attempts at error handling, but I did account for bad input for
multiple choice switch statements, at least in the case for numerical input.  For example, there
is no option to choose 0 tires to pop in the popTires() module, but there is a unique "if"
condition for that: the operator gets angry that you are wasting his time, pops all 4 of your tires,
and makes you hire somebody to tow your car.  Any numbers the user enters that are not 1, 2, 3, or 4:
The operator berates the user for not being able to count, and the user must select a valid number.