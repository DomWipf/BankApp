# Invoice App

Generates an invoice for any amount of items the user inputs.
***
## Description

This project gets input from user about what items they bought the amount and the price of the items.
It will also check each item amount to add the appropriate discount to the item price.
<br>Here is an example of the code running below.
<pre> 
"==================================================
Welcome to the Invoice Total Calculator
==================================================

Item Description: apples
Item Quantity...: 32
Item Price......: .75

--------------------------------------------------
Do you want to enter another line item (y/n): y
--------------------------------------------------

Item Description: Juice
Item Quantity...: 40
Item Price......: 3

--------------------------------------------------
Do you want to enter another line item (y/n): y
--------------------------------------------------

Item Description: nothing
Item Quantity...: 0
Item Price......: 0

--------------------------------------------------
Do you want to enter another line item (y/n): n
--------------------------------------------------

==================================================
Customer Receipt
==================================================
apples                 32  @  $  0.75 = $   24.00
       Discount:      10%    -$  2.40 = $   21.60
 
Juice                  40  @  $  3.00 = $  120.00
       Discount:      25%    -$ 30.00 = $   90.00
 
nothing                 0  @  $  0.00 = $    0.00
--------------------------------------------------
Total Savings: $    0.35
Receipt Total: $  143.65
--------------------------------------------------
Thank you for shopping with us!"
</pre>


***
## Getting Started

### Executing program

* Download the project
* Open with intellij
* Press the green run button
***
## Authors
Sara Kone and Dominic Wipf

GitHub [Here](https://github.com/DomWipf/invoiceApp)
***
## Version History

* 0.2
    * Added the discount method to give the buyer a discount when buying things.
    * Based the discount on the price of each individual item
* 0.1
    * Generated invoices but didn't use any discounts based on price
***
## Acknowledgments

Inspiration, code snippets, etc.
* Assignment on canvas