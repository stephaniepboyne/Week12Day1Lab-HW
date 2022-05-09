public class Printer {

    private int numberOfSheetsOfPaperLeft;
    private int toner;

    public Printer(int numberOfSheetsOfPaperLeft, int toner) {
        this.numberOfSheetsOfPaperLeft = numberOfSheetsOfPaperLeft;
        this.toner = toner;
    }

    public int getNumberOfSheetsOfPaperLeft() {
        return numberOfSheetsOfPaperLeft;
    }

    public int getToner() {
        return toner;
    }

    public void print(int pages, int copies) {
        int total = pages * copies;
        if (numberOfSheetsOfPaperLeft >= total){
            numberOfSheetsOfPaperLeft -= total;
            toner -= total;
        }
    }




}
