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

        boolean lIsReady = false;
        int lScale = zSearchArray.length / zThreads;
        System.out.println("Scale: "+lScale);

        for(int i = 0; i < zThreads; i++)
        {
            lLinearSearcherArray[i] = new LinearSearcher(zSearchArray, pSearchElement, i*lScale, ((i+1)*lScale) < zSearchArray.length ? (i+1)*lScale : zSearchArray.length);
            //lLinearSearcherArray[i] = new LinearSearcher(zSearchArray, pSearchElement, i*lScale, zSearchArray.length);
            lThreadArray[i] = new Thread(lLinearSearcherArray[i]);
            lThreadArray[i].start();
        }

        while(!lIsReady)
        {
            if(this.threadsReady(lLinearSearcherArray))
            {
                lIsReady = true;
            }
        }

        //return -2;
        return lLinearSearcherArray[0].getIndex();
    }

    private boolean threadsReady(LinearSearcher[] pSearcher)
    {
        for(int j = 0; j < pSearcher.length; j++)
        {
            if(!pSearcher[j].isReady())
            {
                return false;
            }
        }

        return true;
    }
}
