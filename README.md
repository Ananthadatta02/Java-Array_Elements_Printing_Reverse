# Array-Element-Printing-Reverse

## **Project Overview**

This Java program accepts an array from the user, prints its elements, and then displays the same elements in reverse order. The user is prompted to enter the size of the array and then the individual elements. The program demonstrates array handling, user input, and basic looping in Java.

---

## **Detailed Explanation of Code**

### 1. **User Input:**
   - The program begins by asking the user to enter the size of the array.
   - A `Scanner` object is used to capture the size and individual elements of the array.
   - The size of the array is stored in the `size` variable.
   - Based on the input size, an integer array `arr[]` is created dynamically to hold the specified number of elements.

### 2. **Array Elements Input:**
   - The program uses a `for` loop to iterate over the array and input the elements.
   - The loop runs from `0` to `arr.length - 1` to capture each element.
   - Each element is stored in the array at the corresponding index.
   - The `Scanner` object’s `nextInt()` method is used to input each integer element.

### 3. **Printing Array Elements:**
   - After storing all the elements in the array, the program prints the entire array using `Arrays.toString(arr)` method.
   - The `Arrays.toString(arr)` method converts the array to a string and prints it, displaying the elements of the array in a readable format.
   - The output format is as: `Array Elements: [element1, element2, element3,...]`.

### 4. **Printing Array Elements in Reverse Order:**
   - The program uses a `for` loop to print the elements of the array in reverse order.
   - The loop starts at the last index (`arr.length - 1`) and iterates backwards until index `0`.
   - The `System.out.print()` function is used to print each element, followed by a space.
   - This loop prints the elements in reverse order, providing the output format: `elementN elementN-1 ... element1`.

---

## **Code Walkthrough**

1. **Scanner Input:**
   - `Scanner s = new Scanner(System.in);` - Initializes the scanner to take user input.
   - `int size = s.nextInt();` - Takes the array size input.
   - `arr[i] = s.nextInt();` - Takes array element inputs inside a loop.

2. **Printing Array Elements:**
   - `Arrays.toString(arr)` - Converts the array to a readable string and prints it.

3. **Reverse Array Printing Using Loop:**
   - The loop `for(int i = arr.length - 1; i >= 0; i--)` iterates through the array in reverse, starting from the last index and moving towards the first.

---

## **Example Output**

### **Input:**
- Enter Array Size.. 
- 5 
- Enter Elements One by One 
- 1 2 3 4 5

### **Output:**
- Array Elements: 
- [1, 2, 3, 4, 5] 
- Elements in Reverse Order... 
- 5 4 3 2 1

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Array_Elements_Printing_Reverse.git
```
