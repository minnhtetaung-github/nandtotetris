class dmux{

    static int ina;
    static int sel;
    static int nsel;
    static int result1;
    static int result2;

    static void out(){

        notgate notgate1 = new notgate();
        notgate1.ina = sel;
        nsel = notgate1.out();

        andgate andgate1 = new andgate();
        andgate1.ina = ina;
        andgate1.inb = nsel;
        result1 = andgate1.out();

        andgate andgate2 = new andgate();
        andgate2.ina = ina;
        andgate2.inb = sel;
        result2 = andgate2.out();

        
        
    }
}