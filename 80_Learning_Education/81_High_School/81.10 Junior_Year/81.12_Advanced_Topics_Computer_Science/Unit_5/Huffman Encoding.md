---
tags:
  - CS
  - ATCS
---

<p style="text-align: right">
<em>Advanced Topics in CS, Honors - SHP </em></p>


**Huffman Encoding**

## Step #0 - Answer some short answer questions to show me you understand Huffman encoding

First, consider the small tree below.


```
             *
            / \
           *   O
          / \
         N   *  
            / \
           M   S
```


#### ==Question #0: Use the above encoding tree to decode the bit sequence 0101100011.==

MOONS

#### ==Question #1: Prepare a map  for the above encoding tree that lists each character with its assigned bit sequence. Use your map to encode the string "SONS".==

011100011

#### ==Question #2:  Huffman codes obey the _prefix_ property: no character's encoded bit sequence is a prefix of any other. What feature of an encoding tree demonstrates that it obeys the prefix property?==

The characters are at leaves, meaning that there is no other characters after you reach a leaf. Therfore, there is nothing after you have reached a leaf and can start decoding the next character. This means that even though multiple leaves (characters) can start and be on the same subtree, there are no other characters that may contain that "path signature"

Now, consider the issue of “flattening” and “unflattening” the tree.  One of the practical concerns of Huffman coding is that the compressed data must include information about the encoding tree used, since that encoding is unique to the input data. It is not possible to decode the bit sequences without knowledge of the original encoding tree.

We want to write the Huffman tree into the compressed file, but it isn't possible to write a tree directly. Therefore, we must come up with a way to "flatten" the tree into a form that records the data and structure of the tree and allows you to later reconstruct the tree.

There are a variety of ways to flatten the tree, but one tidy and compact approach is to summarize the tree as two sequences: a sequence of bits that give the shape of the tree and a sequence of characters that correspond to the tree leaves.

* The tree shape is flattened into a sequence of bits as follows:
    * If the root of the tree is a leaf node, it’s represented by the bit 0.
    * If the root of the tree is not a leaf node, it’s represented by a 1 bit, followed by the flattened version of its **zero** (left) subtree, followed by the flattened **one** (right) subtree.
* The sequence of bits describes the tree structure in the order that the tree nodes are visited in a **pre-order** traversal.
* The tree leaves are flattened into a sequence of characters by listing the characters of the leaf nodes as visited during an in-order traversal.

Together the two flattened sequences describe the tree shape and data in a way that allows us to later recreate the original tree.

For example, the two encoding trees below left and middle are labeled with the flattened sequence of bits and sequence of characters:


```
    *                         *                          *
   / \                      /   \                       / \
  E   *                    A     *                     *   O
     / \                        /  \                  / \
    W   K                      *    N                N   * 
                              / \                       / \
                             D   B                     M   S
```


  10100                       		1011000

  EWK                         		ADBN

#### Question #3: Flatten the encoding tree above on the right into its sequence of bits and sequence of characters.

==1101000 NMSO==

#### Question #4:  Unflatten the sequences **110100100** and **FLERA** to reconstruct the original encoding tree.

```
                 *
               /   \
             *       *
           /  \     / \
         F     *   R   A
              / \
             L   E
```

Now, of course, you’ll eventually have to build up a Huffman tree based on the frequency of the letters in the text.

#### Question #5:  Construct a Huffman coding tree for the input **"BOOKKEEPER"**. (As you run the Huffman algorithm, you may encounter multiple nodes/subtrees that have the same weight and are thus tied. The algorithm can break ties arbitrarily. This means there can be many equally optimal Huffman trees for a given string, differing only in how the algorithm broke ties. Exchanging the zero/one subtrees of any interior node would create a mirrored but also equally optimal result. Any of the resulting trees is considered correct.)

Letters

| Letter | Freq |
| ------:| ---- |
|      B | 1    |
|      O | 2    |
|      K | 2    |
|      E | 3    |
|      P | 1    |
|      R | 1    |

```
                 10                    
       /                   \               
      4                     6            
    /    \                 /   \         
  K         2            E        3     
          /     \               /     \  
         B       P             O       R
```

Flattened Tree: 11010010100 KBPEOR

---

## Step #1 - Familiarize yourself with the code

Here are some notes about the Huffman2023 code on Schoology.

* First, I’ve created a class called `Bit` for you.  It behaves exactly like an int, except that only values of 0 or 1 are valid.  If you try to create a `Bit` with a value of 2 or greater, it prints out an error message.  Here’s some examples of how to use the Bit class.

```cpp
vectorOfBits.push_back(Bit(0));  // adds 0 to a vector
if (someBit == 1)  // compare Bit values
```

* You should not need to edit the files `main.cpp` nor `huffman_helper.cpp` at all.  The `main.cpp` handles the main menu of the program.  The `huffman_helper.cpp `handles the process of reading and writing files easily.
* There is one piece of code from the `huffman_helper.cpp` file that is incredibly important.  There is a struct called `EncodedData`.

```cpp
struct EncodedData { 
	queue<Bit>  treeShape; 
	queue<char> treeLeaves; 
	queue<Bit>  messageBits; 
}; 
```

This struct is the “input” to the `decompress` function and is the “output” from the `compress` function.  (I’ve done it this way to simplify the process of reading/writing binary files.)  The first two data members, `treeShape` and `treeLeaves`, represent the flattened tree, as you explored in free response question #3 above.  The last data member, `messageBits`, is the actual data of the encoded message.
* To complete this assignment, all of your code will go in `your_huffman_code.h`.  Essentially, you only have two functions to write, although no doubt you will add several other helper functions to simplify your code.  I had three or four other functions, and the file ended up being about 160 lines of code.

---

## Step #2 - Write the function decompress

The first step is to “unflatten” the tree, creating a Huffman tree.  This will be a recursive algorithm using the `TreeNode` struct.

Once you have this tree, you should loop through the message and decode the message.  I found it easier to do this iteratively rather than recursively, but feel free to do it however you want.

When you think you’re done, you can test your code by trying to decompress the file `mystery.txt.huf`.  I won’t tell you what that file is, but you can check with me.

---

## Step #3 - Write the function compress

This function ends up being quite a bit harder than the previous function.  I’d consider breaking it up into four steps, adding debugging code to print out what’s going on after each sub-step.  If you wait until the end to test that each sub-step works, you’ll likely have bugs that will be very difficult to track down.  (And, if you ask me for help, I’ll just ask you to show me the debugging information for each sub-step anyway.)

<span style="text-decoration:underline;">First sub-step:</span> Create a “frequency map” of the characters in the text.  The keys should be characters, and the values should be the number of times that character occurs in the text.  (Test your code by printing out this map somehow.)

<span style="text-decoration:underline;">Second sub-step:</span> Create a priority queue of `TreeNode*`, each containing just one node, with the character and weight from your map.  Important note: when you do this sub-step, you have to declare your `priority_queue` in a specific way.  Look at the long comment I wrote around line #50 of your code.  (Test your code by looping through this priority queue and printing out the characters; you should get the characters in order of their frequency.)

<span style="text-decoration:underline;">Third sub-step:</span> Perform the [Huffman algorithm](https://people.ok.ubc.ca/ylucet/DS/Huffman.html), turning that priority queue into one Huffman tree.  (This is a little more challenging to test, although you can at least ensure that this tree is the correct size by writing a function to recursively find the size of a binary tree, and calling it at the end.  It should be the same size as the map in the first sub-step.)

<span style="text-decoration:underline;">Fourth sub-step:</span>  Use this Huffman tree to create a map, where the keys are characters and the values are “paths” to that character.  For example, if the key is ‘k’, the value might be something like “01101”, meaning that to get to the leaf containing ‘k’, you go “left, right, right, left, right.”  I made the values a queue of bits, but you could also use a vector or even a string.  (Test your code by printing out this map.)

<span style="text-decoration:underline;">Fifth sub-step:</span> Use this map to generate a queue of bits for the entire message.  (You could test your code by printing out all the values in the queue, but that will be very long unless the message is quite short.  Maybe just print out the size of the queue, or test it on a very small file.)

<span style="text-decoration:underline;">Sixth sub-step:</span> You’ll then need to “flatten” the tree so you can send this information along with the compressed text.  I used a recursive algorithm that was similar to the pre-order traversal code we did before.  You’ll end up saving this “flattened tree” as a queue of Bits and a queue of characters, ready to be stored in the first two data members, `treeShape` and `treeLeaves`, in a variable of type `EncodedData`. (Test your code by printing out these queues.)

Now, your return value is of type `EncodedData`.  You’ve got all the parts you need from the last two sub-steps.  Test your code by compressing a file, and then decompressing it.  Do you get the same file back?

## Step #4 - Clean up after yourself

In doing steps #2 and #3, you created some trees by writing `new TreeNode`.  If you don’t delete these pointers, you’ll be leaking memory, leaving unused memory on the heap.  Go through your code and make sure every `TreeNode` you allocated has been freed up with a call to `delete`.  

If you don’t do this step, your program will still work, but over time it may cause your computer to crash as you slowly run out of memory.

**_Acknowledgements: This assignment is based on the Huffman Encoding assignment in the CS106B course at Stanford University.  Thanks to Julie Zelinski, Chris Gregg, and all those who contributed to the project.  Also, thanks to[ Project Gutenberg](https://www.gutenberg.org) for providing complete text files of famous literary works.  The “mystery.txt” file came from Project Gutenberg._**
