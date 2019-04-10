package com.mycompany.app;

import java.util.concurrent.atomic.AtomicInteger;

public class LinearSearcher implements Runnable
{
    private int[] zSearchArray;
    AtomicInteger zIndex = new AtomicInteger(-1);
    private int zStart;
    private int zEnd;
    private int zSearchElement;
    private boolean zIsReady;

    public LinearSearcher(int[] pSearchArray, int pSearchElement, int pStart, int pEnd)
    {
        zSearchArray = pSearchArray;
        zSearchElement = pSearchElement;
        zStart = pStart;
        zEnd = pEnd;
        zIsReady = false;

        System.out.println("Element: " + zSearchElement + "; Start:" + zStart + "; End:" + zEnd + "; Index: " + zIndex);
    }

    @Override
    public void run()
    {
        for(int i = zStart; i < zEnd; i++)
        {
            if(zSearchArray[i] == zSearchElement)
            {
                //System.out.println("Jup was gefunden");
                zIndex.getAndSet(i);
            }

            //System.out.println("Nope nix; Index: " + zIndex.get());
        }

        zIsReady = true;
    }

    public int getIndex()
    {
        return zIndex.get();
    }

    public boolean isReady() {
        return zIsReady;
    }
}
