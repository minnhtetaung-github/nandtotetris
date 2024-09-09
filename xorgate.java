class xorgate{

    static int ina;
    static int inb;
    static int and1out;
    static int or1out;
    static int or2out;
    static int not1out;
    static int result;

    static int out(){

        andgate andgate1 = new andgate();
        andgate1.ina = ina;
        andgate1.inb = inb;
        and1out = andgate1.out();

        orgate orgate1 = new orgate();
        orgate1.ina = ina;
        orgate1.inb = inb;
        or1out = orgate1.out();

        notgate notgate1 = new notgate();
        notgate1.ina = or1out;
        not1out = notgate1.out();

        orgate orgate2 = new orgate();
        orgate2.ina = and1out;
        orgate2.inb = not1out;
        or2out = orgate2.out();

        notgate notgate2 = new notgate();
        notgate2.ina = or2out;
        result = notgate2.out();

        return result;
        

    }
}