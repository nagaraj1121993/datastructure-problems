package recursions;

public class RopeCutting {

    public static void main(String[] args) {
        RopeCutting ropeCutting = new RopeCutting();
        System.out.println(ropeCutting.numberOfCutPiecesOfRope(5, 2, 1, 5));
    }

    public Integer numberOfCutPiecesOfRope(int rope, int size1, int size2, int size3){
        if(rope < 0) {
            return -1;
        }
        if(rope == 0){
            return 0;
        }
        int maxPiece1 = Math.max(numberOfCutPiecesOfRope(rope - size1, size1, size2, size3),
                numberOfCutPiecesOfRope(rope - size2, size1, size2, size3));
        int maxPiece = Math.max(maxPiece1,
                numberOfCutPiecesOfRope(rope - size3, size1, size2, size3));
        if(maxPiece == -1){
            return -1;
        }
        return maxPiece + 1;
    }

}
