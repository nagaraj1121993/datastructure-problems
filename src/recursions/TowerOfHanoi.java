package recursions;

public class TowerOfHanoi {

    public static void main(String[] args) {
        TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
        towerOfHanoi.towerOfHanoi(3, 'A', 'B', 'C');
    }

    public void towerOfHanoi(int number, char A, char B, char C){
        if(number == 1){
            System.out.println("Move Disk "+number+" from "+A+" to "+C);
            return;
        }
        if(number <= 0){
            return;
        }
        towerOfHanoi(number-1, A, C, B);
        System.out.println("Move Disk "+number+" from "+A+" to "+C);
        towerOfHanoi(number-1, B, C, A);
    }

}
