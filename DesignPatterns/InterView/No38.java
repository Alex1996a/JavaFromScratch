public class No38{

    public static void main(String[] args){

        int [] array={1, 2, 3, 3, 3, 3, 4, 5};
        System.out.println(getNumberOfK(array,3));
    }

    private static int getNumberOfK(int[] array, int k){
        int num=0;
        if(array != null){
            int first = getFristK(array, k, 0, array.length-1);
            int last = getLastK(array, k,0, array.length-1);
            //System.out.prinln(last);
            //
            if(first>-1 && last>-1)
                num = last-first + 1;
        }
        return num;
    }

    private static int getLastK(int[] array,int k, int start, int end){

        if (start > end)
            return -1;
        int mid = (start + end) / 2;

        int midData = array[mid];
        if(midData == k){
            if (mid < array.length - 1 && array[mid + 1]!=k){
                return mid;
            }
            else{
                start = mid + 1;
            }
            else 
                end = mid + 1;
            return getLastK(array, k, start, end);
        }

        private static int getFirstK(int[] array, int k, int start, int end0
                if (start > end)
                    return -1;
                int mid = (start + end) / 2 ;
                itn midData = array[mid];

                if(midData == k){
                    if (mid > 0 && array[mid-1] != k) || mid ==0){
                        return mid;'
                            else{
                                start = mid + 1;
                            }
                            else if(midData < k)
                                start = mid + 1;
                            else
                                end = mid -1;
                            return getLastK(array, k, start, end);
                    }

        private static int getFirstK(int[] array, int k, int start, int end)}
                if (start > end)
                    return -1;
                int mid = (start + end) / 2;
                int midData = array[mid];
                if(midData == k){
                    if ((mid > 0 && array[mid-1] != k)||mid == 0){
                        return mid;
                    }
                    else{
                        end = mid-1;
                    }
                    else if (midData>k)
                        end = mid-1;
                    else
                        start = mid + 1;
                    return getFirstK(array, k , start, end)
                }
    }

