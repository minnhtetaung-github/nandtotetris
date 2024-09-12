class mux {

    int ina;
    int inb;
    int sel;
    int nsel;
    int and1out;
    int and2out;
    int result;

    void out(){

        notgate notgate1 = new notgate();
        notgate1.ina = sel;
        notgate1.out();
        nsel = notgate1.result;

        andgate andgate1 = new andgate();
        andgate1.ina = ina;
        andgate1.inb = nsel;
        andgate1.out();
        and1out= andgate1.result;

        andgate andgate2 = new andgate();
        andgate2.ina = inb;
        andgate2.inb = sel;
        andgate2.out();
        and2out= andgate2.result;

        orgate orgate1 = new orgate();
        orgate1.ina = and1out;
        orgate1.inb = and2out;
        orgate1.out();
        result = orgate1.result;


    }
}
