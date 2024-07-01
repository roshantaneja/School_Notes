# Problem Set 5 Lab

In this lab, you will complete the compression and decompression from the previous lab.

## Setup
1. Download the base project and open it in IntelliJ.
2. Don't change the package name in this lab.  If you do, you'll need to recreate the save file.
3. Read through the code and investigate the Explorer and Compressor classes.  You will need to implement the `compress` and `decompress` method.

## Implementation Details
* I have declared many the public methods.  You are not permitted to alter any public signatures without permission. You may add any private elements you need.
* The `decompress` method with require many private methods:
  * decodeTree - Constructs the Huffman Tree from the encoded data
  * decodeMessage - Constructs the message from the encoded data
* The `compress` method will require many private method for each part of the compression:
  * encodeTree - Encodes the tree into a BitSet
  * encodeMessage - Encodes the message into a BitSet
* All non-private methods must have proper JavaDoc comments, and you must include comments with code that is not self-documenting.
* I have provided two compressed data files.  You should complete the `decompress` method first to test with.

## Rubric (Base Tier)
* Style/Documentation
    * Variable, Method, and Class names
    * JavaDoc comments on all non-private methods and classes
    * Proper Commenting -- including private methods
* Method Implementation
  * Compression Methods
    * `compress` - returns the complete compressed data
    * `encodeTree` - returns the encoded tree
    * `encodeMessage` - return the encoded message
  * Decompression Methods
    * `decompress` - returns the uncompressed String message
    * `decodeTree` - returns the decoded and well-formed Huffman Tree
    * `decodeMessage` - returns the decoded message

## Additional Tiers (Complete 2 of 3 for a Late Day)
1. Add the ability to handle global key events:
    1. ESC - deselect all objects
    2. Delete - delete the selected objects
2. Add the ability to move the selected shape
    1. Arrow keys
    2. Click a drag with the mouse
3. Add a custom tool (rectangle/circle) and provide a way to switch between tools
