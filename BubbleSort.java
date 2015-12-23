/*======================================
  class BubbleSort -- implements bubblesort algorithm (vanilla version)
  ======================================*/

/*
Ziyan Lin
APCS1 pd9
HW51 -- Dat Bubbly Tho
2015 12 21 
*/

import java.util.ArrayList;

public class BubbleSort {

    //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ) 
    {
	ArrayList<Integer> retAL = new ArrayList<Integer>();
	while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
	}
	return retAL;
    }


    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) 
    {
	int randomIndex;
	//setup for traversal fr right to left
        for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
            randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
            al.set( i, al.set( randomIndex, al.get(i) ) );
        }
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    
    
    // VOID version of bubbleSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void bubbleSortV( ArrayList<Comparable> data ) {
        for(int a = 0; a < data.size(); a++){
	    for (int b = data.size() - 1; b - 1 >= 0; b--) {
		if((data.get(b)).compareTo(data.get(b-1)) < 0){
                    Comparable c = data.get(b);
                    data.set(b,data.get(b-1));
                    data.set(b-1,c);
                }
            }
	}   
    }//end bubbleSortV -- O(X^X) 


    // ArrayList-returning bubbleSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input ){
         ArrayList<Comparable> bob = new ArrayList<Comparable>(input);
         bubbleSortV(bob);
         return bob;  
    }//end bubbleSort -- O(1)


    public static void main(String [] args){

	
        /*===============for VOID methods=============
	ArrayList glen = new ArrayList<Integer>();
	glen.add(7);
	glen.add(1);
	glen.add(5);
	glen.add(12);
	glen.add(3);
	System.out.println( "ArrayList glen before sorting:\n" + glen );
	bubbleSortV(glen);
	System.out.println( "ArrayList glen after sorting:\n" + glen );

	ArrayList coco = populate( 10, 1, 1000 );
	System.out.println( "ArrayList coco before sorting:\n" + coco );
	bubbleSortV(coco);
	System.out.println( "ArrayList coco after sorting:\n" + coco );
	  ============================================*/

	
    	ArrayList glen = new ArrayList<Integer>();
	glen.add(7);
	glen.add(1);
	glen.add(5);
	glen.add(12);
	glen.add(3);
	System.out.println( "ArrayList glen before sorting:\n" + glen );
	ArrayList glenSorted = bubbleSort( glen );
	System.out.println( "sorted version of ArrayList glen:\n" 
			    + glenSorted );
	System.out.println( "ArrayList glen after sorting:\n" + glen );

      	ArrayList coco = populate( 10, 1, 1000 );
	System.out.println( "ArrayList coco before sorting:\n" + coco );
	ArrayList cocoSorted = bubbleSort( coco );
	System.out.println( "sorted version of ArrayList coco:\n" 
			    + cocoSorted );
	System.out.println( "ArrayList coco after sorting:\n" + coco );
	System.out.println( coco );
        /*==========for AL-returning methods==========
	  ============================================*/

    }//end main

}//end class BubbleSort
