class orgate{

    static int ina;
    static int inb;
    static int not1out;
    static int not2out;
    static int result;

    static int out(){

        notgate notgate1 = new notgate();
        notgate1.ina = ina;
        not1out = notgate1.out();

        notgate notgate2 = new notgate();
        notgate2.ina = inb;
        not2out = notgate2.out();

        nandgate nandgate1 = new nandgate();
        nandgate1.ina = not1out;
        nandgate1.inb = not2out;
        result = nandgate1.out();

        return result;
    }
}