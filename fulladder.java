class fulladder {

    static int ina;
    static int inb;
    static int inc;

    static int sum;
    static int carry;

    static int sum1;

    static int carry1;
    static int carry2;

    static void out(){

        halfadder halfadder1 = new halfadder();
        halfadder1.ina = ina;
        halfadder1.inb = inb;
        halfadder1.out();
        sum1 = halfadder1.sum;
        carry1 = halfadder1.carry;

        halfadder halfadder2 = new halfadder();
        halfadder2.ina = inc;
        halfadder2.inb = sum1;
        halfadder2.out();
        sum = halfadder2.sum;
        carry2 = halfadder2.carry;

        orgate orgate1 = new orgate();
        orgate1.ina = carry1;
        orgate1.inb = carry2;
        carry = orgate1.out();





    }
}
