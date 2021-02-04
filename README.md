# Programming-Exercises
Programming Exercises
1. Suppose that you have created a program with only the following variables:
int v = 4;
int w = 6;
double x = 2.2;
Suppose that you also have a method with the following header: public static void calculate(int x, double y)
Which of the following method calls are legal?
a. calculate(v, w);
b. calculate(v, x);
c. calculate(x, y);
d. calculate(18, x);
e. calculate(1.1, 2.2);
f. calculate(5, 7);
2. Suppose that a class named ClassA contains a private nonstatic integer named b, a public nonstatic integer named c, and a public static integer named d. Which of the following are legal statements in a class named ClassB that has instantiated an object
as ClassA obA = new ClassA();?
a. obA.b = 12;
b. obA.c = 5;
c. obA.d = 23;
d. ClassA.b = 4;
e. ClassA.c = 33;
f. ClassA.d = 99;
3. a. Create an application named ArithmeticMethods whose main() method holds two integer variables. Assign values to the variables. In turn, pass each value to methods named displayNumberPlus10(), displayNumberPlus100(), and displayNumberPlus1000(). Create each method to perform the task its name implies. Save the application as ArithmeticMethods.java.

b. Modify the ArithmeticMethods class to accept the values of the two integers from a user at the keyboard. Save the file as ArithmeticMethods2.java.

4. a. Create an application named Percentages whose main() method holds two double variables. Assign values to the variables. Pass both variables to a method named computePercent() that displays the two values and the value of the first number as a percentage of the second one. For example, if the numbers are 2.0 and 5.0, the method should display a statement similar to “2.0 is 40% of 5.0.” Then call themethod a second time, passing the values in reverse order. Save the application as Percentages.java.

b. Modify the Percentages class to accept the values of the two doubles from a user at the keyboard. Save the file as Percentages2.java.

5. When gasoline is $100 per barrel, then the consumer’s price at the pump is between $3.50 and $4.00 per gallon. Create a class named GasPrices. Its main() method holds an integer variable named pricePerBarrel to which you will assign a value entered by a user at the keyboard. Create a method to which you pass pricePerBarrel. The method displays the range of possible prices per gallon. For example, if gas is $120 per barrel, then the price at the pump should be between $4.20 and $4.80. Save the application as GasPrices.java.

6. There are 2.54 centimeters in an inch, and there are 3.7854 liters in a U.S. gallon. Create a class named MetricConversion. Its main() method accepts an integer value from a user at the keyboard, and in turn passes the entered value to two methods. One converts the value from inches to centimeters and the other converts the same value from gallons to liters. Each method displays the results with appropriate explanation. Save the application as MetricConversion.java.

7. Assume that a gallon of paint covers about 350 square feet of wall space. Create an application with a main() method that prompts the user for the length, width, and height of a rectangular room. Pass these three values to a method that does the following:
•	 Calculates the wall area for a room
•	Passes the calculated wall area to another method that calculates and returns the number of gallons of paint needed
•	Displays the number of gallons needed
•	 Computes the price based on a paint price of $32 per gallon, assuming that the painter can buy any fraction of a gallon of paint at the same price as a whole gallon
•	 Returns the price to the main() method
The main() method displays the final price. For example, the cost to paint a 15- by-20-foot room with 10-foot ceilings is $64. Save the application as PaintCalculator.java.

8. The Harrison Group Life Insurance company computes annual policy premiums based on the age the customer turns in the current calendar year. The premium is computed by taking the decade of the customer’s age, adding 15 to it, and multiplying by 20. For example, a 34-year-old would pay $360, which is calculated by adding the decades (3) to 15, and then multiplying by 20. Write an application that prompts a user for the current year and a birth year. Pass both to a method that calculates and returns the premium amount, and then display the returned amount.
Save the application as Insurance.java.
9. Write an application that calculates and displays the weekly salary for an employee. The main() method prompts the user for an hourly pay rate, regular hours, and overtime hours. Create a separate method to calculate overtime pay, which is regular hours times the pay rate plus overtime hours times 1.5 times the pay rate; return the result to the main() method to be displayed. Save the program as Salary.java.

10. Write an application that calculates and displays the amount of money a user would have if his or her money could be invested at 5 percent interest for one year. Create a method that prompts the user for the starting value of the investment and returns it to the calling program. Call a separate method to do the calculation, and return the result to be displayed. Save the program as Interest.java.

11. a. Create a class named Sandwich. Data fields include a String for the main ingredient (such as “tuna”), a String for bread type (such as “wheat”), and a double for price (such as 4.99). Include methods to get and set values for each of these fields. Save the class as Sandwich.java.

b. Create an application named TestSandwich that instantiates one Sandwich object and demonstrates the use of the set and get methods. Save this application as TestSandwich.java.

12. a. Create a class named Student. A Student has fields for an ID number, number of credit hours earned, and number of points earned. (For example, many schools compute grade point averages based on a scale of 4, so a three-credit-hour class in which a student earns an A is worth 12 points.) Include methods to assign values to all fields. A Student also has a field for grade point average. Include a method to compute the grade point average field by dividing points by credit hours earned. Write methods to display the values in each Student field. Save this class
as Student.java.
b. Write a class named ShowStudent that instantiates a Student object from the class you created and assign values to its fields. Compute the Student grade point average, and then display all the values associated with the Student. Save the application as ShowStudent.java.

c. Create a constructor for the Student class you created. The constructor should initialize each Student’s ID number to 9999, his or her points earned to 12, and credit hours to 3 (resulting in a grade point average of 4.0). Write a program that demonstrates that the constructor works by instantiating an object and displaying the initial values. Save the application as ShowStudent2.java.

13. a. Create a class named BankAccount with fields that hold an account number, the owner’s name, and the account balance. Include a constructor that initializes each field to appropriate default values. Also include methods to get and set each of the fields. Include a method named deductMonthlyFee() that reduces the balance by $4.00. Include a static method named explainAccountPolicy() that explains that the $4 service fee will be deducted each month. Save the class as BankAccount.java.

b. Create a class named TestBankAccount whose main() method declares four BankAccount objects. Call a getData() method three times. Within the method, prompt a user for values for each field for a BankAccount, and return a BankAccount object to the main() method where it is assigned to one of main()’s BankAccount objects. Do not prompt the user for values for the fourth BankAccount object, but let it continue to hold the default values. Then, in main(), pass each BankAccount object in turn to a showValues() method that displays the data, calls the method that deducts the monthly fee, and displays the balance again. The showValues() method also calls the method that explains the deduction policy. Save the application as TestBankAccount.java.

14. a. Create a class named Painting that contains fields for a painting’s title, artist, medium (such as water color), price, and gallery commission. Create a constructor that initializes each field to an appropriate default value, and create instance methods that get and set the fields for title, artist, medium, and price. The gallery commission field cannot be set from outside the class; it is computed as 20 percent of the price each time the price is set. Save the class as Painting.java.

b. Create a class named TestPainting whose main() method declares three Painting items. Create a method that prompts the user for and accepts values for two of the Painting objects, and leave the third with the default values supplied by the constructor. Then display each completed object. Finally, display a message that explains the gallery commission rate. Save the application as
TestPainting.java.
