# Bank App

Allows the user to manage a simple bank account using withdrawals and deposits
***
## Description

This project gets input from user: their first name, last name, whether they want to deposit or withdrawal, and how much.
It will also check to see what your balance is and if you have enough money to withdraw.
<br>Here is an example of the code running below.
<pre>================================================================================
Welcome to the Bank App!
================================================================================

What is your first name? Brock
What is your last name? Koranda

--------------------------------------------------------------------------------
Account create! ID: 1
First Name: Brock
Last Name: Koranda
--------------------------------------------------------------------------------

Enter D=Deposit, W=Withdrawal, Q=Quit: d
What amount would you like to deposit? 1000
Deposit successful! Current balance: $1,000.00

--------------------------------------------------------------------------------

Enter D=Deposit, W=Withdrawal, Q=Quit: w
What amount would you like to withdraw? 1200
Insufficient Funds! Current balance: $1,000.00

--------------------------------------------------------------------------------

Enter D=Deposit, W=Withdrawal, Q=Quit: w
What amount would you like to withdraw? 300
Withdrawal successful! Current balance: $700.00

--------------------------------------------------------------------------------

Enter D=Deposit, W=Withdrawal, Q=Quit: q

Process finished with exit code 0

</pre>


***
## Getting Started

### Executing program

* Download the project
* Open with intellij
* Press the green run button
***
## Authors
Brock Koranda and Dominic Wipf

GitHub [Here](https://github.com/DomWipf/BankApp)
***
## Version History

* 0.1
    * Created the account class 
    * Runs simple bank actions
    * throws errors for overdrawn withdrawals

***
## Acknowledgments

Inspiration, code snippets, etc.
* Assignment on canvas