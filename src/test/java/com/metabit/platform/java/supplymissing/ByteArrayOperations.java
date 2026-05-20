package com.metabit.platform.java.supplymissing;

/**
 * Stub replacement for the private metabit utility library.
 * Provides byte array comparison and bit-difference counting.
 */
public class ByteArrayOperations
{
    /**
     * Compare two byte array regions element-by-element.
     *
     * @return true if all bytes in range are equal
     */
    public static boolean arrayCompare(byte[] a, int offsetA, byte[] b, int offsetB, int length)
        {
        for (int i = 0; i < length; i++)
            {
            if (a[offsetA + i] != b[offsetB + i]) return false;
            }
        return true;
        }

    /**
     * Count the number of differing bits between two byte array regions (Hamming distance).
     *
     * @return number of bit positions that differ
     */
    public static int arrayBitDifferenceCounting(byte[] a, int offsetA, byte[] b, int offsetB, int length)
        {
        int bitDiffs = 0;
        for (int i = 0; i < length; i++)
            {
            int xor = (a[offsetA + i] & 0xFF) ^ (b[offsetB + i] & 0xFF);
            bitDiffs += Integer.bitCount(xor);
            }
        return bitDiffs;
        }
}
