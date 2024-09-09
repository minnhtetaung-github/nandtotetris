class andgate {

    static int ina;
    static int inb;
    static int nandout;
    static int result;

    static int out(){

        nandgate nandgate1 = new nandgate();
        nandgate1.ina = ina;
        nandgate1.inb = inb;
        nandout = nandgate1.out();

        notgate notgate1 = new notgate();
        notgate1.ina = nandout;
        result = notgate1.out();

        return result;

    }
}