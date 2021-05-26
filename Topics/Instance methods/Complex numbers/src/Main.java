class Complex {

    double real;
    double image;

    // write methods here
    void  add(Complex num){
        this.real += num.real;
        this.image += num.image;
    }


    void  subtract(Complex num){
        this.real -= num.real;;
        this.image -= num.image;
    }

}