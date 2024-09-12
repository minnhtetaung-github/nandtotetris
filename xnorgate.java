class xnorgate {

    int ina;
    int inb;
    int xorout;
    int result;

    void out(){

        xorgate xorgate1 = new xorgate();
        xorgate1.ina = ina;
        xorgate1.inb = inb;
        xorgate1.out();
        xorout = xorgate1.result;

        notgate notgate1 = new notgate();
        notgate1.ina = ina;
        notgate1.out();
        result = notgate1.result;

    }
}
