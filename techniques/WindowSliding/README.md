## About

Window Sliding Technique is a computational technique which aims to reduce the use of nested loop and replace it with a single loop, thereby reducing the time complexity.

### **Prerequisite to use Sliding window technique**

The use of Sliding Window technique can be done in a very specific scenario, where the size of window for computation is fixed throughout the complete nested loop. Only then the time complexity can be reduced. 

### **How to use Sliding Window Technique?**

The general use of Sliding window technique can be demonstrated as following:

- Find the size of window required 
- Compute the result for 1st window, i.e. from start of data structure
- Then use a loop to slide the window by 1, and keep computing the result window by window.

`Example: Given an array of integers of size ‘n’, Our aim is to calculate the maximum sum of ‘k’ consecutive elements in the array.`
- **arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 }** and **k = 4** *(max sum of 4 consecutive elements)*
- First find the size of window required, which is 9
- Create a variable *i.e* **window_sum** that receives the sum from **n[0] to n[3]**
- Create a for loop with starting index `int i = k`
- Then sum ` window_sum += arr[i] - arr[i - k]`  
- Compare and set to **max_sum** whoever is greater between **window_sum** and **max_sum**;
- Or use Java's Math library: `max_sum = Math.max(window_sum, max_sum)`