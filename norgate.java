class norgate{

    static int ina;
    static int inb;
    static int orout;
    static int result;

    static int out(){

        orgate orgate1 = new orgate();
        orgate1.ina = ina;
        orgate1.inb = inb;
        orout = orgate1.out();

        notgate notgate1 = new notgate();
        notgate1.ina = orout;
        result = notgate1.out();

        return result;

    }
}