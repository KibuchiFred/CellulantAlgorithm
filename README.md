# CellulantAlgorithm
This is a card verifier solution algorithm 
The problem statement is as follows.

Cellulant has implemented a custom, card number verification system to ensure detection and blocking of fake cards. A scratch card consists of 4 sets of 5 digits (20 digits in total) e.g. [10006-12342-00081-99993] which are printed separated by a space or a dash.

Each set of 5 digits consists of two parts, the first 4 digits (the number) and a 5th digit (the checksum) The formula dictates that each of the sets must be validated as follows: The first 4 digits, e.g 1234, as decimal numbers be converted into an octal number (base 8) i.e. 23228. This octal number is then processed to generate the checksum, as follows:

Add all digits to each other to get a new number “X”If “X” is more than 1 digit, repeat step (1) until you have a single digit. “Y”Append “Y” to the end of the original decimal number e.g. 1234 2
