class andgate {

    int ina;
    int inb;
    int nandout;
    int result;

    void out(){

        nandgate nandgate1 = new nandgate();
        nandgate1.ina = ina;
        nandgate1.inb = inb;
        nandgate1.out();
        nandout = nandgate1.result;

        notgate notgate1 = new notgate();
        notgate1.ina = nandout;
        notgate1.out();
        result = notgate1.result;

    }
}

