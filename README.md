## make Change Project

### Week 1 Homework for  Skill Distillery

### The General idea:

I made this program to have a user enter a price of an item, then enter the tender amount. The output is to display the change and the denominations of that change.

The general idea to keep this accurate is to take the inputted double and convert the money into pennies and cast that double to an int. 

I wanted to see if I could do this another way. I took the double entered in to the price and tender and broke them apart to generate the change for the dollars and the cents seperately

I created 2 objects to do the work for calculating and printing the correct change. 

In the main I made a loop to check if the user gave the correct change, if not telling them how much they are short by and having them re-enter the tender.

Once the corret tender is entered the display a friendly message is displayed and the program ends.

### The Struggles:

Splitting the double took some creative thinking. I casted the double to an int. I then took the orginial double again and * 100, casted it to an int, the subtracked both ints to display the "cents." I also had to use Math.round to round up the double to keep it accurate 

when subtracting the tender to the cost I was off a dollar when the tender cents was lower then the cost cents. So I made an if statement for this case and subtracted the dollar amount by one and subtracted the cents and added 100 to get it out of the negative.

when bringing them back together I was missing the "0" when $. 8 was displayed for 8 cents. so i used a printf line and formatted it to have only 2 places and fill with "0's"


