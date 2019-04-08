package com.mycompany.app;

import java.util.concurrent.atomic.AtomicInteger;

public class LinearSearcher implements Runnable
{
    private int[] zSearchArray;
    AtomicInteger zIndex = new AtomicInteger(-1);
    private int zStart;
    private int zEnd;
    private int zSearchElement;

    public LinearSearcher(int[] pSearchArray, int pSearchElement, int pStart, int pEnd)
    {
        zSearchArray = pSearchArray;
        zSearchElement = pSearchElement;
        zStart = pStart;
        zEnd = pEnd;
    }

    @Override
    public void run()
    {
        for(int i = zStart; i < zEnd; i++)
        {
            if(zSearchArray[i] == zSearchElement)
            {
                zIndex.set(i);
            }
        }
    }

    public int getIndex()
    {
        return zIndex.get();
    }
}
