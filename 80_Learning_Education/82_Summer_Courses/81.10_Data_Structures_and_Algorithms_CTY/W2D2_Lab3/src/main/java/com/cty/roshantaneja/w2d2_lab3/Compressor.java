package com.cty.roshantaneja.w2d2_lab3;

import java.util.HashMap;
import java.util.Map;

/**
 * Handles compression and decompression of data
 *
 * @author Brian Sea
 * @since Problem Set 4
 * @version 0.0.1
 */
public class Compressor {
    HashMap<Character, Integer> freq = new HashMap<Character, Integer>();

    /**
     * Converts compressed bytes to a String
     * Uses standard Huffman Compression
     * @param bytes the bytes to decompress
     * @return the string representation
     */
    public String decompress(byte[] bytes){
        return new String(bytes);
    }

    /**
     * Compresses a string to bytes
     * Uses standard Huffman Compression
     * @param str the string to compress
     * @return the compress data
     */
    public byte[] compress(String str) {
        createFreq(str);
        Heap<HuffmanNode> HuffTree = new Heap<HuffmanNode>();
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append();
        }
    }

    private HashMap<Character, Integer> createFreq(String str){
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return freq;
    }

    private class HuffmanNode implements Comparable<HuffmanNode> {
        public Character sym;
        public int freq;
        public int compareTo(HuffmanNode other) {
            return this.freq - other.freq;
        }
    }
}














