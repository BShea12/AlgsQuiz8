The worst case time complexity of the runningTime problem is O(n^2) because at its worst it has to go through two for loops swapping every element.
The space complexity of the runningTime problem is O(1) because you make changes to the original array and are only holding in memory one of the items that you are swapping.





The modified ice cream problem has a few recursive cases.

- The combination of the two is already in the array -> do nothing
- The combination of the two is not in the array -> put 1 in the array at [first][second] if it does add and -1 if not, and add 1 to the total if it adds to m
Note that you should check both if [first][last] and [last][first] are in the array before going to the second case.

Idk how to implement this