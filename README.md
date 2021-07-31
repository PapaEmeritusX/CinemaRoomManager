# Cinema Room Manager
### About
The cinema room created can accommodate up to 9 rows and 9 columns of 360 seats. 
(Seats from the first to the fourth-row cost $10, the rest are sold for $8)
After setting the room user is provided with a management menu.
```
1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
```
* Show the seats - shows the cinema room in a shape of two-dimensional matrix, marking each seat with a letter **"S"** or **"B"** which describes whether the seat is on sale or has been already bought. 
* Buy a ticket - allows to buy a ticket for a particular seat in case it has not been already purchased. If it is not the case the gets the price of the seat.
* Statistics - Shows some information of the cinema room. 

Example of the app in use:
```
Enter the number of rows:
> 6
Enter the number of seats in each row:
> 6

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 3

Number of purchased tickets: 0
Percentage: 0.00%
Current income: $0
Total income: $360

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 2

Enter a row number:
> 1
Enter a seat number in that row:
> 1

Ticket price: $10

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 3

Number of purchased tickets: 1
Percentage: 2.78%
Current income: $10
Total income: $360

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 2

Enter a row number:
> 1
Enter a seat number in that row:
> 1

That ticket has already been purchased!

Enter a row number:
> 10
Enter a seat number in that row:
> 20

Wrong input!

Enter a row number:
> 4
Enter a seat number in that row:
> 4

Ticket price: $10

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 1

Cinema:
  1 2 3 4 5 6
1 B S S S S S
2 S S S S S S
3 S S S S S S
4 S S S B S S
5 S S S S S S
6 S S S S S S

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 3

Number of purchased tickets: 2
Percentage: 5.56%
Current income: $20
Total income: $360

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 0
```
Cinema manager build upon multidimensional arrays and some simple functions for command line text interface:

The application is built in a single class, which could be improved by setting the logic from the interface into a separate class.
