class or8{

    static int ina8[] = new int[8];
    static int result;

    static int or1out;
    static int or2out;
    static int or3out;
    static int or4out;
    static int or5out;
    static int or6out;

    static void out(){

        orgate orgate1 = new orgate();
        orgate1.ina = ina8[0];
        orgate1.inb = ina8[1];
        or1out = orgate1.out();

        orgate orgate2 = new orgate();
        orgate2.ina = ina8[2];
        orgate2.inb = ina8[3];
        or2out = orgate2.out();

        orgate orgate3 = new orgate();
        orgate3.ina = ina8[4];
        orgate3.inb = ina8[5];
        or3out = orgate3.out();

        orgate orgate4 = new orgate();
        orgate4.ina = ina8[6];
        orgate4.inb = ina8[7];
        or4out = orgate4.out();

        orgate orgate5 = new orgate();
        orgate5.ina = or1out;
        orgate5.inb = or2out;
        or5out = orgate5.out();

        orgate orgate6 = new orgate();
        orgate6.ina = or3out;
        orgate6.inb = or4out;
        or6out = orgate6.out();

        orgate orgate7 = new orgate();
        orgate7.ina = or5out;
        orgate7.inb = or6out;
        result = orgate7.out();


    }
}