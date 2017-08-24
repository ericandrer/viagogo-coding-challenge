[![source](https://img.shields.io/badge/source-main-brightgreen.svg)][main]
[![source](https://img.shields.io/badge/source-test-yellow.svg)][test]
[![implementation](https://img.shields.io/badge/implementation-java-blue.svg)][java]

[main]: https://github.com/BBK-PiJ-2016-52/viagogo-coding-challenge/tree/master/src/main/java
[test]: https://github.com/BBK-PiJ-2016-52/viagogo-coding-challenge/tree/master/src/test/java
[java]: http://docs.oracle.com/javase/8/docs/api/

# Viagogo Coding Challenge

## Requirements

- Code in any language you like but please provide clear instructions on how we should build & run your code
- Please use any source control system you like, and send us a link (or if you prefer just a zip of your project)
- The first requirement is your code meets the requirements
- Secondary requirements are whether your code is idiomatic for the language being coded in, easy to read, and clearly laid out


## Scenario

- Your program should randomly generate seed data
- Your program should operate in a world that ranges from -10 to +10 (Y axis), and -10 to +10 (X axis)
- Your program should assume that each co-ordinate can hold a maximum of one event
- Each event has a unique numeric identifier (e.g. 1, 2, 3)
- Each event has zero or more tickets
- Each ticket has a non-zero price, expressed in US Dollars
- The distance between two points should be computed as the Manhattan distance


## Instructions

- You are required to write a program which accepts a user location as a pair of co-ordinates, and returns a list of the five closest events, along with the cheapest ticket price for each event
- Please detail any assumptions you have made
- How might you change your program if you needed to support multiple events at the same location?
- How would you change your program if you were working with a much larger world size?


## Example Program Run

Please Input Coordinates:
 
> 4,2
 
Closest Events to (4,2):
 
Event 003 - $30.29, Distance 3  
Event 001 - $35.20, Distance 5  
Event 006 - $01.40, Distance 12  