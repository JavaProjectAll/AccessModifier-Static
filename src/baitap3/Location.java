package baitap3;

public class Location {
    private int row;
    private int collum;
    private double maxValue;

    public Location(int row, int collum, double maxValue) {
        this.row = row;
        this.collum = collum;
        this.maxValue = maxValue;
    }

    public Location() {

    }

    public void locateLargest(double[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a[i].length; j++) {
                if (maxValue <= a[i][j]){
                    maxValue = a[i][j];
                    this.row = i;
                    this.collum = j;
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng 2 chiều là "+maxValue
                + " tại vị trí Hàng "+(this.row+1)+" Cột "+(this.collum+1));
    }
}
