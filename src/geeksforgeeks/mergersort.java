package geeksforgeeks;

/**
 * Created by jaydatta on 9/8/16.
 */
public class mergersort {

    int[] array;
    int[] temporaryarray;
    int length;


    public void sort(int[] arr){

        this.array=arr;
        this.length=arr.length;
        this.temporaryarray=new int[length];
        merge(0,length-1);

    }


    public void merge(int lowerindex,int higherindex){

        int ramu=0;

        if(lowerindex < higherindex){

            int middle=lowerindex+(higherindex-lowerindex)/2;

            System.out.println("Now merging from :"+lowerindex+" to :"+middle);
            merge(lowerindex, middle);
            System.out.println("Now merging from :"+(middle+1)+" to :"+higherindex);
            merge(middle+1,higherindex);

            System.out.println("Final merging from:"+lowerindex+" via:"+middle+" to :"+higherindex+"\n");
            finalmerge(lowerindex,middle,higherindex);
            ramu++;
            System.out.println("total inversions"+(ramu));
        }


    }

    public void finalmerge(int lowerindex, int middleindex, int higherindex) {
        // TODO Auto-generated method stub

        for(int i=lowerindex; i <=higherindex;i++){

            temporaryarray[i]=array[i];



            //	System.out.println(temporaryarray[i]);
        }




        int lower=lowerindex;
        int higher=middleindex+1;
        int base=lowerindex;

        while(lower <= middleindex && higher <=higherindex){

            if(temporaryarray[lower]<= temporaryarray[higher]){
                // array on which final operation to be done is array
                array[base]=temporaryarray[lower];
                lower++;
            }
            else{
                array[base]=temporaryarray[higher];
                higher++;
            }
            base++;
        }

// not understood this part
        while(lower <=middleindex){

            array[base]=temporaryarray[lower];
            base++;
            lower++;

        }

        for(int l=0; l < array.length;l++){
            System.out.println(array[l]);
        }


    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub


        int[] arr={1, 20, 6, 4, 5};

        mergersort sf=new mergersort();
        sf.sort(arr);


        System.out.println("Final Merged sorted list");
        for(int i: arr){
            System.out.println(i+" ");
        }

//		System.out.println("total inversions"+(ramu-1));
    }

}