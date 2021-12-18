# ABA - Ariella Katz, Alif Rahman, Brianna Tieu, Tom, Grippy, Pepe
## Tests Performed
Created 4 arrays total of lengths 500,000, 1,000,000, 5,000,000, and 10,000,000, containing consecutive multiples of 2 starting with 0.
Conducted 100 binary searches and 100 linear searches of each array for a random integer between 0 and twice the array length (0 and the maximum value in the array). 
This guaranteed that the chance of the target not being in the array would be the same for arrays of all lengths (50%, since there would be a 50% chance of the target being odd). This way, the results would not be skewed due to the target not being found more frequently for shorter array lengths - such an error would result in deceptively longer average times for shorter arrays.
For each search, the elapsed time was found by subtracting the timestamp directly before the search from the timestamp directly after the search. Then, the average elapsed time for each set of 100 searches was found.
We displayed the average elapsed times for the binary searches and linear searches for each array, as well as the difference between the average elapsed times for binary search and linear search for each array. 

## Results
For the 500,000-length, 1,000,000-length, 5,000,000-length, and 10,000,000-length arrays, the average elapsed times for linear search were 0, 1, 5, and 11 seconds, respectively, and the average elapsed times for binary search were 0, 0, 0, and 0 seconds, respectively.
The difference between the average elapsed times for linear search and binary search were 0, 1, 6, and 12 seconds, respectively.
Repetitions of this experiment always yielded elapsed times of 0 seconds for both linear and binary search for the shortest array (500,000) and elapsed times of 0 seconds for binary search for all arrays.
(Thus the difference between elapsed times for linear and binary search for the shortest array was always 0 seconds.)
The average elapsed times for linear search of the other 3 arrays never differed from these results by more than 1 second, and the difference between the average elapsed times for linear and binary search for the other 3 arrays also never differed from these results by more than 1 second.

## Conclusions
Binary search appears to be more efficient than linear search, as it wass always faster than linear search unless both take 0 seconds. 
The difference in efficiency appears to become more pronounces as the length of the array being searched increases.
Moreover, binary search does not appear to decrease in efficiency by a significant amount as the array length increases, at least up to lengths that the system's memory can handle, since it took approximately 0 seconds for all array lengths.
