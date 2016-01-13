public class CosineSimilarity {
    /**
     * @param A: An integer array.
     * @param B: An integer array.
     * @return: Cosine similarity.
     */
    public double cosineSimilarityss(int[] A, int[] B) {
        // write your code here
        
        if(A.length != B.length){
        	return 2;
        }
        double sumA =0;
        double sumB =0;

        for(int i=0;i<A.length;i++){
        	sumA +=Math.abs(A[i]);
        	sumB +=Math.abs(B[i]);
        }
        if(sumA == 0||sumB==0){
        	return 2;
        }

      
      
        double ava = 0; //absoluteValueA
        double avb = 0;  //absoluteValueB
        double molecule = 0;
        double denominator = 0; 
        for(int i=0;i<A.length;i++){
            molecule += A[i]*B[i];
            ava += Math.pow(A[i],2);
            avb += Math.pow(B[i],2);
        }
        denominator = Math.sqrt(ava) * Math.sqrt(avb);
        return molecule/denominator; 
    }
}
