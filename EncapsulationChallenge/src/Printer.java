public class Printer {

    private int tonerLevel = 100;
    private int printedPages;
    private boolean isDuplex;

    public Printer(int tonerLevel, int printedPages, boolean isDuplex) {
        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.isDuplex = isDuplex;
        this.printedPages = 0;
    }

    private void addToner(int toner){
        if (this.tonerLevel + toner > 100){
            System.out.println("Unable to add toner as it would overflow");
        } else this.tonerLevel += toner;
    }

    private void printJob(int pagesToPrint){
        int totalPagesPrinted = pagesToPrint;
        if (this.isDuplex){
            totalPagesPrinted = (pagesToPrint/2)+(pagesToPrint%2);
        }
        this.printedPages += totalPagesPrinted;
    }




}

/*
 Create a class and demonstate proper encapsulation techniques
 the class will be called Printer
 It will simulate a real Computer Printer
 It should have fields for the toner Level, number of pages printed, and
 also whether its a duplex printer (capable of printing on both sides of the paper).
 Add methods to fill up the toner (up to a maximum of 100%), another method to
 simulate printing a page (which should increase the number of pages printed).
 Decide on the scope, whether to use constructors, and anything else you think is needed.
*/
