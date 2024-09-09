class mux {

    static int ina;
    static int inb;
    static int sel;
    static int nsel;
    static int and1out;
    static int and2out;
    static int result;

    static int out(){

        notgate notgate1 = new notgate();
        notgate1.ina = sel;
        nsel = notgate1.out();

        andgate andgate1 = new andgate();
        andgate1.ina = ina;
        andgate1.inb = nsel;
        and1out = andgate1.out();

        andgate andgate2 = new andgate();
        andgate2.ina = inb;
        andgate2.inb = sel;
        and2out = andgate2.out();

        orgate orgate1 = new orgate();
        orgate1.ina = and1out;
        orgate1.inb = and2out;
        result = orgate1.out();

        return result;

    }
}