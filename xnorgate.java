class xnorgate{

    static int ina;
    static int inb;
    static int xorout;
    static int result;

    static int out(){

        xorgate xorgate1 = new xorgate();
        xorgate1.ina = ina;
        xorgate1.inb = inb;
        xorout = xorgate.out();

        notgate notgate1 = new notgate();
        notgate1.ina = xorout;
        result = notgate1.out();

        return result;
    }
}