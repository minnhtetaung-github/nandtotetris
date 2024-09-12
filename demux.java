class demux {

    int ina;
    int sel;
    int nsel;
    int result1;
    int result2;

    void out(){

        notgate notgate1 = new notgate();
        notgate1.ina = sel;
        notgate1.out();
        nsel = notgate1.result;

        andgate andgate1 = new andgate();
        andgate1.ina = ina;
        andgate1.inb = nsel;
        andgate1.out();
        result1 = andgate1.result;

        andgate andgate2 = new andgate();
        andgate2.ina = ina;
        andgate2.inb = sel;
        andgate2.out();
        result2 = andgate2.result;
        
    }
}
