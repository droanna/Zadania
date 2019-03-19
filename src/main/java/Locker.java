
class Locker {


    private int number;
    private boolean isOpen = true;


    boolean isOpen() {
        return this.isOpen;
    }

    int getNumber() {
        return number;
    }

    void setNumber(int number) {
        this.number = number;
    }

    void setOpen() {
        this.isOpen = !this.isOpen;
    }

}
