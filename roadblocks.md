# roadblocks

## MAY 21

* Problem: Two Sum (Array / HashMap)
* Roadblock 1 (typing error): 
  * Using arr[i] != arr[j] checks for different values, not different indices. This breaks on duplicates like [3, 3]. Fix: Always compare indices i != j.
  * check logic while moving
* Roadblock 2 (Big-O Misconception): Assumed HashMap .containsKey() traverses the map (O(N)). Correction: HashMaps use a hash function to instantly compute memory addresses. Lookups and insertions are exactly O(1).
* Roadblock 3 (Big-O Math): Sequential operations inside a loop are added, not multiplied. 
  * Formula: O(N) × (O(1) + O(1)) = O(2N) = O(N).
