class fulladder {

    int ina;
    int inb;
    int inc;

    int sum;
    int carry;

    int sum1;

    int carry1;
    int carry2;

    void out(){

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
        orgate1.out();
        carry = orgate1.result;
    }
}
