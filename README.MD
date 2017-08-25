[![source](https://img.shields.io/badge/source-main-brightgreen.svg)][main]
[![source](https://img.shields.io/badge/source-test-yellow.svg)][test]
[![implementation](https://img.shields.io/badge/implementation-java-blue.svg)][java]

[main]: https://github.com/BBK-PiJ-2016-52/viagogo-coding-challenge/tree/master/src/main/java
[test]: https://github.com/BBK-PiJ-2016-52/viagogo-coding-challenge/tree/master/src/test/java
[java]: http://docs.oracle.com/javase/8/docs/api/

# Viagogo Coding Challenge

## Scenario

- The program should randomly generate seed data
- The program should operate in a world that ranges from -10 to +10 (Y axis), and -10 to +10 (X axis)
- The program should assume that each co-ordinate can hold a maximum of one event
- Each event has a unique numeric identifier (e.g. 0, 1, 2, 3 ...)
- Each event has zero or more tickets
- Each ticket has a non-zero price, expressed in US Dollars
- The distance between two points should be computed as the Manhattan distance


## Instructions

- The program accepts a user location as a pair of co-ordinates, and returns a list of the five closest events, 
along with the cheapest ticket price for each event, please make sure you're using the right co-ordinates e.g 4,2

- How might you change your program if you needed to support multiple events at the same location?

``` 
I'll use the class HashMap to identify each event as unique regardless of the location. 
```
- How would you change your program if you were working with a much larger world size?
```
The program should be modified is small chunks and refactoring where possible to avoid bugs.
```


## Example Program Run
```
Hello! Welcome to Viagogo Coding Challenge.
Please enter your coordinates:   
  
> 10,-10
  
Coordinates accepted: [10, -10]  
      
Event # 0.0	   Event Location: X Axis -5.    Y Axis 4.0
Event # 1.0	   Event Location: X Axis -7.0   Y Axis 8.0
Event # 2.0	   Event Location: X Axis 3.0    Y Axis 2.0
Event # 3.0	   Event Location: X Axis -3.0   Y Axis 4.0
Event # 4.0	   Event Location: X Axis -6.0   Y Axis 7.0
Event # 5.0	   Event Location: X Axis 3.0    Y Axis 8.0
Event # 6.0	   Event Location: X Axis 1.0    Y Axis 5.0
Event # 7.0	   Event Location: X Axis -3.0   Y Axis 4.0
Event # 8.0	   Event Location: X Axis -8.0   Y Axis 0.0
Event # 9.0	   Event Location: X Axis -9.0   Y Axis 1.0
  
The closest Five events to your coordinates [10, -10] are: 
  
Event #2.0	 Tickets: 31.0	 Price $44.46	  Distance 19.0
Event #6.0	 Tickets: 80.0	 Price $206.14	 Distance 24.0
Event #5.0	 Tickets: 4.0	  Price $82.92 	 Distance 25.0
Event #3.0	 Tickets: 16.0	 Price $154.6	  Distance 27.0
Event #7.0	 Tickets: 51.0	 Price $3.9	    Distance 27.0
```

#### Repository Structure
```
├───.gradle
│   └───3.3
│       └───taskArtifacts
├───.idea
│   ├───libraries
│   └───modules
├───build
│   └───classes
│       └───main
│           ├───event
│           ├───location
│           ├───main
│           └───pricing
├───gradle
│   └───wrapper
└───src
    ├───main
    │   ├───java
    │   │   ├───event
    │   │   ├───location
    │   │   ├───main
    │   │   └───pricing
    │   └───resources
    └───test
        ├───java
        └───resources
```
