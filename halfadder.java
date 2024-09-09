public class halfadder {

    static int ina;
    static int inb;

    static int sum;
    static int carry;

    static void out(){

        xorgate xorgate1 = new xorgate();
        xorgate1.ina = ina;
        xorgate1.inb = inb;
        sum = xorgate1.out();

        andgate andgate1 = new andgate();
        andgate1.ina = ina;
        andgate1.inb = inb;
        carry = andgate1.out();


    }

}
