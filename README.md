# Route Planning – Strategy Pattern (Java 17)

A `Navigator` (context) plans a route between two locations using interchangeable `RouteStrategy` implementations: car, walk, cycle. The strategy can be switched at runtime.

## Structure

```
src/navigation/
  RouteStrategy.java        strategy interface
  CarStrategy.java          concrete strategy
  WalkStrategy.java         concrete strategy
  CycleStrategy.java        concrete strategy
  Navigator.java            context
  DistanceCalculator.java   straight-line distance helper
  Location.java             value object
  Route.java                result value object
  Main.java                 client
```

## Build and run

```
mkdir out
javac -d out src/navigation/*.java
java -cp out navigation.Main
```

Expected output:

```
From Baiterek to Expo
car    |  5.69 km |   9 min
walk   |  5.03 km |  60 min
cycle  |  5.25 km |  21 min
```

## Add a new strategy

1. Create a class implementing `RouteStrategy`, e.g. `BusStrategy`.
2. Register it in the client: `strategies.put("bus", new BusStrategy());`
3. No existing class (`Navigator`, other strategies) needs to change.
