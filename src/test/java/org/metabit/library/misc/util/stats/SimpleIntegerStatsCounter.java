package org.metabit.library.misc.util.stats;

/**
 * Stub replacement for the private metabit utility library.
 * Tracks min/max/mean of a stream of integer values.
 */
public class SimpleIntegerStatsCounter
{
    private long   sum   = 0;
    private int    count = 0;
    private int    min   = Integer.MAX_VALUE;
    private int    max   = Integer.MIN_VALUE;

    public SimpleIntegerStatsCounter(int initialValue)
        {
        put(initialValue);
        }

    public void put(int value)
        {
        sum += value;
        count++;
        if (value < min) min = value;
        if (value > max) max = value;
        }

    public long getNumberOfValuesCounted() { return count; }
    public int  getAllTimeMinimum()         { return count == 0 ? 0 : min; }
    public int  getAllTimeMaximum()         { return count == 0 ? 0 : max; }
    public long getArithmeticMean()        { return count == 0 ? 0 : sum / count; }
    public double getArithmeticMeanAsDouble() { return count == 0 ? 0.0 : (double) sum / count; }
}
