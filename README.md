## Coding Question

Write an interface for a data structure that can provide the moving average of the last N elements added, add elements to the structure and get access to the elements. Provide an efficient implementation of the interface for the data structure.

### Minimum Requirements

1. Provide a separate interface (IE `interface`/`trait`) with documentation for the data structure
2. Provide an implementation for the interface
3. Provide any additional explanation about the interface and implementation in a README file.

## Code Explanation

It's a maven project since using Junit 5 as testing framework.

### Functions provided

double averageLastMoving(int lastN);
* Get the average of moving that existing elements need to take in order to add the
last n elements into the list. Element insertion itself counted as 1 moving.

List<T> add(int index, T element);

List<T> add(T element);

T get(int index);

Iterator<T> iterator();

int size();

### Implementation

Implemented two data structures: LinkedList and ArrayList.

LinkedList is suitable for situation that ADD/GET operations usually happens on the first or last positions.

ArrayList is suitable for situation that ADD operations happens rarely or only happens at last position.
`averageLastMoving(lastN)` is more efficient with smaller `lastN`.
