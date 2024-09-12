class or8 {

    int ina8[] = new int[8];
    int result;

    int or1out;
    int or2out;
    int or3out;
    int or4out;
    int or5out;
    int or6out;

    void out(){

        orgate orgate1 = new orgate();
        orgate1.ina = ina8[0];
        orgate1.inb = ina8[1];
        orgate1.out();
        or1out = orgate1.result;

        orgate orgate2 = new orgate();
        orgate2.ina = ina8[2];
        orgate2.inb = ina8[3];
        orgate2.out();
        or2out = orgate2.result;

        orgate orgate3 = new orgate();
        orgate3.ina = ina8[4];
        orgate3.inb = ina8[5];
        orgate3.out();
        or3out = orgate3.result;

        orgate orgate4 = new orgate();
        orgate4.ina = ina8[6];
        orgate4.inb = ina8[7];
        orgate4.out();
        or4out = orgate4.result;

        orgate orgate5 = new orgate();
        orgate5.ina = or1out;
        orgate5.inb = or2out;
        orgate5.out();
        or5out = orgate5.result;

        orgate orgate6 = new orgate();
        orgate6.ina = or3out;
        orgate6.inb = or4out;
        orgate6.out();
        or6out = orgate6.result;

        orgate orgate7 = new orgate();
        orgate7.ina = or5out;
        orgate7.inb = or6out;
        orgate7.out();
        result = orgate7.result;
    }
}
