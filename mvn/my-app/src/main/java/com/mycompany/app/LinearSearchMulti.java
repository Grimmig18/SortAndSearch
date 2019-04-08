package com.mycompany.app;

public class LinearSearchMulti
{
    int[] zSearchArray;
    int zThreads = 1;

    public LinearSearchMulti(int[] pSearchArray)
    {
        zSearchArray = pSearchArray;
    }

    public LinearSearchMulti(int[] pSearchArray, int pThreads)
    {
        zSearchArray = pSearchArray;
        zThreads = pThreads;
    }

    public int search(int pSearchElement)
    {
        Thread[] lThreadArray = new Thread[zThreads];
        LinearSearcher[] lLinearSearcherArray = new LinearSearcher[zThreads];

        int lScale = lThreadArray.length / zThreads;

        for(int i = 0; i < zThreads; i++)
        {
            lLinearSearcherArray[i] = new LinearSearcher(zSearchArray, pSearchElement, i*lScale,((i+1)*lScale) <= zSearchArray.length ? (i+1)*lScale : zSearchArray.length);
            lThreadArray[i] = new Thread(lLinearSearcherArray[i]);
            lThreadArray[i].start();
        }

        return lLinearSearcherArray[0].getIndex();
    }
}
