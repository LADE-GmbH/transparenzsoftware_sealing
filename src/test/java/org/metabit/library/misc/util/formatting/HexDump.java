package org.metabit.library.misc.util.formatting;

/**
 * Stub replacement for the private metabit utility library.
 * Delegates to the existing HexDump in org.metabit.support.format.
 */
public class HexDump
{
    public static String bytesToHexString(byte[] raw, String separator, int entriesPerLine)
        {
        return org.metabit.support.format.HexDump.bytesToHexString(raw, separator, entriesPerLine);
        }
}
