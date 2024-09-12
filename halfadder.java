class halfadder {

    int ina;
    int inb;

    int sum;
    int carry;

    void out(){

        xorgate xorgate1 = new xorgate();
        xorgate1.ina = ina;
        xorgate1.inb = inb;
        xorgate1.out();
        sum = xorgate1.result;

        andgate andgate1 = new andgate();
        andgate1.ina = ina;
        andgate1.inb = inb;
        andgate1.out();
        carry = andgate1.result;
    }
}
